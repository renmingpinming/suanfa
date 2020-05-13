package zhou.yi.aes;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.*;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @Author:XiaoLang
 * @Date:2020-05-13 10:13
 */
public class DecodeTest {
    public static void main(String[] args) throws NoSuchPaddingException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, InvalidKeyException {
        String xx = AESUtil.decodePassword("src/main/resources/key.bin","s3Z0s4AMRwU89DN6VOMudwdtuLEQqJyZZ1xzja83T8A=",
                "gptkLA2JPUP2SG98F0Ol","GtSoaObaQET3u4YxRXHY6Q==");
    }
}
