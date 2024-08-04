package hk.gov.blt.core.logging.impl;

import hk.gov.blt.core.logging.AppLogger;
import lombok.Data;

/**
 * @author hubertwong
 * @since 2024/8/4 11:20
 */
@Data
public class BltAppLogger implements AppLogger {
    private String level;
    private String format;
    // TODO another fields to support; The above two fields are only used for demonstration

    private BltAppLogger(String level, String format) {
        this.level = level;
        this.format = format;
    }

    public static AppLogger getAppLoggerFromProp(String level, String format) {
        return new BltAppLogger(level, format);
    }

    @Override
    public void info(String message) {
        System.out.println("for example: log info ..." + message + "; BltAppLogger: " + this);
    }

    @Override
    public void warn(String message) {
        System.out.println("for example: log warn ..." + message + "; BltAppLogger: " + this);
    }

    @Override
    public void error(String message) {
        System.out.println("for example: log error ..." + message + "; BltAppLogger: " + this);
    }

    @Override
    public void error(String message, Throwable e) {
        System.out.println("for example: log error ..." + message + "..." + e.getMessage() + "; BltAppLogger: " + this);
    }
}
