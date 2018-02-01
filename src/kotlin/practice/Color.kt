package practice

/**
 * @author keshawn
 * @date 2018/2/1
 */
enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getColor(color: Color) =
        when (color) {
            Color.RED -> "red"
            Color.BLUE -> "blue"
            Color.GREEN -> "green"
            Color.INDIGO -> "indigo"
            Color.ORANGE -> "orange"
            Color.VIOLET -> "violet"
            Color.YELLOW -> "yellow"
        }

fun getMarried(name: String) =
        when (name) {
            "fkx" -> false
            "ln" -> false
            else -> throw Exception("unknown name")
        }

fun main(args: Array<String>) {
    println(getColor(Color.YELLOW))
    println(getMarried("fkx"))
}