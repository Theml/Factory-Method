public class LogisticaFactory {

    public static ILogistica obterLogistica(String logistica) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("factorymethod.Logistica" + logistica);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof ILogistica)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (ILogistica) objeto;
    }
}
