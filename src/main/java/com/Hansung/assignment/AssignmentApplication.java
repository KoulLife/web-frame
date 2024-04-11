package com.Hansung.assignment;

import com.Hansung.assignment.animals.PetOwner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("conf/animal.xml");

    PetOwner person = (PetOwner) context.getBean("petOwnerId");
    person.play();
	}

}
