package se.lexicon.patrik.model;

public class Person {
    final int personId;
    private String firstName;
    private String lastName;

    public Person(int personId, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personId = personId;
    }







    /*
    Getters and setters start
     */

    public int getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}