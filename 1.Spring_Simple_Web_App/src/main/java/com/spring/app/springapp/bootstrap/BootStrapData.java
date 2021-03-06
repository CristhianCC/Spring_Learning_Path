package com.spring.app.springapp.bootstrap;

import com.spring.app.springapp.domain.Author;
import com.spring.app.springapp.domain.Book;
import com.spring.app.springapp.domain.Publisher;
import com.spring.app.springapp.repositories.AuthorRepository;
import com.spring.app.springapp.repositories.BookRepository;
import com.spring.app.springapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher mattMurdock = new Publisher("Matt Murdock",
                "Address line 1", "city", "state", "zip");

        publisherRepository.save(mattMurdock);

        Author chris = new Author("Chris", "Evans");
        Book captainAmerica = new Book("Captain America", "123123");
        chris.getBooks().add(captainAmerica);
        captainAmerica.getAuthors().add(chris);

        captainAmerica.setPublisher(mattMurdock);
        mattMurdock.getBooks().add(captainAmerica);

        authorRepository.save(chris);
        bookRepository.save(captainAmerica);
        publisherRepository.save(mattMurdock);

        Author tom = new Author("Tom", "Holland");
        Book spiderMan = new Book("Spiderman", "123124");
        tom.getBooks().add(spiderMan);
        spiderMan.getAuthors().add(tom);

        spiderMan.setPublisher(mattMurdock);
        mattMurdock.getBooks().add(spiderMan);

        authorRepository.save(tom);
        bookRepository.save(spiderMan);
        publisherRepository.save(mattMurdock);


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of Authors: " + authorRepository.count());
        System.out.println("Publisher: " + publisherRepository.findById(mattMurdock.getId()).get());
        System.out.println("Publisher Number of Books: " + mattMurdock.getBooks().size());
    }
}
