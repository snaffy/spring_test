package com.azygmunt.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "otherservice")
public class OhterService  implements Presenter {

    public String getDumpString(){
        return "dump string from other service";
    }
}
