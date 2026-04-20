package oop_105204_alfredwilsonkwan.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 25, 120.0, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 50, 25.0, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -34.5, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 35, 12.5, "CLOSED"),
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    println("Closed: $closedTrades")

    val winningTrades = closedTrades.filter { it.roe > 0 }
    println("Winning trades: $winningTrades")

    val losingTrades = closedTrades.filter { it.roe <= 0 }
    println("Losing trades: $losingTrades")

    val topPerformersString = winningTrades.sortedByDescending { it.roe }.map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }
    println("Top performers: $topPerformersString")

    val worstPerformersString = losingTrades.sortedBy { it.roe }.map { "LOSE [${it.pair} - ${it.position}]: -${it.roe}% ROE (Lev: ${it.leverage}x)" }
    println("Worst performers: $worstPerformersString")
}