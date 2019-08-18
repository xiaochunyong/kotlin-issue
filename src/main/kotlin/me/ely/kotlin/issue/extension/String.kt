package me.ely.kotlin.issue.extension

/**
 * commons-lang3 StringUtils.substringBetween
 */
fun String.substringBetween(open: String, close: String): String {
    val start = this.indexOf(open)
    if (start != -1) {
        val end = this.indexOf(close, start + open.length)
        if (end != -1) {
            return this.substring(start + open.length, end)
        }
    }
    return ""
}