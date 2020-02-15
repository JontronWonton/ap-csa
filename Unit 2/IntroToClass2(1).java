// Jonathan Klein
// 9/20/19
// IntroToClass2.java

public class IntroToClass2 {

    private static String line(){
        return "============================================================";
    }

    public static void main(String[] args) {
        int integer = 9;
        double dub = 3.5;

        System.out.println(Math.pow(integer, 2));
        System.out.println(Math.pow(dub, 2));

        System.out.println(line());

        System.out.println(Math.sqrt(integer));
        System.out.println(Math.sqrt(dub));

        System.out.println(line());

        System.out.println(Math.abs(integer-dub));
        System.out.println(Math.abs(dub-integer));

        System.out.println(line());

        System.out.println((int)(Math.random()*25)+10);

        System.out.println(line());

        System.out.println(Math.exp(integer));;
        System.out.println(Math.round(dub));
        System.out.println(Math.cbrt(integer));
    }
}