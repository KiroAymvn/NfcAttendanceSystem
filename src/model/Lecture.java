package model;

public class Lecture {

    private String subjectName;
    private String startTime;
    private String endTime;

    public Lecture(String subjectName, String startTime, String endTime) {
        this.subjectName = subjectName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String toFileString() {
        return subjectName + "," + startTime + "," + endTime;
    }
}