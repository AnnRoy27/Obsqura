package pack2;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyExcel {
	
	public static Object[][] read() throws IOException
	{
	FileInputStream f= new FileInputStream("C:\\Users\\wuuuuuuuu\\Desktop\\data.xlsx");
	XSSFWorkbook w= new XSSFWorkbook(f);
	XSSFSheet sh= w.getSheet("Sheet1");
	 Object value[][]=new Object[3][2];
/*	for(int i=0;i<3;i++) {
		  for(int j=0;j<2;j++) {*/
			/*	Row r= sh.getRow(i);
				Cell c= r.getCell(j); */
				//int celltype=c.getCellType();
				System.out.println("column count" +sh.getRow(0).getLastCellNum()  + sh.getLastRowNum());
	/*			
	switch(celltype) 
	{
	case Cell.CELL_TYPE_NUMERIC:
	{
		double a=c.getNumericCellValue();
	 value[i][j]= String.valueOf(a);
	}
	case Cell.CELL_TYPE_STRING:
	{
		value[i][j]=  c.getStringCellValue();
	}
	
	}

}
	 }*/
	return value;
	}
	
	
	
	public static void main(String args[]) throws IOException {
		MyExcel obj =new MyExcel();
		MyExcel.read();
	}
}
