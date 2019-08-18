package me.ely.kotlin.issue.util

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import java.text.SimpleDateFormat
import java.util.*

/**
 *
 *
 * @author  <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since   2019-08-18
 */
object JSON {

    val objectMapper = ObjectMapper()

    fun initObjectMapper(objectMapper: ObjectMapper) {
        objectMapper.registerModule(KotlinModule())
        objectMapper.dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        objectMapper.setTimeZone(TimeZone.getTimeZone("GMT+8"))
        objectMapper.setDefaultPropertyInclusion(JsonInclude.Include.ALWAYS)
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false)
    }
    init {
        initObjectMapper(objectMapper)
    }

    fun stringify(o: Any): String {
        return objectMapper.writeValueAsString(o)
    }

    final inline fun <reified T> parse(json: String?): T {
        return objectMapper.readValue(json, T::class.java)
    }

}