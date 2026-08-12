package in.ari.service;

import java.util.List;

import in.ari.entity.Book;

public interface BookService {
	public String upsertBook(Book book);
    public List<Book> getAllBooks();
	//public String updateBook(Book book);
	public String deleteBook(Integer bookId);

}
