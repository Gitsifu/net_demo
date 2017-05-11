package tcp_demo;

import java.net.Socket;
import java.util.Scanner;

/**
 * Created by sifu on 2017/3/27.
 */
//客服端
public class Client {
    public static void main(String[] args)throws Exception{
        //创建客户端对象，并指明连接服务端的主机和端口
        Socket client = new Socket("localhost",8888);
        //获取客服端的输入流对象
        Scanner sc = new Scanner(client.getInputStream());
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        client.close();
        sc.close();
    }
}
