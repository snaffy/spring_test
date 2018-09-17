package com.azygmunt.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "tmpservice")
    public class TmpService implements Presenter{

    public String getDumpString(){
        return "dump string from test1";
    }
}
