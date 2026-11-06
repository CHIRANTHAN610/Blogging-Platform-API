package com.chiranthan.bloggingApi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloggingApiRepository
        extends JpaRepository<BloggingStructure, Integer> {

}