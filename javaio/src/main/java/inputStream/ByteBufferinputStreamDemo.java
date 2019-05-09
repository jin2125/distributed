package inputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author gewei
 * @date 2019/5/5
 * 抽象基础类
 * InputStream
 * |
 * +--FileInputStream
 * |
 * +--ByteArrayInputStream
 * |
 * +--PipedInputStream
 * |
 * +--FilterInputStream
 * |
 * +--BufferedInputStream
 * |
 * +--PushbackInputStream
 * |
 * +--DataInputStream
 * |
 * +--ObjectInputStream
 */
public class ByteBufferinputStreamDemo {
    public static void main(String[] args) throws IOException {
        String srcFile = "test.txt";
        FileInputStream fin = new FileInputStream(srcFile);
        byte byteData;
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                srcFile));
        while ((byteData = (byte) bis.read()) != -1) {
            System.out.print((char) byteData);
        }
    }
}
