import os
import sys

# ambil path ke root project (Naik 1 level dari folder sekarang)
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), "..")))

import unittest
from Belajar_Day_3.CustomerHelperCSVnew import logic

class TestLoanAssessment(unittest.TestCase):
    #1. test logic
    def test_customer_not_eligible_by_age(self):
        result = logic(20, 10_000_000)
        self.assertEqual(result, "Not Eligible")

    def test_costumer_eligible(self):
        result = logic(25, 9_000_000)
        self.assertEqual(result, "Eligible")
    
    def test_customer_manual_review(self):
        result = logic(22, 5_000_000)
        self.assertEqual(result, "Manual Review")
    
    def test_customer_not_eligible_by_income(self):
        result = logic(21, 2_000_000)
        self.assertEqual(result, "Not Eligible")

if __name__ == "__main__":
    unittest.main()