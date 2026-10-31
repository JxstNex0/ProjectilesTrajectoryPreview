package fr.madu59.ptp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Ptp {
    public static final String MOD_ID = "ptp";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private Ptp() {
        // Client-only mod: no server initialization or network registration.
    }
}
