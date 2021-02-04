package com.ysi.bim.service;

import com.ysi.bim.model.Notice;
import com.ysi.bim.model.TokenVO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class BimService {
    RestTemplate restTemplate = null;

    public BimService() {
        restTemplate = new RestTemplate();
    }

    private ResponseEntity<TokenVO> getToken() {
        MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
        parameters.add("client_id", "portal");
        parameters.add("username", "psy");
        parameters.add("password", "inje1234");
        parameters.add("grant_type", "password");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        HttpEntity entity = new HttpEntity<>(parameters, headers);

        return restTemplate.exchange("http://ssobim.injecloud.co.kr:50880/auth/realms/BIM/protocol/openid-connect/token", HttpMethod.POST, entity, new ParameterizedTypeReference<TokenVO>() {});
    }

    public ResponseEntity<Notice> getNotice(int number, int size) {
        ResponseEntity<TokenVO> tokenResponseEntity = getToken();

        String uri = UriComponentsBuilder.newInstance().scheme("http")
                .host("mtbim.injecloud.co.kr")
                .port(50080)
                .path("/api/notices")
                .queryParam("page.number", number)
                .queryParam("page.size", size)
                .encode()
                .toUriString();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.add("Authorization", "Bearer " + tokenResponseEntity.getBody().getAccess_token());

        HttpEntity entity = new HttpEntity<>(null, headers);

        return restTemplate.exchange(uri, HttpMethod.GET, entity, new ParameterizedTypeReference<Notice>() {});
    }


}