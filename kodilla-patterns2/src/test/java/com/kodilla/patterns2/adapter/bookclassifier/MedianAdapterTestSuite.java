package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        Book book1 = new Book("Author AAA", "Some Title", 2005, "gdsgsdg");
        Book book2 = new Book("Author BBB", "XYZ", 2009, "kdsdsdlp");
        Book book3 = new Book("Author CCC", "Another title", 2006, "fefgrtg");
        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        MedianAdapter medianAdapter = new MedianAdapter();
        int publicationYearMedian = medianAdapter.publicatinYearMedian(books);

        Assert.assertEquals(2006, publicationYearMedian);
    }
}
