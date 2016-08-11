package com.tmulhern3.models;

/**
 * Created by Tim on 8/10/2016.
 */
public class Attribute {

    private String key;
    private String value;

    public Attribute(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t");
        sb.append(key);
        sb.append(" = \"");
        sb.append(value);
        sb.append("\"\n");

        return sb.toString();
    }
}
