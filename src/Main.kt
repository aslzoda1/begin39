import java.util.Scanner
import kotlin.math.sqrt

fun main() {
    val reader = Scanner(System.`in`)

    println("Ax^2 + Bx + C = 0 ko'rinishidagi kvadrat tenglama")
    print("A = "); val a = reader.nextDouble()
    print("B = "); val b = reader.nextDouble()
    print("C = "); val c = reader.nextDouble()

    val d = b * b - 4 * a * c
    println("Diskriminant D = $d")

    if (d > 0) {
        val x1 = (-b + sqrt(d)) / (2 * a)
        val x2 = (-b - sqrt(d)) / (2 * a)
        println("Yechimlar: x1 = $x1, x2 = $x2")
    } else if (d == 0.0) {
        val x = -b / (2 * a)
        println("Yagona yechim: x = $x")
    } else {
        println("Haqiqiy ildizlar mavjud emas (D < 0)")
    }
}