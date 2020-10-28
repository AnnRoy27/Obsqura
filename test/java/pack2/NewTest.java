package pack2;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("f");
  }
  @Test
  public void s() {
	 String exp="hello";
	 String act="hellO";
	 Assert.assertEquals(act, exp);
  }

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

}
