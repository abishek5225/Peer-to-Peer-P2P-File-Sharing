import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class FileReceiver {
    public static void receiveFile(String serverIP, int port , String saveAs) throws IOException {
        try{
            Socket socket=new Socket(serverIP, port);
        System.out.println("connected..");

        byte[] buffer=new byte[4096];
        InputStream inputStream=socket.getInputStream();
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(saveAs));

        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0 ,bytesRead);
        }
        bos.flush();
        bos.close();
        socket.close();

        System.out.println("File received successfully..");
        }catch(IOException ex){
            System.out.println("Exception occured"+ex.getMessage());
            ex.printStackTrace();
        }
    }
}
