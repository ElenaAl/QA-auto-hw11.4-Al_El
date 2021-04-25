package person.appearance;


public enum EyesColor {

    BLUE("голубые", 0),
    GREEN("зелёные", 1),
    BROWN("карие", 2),
    GRAY("серые", 3),
    DIFF("разные", 4);

    private final String ruName;
    private final int code;

    EyesColor(final String ruName, final int code) {
        this.ruName = ruName;
        this.code = code;
    }

    public static String getByRuName(final int value) {

        int valueCheck = value / 2;
        boolean check = false;
        EyesColor[] allColors = EyesColor.values();
            for (EyesColor color : allColors) {
                if ((color.code) == valueCheck) {
                    check = true;
                    return color.ruName;
                }
            }
            if (!check) {
            throw new IllegalStateException("Unexpected value: " + value / 2);
            }

        return null;
    }

    @Override
    public final String toString() {
        return this.name() + "(" + this.ruName + ")";
    }
}
