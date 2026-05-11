package model;

public class Subject {

    private String subjectName;
    private String nfcCode;

    public Subject(String subjectName, String nfcCode) {
        this.subjectName = subjectName;
        this.nfcCode = nfcCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getNfcCode() {
        return nfcCode;
    }

    public String toFileString() {
        return subjectName + "," + nfcCode;
    }
}
