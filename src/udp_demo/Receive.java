package udp_demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by sifu on 2017/3/27.
 */
//接收端
public class Receive {
    public static void main(String[] args) throws Exception {
        //创建接收端对象
        DatagramSocket receiver = new DatagramSocket(10010);
        byte[] buffer = new byte[1024];
        //接收数据
        DatagramPacket dp = new DatagramPacket(buffer, 1024);
        receiver.receive(dp);
        //获取接收的数据
        String msg = new String(dp.getData(), 0, dp.getLength());
        System.out.println("发送过来的数据：" + msg);
    }
}
