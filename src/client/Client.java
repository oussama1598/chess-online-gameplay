package client;

public class Client {
    public Client() {
        SocketHandler socket = new SocketHandler();

        Thread t = new Thread(socket);
        t.start();
    }
}
