package com.koshailimited.springbootswaggerdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

    @ApiOperation(value = "Returns hello world")
    @GetMapping
    public String hello(){
        return "Hello World";
    }

    @ApiOperation(value = "Returns hello world")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is set"),
                    @ApiResponse(code = 200, message = "success")
            }
    )
    @PostMapping("/add")
    public String hello(@RequestBody final String hello){
        return hello;
    }

    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello){
        return hello;
    }
}
