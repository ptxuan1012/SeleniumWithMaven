package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utils {

	public static String[][] readDataFromExcel(String dataFile, String dataSheet) throws IOException {
		String[][] dataTable = null;
		String excelFilePath = System.getProperty("user.dir") + "/testdata/" + dataFile;
		FileInputStream fileInputStream = new FileInputStream(new File(excelFilePath));

		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(dataSheet);
		int numRows = sheet.getLastRowNum(); // not Including the header
		int numCols = sheet.getRow(0).getLastCellNum();
		dataTable = new String[numRows][numCols];
		System.out.println(numRows);
		System.out.println(numCols);
		for (int rowIndex = 0; rowIndex < numRows; rowIndex++) {
			Row row = sheet.getRow(rowIndex + 1);// get row of value
			if (row != null) {
				for (int colIndex = 0; colIndex < numCols; colIndex++) {
					Cell cell = row.getCell(colIndex);
					if (cell != null) {
						switch (cell.getCellType()) {
						case STRING:
							dataTable[rowIndex][colIndex] = cell.getStringCellValue();
							break;
						case NUMERIC:
							if (DateUtil.isCellDateFormatted(cell)) {
								dataTable[rowIndex][colIndex] = cell.getDateCellValue().toString();
							} else {
								dataTable[rowIndex][colIndex] = String.valueOf(cell.getNumericCellValue());
							}
							break;
						case BOOLEAN:
							dataTable[rowIndex][colIndex] = String.valueOf(cell.getBooleanCellValue());
							break;
						case BLANK:
							dataTable[rowIndex][colIndex] = "";
							break;
						default:
							dataTable[rowIndex][colIndex] = "";
						}
					}
				}
			}
		}

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				System.out.print(dataTable[i][j] + "\t");
			}
			System.out.println();
		}

		return dataTable;
	}
}

	// doc data tu excel Interator
	/*
	 * public static String[][] readDataFromExcelofInterator(String dataFile, String
	 * dataSheet) throws IOException { String[][] dataTable = null; String
	 * excelFilePath = System.getProperty("user.dir") + "/testdata/" + dataFile;
	 * FileInputStream fileInputStream = new FileInputStream(new
	 * File(excelFilePath));
	 * 
	 * Workbook workbook = new XSSFWorkbook(fileInputStream); Sheet sheet =
	 * workbook.getSheet(dataSheet); Iterator iterator = sheet.iterator(); while
	 * (iterator.hasNext()) { Row row = (Row) iterator.next(); Iterator
	 * cellInterator = row.cellIterator(); while (cellInterator.hasNext()) { Cell
	 * cell = (Cell) cellInterator.next(); switch (cell.getCellType()) { case
	 * STRING: cell.getStringCellValue(); break; }
	 * 
	 * } } return dataTable; } }
	 */

// doc data tu excel
//	public static String[][] readDataFormexcel(String dataFile, String dataSheet) {
//		String dataTable[][] = null;
//		String localDir = System.getProperty("user.dir");
//		String filePath = localDir + "\\testdata\\" + dataTable;
//		try {
//			FileInputStream fileInputStream = new FileInputStream(new File(filePath));
//			Workbook workbook = new XSSFWorkbook(fileInputStream);
//			Sheet practiceFormSheet = workbook.getSheet(dataSheet);
//			// so row
//			int numberOfRows = practiceFormSheet.getLastRowNum();
//			// so cell
//			int numberOfCells = practiceFormSheet.getRow(0).getLastCellNum();
//			dataTable = new String[numberOfRows][numberOfCells];
//
//			Iterator<Row> iterator = practiceFormSheet.iterator();
//			int i = 0;
//			
//			while (iterator.hasNext()) {
//				Row rowiterator = iterator.next();
//				Iterator<Cell> cellIterator = rowiterator.cellIterator();
//				int j = 0;
//				while (cellIterator.hasNext()) {
//					Cell cell = cellIterator.next();
//					dataTable[i][j] = cell.getStringCellValue();
//					j++;
//				}
//				i++;
//			}
//			for (int k = 0; k < dataTable.length; k++) {
//				for (int n = 0; n < dataTable[0].length; n++)
//					System.out.println("mang la: " + dataTable[k][n]);
//
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//		return dataTable;
//	}
