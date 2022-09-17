package loopsAndconds;

public class HighestCommonF {
    public static void main(String[]args){
        int num1=120;
        int num2=160;
        int hcf=0;
        for(int i=1;i<=num1 && i<=num2;i++) {
            if (num1%i==0 && num2%i==0)
                hcf=i;
        }
       System.out.println("The highest common factorof 120 and 160 is"+ " "+ hcf);
    }
}
