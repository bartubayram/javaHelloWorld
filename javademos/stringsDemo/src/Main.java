public class Main {
    public static void main(String[] args) {
        String mesaj = "      meSaj meSaj meSaj meSaj        "  ;
        System.out.println(mesaj);

/*        System.out.println("Eleman:" + mesaj.length());
        System.out.println("5.eleman:" + mesaj.charAt(4));
        System.out.println(mesaj.concat("..eklendi.."));
        System.out.println(mesaj.startsWith("B"));
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("aj"));*/
        System.out.println(mesaj.replace(' ', '-'));
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2, 4));
        for (String kelime : mesaj.split("m")) {
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj);
        System.out.println(mesaj.trim());
    }
}