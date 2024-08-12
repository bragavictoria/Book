package esoft.book.model;

import esoft.com.util.Validator;

import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Date;


public class Book {
    private final int id;
    private final String title;
    private Date pubDate;
    private String publisher;
    public String subject;
    private String desc;
    private String thumbnail;
    private String image;
    private double srp;
    private Date avail;
    private String isbn;
    private int page;
    public String backing;
    private double dimensions;
    public String author;

    public class Item {
        private int id;
        private String title;

        public Item (int id, String title) {
            this.id = id;
            this.title = title;
        }

        public int getId(){
            return id;
        }

        public String getTitle(){
            return title;
        }
    }

    private final Item item;

    public Book (
            int id,
            String title,
            Date pubDate,
            String publisher,
            String subject,
            String desc,
            String thumbnail,
            String image,
            double srp,
            Date avail,
            String isbn,
            int page,
            String backing,
            double dimensions,
            String author) {

            Item item = new Item(id, title);

            Validator.validateNotNull(pubDate, "A data não pode ser nula");
            this.pubDate = pubDate;

            Validator.validateNotNull(avail, "A data de disponibilidade não pode ser nulo");
            this.avail = avail;

            Validator.validateNotNull(subject, "O assunto não pode ser nulo");
            this.subject = subject;

            Validator.validateNotNull(backing, "O tipo de encadernação não pode ser nula");
            this.backing = backing;

            Validator.validateNotNull(author, "O autor não pode ser nulo");
            this.author = author;

            this.id = id;
            this.title = title;
            this.item = new Item(id,title);

            setPublisher(publisher);
            setDesc(desc);
            setThumbnail(thumbnail);
            setImage(image);
            setSrp(srp);
            setIsbn(isbn);
            setPage(page);
            setDimensions(dimensions);
    }

        private static final String GENERAL_STRING_REGEX = "^[\\p{L} ,.&'-]+$";
        private static final int PUBLISHER_MAX_LENGTH = 100;
        private static final int DESC_MAX_LENGTH = 1000;
        private static final int THUMBNAIL_MAX_LENGTH = 200;
        private static final int IMAGE_MAX_LENGTH = 200;
        private static final int DIMENSIONS_MAX_LENGTH = 50;
        private static final String ISBN_REGEX = "(^\\d{9}[\\dX]$)|(^\\d{13}$)";

        public void setPublisher(String publisher) {
            if (!publisher.matches(GENERAL_STRING_REGEX)) {
                throw new IllegalArgumentException("O nome do editor contém caracteres inválidos");
            }
            if (publisher.length() > (PUBLISHER_MAX_LENGTH)) {
                throw new IllegalArgumentException("O nome do editor deve ter no máximo " + PUBLISHER_MAX_LENGTH + " caracteres");
            }
            this.publisher = publisher;
        }

        public void setDesc(String desc){
            if (desc.length() > DESC_MAX_LENGTH) {
                throw new IllegalArgumentException("O desconto deve ter no máximo " + DESC_MAX_LENGTH + " caracteres");
            }
            this.desc = desc;
        }

        public void setThumbnail(String thumbnail){
            if (thumbnail.length() > THUMBNAIL_MAX_LENGTH) {
                throw new IllegalArgumentException("A URL deve ter no máximo " + THUMBNAIL_MAX_LENGTH + " caracteres");
            }
            this.thumbnail = thumbnail;
        }

        public void setImage(String image){
            if (image.length() > IMAGE_MAX_LENGTH) {
            throw new IllegalArgumentException("A URL deve ter no máximo " + IMAGE_MAX_LENGTH + " caracteres");
            }
            this.image = image;
        }

        public void setDimensions(Double dimensions){
            DecimalFormat df = new DecimalFormat("0.###############################");
            String dimensionsStr = df.format(dimensions);
            if (dimensionsStr.length() > DIMENSIONS_MAX_LENGTH) {
            throw new IllegalArgumentException("A dimensão deve ter no máximo " + DIMENSIONS_MAX_LENGTH + " caracteres");
            }
            this.dimensions = dimensions;
        }

        public void setIsbn(String isbn){
            if (!isbn.matches(ISBN_REGEX)) {
                throw new IllegalArgumentException("O ISBN contém formato incorreto");
            }
            this.isbn = isbn;
        }

        //private static void validatePositive (double number) {
        //    if (number <= 0) {
        //        throw new IllegalArgumentException("O valor deve ser positivo.");
        //    }
        //}

        public void setSrp (double srp) {
            Validator.validatePositive(srp, "O preço sugerido deve ser positivo");
            this.srp = srp;
        }

        public void setPage (int page) {
            Validator.validatePositive(page, "O número de páginas deve ser positivo");
            this.page = page;
        }
        public static void main (String [] args){
    }

    public int getItemId(){
            return item.getId();
    }

    public String getItemTitle(){
        return item.getTitle();
    }

    public Date getPubDate(){
        return pubDate;
    }

    public String getPublisher(){
        return publisher;
    }

    public String getSubject() {
        return subject;
    }

    public String getDesc(){
        return desc;
    }

    public String getThumbnail(){
        return thumbnail;
    }

    public String getImage(){
        return image;
    }

    public double getSrp(){
        return srp;
    }

    public Date getAvail(){
        return avail;
    }

    public String getIsbn(){
        return isbn;
    }

    public int getPage(){
        return page;
    }

    public String getBacking(){
            return backing;
    }

    public double getDimensions(){
        return dimensions;
    }

    public String getAuthor(){
        return author;
    }
}