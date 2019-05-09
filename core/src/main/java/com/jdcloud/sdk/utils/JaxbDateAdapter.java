package com.jdcloud.sdk.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class JaxbDateAdapter extends XmlAdapter<String, Date> {

    private static final String STANDARM_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    @Override
    public String marshal(Date date) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat(STANDARM_DATE_FORMAT);
        return dateFormat.format(date);
    }

    @Override
    public Date unmarshal(String date) throws Exception {
        if (date == null) {
            return null;
        }
        DateFormat dateFormat = new SimpleDateFormat(STANDARM_DATE_FORMAT);
        return dateFormat.parse(date);
    }
}
