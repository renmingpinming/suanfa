package zhou.yi.aes;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.*;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * @Author:XiaoLang
 * @Date:2020-05-13 10:13
 */
public class DecodeTest {
    public static void main(String[] args) throws Exception {
        String xx = AESUtil.decodePassword("/home/tomcatconfig/fengkong/key.bin","s3Z0s4AMRwU89DN6VOMudwdtuLEQqJyZZ1xzja83T8A=",
                "gptkLA2JPUP2SG98F0Ol","GtSoaObaQET3u4YxRXHY6Q==");
        String xx2 = AESUtil.encodePassword("/home/tomcatconfig/fengkong/key.bin","s3Z0s4AMRwU89DN6VOMudwdtuLEQqJyZZ1xzja83T8A=",
                "MFilWK1yS4MjQyT","GtSoaObaQET3u4YxRXHY6Q==");
    }

}
