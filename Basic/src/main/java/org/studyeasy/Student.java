package org.studyeasy;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 11/25/2025 7:26 PM
 Project Name : Basic
 ************************************************************************/
public class Student {
    private int StudentId;
    private String StudentName;
    private String StudentAddress;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        System.out.println("setting the std id");
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        System.out.println("setting the std name");
        StudentName = studentName;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        System.out.println("setting the std address");
        StudentAddress = studentAddress;
    }

    public Student(int studentId, String studentName, String studentAddress) {
        super();
        StudentId = studentId;
        StudentName = studentName;
        StudentAddress = studentAddress;
    }

    public Student(){
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                ", StudentAddress='" + StudentAddress + '\'' +
                '}';
    }
}
