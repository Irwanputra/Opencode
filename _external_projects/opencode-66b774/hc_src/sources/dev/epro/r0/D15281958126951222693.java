package dev.epro.r0;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D15281958126951222693 {
    public byte a = 1;
    public final J5953358054831440945 b;
    public J5953358054831440945 c;
    public J5953358054831440945 d;
    public int e;
    public int f;

    public D15281958126951222693(J5953358054831440945 j5953358054831440945) {
        this.b = j5953358054831440945;
        this.c = j5953358054831440945;
    }

    public final void a() {
        this.a = (byte) 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        Q5727030208712194095 b = this.c.b.b();
        int a = b.a(6);
        return !(a == 0 || ((ByteBuffer) b.d).get(a + b.a) == 0) || this.e == 65039;
    }
}
