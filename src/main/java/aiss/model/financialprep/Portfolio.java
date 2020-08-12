
package aiss.model.financialprep;

public class Portfolio implements Comparable {

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
	public int compareTo(final Object o) {
		Portfolio e = (Portfolio) o;
		return getNumber().compareTo(e.getNumber());
	}

}
