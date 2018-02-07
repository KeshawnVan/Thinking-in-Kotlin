package practice

/**
 * @author keshawn
 * @date 2018/1/31
 */
/**
 * 在Kotlin中，if是表达式，而不是语句。
 * 语句和表达式的区别在于，表达式有值，并且能作为另一个表达式的一部分使用；
 * 而语句总是包围着它的代码块中的顶层元素，并没有自己的值。
 * 在Java中，所有的控制结构都是语句。
 * 而在Kotlin中，除了循环（for，do和do/while）以外大多数控制结构都是表达式。
 * 这种结合控制结构和其他表达式的能力让你可以简明扼要的表达许多常见的模式。
 * 另一方面，Java中的赋值操作是表达式，在Kotlin中反而变成了语句。
 * 这有助于避免比较和赋值之间的混淆，而这种混淆是常见的错误来源。
 */
fun max(a: Int, b: Int) = if (a > b) a else b

fun main(args: Array<String>) {
    val a = 2
    val b = 5
    println(max(a, b))
}
