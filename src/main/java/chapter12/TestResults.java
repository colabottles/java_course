package chapter12;

import java.util.HashMap;
import java.util.Map;

public class TestResults {

    public static Map getOriginalGrades() {
        Map grades = new HashMap();
        grades.put("Angie", 41);
        grades.put("Mike", 72);
        grades.put("Lawrence", 90);
        grades.put("DaShaun", 84);
        grades.put("Jeremy", 31);
        grades.put("Cecelia", 24);
        grades.put("Kayla", 88);
        grades.put("Richard", 43);
        grades.put("Homer", 54);
        grades.put("Todd", 60);
        grades.put("Nerando", 18);

        return grades;
    }

    public static Map getSecondGrades() {
        Map grades = new HashMap();
        grades.put("Angie", 88);
        grades.put("Mike", 94);
        grades.put("Lawrence", 73);
        grades.put("DaShaun", 57);
        grades.put("Jeremy", 72);
        grades.put("Cecelia", 96);
        grades.put("Kayla", 61);
        grades.put("Richard", 83);
        grades.put("Homer", 84);
        grades.put("Todd", 81);
        grades.put("Nerando", 98);

        return grades;
    }
}

