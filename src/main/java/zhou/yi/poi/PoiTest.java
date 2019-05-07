package zhou.yi.poi;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;
import zhou.yi.util.XlsUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;

import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: XiaoLang
 * @Date: 2019/5/7 16:50
 */
public class PoiTest {
    protected final Logger logger = LogManager.getLogger(getClass());
    private static final String EXCEL_XLS = "xls";
    private static final List<XlsUtil.DataType> CELL_TYPE_LIST;
    static{
        CELL_TYPE_LIST = new ArrayList<XlsUtil.DataType>();
        CELL_TYPE_LIST.add(XlsUtil.DataType.STRING);
        CELL_TYPE_LIST.add(XlsUtil.DataType.STRING);
        CELL_TYPE_LIST.add(XlsUtil.DataType.STRING);
    }
    public static void main(String[] args) throws IOException {
        // 读入 文件
        File file = new File("C:\\Users\\User\\Desktop\\test.xls");
        FileInputStream in_file = new FileInputStream(file);

        // 转 MultipartFile
        MultipartFile multi = new MockMultipartFile("test.xls", in_file);

        List<List<String>> dataL = null;
        try {
            dataL = XlsUtil.getDataList(multi.getInputStream(),CELL_TYPE_LIST,1,3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        for(int i = 0; i < dataL.size();i++){
            System.out.println(dataL.get(i).get(0));
//            if(StringUtils.isEmpty(dataL.get(i).get(1))){
//                System.out.println("zhouyi");
//            }else {
//                System.out.println(dataL.get(i).get(1));
//            }
            System.out.println(dataL.get(i).get(1));
            System.out.println(dataL.get(i).get(2));
        }
    }
}
