package com.firestore.data.service.impl

import com.firestore.data.entity.User
import com.firestore.data.repository.UserRepository
import com.firestore.data.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val userRepository: UserRepository): UserService {
    override fun findAll(): List<User> {
        return userRepository.findAll().toList()
    }

    override fun createUser(user: User): List<User> {
        userRepository.save(user)
        return userRepository.findAll().toList()
    }

    override fun deleteUser(key: String) {
        return userRepository.deleteById(key)
    }

    override fun saveAllUsers(users: List<User>): List<User> {
        return userRepository.saveAll(users).toList()
    }
}