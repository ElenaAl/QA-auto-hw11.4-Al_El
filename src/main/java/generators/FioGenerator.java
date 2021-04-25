package generators;

import person.Fio;

import static utils.FileReader.getLinesFromFile;
import static utils.MyMath.getDigitsSum;

public class FioGenerator extends GeneratorAbstract<Fio> {

    private String lastName;
    private String firstName;
    private String middleName;

    //реализуем паттерн Singleton. конструктор обязательно приватный

    private static FioGenerator INSTANCE;

    private FioGenerator (){
    }

    public static FioGenerator getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new FioGenerator();
        }
        return INSTANCE;
    }


    /**
     * ФИО берутся из соответствующих файлов по индексу в листе:
     * Фамилия - сумма цифр в коде
     * Имя - сумма первых двух цифр
     * Отчество - сумма последних двух цифр.
     *
     * @param code код для генерации
     */
    @Override
    public final void generateParams(final int code) {
        final int lastNameIndex = getDigitsSum(code);
        final String sex = (lastNameIndex % 2 == 0) ? "f" : "m";
        setLastNameFromFile(lastNameIndex, sex);
        setFirstNameFromFile(getDigitsSum(code / 100), sex);
        setMiddleNameFromFile(getDigitsSum(code % 100), sex);
    }

    public final String getLastName() {
        return lastName;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final String getMiddleName() {
        return middleName;
    }

    private void setLastNameFromFile(final int i, final String sex) {
        lastName = getLinesFromFile("lastNames_" + sex).get(i);
    }

    private void setFirstNameFromFile(final int i, final String sex) {
        firstName = getLinesFromFile("names_" + sex).get(i);
    }

    private void setMiddleNameFromFile(final int i, final String sex) {
        middleName = getLinesFromFile("middleNames_" + sex).get(i);
    }

    @Override
    public final Fio buildResponse() {
      return new Fio(getLastName(), getFirstName(), getMiddleName());
    }
}

