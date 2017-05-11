package encoding_demo;

import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;


/**
 * Created by sifu on 2017/3/27.
 */
public class EncodingDemo {
    public static void main(String[] args)throws Exception{
        //获取平台的默认的字符集
        System.out.println(System.getProperty("file.encoding"));
        String name = "四福 master  19";
        //使用UTF-8编码
        String ret = URLEncoder.encode(name,"UTF-8");
        System.out.println(ret);
        //使用UTF-8解码
        String msg = URLDecoder.decode(ret,"UTF-8");
        System.out.println(msg);
    }
}
