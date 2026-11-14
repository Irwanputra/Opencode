package dev.epro.r0;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J9884070742191057945 {
    public int a;
    public long b;
    public Object c;
    public Object d;
    public final Object e;

    public J9884070742191057945(M10634075818626712574 m10634075818626712574, int i, long j) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        timeUnit.getClass();
        this.a = i;
        this.b = timeUnit.toNanos(j);
        this.c = m10634075818626712574.d();
        this.d = new E17483539623558463245(this, G6547577305291411977.u(new StringBuilder(), C14766148968941961570.b, " ConnectionPool connection closer"));
        this.e = new ConcurrentLinkedQueue();
        if (j > 0) {
            return;
        }
        S10973172697741180971.i(E12098517352909843120.k(j, "keepAliveDuration <= 0: "));
        throw null;
    }

    public int a(H3726261569308128079 h3726261569308128079, long j) {
        TimeZone timeZone = C14766148968941961570.a;
        ArrayList arrayList = h3726261569308128079.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + h3726261569308128079.c.a.h + " was leaked. Did you forget to close a response body?";
                X4422675003582389573 x4422675003582389573 = X4422675003582389573.a;
                X4422675003582389573.a.k(str, ((F3664753522621099204) reference).a);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    h3726261569308128079.q = j - this.b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public J9884070742191057945() {
        this.b = 0L;
        this.a = 0;
        this.e = new N16536369055082677148();
    }
}
