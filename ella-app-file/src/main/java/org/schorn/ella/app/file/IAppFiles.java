package org.schorn.ella.app.file;

import java.nio.charset.Charset;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 */
public interface IAppFiles {
    boolean isDirectory(Path path);
    boolean isReadable(Path path);
    boolean isWritable(Path path);
    Stream<String> lines(Path path);
    Stream<String> lines(Path path, Charset cs);
    Stream<Path> list(Path dir);
    byte[] readAllBytes(Path path);
    List<String> readAllLines(Path path);
    List<String> readAllLines(Path path, Charset cs);
    long size(Path path);
    Path write(Path path, byte[] bytes);
    Path write(Path path, Iterable<? extends CharSequence> lines, Charset cs, OpenOption... options);
    Path write(Path path, Iterable<? extends CharSequence> lines, OpenOption... options);


    /**
     *
     */
    IAppFiles DUMMY = new DummyImpl();
    /**
     *
     */
    class DummyImpl implements IAppFiles {

        @Override
        public boolean isDirectory(Path path) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean isReadable(Path path) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean isWritable(Path path) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Stream<String> lines(Path path) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Stream<String> lines(Path path, Charset cs) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Stream<Path> list(Path dir) {
            throw new UnsupportedOperationException();
        }

        @Override
        public byte[] readAllBytes(Path path) {
            throw new UnsupportedOperationException();
        }

        @Override
        public List<String> readAllLines(Path path) {
            throw new UnsupportedOperationException();
        }

        @Override
        public List<String> readAllLines(Path path, Charset cs) {
            throw new UnsupportedOperationException();
        }

        @Override
        public long size(Path path) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Path write(Path path, byte[] bytes) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Path write(Path path, Iterable<? extends CharSequence> lines, Charset cs, OpenOption... options) {
            throw new UnsupportedOperationException();
        }

        @Override
        public Path write(Path path, Iterable<? extends CharSequence> lines, OpenOption... options) {
            throw new UnsupportedOperationException();
        }
    }
}
