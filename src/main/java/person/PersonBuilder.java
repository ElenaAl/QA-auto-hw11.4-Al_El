package person;

import generators.AppearanceGenerator;
import generators.FioGenerator;
import generators.PhoneGenerator;
import generators.PhysGenerator;
import person.appearance.Appearance;

public class PersonBuilder {

    private Fio fio;
    private Physical phys;
    private Appearance appearance;
    private Phone phone;


    public final PersonBuilder withFio(final int input) {

        this.fio = FioGenerator.getInstance().generate(input);
        return this;
    }

    public final PersonBuilder withPhys(final int input) {
        final PhysGenerator physGenerator = new PhysGenerator();
        this.phys = physGenerator.generate(input);
        return this;
    }

    public final PersonBuilder withAppearance(final int input) {
        final AppearanceGenerator appearanceGenerator = new AppearanceGenerator();
        this.appearance = appearanceGenerator.generate(input);
        return this;
    }

    public final PersonBuilder withPhone(final int input, final String inputId) {
        // добавляем телефон, только если введённый код не палиндром
        if (!inputId.equals(new StringBuilder(inputId).reverse().toString())) {
            final PhoneGenerator phoneGenerator = new PhoneGenerator();
            this.phone = phoneGenerator.generate(input);
        }
        return this;
    }

    public final Person build(final int input,final String inputId) {
        withAppearance(input);
        withPhys(input);
        withFio(input);
        withPhone(input,inputId);
        final Person person = new Person(inputId, this.fio, this.phys, this.appearance, this.phone);

        return person;
    }

}
