import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {

    public static void main(String args []){

        ArrayList<String> AL1 = new ArrayList<>();
        ArrayList<String> AL2 = new ArrayList<>();
        ArrayList<String> AL4 = new ArrayList<>();

        AL1.add("Joey");
        AL1.add("Katie");
        AL1.add("Pete");
        AL1.add("Beck");
        AL1.add("Kylo");

        AL2.add("Kim");
        AL2.add("Russ");
        AL2.add("Bryce");
        AL2.add("Marley");
        AL2.add("Riggs");

        System.out.println("AL1: " + AL1);

        //adding AL2 into AL1 at index 1
        AL1.addAll(1, AL2);
        System.out.println("New AL1: " + AL1);

        AL1.remove(1);
        System.out.println("Modified AL1: " + AL1);

        List<String> AL3 = AL1.subList(3, 4);
        System.out.println("From Index 3: " + AL3);

        AL1.set(0, "Charlie");
        System.out.println("Newest AL1: " + AL1);

        AL4.add("Programming");
        AL4.add("Isn't");
        AL4.add("For");
        AL4.add("Everyone");
        for (String str : AL4) {
            System.out.print(str + " ");
        }


        //reverse an ArrayList
        Collections.reverse(AL1);
        System.out.println("\nResults after reverse: ");
        for (String str : AL1){
            System.out.println(str);
        }




    }
}
