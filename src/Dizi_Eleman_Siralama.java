import java.util.Arrays;
import java.util.Scanner;

public class Dizi_Eleman_Siralama {
      public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int length=inp.nextInt();

        int[] arr=new int[length];
        for (int i=0; i<arr.length; i++){
            System.out.print("Dizinin" +" "+ (i+1) + "'nci elemanını giriniz: ");
            arr[i]=inp.nextInt();
        }
        Arrays.sort(arr);
        String result = Arrays.toString(arr);
        System.out.print("Büyükten küçüğe sıralanmış dizi: "+result);
    }


}