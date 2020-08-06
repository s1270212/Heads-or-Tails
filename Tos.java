import java.util.Random;
public class Tos{
    public static void main(String[] args){
        Random rnd = new Random();
        int cnt0=0;
        int cnt1=0;
        int x;
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
}
