package com.example.spring.reader;

public class Reader {
    final Book theBook;

    public Reader(final Book theBook) {
        this.theBook = theBook;
    }

    public void read(){
        System.out.println("Reading book: " + theBook.getTitle());
    }


}
