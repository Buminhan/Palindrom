import java.util.Scanner;
public class Palindrom {
    static boolean isPalindrom(int n){
        int num = n, tersayi = 0, sonsayi ;
        while(num!=0){
            sonsayi = num%10 ;
            tersayi =(tersayi*10)+sonsayi;
            num /=10;
        }
        if(tersayi==n){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        n = inp.nextInt();
        if(isPalindrom(n)==true){
            System.out.println(n+" sayısı palindromdur.");
        }
        else{
            System.out.println(n+" sayısı palindrom değildir.");
        }
    }
}
