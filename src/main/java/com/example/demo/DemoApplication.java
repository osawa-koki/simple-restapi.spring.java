package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplication {

  // ==================== //
  // HTTP動詞のマッピング基礎 //
  // ==================== //

  @GetMapping("/hello")
  public String hello_get() {
    return "Hello Get!!!";
  }
  @PostMapping("/hello")
  public String hello_post() {
    return "Hello Post!!!";
  }
  @PutMapping("/hello")
  public String hello_put() {
    return "Hello Put!!!";
  }
  @DeleteMapping("/hello")
  public String hello_delete() {
    return "Hello Delete!!!";
  }


}
