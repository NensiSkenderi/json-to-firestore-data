package com.firestore.data.entity

import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity
import org.springframework.data.annotation.Id
import java.util.*

@Entity(name = "users")
class User(
    @Id
    var id: String = UUID.randomUUID().toString(),
    var username: String = "",
    var firstName: String = "",
    var lastName: String = ""
)