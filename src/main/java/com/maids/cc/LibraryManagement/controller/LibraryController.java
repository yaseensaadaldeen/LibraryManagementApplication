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

    @GetMapping("/stats")
    public String getLibraryStats() {
        return libraryService.getLibraryStats();
    }

}
