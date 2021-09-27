package com.krt.epc.netty;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 */
public class SocketServer {
    public static void main(String[] args) throws IOException {
        int port = 3333;
        System.out.println("-----服务器启动------");

        ServerSocket server = new ServerSocket(port);
        Socket socket = server.accept();
        Reader reader = new InputStreamReader(socket.getInputStream());
        char chars[] = new char[1024];
        int len;
        StringBuilder stringBuilder = new StringBuilder();
        while ((len = reader.read(chars))!= -1){
            stringBuilder.append(new String(chars,0,len));
        }
        System.out.println("收到来自客户端的信息："+stringBuilder);
        reader.close();
        socket.close();
        server.close();
    }
}
