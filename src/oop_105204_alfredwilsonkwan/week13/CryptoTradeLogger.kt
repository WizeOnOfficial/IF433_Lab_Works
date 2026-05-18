package oop_105204_alfredwilsonkwan.week13
import java.io.File

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    val parts = line.split(",")
    try {
        return TradeRecord(parts[0].toInt(), parts[1], parts[2], parts[3].toDouble(), parts[4].toDouble()) ?: null
    } catch (e: NumberFormatException) {
        println("(Log) Dat korup diabaikan: $line")
        return null
    } catch (e: IndexOutOfBoundsException) {
        println("(Log) Dat korup diabaikan: $line")
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