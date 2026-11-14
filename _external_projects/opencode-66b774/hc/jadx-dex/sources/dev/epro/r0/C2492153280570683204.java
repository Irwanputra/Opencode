package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class C2492153280570683204 implements java.lang.Runnable {
    public final /* synthetic */ dev.epro.r0.S16571168858015125610 a;
    public final /* synthetic */ dev.epro.r0.F10342546226345611902 b;
    public final /* synthetic */ java.util.List c;
    public final /* synthetic */ dev.epro.r0.M11181104712105445833 d;
    public final /* synthetic */ dev.epro.r0.R8540738700654750557 e;
    public final /* synthetic */ dev.epro.r0.U14340554418656580554 f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ C2492153280570683204(dev.epro.r0.S16571168858015125610 s16571168858015125610, dev.epro.r0.F10342546226345611902 f10342546226345611902, java.util.List list, dev.epro.r0.M11181104712105445833 m11181104712105445833, dev.epro.r0.R8540738700654750557 r8540738700654750557, dev.epro.r0.U14340554418656580554 u14340554418656580554, boolean z) {
        this.a = s16571168858015125610;
        this.b = f10342546226345611902;
        this.c = list;
        this.d = m11181104712105445833;
        this.e = r8540738700654750557;
        this.f = u14340554418656580554;
        this.g = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dev.epro.r0.A6237865184482427403 a6237865184482427403C;
        dev.epro.r0.S16571168858015125610 s16571168858015125610 = this.a;
        dev.epro.r0.F10342546226345611902 f10342546226345611902 = this.b;
        dev.epro.r0.M11181104712105445833 m11181104712105445833 = this.d;
        dev.epro.r0.R8540738700654750557 r8540738700654750557 = this.e;
        dev.epro.r0.U14340554418656580554 u14340554418656580554 = this.f;
        boolean z = this.g;
        android.os.Trace.beginSection("BackgroundTextMeasurement");
        try {
            dev.epro.r0.M4722199849958580248 m4722199849958580248H = dev.epro.r0.D459204867321966484.h();
            dev.epro.r0.A6237865184482427403 a6237865184482427403 = m4722199849958580248H instanceof dev.epro.r0.A6237865184482427403 ? (dev.epro.r0.A6237865184482427403) m4722199849958580248H : null;
            if (a6237865184482427403 == null || (a6237865184482427403C = a6237865184482427403.C(null, null)) == null) {
                throw new java.lang.IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                dev.epro.r0.M4722199849958580248 m4722199849958580248J = a6237865184482427403C.j();
                try {
                    dev.epro.r0.S16571168858015125610 s16571168858015125610L = dev.epro.r0.H4776669175763245653.l(s16571168858015125610, f10342546226345611902);
                    dev.epro.r0.O2161699089510411363 o2161699089510411363 = this.c;
                    if (o2161699089510411363 == null) {
                        o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
                    }
                    dev.epro.r0.I1581330382723795749 i1581330382723795749 = new dev.epro.r0.I1581330382723795749(m11181104712105445833, r8540738700654750557, u14340554418656580554, s16571168858015125610L, o2161699089510411363, z);
                    i1581330382723795749.c();
                    i1581330382723795749.a();
                    dev.epro.r0.M4722199849958580248.q(m4722199849958580248J);
                    a6237865184482427403C.w().h();
                    a6237865184482427403C.c();
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th) {
                    dev.epro.r0.M4722199849958580248.q(m4722199849958580248J);
                    throw th;
                }
            } finally {
            }
        } catch (java.lang.Throwable th2) {
            android.os.Trace.endSection();
            throw th2;
        }
    }
}
