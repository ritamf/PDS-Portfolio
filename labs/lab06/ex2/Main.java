public class Main {
    public static void main(String[] args) {
        Contacts list_contacts = new Contacts();
        list_contacts.openAndLoad(new ContactsStorage("contacts", FileType.bin));

        list_contacts.add(new Contact("Joao", 1));
        list_contacts.add(new Contact("Maria", 2));
        list_contacts.add(new Contact("Rui", 3));

        Contact mae = list_contacts.getByName("Joao");
        System.out.println(list_contacts.exist(mae));
        list_contacts.remove(mae);
        System.out.println(list_contacts.exist(mae));
        System.out.println(list_contacts.getByName("Maria"));

        list_contacts.saveAndClose(new ContactsStorage("contacts", FileType.bin));
    }
}
