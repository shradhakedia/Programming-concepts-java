package Extra;

public class ReportCard {

    private final String name;
    private final int year;
    private String englishGrade = "";
    private String mathGrade = "";
    private String historyGrade = "";
    private String scienceGrade = "";
    private String chemistryGrade = "";

    public ReportCard(String _name, int _year){
        name = _name;
        year = _year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(String englishGrade) {
        this.englishGrade = englishGrade;
    }

    public String getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(String mathGrade) {
        this.mathGrade = mathGrade;
    }

    public String getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(String historyGrade) {
        this.historyGrade = historyGrade;
    }

    public String getScienceGrade() {
        return scienceGrade;
    }

    public void setScienceGrade(String scienceGrade) {
        this.scienceGrade = scienceGrade;
    }

    public String getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(String chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
    }

    @Override
    public String toString() {
        return "ReportCard:\n" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", englishGrade='" + englishGrade + '\'' +
                ", mathGrade='" + mathGrade + '\'' +
                ", historyGrade='" + historyGrade + '\'' +
                ", scienceGrade='" + scienceGrade + '\'' +
                ", chemistryGrade='" + chemistryGrade + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ReportCard reportCard = new ReportCard("Shradha", 2020);
        reportCard.setChemistryGrade("A+");
        reportCard.setEnglishGrade("A+");
        reportCard.setHistoryGrade("A+");
        reportCard.setMathGrade("A++");
        reportCard.setScienceGrade("A+");
        System.out.println(reportCard);
    }
}
