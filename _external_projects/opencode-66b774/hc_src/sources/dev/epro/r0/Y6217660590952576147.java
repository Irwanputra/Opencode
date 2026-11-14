package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y6217660590952576147 extends R14062301455140331524 implements J12078565427869724451 {
    public E13273723708836014930 A;
    public byte B;
    public /* synthetic */ X13682529397961211704 C;
    public final /* synthetic */ W5596570651735549214 D;
    public List t;
    public List u;
    public List v;
    public E13273723708836014930 w;
    public E13273723708836014930 x;
    public E13273723708836014930 y;
    public Set z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y6217660590952576147(W5596570651735549214 w5596570651735549214, R4833348786910499294 r4833348786910499294) {
        super(3, r4833348786910499294);
        this.D = w5596570651735549214;
    }

    public static final void j(W5596570651735549214 w5596570651735549214, List list, List list2, List list3, E13273723708836014930 e13273723708836014930, E13273723708836014930 e132737237088360149302, E13273723708836014930 e132737237088360149303, E13273723708836014930 e132737237088360149304) {
        char c;
        long j;
        long j2;
        synchronized (w5596570651735549214.c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    S12944751221596631194 s12944751221596631194 = (S12944751221596631194) list3.get(i);
                    s12944751221596631194.a();
                    w5596570651735549214.P(s12944751221596631194);
                }
                list3.clear();
                Object[] objArr = e13273723708836014930.b;
                long[] jArr = e13273723708836014930.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    S12944751221596631194 s129447512215966311942 = (S12944751221596631194) objArr[(i2 << 3) + i4];
                                    s129447512215966311942.a();
                                    w5596570651735549214.P(s129447512215966311942);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                e13273723708836014930.b();
                Object[] objArr2 = e132737237088360149302.b;
                long[] jArr2 = e132737237088360149302.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((S12944751221596631194) objArr2[(i5 << 3) + i7]).j();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                e132737237088360149302.b();
                e132737237088360149303.b();
                Object[] objArr3 = e132737237088360149304.b;
                long[] jArr3 = e132737237088360149304.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    S12944751221596631194 s129447512215966311943 = (S12944751221596631194) objArr3[(i8 << 3) + i10];
                                    s129447512215966311943.a();
                                    w5596570651735549214.P(s129447512215966311943);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                e132737237088360149304.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void l(List list, W5596570651735549214 w5596570651735549214) {
        list.clear();
        synchronized (w5596570651735549214.c) {
            try {
                ArrayList arrayList = w5596570651735549214.k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((Y6676784304453696344) arrayList.get(i));
                }
                w5596570651735549214.k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Y6217660590952576147 y6217660590952576147 = new Y6217660590952576147(this.D, (R4833348786910499294) obj3);
        y6217660590952576147.C = (X13682529397961211704) obj2;
        y6217660590952576147.invokeSuspend(O9245300239821758723.a);
        return Z3437138737604933638.a;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0140 -> B:6:0x0142). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0238 -> B:41:0x009b). Please report as a decompilation issue!!! */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Y6217660590952576147.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
