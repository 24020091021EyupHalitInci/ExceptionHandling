package tr.edu.istiklal;

import java.util.Date;

public class Loan {
    private double annualInterestRate = 2.5;
    private int numberOfYears = 1;
    private double loanAmount = 1000;
    private Date loanDate;

    public Loan() {
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        if(annualInterestRate>0)
        {
            this.annualInterestRate = annualInterestRate;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears > 0) {
            this.numberOfYears = numberOfYears;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount > 0) {
            this.loanAmount = loanAmount;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getMonthlyPayment() {
        return getLoanAmount() * getNumberOfYears() / 12;
    }

    public double getTotalPayment() {
        return loanAmount + ((loanAmount * annualInterestRate * numberOfYears) / 1200);
    }
}
