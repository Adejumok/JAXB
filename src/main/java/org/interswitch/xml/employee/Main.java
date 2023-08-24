package org.interswitch.xml.employee;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JAXBException{
        JAXBContext context = JAXBContext.newInstance(EmployeeMapHelper.xmlMappingObjects);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        File file = new File("employee.xml");
        Employee employee =(Employee) unmarshaller.unmarshal(file);

        JSONObject object = new JSONObject(employee);
        System.out.println(object);

        Employee emp1 = (Employee) unmarshaller.unmarshal(file);
        Employee emp2 = (Employee) unmarshaller.unmarshal(file);

        JSONArray array = new JSONArray(List.of(employee, emp1, emp2));
        System.out.println(array);
    }
}
