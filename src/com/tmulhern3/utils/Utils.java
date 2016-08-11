package com.tmulhern3.utils;

import com.tmulhern3.models.Attribute;

import java.util.List;

/**
 * Created by Tim on 8/10/2016.
 */
public class Utils {

    public static String addResource(String resourceType, String resourceId, List<Attribute> attributes) {
        StringBuilder sb = new StringBuilder();
        sb.append("resource \"");
        sb.append(resourceType);
        sb.append("\" \"");
        sb.append(resourceId);
        sb.append("\" {\n");

        for (Attribute attribute : attributes) {
            sb.append(attribute);
        }

        sb.append("}");

        return sb.toString();
    }
}
