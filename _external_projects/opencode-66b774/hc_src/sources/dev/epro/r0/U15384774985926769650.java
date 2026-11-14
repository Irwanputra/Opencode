package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class U15384774985926769650 implements I8220319968057211477, X2032800221577147908, D9017764184818113880, W15703198999188857860, P11181209716866457693 {
    public final /* synthetic */ byte a;

    public /* synthetic */ U15384774985926769650(byte b) {
        this.a = b;
    }

    public static /* synthetic */ void c() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void g(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    @Override // dev.epro.r0.W15703198999188857860
    public I1581330382723795749 a(Z1953481206310471956 z1953481206310471956) {
        switch (this.a) {
            case 5:
                D900858212461245428 d900858212461245428 = (D900858212461245428) z1953481206310471956;
                F6528600733304600919 z = E3303960769985644055.z();
                J4075899935222861919 j4075899935222861919 = d900858212461245428.j;
                M4569630009890340992 y = D15721838497647431583.y();
                int i = j4075899935222861919.b;
                y.e();
                ((D15721838497647431583) y.b).z(i);
                D15721838497647431583 d15721838497647431583 = (D15721838497647431583) y.b();
                z.e();
                ((E3303960769985644055) z.b).D(d15721838497647431583);
                byte[] b = ((J4250663911053539605) d900858212461245428.k.b).b();
                M18082356575916498704 i2 = N17666688112968464504.i(0, b, b.length);
                z.e();
                ((E3303960769985644055) z.b).C(i2);
                return I1581330382723795749.f("type.googleapis.com/google.crypto.tink.AesCmacKey", ((E3303960769985644055) z.b()).f(), D14731132657808549702.f0, R7033599853981556291.W(d900858212461245428.j.c), d900858212461245428.m);
            case 10:
                G13340623375126021314 g13340623375126021314 = (G13340623375126021314) z1953481206310471956;
                K3475778432629073748 z2 = R2730871665897554906.z();
                M6828097002482924699 A = R2093184223260123021.A();
                I7040761221046812072 y2 = G5535738230181928554.y();
                int i3 = g13340623375126021314.j.c;
                y2.e();
                ((G5535738230181928554) y2.b).z(i3);
                G5535738230181928554 g5535738230181928554 = (G5535738230181928554) y2.b();
                A.e();
                ((R2093184223260123021) A.b).C(g5535738230181928554);
                byte[] b2 = ((J4250663911053539605) g13340623375126021314.k.b).b();
                M18082356575916498704 i4 = N17666688112968464504.i(0, b2, b2.length);
                A.e();
                ((R2093184223260123021) A.b).B(i4);
                R2093184223260123021 r2093184223260123021 = (R2093184223260123021) A.b();
                z2.e();
                ((R2730871665897554906) z2.b).C(r2093184223260123021);
                C9647923768390729204 A2 = B2519396215970499246.A();
                A17163912561928975531 a17163912561928975531 = g13340623375126021314.j;
                K14067081624082208325 T = O5354877807466160604.T(a17163912561928975531);
                A2.e();
                ((B2519396215970499246) A2.b).E(T);
                byte[] b3 = ((J4250663911053539605) g13340623375126021314.l.b).b();
                M18082356575916498704 i5 = N17666688112968464504.i(0, b3, b3.length);
                A2.e();
                ((B2519396215970499246) A2.b).D(i5);
                B2519396215970499246 b2519396215970499246 = (B2519396215970499246) A2.b();
                z2.e();
                ((R2730871665897554906) z2.b).D(b2519396215970499246);
                return I1581330382723795749.f("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((R2730871665897554906) z2.b()).f(), D14731132657808549702.f0, O5354877807466160604.f0(a17163912561928975531.e), g13340623375126021314.n);
            case 15:
                B3089877246369334228 b3089877246369334228 = (B3089877246369334228) z1953481206310471956;
                C5838790293687138869 z3 = N3685000735008976361.z();
                Z12613980850602045436 K = U16229988784104357932.K(b3089877246369334228.j);
                z3.e();
                ((N3685000735008976361) z3.b).D(K);
                byte[] b4 = ((J4250663911053539605) b3089877246369334228.k.b).b();
                M18082356575916498704 i6 = N17666688112968464504.i(0, b4, b4.length);
                z3.e();
                ((N3685000735008976361) z3.b).C(i6);
                return I1581330382723795749.f("type.googleapis.com/google.crypto.tink.AesEaxKey", ((N3685000735008976361) z3.b()).f(), D14731132657808549702.f0, U16229988784104357932.S(b3089877246369334228.j.d), b3089877246369334228.m);
            case 20:
                W12607600500791010704 w12607600500791010704 = (W12607600500791010704) z1953481206310471956;
                A10225670138084435446.R(w12607600500791010704.j);
                Y952663972578631405 y3 = N11991487395085389447.y();
                byte[] b5 = ((J4250663911053539605) w12607600500791010704.k.b).b();
                M18082356575916498704 i7 = N17666688112968464504.i(0, b5, b5.length);
                y3.e();
                ((N11991487395085389447) y3.b).B(i7);
                return I1581330382723795749.f("type.googleapis.com/google.crypto.tink.AesGcmKey", ((N11991487395085389447) y3.b()).f(), D14731132657808549702.f0, A10225670138084435446.P(w12607600500791010704.j.d), w12607600500791010704.m);
            default:
                S8155930747170862961 s8155930747170862961 = (S8155930747170862961) z1953481206310471956;
                B2705151270877023791 y4 = Z4545102543618975825.y();
                byte[] b6 = ((J4250663911053539605) s8155930747170862961.k.b).b();
                M18082356575916498704 i8 = N17666688112968464504.i(0, b6, b6.length);
                y4.e();
                ((Z4545102543618975825) y4.b).B(i8);
                return I1581330382723795749.f("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((Z4545102543618975825) y4.b()).f(), D14731132657808549702.f0, Z1953481206310471956.Z(s8155930747170862961.j.b), s8155930747170862961.m);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dev.epro.r0.P11181209716866457693
    public Z1953481206310471956 b(I1581330382723795749 i1581330382723795749) {
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        byte b = 5;
        switch (this.a) {
            case 6:
                if (!((String) i1581330382723795749.a).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    S10973172697741180971.j("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                    return null;
                }
                try {
                    E3303960769985644055 A = E3303960769985644055.A((N17666688112968464504) i1581330382723795749.b, R4931231174251890987.a());
                    if (A.y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    Q7316561721656982910 b2 = J4075899935222861919.b();
                    b2.N(A.w().size());
                    b2.Q(A.x().x());
                    b2.d = R7033599853981556291.a0((D14731132657808549702) i1581330382723795749.d);
                    J4075899935222861919 k = b2.k();
                    Q7316561721656982910 q7316561721656982910 = new Q7316561721656982910((byte) 2, (boolean) (objArr == true ? 1 : 0));
                    q7316561721656982910.c = null;
                    q7316561721656982910.d = null;
                    q7316561721656982910.b = k;
                    q7316561721656982910.c = new M9197813449740923653(J4250663911053539605.a(A.w().k()), b);
                    q7316561721656982910.d = (Integer) i1581330382723795749.e;
                    return q7316561721656982910.h();
                } catch (N11355818201711573941 | IllegalArgumentException unused) {
                    W4415201450379021245.c("Parsing AesCmacKey failed");
                    return null;
                }
            case 11:
                if (!((String) i1581330382723795749.a).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    S10973172697741180971.j("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    R2730871665897554906 A2 = R2730871665897554906.A((N17666688112968464504) i1581330382723795749.b, R4931231174251890987.a());
                    if (A2.y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (A2.w().z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (A2.x().z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    B16853324304735504143 b3 = A17163912561928975531.b();
                    b3.i(A2.w().x().size());
                    b3.j(A2.x().x().size());
                    b3.k(A2.w().y().x());
                    b3.m(A2.x().y().y());
                    b3.e = O5354877807466160604.e0(A2.x().y().x());
                    b3.f = O5354877807466160604.g0((D14731132657808549702) i1581330382723795749.d);
                    A17163912561928975531 b4 = b3.b();
                    J15730374346044043770 j15730374346044043770 = new J15730374346044043770((byte) (objArr3 == true ? 1 : 0), (boolean) (objArr2 == true ? 1 : 0));
                    j15730374346044043770.d = null;
                    j15730374346044043770.e = null;
                    j15730374346044043770.b = null;
                    j15730374346044043770.c = b4;
                    j15730374346044043770.d = new M9197813449740923653(J4250663911053539605.a(A2.w().x().k()), b);
                    j15730374346044043770.e = new M9197813449740923653(J4250663911053539605.a(A2.x().x().k()), b);
                    j15730374346044043770.b = (Integer) i1581330382723795749.e;
                    return j15730374346044043770.o();
                } catch (N11355818201711573941 unused2) {
                    W4415201450379021245.c("Parsing AesCtrHmacAeadKey failed");
                    return null;
                }
            case 16:
                if (!((String) i1581330382723795749.a).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    S10973172697741180971.j("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                    return null;
                }
                try {
                    N3685000735008976361 A3 = N3685000735008976361.A((N17666688112968464504) i1581330382723795749.b, R4931231174251890987.a());
                    if (A3.y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    J15730374346044043770 b5 = W4043777213630942564.b();
                    b5.V(A3.w().size());
                    b5.U(A3.x().x());
                    b5.W();
                    b5.e = U16229988784104357932.T((D14731132657808549702) i1581330382723795749.d);
                    W4043777213630942564 p = b5.p();
                    Q7316561721656982910 q73165617216569829102 = new Q7316561721656982910((byte) 4, (boolean) (objArr4 == true ? 1 : 0));
                    q73165617216569829102.c = null;
                    q73165617216569829102.d = null;
                    q73165617216569829102.b = p;
                    q73165617216569829102.c = new M9197813449740923653(J4250663911053539605.a(A3.w().k()), b);
                    q73165617216569829102.d = (Integer) i1581330382723795749.e;
                    return q73165617216569829102.l();
                } catch (N11355818201711573941 unused3) {
                    W4415201450379021245.c("Parsing AesEaxKey failed");
                    return null;
                }
            case 21:
                if (!((String) i1581330382723795749.a).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    S10973172697741180971.j("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                    return null;
                }
                try {
                    N11991487395085389447 z2 = N11991487395085389447.z((N17666688112968464504) i1581330382723795749.b, R4931231174251890987.a());
                    if (z2.x() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    J15730374346044043770 b6 = T1031997469743650177.b();
                    b6.V(z2.w().size());
                    b6.T();
                    b6.W();
                    b6.e = A10225670138084435446.Q((D14731132657808549702) i1581330382723795749.d);
                    T1031997469743650177 s = b6.s();
                    Q7316561721656982910 q73165617216569829103 = new Q7316561721656982910(b, (boolean) (objArr5 == true ? 1 : 0));
                    q73165617216569829103.c = null;
                    q73165617216569829103.d = null;
                    q73165617216569829103.b = s;
                    q73165617216569829103.c = new M9197813449740923653(J4250663911053539605.a(z2.w().k()), b);
                    q73165617216569829103.d = (Integer) i1581330382723795749.e;
                    return q73165617216569829103.m();
                } catch (N11355818201711573941 unused4) {
                    W4415201450379021245.c("Parsing AesGcmKey failed");
                    return null;
                }
            default:
                if (!((String) i1581330382723795749.a).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    S10973172697741180971.j("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                    return null;
                }
                try {
                    Z4545102543618975825 z3 = Z4545102543618975825.z((N17666688112968464504) i1581330382723795749.b, R4931231174251890987.a());
                    if (z3.x() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    W8455343525638953052 b7 = Z14277976092397041931.b();
                    b7.N(z3.w().size());
                    b7.c = Z1953481206310471956.a0((D14731132657808549702) i1581330382723795749.d);
                    Z14277976092397041931 k2 = b7.k();
                    Q7316561721656982910 q73165617216569829104 = new Q7316561721656982910((byte) 6, z);
                    q73165617216569829104.c = null;
                    q73165617216569829104.d = null;
                    q73165617216569829104.b = k2;
                    q73165617216569829104.c = new M9197813449740923653(J4250663911053539605.a(z3.w().k()), b);
                    q73165617216569829104.d = (Integer) i1581330382723795749.e;
                    return q73165617216569829104.n();
                } catch (N11355818201711573941 unused5) {
                    W4415201450379021245.c("Parsing AesGcmSivKey failed");
                    return null;
                }
        }
    }

    @Override // dev.epro.r0.I8220319968057211477
    public Object d(Z1953481206310471956 z1953481206310471956) {
        byte b = 5;
        B5876679728636531530 b5876679728636531530 = null;
        switch (this.a) {
            case 0:
                U2157586126377853843 u2157586126377853843 = (U2157586126377853843) z1953481206310471956;
                I1581330382723795749 i1581330382723795749 = u2157586126377853843.j;
                byte[] b2 = O8620973563946607355.J((D14731132657808549702) i1581330382723795749.d, (Integer) u2157586126377853843.j.e).b();
                C12886615544961773984 c12886615544961773984 = new C12886615544961773984();
                if (b2.length == 0 || b2.length == 5) {
                    return c12886615544961773984;
                }
                S10973172697741180971.j("identifier has an invalid length");
                return null;
            case 1:
                D900858212461245428 d900858212461245428 = (D900858212461245428) z1953481206310471956;
                if (d900858212461245428.j.a != 32) {
                    W4415201450379021245.c("AesCmacKey size wrong, must be 32 bytes");
                    return null;
                }
                if (!G6547577305291411977.c(1)) {
                    W4415201450379021245.c("Cannot use AES-CMAC in FIPS-mode.");
                    return null;
                }
                Provider U = C775827382551829194.U();
                if (U != null) {
                    try {
                        return Y7661440305297242229.a(d900858212461245428, U);
                    } catch (GeneralSecurityException unused) {
                    }
                }
                return new Y7661440305297242229();
            case 2:
                D900858212461245428 d9008582124612454282 = (D900858212461245428) z1953481206310471956;
                J4075899935222861919 j4075899935222861919 = d9008582124612454282.j;
                int i = j4075899935222861919.a;
                if (i == 32) {
                    b5876679728636531530 = new B5876679728636531530();
                    J8045362843799184672.y(O1900704066613195549.d0(D2728421111140880766.b(i), d9008582124612454282.k));
                    d9008582124612454282.l.b();
                    if (j4075899935222861919.c.equals(D14731132657808549702.e)) {
                        Arrays.copyOf(B5876679728636531530.a, 1);
                    }
                } else {
                    W4415201450379021245.c("AesCmacKey size wrong, must be 32 bytes");
                }
                return b5876679728636531530;
            case 7:
                G13340623375126021314 g13340623375126021314 = (G13340623375126021314) z1953481206310471956;
                byte[] b3 = ((J4250663911053539605) g13340623375126021314.k.b).b();
                A17163912561928975531 a17163912561928975531 = g13340623375126021314.j;
                int i2 = a17163912561928975531.c;
                if (!G6547577305291411977.d(2)) {
                    W4415201450379021245.c("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
                    return null;
                }
                M3250598633778217966.a(b3.length);
                new SecretKeySpec(b3, "AES");
                int blockSize = ((Cipher) G16268810368935789879.a.get()).getBlockSize();
                if (i2 < 12 || i2 > blockSize) {
                    W4415201450379021245.c("invalid IV size");
                    return null;
                }
                A14657410800553081874 a14657410800553081874 = new A14657410800553081874("HMAC".concat(String.valueOf(a17163912561928975531.f)), new SecretKeySpec(((J4250663911053539605) g13340623375126021314.l.b).b(), "HMAC"));
                int i3 = a17163912561928975531.d;
                if (i3 < 10) {
                    throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
                }
                byte[] bArr = new byte[0];
                if (i3 > a14657410800553081874.d) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
                T13746734976263530825 t13746734976263530825 = a14657410800553081874.a;
                ((Mac) t13746734976263530825.get()).update(bArr);
                Arrays.copyOf(((Mac) t13746734976263530825.get()).doFinal(), i3);
                g13340623375126021314.m.b();
                return new C12886615544961773984();
            case 12:
                B3089877246369334228 b3089877246369334228 = (B3089877246369334228) z1953481206310471956;
                int i4 = U10325915168060825601.a;
                if (!G6547577305291411977.c(1)) {
                    W4415201450379021245.c("Can not use AES-EAX in FIPS-mode.");
                    return null;
                }
                W4043777213630942564 w4043777213630942564 = b3089877246369334228.j;
                if (w4043777213630942564.c != 16) {
                    throw new GeneralSecurityException(G6547577305291411977.n(w4043777213630942564.c, "AesEaxJce only supports 16 byte tag size, not "));
                }
                byte[] b4 = ((J4250663911053539605) b3089877246369334228.k.b).b();
                int i5 = w4043777213630942564.b;
                b3089877246369334228.l.b();
                U10325915168060825601 u10325915168060825601 = new U10325915168060825601();
                if (!G6547577305291411977.c(1)) {
                    W4415201450379021245.c("Can not use AES-EAX in FIPS-mode.");
                    return null;
                }
                if (i5 != 12 && i5 != 16) {
                    S10973172697741180971.j("IV size should be either 12 or 16 bytes");
                    return null;
                }
                M3250598633778217966.a(b4.length);
                new SecretKeySpec(b4, "AES");
                J8045362843799184672.y(O1900704066613195549.d0(D2728421111140880766.b(b4.length), new M9197813449740923653(J4250663911053539605.a(b4), b)));
                return u10325915168060825601;
            case 17:
                W12607600500791010704 w12607600500791010704 = (W12607600500791010704) z1953481206310471956;
                T1031997469743650177 t1031997469743650177 = w12607600500791010704.j;
                int i6 = t1031997469743650177.b;
                int i7 = t1031997469743650177.c;
                if (i6 != 12) {
                    throw new GeneralSecurityException(G6547577305291411977.n(t1031997469743650177.b, "Expected IV Size 12, got "));
                }
                if (i7 != 16) {
                    throw new GeneralSecurityException(G6547577305291411977.n(i7, "Expected tag Size 16, got "));
                }
                byte[] b5 = ((J4250663911053539605) w12607600500791010704.k.b).b();
                J4250663911053539605 j4250663911053539605 = w12607600500791010704.l;
                C12886615544961773984 c128866155449617739842 = new C12886615544961773984();
                if (!G6547577305291411977.d(2)) {
                    W4415201450379021245.c("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                    return null;
                }
                int i8 = R2316270382228899970.a;
                M3250598633778217966.a(b5.length);
                new SecretKeySpec(b5, "AES");
                j4250663911053539605.b();
                return c128866155449617739842;
            default:
                S8155930747170862961 s8155930747170862961 = (S8155930747170862961) z1953481206310471956;
                H10984080903272140752 h10984080903272140752 = A5385720901456355948.a;
                byte[] bArr2 = M3966638006528408694.a;
                try {
                    Cipher cipher = (Cipher) A5385720901456355948.a.get();
                    if (cipher == null) {
                        throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
                    }
                    if (!M3966638006528408694.a(cipher)) {
                        S10973172697741180971.m("Cipher does not implement AES GCM SIV.");
                        return null;
                    }
                    byte[] b6 = ((J4250663911053539605) s8155930747170862961.k.b).b();
                    s8155930747170862961.l.b();
                    M3966638006528408694 m3966638006528408694 = new M3966638006528408694();
                    M3250598633778217966.a(b6.length);
                    new SecretKeySpec(b6, "AES");
                    return m3966638006528408694;
                } catch (IllegalStateException e) {
                    throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e);
                }
        }
    }

    @Override // dev.epro.r0.D9017764184818113880
    public T5990920249823963282 e(I1632105416032993715 i1632105416032993715) {
        switch (this.a) {
            case 4:
                String str = (String) i1632105416032993715.c;
                if (!str.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ", str));
                    return null;
                }
                try {
                    N834945665174679349 z = N834945665174679349.z((N17666688112968464504) i1632105416032993715.b, R4931231174251890987.a());
                    Q7316561721656982910 b = J4075899935222861919.b();
                    b.N(z.w());
                    b.Q(z.x().x());
                    b.d = R7033599853981556291.a0((D14731132657808549702) i1632105416032993715.d);
                    return b.k();
                } catch (N11355818201711573941 e) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
                }
            case 9:
                String str2 = (String) i1632105416032993715.c;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ", str2));
                    return null;
                }
                try {
                    Q3490162855680961927 z2 = Q3490162855680961927.z((N17666688112968464504) i1632105416032993715.b, R4931231174251890987.a());
                    if (z2.x().z() != 0) {
                        W4415201450379021245.c("Only version 0 keys are accepted");
                        return null;
                    }
                    B16853324304735504143 b2 = A17163912561928975531.b();
                    b2.i(z2.w().x());
                    b2.j(z2.x().x());
                    b2.k(z2.w().y().x());
                    b2.m(z2.x().y().y());
                    b2.e = O5354877807466160604.e0(z2.x().y().x());
                    b2.f = O5354877807466160604.g0((D14731132657808549702) i1632105416032993715.d);
                    return b2.b();
                } catch (N11355818201711573941 e2) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e2);
                }
            case 14:
                String str3 = (String) i1632105416032993715.c;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ", str3));
                    return null;
                }
                try {
                    I14055983621650734609 z3 = I14055983621650734609.z((N17666688112968464504) i1632105416032993715.b, R4931231174251890987.a());
                    J15730374346044043770 b3 = W4043777213630942564.b();
                    b3.V(z3.w());
                    b3.U(z3.x().x());
                    b3.W();
                    b3.e = U16229988784104357932.T((D14731132657808549702) i1632105416032993715.d);
                    return b3.p();
                } catch (N11355818201711573941 e3) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e3);
                }
            case 19:
                String str4 = (String) i1632105416032993715.c;
                if (!str4.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ", str4));
                    return null;
                }
                try {
                    N6813528544571578800 z4 = N6813528544571578800.z((N17666688112968464504) i1632105416032993715.b, R4931231174251890987.a());
                    if (z4.x() != 0) {
                        W4415201450379021245.c("Only version 0 parameters are accepted");
                        return null;
                    }
                    J15730374346044043770 b4 = T1031997469743650177.b();
                    b4.V(z4.w());
                    b4.T();
                    b4.W();
                    b4.e = A10225670138084435446.Q((D14731132657808549702) i1632105416032993715.d);
                    return b4.s();
                } catch (N11355818201711573941 e4) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e4);
                }
            default:
                String str5 = (String) i1632105416032993715.c;
                if (!str5.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ", str5));
                    return null;
                }
                try {
                    A9262998543231966755 z5 = A9262998543231966755.z((N17666688112968464504) i1632105416032993715.b, R4931231174251890987.a());
                    if (z5.x() != 0) {
                        W4415201450379021245.c("Only version 0 parameters are accepted");
                        return null;
                    }
                    W8455343525638953052 b5 = Z14277976092397041931.b();
                    b5.N(z5.w());
                    b5.c = Z1953481206310471956.a0((D14731132657808549702) i1632105416032993715.d);
                    return b5.k();
                } catch (N11355818201711573941 e5) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e5);
                }
        }
    }

    @Override // dev.epro.r0.X2032800221577147908
    public I1632105416032993715 f(T5990920249823963282 t5990920249823963282) {
        switch (this.a) {
            case 3:
                J4075899935222861919 j4075899935222861919 = (J4075899935222861919) t5990920249823963282;
                D14731132657808549702 W = R7033599853981556291.W(j4075899935222861919.c);
                B9335872021855041505 y = N834945665174679349.y();
                M4569630009890340992 y2 = D15721838497647431583.y();
                int i = j4075899935222861919.b;
                y2.e();
                ((D15721838497647431583) y2.b).z(i);
                D15721838497647431583 d15721838497647431583 = (D15721838497647431583) y2.b();
                y.e();
                ((N834945665174679349) y.b).B(d15721838497647431583);
                int i2 = j4075899935222861919.a;
                y.e();
                ((N834945665174679349) y.b).A(i2);
                return I1632105416032993715.d("type.googleapis.com/google.crypto.tink.AesCmacKey", W, ((N834945665174679349) y.b()).f());
            case 8:
                A17163912561928975531 a17163912561928975531 = (A17163912561928975531) t5990920249823963282;
                D14731132657808549702 f0 = O5354877807466160604.f0(a17163912561928975531.e);
                Y11643405131922837963 y3 = Q3490162855680961927.y();
                O15043370141581947601 z = K17475131016376933427.z();
                I7040761221046812072 y4 = G5535738230181928554.y();
                int i3 = a17163912561928975531.c;
                y4.e();
                ((G5535738230181928554) y4.b).z(i3);
                G5535738230181928554 g5535738230181928554 = (G5535738230181928554) y4.b();
                z.e();
                ((K17475131016376933427) z.b).B(g5535738230181928554);
                int i4 = a17163912561928975531.a;
                z.e();
                ((K17475131016376933427) z.b).A(i4);
                K17475131016376933427 k17475131016376933427 = (K17475131016376933427) z.b();
                y3.e();
                ((Q3490162855680961927) y3.b).A(k17475131016376933427);
                X6694750255078630279 A = R12168770235458988931.A();
                K14067081624082208325 T = O5354877807466160604.T(a17163912561928975531);
                A.e();
                ((R12168770235458988931) A.b).D(T);
                int i5 = a17163912561928975531.b;
                A.e();
                ((R12168770235458988931) A.b).C(i5);
                R12168770235458988931 r12168770235458988931 = (R12168770235458988931) A.b();
                y3.e();
                ((Q3490162855680961927) y3.b).B(r12168770235458988931);
                return I1632105416032993715.d("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", f0, ((Q3490162855680961927) y3.b()).f());
            case 13:
                W4043777213630942564 w4043777213630942564 = (W4043777213630942564) t5990920249823963282;
                D14731132657808549702 S = U16229988784104357932.S(w4043777213630942564.d);
                J15815857725139355184 y5 = I14055983621650734609.y();
                Z12613980850602045436 K = U16229988784104357932.K(w4043777213630942564);
                y5.e();
                ((I14055983621650734609) y5.b).B(K);
                int i6 = w4043777213630942564.a;
                y5.e();
                ((I14055983621650734609) y5.b).A(i6);
                return I1632105416032993715.d("type.googleapis.com/google.crypto.tink.AesEaxKey", S, ((I14055983621650734609) y5.b()).f());
            case 18:
                T1031997469743650177 t1031997469743650177 = (T1031997469743650177) t5990920249823963282;
                A10225670138084435446.R(t1031997469743650177);
                D14731132657808549702 P = A10225670138084435446.P(t1031997469743650177.d);
                N3751888280200859613 y6 = N6813528544571578800.y();
                int i7 = t1031997469743650177.a;
                y6.e();
                ((N6813528544571578800) y6.b).A(i7);
                return I1632105416032993715.d("type.googleapis.com/google.crypto.tink.AesGcmKey", P, ((N6813528544571578800) y6.b()).f());
            default:
                Z14277976092397041931 z14277976092397041931 = (Z14277976092397041931) t5990920249823963282;
                D14731132657808549702 Z = Z1953481206310471956.Z(z14277976092397041931.b);
                D17665983519861703360 y7 = A9262998543231966755.y();
                int i8 = z14277976092397041931.a;
                y7.e();
                ((A9262998543231966755) y7.b).A(i8);
                return I1632105416032993715.d("type.googleapis.com/google.crypto.tink.AesGcmSivKey", Z, ((A9262998543231966755) y7.b()).f());
        }
    }
}
