package com.kodilla.patterns2.adapter.bookclasifire;


import com.kodilla.patterns2.adapter.bookclasifire.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifire.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifire.libraryb.BookSignature;


import java.util.*;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {

   private Book book;


    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifire.librarya.Book> bookSet) {

        Map<BookSignature, Book> bookMap = new HashMap<>();

        for(com.kodilla.patterns2.adapter.bookclasifire.librarya.Book bookA: bookSet){
            BookSignature signature = new BookSignature(bookA.getSignature());
            Book bookB = new Book(
                    bookA.getAuthor(),
                    bookA.getTitle(),
                    bookA.getPublicationYear());
            bookMap.put(signature, bookB);
        }
        return medianPublicationYear(bookMap);
        }
}
