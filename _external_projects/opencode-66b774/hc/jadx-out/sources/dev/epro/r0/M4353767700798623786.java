package dev.epro.r0;

import dev.epro.r0.S18223337890679294771;
import dev.epro.r0.W16903547067559733734;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class M4353767700798623786 {
    public static final boolean a;
    public static final S18223337890679294771.Z11244019023321623390 b;
    public static final W16903547067559733734.Z11244019023321623390 c;
    public static final S14615174310940763483 d;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (!z) {
            b = null;
            c = null;
            d = null;
        } else {
            new L11220439677536095114(Date.class, (byte) 0);
            new L11220439677536095114(Timestamp.class, (byte) 1);
            b = S18223337890679294771.b;
            c = W16903547067559733734.b;
            d = O10864648295946509064.b;
        }
    }
}
