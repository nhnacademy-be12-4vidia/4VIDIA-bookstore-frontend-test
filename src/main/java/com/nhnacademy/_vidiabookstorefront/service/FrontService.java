package com.nhnacademy._vidiabookstorefront.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FrontService {

    private final RestTemplate restTemplate;

    public FrontService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }



    public String getBook() {

        String url = "http://api-gateway/book-service/hello/books";
        // API Gateway 호출에서는 포트를 안 적어두 된다.

        return restTemplate.getForObject(url, String.class);
    }
}
