package com.ysi.openstack.keystone.service;

import com.ysi.comm.rest.model.RestParamVO;
import com.ysi.comm.rest.service.impl.OpnstackRestApiService;
import com.ysi.comm.util.HeaderUtil;
import com.ysi.comm.util.URIBuilderUtils;
import com.ysi.openstack.comm.OpenstackService;
import com.ysi.openstack.keystone.model.auth.Auth;
import com.ysi.openstack.keystone.model.token.Token;
import com.ysi.openstack.keystone.url.KeystoneApiURL;
import com.ysi.openstack.project.Project;
import com.ysi.openstack.project.ProjectVO;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;

@Service
public class KeystoneService extends OpenstackService {
    @Autowired
    private OpnstackRestApiService opnstackRestApiService;

    public ResponseEntity<Token> getToken(String name, String password, String id) throws URISyntaxException {
        URIBuilder uriBuilder = URIBuilderUtils.createURIBuilder(openstackIp, KeystoneApiURL.AUTH_TOKENS.getUrl(), 5000, null);
        RestParamVO restParamVO = new RestParamVO(uriBuilder, HeaderUtil.getHeader(), new Auth(name, password, id), new ParameterizedTypeReference<Token>() {});

        ResponseEntity<Token> responseEntity = opnstackRestApiService.call(restParamVO, HttpMethod.POST);

        return responseEntity;
    }

    public ResponseEntity<Project> getProjects() throws URISyntaxException {
        URIBuilder uriBuilder = URIBuilderUtils.createURIBuilder(openstackIp, KeystoneApiURL.AUTH_PROJECTS.getUrl(), 5000, null);
        HttpHeaders headers = HeaderUtil.getHeader();

        ResponseEntity<Token> getTokenResponseEntity = this.getToken("ptlkim", "cone@234", "014d1be7dd9e475ea06f603300b864cb");
        String x_subject_token = getTokenResponseEntity.getHeaders().get("X-Subject-Token").stream().findFirst().get();
        headers.add("X-Auth-Token", x_subject_token);

        RestParamVO restParamVO = new RestParamVO(uriBuilder, headers, null, new ParameterizedTypeReference<Project>() {});

        ResponseEntity<Project> responseEntity = opnstackRestApiService.call(restParamVO, HttpMethod.GET);

        return responseEntity;
    }

}