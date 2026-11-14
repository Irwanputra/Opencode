package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U2952894598036618109 extends T1694598823106750438 implements Iterator {
    public D11758182151919292105 a;
    public boolean b = true;
    public final /* synthetic */ K1186241071261229227 c;

    public U2952894598036618109(K1186241071261229227 k1186241071261229227) {
        this.c = k1186241071261229227;
    }

    @Override // dev.epro.r0.T1694598823106750438
    public final void a(D11758182151919292105 d11758182151919292105) {
        D11758182151919292105 d117581821519192921052 = this.a;
        if (d11758182151919292105 == d117581821519192921052) {
            D11758182151919292105 d117581821519192921053 = d117581821519192921052.d;
            this.a = d117581821519192921053;
            this.b = d117581821519192921053 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        D11758182151919292105 d11758182151919292105 = this.a;
        return (d11758182151919292105 == null || d11758182151919292105.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            this.b = false;
            D11758182151919292105 d11758182151919292105 = this.c.a;
            this.a = d11758182151919292105;
            return d11758182151919292105;
        }
        D11758182151919292105 d117581821519192921052 = this.a;
        D11758182151919292105 d117581821519192921053 = d117581821519192921052 != null ? d117581821519192921052.c : null;
        this.a = d117581821519192921053;
        return d117581821519192921053;
    }
}
