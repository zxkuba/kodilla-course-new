package com.kodilla.patterns2.adapter.bookclasifire;


import com.kodilla.patterns2.adapter.bookclasifire.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifire.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifire.libraryb.BookSignature;


import java.util.*;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {

   private Book book;


    @Override
    public int publicationYearMedian(Set<Book> bookSet) {

       // Map<String, > bookMap = new HashMap<>();
        Map<BookSignature, Book> mapedBokkMap = new HashMap<>();
     //   bookSet.stream().collect(Collectors.toMap(Book::getSignature, v->v));
        //for(int i=0; i<bookSet.size(); i++){
          //  bookMap.put(book.getSignature(), book);
        //}
        for(int i=0; i<mapedBokkMap.size(); i++){
            mapedBokkMap.put((BookSignature) book.getSignature(),
                    new Book(book.getAuthor(), book.getTitle(), book.getPublicationYear(), book.getSignature()));
        }

      // for(Map.Entry<BookSignature, Book> entry: mapedBokkMap.entrySet()){
        // BookSignature key = entry.getKey();
          // Book value = entry.getValue();
        //}

       // for(Map.Entry<String, Book> entry: bookMap.entrySet()){
         //   if(entry.getValue() instanceof Book){
           //     mapedBokkMap.put((BookSignaturere) entry.getKey(), entry.getValue());
           // }
        //}
        return medianPublicationYear(mapedBokkMap)
        }
}
