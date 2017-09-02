package ThirtyDaysOfCoding.Day4;

import java.util.Scanner;

/**
 * Created by khirul
 * on 7/21/2017.
 */
public class Person {
    private int age;

    public Person(int initialAge) {
        // Add some more code to run some checks on initialAge
        if(initialAge<0){
            System.out.println("Age is not valid, setting age to 0.");
            this.age=0;
        }else{
            this.age=initialAge;
        }
    }

    public void amIOld() {
        String message=new String();
        // Write code determining if this person's age is old and print the correct statement:
        if(this.age<13){
            message="You are young.";
        }else if(this.age>=13 && this.age<18){
            message="You are a teenager.";
        }else{
            message="You are old.";
        }

        System.out.println(message);
    }

    public void yearPasses() {
        // Increment this person's age.
        this.age ++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
