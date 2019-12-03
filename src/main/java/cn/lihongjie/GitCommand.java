package cn.lihongjie;

import lombok.extern.slf4j.Slf4j;
import picocli.CommandLine;

@CommandLine.Command(name = "git", subcommands = {GitAddCommand.class, GitRmCommand.class})
@Slf4j
public class GitCommand implements Runnable {
    @CommandLine.Option(names = {"-h", "--help"}, usageHelp = true, description = "display a help message")
    private boolean helpRequested = false;

    public void run() {

        log.info("running");

    }


}
