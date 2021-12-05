import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // Create an empty heroes list 
        // Add those heroes to the list

        Hero blackWidow = new Hero ("Black Widow", 34 );
        Hero captainAmerica =  new Hero ("Captain America", 100);
        Hero vision = new Hero ("Vision", 3);
        Hero ironMan = new Hero ("Iron Man", 48);
        Hero scarletWitch = new Hero ("Scarlet Witch", 29);
        Hero thor = new Hero ("Thor", 1500);
        Hero hulk = new Hero ("Hulk", 49);
        Hero doctorStrange = new Hero ("Doctor Strange", 42);

        ArrayList<Hero> hereos = new ArrayList<>();

        hereos.add(blackWidow);
        hereos.add(captainAmerica);
        hereos.add(vision);
        hereos.add(ironMan);
        hereos.add(scarletWitch);
        hereos.add(thor);
        hereos.add(hulk);
        hereos.add(doctorStrange);

        // It's Thor birthday, now he's 1501
       thor.setAge(1501);

        // Shuffle the heroes list
        Collections.shuffle(hereos);

        // Keep only the half of the list
        List<Hero> hereos2 = hereos.subList(0, 4);
        
        // Loop throught the list and display the name of the remaining heroes
        for (Hero hero : hereos2) {
            System.out.println(hero.getName());
        }
    
    }
}
