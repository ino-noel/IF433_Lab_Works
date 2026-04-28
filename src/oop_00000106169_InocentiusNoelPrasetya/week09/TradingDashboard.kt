package oop_00000106169_InocentiusNoelPrasetya.week09

fun main() {
    // Pipeline 0: Data uji (minimal 6 TradeLog, campuran OPEN/CLOSED, profit/loss, 2+ koin)
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 15, 8.3, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -12.1, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 25, 22.0, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 20, 3.7, "OPEN"),
        TradeLog("SOLUSDT", "SHORT", 10, -1.5, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    val winningTrades = closedTrades.filter { it.roe > 0 }

    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }
}