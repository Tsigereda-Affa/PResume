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
String userInput ="";
String result="";
//while (!userInput.equals("quit education")) {
    Education e = new Education();
    print("Enter your Degree Type");
    e.setDegreeType(sca.next());
    print(e.getDegreeType());
    print("Enter your Major");
    e.setMajor(sca.next());
    print(e.getMajor());
    print("Enter your University Name");
    e.setUniversityName(sca.next());
    print(e.getUniversityName());
    print("Enter your Gratuation Year");
    e.setGratuationYear(sca.nextInt());
    System.out.println(e.getGratuationYear());
//    print("Add Education or quit educatio");
//    userInput = sca.next();
   // resultEducation += "\n" + e.getDegreeType() + "\n" + e.getMajor() + "\n" + e.getUniversityName() + "," + e.getGratuationYear();
   // print(resultEducation);
      print(e.display());
//}
//String resultExperience= "";
//while (!userInput.equals("quit Experience")) {
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
    //DCPS, August 2005 - May 2014
        //- Duty 1, The work experience description goes here
        //- Duty 2, The work experience description goes here
    print("Enter job description");
    x.setJobDescription(sca.next());
    print(x.getJobDescription());
       // ArrayList<String> () Duty 1= new ArrayList<>();
        //// ArrayList<String> () Duty 2= new ArrayList<>();
        //x.getJobDescription().add(sca);
//         Duty 1.add(x.getJobDescription());
        //Duty 2.add(sca.next());
        //for (int i=0; i<nameList.size();i++){}

     print(x.display());
    //resultExperience+= "\n" + x.getJobTitle() + "\n" + x.getCompany() + "\n" + x.getStartDate() + "," + x.getJobDescription() ;
 //   print(resultEducation);
//}

while (!userInput.contains("quit")) {
    Skill s = new Skill();
    print("Enter your skill");
    s.setSkillName(sca.next());
    print(s.getSkillName());
    print("Enter your proficiency");
    s.setRating(sca.next());
    print(s.getRating());
    print("Add skill or quit ");
    userInput = sca.next();
    result += "\n" + s.getSkillName() + ", " + s.getRating() ;
     print(result);
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
}
// final print
        print(r.textDisplay());
        print(e.display());
        print(x.display());
        print("Skill");
        print(result);
    }
    private static void print(String s) {
        System.out.println(s);
    }
}
