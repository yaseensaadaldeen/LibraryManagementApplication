package com.maids.cc.LibraryManagement.model;

import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Patron {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    private String contactInfo;

    // Relationships
    @OneToMany(mappedBy = "patron", cascade = CascadeType.ALL)
    private List<BorrowingRecord> borrowingRecords;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<BorrowingRecord> getBorrowingRecords() {
        return borrowingRecords;
    }

    public void setBorrowingRecords(List<BorrowingRecord> borrowingRecords) {
        this.borrowingRecords = borrowingRecords;
    }

}
