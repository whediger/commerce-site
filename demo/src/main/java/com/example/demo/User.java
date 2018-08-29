package com.example.demo;

import java.util.HashMap;
import java.util.Map;


public class User {

  private String name;
  private String password;
  private String isLoggedIn;

  public User(){
    this.name = "unknown";
    this.password = "none";
    this.isLoggedIn = "no";
  }

  public User(String name, String password){
    this.name = name;
    this.password = password;
    this.isLoggedIn = "yes";
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getPassword(){
    return this.password;
  }

  public void setPassword(String password){
    this.password = password;
  }

  public Map getHashMap() {
    Map<String, Object> user = new HashMap<String, Object>();
    user.put("name", this.name);
    user.put("password", this.password);
    user.put("isLoggedIn", this.isLoggedIn);
    return user;
  }
}
