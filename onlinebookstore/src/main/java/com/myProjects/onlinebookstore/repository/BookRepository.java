package com.myProjects.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.myProjects.onlinebookstore.entity.Book;


public interface BookRepository extends JpaRepository<Book,Long> {

}
