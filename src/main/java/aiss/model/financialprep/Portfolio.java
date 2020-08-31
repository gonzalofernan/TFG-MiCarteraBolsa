
package aiss.model.financialprep;

public class Portfolio implements Comparable<Portfolio> {

	private String	name;
	private Integer	number;


	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(final Integer number) {
		this.number = number;
	}

	@Override
	public int compareTo(final Portfolio o) {
		Portfolio e = o;
		return this.getNumber().compareTo(e.getNumber());
	}

}
