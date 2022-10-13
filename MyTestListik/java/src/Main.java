import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        SimpleArray<String> TestListik = new SimpleArray<>();
        TestListik .add(0, "zero"); TestListik .add(1,"one");
        TestListik .add(2,"two"); TestListik .add(3,"three");
        TestListik .add(4,"four"); TestListik .add(5,"five");
        TestListik .add(6,"six"); TestListik .add(7,"seven");
        TestListik .add(8,"eight"); TestListik .add(9,"nine");

        //TestListik.remove();
        //TestListik.indexOf();
        //TestListik.lastIndexOf();
        //TestListik.add();
        //TestListik.size();
        //TestListik.get();
        //TestListik.clear();
        //TestListik.contains();
        //TestListik.set();
        //TestListik.getAuthor();
        //TestListik.isEmpty();
        //TestListik.toArray();
        //SimpleArray<String> subTestListik = TestListik.subList(4,6);
        //TestListik.addAll();
        //TestListik.retainAll();
        //TestListik.removeAll();
        //TestListik.containsAll();

        System.out.println(Arrays.toString(TestListik .toArray()));

    }
}
