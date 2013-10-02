/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ssw.examples.jdk8.support;

import java.util.Date;
import java.util.Objects;

/**
 * Based on http://docs.oracle.com/javase/tutorial/displayCode.html?code=http://docs.oracle.com/javase/tutorial/java/javaOO/examples/RosterTest.java
 * @author m.genova
 */
public class Author {
    
    private String identifier;
    private String name;
    private String surname;
    private Date birthdate;
    private Sex sex;
    
    /**
     * 
     * @param identifier
     * @param name
     * @param surname
     * @param birthdate 
     */
    public Author(String identifier, String name, String surname, 
            Date birthdate, Sex sex) {
        this.identifier = identifier;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.sex = sex;
    }
    
    /**
     * @return the identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * @param identifier the identifier to set
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the birthdate
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate the birthdate to set
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
    
    @Override
    public String toString() {
        return "Author{" + "name=" + name + ", surname=" + surname + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.identifier);
        hash = 37 * hash + Objects.hashCode(this.birthdate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Author other = (Author) obj;
        if (!Objects.equals(this.identifier, other.identifier)) {
            return false;
        }
        return true;
    }
    
    public void printAuthor() {
        String lineSeparator = System.getProperty("line.separator");
        StringBuilder stringBuilder = new StringBuilder("identifier: ");
        stringBuilder.append(this.getIdentifier());
        stringBuilder.append(lineSeparator);
        stringBuilder.append("name: ");
        stringBuilder.append(this.getName());
        stringBuilder.append(",");
        stringBuilder.append("surname: ");
        stringBuilder.append(this.getSurname());
        stringBuilder.append(lineSeparator);
        stringBuilder.append("age: ");
        
        //XXX format date
        stringBuilder.append(this.getBirthdate());
        stringBuilder.append(lineSeparator);
        stringBuilder.append(lineSeparator);
        
        System.out.print(stringBuilder.toString());
    }
    
}