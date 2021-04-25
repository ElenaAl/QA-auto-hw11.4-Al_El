package person;

import generators.AppearanceGenerator;
import generators.FioGenerator;
import generators.PhoneGenerator;
import generators.PhysGenerator;
import person.appearance.Appearance;

public class Person {

    private String id;
    private Fio fio;
    private Physical phys;
    private Appearance appearance;
    private Phone phone;

    public Person (final String id, final Fio fio, final Physical phys, final Appearance appearance, final Phone phone) {
        this.id = id;
        this.fio = fio;
        this.phys = phys;
        this.appearance = appearance;
        this.phone = phone;
    }


   @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(id).append("\n")
                .append(fio).append("\n")
                .append(phys).append("\n")
                .append(appearance).append("\n");
        if (phone != null) {
            sb.append(phone);
        } else {
            sb.append("Телефона нет");
        }
        return sb.toString();
    }

}
