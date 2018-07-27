import java.util.Scanner;

public class ResumeApp {
    public static void main(String[] args){
        Scanner sca= new Scanner(System.in);
        System.out.println("          This is a resume application form");
        Resume r= new Resume();
        print("Enter your name");
       r.setFullName(sca.nextLine());
       print(r.getFullName());
        print("Enter your email");
        r.setEmail(sca.nextLine());
        print(r.getEmail());
       print(r.textDisplay());


        Education e = new Education();
        print("Enter your Degree Type");
        e.setDegreeType(sca.nextLine());
        print(e.getDegreeType());
        print("Enter your Major");
        e.setMajor(sca.nextLine());
        print(e.getMajor());
        print("Enter your UniversityName");
        e.setUniversityName(sca.nextLine());
        print(e.getUniversityName());
        print("Enter your Gratuation Year");
        e.setGratuationYear(sca.nextInt());
        System.out.println(e.getGratuationYear());
        print(e.display());


        Experience x = new Experience();
        print("Enter your Job title");
        x.setJobTitle(sca.next());
        print(x.getJobTitle());
        print("Enter the company name");
        x.setCompany(sca.next());
        print(x.getCompany());
        print("Enter starting date");
        x.setStartDate(sca.nextInt());
       System.out.println(x.getStartDate());
        print("Enter end date");
        x.setEndDate(sca.nextInt());
        System.out.println(x.getEndDate());
        // need to multiplay this
        // Duty 1, The work experience description goes here
        //Duty 2, The work experience description goes here
        print("Enter job description");
        x.setJobDescription(sca.next());
        print(x.getJobDescription());
       print(x.display());



        Skill s = new Skill();
        print("Enter your skill");
        s.setSkillName(sca.next());
        print(s.getSkillName());
        print("Enter your proficiency");
        s.setRating(sca.next());
        print(s.getRating());
        print(s.display());


    }
    private static void print(String s) {
        System.out.println(s);
    }
}
