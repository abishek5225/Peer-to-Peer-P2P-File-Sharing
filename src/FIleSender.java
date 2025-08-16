import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FIleSender {
    public static void main(String[] args) throws IOException {
        int port=5000;
        String filepath= "test.txt";

        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Waiting for connection on port "+port);

        Socket socket=serverSocket.accept();
        System.out.println("Connected to"+socket.getInetAddress().getHostAddress());

        File file=new File(filepath);
        byte[] buffer=new byte[5000];

        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
        

    }
}
