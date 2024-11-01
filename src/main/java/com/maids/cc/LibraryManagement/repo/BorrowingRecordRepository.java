package com.maids.cc.LibraryManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maids.cc.LibraryManagement.model.BorrowingRecord;

public interface BorrowingRecordRepository extends JpaRepository<BorrowingRecord, Long> {
    
    // Add this method to find a borrowing record by book ID and patron ID
    BorrowingRecord findByBook_IdAndPatron_Id(Long bookId, Long patronId);
}
