import java.util.Scanner;
import java.util.Random;
public class Ex4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Who are you?");
        System.out.print("> ");
        name=sc.next();
        System.out.println("Hello, "+name+"!");
        Tossing tos=new Tossing(name);
        tos.TOS();
        tos.print();
    }
}

class Tossing{
    private String name;
    private int cnt0=0;
    private int cnt1=0;
    Random rnd = new Random();
    private int x;
    Tossing(String name){
        this.name=name;
    }
    public void TOS(){
        System.out.println("Tossing a coin...");
        for(int i=1;i<4;i++){
            x=rnd.nextInt(2);
            if(x==0){
                System.out.println("Round "+i+": Heads");
                cnt0++;
            }else if(x==1){
                System.out.println("Round "+i+": Tails");
                cnt1++;
            }
        }
        System.out.println("Heads: "+cnt0+", Tails: "+cnt1);
    }
    public void print(){
        if(cnt0>cnt1){
            System.out.println(name+" won!");
        }else System.out.println(name+" lost!");
    }
}
