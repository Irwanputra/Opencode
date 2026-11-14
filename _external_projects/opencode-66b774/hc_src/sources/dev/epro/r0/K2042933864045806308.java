package dev.epro.r0;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final /* synthetic */ class K2042933864045806308 implements Q12717119941057887287, X2032800221577147908, D9017764184818113880, W15703198999188857860, P11181209716866457693, I8220319968057211477, B8970794335431581539, H16489389149714063960, V5962473127612511307 {
    public final /* synthetic */ byte a;

    public /* synthetic */ K2042933864045806308(byte b) {
        this.a = b;
    }

    public static /* synthetic */ void h() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void i(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void j(String str, long j, Object obj) {
        throw new IllegalArgumentException((str + j + obj).toString());
    }

    public static /* synthetic */ void k(String str, F16470721565862751885 f16470721565862751885, String str2, F16470721565862751885 f164707215658627518852) {
        throw new P13193549499509261669(str, f16470721565862751885, str2, f164707215658627518852);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void m(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void n(String str) {
        throw new NoSuchElementException(str);
    }

    @Override // dev.epro.r0.W15703198999188857860
    public I1581330382723795749 a(Z1953481206310471956 z1953481206310471956) {
        switch (this.a) {
            case 4:
                G5183794802785878636 g5183794802785878636 = (G5183794802785878636) z1953481206310471956;
                return I1581330382723795749.f("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", I12910732364821574203.c(g5183794802785878636).f(), D14731132657808549702.h0, I12910732364821574203.d(g5183794802785878636.j.c), g5183794802785878636.m);
            case 6:
                V16000071791783281652 v16000071791783281652 = (V16000071791783281652) z1953481206310471956;
                Z15849841471700685356 E = G12575294030765068334.E();
                E.e();
                ((G12575294030765068334) E.b).O();
                R17875891402928117061 c = I12910732364821574203.c(v16000071791783281652.j);
                E.e();
                ((G12575294030765068334) E.b).M(c);
                M18082356575916498704 b = I12910732364821574203.b((BigInteger) v16000071791783281652.k.b);
                E.e();
                ((G12575294030765068334) E.b).I(b);
                M18082356575916498704 b2 = I12910732364821574203.b((BigInteger) v16000071791783281652.l.b);
                E.e();
                ((G12575294030765068334) E.b).L(b2);
                M18082356575916498704 b3 = I12910732364821574203.b((BigInteger) v16000071791783281652.m.b);
                E.e();
                ((G12575294030765068334) E.b).N(b3);
                M18082356575916498704 b4 = I12910732364821574203.b((BigInteger) v16000071791783281652.n.b);
                E.e();
                ((G12575294030765068334) E.b).J(b4);
                M18082356575916498704 b5 = I12910732364821574203.b((BigInteger) v16000071791783281652.f537o.b);
                E.e();
                ((G12575294030765068334) E.b).K(b5);
                M18082356575916498704 b6 = I12910732364821574203.b((BigInteger) v16000071791783281652.p.b);
                E.e();
                ((G12575294030765068334) E.b).H(b6);
                return I1581330382723795749.f("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((G12575294030765068334) E.b()).f(), D14731132657808549702.g0, I12910732364821574203.d(v16000071791783281652.j.j.c), v16000071791783281652.I());
            case 12:
                S14902715661559460346 s14902715661559460346 = (S14902715661559460346) z1953481206310471956;
                return I1581330382723795749.f("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", K17398541303404916568.d(s14902715661559460346).f(), D14731132657808549702.h0, K17398541303404916568.e(s14902715661559460346.j.c), s14902715661559460346.m);
            default:
                S7434432239944054875 s7434432239944054875 = (S7434432239944054875) z1953481206310471956;
                H15818187907860935149 E2 = Z12609019287898357344.E();
                E2.e();
                ((Z12609019287898357344) E2.b).O();
                Q72827959762432836 d = K17398541303404916568.d(s7434432239944054875.j);
                E2.e();
                ((Z12609019287898357344) E2.b).M(d);
                M18082356575916498704 b7 = K17398541303404916568.b((BigInteger) s7434432239944054875.k.b);
                E2.e();
                ((Z12609019287898357344) E2.b).I(b7);
                M18082356575916498704 b8 = K17398541303404916568.b((BigInteger) s7434432239944054875.l.b);
                E2.e();
                ((Z12609019287898357344) E2.b).L(b8);
                M18082356575916498704 b9 = K17398541303404916568.b((BigInteger) s7434432239944054875.m.b);
                E2.e();
                ((Z12609019287898357344) E2.b).N(b9);
                M18082356575916498704 b10 = K17398541303404916568.b((BigInteger) s7434432239944054875.n.b);
                E2.e();
                ((Z12609019287898357344) E2.b).J(b10);
                M18082356575916498704 b11 = K17398541303404916568.b((BigInteger) s7434432239944054875.f487o.b);
                E2.e();
                ((Z12609019287898357344) E2.b).K(b11);
                M18082356575916498704 b12 = K17398541303404916568.b((BigInteger) s7434432239944054875.p.b);
                E2.e();
                ((Z12609019287898357344) E2.b).H(b12);
                return I1581330382723795749.f("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((Z12609019287898357344) E2.b()).f(), D14731132657808549702.g0, K17398541303404916568.e(s7434432239944054875.j.j.c), s7434432239944054875.I());
        }
    }

    @Override // dev.epro.r0.P11181209716866457693
    public Z1953481206310471956 b(I1581330382723795749 i1581330382723795749) {
        byte b = 7;
        byte b2 = 8;
        boolean z = false;
        switch (this.a) {
            case 5:
                String str = (String) i1581330382723795749.a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ", str));
                    return null;
                }
                try {
                    R17875891402928117061 C = R17875891402928117061.C((N17666688112968464504) i1581330382723795749.b, R4931231174251890987.a());
                    if (C.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger A = G16660188620551127941.A(C.y().k());
                    int bitLength = A.bitLength();
                    M14296037792602877869 b3 = C5880096771922761272.b();
                    b3.c = (V11865174435555805371) I12910732364821574203.g.b(C.z().x());
                    b3.b = G16660188620551127941.A(C.x().k());
                    b3.a = Integer.valueOf(bitLength);
                    b3.d = I12910732364821574203.e((D14731132657808549702) i1581330382723795749.d);
                    C5880096771922761272 a = b3.a();
                    I1632105416032993715 i1632105416032993715 = new I1632105416032993715(b, z);
                    i1632105416032993715.b = a;
                    i1632105416032993715.c = A;
                    i1632105416032993715.d = (Integer) i1581330382723795749.e;
                    return i1632105416032993715.b();
                } catch (N11355818201711573941 | IllegalArgumentException unused) {
                    W4415201450379021245.c("Parsing RsaSsaPkcs1PublicKey failed");
                    return null;
                }
            case 7:
                String str2 = (String) i1581330382723795749.a;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ", str2));
                    return null;
                }
                try {
                    G12575294030765068334 F = G12575294030765068334.F((N17666688112968464504) i1581330382723795749.b, R4931231174251890987.a());
                    if (F.D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    R17875891402928117061 B = F.B();
                    if (B.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger A2 = G16660188620551127941.A(B.y().k());
                    int bitLength2 = A2.bitLength();
                    BigInteger A3 = G16660188620551127941.A(B.x().k());
                    M14296037792602877869 b4 = C5880096771922761272.b();
                    b4.c = (V11865174435555805371) I12910732364821574203.g.b(B.z().x());
                    b4.b = A3;
                    b4.a = Integer.valueOf(bitLength2);
                    b4.d = I12910732364821574203.e((D14731132657808549702) i1581330382723795749.d);
                    C5880096771922761272 a2 = b4.a();
                    I1632105416032993715 i16321054160329937152 = new I1632105416032993715(b, z);
                    i16321054160329937152.b = a2;
                    i16321054160329937152.c = A2;
                    i16321054160329937152.d = (Integer) i1581330382723795749.e;
                    G5183794802785878636 b5 = i16321054160329937152.b();
                    R6320827706769103704 r6320827706769103704 = new R6320827706769103704();
                    r6320827706769103704.b = null;
                    r6320827706769103704.c = null;
                    r6320827706769103704.d = null;
                    r6320827706769103704.e = null;
                    r6320827706769103704.f = null;
                    r6320827706769103704.g = null;
                    r6320827706769103704.a = b5;
                    M9197813449740923653 a3 = I12910732364821574203.a(F.A());
                    M9197813449740923653 a4 = I12910732364821574203.a(F.C());
                    r6320827706769103704.c = a3;
                    r6320827706769103704.d = a4;
                    r6320827706769103704.b = I12910732364821574203.a(F.x());
                    M9197813449740923653 a5 = I12910732364821574203.a(F.y());
                    M9197813449740923653 a6 = I12910732364821574203.a(F.z());
                    r6320827706769103704.e = a5;
                    r6320827706769103704.f = a6;
                    r6320827706769103704.g = I12910732364821574203.a(F.w());
                    return r6320827706769103704.c();
                } catch (N11355818201711573941 | IllegalArgumentException unused2) {
                    W4415201450379021245.c("Parsing RsaSsaPkcs1PrivateKey failed");
                    return null;
                }
            case 13:
                String str3 = (String) i1581330382723795749.a;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ", str3));
                    return null;
                }
                try {
                    Q72827959762432836 C2 = Q72827959762432836.C((N17666688112968464504) i1581330382723795749.b, R4931231174251890987.a());
                    if (C2.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger A4 = G16660188620551127941.A(C2.y().k());
                    int bitLength3 = A4.bitLength();
                    H6617480571109907827 b6 = M5876618289820536996.b();
                    K12477491117444883648 k12477491117444883648 = K17398541303404916568.g;
                    b6.c = (P11201002968880096560) k12477491117444883648.b(C2.z().z());
                    b6.d = (P11201002968880096560) k12477491117444883648.b(C2.z().x());
                    b6.b = G16660188620551127941.A(C2.x().k());
                    b6.a = Integer.valueOf(bitLength3);
                    b6.b(C2.z().y());
                    b6.f = K17398541303404916568.f((D14731132657808549702) i1581330382723795749.d);
                    M5876618289820536996 a7 = b6.a();
                    I1632105416032993715 i16321054160329937153 = new I1632105416032993715(b2, z);
                    i16321054160329937153.b = a7;
                    i16321054160329937153.c = A4;
                    i16321054160329937153.d = (Integer) i1581330382723795749.e;
                    return i16321054160329937153.c();
                } catch (N11355818201711573941 | IllegalArgumentException unused3) {
                    W4415201450379021245.c("Parsing RsaSsaPssPublicKey failed");
                    return null;
                }
            default:
                String str4 = (String) i1581330382723795749.a;
                if (!str4.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ", str4));
                    return null;
                }
                try {
                    Z12609019287898357344 F2 = Z12609019287898357344.F((N17666688112968464504) i1581330382723795749.b, R4931231174251890987.a());
                    if (F2.D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    Q72827959762432836 B2 = F2.B();
                    if (B2.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger A5 = G16660188620551127941.A(B2.y().k());
                    int bitLength4 = A5.bitLength();
                    BigInteger A6 = G16660188620551127941.A(B2.x().k());
                    H6617480571109907827 b7 = M5876618289820536996.b();
                    K12477491117444883648 k124774911174448836482 = K17398541303404916568.g;
                    b7.c = (P11201002968880096560) k124774911174448836482.b(B2.z().z());
                    b7.d = (P11201002968880096560) k124774911174448836482.b(B2.z().x());
                    b7.b = A6;
                    b7.a = Integer.valueOf(bitLength4);
                    b7.b(B2.z().y());
                    b7.f = K17398541303404916568.f((D14731132657808549702) i1581330382723795749.d);
                    M5876618289820536996 a8 = b7.a();
                    I1632105416032993715 i16321054160329937154 = new I1632105416032993715(b2, z);
                    i16321054160329937154.b = a8;
                    i16321054160329937154.c = A5;
                    i16321054160329937154.d = (Integer) i1581330382723795749.e;
                    S14902715661559460346 c = i16321054160329937154.c();
                    R6320827706769103704 r63208277067691037042 = new R6320827706769103704();
                    r63208277067691037042.b = null;
                    r63208277067691037042.c = null;
                    r63208277067691037042.d = null;
                    r63208277067691037042.e = null;
                    r63208277067691037042.f = null;
                    r63208277067691037042.g = null;
                    r63208277067691037042.a = c;
                    M9197813449740923653 a9 = K17398541303404916568.a(F2.A());
                    M9197813449740923653 a10 = K17398541303404916568.a(F2.C());
                    r63208277067691037042.c = a9;
                    r63208277067691037042.d = a10;
                    r63208277067691037042.b = K17398541303404916568.a(F2.x());
                    M9197813449740923653 a11 = K17398541303404916568.a(F2.y());
                    M9197813449740923653 a12 = K17398541303404916568.a(F2.z());
                    r63208277067691037042.e = a11;
                    r63208277067691037042.f = a12;
                    r63208277067691037042.g = K17398541303404916568.a(F2.w());
                    return r63208277067691037042.d();
                } catch (N11355818201711573941 | IllegalArgumentException unused4) {
                    W4415201450379021245.c("Parsing RsaSsaPssPrivateKey failed");
                    return null;
                }
        }
    }

    @Override // dev.epro.r0.H16489389149714063960
    public boolean c() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x015c, code lost:
    
        if ((!java.util.Objects.equals(java.lang.System.getProperty("java.vendor"), "The Android Project") ? null : java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT)).intValue() <= 21) goto L37;
     */
    @Override // dev.epro.r0.I8220319968057211477
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(dev.epro.r0.Z1953481206310471956 r20) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K2042933864045806308.d(dev.epro.r0.Z1953481206310471956):java.lang.Object");
    }

    @Override // dev.epro.r0.D9017764184818113880
    public T5990920249823963282 e(I1632105416032993715 i1632105416032993715) {
        switch (this.a) {
            case 3:
                String str = (String) i1632105416032993715.c;
                if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ", str));
                    return null;
                }
                try {
                    N1394928448405473927 A = N1394928448405473927.A((N17666688112968464504) i1632105416032993715.b, R4931231174251890987.a());
                    M14296037792602877869 b = C5880096771922761272.b();
                    b.c = (V11865174435555805371) I12910732364821574203.g.b(A.x().x());
                    b.b = G16660188620551127941.A(A.y().k());
                    b.a = Integer.valueOf(A.w());
                    b.d = I12910732364821574203.e((D14731132657808549702) i1632105416032993715.d);
                    return b.a();
                } catch (N11355818201711573941 e) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e);
                }
            default:
                String str2 = (String) i1632105416032993715.c;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ", str2));
                    return null;
                }
                try {
                    R4263435831562973296 A2 = R4263435831562973296.A((N17666688112968464504) i1632105416032993715.b, R4931231174251890987.a());
                    H6617480571109907827 b2 = M5876618289820536996.b();
                    K12477491117444883648 k12477491117444883648 = K17398541303404916568.g;
                    b2.c = (P11201002968880096560) k12477491117444883648.b(A2.x().z());
                    b2.d = (P11201002968880096560) k12477491117444883648.b(A2.x().x());
                    b2.b = G16660188620551127941.A(A2.y().k());
                    b2.a = Integer.valueOf(A2.w());
                    b2.b(A2.x().y());
                    b2.f = K17398541303404916568.f((D14731132657808549702) i1632105416032993715.d);
                    return b2.a();
                } catch (N11355818201711573941 e2) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e2);
                }
        }
    }

    @Override // dev.epro.r0.X2032800221577147908
    public I1632105416032993715 f(T5990920249823963282 t5990920249823963282) {
        switch (this.a) {
            case 2:
                C5880096771922761272 c5880096771922761272 = (C5880096771922761272) t5990920249823963282;
                D14731132657808549702 d = I12910732364821574203.d(c5880096771922761272.c);
                R5921012355334445092 z = N1394928448405473927.z();
                Z399515681477140191 y = A17799468531942579103.y();
                S11983430735376301043 s11983430735376301043 = (S11983430735376301043) I12910732364821574203.g.c(c5880096771922761272.d);
                y.e();
                ((A17799468531942579103) y.b).z(s11983430735376301043);
                A17799468531942579103 a17799468531942579103 = (A17799468531942579103) y.b();
                z.e();
                ((N1394928448405473927) z.b).C(a17799468531942579103);
                int i = c5880096771922761272.a;
                z.e();
                ((N1394928448405473927) z.b).B(i);
                M18082356575916498704 b = I12910732364821574203.b(c5880096771922761272.b);
                z.e();
                ((N1394928448405473927) z.b).D(b);
                return I1632105416032993715.d("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", d, ((N1394928448405473927) z.b()).f());
            default:
                M5876618289820536996 m5876618289820536996 = (M5876618289820536996) t5990920249823963282;
                D14731132657808549702 e = K17398541303404916568.e(m5876618289820536996.c);
                G1224372180740723036 z2 = R4263435831562973296.z();
                F3441479435880239131 c = K17398541303404916568.c(m5876618289820536996);
                z2.e();
                ((R4263435831562973296) z2.b).C(c);
                int i2 = m5876618289820536996.a;
                z2.e();
                ((R4263435831562973296) z2.b).B(i2);
                M18082356575916498704 b2 = K17398541303404916568.b(m5876618289820536996.b);
                z2.e();
                ((R4263435831562973296) z2.b).D(b2);
                return I1632105416032993715.d("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", e, ((R4263435831562973296) z2.b()).f());
        }
    }

    @Override // dev.epro.r0.Q12717119941057887287
    public double g(double d) {
        return d;
    }
}
