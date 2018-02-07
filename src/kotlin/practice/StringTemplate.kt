package practice

/**
 * @author keshawn
 * @date 2018/1/31
 */
fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    val template = "Hello $name !"
    println(template)
    println(template.isBlank())
    println("Hello ${if (args.isNotEmpty()) args[0] else "someone"}!")
}