import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int numbers= scanner.nextInt();
        if(numbers % 2==0){
            System.out.println("given numbers"+numbers+"is even.");
        }else{
            System.out.println("given numbers"+numbers+"is odd.");
        }
        scanner.close();
    }
}
