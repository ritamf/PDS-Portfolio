public class TermFilter extends TextReaderDecorator {
    public TermFilter(TextReaderInterface newTextReader) {
        super(newTextReader);
        System.out.println("Text Reader has term filter");
    }

    public boolean hasNext() {
        return true;
    }

    public String next() {
        return "Alimentos";
    }
}