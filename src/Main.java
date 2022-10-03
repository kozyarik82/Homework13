public class Main {

    public static void main(String[] args) {
        Author gustaveFlaubert = new Author(" Gustave ", " Flaubert ");
        Author fyodorDostoyevsky = new Author(" Fyodor ", " Dostoyevsky ");
        Book madameBovary = new Book(" Madame Bovary ", gustaveFlaubert, 2013);
        Book theBrothersKaramazov = new Book(" The Brothers Karamazov ", fyodorDostoyevsky, 2004);
        madameBovary.setYearPublication(2001);
        System.out.println(madameBovary.getYearPublication());
        System.out.println(gustaveFlaubert);
        System.out.println(madameBovary);
        System.out.println(gustaveFlaubert.equals(fyodorDostoyevsky));
        System.out.println(madameBovary.equals(theBrothersKaramazov));

    }


}