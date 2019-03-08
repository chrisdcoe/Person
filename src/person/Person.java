
package person;

import static person.HairColor.*;


public class Person {

    HairColor hairColor = WHITE;
    
    public Person () {
        
    }
    
    public static void main(String[] args) {
        Person peterParker = new Person();
        Person spiderMan = peterParker;
        
        peterParker.hairColor = BLACK;
        
        System.out.println("Hair Color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair color of Spider Man: " + spiderMan.hairColor);
        
        spiderMan.hairColor = PINK;
        
        System.out.println("Hair Color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair color of Spider Man: " + spiderMan.hairColor);
    }
    
}
