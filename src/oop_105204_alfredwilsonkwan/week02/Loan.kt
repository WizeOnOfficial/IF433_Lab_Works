package oop_105204_alfredwilsonkwan.week02

class Loan (val bookTitle: String, val borrower: String, var loanDuration: Int = 1) {
    fun calculateFine(): Int {
        var totalFine = 0

        if (loanDuration > 3) {
            totalFine = (loanDuration - 3) * 2000
        } else if (loanDuration <= 3) {
            totalFine = 0
        }

        return totalFine
    }
}