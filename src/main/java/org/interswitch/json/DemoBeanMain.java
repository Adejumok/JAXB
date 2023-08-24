package org.interswitch.json;

import org.json.JSONObject;

public class DemoBeanMain {
    public static void main(String[] args) {
        DemoBean demoBean = new DemoBean();
        demoBean.setId(1);
        demoBean.setName("Jolo");
        demoBean.setActive(true);
        JSONObject jo = new JSONObject(demoBean);
        System.out.println(jo);
    }
}
