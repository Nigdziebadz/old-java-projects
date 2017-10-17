package com.kodilla.testing.library;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    private static int testCounter = 0;

    private List<Book> generateListOfNBooks(int howMuchBooks) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= howMuchBooks; n++) {
            Book generatedBook = new Book
                    ("Title" + n, "author" + n, 1980 + n);
            resultList.add(generatedBook);
        }
        return resultList;
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("starting test #" + testCounter);
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book
                ("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book
                ("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book
                ("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book
                ("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);
        //When
        List<Book> theListOfBooks =
                bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");

        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultOf10Books);

        //When
        List<Book> testListOf10Books = bookLibrary.listBooksWithCondition("an");

        //Then
        assertEquals(0, testListOf10Books.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testBookInTheHandsOfNoBooks() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary((libraryDatabaseMock));
        List<Book> emptySetOfBooks = new ArrayList<>();
        LibraryUser newUser = new LibraryUser("Alek",
                "Lockhart", "123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(newUser)).thenReturn(emptySetOfBooks);

        //When
        List<Book> listOfBorrowedBooks = bookLibrary.listBooksInHandsOf(newUser);

        //Then
        assertEquals(0, listOfBorrowedBooks.size());
    }

    @Test
    public void testBookInTheHandsOfOneBook() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary((libraryDatabaseMock));
        List<Book> setOfOneBook = generateListOfNBooks(1);
        LibraryUser newUser = new LibraryUser("Alek",
                "Lockhart", "123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(newUser)).thenReturn(setOfOneBook);

        //When
        List<Book> listOfOneBorrowedBook = bookLibrary.listBooksInHandsOf(newUser);

        //Then
        assertEquals(1, listOfOneBorrowedBook.size());
    }

    @Test
    public void testBookInTheHandsOfFiveBooks() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary((libraryDatabaseMock));
        List<Book> setOfNBooks = generateListOfNBooks(5);
        LibraryUser newUser = new LibraryUser("Alek",
                "Lockhart", "123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(newUser)).thenReturn(setOfNBooks);

        //When
        List<Book> listOfNBorrowedBook = bookLibrary.listBooksInHandsOf(newUser);

        //Then
        assertEquals(5, listOfNBorrowedBook.size());

    }
}
