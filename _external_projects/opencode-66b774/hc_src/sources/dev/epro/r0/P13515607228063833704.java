package dev.epro.r0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P13515607228063833704 extends Z13138252466311837697 {
    public final /* synthetic */ F1091364834390067043 c;
    public final P17416614265316018830 d;
    public final /* synthetic */ F1091364834390067043 e;

    public P13515607228063833704(F1091364834390067043 f1091364834390067043, P17416614265316018830 p17416614265316018830) {
        this.e = f1091364834390067043;
        this.c = f1091364834390067043;
        this.d = p17416614265316018830;
    }

    @Override // dev.epro.r0.Z13138252466311837697
    public final void a(Throwable th) {
        F1091364834390067043 f1091364834390067043 = this.c;
        f1091364834390067043.p = null;
        if (th instanceof ExecutionException) {
            f1091364834390067043.l(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            f1091364834390067043.cancel(false);
        } else {
            f1091364834390067043.l(th);
        }
    }

    @Override // dev.epro.r0.Z13138252466311837697
    public final void b(Object obj) {
        this.c.p = null;
        this.e.k(obj);
    }

    @Override // dev.epro.r0.Z13138252466311837697
    public final boolean d() {
        return this.c.isDone();
    }

    @Override // dev.epro.r0.Z13138252466311837697
    public final Object e() {
        return this.d.call();
    }

    @Override // dev.epro.r0.Z13138252466311837697
    public final String f() {
        return this.d.toString();
    }
}
