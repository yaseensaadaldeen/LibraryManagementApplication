package com.maids.cc.LibraryManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maids.cc.LibraryManagement.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}