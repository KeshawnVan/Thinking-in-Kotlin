package practice

/**
 * @author keshawn
 * @date 2018/2/5
 */
fun main(args: Array<String>) {
    for (num in 1..100) {
        println(parse(num))
    }
}

fun parse(num: Int) = when {
    num % 7 == 0 -> "Skip"
    num.toString().contains("7") -> "Skip"
    else -> "$num"
}