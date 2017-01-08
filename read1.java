package util;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mtech
 */
public class read1 {

    public static ArrayList readsecond() throws Exception {
        //
        // An excel file name. You can create a file name with a full path
        // information.
        //
        String filename="/home/mtech/UploadedfFiles/x3.xls";
        //String filename = "C:\\Users\\admin\\Desktop\\x3.xls";
        //
        // Create an ArrayList to store the data read from excel sheet.
        //
        List sheetData = new ArrayList();

        FileInputStream fis = null;
        try {
            //
            // Create a FileInputStream that will be use to read the excel file.
            //
            fis = new FileInputStream(filename);

            //
            // Create an excel workbook from the file system.
            //
            HSSFWorkbook workbook = new HSSFWorkbook(fis);
            //
            // Get the first sheet on the workbook.
            //
            HSSFSheet sheet = workbook.getSheetAt(0);

            //
            // When we have a sheet object in hand we can iterator on each
            // sheet's rows and on each row's cells. We store the data read
            // on an ArrayList so that we can printed the content of the excel
            // to the console.
            //
            Iterator rows = sheet.rowIterator();
            while (rows.hasNext()) {
                HSSFRow row = (HSSFRow) rows.next();
                Iterator cells = row.cellIterator();

                List data = new ArrayList();
                while (cells.hasNext()) {
                    HSSFCell cell = (HSSFCell) cells.next();
                    data.add(cell);
                }

                sheetData.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                fis.close();
            }
        }

        ArrayList a1 = showExelData(sheetData);
        return a1;
    }

    private static ArrayList showExelData(List sheetData) {

        ArrayList<bean> a = new ArrayList<bean>();
        int[][] m = new int[10][10];
        int x = 0;
        for (int i = 0; i < sheetData.size(); i++) {
            List list = (List) sheetData.get(i);

            HSSFCell cell1 = (HSSFCell) list.get(0);
            HSSFCell cell2 = (HSSFCell) list.get(1);
            HSSFCell cell3 = (HSSFCell) list.get(2);
             HSSFCell cell4 = (HSSFCell) list.get(3);
             HSSFCell cell5 = (HSSFCell) list.get(4);
            bean b = new bean();
            b.setTransport(cell1.getRichStringCellValue().getString());
            b.setFromcity(cell2.getRichStringCellValue().getString());
            b.setTocity(cell3.getRichStringCellValue().getString());
           // b.setCost(cell4.getRichStringCellValue().getString());
           int c=(int) cell4.getNumericCellValue();
           b.setCost(c);
           int t=(int) cell5.getNumericCellValue();
           b.setTime(t);
            a.add(b);

        }
        return a;
    }
}
