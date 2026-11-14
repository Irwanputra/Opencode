package dev.epro.r0;

import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T10639423575958563510 extends N3901745123707141715 {
    public final /* synthetic */ M17133811648581684718 b;
    public final /* synthetic */ L3120623210002840329 c;
    public final /* synthetic */ K12238100791927223227 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T10639423575958563510(K12238100791927223227 k12238100791927223227, M17133811648581684718 m17133811648581684718, M17133811648581684718 m171338116485816847182, L3120623210002840329 l3120623210002840329) {
        super(m17133811648581684718);
        this.b = m171338116485816847182;
        this.c = l3120623210002840329;
        Objects.requireNonNull(k12238100791927223227);
        this.d = k12238100791927223227;
    }

    @Override // dev.epro.r0.N3901745123707141715
    public final void b() {
        K12238100791927223227 k12238100791927223227 = this.d;
        synchronized (k12238100791927223227.f) {
            try {
                M17133811648581684718 m17133811648581684718 = this.b;
                k12238100791927223227.e.add(m17133811648581684718);
                m17133811648581684718.a.a(new F6353700998356592239(k12238100791927223227, m17133811648581684718, (byte) 5));
                if (k12238100791927223227.l.getAndIncrement() > 0) {
                    k12238100791927223227.b.getClass();
                }
                K12238100791927223227.b(k12238100791927223227, this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
