package pack2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Examples {
	
  @Test(priority=1,enabled=true)
  public void z() {
	  String s1="Hello";
	  String s2="World";
	 
 Assert.assertEquals(s1, s2);
	  
  }
  @Test(priority=2)
  public void g() {
	  String s3=null;
	  String s4="Helloz";
	  SoftAssert softassertobj=new SoftAssert();
	 // softassertobj.assertEquals(s3, s4);
	  System.out.println("rest statements");
	  softassertobj.assertNull(s3);
	  
	  //Assert.assertNotEquals(s3, s4);
	  softassertobj.assertAll();
  }
  @Test
  public void h() {
	  
	  String s1="Hello";
	  String s2="World";
	 // Assert.assertNotEquals(s1, s2,"failed message");
  }
  @Test(priority=0)
  public void i() {
	  String s1="Hello";
	  String s2="Hello";
	 // Assert.assertNotEquals(s1, s2,"failed message");
	 
  }
/*  @Test
  public void f() {
	boolean f=true;
	  Assert.assertTrue(f);
  }
  @Test
  public void g() {
	boolean f=false;
	  Assert.assertTrue(f);
  }
  @Test
  public void h() {
	boolean f=true;
	  Assert.assertTrue(f,"message");
  }
  @Test
  public void i() {
	boolean f=false;
	  Assert.assertTrue(f,"message");
  }*/
  
  
  
  
  
  
  
 /* @Test
  public void f() {
	boolean f=true;
	  Assert.assertFalse(f);
	  
  }
  @Test
  public void g() {
	boolean f=false;
	 Assert.assertFalse(f);
  }
  @Test
  public void h() {
	boolean f=true;
	  Assert.assertFalse(f,"message");
  }
  @Test
  public void i() {
	boolean f=false;
	  Assert.assertFalse(f,"message");
  }
  */
  
  
  
  
}
