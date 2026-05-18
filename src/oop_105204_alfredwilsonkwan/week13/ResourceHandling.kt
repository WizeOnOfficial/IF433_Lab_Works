package oop_105204_alfredwilsonkwan.week13
import java.io.File

fun main() {
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("unsafe_logs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")

    // BAHAYA: Jika terjadi Exception di baris ini (misalnya pembagian dengan nol atau error tak terduga),
    // program akan crash dan metode writer.close() di bawahnya TIDAK AKAN PERNAH TEREKSEKUSI!!
    // File akan terus terkunci oleh OS.

    // Wajib dipanggil secara manuall jika tidak memakai blok 'use'
    writer.close()
    println("Proses penulisan unsafe selesai.")

    println("\n=== TEST SAGE RESOURCE HANDLING ===")
    val safeFile = File("safe_logs.txt")

    safeFile.printWriter().use { out ->
        for(i in 1..100) {
            out.println("Safe Log entry #$i: System status OK.")
        }
    }

    println("100 baris log berhasil di-generate dengan sangat aman.")

    println("\n=== TEST BUFFERED READER ===")
    safeFile.bufferedReader().use { reader ->
        reader.lineSequence().take(5).forEach { line ->
            println("Stream Read: $line")
        }
    }
}