package com.wetts;

import com.wetts.base.shiro.Constants;
import com.wetts.base.utils.HmacSHA256Utils;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created by wetts on 2017/4/5.
 */
public class ShiroDemo {

    private RestTemplate restTemplate = new RestTemplate();

    @Test
    public void success() {
        String username = "admin";
        String param11 = "param11";
        String param2 = "param2";
        String key = "dadadswdewq2ewdwqdwadsadasd";
        MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
        params.add(Constants.PARAM_USERNAME, username);
        params.add("param1", param11);
        params.add("param2", param2);
        params.add(Constants.PARAM_DIGEST, HmacSHA256Utils.digest(key, params));
        System.out.println(HmacSHA256Utils.digest(key, params));

        String url = UriComponentsBuilder
                .fromHttpUrl("http://localhost:8080/hello")
                .queryParams(params).build().toUriString();
        ResponseEntity responseEntity = restTemplate.getForEntity(url, String.class);
        System.out.println(responseEntity);
    }

    @Test
    public void fail() {
        String username = "admin";
        String param11 = "param11";
        String param2 = "param2";
        String key = "dadadswdewq2ewdwqdwadsadasd";
        MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
        params.add(Constants.PARAM_USERNAME, username);
        params.add("param1", param11);
        params.add("param2", param2);
        params.add(Constants.PARAM_DIGEST, HmacSHA256Utils.digest(key, params));
        System.out.println(HmacSHA256Utils.digest(key, params));
        params.add("param23", param2);

        String url = UriComponentsBuilder
                .fromHttpUrl("http://localhost:8080/hello")
                .queryParams(params).build().toUriString();
        ResponseEntity responseEntity = restTemplate.getForEntity(url, String.class);
        System.out.println(responseEntity);
    }
}
