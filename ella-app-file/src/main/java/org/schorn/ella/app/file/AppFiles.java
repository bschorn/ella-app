package org.schorn.ella.app.file;

import org.schorn.ella.app.injector.DependencyInjectionFramework;

import java.nio.charset.Charset;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 */
public class AppFiles {

    static private final IAppFiles FILES = DependencyInjectionFramework.get(IAppFiles.class, IAppFiles.DUMMY);

    static public boolean isDirectory(Path path) {
        return FILES.isDirectory(path);
    }

    static public boolean isReadable(Path path) {
        return FILES.isReadable(path);
    }

    static public boolean isWritable(Path path) {
        return FILES.isWritable(path);
    }

    static public Stream<String> lines(Path path) {
        return FILES.lines(path);
    }

    static public Stream<String> lines(Path path, Charset cs) {
        return FILES.lines(path, cs);
    }

    static public Stream<Path> list(Path dir) {
        return FILES.list(dir);
    }

    static public byte[] readAllBytes(Path path) {
        return FILES.readAllBytes(path);
    }

    static public List<String> readAllLines(Path path) {
        return FILES.readAllLines(path);
    }

    static public List<String> readAllLines(Path path, Charset cs) {
        return FILES.readAllLines(path, cs);
    }

    static public long size(Path path) {
        return FILES.size(path);
    }

    static Path write(Path path, byte[] bytes) {
        return FILES.write(path, bytes);
    }

    static Path write(Path path, Iterable<? extends CharSequence> lines, Charset cs, OpenOption... options) {
        return FILES.write(path, lines, cs, options);
    }

    static Path write(Path path, Iterable<? extends CharSequence> lines, OpenOption... options) {
        return FILES.write(path, lines, options);
    }

}
