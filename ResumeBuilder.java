import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class ResumeBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("----- Resume Builder -----");

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = sc.nextLine();

        System.out.print("Enter your education details: ");
        String education = sc.nextLine();

        System.out.print("Enter your skills (comma-separated): ");
        String skills = sc.nextLine();

        System.out.print("Enter your projects or experience: ");
        String projects = sc.nextLine();

        // Formatting resume content
        String resume = "------------------------------\n";
        resume += "           RESUME\n";
        resume += "------------------------------\n";
        resume += "Name: " + name + "\n";
        resume += "Email: " + email + "\n";
        resume += "Phone: " + phone + "\n\n";
        resume += "Education:\n" + education + "\n\n";
        resume += "Skills:\n" + skills + "\n\n";
        resume += "Projects/Experience:\n" + projects + "\n";
        resume += "------------------------------\n";

        // Writing to file
        try {
            FileWriter writer = new FileWriter("My_Resume.txt");
            writer.write(resume);
            writer.close();
            System.out.println("✅ Resume created successfully as 'My_Resume.txt'");
        } catch (IOException e) {
            System.out.println("❌ An error occurred while writing the file.");
            e.printStackTrace();
        }

        sc.close();
    }
}

