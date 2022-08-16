public class bookIplimented {
    public static void main(String[] args) {
        book object = new book();
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
