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
import java.util.Random;
import java.util.UUID;

/**
 * @Author:ZhouYi
 * @Date:2020-05-20 09:03
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
     * 生成16位不重复的随机数，含数字+大小写
     * @return
     */
    public static String getIv() throws Exception{
        //随机生成一位整数
        int random = (int) (Math.random()*9+1);
        String valueOf = String.valueOf(random);
        //生成uuid的hashCode值
        int hashCode = UUID.randomUUID().toString().hashCode();
        //可能为负数
        if(hashCode<0){
            hashCode = -hashCode;
        }
        String value = valueOf + String.format("%015d", hashCode);
        byte[] ivByte = Base64.encodeBase64(value.getBytes("UTF-8"));
        return new String(ivByte, "UTF-8");
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

    /**
     * 加密密码
     * @param filePath
     * @param projectKey
     * @param password
     * @param iv
     * @return
     */
    public static String encodePassword(String filePath,String projectKey,String password,String iv) throws IOException, NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException {
        File keyFile = new File(filePath);
        FileInputStream fis = new FileInputStream(keyFile);
        DataInputStream dis = new DataInputStream(fis);
        //要读取的位数
        byte[] keyByteOne = new byte[(int) keyFile.length()];
        dis.read(keyByteOne);
        fis.close();
        dis.close();
        byte[] keyByteTwo = Base64.decodeBase64(projectKey);

        byte[] passwordByte = password.getBytes(CHARSET);
        byte[] ivByte = Base64.decodeBase64(iv);

        //加密
        byte[] decode = encryptOrdecrypt(true, passwordByte, keyByteTwo, ivByte, AESType.AES_128, EncodeType.AES_OFB_NoPadding);
        decode = encryptOrdecrypt(true, decode, keyByteOne, ivByte, AESType.AES_128, EncodeType.AES_OFB_NoPadding);
        return Base64.encodeBase64String(decode);
    }

}