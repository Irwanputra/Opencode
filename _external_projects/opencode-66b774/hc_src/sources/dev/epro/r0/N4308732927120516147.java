package dev.epro.r0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N4308732927120516147 extends Y5209789131793062978 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final E13273723708836014930 e;
    public final V697849047308847220 f;
    public final /* synthetic */ M3727281027331139839 g;

    public N4308732927120516147(M3727281027331139839 m3727281027331139839, long j, boolean z, boolean z2, H12843822278061842084 h12843822278061842084) {
        this.g = m3727281027331139839;
        this.a = j;
        this.b = z;
        this.c = z2;
        E13273723708836014930 e13273723708836014930 = L12621230156277355451.a;
        this.e = new E13273723708836014930();
        this.f = new V697849047308847220(P3648740535677465818.d, B14824868959299866349.m);
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void a(S12944751221596631194 s12944751221596631194, L12639328004344855510 l12639328004344855510) {
        this.g.b.a(s12944751221596631194, l12639328004344855510);
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final E13273723708836014930 b(S12944751221596631194 s12944751221596631194, Y16033830328113725410 y16033830328113725410, L12639328004344855510 l12639328004344855510) {
        return this.g.b.b(s12944751221596631194, y16033830328113725410, l12639328004344855510);
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void c(Y6676784304453696344 y6676784304453696344) {
        this.g.b.c(y6676784304453696344);
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void d() {
        M3727281027331139839 m3727281027331139839 = this.g;
        m3727281027331139839.A--;
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final boolean e() {
        return this.g.b.e();
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final boolean f() {
        return this.b;
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final boolean g() {
        return this.c;
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final long h() {
        return this.a;
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final R13600139557160461432 i() {
        return this.g.h;
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final P3648740535677465818 j() {
        return (P3648740535677465818) this.f.getValue();
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final G8001132634698687269 k() {
        return this.g.b.k();
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final boolean l() {
        return this.g.b.l();
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void m(Y6676784304453696344 y6676784304453696344) {
        this.g.b.m(y6676784304453696344);
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void n(S12944751221596631194 s12944751221596631194) {
        M3727281027331139839 m3727281027331139839 = this.g;
        Y5209789131793062978 y5209789131793062978 = m3727281027331139839.b;
        y5209789131793062978.n(m3727281027331139839.h);
        y5209789131793062978.n(s12944751221596631194);
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void o(Y6676784304453696344 y6676784304453696344, O13174596225133003133 o13174596225133003133, E9133045636215945243 e9133045636215945243) {
        this.g.b.o(y6676784304453696344, o13174596225133003133, e9133045636215945243);
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final O13174596225133003133 p(Y6676784304453696344 y6676784304453696344) {
        return this.g.b.p(y6676784304453696344);
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final E13273723708836014930 q(S12944751221596631194 s12944751221596631194, Y16033830328113725410 y16033830328113725410, E13273723708836014930 e13273723708836014930) {
        return this.g.b.q(s12944751221596631194, y16033830328113725410, e13273723708836014930);
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void r(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void s(M3727281027331139839 m3727281027331139839) {
        this.e.a(m3727281027331139839);
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void t(V4878375136513573151 v4878375136513573151) {
        this.g.b.t(v4878375136513573151);
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void u(S12944751221596631194 s12944751221596631194) {
        this.g.b.u(s12944751221596631194);
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final P8628803860726212495 v(W2269277550458425547 w2269277550458425547) {
        return this.g.b.v(w2269277550458425547);
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void w() {
        this.g.A++;
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void x(M3727281027331139839 m3727281027331139839) {
        HashSet hashSet = this.d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                m3727281027331139839.getClass();
                set.remove(m3727281027331139839.x());
            }
        }
        if (m3727281027331139839 != null) {
            this.e.l(m3727281027331139839);
        }
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void y(S12944751221596631194 s12944751221596631194) {
        this.g.b.y(s12944751221596631194);
    }

    public final void z() {
        E13273723708836014930 e13273723708836014930 = this.e;
        if (e13273723708836014930.h()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                Object[] objArr = e13273723708836014930.b;
                long[] jArr = e13273723708836014930.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    M3727281027331139839 m3727281027331139839 = (M3727281027331139839) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(m3727281027331139839.x());
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
                        } else {
                            i++;
                        }
                    }
                }
            }
            e13273723708836014930.b();
        }
    }
}
