import person.Person;
import person.PersonBuilder;

public class InputProcessor {

    public final String processInput(final String input) {
        String result;

        if (input.trim().matches("\\d{4}")) {
            // Создаём Person
           final int intCode = Integer.parseInt(input);
            Person person = new PersonBuilder().build(intCode, input);
            result = person.toString();
        } else {
            result = "Неверный ввод.";
        }
        return result;
    }
}
