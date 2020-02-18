
package aiss.resources;

import java.util.List;

import org.restlet.resource.ClientResource;

import aiss.model.financialprep.Gainers;
import aiss.model.financialprep.Losers;
import aiss.model.financialprep.Stock;

public class FinancialPrepResources {

	private static String	URL_GAINERS	= "https://financialmodelingprep.com/api/v3/stock/gainers";
	private static String	URL_LOSERS	= "https://financialmodelingprep.com/api/v3/stock/losers";


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

}
