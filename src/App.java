import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        String[] toys = {"Bil", "Dinosaurie", "Superman", "Lego", "Nerf"};
        for (String string : toys) {
            System.out.println(string);
        }
        String[] comrade = {"Tim", "Tea", "Jacob", "Aleksandra", "MandePOON"};
        Random rand = new Random();
        int[] nmbrs = new int[5];
        for (int i = 0; i < nmbrs.length; i++) {
            nmbrs[i] = rand.nextInt(1,10);
        }
    }
}
