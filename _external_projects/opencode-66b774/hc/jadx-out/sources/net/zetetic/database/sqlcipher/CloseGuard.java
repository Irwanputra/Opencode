package net.zetetic.database.sqlcipher;

import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.Z3383101362411723454;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class CloseGuard {
    private Throwable allocationSite;
    private static final CloseGuard NOOP = new CloseGuard();
    private static volatile boolean ENABLED = true;
    private static volatile Reporter REPORTER = new DefaultReporter(0);

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public interface Reporter {
        void report(String str, Throwable th);
    }

    private CloseGuard() {
    }

    public static CloseGuard get() {
        return !ENABLED ? NOOP : new CloseGuard();
    }

    public static Reporter getReporter() {
        return REPORTER;
    }

    public static void setEnabled(boolean z) {
        ENABLED = z;
    }

    public static void setReporter(Reporter reporter) {
        if (reporter != null) {
            REPORTER = reporter;
        } else {
            Z3383101362411723454.k("reporter == null");
        }
    }

    public void close() {
        this.allocationSite = null;
    }

    public void open(String str) {
        if (str == null) {
            Z3383101362411723454.k("closer == null");
        } else {
            if (this == NOOP || !ENABLED) {
                return;
            }
            this.allocationSite = new Throwable(G6547577305291411977.s("Explicit termination method '", str, "' not called"));
        }
    }

    public void warnIfOpen() {
        if (this.allocationSite == null || !ENABLED) {
            return;
        }
        REPORTER.report("A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks.", this.allocationSite);
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class DefaultReporter implements Reporter {
        public /* synthetic */ DefaultReporter(int i) {
            this();
        }

        private DefaultReporter() {
        }

        @Override // net.zetetic.database.sqlcipher.CloseGuard.Reporter
        public void report(String str, Throwable th) {
        }
    }
}
