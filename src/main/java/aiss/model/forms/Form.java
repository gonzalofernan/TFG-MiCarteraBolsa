
package aiss.model.forms;

import java.time.LocalDate;

public class Form {

	private String		owner;

	private String		filingType;

	private LocalDate	date;

	private String		companyName;

	private String		link;


	public String getFilingType() {
		return filingType;
	}

	public void setFilingType(final String filingType) {
		this.filingType = filingType;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(final LocalDate date) {
		this.date = date;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(final String companyName) {
		this.companyName = companyName;
	}

	public String getLink() {
		return link;
	}

	public void setLink(final String link) {
		this.link = link;
	}

	public int compareTo(final Form o) {
		return this.getDate().compareTo(o.getDate());
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
