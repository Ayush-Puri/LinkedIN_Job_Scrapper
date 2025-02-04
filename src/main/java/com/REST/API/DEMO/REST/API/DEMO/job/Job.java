
package com.REST.API.DEMO.REST.API.DEMO.job;

import javax.annotation.processing.Generated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Job {

    private boolean success;
    private String message;
    private List<Datum> data;
    private int total;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}
