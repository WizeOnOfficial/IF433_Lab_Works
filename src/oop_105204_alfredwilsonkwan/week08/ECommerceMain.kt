package oop_105204_alfredwilsonkwan.week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    val callApi = ApiParser()
    for (raw in rawApiData) {
        try {
            val product = callApi.parseProduct(raw)

            product?.let {
                println("Success! $it")
                callApi.checkout(it)
            }

        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}