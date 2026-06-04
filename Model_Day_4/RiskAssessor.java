package Model_Day_4;

public class RiskAssessor{
    public String assess(Customer2 customer){
        String decision;
        if(customer.age < 21){
            decision = "Not Eligible";
        } else if (customer.salary >= 8000000){
            decision = "Eligible";
        } else if (customer.salary >= 3000000){
            decision = "Manual Review";
        } else {
            decision = "Not Eligible";
        }
        return decision;
    }
}