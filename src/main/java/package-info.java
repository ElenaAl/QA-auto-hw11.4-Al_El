/*
 * Singleton:   применён - почему
 * релизовала для FioGenerator, так как в нем используем чтение данных из внешних ресурсов,
 * т.е. из файлов на диске.
 *
 * Factory:     применён - почему
 * 1) применила в классе AppearanceGenerator для определения цвета глаз через EyesColor. Вынесла метод в EyesColor
 * и решила, что можно реализовать через Enum, так как от глаз нам требуется получить только String с названием цвета.
 * 2) применила в классе AppearanceGenerator для определения цвета волос HairColor, метод вынесла в отдельный класс
 *
 *
 * Builder:     применён - почему
 * реализовала для Person. Показалось, что неудобно, когда генерация данных для person в файле inputProcessor,
 *  и получалось, что частично person в Person, а частично  в InputProcessor
 *
 * Adapter:     (не)применён - почему
 * не нашла класса, которому был бы нужен адаптер
 *
 * Bridge:      применён - почему
 * реализовала для наследников Hair, хотя в данном случае, думаю было не обязательно, так как параметров мало,
 *  по количеству кода особой разницы нет
 *
 * Facade:      применён - почему
 * если я все правильно поняла, то  при реализации Builder одновременно реализовали и Facade ^_^
 *
 * DTO:         применён - почему
 * реализовала для ФИО, добавила класс, в генераторе оставив только генератор значений, а в Person сделала один парметр
 * ФИО вместо 3 отдельных.
 * На мой взгляд так и понятнее и легче менять код
 *
 * Шаблон:      применён - почему
 * реализовала в классе Person, чтобы писать один метод для генераторов вместо двух.
 * Также не надо думать, какой метод вызывать первым
 */