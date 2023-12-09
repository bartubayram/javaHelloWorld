public class Main {
    public static void main(String[] args) {
        int s = 1;
        boolean isPrime=true;
        if(s<1){
            System.out.println("gecersiz sayi");
        }
        if(s==1){
            System.out.println("asal degildir");
            return;
        }


        for(int i =2;i<s;i++){
            if(s % i==0){
                isPrime=false;
            }

        }
        if(isPrime==true){
            System.out.println("asal");
        }
        else{
            System.out.println("asal degil");
        }



    }
}