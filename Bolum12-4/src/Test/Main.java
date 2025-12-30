package Test;

import tr.edu.istiklal.Loan;

public class Main {
    static void main(String[] args) {
        Loan l = new Loan();
        try{
            l.setAnnualInterestRate(10);
            l.setLoanAmount(10);
            l.setNumberOfYears(0);
        }catch (IllegalArgumentException e)
        {
            System.out.println("Set big integer than 0");
        }
    }
}
