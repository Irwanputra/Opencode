package dev.epro.r0;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class X12075480239981509252 extends P9674367971006745590 {
    public static final Z860808776098365610 j;
    public static final Logger k = Logger.getLogger(X12075480239981509252.class.getName());
    public volatile Set h;
    public volatile int i;

    static {
        Z860808776098365610 f12934517682057052152;
        try {
            f12934517682057052152 = new P654724823615270050(AtomicReferenceFieldUpdater.newUpdater(X12075480239981509252.class, Set.class, "h"), AtomicIntegerFieldUpdater.newUpdater(X12075480239981509252.class, "i"));
            e = null;
        } catch (Error | RuntimeException e) {
            e = e;
            f12934517682057052152 = new F12934517682057052152();
        }
        j = f12934517682057052152;
        if (e != null) {
            Logger logger = k;
            Level level = Level.SEVERE;
            logger.getClass();
        }
    }
}
