package com.spring.app.springapp.domain.repositories;

import com.spring.app.springapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
