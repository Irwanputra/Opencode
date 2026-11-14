package dev.epro.r0;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W5127878893385538321 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ W3656598099029166611 t;
    public final /* synthetic */ R11406268294969300236 u;
    public final /* synthetic */ R14289894334981469490 v;
    public final /* synthetic */ B8560650639488024808 w;
    public final /* synthetic */ L13148442655056575112 x;
    public final /* synthetic */ E405169748098369564 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W5127878893385538321(W3656598099029166611 w3656598099029166611, R11406268294969300236 r11406268294969300236, R14289894334981469490 r14289894334981469490, B8560650639488024808 b8560650639488024808, L13148442655056575112 l13148442655056575112, E405169748098369564 e405169748098369564, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = w3656598099029166611;
        this.u = r11406268294969300236;
        this.v = r14289894334981469490;
        this.w = b8560650639488024808;
        this.x = l13148442655056575112;
        this.y = e405169748098369564;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new W5127878893385538321(this.t, this.u, this.v, this.w, this.x, this.y, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        W5127878893385538321 w5127878893385538321 = (W5127878893385538321) create((R4833348786910499294) obj2, (W5797197595347441198) obj);
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        w5127878893385538321.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        E17665849472693074628.k(obj);
        W3656598099029166611 w3656598099029166611 = this.t;
        Object g = w3656598099029166611.a.g();
        V697849047308847220 v697849047308847220 = w3656598099029166611.d;
        if (S10823041268949770285.t(g, v697849047308847220.getValue()) && (((R14289894334981469490) this.u.b.f.l()) == null || S10823041268949770285.t(v697849047308847220.getValue(), this.v))) {
            Iterator it = ((List) this.x.getValue()).iterator();
            while (it.hasNext()) {
                this.y.b().c((R14289894334981469490) it.next());
            }
            B8560650639488024808 b8560650639488024808 = this.w;
            long[] jArr = b8560650639488024808.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj2 = b8560650639488024808.b[i4];
                                float f = b8560650639488024808.c[i4];
                                if (!S10823041268949770285.t((String) obj2, ((R14289894334981469490) v697849047308847220.getValue()).f)) {
                                    b8560650639488024808.e--;
                                    long[] jArr2 = b8560650639488024808.a;
                                    int i5 = b8560650639488024808.d;
                                    int i6 = i4 >> 3;
                                    int i7 = (i4 & 7) << 3;
                                    long j2 = (jArr2[i6] & (~(255 << i7))) | (254 << i7);
                                    jArr2[i6] = j2;
                                    jArr2[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j2;
                                    b8560650639488024808.b[i4] = null;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return O9245300239821758723.a;
    }
}
