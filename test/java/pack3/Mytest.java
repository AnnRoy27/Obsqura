package pack3;

import org.testng.annotations.Test;

import pack2.MyExcel;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.annotations.AfterClass;

public class Mytest {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  System.out.println(n);
	  System.out.println(s); 
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() throws IOException {
		 Object value[][]=new Object[3][2];
		value= MyExcel.read();
   return value;
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
