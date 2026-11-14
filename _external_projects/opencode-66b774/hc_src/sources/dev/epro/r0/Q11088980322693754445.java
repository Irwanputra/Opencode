package dev.epro.r0;

import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class Q11088980322693754445 implements J6301524036964264730, X2032800221577147908, D9017764184818113880, W15703198999188857860, P11181209716866457693, I8220319968057211477 {
    public final /* synthetic */ byte a;

    public /* synthetic */ Q11088980322693754445(byte b) {
        this.a = b;
    }

    public static /* synthetic */ void g(Object obj, Object obj2) {
        throw new H5773836956528659269("Fragment " + obj + obj2);
    }

    public static /* synthetic */ void h(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void i(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void k(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void l(String str, Object obj) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void m(String str, Object obj) {
        throw new IllegalStateException(str + obj);
    }

    @Override // dev.epro.r0.W15703198999188857860
    public I1581330382723795749 a(Z1953481206310471956 z1953481206310471956) {
        switch (this.a) {
            case 4:
                A7792011892930360131 a7792011892930360131 = (A7792011892930360131) z1953481206310471956;
                return I1581330382723795749.f("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", Q3181834110876746778.F(a7792011892930360131).f(), D14731132657808549702.h0, Q3181834110876746778.R(a7792011892930360131.j.d), a7792011892930360131.m);
            case 6:
                A3294381126080083909 a3294381126080083909 = (A3294381126080083909) z1953481206310471956;
                int D = Q3181834110876746778.D(a3294381126080083909.j.j.b);
                J17963313904821611648 z = V10413431034832764763.z();
                A7792011892930360131 a77920118929303601312 = a3294381126080083909.j;
                B700745113150218005 F = Q3181834110876746778.F(a77920118929303601312);
                z.e();
                ((V10413431034832764763) z.b).D(F);
                byte[] M = G16660188620551127941.M((BigInteger) a3294381126080083909.k.b, D);
                M18082356575916498704 i = N17666688112968464504.i(0, M, M.length);
                z.e();
                ((V10413431034832764763) z.b).C(i);
                return I1581330382723795749.f("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((V10413431034832764763) z.b()).f(), D14731132657808549702.g0, Q3181834110876746778.R(a77920118929303601312.j.d), a3294381126080083909.I());
            case 14:
                E17338338377881930138 e17338338377881930138 = (E17338338377881930138) z1953481206310471956;
                return I1581330382723795749.f("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", Y582199805280922215.B(e17338338377881930138).f(), D14731132657808549702.h0, Y582199805280922215.Q(e17338338377881930138.j.a), e17338338377881930138.m);
            case 16:
                H12854953188221809952 h12854953188221809952 = (H12854953188221809952) z1953481206310471956;
                O17837525504276300577 z2 = Z5675989004712055979.z();
                C11426265104635982771 B = Y582199805280922215.B(h12854953188221809952.j);
                z2.e();
                ((Z5675989004712055979) z2.b).D(B);
                byte[] b = ((J4250663911053539605) h12854953188221809952.k.b).b();
                M18082356575916498704 i2 = N17666688112968464504.i(0, b, b.length);
                z2.e();
                ((Z5675989004712055979) z2.b).C(i2);
                return I1581330382723795749.f("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((Z5675989004712055979) z2.b()).f(), D14731132657808549702.g0, Y582199805280922215.Q(h12854953188221809952.j.j.a), h12854953188221809952.I());
            default:
                W13640341017465735251 w13640341017465735251 = (W13640341017465735251) z1953481206310471956;
                C9647923768390729204 A = B2519396215970499246.A();
                N13917601494741667358 n13917601494741667358 = w13640341017465735251.j;
                A8052260396440080824 z3 = K14067081624082208325.z();
                int i3 = n13917601494741667358.b;
                z3.e();
                ((K14067081624082208325) z3.b).B(i3);
                S11983430735376301043 s11983430735376301043 = (S11983430735376301043) R4870607934171228124.a.c(n13917601494741667358.d);
                z3.e();
                ((K14067081624082208325) z3.b).A(s11983430735376301043);
                K14067081624082208325 k14067081624082208325 = (K14067081624082208325) z3.b();
                A.e();
                ((B2519396215970499246) A.b).E(k14067081624082208325);
                byte[] b2 = ((J4250663911053539605) w13640341017465735251.k.b).b();
                M18082356575916498704 i4 = N17666688112968464504.i(0, b2, b2.length);
                A.e();
                ((B2519396215970499246) A.b).D(i4);
                return I1581330382723795749.f("type.googleapis.com/google.crypto.tink.HmacKey", ((B2519396215970499246) A.b()).f(), D14731132657808549702.f0, R4870607934171228124.a(w13640341017465735251.j.c), w13640341017465735251.m);
        }
    }

    @Override // dev.epro.r0.P11181209716866457693
    public Z1953481206310471956 b(I1581330382723795749 i1581330382723795749) {
        byte b = 18;
        byte b2 = 5;
        boolean z = false;
        switch (this.a) {
            case 5:
                String str = (String) i1581330382723795749.a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ", str));
                    return null;
                }
                try {
                    B700745113150218005 C = B700745113150218005.C((N17666688112968464504) i1581330382723795749.b, R4931231174251890987.a());
                    if (C.y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    J15730374346044043770 b3 = O10635330630771259783.b();
                    b3.e = Q3181834110876746778.Q(C.x().z());
                    b3.c = Q3181834110876746778.S(C.x().y());
                    b3.d = Q3181834110876746778.P(C.x().w());
                    b3.b = Q3181834110876746778.T((D14731132657808549702) i1581330382723795749.d);
                    O10635330630771259783 t = b3.t();
                    Q7316561721656982910 q7316561721656982910 = new Q7316561721656982910(b, z);
                    q7316561721656982910.c = null;
                    q7316561721656982910.d = null;
                    q7316561721656982910.b = t;
                    q7316561721656982910.c = new ECPoint(G16660188620551127941.A(C.z().k()), G16660188620551127941.A(C.A().k()));
                    q7316561721656982910.d = (Integer) i1581330382723795749.e;
                    return q7316561721656982910.o();
                } catch (N11355818201711573941 | IllegalArgumentException unused) {
                    W4415201450379021245.c("Parsing EcdsaPublicKey failed");
                    return null;
                }
            case 7:
                String str2 = (String) i1581330382723795749.a;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ", str2));
                    return null;
                }
                try {
                    V10413431034832764763 A = V10413431034832764763.A((N17666688112968464504) i1581330382723795749.b, R4931231174251890987.a());
                    if (A.y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    B700745113150218005 x = A.x();
                    if (x.y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    J15730374346044043770 b4 = O10635330630771259783.b();
                    b4.e = Q3181834110876746778.Q(x.x().z());
                    b4.c = Q3181834110876746778.S(x.x().y());
                    b4.d = Q3181834110876746778.P(x.x().w());
                    b4.b = Q3181834110876746778.T((D14731132657808549702) i1581330382723795749.d);
                    O10635330630771259783 t2 = b4.t();
                    Q7316561721656982910 q73165617216569829102 = new Q7316561721656982910(b, z);
                    q73165617216569829102.c = null;
                    q73165617216569829102.d = null;
                    q73165617216569829102.b = t2;
                    q73165617216569829102.c = new ECPoint(G16660188620551127941.A(x.z().k()), G16660188620551127941.A(x.A().k()));
                    q73165617216569829102.d = (Integer) i1581330382723795749.e;
                    A7792011892930360131 o2 = q73165617216569829102.o();
                    W8455343525638953052 w8455343525638953052 = new W8455343525638953052((byte) 20, z);
                    w8455343525638953052.c = null;
                    w8455343525638953052.b = o2;
                    w8455343525638953052.c = new M9197813449740923653((Object) G16660188620551127941.A(A.w().k()), (byte) 4);
                    return w8455343525638953052.l();
                } catch (N11355818201711573941 | IllegalArgumentException unused2) {
                    W4415201450379021245.c("Parsing EcdsaPrivateKey failed");
                    return null;
                }
            case 15:
                String str3 = (String) i1581330382723795749.a;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ", str3));
                    return null;
                }
                try {
                    C11426265104635982771 A2 = C11426265104635982771.A((N17666688112968464504) i1581330382723795749.b, R4931231174251890987.a());
                    if (A2.y() == 0) {
                        return E17338338377881930138.e0(Y582199805280922215.R((D14731132657808549702) i1581330382723795749.d), J4250663911053539605.a(A2.x().k()), (Integer) i1581330382723795749.e);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (N11355818201711573941 unused3) {
                    W4415201450379021245.c("Parsing Ed25519PublicKey failed");
                    return null;
                }
            case 17:
                String str4 = (String) i1581330382723795749.a;
                if (!str4.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ", str4));
                    return null;
                }
                try {
                    Z5675989004712055979 A3 = Z5675989004712055979.A((N17666688112968464504) i1581330382723795749.b, R4931231174251890987.a());
                    if (A3.y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C11426265104635982771 x2 = A3.x();
                    if (x2.y() == 0) {
                        return H12854953188221809952.f0(E17338338377881930138.e0(Y582199805280922215.R((D14731132657808549702) i1581330382723795749.d), J4250663911053539605.a(x2.x().k()), (Integer) i1581330382723795749.e), new M9197813449740923653(J4250663911053539605.a(A3.w().k()), b2));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (N11355818201711573941 unused4) {
                    W4415201450379021245.c("Parsing Ed25519PrivateKey failed");
                    return null;
                }
            default:
                if (!((String) i1581330382723795749.a).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    S10973172697741180971.j("Wrong type URL in call to HmacProtoSerialization.parseKey");
                    return null;
                }
                try {
                    B2519396215970499246 B = B2519396215970499246.B((N17666688112968464504) i1581330382723795749.b, R4931231174251890987.a());
                    if (B.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    J15730374346044043770 b5 = N13917601494741667358.b();
                    b5.b = Integer.valueOf(B.x().size());
                    b5.c = Integer.valueOf(B.y().y());
                    b5.d = (K18164101509571580779) R4870607934171228124.a.b(B.y().x());
                    b5.e = R4870607934171228124.b((D14731132657808549702) i1581330382723795749.d);
                    N13917601494741667358 u = b5.u();
                    Q7316561721656982910 q73165617216569829103 = new Q7316561721656982910((byte) 22, z);
                    q73165617216569829103.c = null;
                    q73165617216569829103.d = null;
                    q73165617216569829103.b = u;
                    q73165617216569829103.c = new M9197813449740923653(J4250663911053539605.a(B.x().k()), b2);
                    q73165617216569829103.d = (Integer) i1581330382723795749.e;
                    return q73165617216569829103.p();
                } catch (N11355818201711573941 | IllegalArgumentException unused5) {
                    W4415201450379021245.c("Parsing HmacKey failed");
                    return null;
                }
        }
    }

    @Override // dev.epro.r0.I8220319968057211477
    public Object d(Z1953481206310471956 z1953481206310471956) {
        switch (this.a) {
            case 8:
                A3294381126080083909 a3294381126080083909 = (A3294381126080083909) z1953481206310471956;
                Provider U = C775827382551829194.U();
                S14062146164092607729 s14062146164092607729 = (S14062146164092607729) Y13277292519794314229.i.c(a3294381126080083909.j.j.c);
                K12477491117444883648 k12477491117444883648 = Y13277292519794314229.j;
                A7792011892930360131 a7792011892930360131 = a3294381126080083909.j;
                K12477491117444883648 k124774911174448836482 = Y13277292519794314229.k;
                O10635330630771259783 o10635330630771259783 = a7792011892930360131.j;
                a3294381126080083909.d0().b();
                if (o10635330630771259783.d.equals(D14731132657808549702.H)) {
                    byte[] bArr = E16404348017745658067.b;
                } else {
                    byte[] bArr2 = E16404348017745658067.a;
                }
                E16404348017745658067 e16404348017745658067 = new E16404348017745658067();
                if (!G6547577305291411977.d(2)) {
                    W4415201450379021245.c("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
                    throw null;
                }
                M3250598633778217966.d(s14062146164092607729);
                String.valueOf(s14062146164092607729).concat("withECDSA");
                return e16404348017745658067;
            case 9:
                A7792011892930360131 a77920118929303601312 = (A7792011892930360131) z1953481206310471956;
                byte[] bArr3 = Y13277292519794314229.g;
                Provider U2 = C775827382551829194.U();
                K12477491117444883648 k124774911174448836483 = Y13277292519794314229.k;
                O10635330630771259783 o106353306307712597832 = a77920118929303601312.j;
                return new Y13277292519794314229((ECPublicKey) (U2 != null ? KeyFactory.getInstance("EC", U2) : (KeyFactory) W8357658991043002609.f.a.a("EC")).generatePublic(new ECPublicKeySpec(a77920118929303601312.k, K5751602218013079365.L((J1101004311847117810) k124774911174448836483.c(o106353306307712597832.b)))), (S14062146164092607729) Y13277292519794314229.i.c(o106353306307712597832.c), (V14134441514818836082) Y13277292519794314229.j.c(o106353306307712597832.a), a77920118929303601312.l.b(), o106353306307712597832.d.equals(D14731132657808549702.H) ? Y13277292519794314229.h : Y13277292519794314229.g, U2);
            case 10:
                H12854953188221809952 h12854953188221809952 = (H12854953188221809952) z1953481206310471956;
                if (!G6547577305291411977.c(1)) {
                    W4415201450379021245.c("Can not use Ed25519 in FIPS-mode.");
                    return null;
                }
                try {
                    return E16404348017745658067.a(h12854953188221809952);
                } catch (GeneralSecurityException unused) {
                    byte[] b = ((J4250663911053539605) h12854953188221809952.k.b).b();
                    h12854953188221809952.d0().b();
                    D14731132657808549702 d14731132657808549702 = h12854953188221809952.j.j.a;
                    D14731132657808549702 d147311326578085497022 = D14731132657808549702.L;
                    E16404348017745658067 e164043480177456580672 = new E16404348017745658067();
                    if (!G6547577305291411977.c(1)) {
                        W4415201450379021245.c("Can not use Ed25519 in FIPS-mode.");
                        throw null;
                    }
                    if (b.length == 32) {
                        D15445857918358799638.X(D15445857918358799638.H(b)).R();
                        return e164043480177456580672;
                    }
                    S10973172697741180971.j("Given private key's length is not 32");
                    throw null;
                }
            case 11:
                E17338338377881930138 e17338338377881930138 = (E17338338377881930138) z1953481206310471956;
                if (G6547577305291411977.c(1)) {
                    try {
                        return O6180150081584389963.b(e17338338377881930138);
                    } catch (GeneralSecurityException unused2) {
                        return new Y5809172221756938728(e17338338377881930138.k.b(), e17338338377881930138.l.b(), e17338338377881930138.j.a != D14731132657808549702.L ? new byte[0] : new byte[]{0});
                    }
                }
                W4415201450379021245.c("Can not use Ed25519 in FIPS-mode.");
                return null;
            case 22:
                Y7661440305297242229 y7661440305297242229 = new Y7661440305297242229();
                if (G6547577305291411977.d(2)) {
                    return y7661440305297242229;
                }
                W4415201450379021245.c("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                return null;
            default:
                W13640341017465735251 w13640341017465735251 = (W13640341017465735251) z1953481206310471956;
                B5876679728636531530 b5876679728636531530 = new B5876679728636531530();
                new A14657410800553081874("HMAC".concat(String.valueOf(w13640341017465735251.j.d)), new SecretKeySpec(((J4250663911053539605) w13640341017465735251.k.b).b(), "HMAC"));
                N13917601494741667358 n13917601494741667358 = w13640341017465735251.j;
                int i = n13917601494741667358.b;
                w13640341017465735251.l.b();
                if (n13917601494741667358.c.equals(D14731132657808549702.P)) {
                    Arrays.copyOf(B5876679728636531530.a, 1);
                }
                return b5876679728636531530;
        }
    }

    @Override // dev.epro.r0.D9017764184818113880
    public T5990920249823963282 e(I1632105416032993715 i1632105416032993715) {
        switch (this.a) {
            case 3:
                String str = (String) i1632105416032993715.c;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ", str));
                    return null;
                }
                try {
                    U10658576062335577754 y = U10658576062335577754.y((N17666688112968464504) i1632105416032993715.b, R4931231174251890987.a());
                    J15730374346044043770 b = O10635330630771259783.b();
                    b.e = Q3181834110876746778.Q(y.w().z());
                    b.c = Q3181834110876746778.S(y.w().y());
                    b.d = Q3181834110876746778.P(y.w().w());
                    b.b = Q3181834110876746778.T((D14731132657808549702) i1632105416032993715.d);
                    return b.t();
                } catch (N11355818201711573941 e) {
                    throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e);
                }
            case 13:
                String str2 = (String) i1632105416032993715.c;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ", str2));
                    return null;
                }
                try {
                    if (Y3604861693023267742.y((N17666688112968464504) i1632105416032993715.b, R4931231174251890987.a()).x() == 0) {
                        return new A17493290252326224231(Y582199805280922215.R((D14731132657808549702) i1632105416032993715.d));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (N11355818201711573941 e2) {
                    throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e2);
                }
            default:
                String str3 = (String) i1632105416032993715.c;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to HmacProtoSerialization.parseParameters: ", str3));
                    return null;
                }
                try {
                    R12168770235458988931 B = R12168770235458988931.B((N17666688112968464504) i1632105416032993715.b, R4931231174251890987.a());
                    if (B.z() != 0) {
                        throw new GeneralSecurityException(G6547577305291411977.n(B.z(), "Parsing HmacParameters failed: unknown Version "));
                    }
                    J15730374346044043770 b2 = N13917601494741667358.b();
                    b2.b = Integer.valueOf(B.x());
                    b2.c = Integer.valueOf(B.y().y());
                    b2.d = (K18164101509571580779) R4870607934171228124.a.b(B.y().x());
                    b2.e = R4870607934171228124.b((D14731132657808549702) i1632105416032993715.d);
                    return b2.u();
                } catch (N11355818201711573941 e3) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e3);
                }
        }
    }

    @Override // dev.epro.r0.X2032800221577147908
    public I1632105416032993715 f(T5990920249823963282 t5990920249823963282) {
        switch (this.a) {
            case 2:
                O10635330630771259783 o10635330630771259783 = (O10635330630771259783) t5990920249823963282;
                D14731132657808549702 R = Q3181834110876746778.R(o10635330630771259783.d);
                P17023343522998529741 x = U10658576062335577754.x();
                D5244425530560719140 E = Q3181834110876746778.E(o10635330630771259783);
                x.e();
                ((U10658576062335577754) x.b).z(E);
                return I1632105416032993715.d("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", R, ((U10658576062335577754) x.b()).f());
            case 12:
                return I1632105416032993715.d("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", Y582199805280922215.Q(((A17493290252326224231) t5990920249823963282).a), Y3604861693023267742.w().f());
            default:
                N13917601494741667358 n13917601494741667358 = (N13917601494741667358) t5990920249823963282;
                D14731132657808549702 a = R4870607934171228124.a(n13917601494741667358.c);
                X6694750255078630279 A = R12168770235458988931.A();
                A8052260396440080824 z = K14067081624082208325.z();
                int i = n13917601494741667358.b;
                z.e();
                ((K14067081624082208325) z.b).B(i);
                S11983430735376301043 s11983430735376301043 = (S11983430735376301043) R4870607934171228124.a.c(n13917601494741667358.d);
                z.e();
                ((K14067081624082208325) z.b).A(s11983430735376301043);
                K14067081624082208325 k14067081624082208325 = (K14067081624082208325) z.b();
                A.e();
                ((R12168770235458988931) A.b).D(k14067081624082208325);
                int i2 = n13917601494741667358.a;
                A.e();
                ((R12168770235458988931) A.b).C(i2);
                return I1632105416032993715.d("type.googleapis.com/google.crypto.tink.HmacKey", a, ((R12168770235458988931) A.b()).f());
        }
    }

    @Override // dev.epro.r0.J6301524036964264730
    public float c(float f) {
        return f;
    }
}
