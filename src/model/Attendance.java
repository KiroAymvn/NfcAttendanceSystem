package model;

public class Attendance {

    private String studentId;
    private String subjectName;
    private String status;

    public Attendance(String studentId, String subjectName, String status) {
        this.studentId = studentId;
        this.subjectName = subjectName;
        this.status = status;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getStatus() {
        return status;
    }

    public String toFileString() {
        return studentId + "," + subjectName + "," + status;
    }
}