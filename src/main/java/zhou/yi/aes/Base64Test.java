package zhou.yi.aes;


import org.apache.commons.codec.binary.Base64;

/**
 * @Author:XiaoLang
 * @Date:2020-05-12 17:38
 */
public class Base64Test {
    public static void main(String[] args) {
        String key = "s3Z0s4AMRwU89DN6VOMudwdtuLEQqJyZZ1xzja83T8A=";
        byte[] keyBytes = Base64.decodeBase64(key);
    }
}
