package practice

import java.io.BufferedReader

/**
 * @author keshawn
 * @date 2018/2/7
 *
 */
fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}