package Data;

public class BookImpl {
    public static void main(String[] args) {
        Book object = new Book();
        object.setTitle("gdfgdf");
        object.setAuthorName("dfsfrg");
        object.setYearOfPublishing(2021);
        object.setiSBNNumber(125533515);
        System.out.println("object.title = " + object.getTitle());
        System.out.println("object.authorName = " + object.getAuthorName());
        System.out.println("object.yearOfPublishing = " + object.getYearOfPublishing());
        System.out.println("object.iSBNNumber = " + object.getiSBNNumber());
    }
}
