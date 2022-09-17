package loopsAndconds;

public class Q3DivFiveSeven {
    public static void main(String[]args){
        int num =0;
        for (int i=200;i<=300;i++){
            if (i%5==0 && i%7==0){
               num=i;
                System.out.println(num);
            }
        }

    }
}
