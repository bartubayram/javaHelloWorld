public class Main {
    public static void main(String[] args) {

     for(int i=0;i<10;i+=2){
         System.out.println(i);
     }
        System.out.println("------for loop is over--------");



        //while
        int i = 1;
        while (i<10){
            System.out.println("i: "+i);
            i+=2;
        }
        System.out.println("--while loop is over --");
   //do-while
        int j = 100;
        do{
            System.out.println(j);
            j+=2;
        }while(j<10);
        System.out.println("--do-while loop is over --");


    }
}