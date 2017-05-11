package tcp_demo;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by sifu on 2017/3/27.
 */
//服务端
public class Server {
    public static void main(String[] args)throws Exception {
        String data = "你吃饭了吗？";
        //创建服务端，指定端口为8888
        ServerSocket server = new ServerSocket(8888);
        System.out.println("服务端已经准备就绪。。。。");
        boolean accept = true;
        while (accept) {
            //接受链接该服务端的客户端对象
            Socket client = server.accept();
            System.out.println("连接过来的客服端：" + client.getInetAddress());
            //获取该客户端的输出对象，给该客户端输出数据
            PrintStream out = new PrintStream(client.getOutputStream());
            out.print(data);
            out.close();
        }
        server.close();
    }
}
