public class ParametrosInvalidosException extends Exception {
    private final String messagemDeErro;

    public ParametrosInvalidosException(String messagemDeErro) {
        this.messagemDeErro = messagemDeErro;
    }

    @Override
    public String getMessage() {
        return messagemDeErro;
    }
}