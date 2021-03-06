package dev.tauri.jsgcore.utils;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class Logging {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static void info(String s) {
        LOGGER.info(s);
    }

    public static void error(String s) {
        LOGGER.error(s);
    }

    public static void warn(String s) {
        LOGGER.warn(s);
    }

    public static void debug(String s) {
        LOGGER.debug(s);
    }
}
