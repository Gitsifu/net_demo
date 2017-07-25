package demo;

/**
 * 快速发送大量Http请求（get/post）
 * Created by sifu on 2017/7/24
 *
 * @author sifu
 * @version 1.0.0
 */

public class Demo {
    public static void main(String[] args) {
        String result;//服务器返回的信息
        String url = "http://www.xxx.com/user";//url链接
        String param = "phone=";//参数: key1=value1&key2=value2
        String phoneList = "11111111,2222222";//电话号码组
        String[] phone = phoneList.split(",");//分割电话号码
        for (int i = 0; i < phone.length; i++) {
            result = HttpRequest.sendPost("", param + phone[i]);
            System.out.println(result);
        }

    }
}
