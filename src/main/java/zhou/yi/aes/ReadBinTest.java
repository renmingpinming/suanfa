package zhou.yi.aes;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 读取二进制文件
 * @Author:XiaoLang
 * @Date:2020-05-12 17:11
 */
public class ReadBinTest {

    public static void main(String[] args) throws IOException {
//        File keyFile = new File("/Users/zhouyi/Desktop/key.bin");
        File keyFile = new File("src/main/resources/key.bin");
        FileInputStream fis = new FileInputStream(keyFile);
        DataInputStream dis = new DataInputStream(fis);
        byte[] by = new byte[(int) keyFile.length()];//要读取的位数
        dis.read(by);
    }

}
