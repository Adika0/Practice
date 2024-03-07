package Param;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Parameterization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File f1=new File("E:\\Testing material from nikhil\\work.xlsx");
		FileInputStream f=new FileInputStream(f1);
		String s = WorkbookFactory.create(f).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
        System.out.println(s);		
         
              // XSSFWorkbook s=new XSSFWorkbook(f);
               
               
            //     String str=s.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
           //    System.out.println(str);
               

	}

}
