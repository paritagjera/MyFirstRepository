package practicetests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softassert=new SoftAssert();
  @Test (priority=1)
  public void creatuser() {
	  System.out.println("i am in home test");
	  System.out.println("before assertion");
	  Assert.assertTrue(2>3 ,"verify element");
	  System.out.println("after assert");
	  Assert.assertEquals("abc", "abc");
	  
  }
  
  @Test(priority=2,dependsOnMethods="creatuser")
  public void edituser() {
	  
	  System.out.println("before assertion");
	  softassert.assertTrue(2>3 ,"verify element");
	  System.out.println("after assert");
	  
	  softassert.assertAll();
  }
  
  @Test(priority=3,dependsOnMethods="edituser")
  public void deletuser() {
	  System.out.println("i am in end test");
	  System.out.println("before assertion");
	  softassert.assertTrue(2>3 ,"verify element");
	  System.out.println("after assert");
	  softassert.assertEquals("abc", "abc1");
	  System.out.println("after second assertion");
	  softassert.assertAll();
	  
  }
}
