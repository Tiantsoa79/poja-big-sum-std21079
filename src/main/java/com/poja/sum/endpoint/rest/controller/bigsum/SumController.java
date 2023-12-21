package com.poja.sum.endpoint.rest.controller.bigsum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

  @GetMapping("/big-sum")
  public String addition(@RequestParam("a") String a, @RequestParam("b") String b) {
    try {

      long numA = Long.parseLong(a);
      long numB = Long.parseLong(b);

      long sum = numA + numB;

      return "The sum of " + numA + " and " + numB + " is : " + sum;
    } catch (NumberFormatException e) {
      return "Error : please, enter valid numbers.";
    }
  }
}
