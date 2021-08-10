public abstract class TextReaderDecorator implements TextReaderInterface {
    protected TextReaderInterface textReader;

    public TextReaderDecorator(TextReaderInterface newTextReader) {
        this.textReader = newTextReader;
    }

    public boolean hasNext() {
        return textReader.hasNext();
    }

    public String next() {
        return textReader.next();
    }

}
