package P02_JavaPractise;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Arrays {

    public static void main(String[] args) {
         /*

   kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan bir method create ediniz.
*/
        farkiniBul();


    }

    private static void farkiniBul() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Array'in uzunlugunu giriniz : ");
        int uzunluk = scanner.nextInt();
        int arr[] = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("array'in " + (i + 1) + ". elemanini giriniz :"); //
            arr[i] = scanner.nextInt();  //fori den gelen indexler , bu satirda kullanici tarafindan dongu bitene kadar girilen elemanlar okunur

        }

        Arrays.sort(arr);
        System.out.println("Array'deki en buyuk eleman ile en kıcuk eleman arasindaki fark : " + (arr[uzunluk - 1] - arr[0]));

    }


    }
