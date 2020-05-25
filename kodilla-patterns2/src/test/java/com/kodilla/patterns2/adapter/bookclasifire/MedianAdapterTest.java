package com.kodilla.patterns2.adapter.bookclasifire;

import com.kodilla.patterns2.adapter.bookclasifire.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifire.librarya.Classifier;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MedianAdapterTest {

    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> bookA = new HashSet<>();
        bookA.add(new Book("Krajewski Marek", "Smierc w Breslau", 2006, "ZX4546"));
        bookA.add(new Book("Krajewski Marek", "Festung Breslau", 2007, "AS5674"));
        bookA.add(new Book("Krajewski Marek", "Dżuma w Breslau", 2009, "YU7988"));
        bookA.add(new Book("Krajewski Marek", "Widma w Mieście Breslau", 2010, "GH9860"));
        bookA.add(new Book("Krajewski Marek", "Koniec swiata w Breslau", 2011, "JK1986"));
        MedianAdapter adapter = new MedianAdapter();
        //When
        Integer median = adapter.publicationYearMedian(bookA);
        
        //Then
        assertEquals(2009, median);
    }



}