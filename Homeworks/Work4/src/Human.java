import com.company.Rectangle;

/**
 * Created by acer on 29.03.2017.
 */
public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean equals(Object obj) {
        Human that = (Human)obj;
        return this.age == that.age;
    }

    public String toString() {
        return this.name + " " + this.age;
    }


}
