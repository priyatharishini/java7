package week7day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleProgram 
{

	public  static void main(String[] args) throws IOException 
	{
		XSSFWorkbook work=new XSSFWorkbook("./data/sample.xlsx");
		work.getSheetAt(0);
		XSSFSheet sheet= work.getSheetAt(0);
	XSSFSheet s1 = work.getSheet("sheet1");
	XSSFRow row = sheet.getRow(0);
	XSSFCell cell = row.getCell(0);
	String stringCellValue = cell.getStringCellValue();
	System.out.println(stringCellValue);
	int rowcount = sheet.getLastRowNum();
	System.out.println(rowcount);
int cellcount = row.getLastCellNum();
System.out.println(cellcount);
int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
System.out.println(physicalNumberOfRows);
for(int i=1;i<=rowcount;i++) {			
	for(int j=0;j<cellcount;j++) {
						
		String allDatas = sheet.getRow(i).getCell(j).getStringCellValue();
		System.out.println(allDatas);
	
	}
}
	}
}
