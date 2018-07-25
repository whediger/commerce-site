package com.example.demo;

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
}
