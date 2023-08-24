package org.interswitch.xml.person;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Assessment {
    static JAXBContext context;

    static {
        try {
            context = JAXBContext.newInstance(MapHelper.xmlMappingObjects);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws JAXBException {

        Unmarshaller unmarshaller = context.createUnmarshaller();
        File file = new File("person.xml");
        Person person =(Person) unmarshaller.unmarshal(file);
        System.out.println(person.toString());
        file = new File("student-course.xml");
        StudentCourse studentCourse = (StudentCourse) unmarshaller.unmarshal(file);
        person.setCourses(studentCourse.getCourses());
        System.out.println(person);
    }

    private static void firstImp() throws JAXBException, FileNotFoundException {
        Marshaller marshaller = context.createMarshaller();


        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        Course course1 = new Course("101", "Java");
        Course course2 = new Course("102", "Python");

        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(course1);
        courses.add(course2);

        Student student = new Student("Kayode", "Godwin", "Male", courses);

        marshaller.marshal(student, new FileOutputStream("student.xml"));

//        Student unmarshalledStudent = (Student) unmarshaller.unmarshal(new File("student.xml"));

        System.out.println(student);
//        System.out.println(unmarshalledStudent);
    }
}
