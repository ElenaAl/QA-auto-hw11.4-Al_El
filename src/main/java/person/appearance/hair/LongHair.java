package person.appearance.hair;

public class LongHair extends Hair {

    public LongHair(final String color) {
        super(color);
    }

    @Override
    public final String toString() {
        return "длинные, " + color;
    }
}
