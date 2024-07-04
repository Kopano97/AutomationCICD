package za.co.qotsolutions.Utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import Utilities.ConstantsUtility.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ExternalDataProvider {

    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    public void setExcelFile(String sheetName) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Workspaces\\WebAndAppAuto\\src\\test\\java\\resources\\takealot.xlsx");
        workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheet(sheetName);
        if(sheet == null){
            System.out.println("workbook null");
        }
        file.close();
    }

    public Object[][] getAllData() {
        DataFormatter formatter = new DataFormatter();
        int rows = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println(cols);
        Object[][] data = new Object[rows - 1][cols]; // -1 to skip header row
        for (int i = 0; i < rows - 1; i++) {
            Row row = sheet.getRow(i + 1);
//            System.out.println(row);
            // i + 1 to skip header row
            for (int j = 0; j < cols; j++) {
                Cell cell = row.getCell(j);
                if (cell != null) {
                    data[i][j] = formatter.formatCellValue(cell);
                } else {
                    data[i][j] = "";
                }
            }
        }
        return data;
    }


}
