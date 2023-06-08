package jiho.spring.mvc.book.boookmarket.model;

public class Book {
    private String bookId;
    private String name;
    private int unitPrice;
    private String author;
    private String description;
    private String publisher;
    private String category;
    private long unitInStock;
    private String releaseDate;
    private String condition;

    public Book() {
    }


    public Book(String bookId, String name, int unitPrice) {
        this.bookId = bookId;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(long unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append("bookId='").append(bookId).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", author='").append(author).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", publisher='").append(publisher).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append(", unitInStock=").append(unitInStock);
        sb.append(", releaseDate='").append(releaseDate).append('\'');
        sb.append(", condition='").append(condition).append('\'');
        sb.append('}');
        return sb.toString();
    }



}