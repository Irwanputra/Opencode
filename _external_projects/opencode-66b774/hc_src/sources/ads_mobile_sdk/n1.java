package ads_mobile_sdk;

import dev.epro.r0.C8804068735739007381;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.Z11123542482871484238;
import java.io.FileInputStream;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class n1 implements C8804068735739007381 {
    public static final n1 a = new n1();
    public static final g1 b = g1.q();

    @Override // dev.epro.r0.C8804068735739007381
    public final Object getDefaultValue() {
        return b;
    }

    @Override // dev.epro.r0.C8804068735739007381
    public final Object readFrom(FileInputStream fileInputStream) {
        g1 g1Var;
        WeakHashMap weakHashMap = ji3.a;
        th3 a2 = ji3.a(wv0.CUI_NAME_PERSISTENT_CACHE_METADATA_READ, O2161699089510411363.a, true);
        try {
            try {
                g1Var = g1.a(fileInputStream);
            } catch (Throwable th) {
                try {
                    a2.b(th);
                    if (th instanceof N340633841638932414) {
                        throw th;
                    }
                    if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                        a2.a(th);
                    }
                    if (th instanceof P2480554073835519965) {
                        throw new lw0(th);
                    }
                    if (th instanceof CancellationException) {
                        throw new du0(th);
                    }
                    if (th instanceof dv0) {
                        throw th;
                    }
                    throw new iu0(th);
                } finally {
                }
            }
        } catch (Exception e) {
            zi3.a(6, "Stored data has been corrupted: " + e, null);
            xv.c("Stored data has been corrupted: " + e, null);
            g1Var = b;
        }
        a2.close();
        g1Var.getClass();
        return g1Var;
    }

    @Override // dev.epro.r0.C8804068735739007381
    public final void writeTo(Object obj, Z11123542482871484238 z11123542482871484238) {
        ((g1) obj).a(z11123542482871484238);
    }
}
