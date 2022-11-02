package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SampleData {

  @JsonProperty("first_name")
  public String firstName;

  @JsonProperty("last_name")
  public String lastName;
}
