package com.example.testing;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListenerDay09 implements ITestListener{
  @Test
  public void day9() {
  }

@Override
public void onTestStart(ITestResult result) {
//	System.out.println("Test Started "+ result.getName());
	
}

@Override
public void onTestSuccess(ITestResult result) {
//	System.out.println("Test Success "+ result.getName());
	
}

@Override
public void onTestFailure(ITestResult result) {
	System.out.println("Test Failure "+ result.getName());
	
}

@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}
}
