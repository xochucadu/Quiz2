package oop.q3;

import java.util.ArrayList;
import java.util.List;

/**
 * The University class manages a list of students and provides access to special student information.
 * <p>
 * Methods include adding/removing students, printing student data,
 * and a "getStudentInfoStrange" method with conditional behavior.
 * <ul>
 *     <li>If the argument is the current user and they are enrolled, return current semester course list.</li>
 *     <li>If the argument is the current user and they are NOT enrolled, return personal number.</li>
 *     <li>If the argument is another known student, return their info field.</li>
 *     <li>Return null if the student is unknown.</li>
 * </ul>
 *
 * This class uses hardcoded personal data from Argus and assumes
 * course titles are stored locally in a predefined list.
 *
 * Author: Bezhanovi Nikita
 * Date: 2025-05-15
 */

public class University {
    private List<Student> students = new ArrayList<>();
    private final Student myself = new Student("Nikita", "Bezhanovi", "Georgia", "CS student");
    private final String personalNumber = "01717066360";  // Your personal number from Argus
    private final List<String> currentCourses = List.of("Computer Organization", "OOP", "Data Structures, English");  // Example courses from Argus

    public void addStudent(Student s) {
        if (!students.contains(s)) {
            students.add(s);
        }
    }

    public boolean removeStudent(Student s) {
        return students.remove(s);
    }

    public void printStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public String getStudentInfoStrange(Student s) {
        boolean isMyself = s.equals(myself);
        boolean contains = students.contains(s);

        if (isMyself) {
            if (contains) {
                return String.join(", ", currentCourses);
            } else {
                return personalNumber;
            }
        } else {
            if (contains) {
                return s.info;
            } else {
                return null;
            }
        }
    }
}
