package practice

/**
 * @author keshawn
 * @date 2018/2/6
 */

fun <T> Collection<T>.joinToString(separator: String = ",", prefix: String = "", postfix: String = ""): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val set = hashSetOf(1, 7, 8)
    println(set)
    val list = arrayListOf(2, 3, 4)
    println(list)
    val map = hashMapOf(1 to "one", 2 to 20)
    println(map)
    println(set.joinToString(postfix = "."))
}


