package dev.epro.r0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class V16504496955554646429 {
    static {
        izmyclvb.qgayjvbiagej2(1139);
    }

    public static int a(int i) {
        return E12098517352909843120.g(i, 3, 2, 1, 10);
    }

    public static final void b(S13992522259207468407 s13992522259207468407, A9257386642212911937 a9257386642212911937) {
        ArrayList arrayList = a9257386642212911937.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            A16390126751166503819 a16390126751166503819 = (A16390126751166503819) arrayList.get(i);
            if (a16390126751166503819 instanceof B17541588548501223042) {
                I15970273004925119830 i15970273004925119830 = new I15970273004925119830();
                B17541588548501223042 b17541588548501223042 = (B17541588548501223042) a16390126751166503819;
                i15970273004925119830.d = b17541588548501223042.b;
                i15970273004925119830.n = true;
                i15970273004925119830.c();
                i15970273004925119830.s.h(b17541588548501223042.c);
                i15970273004925119830.c();
                i15970273004925119830.c();
                i15970273004925119830.b = b17541588548501223042.d;
                i15970273004925119830.c();
                i15970273004925119830.c = b17541588548501223042.e;
                i15970273004925119830.c();
                i15970273004925119830.g = b17541588548501223042.f;
                i15970273004925119830.c();
                i15970273004925119830.e = b17541588548501223042.g;
                i15970273004925119830.c();
                i15970273004925119830.f = b17541588548501223042.h;
                i15970273004925119830.f288o = true;
                i15970273004925119830.c();
                i15970273004925119830.h = b17541588548501223042.i;
                i15970273004925119830.f288o = true;
                i15970273004925119830.c();
                i15970273004925119830.i = b17541588548501223042.j;
                i15970273004925119830.f288o = true;
                i15970273004925119830.c();
                i15970273004925119830.j = b17541588548501223042.k;
                i15970273004925119830.f288o = true;
                i15970273004925119830.c();
                i15970273004925119830.k = b17541588548501223042.l;
                i15970273004925119830.p = true;
                i15970273004925119830.c();
                i15970273004925119830.l = b17541588548501223042.m;
                i15970273004925119830.p = true;
                i15970273004925119830.c();
                i15970273004925119830.m = b17541588548501223042.n;
                i15970273004925119830.p = true;
                i15970273004925119830.c();
                s13992522259207468407.e(i, i15970273004925119830);
            } else if (a16390126751166503819 instanceof A9257386642212911937) {
                S13992522259207468407 s139925222592074684072 = new S13992522259207468407();
                A9257386642212911937 a92573866422129119372 = (A9257386642212911937) a16390126751166503819;
                s139925222592074684072.k = a92573866422129119372.a;
                s139925222592074684072.c();
                s139925222592074684072.l = a92573866422129119372.b;
                s139925222592074684072.s = true;
                s139925222592074684072.c();
                s139925222592074684072.f481o = a92573866422129119372.e;
                s139925222592074684072.s = true;
                s139925222592074684072.c();
                s139925222592074684072.p = a92573866422129119372.f;
                s139925222592074684072.s = true;
                s139925222592074684072.c();
                s139925222592074684072.q = a92573866422129119372.g;
                s139925222592074684072.s = true;
                s139925222592074684072.c();
                s139925222592074684072.r = a92573866422129119372.h;
                s139925222592074684072.s = true;
                s139925222592074684072.c();
                s139925222592074684072.m = a92573866422129119372.c;
                s139925222592074684072.s = true;
                s139925222592074684072.c();
                s139925222592074684072.n = a92573866422129119372.d;
                s139925222592074684072.s = true;
                s139925222592074684072.c();
                s139925222592074684072.f = a92573866422129119372.i;
                s139925222592074684072.g = true;
                s139925222592074684072.c();
                b(s139925222592074684072, a92573866422129119372);
                s13992522259207468407.e(i, s139925222592074684072);
            }
        }
    }

    public static final native boolean c(int i);

    public static final native Q7430090668634766253 d(String str);

    public static final native Q7430090668634766253 e(String str);

    public static final native List f(int i, List list);

    public static final native List g(int i, List list);

    public static final native X10333914069789306310 h(X9711739285227992634 x9711739285227992634, Serializable serializable, boolean z, M3727281027331139839 m3727281027331139839, int i, int i2);

    public static final S10891339096889981600 i(Z7022156542152740569 z7022156542152740569, M3727281027331139839 m3727281027331139839) {
        R8540738700654750557 r8540738700654750557 = (R8540738700654750557) m3727281027331139839.j(Y238707362170117896.h);
        float f = z7022156542152740569.j;
        boolean e = m3727281027331139839.e((Float.floatToRawIntBits(r8540738700654750557.c()) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        Object M = m3727281027331139839.M();
        if (e || M == O9023047933786425027.a) {
            S13992522259207468407 s13992522259207468407 = new S13992522259207468407();
            b(s13992522259207468407, z7022156542152740569.f);
            float f2 = z7022156542152740569.b;
            float f3 = z7022156542152740569.c;
            long floatToRawIntBits = (Float.floatToRawIntBits(r8540738700654750557.K(f2)) << 32) | (Float.floatToRawIntBits(r8540738700654750557.K(f3)) & 4294967295L);
            float f4 = z7022156542152740569.d;
            float f5 = z7022156542152740569.e;
            if (Float.isNaN(f4)) {
                f4 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            }
            if (Float.isNaN(f5)) {
                f5 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
            S10891339096889981600 s10891339096889981600 = new S10891339096889981600(s13992522259207468407);
            String str = z7022156542152740569.a;
            long j = z7022156542152740569.g;
            R3103059035698929241 r3103059035698929241 = j != 16 ? new R3103059035698929241(j, z7022156542152740569.h) : null;
            boolean z = z7022156542152740569.i;
            s10891339096889981600.e.setValue(new W8572396779607072172(floatToRawIntBits));
            s10891339096889981600.f.setValue(Boolean.valueOf(z));
            W2648179124386498421 w2648179124386498421 = s10891339096889981600.g;
            w2648179124386498421.g.setValue(r3103059035698929241);
            w2648179124386498421.i.setValue(new W8572396779607072172(floatToRawIntBits2));
            w2648179124386498421.c = str;
            m3727281027331139839.k0(s10891339096889981600);
            M = s10891339096889981600;
        }
        return (S10891339096889981600) M;
    }

    public static final native H9594781759364688001 j(R2590639056571640352 r2590639056571640352);

    public static final Object k(L12639328004344855510 l12639328004344855510) {
        Thread.interrupted();
        return J8045362843799184672.r0(I3826119971291161142.a, new E13942609761711486177(l12639328004344855510, null, (byte) 24));
    }

    public static final Object l(E14821373638863299332 e14821373638863299332, L12639328004344855510 l12639328004344855510) {
        Object t13610764347093379131;
        Object T;
        J8045362843799184672.c0(e14821373638863299332, true, new V187550826862620921(J8045362843799184672.P(e14821373638863299332.d.getContext()).d(e14821373638863299332.e, e14821373638863299332, e14821373638863299332.c)));
        try {
            if (l12639328004344855510 instanceof B401944902727389462) {
                V12319504402545346730.s(2, l12639328004344855510);
                t13610764347093379131 = l12639328004344855510.invoke(e14821373638863299332, e14821373638863299332);
            } else {
                t13610764347093379131 = E18444280280170001567.a0(l12639328004344855510, e14821373638863299332, e14821373638863299332);
            }
        } catch (Throwable th) {
            t13610764347093379131 = new T13610764347093379131(th, false);
        }
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        if (t13610764347093379131 == z3437138737604933638 || (T = e14821373638863299332.T(t13610764347093379131)) == O4077903568229246.m) {
            return z3437138737604933638;
        }
        if (T instanceof T13610764347093379131) {
            Throwable th2 = ((T13610764347093379131) T).a;
            if (!(th2 instanceof P2480554073835519965)) {
                throw th2;
            }
            if (((P2480554073835519965) th2).a != e14821373638863299332) {
                throw th2;
            }
            if (t13610764347093379131 instanceof T13610764347093379131) {
                throw ((T13610764347093379131) t13610764347093379131).a;
            }
        } else {
            t13610764347093379131 = O4077903568229246.X(T);
        }
        return t13610764347093379131;
    }

    public static final native String m(String str, String str2, String str3, Map map);

    public static final native JSONObject n(Map map, String str);

    public static final native Object o(String str, Object obj);

    public static final int p(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final Object q(long j, L12639328004344855510 l12639328004344855510, K14749510448791472029 k14749510448791472029) {
        if (j > 0) {
            return l(new E14821373638863299332(j, k14749510448791472029), l12639328004344855510);
        }
        throw new P2480554073835519965("Timed out immediately", null);
    }

    public static final Object r(long j, L12639328004344855510 l12639328004344855510, K14749510448791472029 k14749510448791472029) {
        return q(J8045362843799184672.v0(j), l12639328004344855510, k14749510448791472029);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(long r6, dev.epro.r0.L12639328004344855510 r8, dev.epro.r0.R4833348786910499294 r9) {
        /*
            boolean r0 = r9 instanceof dev.epro.r0.L11197565627782677630
            if (r0 == 0) goto L13
            r0 = r9
            dev.epro.r0.L11197565627782677630 r0 = (dev.epro.r0.L11197565627782677630) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dev.epro.r0.L11197565627782677630 r0 = new dev.epro.r0.L11197565627782677630
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.u
            int r1 = r0.v
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            dev.epro.r0.A7209497065939201693 r6 = r0.t
            dev.epro.r0.E17665849472693074628.k(r9)     // Catch: dev.epro.r0.P2480554073835519965 -> L28
            return r9
        L28:
            r7 = move-exception
            goto L56
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r2
        L30:
            dev.epro.r0.E17665849472693074628.k(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3a
            goto L5c
        L3a:
            dev.epro.r0.A7209497065939201693 r9 = new dev.epro.r0.A7209497065939201693
            r9.<init>()
            r0.t = r9     // Catch: dev.epro.r0.P2480554073835519965 -> L54
            r0.v = r3     // Catch: dev.epro.r0.P2480554073835519965 -> L54
            dev.epro.r0.E14821373638863299332 r1 = new dev.epro.r0.E14821373638863299332     // Catch: dev.epro.r0.P2480554073835519965 -> L54
            r1.<init>(r6, r0)     // Catch: dev.epro.r0.P2480554073835519965 -> L54
            r9.a = r1     // Catch: dev.epro.r0.P2480554073835519965 -> L54
            java.lang.Object r6 = l(r1, r8)     // Catch: dev.epro.r0.P2480554073835519965 -> L54
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r6 != r7) goto L53
            return r7
        L53:
            return r6
        L54:
            r7 = move-exception
            r6 = r9
        L56:
            dev.epro.r0.Q15035754882231748864 r8 = r7.a
            java.lang.Object r6 = r6.a
            if (r8 != r6) goto L5d
        L5c:
            return r2
        L5d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V16504496955554646429.s(long, dev.epro.r0.L12639328004344855510, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    public abstract Object a(T18397286815848089648 t18397286815848089648, R14062301455140331524 r14062301455140331524);

    public abstract void a(D16573472668995260995 d16573472668995260995);
}
