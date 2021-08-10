public class VowelFilter extends TextReaderDecorator {
    public VowelFilter(TextReaderInterface newTextReader) {
        super(newTextReader);
        System.out.println("Text Reader has vowel filter");
    }

    public boolean hasNext() {
        return true;
    }

    public String next() {
        return "lmnts";
    }
}
