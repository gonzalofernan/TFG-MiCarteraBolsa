
package aiss.model.tipranks;

import com.google.appengine.repackaged.com.google.gson.annotations.Expose;
import com.google.appengine.repackaged.com.google.gson.annotations.SerializedName;

public class Distribution {

	@SerializedName("buy")
	@Expose
	private Integer	buy;
	@SerializedName("hold")
	@Expose
	private Integer	hold;
	@SerializedName("sell")
	@Expose
	private Integer	sell;


	public Integer getBuy() {
		return buy;
	}

	public void setBuy(final Integer buy) {
		this.buy = buy;
	}

	public Distribution withBuy(final Integer buy) {
		this.buy = buy;
		return this;
	}

	public Integer getHold() {
		return hold;
	}

	public void setHold(final Integer hold) {
		this.hold = hold;
	}

	public Distribution withHold(final Integer hold) {
		this.hold = hold;
		return this;
	}

	public Integer getSell() {
		return sell;
	}

	public void setSell(final Integer sell) {
		this.sell = sell;
	}

	public Distribution withSell(final Integer sell) {
		this.sell = sell;
		return this;
	}

}
