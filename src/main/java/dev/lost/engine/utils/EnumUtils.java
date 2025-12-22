package dev.lost.engine.utils;

import java.util.Optional;

public class EnumUtils {
    public static <T extends Enum<T>> Optional<T> match(String key, Class<T> enumClass) {
        try {
            return Optional.of(Enum.valueOf(enumClass, key.toUpperCase()));
        } catch (Throwable e) {
            return Optional.empty();
        }
    }
}
