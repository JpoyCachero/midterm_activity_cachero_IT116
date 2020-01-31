package human;

public class Human {
    private final String skin_color = "Skin Color:white";
    private final String eye_color = "Eye Color: blue";
    private final String gender = "Gender: boy";
    private final int height=  250; 
    private final int weight = 95;
    private final int age = 21;
    private final String race = "Race:Jordanian";
    private final String name = "Name:BloodSeeker";
    
    public static void main(String[] args) {
        
        Human h = new Human ();
        Children c = new Children();
        
        System.out.println(h.skin_color);
        System.out.println(h.eye_color);
        System.out.println(h.gender);
        System.out.println(h.height);
        System.out.println(h.weight);
        System.out.println(h.age);
        System.out.println(h.race);
        System.out.println(h.name);
        System.out.println(c.intellegience_rating);
        System.out.println(c.mood_rating);
        System.out.println(c.genetic_disease[0]);
        System.out.println(c.wealth_rating);
    }
    
}