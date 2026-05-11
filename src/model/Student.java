package model;

public class Student {
    private String name;
    private String studentId;
    private String deviceId;

    public Student(String name, String studentId, String deviceId) {
        this.name = name;
        this.studentId = studentId;
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String toFileString() {
        return name + "," + studentId + "," + deviceId;
    }
}