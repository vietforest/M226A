package Class;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;
    private String pseudonym;

    public Author(String name, String surname, String pseudonym) {
        this.name = name;
        this.surname = surname;

        if (pseudonym != null || !pseudonym.equals("")) {
            this.pseudonym = pseudonym;
        }
        else {
            this.pseudonym = name + " " + surname;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(pseudonym, author.pseudonym);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(pseudonym);
    }
}
