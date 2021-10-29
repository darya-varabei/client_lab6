package com.example.client_lab6.model;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {
    private String author;

    private String name;

    private String genre;

    private int year = 0;

    private int state = 0;

    public Book(String author, String name, String genre, int year, int state) {
        this.author = author;
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.state = state;
    }

    public Book() {
    }

    public Book(String authorBook) {
        this.author = authorBook;
    }

    public String getAuthorBook() {
        return author;
    }

    public void setAuthorBook(String authorBook) {
        this.author = authorBook;
    }

    public String getNameBook() {
        return name;
    }

    public void setNameBook(String nameBook) {
        this.name = nameBook;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearBook() {
        return year;
    }

    public void setYearBook(int yearBook) {
        this.year = yearBook;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && state == book.state &&
                Objects.equals(author, book.author) &&
                Objects.equals(name, book.name) &&
                Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, genre, year, state);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                ", state=" + state +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Book(author, name, genre, year, state);
    }
}
