package com.meng.retrofitdemo.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LocationBean {

@SerializedName("resultcode")
@Expose
private String resultcode;
@SerializedName("reason")
@Expose
private String reason;
@SerializedName("result")
@Expose
private Result result;
@SerializedName("error_code")
@Expose
private Integer errorCode;

public String getResultcode() {
return resultcode;
}

public void setResultcode(String resultcode) {
this.resultcode = resultcode;
}

public String getReason() {
return reason;
}

public void setReason(String reason) {
this.reason = reason;
}

public Result getResult() {
return result;
}

public void setResult(Result result) {
this.result = result;
}

public Integer getErrorCode() {
return errorCode;
}

public void setErrorCode(Integer errorCode) {
this.errorCode = errorCode;
}

}

