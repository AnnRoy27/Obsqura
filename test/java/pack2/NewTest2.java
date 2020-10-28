package pack2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest2 {
  @Test
  public void f() {
	  NewTest11 s=new NewTest11();
	  s.afterTest();
	  NewTest11.beforeTest();
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }
  

}
