package com.pb.leonov.hw5;

public class Book {
    private final String BookName;
    private final String BookAuthor;
    private final int YearPublishing;

    public Book(String BookName, String BookAuthor, int YearPublishing) {
        this.BookName = BookName;
        this.BookAuthor = BookAuthor;
        this.YearPublishing = YearPublishing;
    }

    public String getTitle() {
        return BookName;
    }


    public String toString() {
        final StringBuilder SB = new StringBuilder();
        SB.append(BookName);
        SB.append(" (").append(BookAuthor);
        SB.append(", ").append(YearPublishing);
        SB.append(" г.)");
        return SB.toString();
    }
}
