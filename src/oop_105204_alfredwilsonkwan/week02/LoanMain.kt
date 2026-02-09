package oop_105204_alfredwilsonkwan.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- UMN Library System ---")

    print("Input the Book's Title: ")
    val bookTitle = scanner.nextLine()

    print("Input borrower's name: ")
    val borrower = scanner.nextLine()

    print("Input loan duration: ")
    var loanDuration = scanner.nextInt()
    scanner.nextLine()

    if(loanDuration < 0) {
        loanDuration = 1
        val report = Loan(bookTitle, borrower, loanDuration)
        println("Report saved! Borrower's name: ${report.borrower}, Book title: ${report.bookTitle}, Loan duration: $loanDuration Day")
        println("Final Total loan: ${report.calculateFine()}")
    } else {
        val report = Loan(bookTitle, borrower, loanDuration)
        println("Report saved! Borrower's name: ${report.borrower}, Book title: ${report.bookTitle}, Loan duration: $loanDuration Day")
        println("Final Total loan: ${report.calculateFine()}")
    }
}