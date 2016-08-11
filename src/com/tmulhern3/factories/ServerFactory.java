package com.tmulhern3.factories;

import com.tmulhern3.models.resources.Server;
import com.tmulhern3.models.resources.aws.AwsInstance;

/**
 * Created by Tim on 8/10/2016.
 */
public class ServerFactory {

    public static Server buildServer(String serverType, String id) {
        switch (serverType) {
            case "aws":
                return new AwsInstance(id);
            default:
                return null;
        }
    }
}
