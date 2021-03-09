package com.spring.app.springapp.repositories;

import com.spring.app.springapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
