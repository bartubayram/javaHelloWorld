public class Main {
    public static void main(String[] args) {
    int n = 5;
    int t =0;
    for(int i = 1;i<n;i++){
        if(n%i==0){
            t+=i;
        }
    }
    if(t==n){
        System.out.println("mukkemmel sayi");
    }
    else {
        System.out.println("mukkemmel sayi degil");
    }

    }
}