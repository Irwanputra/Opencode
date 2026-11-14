package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K1920483526288862661 extends K14749510448791472029 {
    public byte t;
    public final /* synthetic */ L12639328004344855510 u;
    public final /* synthetic */ R4833348786910499294 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K1920483526288862661(R4833348786910499294 r4833348786910499294, G8001132634698687269 g8001132634698687269, L12639328004344855510 l12639328004344855510, R4833348786910499294 r48333487869104992942) {
        super(r4833348786910499294, g8001132634698687269);
        this.u = l12639328004344855510;
        this.v = r48333487869104992942;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        if (b != 0) {
            if (b != 1) {
                S10973172697741180971.m("This coroutine had already completed");
                return null;
            }
            this.t = (byte) 2;
            E17665849472693074628.k(obj);
            return obj;
        }
        this.t = (byte) 1;
        E17665849472693074628.k(obj);
        L12639328004344855510 l12639328004344855510 = this.u;
        l12639328004344855510.getClass();
        V12319504402545346730.s(2, l12639328004344855510);
        return l12639328004344855510.invoke(this.v, this);
    }
}
