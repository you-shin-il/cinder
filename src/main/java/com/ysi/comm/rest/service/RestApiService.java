package com.ysi.comm.rest.service;

import com.ysi.comm.rest.model.RestParamVO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

public interface RestApiService {
    public ResponseEntity call(RestParamVO restParamVO, HttpMethod method);
}
