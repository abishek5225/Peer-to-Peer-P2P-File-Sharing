import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class FileReceiver {
    public static void main(String serverIP, int port , String saveAs) throws IOException {
        Socket socket=new Socket(serverIP, port);
        System.out.println("connected..");

        byte[] buffer=new byte[4096];
        InputStream inputStream=socket.getInputStream();
        
    }
}
