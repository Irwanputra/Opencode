package dev.epro.r0;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U16581842183692576031 extends Handler {
    public static final U16581842183692576031 a = new U16581842183692576031();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        logRecord.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = V12265638346635935530.a;
        String loggerName = logRecord.getLoggerName();
        loggerName.getClass();
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue <= level.intValue()) {
            logRecord.getLevel().intValue();
            level.intValue();
        }
        logRecord.getMessage().getClass();
        logRecord.getThrown();
        if (((String) V12265638346635935530.b.get(loggerName)) == null) {
            M8927913404651150384.B0(23, loggerName);
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
