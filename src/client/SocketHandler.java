package client;

import java.io.IOException;
import java.net.Socket;

public class SocketHandler
        implements Runnable {

    private Socket socket;

    public void run() {
        try {
            this.socket = new Socket("localhost", 8000);

            System.out.println("Connected");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
