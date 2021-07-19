
package com.paypal.bfs.test.employeeserv.api.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * address  object
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "address_id",
    "line1",
    "line2",
    "city",
    "state",
    "country",
    "zip_code",
    "required"
})
public class Address {

    /**
     * address id unique
     * 
     */
    @JsonProperty("address_id")
    @JsonPropertyDescription("address id unique")
    private String addressId;
    /**
     * line1 in address
     * 
     */
    @JsonProperty("line1")
    @JsonPropertyDescription("line1 in address")
    private String line1;
    /**
     * line1 in address
     * 
     */
    @JsonProperty("line2")
    @JsonPropertyDescription("line1 in address")
    private String line2;
    /**
     * city
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("city")
    private String city;
    /**
     * state
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("state")
    private String state;
    /**
     * country
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("country")
    private String country;
    /**
     * zip_code
     * 
     */
    @JsonProperty("zip_code")
    @JsonPropertyDescription("zip_code")
    private String zipCode;
    @JsonProperty("required")
    private Object required;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * address id unique
     * 
     */
    @JsonProperty("address_id")
    public String getAddressId() {
        return addressId;
    }

    /**
     * address id unique
     * 
     */
    @JsonProperty("address_id")
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * line1 in address
     * 
     */
    @JsonProperty("line1")
    public String getLine1() {
        return line1;
    }

    /**
     * line1 in address
     * 
     */
    @JsonProperty("line1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    /**
     * line1 in address
     * 
     */
    @JsonProperty("line2")
    public String getLine2() {
        return line2;
    }

    /**
     * line1 in address
     * 
     */
    @JsonProperty("line2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    /**
     * city
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * city
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * state
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * state
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * country
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * country
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * zip_code
     * 
     */
    @JsonProperty("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * zip_code
     * 
     */
    @JsonProperty("zip_code")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @JsonProperty("required")
    public Object getRequired() {
        return required;
    }

    @JsonProperty("required")
    public void setRequired(Object required) {
        this.required = required;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("addressId");
        sb.append('=');
        sb.append(((this.addressId == null)?"<null>":this.addressId));
        sb.append(',');
        sb.append("line1");
        sb.append('=');
        sb.append(((this.line1 == null)?"<null>":this.line1));
        sb.append(',');
        sb.append("line2");
        sb.append('=');
        sb.append(((this.line2 == null)?"<null>":this.line2));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("zipCode");
        sb.append('=');
        sb.append(((this.zipCode == null)?"<null>":this.zipCode));
        sb.append(',');
        sb.append("required");
        sb.append('=');
        sb.append(((this.required == null)?"<null>":this.required));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
