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

        }catch(Exception ex){
            System.out.println("Exception occured"+ex);
            
        }
    }
}