package oop.q3;

/**
 * Main class to test Student and University functionalities.
 */
public class Main {
    public static void main(String[] args) {
        University uni = new University();

        Student me = new Student("Nikita", "Bezhanovi", "Georgia", "Hardworking CS student");
        Student friend = new Student("John", "Doe", "USA", "Basketball fan");

        uni.addStudent(me);
        uni.addStudent(friend);

        System.out.println("Current Students:");
        uni.printStudents();

        System.out.println("\nInfo if I’m in university:");
        System.out.println(uni.getStudentInfoStrange(me)); // should print course list

        uni.removeStudent(me);

        System.out.println("\nInfo if I’m NOT in university:");
        System.out.println(uni.getStudentInfoStrange(me)); // should print Argus number

        System.out.println("\nFriend's info:");
        System.out.println(uni.getStudentInfoStrange(friend)); // should print friend's info

        System.out.println("\nUnknown student:");
        Student stranger = new Student("Jane", "Smith", "UK", "Unknown");
        System.out.println(uni.getStudentInfoStrange(stranger)); // should return null
    }
}
