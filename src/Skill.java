public class Skill extends Resume{
    public Skill() {
        System.out.println("         Skill");
    }
    private String skillName;
    private String rating;

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    public String display() {
        return  "Skills" + "\n" + skillName + ", " + rating;
//  Java, Proficient
//HTML/CSS, Proficient
//SQL Database, Familiar
    }
}

