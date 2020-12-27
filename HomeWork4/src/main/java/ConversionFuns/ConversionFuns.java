package ConversionFuns;
public final class ConversionFuns {
    private ConversionFuns() {}
    public static String ConversionFun_1(final int source) {
        return String.valueOf(source);
    }
    public static String ConversionFun_2(final double source) {
        return String.valueOf(source);
    }
    public static Integer ConversionFun_3(final String source) {
        return Integer.valueOf(source);
    }
    public static Double ConversionFun_4(final String source) {
        if (source == null) {
            return Double.NaN;
        }
        return Double.valueOf(source);
    }
}
