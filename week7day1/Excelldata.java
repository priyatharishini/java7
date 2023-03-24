package week7day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelldata {

	public static String[][] readdata(String filename) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./data/"+filename+".xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		int cellCount = row.getLastCellNum();
		System.out.println(cellCount);
		
		String[][] data =new String[rowCount][cellCount];
		
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				String allDatas = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=allDatas; 
				
			
			}
		}

		book.close();
		return data;
	}
}