package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N14898160494761110663 extends K14749510448791472029 {
    public int A;
    public S17255966974483065294 t;
    public S7864201625552763331 u;
    public R8171059466006247269 v;
    public Q15035754882231748864 w;
    public Object x;
    public /* synthetic */ Object y;
    public final /* synthetic */ S17255966974483065294 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N14898160494761110663(S17255966974483065294 s17255966974483065294, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.z = s17255966974483065294;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        this.z.collect(null, this);
        return Z3437138737604933638.a;
    }
}
