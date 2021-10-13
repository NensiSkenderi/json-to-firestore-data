package com.firestore.data.controller

import com.firestore.data.entity.User
import com.firestore.data.service.UserService
import com.firestore.data.utils.Utils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("users")
class UserController {

    @Autowired
    lateinit var userService: UserService

    @GetMapping
    fun findAllUsers(): List<User> {
        return userService.findAll()
    }

    @PostMapping
    fun createUser(): List<User> {
        val user = Utils.readJsonFile<User>("/data/single_user.json")
        return userService.createUser(user)
    }

    @DeleteMapping("{key}")
    fun deleteUser(@PathVariable key: String): List<User> {
        userService.deleteUser(key)
        return userService.findAll()
    }

    @PostMapping("/saveAllUsers")
    fun saveAllUsers(): List<User> {
        val users = Utils.readJsonFile<List<User>>("/data/users.json")
        return userService.saveAllUsers(users);
    }
}