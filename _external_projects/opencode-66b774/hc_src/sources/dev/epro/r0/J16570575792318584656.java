package dev.epro.r0;

import java.util.regex.Matcher;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J16570575792318584656 extends T7441316690157960089 implements L12639328004344855510 {
    public Matcher t;
    public int u;
    public byte v;
    public /* synthetic */ Object w;
    public final /* synthetic */ H5336160545165318150 x;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J16570575792318584656(H5336160545165318150 h5336160545165318150, String str, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.x = h5336160545165318150;
        this.y = str;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        J16570575792318584656 j16570575792318584656 = new J16570575792318584656(this.x, this.y, r4833348786910499294);
        j16570575792318584656.w = obj;
        return j16570575792318584656;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((J16570575792318584656) create((R4833348786910499294) obj2, (N3180492300688416475) obj)).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        Matcher matcher;
        int i;
        int i2;
        N3180492300688416475 n3180492300688416475 = (N3180492300688416475) this.w;
        byte b = this.v;
        String str = this.y;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        if (b != 0) {
            O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
            if (b == 1) {
                E17665849472693074628.k(obj);
                return o9245300239821758723;
            }
            if (b != 2) {
                if (b == 3) {
                    E17665849472693074628.k(obj);
                    return o9245300239821758723;
                }
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.u;
            matcher = this.t;
            E17665849472693074628.k(obj);
            i = matcher.end();
            i2 = i3 + 1;
            if (i2 == -1 || !matcher.find()) {
                String obj2 = str.subSequence(i, str.length()).toString();
                this.w = null;
                this.t = null;
                this.u = i2;
                this.v = (byte) 3;
                n3180492300688416475.c(this, obj2);
                return z3437138737604933638;
            }
        } else {
            E17665849472693074628.k(obj);
            matcher = this.x.a.matcher(str);
            if (!matcher.find()) {
                String obj3 = str.toString();
                this.w = null;
                this.t = null;
                this.v = (byte) 1;
                n3180492300688416475.c(this, obj3);
                return z3437138737604933638;
            }
            i = 0;
            i2 = 0;
        }
        String obj4 = str.subSequence(i, matcher.start()).toString();
        this.w = n3180492300688416475;
        this.t = matcher;
        this.u = i2;
        this.v = (byte) 2;
        n3180492300688416475.c(this, obj4);
        return z3437138737604933638;
    }
}
