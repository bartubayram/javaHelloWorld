public class Main {
    public static void main(String[] args) {
        int n1=220;
        int n2=284;
        int t1=0;
        int t2=0;
        for(int i =1;i<n1;i++){
            if(n1 % i==0){
                t1+=i;
            }
        }
        for(int i =1;i<n1;i++){
            if(n2 % i==0){
                t2+=i;
            }
        }
        if(t1==n2 && t2==n1){
            System.out.println("arkadas sayilardir");
        }
        else{
            System.out.println("arkadas sayi degil");
        }

    }
}