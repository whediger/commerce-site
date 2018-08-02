package com.example.demo;

import java.util.HashMap;
import java.util.Map;


public class User {

  private String name;
  private String password;

  public User(){
    this.name = "unknown";
    this.password = "none";
  }

  public User(String name, String password){
    this.name = name;
    this.password = password;
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
    return user;
  }
}
