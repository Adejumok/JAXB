package org.interswitch.json;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonObj {
    public static void main(String[] args) {
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("name", "Johnny Akak");
//        jsonObject.put("age", "22");
//        jsonObject.put("city", "Eyenkorin");
//        System.out.println(jsonObject);

//        Map<String, String> map = new HashMap<>();
//        map.put("name", "Johnny Akak");
//        map.put("age", "22");
//        map.put("city", "Eyenkorin");

        JSONObject object = new JSONObject(
                "{\"city\":\"akoka\", " +
                        "\"name\":\"Kiki Lola\"," +
                        "\"age\":\"21\"}"
        );
        System.out.println(object);


        JSONArray jsonArray = new JSONArray();

        jsonArray.put(Boolean.TRUE);
        jsonArray.put("Lorem Ipsum");

        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("name", "Salome Odusoro");
        jsonObject1.put("age", "21");
        jsonObject1.put("city", "Lagos");

        jsonArray.put(jsonObject1);

        System.out.println("Passing JSON Object to JSON Array -> "+jsonArray);
        jsonArray = new JSONArray("[true, \"lorem ipsum\", 215]");
        System.out.println("Using JSON Array with Escape Characters -> "+jsonArray);

        List<String> list = new ArrayList<>();
        list.add("Safari");
        list.add("Kwara");

        jsonArray = new JSONArray(list);
        System.out.println("Passing List Object to JSON Array -> "+jsonArray);
    }



}
