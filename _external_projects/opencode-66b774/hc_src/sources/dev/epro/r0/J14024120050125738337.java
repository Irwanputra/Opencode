package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class J14024120050125738337 {
    public final N1624049989104559987 a = new N1624049989104559987();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        N1624049989104559987 n1624049989104559987 = this.a;
        if (n1624049989104559987.d) {
            N1624049989104559987.a(autoCloseable);
            return;
        }
        synchronized (n1624049989104559987.a) {
            autoCloseable2 = (AutoCloseable) n1624049989104559987.b.put(str, autoCloseable);
        }
        N1624049989104559987.a(autoCloseable2);
    }

    public final void b() {
        N1624049989104559987 n1624049989104559987 = this.a;
        if (!n1624049989104559987.d) {
            n1624049989104559987.d = true;
            synchronized (n1624049989104559987.a) {
                try {
                    Iterator it = n1624049989104559987.b.values().iterator();
                    while (it.hasNext()) {
                        N1624049989104559987.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = n1624049989104559987.c.iterator();
                    while (it2.hasNext()) {
                        N1624049989104559987.a((AutoCloseable) it2.next());
                    }
                    n1624049989104559987.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        N1624049989104559987 n1624049989104559987 = this.a;
        synchronized (n1624049989104559987.a) {
            autoCloseable = (AutoCloseable) n1624049989104559987.b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
