package dev.epro.r0;

import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B12005050767432114055 implements H11646813293457574213 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ F4096073349764486348 d;
    public final /* synthetic */ M8258878446506793937 e;
    public final /* synthetic */ A12581365276667340144 f;
    public final /* synthetic */ F4096073349764486348 g;

    public B12005050767432114055(int i, int i2, Map map, F4096073349764486348 f4096073349764486348, M8258878446506793937 m8258878446506793937, A12581365276667340144 a12581365276667340144, F4096073349764486348 f40960733497644863482) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = f4096073349764486348;
        this.e = m8258878446506793937;
        this.f = a12581365276667340144;
        this.g = f40960733497644863482;
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final Map a() {
        return this.c;
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final void b() {
        N2516046390769984807 n2516046390769984807;
        H11725168162114556860 h11725168162114556860 = this.f.a;
        boolean A = this.e.A();
        F4096073349764486348 f4096073349764486348 = this.g;
        if (!A || (n2516046390769984807 = ((I16141028645763443416) h11725168162114556860.F.d).d0) == null) {
            f4096073349764486348.invoke(((I16141028645763443416) h11725168162114556860.F.d).p);
        } else {
            f4096073349764486348.invoke(n2516046390769984807.p);
        }
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final int d() {
        return this.b;
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final F4096073349764486348 e() {
        return this.d;
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final int g() {
        return this.a;
    }
}
