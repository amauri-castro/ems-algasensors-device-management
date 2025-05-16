package com.amauri.algasensors.device.management;

import io.hypersistence.tsid.TSID;
import org.junit.jupiter.api.Test;

public class TSIDTest {

    @Test
    public void shouldGenerateTSID() {

        System.setProperty("tsid.node", "2");

        TSID fast = TSID.Factory.getTsid();

        System.out.println(fast);
        System.out.println(fast.toLong());
        System.out.println(fast.getInstant());
    }
}
