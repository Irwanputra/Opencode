package dev.epro.r0;

import android.view.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final /* synthetic */ class C9424689592673022017 extends H4611829575853284164 implements F4096073349764486348 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9424689592673022017(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        Object[] objArr;
        Object[] objArr2;
        int i;
        Integer a;
        T10370494902461206356 n;
        byte b = this.h;
        boolean z = true;
        byte b2 = 0;
        R4833348786910499294 r4833348786910499294 = null;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                E10177778682618078576 e10177778682618078576 = (E10177778682618078576) obj2;
                G14438155262350387569 g14438155262350387569 = e10177778682618078576.E;
                if (booleanValue) {
                    e10177778682618078576.s1();
                } else {
                    if (e10177778682618078576.q != null) {
                        Object[] objArr3 = g14438155262350387569.c;
                        long[] jArr = g14438155262350387569.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8;
                                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                                    int i5 = 0;
                                    while (i5 < i4) {
                                        if ((j & 255) < 128) {
                                            i = i3;
                                            objArr2 = objArr3;
                                            R7033599853981556291.E(e10177778682618078576.V0(), null, null, new G13301441679948205994(e10177778682618078576, (L11334185135933894276) objArr3[(i2 << 3) + i5], r4833348786910499294, b2), 3);
                                        } else {
                                            objArr2 = objArr3;
                                            i = i3;
                                        }
                                        j >>= i;
                                        i5++;
                                        i3 = i;
                                        objArr3 = objArr2;
                                    }
                                    objArr = objArr3;
                                    if (i4 != i3) {
                                    }
                                } else {
                                    objArr = objArr3;
                                }
                                if (i2 != length) {
                                    i2++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                        L11334185135933894276 l11334185135933894276 = e10177778682618078576.G;
                        if (l11334185135933894276 != null) {
                            R7033599853981556291.E(e10177778682618078576.V0(), null, null, new G13301441679948205994(e10177778682618078576, l11334185135933894276, r4833348786910499294, (byte) 1), 3);
                        }
                    }
                    g14438155262350387569.a();
                    e10177778682618078576.G = null;
                    e10177778682618078576.t1();
                }
                return o9245300239821758723;
            case 1:
                ((Set) obj).getClass();
                Q11096631689211733349 q11096631689211733349 = (Q11096631689211733349) obj2;
                ReentrantLock reentrantLock = q11096631689211733349.d;
                reentrantLock.lock();
                try {
                    List d1 = R9411874267597469228.d1(q11096631689211733349.c.values());
                    reentrantLock.unlock();
                    Iterator it = d1.iterator();
                    if (!it.hasNext()) {
                        return o9245300239821758723;
                    }
                    ((S16949023689745670431) it.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 2:
                ((Z3069203969753053913) obj2).n((Throwable) obj);
                return o9245300239821758723;
            case 3:
                long j2 = ((L2216691091636065972) obj).a;
                D3326514432585990587 d3326514432585990587 = (D3326514432585990587) obj2;
                d3326514432585990587.getClass();
                N17973540381786567516 n17973540381786567516 = (N17973540381786567516) B11964701839924937722.o(d3326514432585990587, M6666571459626975107.a);
                if (n17973540381786567516 != null) {
                    R7033599853981556291.E(d3326514432585990587.V0(), null, null, new F3485194578516100457(d3326514432585990587, j2, n17973540381786567516, new E5894962793985543966(d3326514432585990587, j2), (R4833348786910499294) null), 3);
                }
                return o9245300239821758723;
            case 4:
                ((Y8564331055586212282) obj2).b.a((F4096073349764486348) obj);
                return o9245300239821758723;
            default:
                KeyEvent keyEvent = ((Q16871679788547714558) obj).a;
                Y17595458774289365313 y17595458774289365313 = (Y17595458774289365313) obj2;
                Z10216649008126070808 z10216649008126070808 = y17595458774289365313.f;
                boolean z2 = y17595458774289365313.d;
                J14617885194716764421 j14617885194716764421 = (U8836654130139556418.q(keyEvent) && (a = y17595458774289365313.i.a(keyEvent)) != null) ? new J14617885194716764421(new StringBuilder().appendCodePoint(a.intValue()).toString(), 1) : null;
                if (j14617885194716764421 != null) {
                    if (z2) {
                        y17595458774289365313.a(K5751602218013079365.U(j14617885194716764421));
                        z10216649008126070808.a = null;
                    }
                    z = false;
                } else {
                    if (D15445857918358799638.K(keyEvent) == 2 && (n = M2066880349381062048.N.n(keyEvent)) != null && (!n.a || z2)) {
                        M4043793213707479819 m4043793213707479819 = new M4043793213707479819();
                        m4043793213707479819.a = true;
                        U6413690856892394737 u6413690856892394737 = new U6413690856892394737(n, y17595458774289365313, m4043793213707479819, (byte) 19);
                        F13241018602672925865 f13241018602672925865 = y17595458774289365313.c;
                        K7926568895584534068 k7926568895584534068 = new K7926568895584534068(f13241018602672925865, y17595458774289365313.g, y17595458774289365313.a.d(), z10216649008126070808);
                        u6413690856892394737.invoke(k7926568895584534068);
                        boolean c = F12478849263529740365.c(k7926568895584534068.f, f13241018602672925865.b);
                        M11181104712105445833 m11181104712105445833 = k7926568895584534068.g;
                        if (!c || !S10823041268949770285.t(m11181104712105445833, f13241018602672925865.a)) {
                            y17595458774289365313.j.invoke(F13241018602672925865.a(f13241018602672925865, m11181104712105445833, k7926568895584534068.f, 4));
                        }
                        y17595458774289365313.h.e = true;
                        z = m4043793213707479819.a;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
