package entity;

public class MyEntity {



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDate() {
        return bookDate;
    }

    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }

    public MyEntity() {

    }

    public MyEntity(String id, String bookName, String bookDate) {
        this.id = id;
        this.bookName = bookName;
        this.bookDate = bookDate;
    }
    String id;
    String bookName;
    String bookDate;
}
