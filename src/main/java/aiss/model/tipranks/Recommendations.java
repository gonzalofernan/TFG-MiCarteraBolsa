
package aiss.model.tipranks;

import com.google.appengine.repackaged.com.google.gson.annotations.Expose;
import com.google.appengine.repackaged.com.google.gson.annotations.SerializedName;

public class Recommendations {

	@SerializedName("total")
	@Expose
	private Object	total;
	@SerializedName("good")
	@Expose
	private Object	good;
	@SerializedName("ratio")
	@Expose
	private Object	ratio;


	public Object getTotal() {
		return total;
	}

	public void setTotal(final Object total) {
		this.total = total;
	}

	public Recommendations withTotal(final Object total) {
		this.total = total;
		return this;
	}

	public Object getGood() {
		return good;
	}

	public void setGood(final Object good) {
		this.good = good;
	}

	public Recommendations withGood(final Object good) {
		this.good = good;
		return this;
	}

	public Object getRatio() {
		return ratio;
	}

	public void setRatio(final Object ratio) {
		this.ratio = ratio;
	}

	public Recommendations withRatio(final Object ratio) {
		this.ratio = ratio;
		return this;
	}

}
