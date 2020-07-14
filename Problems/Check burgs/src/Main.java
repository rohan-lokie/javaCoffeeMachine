import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        city=city.toLowerCase();
        int n = city.length();
        if(n<4)
        {
            System.out.println("false");
        }
        else if(city.substring(n - 4, n).equals("burg")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}