public class Education extends Resume {
    public Education() {
        System.out.println("         Education");
    }

    private String degreeType;
    private String major;
    private String universityName;
    private int gratuationYear;

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getGratuationYear() {
        return gratuationYear;
    }

    public void setGratuationYear(int gratuationYear) {
        this.gratuationYear = gratuationYear;
    }

    public String display() {
        return  "Education" + "\n" + degreeType + " in " + major + ", " + "\n"+ universityName + ", " + gratuationYear;
//        BS in Psychology,
//                University of Maryland, 2002

    }
}