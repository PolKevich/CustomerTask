package by.training.task03.customertask;

import java.util.Objects;

public class Customer {

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int creditCardNumber;
    private int bankAccountNumber;

    public Customer(int id, String surname, String name, String patronymic, String address,
                    int creditCardNumber, int bankAccountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }


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

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String toString() {
        String str = id + ":" + surname + " " + name + " " + patronymic +
                "." + address + " : " + creditCardNumber + " : " + bankAccountNumber;
        return str;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, address, creditCardNumber, bankAccountNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return id == customer.id && creditCardNumber == customer.creditCardNumber &&
                bankAccountNumber == customer.bankAccountNumber &&
                surname.equals(customer.surname) && name.equals(customer.name) &&
                patronymic.equals(customer.patronymic) && address.equals(customer.address);
    }
}
