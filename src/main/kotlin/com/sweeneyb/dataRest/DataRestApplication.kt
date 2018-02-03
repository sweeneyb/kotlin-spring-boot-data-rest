package com.sweeneyb.dataRest

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController



@RestController
class HelloController(val helloService: HelloService) {

    @GetMapping("/hello")
    fun hello() = helloService.hello()

    @GetMapping("/count")
    fun count() = helloService.count()

}

@SpringBootApplication
open class DataRestApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(DataRestApplication::class.java, *args)
        }
    }
}
