package com.kodilla.hibernate.manytomany.facade;

public class Exception extends java.lang.Exception {
    public static String ERR_EMPLOYEE_NOT_FOUND = "No results for such employee name";
    public static String ERR_COMPANY_NOT_FOUND = "No results for such company name";

    public Exception(String message){
        super(message);
    }
}

