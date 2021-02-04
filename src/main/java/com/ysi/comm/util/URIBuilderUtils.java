package com.ysi.comm.util;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import java.net.URISyntaxException;
import java.util.List;

@PropertySource("classpath:openstack.properties")
public class URIBuilderUtils {
    @Value("${openstack.ip}")
    public String openstackIp;

//    @Value("${openstack.ip}")
//    public void setOpenstackIp(String openstackIp) {
//        this.openstackIp = openstackIp;
//    }

    public static URIBuilder createURIBuilder(String openstackIp, String servicePath, int port, List<NameValuePair> basicNameValuePairList) throws URISyntaxException {

        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setScheme("http")
                  .setHost(openstackIp)
                  .setPort(port)
                  .setPath(servicePath)
                  .build();
        //URIBuilder uriBuilder = new URIBuilder(openstackIp + restURL);

        if (basicNameValuePairList != null)
            uriBuilder.addParameters(basicNameValuePairList);

        return uriBuilder;
    }
}