package practice

/**
 * @author keshawn
 * @date 2018/2/6
 */
fun String.isBlank() : Boolean = this.isEmpty() || this.trim().isEmpty()

fun main(args: Array<String>) {
    val star = "star"
    val blank = "   "
    println(star.isBlank())
    println(blank.isBlank())
}