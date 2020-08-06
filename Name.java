import java.util.Scanner;
public class Name{
    public static void main(String[] args){
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Who are you?");
        System.out.print("> ");
        name=sc.next();
        System.out.println("Hello, "+name+"!");
    }
}
