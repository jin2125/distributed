package encoder;

import java.io.*;

/**
 * @author gewei
 * @date 2019/5/9
 */
public class StreamEncoderDemo {
    public static void main(String[] args) throws IOException {
        String file = "test.txt";
//
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        OutputStreamWriter writer = new OutputStreamWriter(fileOutputStream);
//        try {
//            writer.write("这是要保存的中文字符");
//        } finally {
//            writer.close();
//        }

        // 读取字节转换成字符
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(fileInputStream);
        StringBuffer stringBuffer = new StringBuffer();
        char buf[] = new char[64];
        int count = 0;
        try {
            while ((count = reader.read(buf)) != -1) {
                stringBuffer.append(buf, 0, count);
            }
        } finally {
            reader.close();
            System.out.println(stringBuffer.toString());
        }


    }
}
