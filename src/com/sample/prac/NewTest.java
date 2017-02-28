package com.sample.prac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
 
  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am in base class");
  }
  @Test
  public void f() {
	  
	  System.out.println("A is Big");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am in afterclass");
  }

}
