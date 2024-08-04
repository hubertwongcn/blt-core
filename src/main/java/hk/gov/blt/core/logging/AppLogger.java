package hk.gov.blt.core.logging;

/**
 * @author hubertwong
 * @since 2024/8/4 11:20
 */
public interface AppLogger {
    void info(String message);

    void warn(String message);

    void error(String message);

    void error(String message, Throwable e);
}
