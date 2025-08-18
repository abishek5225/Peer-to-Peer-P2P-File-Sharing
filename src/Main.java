import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("P2P FILE Sharing tool");
        System.out.println("1. Send a file");
        System.out.println("2.Receive a file");
        System.out.println("Choose an option: ");
        int choice= input.nextInt();
        input.nextLine();

        try{
            if(choice ==1){
                System.out.println("Enter file path to send");
                String filepath=input.nextLine();

                System.out.println("Enter port to use(default 5000):");
                int port= input.nextInt();
                input.nextLine();
                FileSender.sendfile(filepath, port);
            }else if(choice==2){
                System.out.println("Enter Senders IP:");
                String ip=input.nextLine();

                System.out.println("Enter port");
                int port=input.nextInt();
                input.nextLine();
            }else{
                System.out.println("Invalid option");
            }

        }catch(Exception ex){
            System.out.println("Exception occured"+ex);
            
        }
        input.close();
    }
}