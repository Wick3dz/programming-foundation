class RiskAssessor:
    def assess(self,customer):
        if customer.age < 21:
            return "Not Eligible"
        elif customer.salary >= 8000000:
            return "Eligible"
        elif customer.salary >= 3000000:
            return "Manual Review"
        else:
            return "Not Eligible"