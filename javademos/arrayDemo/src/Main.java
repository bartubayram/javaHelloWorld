public class Main {
    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0]="bayram";
        ogrenciler[1]="bartu";
        ogrenciler[2]="kurnaz";

        for(int i =0;i< ogrenciler.length;i++){
            System.out.println(ogrenciler[i]+" ");
        }
        for(String ogrenci : ogrenciler){
            System.out.println(ogrenci);
        }


    }
}