public class Main {

    public static void main(String[] args) {

        Book b = new Book();
        // use setters to set values
        b.setAuthor("Nora");
        b.setPages(100);
        b.setCode("1024");
        b.setDescription("how to use inheritance");
        b.setPrice(100);

        Book c = new Book();
        // use setters to set values
        c.setCode("Java2003");
        c.setDescription("how to use java");
        c.setPrice(194);


        Software s = new Software();
        // use setters to set values
        s.setCode("IntelliJ");
        s.setDescription("JAVA IDE");
        s.setPrice(24.99);

        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(s.toString());
    }

}