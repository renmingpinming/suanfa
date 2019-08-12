package zhou.yi.util;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 5/27 0027.
 */
public class XlsUtil {

    public enum DataType {
        DATE,
        NUMBER,
        STRING
    }

    public static List<List<String>> getDataList(InputStream is, List<DataType> dataTypes, Integer startRow, Integer celSize) throws IOException {
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);

        HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);

        List<List<String>> rowL = new ArrayList<List<String>>(hssfSheet.getLastRowNum());
        // 循环行
        for (int rowNum = 0; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
            if (startRow != null && rowNum < (startRow)) {
                continue;
            }
            HSSFRow hssfRow = hssfSheet.getRow(rowNum);
            // 循环列
            List<String> colL = new ArrayList<String>(hssfRow.getLastCellNum());
            rowL.add(colL);
            for (int i = 0; i < celSize; i++) {
                HSSFCell cell = hssfRow.getCell(i);
                if (cell == null || cell.equals("") || cell.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
                    colL.add("");
                    continue;
                }
                int cellType = cell.getCellType();

                // 指定数据类型
                if (!CollectionUtils.isEmpty(dataTypes) && dataTypes.size() >= i) {
                    DataType type = dataTypes.get(i);
                    switch (type) {
                        case DATE:
                            colL.add(DateUtilSelf.toStringTime(cell.getDateCellValue()));
                            break;
                        case NUMBER:
                            colL.add(String.valueOf(cell.getNumericCellValue()));
                            break;
                        default:
                            cell.setCellType(Cell.CELL_TYPE_STRING);
                            colL.add(cell.getStringCellValue());
                            break;
                    }
                    continue;
                }

                // 默认数据类型
                if (cellType == Cell.CELL_TYPE_NUMERIC) {
                    colL.add(String.valueOf(cell.getNumericCellValue()));
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    colL.add(cell.getStringCellValue());
                }
            }
        }
        return rowL;
    }
}
