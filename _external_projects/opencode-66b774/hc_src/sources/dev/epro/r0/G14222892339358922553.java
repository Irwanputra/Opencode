package dev.epro.r0;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G14222892339358922553 {
    public static final E17149812035295265804 c = new E17149812035295265804((byte) 12);
    public static final LinkedHashMap d = new LinkedHashMap();
    public final ReentrantLock a;
    public final W8455343525638953052 b;

    public G14222892339358922553(String str, boolean z) {
        ReentrantLock reentrantLock;
        synchronized (c) {
            try {
                LinkedHashMap linkedHashMap = d;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = reentrantLock;
        this.b = z ? new W8455343525638953052(str) : null;
    }
}
