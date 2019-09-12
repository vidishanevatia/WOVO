package com.example.wovo;


import java.io.Serializable;

public class MedicineModel implements Serializable {


    String id;
    String reminder_title;
    String reminder_type;
    String reminder_type_id;
    String reminder_date;
    String reminder_time;
    String reminder_details;
    String color_code;


    public String getReminder_type_id() {
        return reminder_type_id;
    }

    public void setReminder_type_id(String reminder_type_id) {
        this.reminder_type_id = reminder_type_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReminder_title() {
        return reminder_title;
    }

    public void setReminder_title(String reminder_title) {
        this.reminder_title = reminder_title;
    }

    public String getReminder_type() {
        return reminder_type;
    }

    public void setReminder_type(String reminder_type) {
        this.reminder_type = reminder_type;
    }

    public String getReminder_date() {
        return reminder_date;
    }

    public void setReminder_date(String reminder_date) {
        this.reminder_date = reminder_date;
    }

    public String getReminder_time() {
        return reminder_time;
    }

    public void setReminder_time(String reminder_time) {
        this.reminder_time = reminder_time;
    }

    public String getReminder_details() {
        return reminder_details;
    }

    public void setReminder_details(String reminder_details) {
        this.reminder_details = reminder_details;
    }

    public String getColor_code() {
        return color_code;
    }

    public void setColor_code(String color_code) {
        this.color_code = color_code;
    }
}

