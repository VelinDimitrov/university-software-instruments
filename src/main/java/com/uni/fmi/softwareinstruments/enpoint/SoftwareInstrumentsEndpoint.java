package com.uni.fmi.softwareinstruments.enpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoftwareInstrumentsEndpoint {

  @GetMapping("/message")
  public String messageEndpoint(){
    return "I am returning a message";
  }
}
