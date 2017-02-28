package com.sample.prac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class newmethod {
 
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("i am in methd");
	  System.out.println("johnsons");
  }
  
  @Test
  public void f1() {
	  
	 System.out.println("i am in class");
  }
  @Test
  public void f2() {
	  
	 System.out.println("i am in 2nd class");
  }


  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am 2nd  methd");
  }
  

}
