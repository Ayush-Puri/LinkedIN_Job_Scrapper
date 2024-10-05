
package com.REST.API.DEMO.REST.API.DEMO.job;

import javax.annotation.processing.Generated;
import java.util.LinkedHashMap;
import java.util.Map;


@Generated("jsonschema2pojo")
public class Company {

    private String name;
    private String logo;
    private String url;
    private StaffCountRange staffCountRange;
    private Headquarter headquarter;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public StaffCountRange getStaffCountRange() {
        return staffCountRange;
    }

    public void setStaffCountRange(StaffCountRange staffCountRange) {
        this.staffCountRange = staffCountRange;
    }

    public Headquarter getHeadquarter() {
        return headquarter;
    }

    public void setHeadquarter(Headquarter headquarter) {
        this.headquarter = headquarter;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
