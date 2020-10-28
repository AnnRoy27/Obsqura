package packtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Sample {
  @Test(enabled=false)
  public void f() {
	  System.out.println(" test1");
  }
  @Test
  public void g() {
	  System.out.println(" test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println(" beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(" aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println(" beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforesuit");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("aftersuit");
  }

}
