package labSeatwork3;

public class AttendanceSystemAdapter implements SchoolManagementApp {
    private AttendanceSystem attendance;

    public AttendanceSystemAdapter(AttendanceSystem attendance) {
        this.attendance = attendance;
    }

    @Override
    public String integrateSystem() {
        return attendance.markAttendance();
    }
}