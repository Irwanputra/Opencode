package dev.epro.r0;

import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Z10690282603965943320 {
    public static final ThreadLocal i = new ThreadLocal();
    public final W8455343525638953052 e;
    public W8455343525638953052 h;
    public final W929662112881511578 a = new W929662112881511578(0);
    public final ArrayList b = new ArrayList();
    public final H12843822278061842084 c = new H12843822278061842084((Object) this, (byte) 11);
    public final W13948953340889349604 d = new W13948953340889349604(this, (byte) 5);
    public boolean f = false;
    public float g = 1.0f;

    public Z10690282603965943320(W8455343525638953052 w8455343525638953052) {
        this.e = w8455343525638953052;
    }

    public static Z10690282603965943320 a() {
        ThreadLocal threadLocal = i;
        if (threadLocal.get() == null) {
            threadLocal.set(new Z10690282603965943320(new W8455343525638953052((byte) 5)));
        }
        return (Z10690282603965943320) threadLocal.get();
    }
}
