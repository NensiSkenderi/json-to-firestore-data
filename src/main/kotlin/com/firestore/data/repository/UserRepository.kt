package com.firestore.data.repository

import com.firestore.data.entity.User
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository

interface UserRepository: DatastoreRepository<User, String>