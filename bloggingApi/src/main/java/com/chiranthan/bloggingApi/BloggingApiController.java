package com.chiranthan.bloggingApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BloggingApiController {

    @Autowired
    private BloggingApiService bloggingApiService;

    @GetMapping("/getBlog/{id}")
    public BloggingStructure getBlog(@PathVariable Integer id) {
        return bloggingApiService.getBlog(id);
    }

    @PostMapping("/createBlog")
    public BloggingStructure createBlog(@RequestBody BloggingStructure blog) {
        return bloggingApiService.createBlog(blog);
    }
}