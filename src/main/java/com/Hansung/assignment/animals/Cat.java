package com.Hansung.assignment.animals;

public class Cat implements AnimalType{

  private String myName;

  public void setMyName(String myName){
    this.myName = myName;
  }

  @Override
  public void sound() {
    System.out.println("Cat : " + myName);
  }
}
