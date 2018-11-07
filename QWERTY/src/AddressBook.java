public class AddressBook {

    private User addressBookRecords[] = new User[5];

    //
    void fillAllUserArray() {
        addressBookRecords[0] = new User("Aniela", "Krzywon", 76, "Strzegomska 140a", 'M');
        addressBookRecords[1] = new User("Jolanta", "Bernardowicz", 45, "Dąbrowskiego 74", 'F');
        addressBookRecords[2] = new User("Antoni", "Lasota", 67, "Rogowska 17c/44", 'M');
        addressBookRecords[3] = new User("Magdalena", "Krzywicka", 22, "Pl.Jana Pawła 5/4", 'F');
        addressBookRecords[4] = new User("Andrzej", "Kruk", 12, "Konna 5a/12", 'M');
    }

    //printing a list
    public void printUsers() {
        for (int i = 0; i < addressBookRecords.length; i++) {
            System.out.println((i+1)+"."+ addressBookRecords[i]);
        }
        System.out.print("\n");
    }

    //new user to be added
    public void addUserToAddressBook(User user) {
        User[] newUserArray = new User[this.addressBookRecords.length + 1];
        for (int i = 0; i < this.addressBookRecords.length; i++) {
            newUserArray[i] = addressBookRecords[i];
        }
        newUserArray[newUserArray.length - 1] = user;
        this.addressBookRecords = newUserArray;
    }
}
