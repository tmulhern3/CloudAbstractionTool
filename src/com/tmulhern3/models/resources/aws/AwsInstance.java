package com.tmulhern3.models.resources.aws;

import com.tmulhern3.models.Attribute;
import com.tmulhern3.models.resources.Server;
import com.tmulhern3.utils.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tim on 8/10/2016.
 */
public class AwsInstance extends Server {

    // TODO: query default AMI based on region
    private final String DEFAULT_AMI = "ami-6869aa05";
    private final String DEFAULT_INSTANCE_TYPE = "t2.micro";

    public AwsInstance(String id) {
        super(id);
        super.setImage(DEFAULT_AMI);
        super.setSize(DEFAULT_INSTANCE_TYPE);
    }

    @Override
    public String toString() {
        if (super.getImage().isPresent() && super.getSize().isPresent()) {
            List<Attribute> attributeList = new ArrayList();
            attributeList.add(new Attribute("ami", super.getImage().get()));
            attributeList.add(new Attribute("instance_type", super.getImage().get()));

            return Utils.addResource("aws_instance", super.getId(), attributeList);
        }

        return "";
    }
}
