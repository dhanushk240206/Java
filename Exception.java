class WrongException extends Exception {
    public WrongException(String message) {
        super(message);
    }
}

class Father {
    int age;

    public Father(int age) throws WrongException {
        if (age < 0) {
            throw new WrongException("Father's age cannot be negative");
        }
        this.age = age;
    }
}


class Son extends Father {
    int sonage;

 
    public Son(int fatherAge, int sonAge) throws WrongException {
        super(fatherAge); 
        if (sonAge < 0) {
            throw new WrongException("Son's age cannot be negative");
        }
        if (sonAge >= fatherAge) {
            throw new WrongException("Son's age cannot be greater than or equal to the father's age");
        }
        this.sonage = sonAge;
    }
}


public class Main {
    public static void main(String args[]) {
        System.out.println("Exception Handling Example:");

        try {
            Father father = new Father(40);
            Son son = new Son(40, 20);
            System.out.println("Father's age: " + father.age + ", Son's age: " + son.sonage);
            Son invalidSon = new Son(30, 35);

        } catch (WrongException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Invalid input: Father's age is negative
            Father invalidFather = new Father(-5);
        } catch (WrongException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
