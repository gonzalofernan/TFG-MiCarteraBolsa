
package aiss.resources;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import aiss.model.forms.Form;

public class SECResources {

	public List<Form> getWarrenBuffetLastBuys() {
		Document doc = null;
		Document doc2 = null;
		List<Form> list = new ArrayList<Form>();
		try {
			doc = Jsoup.connect("https://www.sec.gov/cgi-bin/browse-edgar?action=getcompany&CIK=0001067983&type=&dateb=&owner=only&count=40").get(); // URL shortened!
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		Elements links = doc.select("table.tableFile2").select("tbody").select("tr");

		for (Element link : links) {
			Form form = new Form();

			if (link.select("td:nth-of-type(5)").text().equals("")) {
				continue;
			} else {

				form.setOwner(doc.getElementsByClass("companyName").text().substring(0, doc.getElementsByClass("companyName").text().length() - 42));

				form.setDate(LocalDate.parse(link.select("td:nth-of-type(4)").text()));
				form.setFilingType(link.select("td:nth-of-type(1)").text());
				form.setLink("https://www.sec.gov" + link.select("td:nth-of-type(5)").select("a[href]").attr("href"));

				try {
					doc2 = Jsoup.connect(form.getLink()).get(); // URL shortened!
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
				form.setCompanyName(doc2.getElementsByClass("companyName").text());
				form.setLink("https://www.sec.gov" + link.select("td:nth-of-type(2)").select("a[href]").attr("href"));

				list.add(form);
			}

		}

		list.removeAll(Collections.singleton(null));
		list.removeAll(Collections.singleton(""));

		return list;
	}

	public List<Form> getBuysCIK(final String parameter) {

		Document doc = null;
		Document doc2 = null;
		List<Form> list = new ArrayList<Form>();
		try {
			doc = Jsoup.connect("https://www.sec.gov/cgi-bin/browse-edgar?action=getcompany&CIK=" + parameter + "&type=&dateb=&owner=only&count=40").get(); // URL shortened!
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		Elements links = doc.select("table.tableFile2").select("tbody").select("tr");

		for (Element link : links) {
			Form form = new Form();

			if (link.select("td:nth-of-type(5)").text().equals("")) {
				continue;
			} else {

				form.setOwner(doc.getElementsByClass("companyName").text().substring(0, doc.getElementsByClass("companyName").text().length() - 42));

				form.setDate(LocalDate.parse(link.select("td:nth-of-type(4)").text()));
				form.setFilingType(link.select("td:nth-of-type(1)").text());
				form.setLink("https://www.sec.gov" + link.select("td:nth-of-type(5)").select("a[href]").attr("href"));

				try {
					doc2 = Jsoup.connect(form.getLink()).get(); // URL shortened!
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
				form.setCompanyName(doc2.getElementsByClass("companyName").text());
				form.setLink("https://www.sec.gov" + link.select("td:nth-of-type(2)").select("a[href]").attr("href"));

				list.add(form);
			}

		}

		list.removeAll(Collections.singleton(null));
		list.removeAll(Collections.singleton(""));

		return list;
	}

}
