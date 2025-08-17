import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileSender {
    public static void sendfile(String filepath, int port) throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Waiting for connection on port "+port);

        Socket socket=serverSocket.accept();
        System.out.println("Connected to"+socket.getInetAddress().getHostAddress());

        File file=new File(filepath);
        byte[] buffer=new byte[4096];

        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
        OutputStream os=socket.getOutputStream();

        int bytesRead;
        while ((bytesRead= bis.read(buffer)) != -1) {
            os.write(buffer,0,bytesRead);
        }
        os.flush();
        bis.close();
        socket.close();
        serverSocket.close();

        System.out.println("sent successfully!");

    }
}
