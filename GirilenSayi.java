import java.util.Scanner;
public class GirilenSayi {
    public static void main(String[] args) {

        // 4 ve 5 in derken sadece 20 yi mi yoksa ayrı ayrı 4 ve 5 i mi üssel değerlerini istediği
        // açık olmadığı için hem 4 ün hem 5 in hem de 20 nin üssel değerlerini yazdırdım.

        int number;
        Scanner input = new Scanner(System.in);

        System.out.print(" Sayı giriniz    ");
        number = input.nextInt();
        // kolaylık olsun diye Math.pow(double a,double b) yı kullandım ==> a ^ b olarak işlem yapıyor
        // çıkan değer de double olmasın istediğimden çıkan değeri casting yapıp (int) ile inte çevirdim.

        int i = 0;
        System.out.println( "4 ün kuvvetleri ");
        while ((Math.pow(4,i)) < number ){
            System.out.print( (int) Math.pow(4,i)+",");
            i++;
        }

        System.out.println("---------------");

        int j = 0;
        System.out.println( "5 in kuvvetleri ");
        while ((Math.pow(5,j)) < number ){
            System.out.print( (int) Math.pow(5,j)+",");
            j++;
        }

        System.out.println("---------------");

        int k = 0;
        System.out.println( "4 ve 5 in kuvvetleri ");
        while (Math.pow(20,k) < number ){
            System.out.print( (int) Math.pow(20,k)+",");
            k++;
        }
    }
}
