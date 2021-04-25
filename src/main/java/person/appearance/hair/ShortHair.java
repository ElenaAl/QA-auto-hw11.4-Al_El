package person.appearance.hair;

public class ShortHair extends Hair {

    public ShortHair(final String color) {
        super(color);
    }

    @Override
    public final String toString() {
        return "короткие, " + color;
    }
}
