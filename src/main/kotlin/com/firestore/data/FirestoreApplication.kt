package com.firestore.data

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.cloud.gcp.data.datastore.repository.config.EnableDatastoreRepositories

@SpringBootApplication(
    exclude = [DataSourceAutoConfiguration::class]
)
open class FirestoreApplication

fun main(args: Array<String>) {
    runApplication<FirestoreApplication>(*args)
}

