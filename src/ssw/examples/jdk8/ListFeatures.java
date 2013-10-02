/*
 * 
 */
package ssw.examples.jdk8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import ssw.examples.jdk8.support.Author;
import ssw.examples.jdk8.support.Sex;

/**
 * 
 * 
 * @author m.genova
 */
public class ListFeatures {
   
    interface CheckAuthor {
        public boolean test(Author p);
    }
    
    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>();
        UUID uuid1 = UUID.randomUUID();
        Author author1 = new Author(uuid1.toString(), "Alessandro", "Manzoni", new Date(), Sex.MALE);
        
        UUID uuid2 = UUID.randomUUID();
        Author author2 = new Author(uuid2.toString(), "Edward", "Hopper", new Date(), Sex.MALE);
        
        UUID uuid3 = UUID.randomUUID();
        Author author3 = new Author(uuid3.toString(), "Stephen", "King", new Date(), Sex.MALE);
        
        UUID uuid4 = UUID.randomUUID();
        Author author4 = new Author(uuid4.toString(), "Pier Paolo", "Pasolini", new Date(), Sex.MALE);
        
        UUID uuid5 = UUID.randomUUID();
        Author author5 = new Author(uuid5.toString(), "Virginia", "Woolf", new Date(), Sex.FEMALE);
        
        authors.add(author1);
        authors.add(author2);
        authors.add(author3);
        authors.add(null);
        authors.add(author4);
        authors.add(author5);
        
        System.out.println(authors.size());
        
        //create anonymous class
        class SimpleChecker implements CheckAuthor {
            public boolean test(Author p) {
                return p != null;
            }
        }
        
        printAuthors(authors, new SimpleChecker());
    }
    
    /**
     *
     * @param authors
     * @param checker
     */
    public static void printAuthors(
        List<Author> authors, CheckAuthor checker) {
        for (Author author : authors) {
            if (checker.test(author)) {
                author.printAuthor();
            }
        }
    }
}
