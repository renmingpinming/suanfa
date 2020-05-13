package zhou.yi.aes;


import org.apache.commons.codec.binary.Base64;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * 在线助手|在线工具|在线生成|在线制作
 * https://www.it399.com/
 * 在线助手博客
 * https://www.it399.com/blog/index
 */
public class AESUtil {
    public static final String CHARSET = "UTF-8";

    private static byte[] encryptOrDecrypt(int mode, byte[] byteContent, byte[] key, byte[] iv, AESType type, String modeAndPadding) throws InvalidKeyException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, NoSuchPaddingException, BadPaddingException, IllegalBlockSizeException {
        SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance(modeAndPadding);// 创建密码器
        if (null != iv) {
            //指定一个初始化向量 (Initialization vector，IV)， IV 必须是16位
            cipher.init(mode, keySpec, new IvParameterSpec(iv));
        } else {
            cipher.init(mode, keySpec);
        }
        byte[] result = cipher.doFinal(byteContent);
        return result;
    }

    /**
     * @param isEncrypt
     * @param source
     * @param key
     * @param type
     * @param encodeType
     */
    public static byte[] encryptOrdecrypt(boolean isEncrypt, byte[] source, byte[] key, byte[] iv, AESType type, String encodeType) throws UnsupportedEncodingException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchPaddingException, BadPaddingException, IllegalBlockSizeException, InvalidKeyException {
        if (isEncrypt) {
            byte[] encodeByte = encryptOrDecrypt(Cipher.ENCRYPT_MODE, source, key, iv, type, encodeType);
            String encodeStr = TypeConvert.bytesToHexString(encodeByte);
            return encodeByte;
        } else {
            byte[] decodeByte = encryptOrDecrypt(Cipher.DECRYPT_MODE, source, key, iv, type, encodeType);
            String decodeStr = new String(decodeByte, CHARSET);
            return decodeByte;
        }
    }

    /**
     * 指定一个初始化向量 (Initialization vector，IV)，IV 必须是16位
     */
    public static final byte[] getIV() throws Exception {
        return "1234567812345678".getBytes(CHARSET);
    }

    public static void main(String[] args) throws Exception {
        String content = "在线助手";
        // 生成密钥需要的密码值
//        String key = "www.it399.com";
        byte[] encrypt;
        /**
         * 1.4 AES/OFB
         * AES/OFB/NoPadding
         * AES/OFB/PKCS5Padding
         * AES/OFB/ISO10126Padding
         */

        String key = "s3Z0s4AMRwU89DN6VOMudwdtuLEQqJyZZ1xzja83T8A=";
        byte[] keyBytes = Base64.decodeBase64(key);

        encrypt = encryptOrdecrypt(true, content.getBytes(CHARSET), keyBytes, getIV(), AESType.AES_128, EncodeType.AES_OFB_NoPadding);
        byte[] decode = encryptOrdecrypt(false, encrypt, keyBytes, getIV(), AESType.AES_128, EncodeType.AES_OFB_NoPadding);
        String decodeStr = new String(decode, CHARSET);
    }

    /**
     * 解密密码
     * @param filePath
     * @param projectKey
     * @param password
     * @param iv
     * @return
     */
    public static String decodePassword(String filePath,String projectKey,String password,String iv) throws IOException, NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException {
        File keyFile = new File(filePath);
        FileInputStream fis = new FileInputStream(keyFile);
        DataInputStream dis = new DataInputStream(fis);
        //要读取的位数
        byte[] keyByteOne = new byte[(int) keyFile.length()];
        dis.read(keyByteOne);
        fis.close();
        dis.close();
        byte[] keyByteTwo = Base64.decodeBase64(projectKey);

        byte[] passwordByte = Base64.decodeBase64(password);
        byte[] ivByte = Base64.decodeBase64(iv);

        //解密
        byte[] decode = encryptOrdecrypt(false, passwordByte, keyByteOne, ivByte, AESType.AES_128, EncodeType.AES_OFB_NoPadding);
        decode = encryptOrdecrypt(false, decode, keyByteTwo, ivByte, AESType.AES_128, EncodeType.AES_OFB_NoPadding);
        return new String(decode, "UTF-8");
    }
}