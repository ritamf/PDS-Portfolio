# Lab11, ex2

## java.io.InputStream

[https://github.com/AdoptOpenJDK/openjdk-jdk11/blob/master/src/java.base/share/classes/java/io/InputStream.java]

Por exemplo, o método `public abstract void write(int b)` é chamado pelo método `public void write(byte b[], int off, int len)`, que tem de ser implementado pela subclasse OutputStream.

## java.io.OutputStream

[https://github.com/AdoptOpenJDK/openjdk-jdk11/blob/master/src/java.base/share/classes/java/io/OutputStream.java]

Por exemplo, o método `public int write(byte b[], int off, int len)` é chamado pelo método `public int read(int b)`, que tem de ser implementado pela subclasse Inputstream.

## java.util.AbstractList

[https://github.com/openjdk-mirror/jdk7u-jdk/blob/master/src/share/classes/java/util/AbstractList.java]

Por exemplo, no método `public void remove()`.

## Conclusões

Nestas classes, o padrão Template ocorre em todos os métodos não abstratos.
