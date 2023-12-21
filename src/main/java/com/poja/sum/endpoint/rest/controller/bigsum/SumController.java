package com.poja.sum.endpoint.rest.controller.bigsum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class SumController {

  @GetMapping("/big-sum")
  public String calculateBigSum(
    @RequestParam("a") String a,
    @RequestParam("b") String b) {


    BigInteger num1 = new BigInteger(a);
    BigInteger num2 = new BigInteger(b);


    BigInteger sum = num1.add(num2);

    return "The sum of\n" + num1 + " \nand\n" + num2 + " \nis\n" + sum + "\n";
  }
}
