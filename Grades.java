import java.util.*;

public class Grades {
    public static void main(String[] args) {

        Map<String, Double> students = new HashMap<>();

        students.put("Salvi", 3.8);
        students.put("Nigar", 2.5);
        students.put("Aydan", 3.4);
        students.put("Ali", 3.2);
        students.put("Murad", 2.9);

        double max = Collections.max(students.values());

        System.out.println("Highest GPA students:");
        for (Map.Entry<String, Double> e : students.entrySet()) {
            if (e.getValue() == max) {
                System.out.println(e.getKey() + " -> " + e.getValue());
            }
        }

        double sum = 0;
        for (double gpa : students.values()) {
            sum += gpa;
        }
        double avg = sum / students.size();
        System.out.println("Average GPA: " + avg);

        int count = 0;
        for (double gpa : students.values()) {
            if (gpa < avg) count++;
        }

        System.out.println("Students below average: " + count);
    }
}