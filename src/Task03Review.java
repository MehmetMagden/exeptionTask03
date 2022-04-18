import java.util.Random;

public class Task03Review {


    public static void main(String[] args) {


        Random rnd = new Random();

        int sayi1 = rnd.nextInt(10);
        int sayi2 = rnd.nextInt(10);
        System.out.println(sayi1+" " +sayi2);
        int toplam = sayi1 + sayi2;


        try {

            if (toplam < 12) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Sayi 12'den küçük ise hata verir");
        }


    }
}
