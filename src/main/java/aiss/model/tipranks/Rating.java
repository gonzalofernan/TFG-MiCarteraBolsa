
package aiss.model.tipranks;

import com.google.appengine.repackaged.com.google.gson.annotations.Expose;
import com.google.appengine.repackaged.com.google.gson.annotations.SerializedName;

public class Rating {

	@SerializedName("priceTargetCurrency")
	@Expose
	private Object	priceTargetCurrency;
	@SerializedName("ticker")
	@Expose
	private String	ticker;
	@SerializedName("companyName")
	@Expose
	private String	companyName;
	@SerializedName("rating")
	@Expose
	private String	rating;
	@SerializedName("ratingEnum")
	@Expose
	private Integer	ratingEnum;
	@SerializedName("priceTarget")
	@Expose
	private Object	priceTarget;
	@SerializedName("date")
	@Expose
	private String	date;
	@SerializedName("operationId")
	@Expose
	private Integer	operationId;


	public Object getPriceTargetCurrency() {
		return priceTargetCurrency;
	}

	public void setPriceTargetCurrency(final Object priceTargetCurrency) {
		this.priceTargetCurrency = priceTargetCurrency;
	}

	public Rating withPriceTargetCurrency(final Object priceTargetCurrency) {
		this.priceTargetCurrency = priceTargetCurrency;
		return this;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	public Rating withTicker(final String ticker) {
		this.ticker = ticker;
		return this;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(final String companyName) {
		this.companyName = companyName;
	}

	public Rating withCompanyName(final String companyName) {
		this.companyName = companyName;
		return this;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(final String rating) {
		this.rating = rating;
	}

	public Rating withRating(final String rating) {
		this.rating = rating;
		return this;
	}

	public Integer getRatingEnum() {
		return ratingEnum;
	}

	public void setRatingEnum(final Integer ratingEnum) {
		this.ratingEnum = ratingEnum;
	}

	public Rating withRatingEnum(final Integer ratingEnum) {
		this.ratingEnum = ratingEnum;
		return this;
	}

	public Object getPriceTarget() {
		return priceTarget;
	}

	public void setPriceTarget(final Object priceTarget) {
		this.priceTarget = priceTarget;
	}

	public Rating withPriceTarget(final Object priceTarget) {
		this.priceTarget = priceTarget;
		return this;
	}

	public String getDate() {
		return date;
	}

	public void setDate(final String date) {
		this.date = date;
	}

	public Rating withDate(final String date) {
		this.date = date;
		return this;
	}

	public Integer getOperationId() {
		return operationId;
	}

	public void setOperationId(final Integer operationId) {
		this.operationId = operationId;
	}

	public Rating withOperationId(final Integer operationId) {
		this.operationId = operationId;
		return this;
	}

}
