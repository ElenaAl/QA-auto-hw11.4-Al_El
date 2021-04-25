package generators;
import person.appearance.Appearance;
import person.appearance.EyesColor;
import person.appearance.hair.Hair;
import person.appearance.hair.HairColor;
import person.appearance.hair.LongHair;
import person.appearance.hair.NoHair;
import person.appearance.hair.ShortHair;


public class AppearanceGenerator extends GeneratorAbstract<Appearance> {

    private String eyes;
    private int hairLength;
    private String hairColor;

    /**
     * Внешность генерируется по третьей цифре кода (i):
     * Глаза: по индексу i/2 (=0..4)
     * Длина волос: i
     * Цвет волос: из enum по индексу i-1 при i>0 (=0..8).
     */
    @Override
    public final void generateParams(final int code) {
        final int i = code % 100 / 10;
        eyes = EyesColor.getByRuName(i);
        hairLength = i;
        HairColor color = new HairColor();
        hairColor = color.getHairColor(i);
    }

    @Override
    public final Appearance buildResponse() {
        Hair hair;
        if (hairLength > 0) {
            hair = (hairLength > 4) ? new LongHair(hairColor) : new ShortHair(hairColor);
        } else {
            hair = new NoHair(hairColor);
        }
        return new Appearance(eyes, hair);
    }
}

