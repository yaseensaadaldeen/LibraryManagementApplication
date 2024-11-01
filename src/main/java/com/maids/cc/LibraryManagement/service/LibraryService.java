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
        // Additional statistics can be added as needed
        return "Total Books: " + totalBooks + ", Total Patrons: " + totalPatrons;
    }

    // Other methods for overdue books, borrowed books, etc. can be added here
}
