public class TryCatchFinally {

    public static void main(String[] args) {

        /*
        int [] sayilar = new int[]{1,2,3,};
        System.out.println(sayilar[5]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        index disi hatasi alırız
         */

        try {
            int [] sayilar = new int[]{1,2,3,};
            System.out.println(sayilar[5]);
        }catch (IndexOutOfBoundsException exception){
            System.out.println(exception);
        }finally {
            System.out.println("ben her turlu calisirim");
        }

        /*
        try = deneyin
        catch = tut
        finally = nihayet

       try-catch yazmis oldugumuz kod bloklarinda hatalarin onune gecen bir yapidir.
       hatanin onune gecmek hatanin onlenmesi degil, ilgili programin son kullaniciya
       hata vererek sonlanmasinin onune gecmeyi saglayan bir yapidir.
       kullaniciya hata mesaji vererek kullanicinin hatasinin ne oldugunu bildirmektir.

       try bolumunde kodlarımız yer alir, kodda hata yoksa bu blok calisir
       hata var ise catch'e duser catch calisir.

       catch bolumunde ise hatanin kullaniciya verdigimiz mesaj yer alir.

       finally blogu her turlu calisir. ister try calissin ister catch calissin bu blok her turlu calisir.
       ornegin veri tabanina baglandik datayi cekme esnasinde hata olsustu diyelin o veri tabanini
       kapatmamiz gerekir. finally icinde hata olsa da olmasa da kapatabiliriz.
         */

    }
}


