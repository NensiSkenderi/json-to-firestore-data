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

    @GetMapping("/findAll")
    fun findAllUsers(): List<User> {
        return userService.findAll()
    }

    @PostMapping("/create")
    fun createUser(): List<User> {
        val user = Utils.readJsonFile<User>("/data/single_user.json")
        return userService.createUser(user)
    }

    @DeleteMapping("/delete")
    fun deleteUser(): List<User> {
        return userService.findAll()
    }

    @PostMapping("/save")
    fun saveAllUsers(users: List<User>): List<User> {
        val user = Utils.readJsonFile<User>("/data/single_user.json")
        return userService.saveAllUsers(users);
    }
}