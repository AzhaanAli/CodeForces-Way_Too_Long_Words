import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        for(int i = 0; i < n; i++)
            System.out.println(abbreviate(s.nextLine()));

    }

    public static String abbreviate(String s){

        if(s.length() > 10)
            return "" + s.charAt(0) + (s.length() - 2) + s.charAt(s.length() - 1);
        else
            return s;

    }

}