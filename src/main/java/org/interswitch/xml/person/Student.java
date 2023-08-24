package org.interswitch.xml.person;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;
@XmlRootElement
public class Student {
    private String firstName;
    private String lastName;
    private String sex;
    private List<Course> courses;

    public Student() {
    }

    public Student(String firstName, String lastName, String sex, List<Course> courses) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.courses = courses;
    }
    @XmlElement
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @XmlElement
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @XmlElement
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    @XmlElement
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", courses=" + courses +
                '}';
    }
}
