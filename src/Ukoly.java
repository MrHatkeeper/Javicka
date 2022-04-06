import java.util.*;

public class Ukoly {
    double avg(){
        Scanner sc = new Scanner(System.in);
        double output = 0;
        ArrayList<Double> nums = new ArrayList<>();
        while(true){
            System.out.println("Gib num pls. Kill it with end");
            String gibbedNum = sc.nextLine();
            if(!Objects.equals(gibbedNum, "end")){
                nums.add(Double.parseDouble(gibbedNum));
                output += Double.parseDouble(gibbedNum);
            }
            else{
                break;
            }
        }
        return (output / nums.toArray().length);
    }
    void kame(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int points = 0;
        String ai;
        while(points < 10){
            System.out.println("KOlo začíná");
            System.out.println("Na výběr máš: k,n,p");
            String input = sc.nextLine();
            switch(rand.nextInt(4)){
                case 0 -> ai = "k";
                case 1 -> ai = "n";
                default -> ai = "p";
            }
            if(ai.equals(input)){
                System.out.println("Remíza");
            }
            else if(ai.equals("k") && input.equals("p") || ai.equals("n") && input.equals("k") || ai.equals("p") && input.equals("k")){
                System.out.println("Vyhráváš. +1 bod");
                points++;
            }
            else{
                System.out.println("Prohráváš. -1 bod");
                points--;
            }
        }
    }
    void gallow(){
        Random r = new Random();
        Scanner sc = new Scanner(System.in)
        int lives = 5;
        String[] words = {"ahoj", "pepa", "sus", "amogus"};
        char[] word = words[r.nextInt(words.length)].toCharArray();
        ArrayList<String> chars = new ArrayList<>();
        while(lives > 0) {
            System.out.println("Hádáš. Máš " + lives + " životy.");
            System.out.println("Slovo je: ");
            String output = "";
            for (char c : word) {
                for (int j = 0; j < chars.toArray().length; j++) {
                    if (c == chars.get(j).toCharArray()[j]) {
                        output += chars;
                        break;
                    }
                }
                output += "*";
            }
            System.out.println("Zadej pismeno");
            chars.add(sc.nextLine());
            if(output){

            }
        }
    }
}
