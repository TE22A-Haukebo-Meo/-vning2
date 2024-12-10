import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] toys = {"Bil", "Dinosaurie", "Superman", "Lego", "Nerf"};
        String[] comrade = {"Tim", "Tea", "Jacob", "Aleksandra", "MandePOON"};
        Random rand = new Random();
        int[] nmbrs = new int[5];
        for (int i = 0; i < nmbrs.length; i++) {
            nmbrs[i] = rand.nextInt(1,10);
        }
        for (int i = 0; i < nmbrs.length; i++) {
            System.out.println(comrade[i]+" ger "+toys[i]+" betyget "+nmbrs[i]);
        }
        ArrayList<String> cities = new ArrayList<>();
        Boolean temp = true;
        Scanner tb = new Scanner(System.in);
        while (temp) {
            String adderall = tb.nextLine();
            if (adderall.equalsIgnoreCase("exit")) {
                temp=false;
            }
            cities.add(adderall);
        }
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }
    }
}
