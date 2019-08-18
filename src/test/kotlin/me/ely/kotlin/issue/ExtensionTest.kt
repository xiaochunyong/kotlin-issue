package me.ely.kotlin.issue

import me.ely.kotlin.issue.domain.Device
import me.ely.kotlin.issue.extension.new
import me.ely.kotlin.issue.util.JSON
import org.junit.Test

/**
 *
 *
 * @author  <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since   2019-08-18
 */

class ExtensionTest {

    @Test
    fun testNew() {
        val device = new<Device>()
        device.version = 3
        println(JSON.stringify(device))
    }

}