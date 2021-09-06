package substitutionbasic;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitution {

    /**
     * Makes a new list of three students, including a Coursework student, a
     * ResearchStudent, and a ExchangeStudent, in this exact order.
     * Returns the resulting list of three students.
     * @return list of three different student types
     */
    public static ArrayList<Student> makeStudentList() {
        ArrayList<Student> list = new ArrayList<Student>();
        CourseworkStudent a = new CourseworkStudent();
        ResearchStudent b = new ResearchStudent();
        ExchangeStudent c = new ExchangeStudent();
        list.add(a);
        list.add(b);
        list.add(c);
        return list;
    }
}
