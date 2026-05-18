package oop_105204_alfredwilsonkwan.week13
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    val parts = line.split(",")
    try {
        return TradeRecord(parts[0].toInt(), parts[1], parts[2], parts[3].toDouble(), parts[4].toDouble()) ?: null
    } catch (e: NumberFormatException) {
        println("(Log) Data korup diabaikan: $line")
        return null
    } catch (e: IndexOutOfBoundsException) {
        println("(Log) Data korup diabaikan: $line")
        return null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { out ->
        trades.forEach {
            out.println(it.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    val trades = listOf(
        TradeRecord(1, "BTCUSDT", "long", 24.5, 11.2),
        TradeRecord(2, "ETHUSDT", "short", 36.2, 8.2)
    )
    saveTrades(trades, "crypto_trades.csv")

    File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")

    val loadedData = loadTrades("crypto_trades.csv")
    loadedData.sumOf {it.pnl}
}