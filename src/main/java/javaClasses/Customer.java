package javaClasses;

public class Customer {
    int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    long nubmerofcreditcard;
    long numberofbankaccount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getNubmerofcreditcard() {
        return nubmerofcreditcard;
    }

    public void setNubmerofcreditcard(long nubmerofcreditcard) {
        this.nubmerofcreditcard = nubmerofcreditcard;
    }

    public long getNumberofbankaccount() {
        return numberofbankaccount;
    }

    public void setNumberofbankaccount(long numberofbankaccount) {
        this.numberofbankaccount = numberofbankaccount;
    }

    @Override
    public String toString() {
        return "Custome{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", nubmerofcreditcard=" + nubmerofcreditcard +
                ", numberofbankaccount=" + numberofbankaccount +
                '}';
    }






    public Customer(int id, String surname, String name, String patronymic, String address, long nubmerofcreditcard, long numberofbankaccount) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.nubmerofcreditcard = nubmerofcreditcard;
        this.numberofbankaccount = numberofbankaccount;
    }

    public Customer(int id, String surname, String name, String patronymic) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }




}
