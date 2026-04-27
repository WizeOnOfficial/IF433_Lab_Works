package oop_105204_alfredwilsonkwan.week10

class WalletRepository<T> () {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun <T: Any> search(item: T): String{
        return "Searched item $item"
    }
}