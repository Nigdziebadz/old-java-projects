package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class BookClassifierTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Autor 1st", "Random title 1", 2013, "001");
        Book book2 = new Book("Autor 2nd", "Random title 2", 2012, "002");
        Book book3 = new Book("Autor 3rd", "Random title 3", 2000, "003");
        Book book4 = new Book("Autor 4th", "Random title 4", 2015, "004");
        Book book5 = new Book("Autor 5th", "Random title 5", 2017,  "005");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        MedianAdapter adapter = new MedianAdapter();
        //Then
        int medianOfTheYear = adapter.publicationYearMedian(bookSet);
        //When
        assertEquals(2013, medianOfTheYear);
    }
}