package encoder;

import java.io.UnsupportedEncodingException;

/**
 * @author gewei
 * @date 2019/5/9
 */
public class HowtoEncodeDemo {
    public static void main(String[] args) {
        String name = "I am 君山";
        char[] chars = name.toCharArray();
        toHex(chars);

        try {
            byte[] iso8859 = name.getBytes("ISO-8859-1");
            toHex(iso8859);
            String iso8859Name = new String(iso8859, "ISO-8859-1");
            System.out.println(iso8859Name);

            byte[] gb2312 = name.getBytes("GB2312");
            toHex(gb2312);
            String gb2312Name = new String(gb2312, "GB2312");
            System.out.println(gb2312Name);

            byte[] gbk = name.getBytes("GBK");
            toHex(gbk);
            String gbkName = new String(gbk, "GBK");
            System.out.println(gbkName);
            byte[] utf16 = name.getBytes("UTF-16");
            toHex(utf16);
            String uff16Name = new String(utf16, "UTF-16");
            System.out.println(uff16Name);
            byte[] utf8 = name.getBytes("UTF-8");
            toHex(utf8);
            String uff8Name = new String(utf8, "UTF-8");
            System.out.println(uff8Name);

        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }

    public static void toHex(char[] b) {
        for (int i = 0; i < b.length; i++) {
            String hex = Integer.toHexString(b[i]);
            System.out.print(hex + " ");
        }
        System.out.println();
    }

    public static void toHex(byte[] b) {
        for (int i = 0; i < b.length; i++) {
            String hex = Integer.toHexString(b[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }

            System.out.print(hex + " ");
        }
        System.out.println();
    }
}
