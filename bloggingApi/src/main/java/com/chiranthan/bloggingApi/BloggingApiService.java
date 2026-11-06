package com.chiranthan.bloggingApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BloggingApiService {
   @Autowired
   private BloggingApiRepository bloggingApiRepository;
   
   public BloggingStructure getBlog(Integer id) {
	   return bloggingApiRepository.findById(id).orElse(null);
   }

   public BloggingStructure createBlog(BloggingStructure blog) {
	 return bloggingApiRepository.save(blog);
   }

   public String deleteBlog(Integer id) {
	BloggingStructure blog = bloggingApiRepository.findById(id).orElse(null);
	bloggingApiRepository.delete(blog);
	return "Blog deleted successfully";
	
   }
}
