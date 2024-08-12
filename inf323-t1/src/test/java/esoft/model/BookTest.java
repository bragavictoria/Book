package esoft.model;
import esoft.book.model.Book;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BookTest {

    @Test
    public void testValidBook () {
        int id = 1;
        String title = "Título";
        Date pubDate = new Date(2024,1,10);
        String publisher = "Editor";
        String subject = "Assunto";
        String desc = "Descrição";
        String thumbnail = "http://teste.com/miniatura.jpg";
        String image = "http://teste.com/capa.jpg";
        double srp = 100.00;
        Date avail = new Date(2024,5,25);
        String isbn = "0000000000001";
        int page = 200;
        String backing = "Tipo de encadernaçao";
        double dimensions = 30.00;
        String author = "Autor";

        Book book = new Book(id, title, pubDate, publisher, subject, desc, thumbnail, image, srp, avail, isbn, page, backing, dimensions, author);

        assertNotNull(book.getPubDate());
        assertEquals(publisher, book.getPublisher());
        assertEquals(subject, book.getSubject());
        assertEquals(desc, book.getDesc());
        assertEquals(thumbnail, book.getThumbnail());
        assertEquals(image , book.getImage());
        assertEquals(srp, book.getSrp(),0.01);
        assertNotNull(book.getAvail());
        assertEquals(isbn, book.getIsbn());
        assertEquals(page, book.getPage());
        assertEquals(backing, book.getBacking());
        assertEquals(dimensions, book.getDimensions(), 0.01);
        assertEquals(author, book.getAuthor());
        assertEquals(id, book.getItemId());
        assertEquals(title, book.getItemTitle());
    }

    @Test
    public void testPubDate () {
        int id = 1;
        String title = "Título";
        Date pubDate = null;
        String publisher = "Editor";
        String subject = "Assunto";
        String desc = "Descrição";
        String thumbnail = "http://teste.com/miniatura.jpg";
        String image = "http://teste.com/capa.jpg";
        double srp = 100.00;
        Date avail = new Date(2024,5,25);
        String isbn = "0000000000001";
        int page = 200;
        String backing = "Tipo de encadernaçao";
        double dimensions = 30.00;
        String author = "Autor";

        Book book = new Book(id, title, pubDate, publisher, subject, desc, thumbnail, image, srp, avail, isbn, page, backing, dimensions, author);

        assertNotNull(book.getPubDate());
        assertEquals(publisher, book.getPublisher());
        assertEquals(subject, book.getSubject());
        assertEquals(desc, book.getDesc());
        assertEquals(thumbnail, book.getThumbnail());
        assertEquals(image , book.getImage());
        assertEquals(srp, book.getSrp(),0.01);
        assertNotNull(book.getAvail());
        assertEquals(isbn, book.getIsbn());
        assertEquals(page, book.getPage());
        assertEquals(backing, book.getBacking());
        assertEquals(dimensions, book.getDimensions(), 0.01);
        assertEquals(author, book.getAuthor());
        assertEquals(id, book.getItemId());
        assertEquals(title, book.getItemTitle());
    }

    @Test
    public void testPublisherFormat() {
        int id = 1;
        String title = "Título";
        Date pubDate = new Date(2024,1,10);
        String publisher = "Edit@r";
        String subject = "Assunto";
        String desc = "Descrição";
        String thumbnail = "http://teste.com/miniatura.jpg";
        String image = "http://teste.com/capa.jpg";
        double srp = 100.00;
        Date avail = new Date(2024,5,25);
        String isbn = "0000000000001";
        int page = 200;
        String backing = "Tipo de encadernaçao";
        double dimensions = 30.00;
        String author = "Autor";

        Book book = new Book(id, title, pubDate, publisher, subject, desc, thumbnail, image, srp, avail, isbn, page, backing, dimensions, author);

        assertNotNull(book.getPubDate());
        assertEquals(publisher, book.getPublisher());
        assertEquals(subject, book.getSubject());
        assertEquals(desc, book.getDesc());
        assertEquals(thumbnail, book.getThumbnail());
        assertEquals(image , book.getImage());
        assertEquals(srp, book.getSrp(),0.01);
        assertNotNull(book.getAvail());
        assertEquals(isbn, book.getIsbn());
        assertEquals(page, book.getPage());
        assertEquals(backing, book.getBacking());
        assertEquals(dimensions, book.getDimensions(), 0.01);
        assertEquals(author, book.getAuthor());
        assertEquals(id, book.getItemId());
        assertEquals(title, book.getItemTitle());
    }

    @Test
    public void testPublisherLenght() {
        int id = 1;
        String title = "Título";
        Date pubDate = new Date(2024,1,10);
        String publisher = "Editorxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        String subject = "Assunto";
        String desc = "Descrição";
        String thumbnail = "http://teste.com/miniatura.jpg";
        String image = "http://teste.com/capa.jpg";
        double srp = 100.00;
        Date avail = new Date(2024,5,25);
        String isbn = "0000000000001";
        int page = 200;
        String backing = "Tipo de encadernaçao";
        double dimensions = 30.00;
        String author = "Autor";

        Book book = new Book(id, title, pubDate, publisher, subject, desc, thumbnail, image, srp, avail, isbn, page, backing, dimensions, author);

        assertNotNull(book.getPubDate());
        assertEquals(publisher, book.getPublisher());
        assertEquals(subject, book.getSubject());
        assertEquals(desc, book.getDesc());
        assertEquals(thumbnail, book.getThumbnail());
        assertEquals(image , book.getImage());
        assertEquals(srp, book.getSrp(),0.01);
        assertNotNull(book.getAvail());
        assertEquals(isbn, book.getIsbn());
        assertEquals(page, book.getPage());
        assertEquals(backing, book.getBacking());
        assertEquals(dimensions, book.getDimensions(), 0.01);
        assertEquals(author, book.getAuthor());
        assertEquals(id, book.getItemId());
        assertEquals(title, book.getItemTitle());
    }

    @Test
    public void testSubject() {
        int id = 1;
        String title = "Título";
        Date pubDate = new Date(2024,1,10);
        String publisher = "Editor";
        String subject = null;
        String desc = "Descrição";
        String thumbnail = "http://teste.com/miniatura.jpg";
        String image = "http://teste.com/capa.jpg";
        double srp = 100.00;
        Date avail = new Date(2024,5,25);
        String isbn = "0000000000001";
        int page = 200;
        String backing = "Tipo de encadernaçao";
        double dimensions = 30.00;
        String author = "Autor";

        Book book = new Book(id, title, pubDate, publisher, subject, desc, thumbnail, image, srp, avail, isbn, page, backing, dimensions, author);

        assertNotNull(book.getPubDate());
        assertEquals(publisher, book.getPublisher());
        assertEquals(subject, book.getSubject());
        assertEquals(desc, book.getDesc());
        assertEquals(thumbnail, book.getThumbnail());
        assertEquals(image , book.getImage());
        assertEquals(srp, book.getSrp(),0.01);
        assertNotNull(book.getAvail());
        assertEquals(isbn, book.getIsbn());
        assertEquals(page, book.getPage());
        assertEquals(backing, book.getBacking());
        assertEquals(dimensions, book.getDimensions(), 0.01);
        assertEquals(author, book.getAuthor());
        assertEquals(id, book.getItemId());
        assertEquals(title, book.getItemTitle());
    }

    @Test
    public void testDesc() {
        int id = 1;
        String title = "Título";
        Date pubDate = new Date(2024,1,10);
        String publisher = "Editor";
        String subject = "Assunto";
        String desc = "Descriçãoxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        String thumbnail = "http://teste.com/miniatura.jpg";
        String image = "http://teste.com/capa.jpg";
        double srp = 100.00;
        Date avail = new Date(2024,5,25);
        String isbn = "0000000000001";
        int page = 200;
        String backing = "Tipo de encadernaçao";
        double dimensions = 30.00;
        String author = "Autor";

        Book book = new Book(id, title, pubDate, publisher, subject, desc, thumbnail, image, srp, avail, isbn, page, backing, dimensions, author);

        assertNotNull(book.getPubDate());
        assertEquals(publisher, book.getPublisher());
        assertEquals(subject, book.getSubject());
        assertEquals(desc, book.getDesc());
        assertEquals(thumbnail, book.getThumbnail());
        assertEquals(image , book.getImage());
        assertEquals(srp, book.getSrp(),0.01);
        assertNotNull(book.getAvail());
        assertEquals(isbn, book.getIsbn());
        assertEquals(page, book.getPage());
        assertEquals(backing, book.getBacking());
        assertEquals(dimensions, book.getDimensions(), 0.01);
        assertEquals(author, book.getAuthor());
        assertEquals(id, book.getItemId());
        assertEquals(title, book.getItemTitle());
    }

    @Test
    public void testThumbnail() {
        int id = 1;
        String title = "Título";
        Date pubDate = new Date(2024,1,10);
        String publisher = "Editor";
        String subject = "Assunto";
        String desc = "Descrição";
        String thumbnail = "http://teste.com/miniatura.jpgxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        String image = "http://teste.com/capa.jpg";
        double srp = 100.00;
        Date avail = new Date(2024,5,25);
        String isbn = "0000000000001";
        int page = 200;
        String backing = "Tipo de encadernaçao";
        double dimensions = 30.00;
        String author = "Autor";

        Book book = new Book(id, title, pubDate, publisher, subject, desc, thumbnail, image, srp, avail, isbn, page, backing, dimensions, author);

        assertNotNull(book.getPubDate());
        assertEquals(publisher, book.getPublisher());
        assertEquals(subject, book.getSubject());
        assertEquals(desc, book.getDesc());
        assertEquals(thumbnail, book.getThumbnail());
        assertEquals(image , book.getImage());
        assertEquals(srp, book.getSrp(),0.01);
        assertNotNull(book.getAvail());
        assertEquals(isbn, book.getIsbn());
        assertEquals(page, book.getPage());
        assertEquals(backing, book.getBacking());
        assertEquals(dimensions, book.getDimensions(), 0.01);
        assertEquals(author, book.getAuthor());
        assertEquals(id, book.getItemId());
        assertEquals(title, book.getItemTitle());
    }

    @Test
    public void testImage() {
        int id = 1;
        String title = "Título";
        Date pubDate = new Date(2024,1,10);
        String publisher = "Editor";
        String subject = "Assunto";
        String desc = "Descrição";
        String thumbnail = "http://teste.com/miniatura.jpg";
        String image = "http://teste.com/capa.jpgxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        double srp = 100.00;
        Date avail = new Date(2024,5,25);
        String isbn = "0000000000001";
        int page = 200;
        String backing = "Tipo de encadernaçao";
        double dimensions = 30.00;
        String author = "Autor";

        Book book = new Book(id, title, pubDate, publisher, subject, desc, thumbnail, image, srp, avail, isbn, page, backing, dimensions, author);

        assertNotNull(book.getPubDate());
        assertEquals(publisher, book.getPublisher());
        assertEquals(subject, book.getSubject());
        assertEquals(desc, book.getDesc());
        assertEquals(thumbnail, book.getThumbnail());
        assertEquals(image , book.getImage());
        assertEquals(srp, book.getSrp(),0.01);
        assertNotNull(book.getAvail());
        assertEquals(isbn, book.getIsbn());
        assertEquals(page, book.getPage());
        assertEquals(backing, book.getBacking());
        assertEquals(dimensions, book.getDimensions(), 0.01);
        assertEquals(author, book.getAuthor());
        assertEquals(id, book.getItemId());
        assertEquals(title, book.getItemTitle());
    }

    @Test
    public void testDimensions() {
        int id = 1;
        String title = "Título";
        Date pubDate = new Date(2024,1,10);
        String publisher = "Editor";
        String subject = "Assunto";
        String desc = "Descrição";
        String thumbnail = "http://teste.com/miniatura.jpg";
        String image = "http://teste.com/capa.jpg";
        double srp = 100.00;
        Date avail = new Date(2024,5,25);
        String isbn = "0000000000001";
        int page = 200;
        String backing = "Tipo de encadernaçao";
        double dimensions = 3000000000000000000000000000000000000000000000000000.00;
        String author = "Autor";

        Book book = new Book(id, title, pubDate, publisher, subject, desc, thumbnail, image, srp, avail, isbn, page, backing, dimensions, author);

        assertNotNull(book.getPubDate());
        assertEquals(publisher, book.getPublisher());
        assertEquals(subject, book.getSubject());
        assertEquals(desc, book.getDesc());
        assertEquals(thumbnail, book.getThumbnail());
        assertEquals(image , book.getImage());
        assertEquals(srp, book.getSrp(),0.01);
        assertNotNull(book.getAvail());
        assertEquals(isbn, book.getIsbn());
        assertEquals(page, book.getPage());
        assertEquals(backing, book.getBacking());
        assertEquals(dimensions, book.getDimensions(), 0.01);
        assertEquals(author, book.getAuthor());
        assertEquals(id, book.getItemId());
        assertEquals(title, book.getItemTitle());
    }

    @Test
    public void testAvail () {
        int id = 1;
        String title = "Título";
        Date pubDate = new Date(2024,1,10);
        String publisher = "Editor";
        String subject = "Assunto";
        String desc = "Descrição";
        String thumbnail = "http://teste.com/miniatura.jpg";
        String image = "http://teste.com/capa.jpg";
        double srp = 100.00;
        Date avail = null;
        String isbn = "0000000000001";
        int page = 200;
        String backing = "Tipo de encadernaçao";
        double dimensions = 30.00;
        String author = "Autor";

        Book book = new Book(id, title, pubDate, publisher, subject, desc, thumbnail, image, srp, avail, isbn, page, backing, dimensions, author);

        assertNotNull(book.getPubDate());
        assertEquals(publisher, book.getPublisher());
        assertEquals(subject, book.getSubject());
        assertEquals(desc, book.getDesc());
        assertEquals(thumbnail, book.getThumbnail());
        assertEquals(image , book.getImage());
        assertEquals(srp, book.getSrp(),0.01);
        assertNotNull(book.getAvail());
        assertEquals(isbn, book.getIsbn());
        assertEquals(page, book.getPage());
        assertEquals(backing, book.getBacking());
        assertEquals(dimensions, book.getDimensions(), 0.01);
        assertEquals(author, book.getAuthor());
        assertEquals(id, book.getItemId());
        assertEquals(title, book.getItemTitle());
    }

    @Test
    public void testIsbn () {
        int id = 1;
        String title = "Título";
        Date pubDate = new Date(2024,1,10);
        String publisher = "Editor";
        String subject = "Assunto";
        String desc = "Descrição";
        String thumbnail = "http://teste.com/miniatura.jpg";
        String image = "http://teste.com/capa.jpg";
        double srp = 100.00;
        Date avail = new Date(2024,5,25);
        String isbn = "0001";
        int page = 200;
        String backing = "Tipo de encadernaçao";
        double dimensions = 30.00;
        String author = "Autor";

        Book book = new Book(id, title, pubDate, publisher, subject, desc, thumbnail, image, srp, avail, isbn, page, backing, dimensions, author);

        assertNotNull(book.getPubDate());
        assertEquals(publisher, book.getPublisher());
        assertEquals(subject, book.getSubject());
        assertEquals(desc, book.getDesc());
        assertEquals(thumbnail, book.getThumbnail());
        assertEquals(image , book.getImage());
        assertEquals(srp, book.getSrp(),0.01);
        assertNotNull(book.getAvail());
        assertEquals(isbn, book.getIsbn());
        assertEquals(page, book.getPage());
        assertEquals(backing, book.getBacking());
        assertEquals(dimensions, book.getDimensions(), 0.01);
        assertEquals(author, book.getAuthor());
        assertEquals(id, book.getItemId());
        assertEquals(title, book.getItemTitle());
    }

    @Test
    public void testSrp () {
        int id = 1;
        String title = "Título";
        Date pubDate = new Date(2024,1,10);
        String publisher = "Editor";
        String subject = "Assunto";
        String desc = "Descrição";
        String thumbnail = "http://teste.com/miniatura.jpg";
        String image = "http://teste.com/capa.jpg";
        double srp = -100.00;
        Date avail = new Date(2024,5,25);
        String isbn = "0000000000001";
        int page = 200;
        String backing = "Tipo de encadernaçao";
        double dimensions = 30.00;
        String author = "Autor";

        Book book = new Book(id, title, pubDate, publisher, subject, desc, thumbnail, image, srp, avail, isbn, page, backing, dimensions, author);

        assertNotNull(book.getPubDate());
        assertEquals(publisher, book.getPublisher());
        assertEquals(subject, book.getSubject());
        assertEquals(desc, book.getDesc());
        assertEquals(thumbnail, book.getThumbnail());
        assertEquals(image , book.getImage());
        assertEquals(srp, book.getSrp(),0.01);
        assertNotNull(book.getAvail());
        assertEquals(isbn, book.getIsbn());
        assertEquals(page, book.getPage());
        assertEquals(backing, book.getBacking());
        assertEquals(dimensions, book.getDimensions(), 0.01);
        assertEquals(author, book.getAuthor());
        assertEquals(id, book.getItemId());
        assertEquals(title, book.getItemTitle());
    }

    @Test
    public void testPage () {
        int id = 1;
        String title = "Título";
        Date pubDate = new Date(2024,1,10);
        String publisher = "Editor";
        String subject = "Assunto";
        String desc = "Descrição";
        String thumbnail = "http://teste.com/miniatura.jpg";
        String image = "http://teste.com/capa.jpg";
        double srp = 100.00;
        Date avail = new Date(2024,5,25);
        String isbn = "0000000000001";
        int page = -200;
        String backing = "Tipo de encadernaçao";
        double dimensions = 30.00;
        String author = "Autor";

        Book book = new Book(id, title, pubDate, publisher, subject, desc, thumbnail, image, srp, avail, isbn, page, backing, dimensions, author);

        assertNotNull(book.getPubDate());
        assertEquals(publisher, book.getPublisher());
        assertEquals(subject, book.getSubject());
        assertEquals(desc, book.getDesc());
        assertEquals(thumbnail, book.getThumbnail());
        assertEquals(image , book.getImage());
        assertEquals(srp, book.getSrp(),0.01);
        assertNotNull(book.getAvail());
        assertEquals(isbn, book.getIsbn());
        assertEquals(page, book.getPage());
        assertEquals(backing, book.getBacking());
        assertEquals(dimensions, book.getDimensions(), 0.01);
        assertEquals(author, book.getAuthor());
        assertEquals(id, book.getItemId());
        assertEquals(title, book.getItemTitle());
    }

    @Test
    public void testBacking() {
        int id = 1;
        String title = "Título";
        Date pubDate = new Date(2024,1,10);
        String publisher = "Editor";
        String subject = "Assunto";
        String desc = "Descrição";
        String thumbnail = "http://teste.com/miniatura.jpg";
        String image = "http://teste.com/capa.jpg";
        double srp = 100.00;
        Date avail = new Date(2024,5,25);
        String isbn = "0000000000001";
        int page = 200;
        String backing = null;
        double dimensions = 30.00;
        String author = "Autor";

        Book book = new Book(id, title, pubDate, publisher, subject, desc, thumbnail, image, srp, avail, isbn, page, backing, dimensions, author);

        assertNotNull(book.getPubDate());
        assertEquals(publisher, book.getPublisher());
        assertEquals(subject, book.getSubject());
        assertEquals(desc, book.getDesc());
        assertEquals(thumbnail, book.getThumbnail());
        assertEquals(image , book.getImage());
        assertEquals(srp, book.getSrp(),0.01);
        assertNotNull(book.getAvail());
        assertEquals(isbn, book.getIsbn());
        assertEquals(page, book.getPage());
        assertEquals(backing, book.getBacking());
        assertEquals(dimensions, book.getDimensions(), 0.01);
        assertEquals(author, book.getAuthor());
        assertEquals(id, book.getItemId());
        assertEquals(title, book.getItemTitle());
    }

    @Test
    public void testAuthor() {
        int id = 1;
        String title = "Título";
        Date pubDate = new Date(2024,1,10);
        String publisher = "Editor";
        String subject = "Assunto";
        String desc = "Descrição";
        String thumbnail = "http://teste.com/miniatura.jpg";
        String image = "http://teste.com/capa.jpg";
        double srp = 100.00;
        Date avail = new Date(2024,5,25);
        String isbn = "0000000000001";
        int page = 200;
        String backing = "Tipo de encadernaçao";
        double dimensions = 30.00;
        String author = null;

        Book book = new Book(id, title, pubDate, publisher, subject, desc, thumbnail, image, srp, avail, isbn, page, backing, dimensions, author);

        assertNotNull(book.getPubDate());
        assertEquals(publisher, book.getPublisher());
        assertEquals(subject, book.getSubject());
        assertEquals(desc, book.getDesc());
        assertEquals(thumbnail, book.getThumbnail());
        assertEquals(image , book.getImage());
        assertEquals(srp, book.getSrp(),0.01);
        assertNotNull(book.getAvail());
        assertEquals(isbn, book.getIsbn());
        assertEquals(page, book.getPage());
        assertEquals(backing, book.getBacking());
        assertEquals(dimensions, book.getDimensions(), 0.01);
        assertEquals(author, book.getAuthor());
        assertEquals(id, book.getItemId());
        assertEquals(title, book.getItemTitle());
    }

}