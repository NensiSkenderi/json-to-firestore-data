package com.firestore.data.service

import com.firestore.data.entity.User

interface UserService {
    fun findAll(): List<User>
    fun createUser(user: User): List<User>
    fun deleteUser(key: String)
    fun saveAllUsers(users: List<User>): List<User>
}