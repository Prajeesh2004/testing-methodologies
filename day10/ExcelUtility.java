package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static Object[][] readExcel() throws IOException
	{
		String location="C:\\Users\\DELL\\OneDrive\\Desktop\\Day10.xlsx";
		FileInputStream fs=new FileInputStream(location);
		//creating WorkBook Object 
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		// Creating sheet Object
		XSSFSheet sheet=workbook.getSheetAt(0);
		// Total no of rows and columns
		int Total=sheet.getPhysicalNumberOfRows();
		System.out.println("Total No of Rows " +Total);
		int column=sheet.getRow(0).getLastCellNum();
		System.out.println("Total No of columns " + column);
		
		// Creating the 2D object
		Object[][] data=new Object[Total-1][column];
		
		
 		for(int i=1;i<Total;i++)
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<column;j++)
			{
				XSSFCell cell=row.getCell(j);
				data[i-1][j]=cell.getNumericCellValue(); 
				System.out.println(cell.getNumericCellValue());
			}
		}
		return data;
	}
	public static void updateExcel() throws IOException {
		String location="C:\\Users\\DELL\\OneDrive\\Desktop\\Day10.xlsx";
		FileInputStream fis=new FileInputStream(location);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		XSSFRow newrow = sheet.createRow(1);
		XSSFCell newcell=newrow.createCell(1);
		newcell.setCellValue("updated");
		System.out.println("document updated successfully");
		FileOutputStream fos= new FileOutputStream(location);
		workbook.write(fos);
		workbook.close();
		fos.close();
	}
}
