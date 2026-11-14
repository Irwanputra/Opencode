package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I1454525793690893190 extends K14749510448791472029 {
    public /* synthetic */ Object t;
    public final /* synthetic */ J4301161590161457380 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I1454525793690893190(J4301161590161457380 j4301161590161457380, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.u = j4301161590161457380;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.emit(null, this);
    }
}
