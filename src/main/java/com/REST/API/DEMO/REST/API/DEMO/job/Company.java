
package com.REST.API.DEMO.REST.API.DEMO.job;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashMap;
import java.util.Map;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Company {

    private String name;
    private String logo;
    private String url;
    private StaffCountRange staffCountRange;
    private Headquarter headquarter;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
