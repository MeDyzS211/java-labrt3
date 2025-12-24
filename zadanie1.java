public class Zadanie1 {

    // свойства контакта
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String note;

    // конструктор (без note)
    public Zadanie1(int id, String firstName, String lastName, String address, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
    }

    // геттеры
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getNote() {
        return note;
    }

    // сеттеры
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setNote(String note) {
        this.note = note;
    }

    // вывод полной информации об объекте
    @Override
    public String toString() {
        return "Контакт:\n" +
               "ID: " + id + "\n" +
               "Имя: " + firstName + "\n" +
               "Фамилия: " + lastName + "\n" +
               "Адрес: " + address + "\n" +
               "Телефон: " + phone + "\n" +
               "Заметка: " + note;
    }
}
