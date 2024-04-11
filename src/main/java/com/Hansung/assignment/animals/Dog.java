package com.Hansung.assignment.animals;

public class Dog implements AnimalType{

  private String myName;

  public void setMyName(String myName){
    this.myName = myName;
  }

  @Override
  public void sound() {
    System.out.println("Dog : " + myName);
  }
}
