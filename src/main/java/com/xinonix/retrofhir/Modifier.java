package com.xinonix.retrofhir;

import com.google.gson.annotations.SerializedName;

public enum Modifier {
    TEXT,
    NOT,
    ABOVE,
    BELOW,
    IN,
    @SerializedName("not-in") NOT_IN,
    NONE
}
