package com.meng.retrofitdemo.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

@SerializedName("province")
@Expose
private String province;
@SerializedName("city")
@Expose
private String city;
@SerializedName("areacode")
@Expose
private String areacode;
@SerializedName("zip")
@Expose
private String zip;
@SerializedName("company")
@Expose
private String company;
@SerializedName("card")
@Expose
private String card;

public String getProvince() {
return province;
}

public void setProvince(String province) {
this.province = province;
}

public String getCity() {
return city;
}

public void setCity(String city) {
this.city = city;
}

public String getAreacode() {
return areacode;
}

public void setAreacode(String areacode) {
this.areacode = areacode;
}

public String getZip() {
return zip;
}

public void setZip(String zip) {
this.zip = zip;
}

public String getCompany() {
return company;
}

public void setCompany(String company) {
this.company = company;
}

public String getCard() {
return card;
}

public void setCard(String card) {
this.card = card;
}

}
