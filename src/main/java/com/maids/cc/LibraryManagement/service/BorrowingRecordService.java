package com.maids.cc.LibraryManagement.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maids.cc.LibraryManagement.model.Book;
import com.maids.cc.LibraryManagement.model.BorrowingRecord;
import com.maids.cc.LibraryManagement.model.Patron;
import com.maids.cc.LibraryManagement.repo.BorrowingRecordRepository;

@Service
public class BorrowingRecordService {

    @Autowired
    private BorrowingRecordRepository borrowingRecordRepository;

    public List<BorrowingRecord> getAllRecords() {
        return borrowingRecordRepository.findAll();
    }

    public BorrowingRecord borrowBook(Long bookId, Long patronId) {
        BorrowingRecord record = new BorrowingRecord();
        Book book = new Book();
        book.setId(bookId); 
        record.setBook(book);

        Patron patron = new Patron();
        patron.setId(patronId); 
        record.setPatron(patron);

        record.setBorrowDate(LocalDate.now());
        return borrowingRecordRepository.save(record);
    }

    public BorrowingRecord returnBook(Long bookId, Long patronId) {
        BorrowingRecord record = borrowingRecordRepository.findByBook_IdAndPatron_Id(bookId, patronId);
        if (record != null) {
            record.setReturnDate(LocalDate.now());
            return borrowingRecordRepository.save(record);
        }
        return null;
    }
}
