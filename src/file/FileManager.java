package file;

import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void saveStudent(String data) {
        saveToFile("students.txt", data);
    }

    public static void saveSubject(String data) {
        saveToFile("subjects.txt", data);
    }

    public static void saveLecture(String data) {
        saveToFile("lectures.txt", data);
    }

    public static void saveAttendance(String data) {
        saveToFile("attendance.txt", data);
    }

    private static void saveToFile(String fileName, String data) {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(data + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving data");
        }
    }
}