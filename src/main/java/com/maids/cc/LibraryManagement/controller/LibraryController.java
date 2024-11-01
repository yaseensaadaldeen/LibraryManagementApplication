package com.maids.cc.LibraryManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maids.cc.LibraryManagement.service.LibraryService;; // Ensure you have a LibraryService

@RestController
@RequestMapping("/api/library")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    // Endpoint to get library statistics or information
    @GetMapping("/stats")
    public String getLibraryStats() {
        // Implement logic to return statistics like total books, total patrons, etc.
        return libraryService.getLibraryStats();
    }

    // Other general library operations can be added here
}
