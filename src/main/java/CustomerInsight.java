

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerInsight {

	public CustomerInsight () {
	}

	public CustomerInsight (
		String insightDescription, 
		String insightType, 
		String insightValue, 
		String customerId, 
		java.time.OffsetDateTime timestamp) {
		this.insightDescription = insightDescription;
		this.insightType = insightType;
		this.insightValue = insightValue;
		this.customerId = customerId;
		this.timestamp = timestamp;
	}

	@JsonProperty("insight_description")
	private String insightDescription;
	@JsonProperty("insight_type")
	private String insightType;
	@JsonProperty("insight_value")
	private String insightValue;
	@JsonProperty("customer_id")
	private String customerId;
	private java.time.OffsetDateTime timestamp;
	public String getInsightDescription() {
		return insightDescription;
	}

	public CustomerInsight setInsightDescription(String insightDescription) {
		this.insightDescription = insightDescription;
		return this;
	}


	public String getInsightType() {
		return insightType;
	}

	public CustomerInsight setInsightType(String insightType) {
		this.insightType = insightType;
		return this;
	}


	public String getInsightValue() {
		return insightValue;
	}

	public CustomerInsight setInsightValue(String insightValue) {
		this.insightValue = insightValue;
		return this;
	}


	public String getCustomerId() {
		return customerId;
	}

	public CustomerInsight setCustomerId(String customerId) {
		this.customerId = customerId;
		return this;
	}


	public java.time.OffsetDateTime getTimestamp() {
		return timestamp;
	}

	public CustomerInsight setTimestamp(java.time.OffsetDateTime timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	public String toString() {
		return "CustomerInsight ["
		+ " insightDescription: " + insightDescription
		+ " insightType: " + insightType
		+ " insightValue: " + insightValue
		+ " customerId: " + customerId
		+ " timestamp: " + timestamp
		+ " ]";
	}
}
