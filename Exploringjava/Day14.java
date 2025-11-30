//student grade system
public class Day14 {
    public static void main(String[] args) {
        String[] students = {"Marko", "Darb", "Ricky", ""};
        double[] grades = {85.5, 90.0, 78.5, 88.0};

        System.out.println("=== STUDENT GRADES ===");
        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i] + ": " + grades[i]);      
        }

        double highest = grades[0];
        String topStudent = students[0];

        for (int i = 1; i < grades.length; i++) {
            if(grades[1] > highest) {
                highest = grades[i];
                topStudent = students[i];
            }
        }

        System.out.println("Top Student: " + topStudent + " with" + " "+  highest);
        

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }

        double avarage = sum / grades.length;
        System.out.println("Avarage: " + avarage);

    }   
}
