package pack3;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DataProviderExample {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() throws BiffException, IOException {
	  
	  FileInputStream f= new FileInputStream("E:\\Testdata.xls");
	  Workbook w=Workbook.getWorkbook(f);
	  Sheet s=w.getSheet("Sheet1");
	  int r=s.getRows();
	  int c=s.getColumns();
	 String input[][]=new String[r][c];
	  for(int i=0;i<r;i++)
	  {
		  for(int j=0;j<c;j++)  
		  {
			  Cell cc=s.getCell(j,i);
	
		
		
			  input[i][j]=cc.getContents();
			
			  }
	  }
	  return input;
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
