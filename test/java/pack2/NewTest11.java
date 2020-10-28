package pack2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest11 {
	
	public NewTest11()
	{
		System.out.println("constructor");
	}
  @Test
  private void f() {
	  
	  System.out.println("class1");
  }
  @BeforeTest
  public  static void beforeTest() {
	  System.out.println("beforeclass1");
  }

  @AfterTest
  public final void afterTest() {
	  System.out.println("afterclass1");
  }

}
