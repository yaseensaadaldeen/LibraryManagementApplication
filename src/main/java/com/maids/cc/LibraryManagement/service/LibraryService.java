package com.maids.cc.LibraryManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maids.cc.LibraryManagement.repo.BookRepository;
import com.maids.cc.LibraryManagement.repo.PatronRepository;

@Service
public class LibraryService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private PatronRepository patronRepository;

    public String getLibraryStats() {
        long totalBooks = bookRepository.count();
        long totalPatrons = patronRepository.count();
        return "Total Books: " + totalBooks + ", Total Patrons: " + totalPatrons;
    }
}
