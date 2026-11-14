package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V15405126878164315789 {
    public final V697849047308847220 a;
    public final V697849047308847220 b;
    public final C4341747165502163559 c;
    public final long d;
    public long e;
    public float f;
    public float g;
    public long h;
    public long i;
    public F15711662138251908495 j;

    public V15405126878164315789() {
        Boolean bool = Boolean.FALSE;
        this.a = V4416135141588678913.t(bool);
        this.b = V4416135141588678913.t(bool);
        this.c = new C4341747165502163559();
        this.d = R13526224568477936896.a();
        this.e = U10174709222559481877.g;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = N13757329872968394114.b;
        this.i = 0L;
    }

    public final boolean a() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void c(boolean z) {
        V697849047308847220 v697849047308847220 = this.a;
        boolean zBooleanValue = ((Boolean) v697849047308847220.getValue()).booleanValue();
        V697849047308847220 v6978490473088472202 = this.b;
        if (zBooleanValue && !z) {
            v6978490473088472202.setValue(Boolean.TRUE);
        } else if (z) {
            v6978490473088472202.setValue(Boolean.FALSE);
        }
        v697849047308847220.setValue(Boolean.valueOf(z));
    }
}
