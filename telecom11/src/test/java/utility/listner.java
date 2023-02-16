package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import test.logintest;

public class listner extends logintest implements   ITestListener{
	Screenshot sc;
	public void onTestFailure(ITestResult result) {
		sc=new Screenshot();
		try {
			sc.capture(driver,result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
