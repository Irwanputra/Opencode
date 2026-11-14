package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D15281958126951222693 {
    public byte a = 1;
    public final dev.epro.r0.J5953358054831440945 b;
    public dev.epro.r0.J5953358054831440945 c;
    public dev.epro.r0.J5953358054831440945 d;
    public int e;
    public int f;

    public D15281958126951222693(dev.epro.r0.J5953358054831440945 j5953358054831440945) {
        this.b = j5953358054831440945;
        this.c = j5953358054831440945;
    }

    public final void a() {
        this.a = (byte) 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        dev.epro.r0.Q5727030208712194095 q5727030208712194095B = this.c.b.b();
        int iA = q5727030208712194095B.a(6);
        return !(iA == 0 || ((java.nio.ByteBuffer) ((dev.epro.r0.H13180098919720300000) q5727030208712194095B).d).get(iA + ((dev.epro.r0.H13180098919720300000) q5727030208712194095B).a) == 0) || this.e == 65039;
    }
}
