package p034.p094;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: づざかべべ.のぷのちつ.は〲ぱなで, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1679 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final HashMap<String, AbstractC1666> f7795 = new HashMap<>();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m3649() {
        for (AbstractC1666 abstractC1666 : this.f7795.values()) {
            Map<String, Object> map = abstractC1666.f7787;
            if (map != null) {
                synchronized (map) {
                    for (Object obj : abstractC1666.f7787.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
            abstractC1666.mo3638();
        }
        this.f7795.clear();
    }
}
