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
    Path createPath(String...paths) throws Exception;
    byte[] readAllBytes(Path path);
    List<String> readAllLines(Path path);
    List<String> readAllLines(Path path, Charset cs);
    Path write(Path path, byte[] bytes);

    /* TODO
    boolean isDirectory(Path path);
    boolean isReadable(Path path);
    boolean isWritable(Path path);
    Stream<String> lines(Path path);
    Stream<String> lines(Path path, Charset cs);
    Stream<Path> list(Path dir);
    long size(Path path);
    Path write(Path path, Iterable<? extends CharSequence> lines, Charset cs, OpenOption... options);
    Path write(Path path, Iterable<? extends CharSequence> lines, OpenOption... options);
    */

    /**
     *
     */
    IAppFiles DUMMY = new DummyImpl();
    /**
     *
     */
    class DummyImpl implements IAppFiles {

        @Override
        public Path createPath(String... paths) throws Exception {
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
        public Path write(Path path, byte[] bytes) { throw new UnsupportedOperationException(); }
    }
}
