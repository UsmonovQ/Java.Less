package last_hw;

import java.time.LocalDate;

public class Student {
    public String name;
    private String surname;
    private LocalDate dob;
    private long id;
    private int cours;
    private int group;
    private String faculty;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getCours() {
        return cours;
    }

    public void setCours(int cours) {
        this.cours = cours;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}

