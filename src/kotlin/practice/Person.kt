package practice

/**
 * @author keshawn
 * @date 2018/2/1
 */
class Person {
    val name: String
    var isMarried: Boolean
    get() = name == "fkx"

    constructor(name: String, isMarried: Boolean) {
        this.name = name
        this.isMarried = isMarried
    }

    override fun toString(): String {
        return name + " " + isMarried.toString()
    }
}