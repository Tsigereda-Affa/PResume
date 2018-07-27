public class Experience extends Resume {
    public Experience() {
        System.out.println("         Exprince");
    }

    private String jobTitle;
    private String company;
    private int startDate;
    private int endDate;
    private String jobDescription;
    //for the jobDescription you can use array list

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String display() {
        return "Experince" + "\n" + jobTitle + " \n " + company + ", " + startDate + "- " + startDate + jobDescription;
//    Experience
//Software Developer II
//Amtrak, June 2015 - Present
//- Duty 1, The work experience description goes here
//- Duty 2, The work experience description goes here
    }
}