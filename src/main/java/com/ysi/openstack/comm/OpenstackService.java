package com.ysi.openstack.comm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:openstack.properties")
public class OpenstackService {
    @Value("${openstack.ip}")
    public String openstackIp ;
}