
package aiss.model.financialprep;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"mostGainerStock"
})
public class Gainers {

	@JsonProperty("mostGainerStock")
	private List<Stock>			mostGainerStock			= null;
	@JsonIgnore
	private Map<String, Object>	additionalProperties	= new HashMap<String, Object>();


	@JsonProperty("mostGainerStock")
	public List<Stock> getMostGainerStock() {
		return this.mostGainerStock;
	}

	@JsonProperty("mostGainerStock")
	public void setMostGainerStock(final List<Stock> mostGainerStock) {
		this.mostGainerStock = mostGainerStock;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(final String name, final Object value) {
		this.additionalProperties.put(name, value);
	}

}
