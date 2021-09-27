package com.krt.epc.netty;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        String host = "127.0.0.1";
        int port = 3333;
        System.out.println("------客户端启动------");

        Socket client = new Socket(host,port);
        Writer writer = new OutputStreamWriter(client.getOutputStream());
        Scanner in = new Scanner(System.in);
        writer.write(in.nextLine());
        writer.flush();
        writer.close();
        client.close();
        in.close();
    }

}
