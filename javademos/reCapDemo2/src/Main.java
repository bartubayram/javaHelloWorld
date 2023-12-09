public class Main {
    public static void main(String[] args) {

        double[] myList = {1.3, 6.2, 1.4, 1.90};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }

            total += number;
            System.out.println(total);

        }
        System.out.println("max sayi: " + max);
        System.out.println("Total: " + total);


    }
}