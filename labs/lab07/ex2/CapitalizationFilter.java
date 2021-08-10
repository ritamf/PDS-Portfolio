public class CapitalizationFilter extends TextReaderDecorator {
    public CapitalizationFilter(TextReaderInterface newTextReader) {
        super(newTextReader);
        System.out.println("Text Reader has capitalization filter");
    }

    public boolean hasNext() {
        return true;
    }

    public String next() {
        return "AlimentoS";
    }
}
