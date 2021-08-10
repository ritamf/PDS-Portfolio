public class NormalizationFilter extends TextReaderDecorator {
    public NormalizationFilter(TextReaderInterface newTextReader) {
        super(newTextReader);
        System.out.println("Text Reader has normalization filter");
    }

    public boolean hasNext() {
        return true;
    }

    public String next() {
        return "quimicos";
    }
}
