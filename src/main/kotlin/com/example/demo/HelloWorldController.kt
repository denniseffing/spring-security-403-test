package com.example.demo

import org.springframework.http.ResponseEntity
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HelloWorldController {

    @GetMapping
    @PreAuthorize("hasAuthority('permission')")
    fun helloWorld(): ResponseEntity<String> {
        return ResponseEntity.ok("Hello world!")
    }
}
