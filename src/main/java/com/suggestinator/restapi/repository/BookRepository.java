package com.suggestinator.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.suggestinator.restapi.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
