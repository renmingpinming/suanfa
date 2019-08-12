package zhou.yi.poi;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.List;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/8 9:16
 */
public class EasyExcelTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = getInputStream("C:\\Users\\User\\Desktop\\test.xls");
        try {
            // 解析每行结果在listener中处理
            ExcelListener listener = new ExcelListener();

            ExcelReader excelReader = new ExcelReader(inputStream, ExcelTypeEnum.XLS, null, listener);
//            excelReader.read();
//            List<Object> datas = listener.getDatas();
//            System.out.println(datas);

            excelReader.read(new Sheet(1, 1, EasyModel.class));
            List<EasyModel> datas = listener.getDatas();
            System.out.println(datas);
        } catch (Exception e) {

        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static InputStream getInputStream(String filePath) throws IOException {
        // 读入 文件
        File file = new File(filePath);
        FileInputStream in_file = new FileInputStream(file);

        // 转 MultipartFile
        MultipartFile multi = new MockMultipartFile("test.xls", in_file);
        return multi.getInputStream();
    }
}
