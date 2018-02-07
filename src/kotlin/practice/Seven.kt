package practice

/**
 * @author keshawn
 * @date 2018/2/5
 * 100以内的数七
 * val oneToTen = 1..10
 */
const val SKIP = "Skip"

fun main(args: Array<String>) {
    for (num in 1..100) {
        println(parse(num))
    }
}

fun parse(num: Int) = when {
    num % 7 == 0 -> SKIP
    num.toString().contains("7") -> SKIP
    else -> "$num"
}
