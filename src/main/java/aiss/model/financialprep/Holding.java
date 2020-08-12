
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
    "date",
    "fillingDate",
    "acceptedDate",
    "cik",
    "cusip",
    "tickercusip",
    "nameOfIssuer",
    "shares",
    "titleOfClass",
    "value",
    "link",
    "finalLink"
})
public class Holding {

    @JsonProperty("date")
    private String date;
    @JsonProperty("fillingDate")
    private String fillingDate;
    @JsonProperty("acceptedDate")
    private String acceptedDate;
    @JsonProperty("cik")
    private String cik;
    @JsonProperty("cusip")
    private String cusip;
    @JsonProperty("tickercusip")
    private String tickercusip;
    @JsonProperty("nameOfIssuer")
    private String nameOfIssuer;
    @JsonProperty("shares")
    private Integer shares;
    @JsonProperty("titleOfClass")
    private String titleOfClass;
    @JsonProperty("value")
    private Integer value;
    @JsonProperty("link")
    private String link;
    @JsonProperty("finalLink")
    private String finalLink;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public Holding withDate(String date) {
        this.date = date;
        return this;
    }

    @JsonProperty("fillingDate")
    public String getFillingDate() {
        return fillingDate;
    }

    @JsonProperty("fillingDate")
    public void setFillingDate(String fillingDate) {
        this.fillingDate = fillingDate;
    }

    public Holding withFillingDate(String fillingDate) {
        this.fillingDate = fillingDate;
        return this;
    }

    @JsonProperty("acceptedDate")
    public String getAcceptedDate() {
        return acceptedDate;
    }

    @JsonProperty("acceptedDate")
    public void setAcceptedDate(String acceptedDate) {
        this.acceptedDate = acceptedDate;
    }

    public Holding withAcceptedDate(String acceptedDate) {
        this.acceptedDate = acceptedDate;
        return this;
    }

    @JsonProperty("cik")
    public String getCik() {
        return cik;
    }

    @JsonProperty("cik")
    public void setCik(String cik) {
        this.cik = cik;
    }

    public Holding withCik(String cik) {
        this.cik = cik;
        return this;
    }

    @JsonProperty("cusip")
    public String getCusip() {
        return cusip;
    }

    @JsonProperty("cusip")
    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public Holding withCusip(String cusip) {
        this.cusip = cusip;
        return this;
    }

    @JsonProperty("tickercusip")
    public String getTickercusip() {
        return tickercusip;
    }

    @JsonProperty("tickercusip")
    public void setTickercusip(String tickercusip) {
        this.tickercusip = tickercusip;
    }

    public Holding withTickercusip(String tickercusip) {
        this.tickercusip = tickercusip;
        return this;
    }

    @JsonProperty("nameOfIssuer")
    public String getNameOfIssuer() {
        return nameOfIssuer;
    }

    @JsonProperty("nameOfIssuer")
    public void setNameOfIssuer(String nameOfIssuer) {
        this.nameOfIssuer = nameOfIssuer;
    }

    public Holding withNameOfIssuer(String nameOfIssuer) {
        this.nameOfIssuer = nameOfIssuer;
        return this;
    }

    @JsonProperty("shares")
    public Integer getShares() {
        return shares;
    }

    @JsonProperty("shares")
    public void setShares(Integer shares) {
        this.shares = shares;
    }

    public Holding withShares(Integer shares) {
        this.shares = shares;
        return this;
    }

    @JsonProperty("titleOfClass")
    public String getTitleOfClass() {
        return titleOfClass;
    }

    @JsonProperty("titleOfClass")
    public void setTitleOfClass(String titleOfClass) {
        this.titleOfClass = titleOfClass;
    }

    public Holding withTitleOfClass(String titleOfClass) {
        this.titleOfClass = titleOfClass;
        return this;
    }

    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    public Holding withValue(Integer value) {
        this.value = value;
        return this;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    public Holding withLink(String link) {
        this.link = link;
        return this;
    }

    @JsonProperty("finalLink")
    public String getFinalLink() {
        return finalLink;
    }

    @JsonProperty("finalLink")
    public void setFinalLink(String finalLink) {
        this.finalLink = finalLink;
    }

    public Holding withFinalLink(String finalLink) {
        this.finalLink = finalLink;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Holding withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
