package com.javaassignments.zemoso.corejava.assignment4;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class KycForm {
    Date signUpDate, currentDate;
    String stringStartDate, stringEndDate;
    Date startDate, endDate;
    public void rangeKyc(String inputSignUpDate, String inputCurrentDate) {
        try {
            //Converting format from Date to String
            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
            signUpDate = dateFormatter.parse(inputSignUpDate);
            currentDate= dateFormatter.parse(inputCurrentDate);

            //Date validation
            if(signUpDate.after(currentDate)) {
                System.out.println("No range");
            }
            else {
                startDate = signUpDate;

                //setting sign up year to start date
                startDate.setYear(currentDate.getYear());

                //creating calendar object
                Calendar calendar = Calendar.getInstance();

                //setting startdate as calender current date
                calendar.setTime(startDate);

                //subtracting 30 days from the calender date
                calendar.add(Calendar.DATE, -30);
                startDate=calendar.getTime();

                //adding 60 days to the calender date
                calendar.add(Calendar.DATE, 60);
                endDate=calendar.getTime();

                //verify the end date if end date passes the current date than set as current date
                if(endDate.after(currentDate)) {
                    endDate=currentDate;
                }
            }
            //changing date object to string
            stringStartDate=dateFormatter.format(startDate);
            stringEndDate=dateFormatter.format(endDate);

            //pirnting the dates
            System.out.print(stringStartDate);
            System.out.print("	");
            System.out.println(stringEndDate);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
