
package com.REST.API.DEMO.REST.API.DEMO.job;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"title",
"url",
"referenceId",
"posterId",
"company",
"location",
"type",
"postDate",
"benefits"
})
public class Datum {

@JsonProperty("id")
public String id;
@JsonProperty("title")
public String title;
@JsonProperty("url")
public String url;
@JsonProperty("referenceId")
public String referenceId;
@JsonProperty("posterId")
public String posterId;
@JsonProperty("company")
public Company company;
@JsonProperty("location")
public String location;
@JsonProperty("type")
public String type;
@JsonProperty("postDate")
public String postDate;
@JsonProperty("benefits")
public String benefits;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}