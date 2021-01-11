package org.caesar.example;

import org.springframework.http.ResponseEntity;
import org.testng.annotations.Test;
import org.caesar.example.utils.CreateSign;

import org.springframework.web.client.RestTemplate;


public class TestCreateSign {
    @Test
    public void testSign()
    {
        System.out.println(new CreateSign().sign("hey girl"));

    }

    @Test
    public void testGet()
    {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://10.130.210.87:8844/system/version", String.class);
        System.out.println(responseEntity);
        System.out.println(responseEntity.getStatusCode().value());
    }
}
