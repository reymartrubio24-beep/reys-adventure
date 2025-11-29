//arryay of names and ages, display the list of people with their ages,
public class Day11 {

    public static void main(String[] args) {
        
        String[] names = {"Rey", "Mark", "Ark" , "Darb", "Ricky", "Jordan", "Lebron ", "Kobe", "Shaq", "Curry"};
        int[] ages = {18, 19, 19, 21, 22, 20, 24, 22, 26, 20};


        System.out.println("=== PEOPLE LIST ===");
        for(int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i] + "  " + ages[i] + " years old");
        }

        int totalAge = 0;
        for(int age : ages) {
            totalAge += age;

        }
        
        double avarageAge =  (double) totalAge / ages.length;
        
        System.out.println("=== STATISTICS ===");
        System.out.println("Avarage age: " + avarageAge + "years");

        int  maxAge = ages[0];
        String oldPerson = names[0];

        for(int i = 1; i < ages.length; i++) {
            if (ages[i] > maxAge) {
                maxAge = ages[i];
                oldPerson = names[i];
            }
        }
        
        System.out.println("Oldest person: " + oldPerson + " (" + maxAge + " years old)");
        
        int minAge = ages[0];
        String youngPerson = names[0];

        for(int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngPerson = names[i];
            }
        }
    
        System.out.println("Yougest Person: " + youngPerson + " (" + minAge + " years old)");

    }
}