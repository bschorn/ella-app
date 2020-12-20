package org.schorn.ella.app;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class TestFile implements Callable<Boolean> {

    private final EllaApp ellaApp;

    public static void main(String[] args) {
        try {
            System.setProperty(IFile.class.getName(), "org.schorn.ella.aws.file.s3.S3File");
            EllaApp ellaApp = new EllaApp();
            TestFile testFile = new TestFile(ellaApp);
            testFile.setWorkingDir(args[0]);
            testFile.setFilePath(args[1]);
            if (testFile.call()) {
                System.out.println("TestFile successful.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void setFilePath(String filePath) {
        this.fileKey = filePath;
    }

    private void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    String workingDir;
    String fileKey;
    public TestFile(EllaApp ellaApp) {
        this.ellaApp = ellaApp;
    }

    public void readFileAsString(Path path) throws Exception {
        IFile.ReadRequest fileReadRequest = IFile.ReadRequest.builder()
                .what(path)
                .with(StandardCharsets.UTF_8)
                .build();
        IFile.IReadResponse response = this.ellaApp.read(fileReadRequest);
        if (response.getException().isPresent()) {
            throw response.getException().get();
        } else {
            System.out.println(String.format("readFileAsString(%s):\n%s", path.toString(),
                    response.toString()));
        }
    }
    public void readFileAsLines(Path path) throws Exception {
        IFile.ReadRequest fileReadRequest = IFile.ReadRequest.builder()
                .what(path)
                .with(StandardCharsets.UTF_8)
                .build();
        IFile.IReadResponse response = this.ellaApp.read(fileReadRequest);
        if (response.getException().isPresent()) {
            throw response.getException().get();
        } else {
            System.out.println(String.format("readFileAsLines(%s):\n%s", path.toString(),
                    response.asList().stream().collect(Collectors.joining(System.lineSeparator()))));
        }
    }

    @Override
    public Boolean call() throws Exception {
        try {
            Path testPath = Path.of(workingDir, fileKey);
            readFileAsString(testPath);
            readFileAsLines(testPath);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }
}
