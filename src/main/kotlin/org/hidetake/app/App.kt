package org.hidetake.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication(scanBasePackages = arrayOf("org.hidetake.app"))
open class App {
    companion object {
        @JvmStatic
        fun main(args : Array<String>) {
            SpringApplication.run(App::class.java, *args)
        }
    }
}
