package day40;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File --> Workbook --> Sheets --> Rows --> Cells

//XSSWorkbook - workbook (Apache POI)
//XSSFSheet - Sheet (Apache POI)
//XSSFRow -Row (Apache POI)
//XSSFCell - Cell (Apache POI)

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testData\\text.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1"); // XSSFSheet sheet = workbook.getSheetAt(0);

		int totalrow = sheet.getLastRowNum();
		short totalCells = sheet.getRow(1).getLastCellNum();

		System.out.println("Number of Rows : " + totalrow); // 5
		System.out.println("Number of Cells : " + totalCells); // 4

		for (int r = 0; r <= totalrow; r++) // as per java r and c start drom 0
		{
			XSSFRow currentRow = sheet.getRow(r);

			for (int c = 0; c < totalCells; c++) 
			{
				XSSFCell cell = currentRow.getCell(c);
				System.out.print(cell.toString() + "\t");
			}
			System.out.println();
		}

		workbook.close();
		file.close();
	}
}
