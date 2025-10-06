package labSeatwork3;

public class GradingSystemAdapter implements SchoolManagementApp {
    private GradingSystem grading;

    public GradingSystemAdapter(GradingSystem grading) {
        this.grading = grading;
    }

    @Override
    public String integrateSystem() {
        return grading.recordGrades();
    }
}
