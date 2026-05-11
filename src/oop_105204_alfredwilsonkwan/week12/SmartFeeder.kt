package oop_105204_alfredwilsonkwan.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }

    if(isJammed) {
        throw DispenserJamException()
    }

    if(requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    try {
        println("Jadwal Makan 1:")
        dispenseKibble(80, currentKibbleStock, false)
    } catch (e: DispenserJamException) {
        println("Error: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Error: ${e.message}")
    } catch (e: Exception) {
        println("Error Umum, Terjadi kesalahan tidak terduga.")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    runCatching {
        dispenseKibble(30, 1000, false)
    }
}