package com.Hansung.assignment.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner {
  @Qualifier("qf_dog")
  @Autowired
  private AnimalType animalType;

  public PetOwner(AnimalType animalType){
    this.animalType = animalType;
  }

  public void play(){
    animalType.sound();
  }
}
