package p01_JavaPractise;

import java.util.Arrays;

public class C02_MdArray {
    /*
     *  String 2D array olustur
     *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
     *  String de $ varsa 3.2 ile carp
     *  String de € varsa 4.2 ile carp
     *  elemanlarin toplamini double olarak yazdir
     */
    public static void main(String[] args) {

        String[][] arr = {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        double toplam = 0;

        for (int i = 0; i < 3; i++) {  // outer for loop
            for (int j = 0; j < 3; j++) {   // inner for

                if (arr[i][j].contains("$")) {// $ isareti iceriyorsa
                    toplam += Double.parseDouble(arr[i][j].replace("$", ""))*3.2;   // datacasting yaptim_ burda toplam varia. lazim simdi yukari yaziyorum
                    // parantez icindeki replaceAll ile $ isaretinden kurtulduk,sonra elimizde "12" string var
                    // Double variable i ile isleme katmak icin casting yapmak gerekir
                    // bu yuzden Double.parseDouble methodunu kullandik
                    // bu asamada 12 degeri --> data type i double oldu eklerken de 3.2 ile carpmamizi istedigi icin carptik


                }else {
                    toplam +=Double.parseDouble(arr[i][j].replace("€",""))*4.2;
                }

            }
            System.out.println(Arrays.toString(arr));
            System.out.println("toplam="+toplam);


        }



    }



}
