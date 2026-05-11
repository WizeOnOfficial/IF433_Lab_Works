package oop_105204_alfredwilsonkwan.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}