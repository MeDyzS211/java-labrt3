public class Zadanie2 {

    private int groupId;
    private Zadanie1[] contacts;

    // конструктор по умолчанию
    public Zadanie2() {
        this.groupId = 1;
        this.contacts = new Zadanie1[0];
    }

    // конструктор с массивом объектов
    public Zadanie2(int groupId, Zadanie1[] contacts) {
        this.groupId = groupId;
        this.contacts = contacts;
    }

    // геттеры и сеттеры
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Zadanie1[] getContacts() {
        return contacts;
    }

    public void setContacts(Zadanie1[] contacts) {
        this.contacts = contacts;
    }

    // получить объект из массива по индексу
    public Zadanie1 getContact(int index) {
        return contacts[index];
    }

    // установить объект в массив по индексу
    public void setContact(int index, Zadanie1 contact) {
        contacts[index] = contact;
    }

    // добавление контакта
    public void addContact(Zadanie1 contact) {
        Zadanie1[] newArray = new Zadanie1[contacts.length + 1];

        for (int i = 0; i < contacts.length; i++) {
            newArray[i] = contacts[i];
        }

        newArray[newArray.length - 1] = contact;
        contacts = newArray;
    }

    // удаление контакта по id
    public void removeContactById(int id) {
        int count = 0;

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getId() != id) {
                count++;
            }
        }

        Zadanie1[] newArray = new Zadanie1[count];
        int index = 0;

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getId() != id) {
                newArray[index++] = contacts[i];
            }
        }

        contacts = newArray;
    }

    // сортировка по фамилии (простая)
    public void sortByLastName() {
        for (int i = 0; i < contacts.length - 1; i++) {
            for (int j = i + 1; j < contacts.length; j++) {
                if (contacts[i].getLastName()
                        .compareTo(contacts[j].getLastName()) > 0) {

                    Zadanie1 temp = contacts[i];
                    contacts[i] = contacts[j];
                    contacts[j] = temp;
                }
            }
        }
    }
}
