package Chapter12;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class User {
    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }



    public static void main(String[] args) {
        User user1 = new User("id1", "jiwoo");
        User user2 = new User("id1", "jiwoo2");
        User user3 = new User("id2", "moong");
        Set<User> set = new HashSet<User>();
        set.add(user1);
        set.add(user2);
        set.add(user3);

        System.out.println(set.size());
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());
        System.out.println(set);
    }
}
