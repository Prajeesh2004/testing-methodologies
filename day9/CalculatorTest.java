package com.example.testing;

import org.testng.Assert;
import org.testng.annotations.Test;



public class CalculatorTest
{
	
	int num1=20;
	int num2=10;
	
  @Test(priority= 1)
  public void add() 
  {
	  int sum=num1+num2;
	  Assert.assertEquals(sum, 30);
  }
  @Test(priority= 2)
  public void sub() 
  {
	  int diff=num1-num2;
	  Assert.assertEquals(diff, 10);
  }
  @Test(priority= 3)
  public void multi() 
  {
	  int product=num1*num2;
	  Assert.assertEquals(product, 200);
  }
  @Test(priority= 4)
  public void divide() 
  {
	  int reminder=num1/num2;
	  Assert.assertEquals(reminder, 2);
  }
  
}
