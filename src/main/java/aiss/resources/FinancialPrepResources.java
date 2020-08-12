
package aiss.resources;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.restlet.resource.ClientResource;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.appengine.repackaged.com.google.gson.*;

import aiss.model.financialprep.Company;
import aiss.model.financialprep.Gainers;
import aiss.model.financialprep.Holding;
import aiss.model.financialprep.Losers;
import aiss.model.financialprep.Stock;

public class FinancialPrepResources {

	private static String	URL_GAINERS	= "https://financialmodelingprep.com/api/v3/stock/gainers?apikey=a8dc4b4410ed25107c28a0d76f2abe1e";
	private static String	URL_LOSERS	= "https://financialmodelingprep.com/api/v3/stock/losers?apikey=a8dc4b4410ed25107c28a0d76f2abe1e";
	private static String	URL_SEARCH	= "https://financialmodelingprep.com/api/v3/stock/losers?apikey=a8dc4b4410ed25107c28a0d76f2abe1e";


	public List<Stock> getMostGainers() {
		List<Stock> res;
		ClientResource cr = new ClientResource(FinancialPrepResources.URL_GAINERS);
		Gainers g = cr.get(Gainers.class);
		res = g.getMostGainerStock();
		return res;
	}

	public List<Stock> getMostLosers() {
		List<Stock> res;
		ClientResource cr = new ClientResource(FinancialPrepResources.URL_LOSERS);
		Losers l = cr.get(Losers.class);
		res = l.getMostLoserStock();
		return res;
	}

	public List<Company> getCompanies(final String name) throws JsonParseException, JsonMappingException, IOException {
		URL url = new URL("https://financialmodelingprep.com/api/v3/cik-search/" + name + "?apikey=a8dc4b4410ed25107c28a0d76f2abe1e");
		List<Company> res = new ArrayList<Company>();
		Company[] comp;

		HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
		InputStreamReader reader = new InputStreamReader(httpcon.getInputStream());
		Gson gson = new Gson();
		comp = gson.fromJson(reader, Company[].class);

		for (Company company : comp) {
			res.add(company);
		}

		return res;

	}
	public List<String> getHoldings(final String cik) throws JsonParseException, JsonMappingException, IOException {

		URL url = new URL("https://financialmodelingprep.com/api/v3/form-thirteen/" + cik + "?apikey=a8dc4b4410ed25107c28a0d76f2abe1e");
		List<String> res = new ArrayList<String>();
		Holding[] holdings;
		HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
		httpcon.setReadTimeout(10000);
		InputStreamReader reader = new InputStreamReader(httpcon.getInputStream());

		Gson gson = new Gson();
		holdings = gson.fromJson(reader, Holding[].class);

		for (Holding h : holdings) {
			res.add(h.getTickercusip());
		}
		return res;

	}

}
