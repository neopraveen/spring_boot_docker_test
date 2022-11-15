package com.flipflop.kart.listing.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductListingController {

    @GetMapping("/welcome")
    public ResponseEntity<Hello> fetchWelcomeMessage(){
        return ResponseEntity.ok(new Hello("Hello FlipFlop Cart"));
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
