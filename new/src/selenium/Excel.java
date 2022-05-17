package selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel {
public static void main(String args[])throws Exception {
	FileInputStream file = new FileInputStream("C:\\New folder\\excel.xls");
	HSSFWorkbook workbook = new HSSFWorkbook(file);
	HSSFSheet sheet = workbook.getSheet("slot");
	System.out.println(sheet.getSheetName());
	System.out.println(sheet.getLastRowNum());
	System.out.println(sheet.getRow(3).getCell(2));
	HSSFCell cell = sheet.getRow(3).getCell(2);
	cell.setCellValue("saroj");
	file.close();
	FileOutputStream fi = new FileOutputStream("C:\\New folder\\excel.xls");
	workbook.write(fi);
	System.out.println(cell.getStringCellValue());
	
}
}
