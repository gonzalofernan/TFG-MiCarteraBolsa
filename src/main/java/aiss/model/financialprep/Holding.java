
package aiss.model.financialprep;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"date", "fillingDate", "acceptedDate", "cik", "cusip", "tickercusip", "nameOfIssuer", "shares", "titleOfClass", "value", "link", "finalLink"
})
public class Holding {

	@JsonProperty("date")
	private String				date;
	@JsonProperty("fillingDate")
	private String				fillingDate;
	@JsonProperty("acceptedDate")
	private String				acceptedDate;
	@JsonProperty("cik")
	private String				cik;
	@JsonProperty("cusip")
	private String				cusip;
	@JsonProperty("tickercusip")
	private String				tickercusip;
	@JsonProperty("nameOfIssuer")
	private String				nameOfIssuer;
	@JsonProperty("shares")
	private Long				shares;
	@JsonProperty("titleOfClass")
	private String				titleOfClass;
	@JsonProperty("value")
	private Long				value;
	@JsonProperty("link")
	private String				link;
	@JsonProperty("finalLink")
	private String				finalLink;
	@JsonIgnore
	private Map<String, Object>	additionalProperties	= new HashMap<String, Object>();


	@JsonProperty("date")
	public String getDate() {
		return date;
	}

	@JsonProperty("date")
	public void setDate(final String date) {
		this.date = date;
	}

	public Holding withDate(final String date) {
		this.date = date;
		return this;
	}

	@JsonProperty("fillingDate")
	public String getFillingDate() {
		return fillingDate;
	}

	@JsonProperty("fillingDate")
	public void setFillingDate(final String fillingDate) {
		this.fillingDate = fillingDate;
	}

	public Holding withFillingDate(final String fillingDate) {
		this.fillingDate = fillingDate;
		return this;
	}

	@JsonProperty("acceptedDate")
	public String getAcceptedDate() {
		return acceptedDate;
	}

	@JsonProperty("acceptedDate")
	public void setAcceptedDate(final String acceptedDate) {
		this.acceptedDate = acceptedDate;
	}

	public Holding withAcceptedDate(final String acceptedDate) {
		this.acceptedDate = acceptedDate;
		return this;
	}

	@JsonProperty("cik")
	public String getCik() {
		return cik;
	}

	@JsonProperty("cik")
	public void setCik(final String cik) {
		this.cik = cik;
	}

	public Holding withCik(final String cik) {
		this.cik = cik;
		return this;
	}

	@JsonProperty("cusip")
	public String getCusip() {
		return cusip;
	}

	@JsonProperty("cusip")
	public void setCusip(final String cusip) {
		this.cusip = cusip;
	}

	public Holding withCusip(final String cusip) {
		this.cusip = cusip;
		return this;
	}

	@JsonProperty("tickercusip")
	public String getTickercusip() {
		return tickercusip;
	}

	@JsonProperty("tickercusip")
	public void setTickercusip(final String tickercusip) {
		this.tickercusip = tickercusip;
	}

	public Holding withTickercusip(final String tickercusip) {
		this.tickercusip = tickercusip;
		return this;
	}

	@JsonProperty("nameOfIssuer")
	public String getNameOfIssuer() {
		return nameOfIssuer;
	}

	@JsonProperty("nameOfIssuer")
	public void setNameOfIssuer(final String nameOfIssuer) {
		this.nameOfIssuer = nameOfIssuer;
	}

	public Holding withNameOfIssuer(final String nameOfIssuer) {
		this.nameOfIssuer = nameOfIssuer;
		return this;
	}

	@JsonProperty("shares")
	public Long getShares() {
		return shares;
	}

	@JsonProperty("shares")
	public void setShares(final Long shares) {
		this.shares = shares;
	}

	public Holding withShares(final Long shares) {
		this.shares = shares;
		return this;
	}

	@JsonProperty("titleOfClass")
	public String getTitleOfClass() {
		return titleOfClass;
	}

	@JsonProperty("titleOfClass")
	public void setTitleOfClass(final String titleOfClass) {
		this.titleOfClass = titleOfClass;
	}

	public Holding withTitleOfClass(final String titleOfClass) {
		this.titleOfClass = titleOfClass;
		return this;
	}

	@JsonProperty("value")
	public Long getValue() {
		return value;
	}

	@JsonProperty("value")
	public void setValue(final Long value) {
		this.value = value;
	}

	public Holding withValue(final Long value) {
		this.value = value;
		return this;
	}

	@JsonProperty("link")
	public String getLink() {
		return link;
	}

	@JsonProperty("link")
	public void setLink(final String link) {
		this.link = link;
	}

	public Holding withLink(final String link) {
		this.link = link;
		return this;
	}

	@JsonProperty("finalLink")
	public String getFinalLink() {
		return finalLink;
	}

	@JsonProperty("finalLink")
	public void setFinalLink(final String finalLink) {
		this.finalLink = finalLink;
	}

	public Holding withFinalLink(final String finalLink) {
		this.finalLink = finalLink;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(final String name, final Object value) {
		this.additionalProperties.put(name, value);
	}

	public Holding withAdditionalProperty(final String name, final Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
