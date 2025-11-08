 enum Day{monday, thuesday, wednesday, thursday, friday, saturday, sunday};
public class enumuration {
    public static void main(String[] args) {

        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
