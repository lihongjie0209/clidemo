package cn.lihongjie;

import lombok.extern.slf4j.Slf4j;
import picocli.CommandLine;

import java.io.File;

@CommandLine.Command(name = "add")
@Slf4j
public class GitAddCommand implements Runnable {

    @CommandLine.Parameters(index = "0", description = "The file whose checksum to calculate.")
    private File file;

    @CommandLine.Option(names = {"-a", "--algorithm"}, description = "MD5, SHA-1, SHA-256, ...")
    private String algorithm = "MD5";
    @CommandLine.Option(names = { "-h", "--help" }, usageHelp = true, description = "display a help message")
    private boolean helpRequested = false;

    public void run() {

        log.info(file.toString());
        log.info(algorithm);

    }
}
