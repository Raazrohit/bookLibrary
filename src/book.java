public class book {
    private String title;
    private int yearOfPublishing;
    private long iSBNNumber;
    private String authorName;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public long getiSBNNumber() {
        return iSBNNumber;
    }

    public void setiSBNNumber(long iSBNNumber) {
        this.iSBNNumber = iSBNNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
   /* public static void main(String[] args) {
        book object = new book();
        System.out.println(object.title);
        System.out.println(object.authorName);
        System.out.println(object.iSBNNumber);
        System.out.println(object.yearOfPublishing);
        object.title = "Complete reference 12th edition";
        object.authorName = "Herbert Schildth";
        object.yearOfPublishing = 2022;
        object.iSBNNumber = 123456789L;
        System.out.println(object.title);
        System.out.println(object.authorName);
        System.out.println(object.iSBNNumber);
        System.out.println(object.yearOfPublishing);
    }*/
}
