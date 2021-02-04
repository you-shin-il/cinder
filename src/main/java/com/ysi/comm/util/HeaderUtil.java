package com.ysi.comm.util;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Collections;

public class HeaderUtil {
    public static HttpHeaders getHeader(String token) {
        HttpHeaders httpHeaders = getHeader();
        httpHeaders.add("Authorization", token);

        return httpHeaders;
    }

    public static HttpHeaders getHeader() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        return httpHeaders;
    }
}