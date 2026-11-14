package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P14395047000053777910 extends K14749510448791472029 {
    public J4301161590161457380 t;
    public Object u;
    public /* synthetic */ Object v;
    public final /* synthetic */ J4301161590161457380 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P14395047000053777910(J4301161590161457380 j4301161590161457380, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.w = j4301161590161457380;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.emit(null, this);
    }
}
