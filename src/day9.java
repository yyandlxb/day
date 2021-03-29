import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

public class day9 {

    public day9() {
    }

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        User user = new User();
        user.setAge(1);
        user.setName("A");
        User user1 = new User();
        user1.setAge(1);
        user1.setName("A");
        User user2 = new User();
        user2.setAge(1);
        user2.setName("A");
        User user3 = new User();
        user3.setAge(1);
        user3.setName("b");
        User user4 = new User();
        user4.setAge(1);
        user4.setName("x");
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        ArrayList<User> collect = users.stream().collect(collectingAndThen(
                toCollection(() -> new TreeSet<>(Comparator.comparing(User::getName))), ArrayList::new));
        collect.forEach(e-> System.out.println(e.getName()));


    }


    public static class User{

        private String name;

        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
