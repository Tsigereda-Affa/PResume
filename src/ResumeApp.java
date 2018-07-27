import java.util.ArrayList;
import java.util.Scanner;

public class ResumeApp {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("          This is a resume application form");
        Resume r = new Resume();
        System.out.println("Enter your name");
        r.setFullName(sca.nextLine());
        System.out.println(r.getFullName());
        System.out.println("Enter your email");
        r.setEmail(sca.nextLine());
        System.out.println(r.getEmail());
        System.out.println(r.textDisplay());

        String userInput = "";
        String result = "";
        String resultEducation = "";
        String resultExperience = "";
        String resultDuty = "";
        while (!userInput.equals("quit")) {
            Education e = new Education();
            System.out.println("Enter your Degree Type");
            e.setDegreeType(sca.next());
            System.out.println(e.getDegreeType());
            System.out.println("Enter your Major");
            e.setMajor(sca.next());
            System.out.println(e.getMajor());
            System.out.println("Enter your University Name");
            e.setUniversityName(sca.next());
            System.out.println(e.getUniversityName());
            System.out.println("Enter your Gratuation Year");
            e.setGratuationYear(sca.nextInt());
            System.out.println(e.getGratuationYear());
            System.out.println("Add  or quit");
            userInput = sca.next();
            resultEducation += "\n" + e.getDegreeType() + "in" + e.getMajor() + "\n" + e.getUniversityName() + "," + e.getGratuationYear();

            System.out.println(resultEducation);
            System.out.println(e.display());
        }
//String resultExperience= "";
        while (!userInput.equals("end")) {
            Experience x = new Experience();
            System.out.println("Enter your Job title");
            x.setJobTitle(sca.next());
            System.out.println(x.getJobTitle());
            System.out.println("Enter the company name");
            x.setCompany(sca.next());
            System.out.println(x.getCompany());
            System.out.println("Enter starting date");
            x.setStartDate(sca.nextInt());
            System.out.println(x.getStartDate());
            System.out.println("Enter end date");
            x.setEndDate(sca.nextInt());
            System.out.println(x.getEndDate());
            //DCPS, August 2005 - May 2014
            //- Duty 1, The work experience description goes here
            //- Duty 2, The work experience description goes here
            System.out.println("Enter job description");
            x.setJobDescription(sca.next());
            System.out.println(x.getJobDescription());
//        ArrayList<String>  dutyList= new ArrayList<>();
//        //// ArrayList<String> () Duty 2= new ArrayList<>();
//        //x.getJobDescription().add(sca);
//      dutyList.add(x.getJobDescription());
//      dutyList.add(x.getJobDescription());
//        for (int i=0; i<dutyList.size();i++){
//            print(dutyList.get(i));
           // while (!userInput.equals("stop")) {
                //System.out.println("Enter job description");
//                x.setJobDescription(sca.next());
//                System.out.println(x.getJobDescription());
//                resultDuty += "\n" + x.getJobTitle();
//                System.out.println("Add or stop");
//                userInput = sca.next();
               System.out.println("Add or end");
               userInput = sca.next();
                resultExperience += "\n" + x.getJobTitle() + "\n" + x.getCompany() + "," + x.getStartDate() + "-" + x.getEndDate() + "\n" + "Duty " + x.getJobDescription();
                System.out.println(resultExperience);
                //      print(e.display());
//            Experience
//Software Developer II
//Amtrak, June 2015 - Present
//- Duty 1, The work experience description goes here
//- Duty 2, The work experience description goes here

                System.out.println(x.display());
                //resultExperience+= "\n" + x.getJobTitle() + "\n" + x.getCompany() + "\n" + x.getStartDate() + "," + x.getJobDescription() ;
                //   print(resultEducation);

            }
            while (!userInput.equals("quit")) {
                Skill s = new Skill();
                System.out.println("Enter your skill");
                s.setSkillName(sca.next());
                System.out.println(s.getSkillName());
                System.out.println("Enter your proficiency");
                s.setRating(sca.next());
                System.out.println(s.getRating());
                System.out.println("Add skill or quit ");
                userInput = sca.next();
                result += "\n" + s.getSkillName() + ", " + s.getRating();
                System.out.println(result);
                // print(s.display());
                //Skills
                //Java, Proficient
                //HTML/CSS, Proficient
                //SQL Database, Familiar

//    ArrayList<String> skill = new ArrayList<>();
                //skill.add("Feben");
                //names.add("Feben");
                //names.add("Feben");
                //        //Method #1 : Iterate using for loop
                //        System.out.println("Using for loop: ");
                //        for (int i = 0; i < names.size(); i++) {
                //            System.out.println(names.get(i));
                //        }

// final print
                System.out.println(r.textDisplay());
                System.out.println("    Education ");
                System.out.println(resultEducation);
                //print(e.display());
                System.out.println("     Experience");
                System.out.println(resultExperience);
                // print(x.display());
                System.out.println("     Skills");
                System.out.println(result);
            }
//            private static void print (String s){
//                System.out.println(s);
//            }
        }

    }
