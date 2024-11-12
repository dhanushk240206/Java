package CIE;

public class Student {
    public String usn;
    public String name;
    public int sem;

    public Student(String usn, String name, int sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }
}




package CIE;

public class Internals {
    private int[] internalMarks = new int[5];

    public Internals(int[] marks) {
        if (marks.length == 5) {
            System.arraycopy(marks, 0, internalMarks, 0, 5);
        } else {
            throw new IllegalArgumentException("Internal marks array must have exactly 5 elements.");
        }
    }

    public int[] getInternalMarks() {
        return internalMarks;
    }
}



package SEE;

import CIE.Student;

public class External extends Student {
    private int[] seeMarks = new int[5];

    public External(String usn, String name, int sem, int[] marks) {
        super(usn, name, sem);
        if (marks.length == 5) {
            System.arraycopy(marks, 0, seeMarks, 0, 5);
        } else {
            throw new IllegalArgumentException("SEE marks array must have exactly 5 elements.");
        }
    }

    public int[] getSeeMarks() {
        return seeMarks;
    }
}




import CIE.Internals;
import SEE.External;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();  

        External[] students = new External[n];
        Internals[] internalsArray = new Internals[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter USN: ");
            String usn = scanner.nextLine();
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter semester: ");
            int sem = scanner.nextInt();

            System.out.println("Enter internal marks for 5 subjects:");
            int[] internalMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                internalMarks[j] = scanner.nextInt();
            }
            internalsArray[i] = new Internals(internalMarks);

            System.out.println("Enter SEE marks for 5 subjects:");
            int[] seeMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                seeMarks[j] = scanner.nextInt();
            }
            scanner.nextLine();  
            students[i] = new External(usn, name, sem, seeMarks);
        }

        System.out.println("\nFinal marks for each student:");
        for (int i = 0; i < n; i++) {
            System.out.println("USN: " + students[i].usn + ", Name: " + students[i].name + ", Semester: " + students[i].sem);
            int[] finalMarks = calculateFinalMarks(internalsArray[i].getInternalMarks(), students[i].getSeeMarks());
            System.out.print("Final Marks in 5 subjects: ");
            for (int mark : finalMarks) {
                System.out.print(mark + " ");
            }
            System.out.println();
        }
    }

    public static int[] calculateFinalMarks(int[] internalMarks, int[] seeMarks) {
        int[] finalMarks = new int[5];
        for (int i = 0; i < 5; i++) {
            finalMarks[i] = internalMarks[i] + (seeMarks[i] / 2);  
        }
        return finalMarks;
    }
}
