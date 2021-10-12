package com.firestore.data.utils

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

object Utils {
    inline fun <reified T> readJsonFile(path: String): T {
        val url = javaClass.getResource(path)
        return jacksonObjectMapper().readValue(url)
    }
}