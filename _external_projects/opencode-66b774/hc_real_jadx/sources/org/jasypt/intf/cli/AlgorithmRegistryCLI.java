package org.jasypt.intf.cli;

import java.io.PrintStream;
import java.util.Set;
import org.jasypt.registry.AlgorithmRegistry;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class AlgorithmRegistryCLI {
    private AlgorithmRegistryCLI() {
    }

    public static void main(String[] strArr) {
        try {
            Set allDigestAlgorithms = AlgorithmRegistry.getAllDigestAlgorithms();
            Set allPBEAlgorithms = AlgorithmRegistry.getAllPBEAlgorithms();
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("DIGEST ALGORITHMS:   ");
            stringBuffer.append(allDigestAlgorithms);
            stringBuffer.toString();
            PrintStream printStream2 = System.out;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("PBE ALGORITHMS:      ");
            stringBuffer2.append(allPBEAlgorithms);
            stringBuffer2.toString();
            PrintStream printStream3 = System.out;
        } catch (Throwable th) {
            th.printStackTrace(System.err);
        }
    }
}
