package com.wetts.base.utils;

import java.security.MessageDigest;

/**
 *功能：对传入字符串进行加密处理后返回
 *@date 2015/03/13
 */
public class MD5Util {
	/**
	 * 实现功能：加密时调用的方法
	 * @param oldString 需要加密的字符串
	 * @return 加密后的字符串
	 */
	public static String encrypt(String oldString){
		return oldString == null ? null : MD5(oldString);
	}
	
	private static String MD5(String s) {
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};       

        try {
            byte[] btInput = s.getBytes();
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	
    @SuppressWarnings("unused")
	private static String Md52(String plainText) {
		StringBuffer buf = new StringBuffer("");
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(plainText.getBytes());
			byte b[] = md.digest();
			int i;
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			 buf.toString();// 32位的加密
			 buf.toString().substring(8, 24);// 16位的加密
		} catch (Exception e) {
			e.printStackTrace();
		}
		return buf.toString();
	}
    
    public static void main(String[] args) {
		System.out.println(encrypt("zrpd888888"));
	}
}

