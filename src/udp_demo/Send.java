package udp_demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by sifu on 2017/3/27.
 */
//发送端
public class Send {
    public static void main(String[] args) throws Exception {
        String data = "你是我天边最美的云彩";
        //创建发送端对象
        DatagramSocket sender = new DatagramSocket(10086);
        //发送数据
        DatagramPacket dp = new DatagramPacket(data.getBytes(),//发送的数据
                data.getBytes().length, //发送数据的长度（字节数）
                InetAddress.getLocalHost(),//发送给哪个IP
                10010);//发送给哪一个端口程序
        sender.send(dp);
        sender.close();
    }
}
