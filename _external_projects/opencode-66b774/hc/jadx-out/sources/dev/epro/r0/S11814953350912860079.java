package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S11814953350912860079 extends D163165075543778664 {
    public H7219028874700587498 a;
    public F4096073349764486348 b;

    @Override // dev.epro.r0.D163165075543778664
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // dev.epro.r0.D163165075543778664
    public final void b(Throwable th) {
        H7219028874700587498 h7219028874700587498 = this.a;
        if (h7219028874700587498 != null) {
            h7219028874700587498.resumeWith(E17665849472693074628.d(th));
        }
    }
}
