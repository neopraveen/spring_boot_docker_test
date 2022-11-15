package com.flipflop.kart.product.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductController {

    @GetMapping("/welcome")
    public String getWelcomeMessage(){
        ResponseEntity<Hello> responseEntity = new RestTemplate().getForEntity("http://localhost:8083/welcome", Hello.class);
        if(responseEntity.getBody() == null || responseEntity.getBody().getMessage() == null)
            return "No data found.";
        else
            return responseEntity.getBody().getMessage();
    }

    public static class Hello{
        private String message;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
        public Hello(){

        }
        public Hello(String message){
            this.message = message;
        }
    }
}
