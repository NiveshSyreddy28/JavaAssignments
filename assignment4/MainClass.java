package com.javaassignments.zemoso.corejava.assignment4;

class KycFormDemo{

    public static void main(String[] args) {
        KycForm kycForm1 =new KycForm();

        //calling the method rangeKyc by passing the arguments by its object
        kycForm1.rangeKyc("16-07-1998", "27-06-2017");
        kycForm1.rangeKyc("04-02-2016", "04-04-2017");
        kycForm1.rangeKyc("04-05-2017", "04-04-2017");
        kycForm1.rangeKyc("04-04-2015", "04-04-2016");
        kycForm1.rangeKyc("04-04-2015", "15-03-2016");
    }

}
