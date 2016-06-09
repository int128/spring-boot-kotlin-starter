package org.hidetake.app

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Example {

    @RequestMapping("/hello")
    fun index() = "Hello World"

}
