
package aiss.resources;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.appengine.repackaged.com.google.gson.Gson;
import com.google.appengine.repackaged.com.google.gson.JsonParseException;

import aiss.model.financialprep.Company;
import aiss.model.tipranks.FundManager;

public class TipRanksResources {

	private static String URL_MANAGERS = "https://www.tipranks.com/api/experts/GetTop25Experts/?expertType=institutional&period=year&benchmark=naive&sector=general";


	private List<String> getTop25Cik() throws JsonParseException, JsonMappingException, IOException {
		URL url = new URL(TipRanksResources.URL_MANAGERS);
		List<String> res = new ArrayList<String>();
		FundManager[] array;

		HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
		InputStreamReader reader = new InputStreamReader(httpcon.getInputStream());
		Gson gson = new Gson();
		array = gson.fromJson(reader, FundManager[].class);

		for (FundManager fm : array) {

			String str = fm.getHedgeFundName();
			str = str.substring(0, str.lastIndexOf(""));
			String aux = str.replace(",", "").replace(" ", "%20");

			URL url2 = new URL("https://financialmodelingprep.com/api/v3/cik-search/" + aux + "?apikey=a8dc4b4410ed25107c28a0d76f2abe1e");
			Company[] comp;

			HttpURLConnection httpcon2 = (HttpURLConnection) url2.openConnection();
			InputStreamReader reader2 = new InputStreamReader(httpcon2.getInputStream());
			Gson gson2 = new Gson();
			comp = gson2.fromJson(reader2, Company[].class);
			if (comp.length == 0) {
				continue;
			}
			Company c = comp[0];
			res.add(c.getCik());
		}

		return res;

	}

	public Map<String, Integer> getHoldings() throws JsonParseException, JsonMappingException, IOException {
		FinancialPrepResources fp = new FinancialPrepResources();
		Map<String, Integer> res = new HashMap<String, Integer>();

		List<String> managers = getTop25Cik();
		for (int i = 0; i < managers.size(); i++) {
			List<String> aux = fp.getHoldings(managers.get(i));

			for (int j = 0; j < aux.size(); j++) {

				if (res.containsKey(aux.get(j))) {
					res.put(aux.get(j), 1 + res.get(aux.get(j)));
				} else {
					res.put(aux.get(j), 1);
				}
			}

		}

		return res;

	}

}
