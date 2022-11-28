
import java.util.ArrayList;

public class TestLearner {
    public static void main(String [] args) {
        ArrayList<Learner> list = new ArrayList<>();
        list.add(new Student("Alexander"));
        list.add(new Student("Igor"));
        list.add(new Student("Egor"));
        list.add(new Pupil("Nikita"));
        list.add(new Pupil("Ilya"));
        list.add(new Pupil("Mikhail"));

        System.out.println("Students:");


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getType().equals("Student")) {
                System.out.println(list.get(i).getName());
            }
        }

        System.out.println('\n' + "Pupil:");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getType().equals("Pupil")) {
                System.out.println(list.get(i).getName());
            }
        }


    }
}
