package p131.p135.p138;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p131.p135.p137.C1982;
import p131.p135.p137.EnumC1975;
import p131.p135.p139.C2008;
import p131.p135.p139.C2009;
import p131.p135.p139.C2010;

/* renamed from: なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1998 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static C1998 f8715;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Set<C1982> f8717 = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public AtomicInteger f8716 = new AtomicInteger();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static C1998 m4107() {
        if (f8715 == null) {
            synchronized (C1998.class) {
                if (f8715 == null) {
                    f8715 = new C1998();
                }
            }
        }
        return f8715;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C1982 m4108(C1982 c1982) {
        C2010 c2010;
        RunnableC2003 runnableC2003;
        try {
            this.f8717.add(c1982);
        } catch (Exception unused) {
        }
        try {
            c1982.f8635 = this.f8716.incrementAndGet();
            if (c1982.f8619 == EnumC1975.IMMEDIATE) {
                c2010 = ((C2009) C2008.m4114().f8733).f8735;
                runnableC2003 = new RunnableC2003(c1982);
            } else {
                c2010 = ((C2009) C2008.m4114().f8733).f8737;
                runnableC2003 = new RunnableC2003(c1982);
            }
            c1982.f8627 = c2010.submit(runnableC2003);
        } catch (Exception unused2) {
        }
        return c1982;
    }
}
