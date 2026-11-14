package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B8248523785835361683 extends K14749510448791472029 {
    public /* synthetic */ Object t;
    public final /* synthetic */ J4301161590161457380 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8248523785835361683(J4301161590161457380 j4301161590161457380, R4833348786910499294 r4833348786910499294) {
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
