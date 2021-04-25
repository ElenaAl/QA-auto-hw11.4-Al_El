package generators;

abstract class GeneratorAbstract<T> {

    public final T generate(final int code) {
        generateParams(code);
        return buildResponse();

    }
    protected abstract void generateParams(int code);

    protected abstract T buildResponse();
}
