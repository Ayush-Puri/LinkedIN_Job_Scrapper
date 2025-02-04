
package com.REST.API.DEMO.REST.API.DEMO.job;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashMap;
import java.util.Map;


@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Datum {

    private String id;
    private String title;
    private String url;
    private String referenceId;
    private long posterId;
    private Company company;
    private String location;
    private String type;
    private String postAt;
    private String postDate;
    private String benefits;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
