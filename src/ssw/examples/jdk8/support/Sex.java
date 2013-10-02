/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ssw.examples.jdk8.support;

/**
 *
 * @author m.genova
 */
public final class Sex {
    
    public static final Sex MALE = new Sex(0);
    public static final Sex FEMALE = new Sex(1);
    
    private int sex = 0;

    private Sex(int sex) {this.sex = sex;}

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.sex;
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
        final Sex other = (Sex) obj;
        if (this.sex != other.sex) {
            return false;
        }
        return true;
    }
}
