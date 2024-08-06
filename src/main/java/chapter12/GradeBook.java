package chapter12;

import java.util.Map;

public class GradeBook {

    public static void main(String[] args) {
        Map<String, Integer> gradeBook = TestResults.getOriginalGrades();
        Map<String, Integer> reTest = TestResults.getSecondGrades();

        for (var student : reTest.entrySet()) {
            Integer firstGrade = gradeBook.get(student.getKey());
            Integer secondGrade = reTest.get(student.getKey());
            
            if (secondGrade > firstGrade) {
                gradeBook.put(student.getKey(), secondGrade);
            }
        }

    System.out.println("Final Grades:");
    gradeBook.forEach(
            (k,v) -> System.out.println("Student: " + k + ", Grade: " + v));
    }
}