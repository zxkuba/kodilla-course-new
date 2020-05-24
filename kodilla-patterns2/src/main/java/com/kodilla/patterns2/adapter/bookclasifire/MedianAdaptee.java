package com.kodilla.patterns2.adapter.bookclasifire;

import com.kodilla.patterns2.adapter.bookclasifire.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifire.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifire.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifire.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics avg = new Statistics();
        return avg.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics median = new Statistics();
        return median.medianPublicationYear(books);
    }
}
