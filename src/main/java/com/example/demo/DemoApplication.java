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

  // パラメタの取得
  @GetMapping("/areyou")
  public String areyou_get(@RequestParam(value = "name", defaultValue = "Osawa") String name) {
    return String.format("Are You %s of Get???", name);
  }
  @PostMapping("/areyou")
  public String areyou_post(@RequestParam(value = "name", defaultValue = "Osawa") String name) {
    return String.format("Are You %s of Post???", name);
  }

  @PutMapping("/areyou")
  public String areyou_put(@RequestParam(value = "name", defaultValue = "Osawa") String name) {
    return String.format("Are You %s of Put???", name);
  }

  @DeleteMapping("/areyou")
  public String areyou_delete(@RequestParam(value = "name", defaultValue = "Osawa") String name) {
    return String.format("Are You %s of Delete???", name);
  }


}
