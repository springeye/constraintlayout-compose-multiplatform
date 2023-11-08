package androidx.constraintlayout.core.platform

internal expect object System {
    fun nanoTime(): Long

    val err: PrintStream
}

internal interface PrintStream {
    fun println(value: String)
}
