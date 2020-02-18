
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
    "ticker",
    "changes",
    "price",
    "changesPercentage",
    "companyName"
})
public class Stock {

    @JsonProperty("ticker")
    private String ticker;
    @JsonProperty("changes")
    private Double changes;
    @JsonProperty("price")
    private String price;
    @JsonProperty("changesPercentage")
    private String changesPercentage;
    @JsonProperty("companyName")
    private String companyName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ticker")
    public String getTicker() {
        return ticker;
    }

    @JsonProperty("ticker")
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @JsonProperty("changes")
    public Double getChanges() {
        return changes;
    }

    @JsonProperty("changes")
    public void setChanges(Double changes) {
        this.changes = changes;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("changesPercentage")
    public String getChangesPercentage() {
        return changesPercentage;
    }

    @JsonProperty("changesPercentage")
    public void setChangesPercentage(String changesPercentage) {
        this.changesPercentage = changesPercentage;
    }

    @JsonProperty("companyName")
    public String getCompanyName() {
        return companyName;
    }

    @JsonProperty("companyName")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
