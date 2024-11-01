package com.maids.cc.LibraryManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maids.cc.LibraryManagement.model.BorrowingRecord;

public interface BorrowingRecordRepository extends JpaRepository<BorrowingRecord, Long> {
    
    BorrowingRecord findByBook_IdAndPatron_Id(Long bookId, Long patronId);
}
