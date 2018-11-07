public class Program {
    public static void main(String[] args) {

        User user06 = new User("Gosia", "Majchrowicz", 36, "Dmowskiego 17d/33", 'F');
        AddressBook addressBook = new AddressBook();

        addressBook.fillAllUserArray();
        System.out.println("Pierwsza lista USERÓW, jeszcze przed dodadaniem nowego:");
        addressBook.printUsers();
        addressBook.addUserToAddressBook(user06);
        System.out.println("Nowa lista USERÓW:");
        addressBook.printUsers();

    }
}
