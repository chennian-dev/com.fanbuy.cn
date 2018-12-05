package com.fanbuy.cn.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f() {
      System.out.println("this is TestNG test case");
  }
  @BeforeClass
  public void beforeClass() {
      System.out.println("this is before class");
  }

  @AfterClass
  public void afterClass() {
      System.out.println("this is after class");
  }

}
