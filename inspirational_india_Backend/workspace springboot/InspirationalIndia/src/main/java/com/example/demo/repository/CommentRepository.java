package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Blog;
import com.example.demo.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer>{

	List<Comment> findByBlog(Blog blog);

}
