package com.ysi.comm.rest.service.impl;

import com.ysi.comm.rest.model.RestParamVO;
import com.ysi.comm.rest.service.RestApiService;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class OpnstackRestApiService implements RestApiService {
    private RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity call(RestParamVO restParamVO, HttpMethod method) {
        ResponseEntity responseEntity = null;

        try {
            //HttpEntity entity = restParamVO.getEntity();
            responseEntity = restTemplate.exchange(restParamVO.getUriBuilder().toString(), method, restParamVO.getEntity(), restParamVO.getResponseBodyType());
        } catch(HttpClientErrorException e) {
            responseEntity = new ResponseEntity(e.getResponseBodyAsString(), e.getStatusCode());
        }

        return responseEntity;
    }
}