import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        double km;

        System.out.println("Kaç km gidildi? : ");
        km = girdi.nextDouble();

        double tutar = km * 2.20;

        if (tutar < 20){
            tutar = 20;
        }else{
            tutar = (km * 2.20) + 10;
        }
        System.out.println(tutar);







    }
}
