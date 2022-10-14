package kodlamaIODemo.entities;

public class Teacher {
    private int ıd;
    private String title;
    private String name;
    private String surname;

    public Teacher() {

    }

    public Teacher(int ıd, String title, String name, String surname) {

        ıd = ıd;
        title = title;
        name = name;
        surname = surname;
    }

    public int getId() {
        return ıd;
    }

    public void setId(int id) {
        ıd = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        surname = surname;
    }



}