package me.ely.kotlin.issue.domain

import java.util.*

/**
 *
 *
 * @author  <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since   2019-08-18
 */
open class BaseEntity {
    var createDt: Date = Date()
    var updateDt: Date = Date()
    var deleted: Boolean = false
    var version: Long = 0
}