package com.example.testing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ClaculatorData {
	CalculatorLogic cl=new CalculatorLogic();
	
	
  @Test(dataProvider = "testAddData")
  public void addMathod(int a, int b, int expected) {
	  int result=cl.add(a,b);
	  Assert.assertEquals(expected, result);
  }
  @DataProvider
  public Object[][] testAddData()
  {
	  return new Object[][] {
		  {1,2,3}
	  };
  }
  
  @Test(dataProvider = "testSubData")
  public void SubMethod(int a,int b,int expected)
  {
	  int result=cl.sub(a, b);
	  Assert.assertEquals(expected, result);
  }
  
  @DataProvider
  public Object[][] testSubData()
  {
	  return new Object[][] {
		  {3,2,1}
	  };
  }
  @Test(dataProvider = "testMulData")
  public void mulMethod(int a,int b,int expected)
  {
	  int result=cl.mul(a, b);
	  Assert.assertEquals(expected, result);
  }
  
  @DataProvider
  public Object[][] testMulData()
  {
	  return new Object[][] {
		  {3,2,6}
	  };
  }
  @Test(dataProvider = "testdivData")
  public void divMethod(int a,int b,int expected)
  {
	  int result=cl.div(a, b);
	  Assert.assertEquals(expected, result);
  }
  
  @DataProvider
  public Object[][] testdivData()
  {
	  return new Object[][] {
		  {3,1,3}
	  };
  }
}