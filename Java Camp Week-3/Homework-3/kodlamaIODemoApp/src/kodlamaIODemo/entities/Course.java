package kodlamaIODemo.entities;

public class Course {
    private int ıd;
    private String courseName;

    public Course() {

    }

    public Course(int id, String courseName) {

        ıd = id;
        courseName = courseName;
    }

    public int getId() {
        return ıd;
    }

    public void setId(int id) {
        ıd = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        courseName = courseName;
    }


}
