package in.ari.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ari.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable>{
}




