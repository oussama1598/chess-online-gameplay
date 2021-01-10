package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println("Waiting for connections");

            Socket ss = serverSocket.accept();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
