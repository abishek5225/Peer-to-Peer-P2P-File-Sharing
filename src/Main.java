import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("P2P FILE Sharing tool");
        System.out.println("1. Send a file");
        System.out.println("2. Receive a file");
        System.out.print("Choose an option: ");
        int choice = input.nextInt();
        input.nextLine(); // consume newline

        try {
            if (choice == 1) {
                // Sender
                System.out.print("Enter file path to send: ");
                String filepath = input.nextLine();

                System.out.print("Enter port to use (default 5000): ");
                int port = input.nextInt();
                input.nextLine();

                FileSender.sendfile(filepath, port);

            } else if (choice == 2) {
                //Receiver
                System.out.print("Enter Sender's IP: ");
                String ip = input.nextLine();

                System.out.print("Enter port: ");
                int port = input.nextInt();
                input.nextLine();

                System.out.print("Save file as (e.g. received.txt): ");
                String saveAs = input.nextLine();

                FileReceiver.receiveFile(ip, port, saveAs);

            } else {
                System.out.println("Invalid option");
            }

        } catch (Exception ex) {
            System.out.println(" Exception occurred: " + ex.getMessage());
            ex.printStackTrace();
        }

        input.close();
    }
}
