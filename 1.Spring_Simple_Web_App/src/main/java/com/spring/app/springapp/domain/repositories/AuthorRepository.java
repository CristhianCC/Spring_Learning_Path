package com.spring.app.springapp.domain.repositories;

import com.spring.app.springapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
