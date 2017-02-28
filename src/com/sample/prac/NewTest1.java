package com.sample.prac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest1 {
 
  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am in before test");
  }

  @Test
  public void f1() {
	  System.out.println("i am in class");
	  
  }
  @Test
  public void f2() {
	  System.out.println("i am in 2nd class");
	  
  }
  
  
  @AfterTest
  public void afterTest() {
	  System.out.println("i am in before test");
  }

}
