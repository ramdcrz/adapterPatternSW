package labSeatwork3;

public class SchoolManagement {
    public static void main(String[] args) {
        AttendanceSystem attendance = new AttendanceSystem();
        AttendanceSystemAdapter attendanceAdapter = new AttendanceSystemAdapter(attendance);

        GradingSystem grading = new GradingSystem();
        GradingSystemAdapter gradingAdapter = new GradingSystemAdapter(grading);

        LibrarySystem library = new LibrarySystem();
        LibrarySystemAdapter libraryAdapter = new LibrarySystemAdapter(library);

        System.out.println(attendanceAdapter.integrateSystem());
        System.out.println(gradingAdapter.integrateSystem());
        System.out.println(libraryAdapter.integrateSystem());
    }
}