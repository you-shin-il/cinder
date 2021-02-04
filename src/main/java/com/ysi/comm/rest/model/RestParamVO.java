package com.ysi.comm.rest.model;

import org.apache.http.client.utils.URIBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

public class RestParamVO<T> {
    private URIBuilder uriBuilder;  //쿼리스트링(queryString)
    private HttpHeaders headers;    //헤더값
    private T body;                 //body
    private ParameterizedTypeReference responseBodyType;    //결과값 받을 객체

    public RestParamVO(URIBuilder uriBuilder, HttpHeaders headers, T body, ParameterizedTypeReference responseBodyType) {
        this.uriBuilder = uriBuilder;
        this.headers = headers;
        this.body = body;
        this.responseBodyType = responseBodyType;
    }

    public HttpEntity<T> getEntity() {
        return new HttpEntity<T>(body, headers);
    }

    public URIBuilder getUriBuilder() {
        return uriBuilder;
    }

    public HttpHeaders getHeaders() {
        return headers;
    }

    public T getBody() {
        return body;
    }

    public ParameterizedTypeReference getResponseBodyType() {
        return responseBodyType;
    }
}