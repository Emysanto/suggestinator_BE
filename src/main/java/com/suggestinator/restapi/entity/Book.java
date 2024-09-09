package com.suggestinator.restapi.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="book_name")
    private String name;
    
    @Column(name="book_author")
    private String author;
    
    @Column(name="book_rating")
    private String rating;
    
    @Column(name="book_description")
    private String description;
    
    @Column(name="book_pages")
    private int pages;
    
    @Column(name="book_category")
    private String category;

    @Column(name="cover_url")
    private String cover_url;

    public Book(){

    }
    
    public Book(String name, String author, String rating, String description, int pages, String category, String cover_url) {
        this.name = name;
        this.author = author;
        this.rating = rating;
        this.description = description;
        this.pages = pages;
        this.category = category;
        this.cover_url = cover_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCover_url() {
        return cover_url;
    }

    public void setCover_url(String cover_url) {
        this.cover_url = cover_url;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", author=" + author + ", rating=" + rating + ", description="
                + description + ", pages=" + pages + ", category=" + category + ", cover_url=" + cover_url + "]";
    }
}
