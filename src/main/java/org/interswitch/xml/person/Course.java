package org.interswitch.xml.person;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Course {
    @XmlElement(name = "course-code")
    private String courseCode;
    @XmlElement(name = "course-name")
    private String courseName;

    public Course() {
    }

    public Course(String courseCode, String courseName) {
        super();
        this.courseCode = courseCode;
        this.courseName = courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
