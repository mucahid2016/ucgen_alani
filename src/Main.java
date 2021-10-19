import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenler oluşturulur

        double a,b,c;


    //Scanner Sınıfı Tanımlanır
        Scanner input= new Scanner(System.in);

        //Kullanıcıdan veriler alınır
        System.out.println("1. Kenarı giriniz: ");
        a=input.nextDouble();

        System.out.println("2.Kenarı giriniz: ");
        b=input.nextDouble();

        c= Math.sqrt((a*a)+(b*b));
        System.out.println("3.Kenarın Uzunluğu: "+c);

        //Ucgenin Cevresi
        double u = (a+b+c)/2;
        double cevre = 2*u;

        //Üçgenin Alanı

        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Çevre: "+cevre);
        System.out.println("Alan: "+alan);

    }
}
