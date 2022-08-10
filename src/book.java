public class book {
    String title;
    int yearOfPublishing;
    long iSBNNumber;
    String authorName;

    public static void main(String[] args) {
        book object = new book();
        System.out.println(object.title);
        System.out.println(object.authorName);
        System.out.println(object.iSBNNumber);
        System.out.println(object.yearOfPublishing);
        object.title = "Complete reference 12th edition";
        object.authorName = "Herbert Schildth";
        object.yearOfPublishing = 2022;
        object.iSBNNumber = 1234567891234455L;
        System.out.println(object.title);
        System.out.println(object.authorName);
        System.out.println(object.iSBNNumber);
        System.out.println(object.yearOfPublishing);
    }
}
