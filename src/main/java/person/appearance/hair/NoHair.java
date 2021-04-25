package person.appearance.hair;

public class NoHair extends Hair {

    public NoHair(final String color) {
        super(color);
    }

    @Override
    public final String toString() {
        return "нет";
    }
}
