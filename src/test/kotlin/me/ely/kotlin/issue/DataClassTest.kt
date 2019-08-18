package me.ely.kotlin.issue

import me.ely.kotlin.issue.domain.Device
import me.ely.kotlin.issue.util.JSON
import org.junit.Assert
import org.junit.Test

/**
 *
 *
 * @author  <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since   2019-08-18
 */
class DataClassTest {

    @Test
    fun testDataClassCopy() {
        val device = JSON.parse<Device>("""{ "imei": "358730091744037", "sn": "G6TXXNZPKPJ3", "productName": "iPhone OS", "productType": "iPhone11,6", "createDt":"2019-08-18 19:35:00","updateDt":"2019-08-18 19:35:00","deleted":false,"version":3 }""")
        Assert.assertEquals(device.version, 3)
        val newDevice = device.copy(imei = "this is imei")
        Assert.assertEquals(newDevice.version, 0)
    }

}