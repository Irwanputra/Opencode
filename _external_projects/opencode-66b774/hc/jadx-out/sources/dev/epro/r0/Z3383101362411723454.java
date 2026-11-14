package dev.epro.r0;

import ads_mobile_sdk.yi1;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Z3383101362411723454 implements H14763425654620554740, I8220319968057211477, X2032800221577147908, D9017764184818113880, W15703198999188857860, P11181209716866457693 {
    public final /* synthetic */ byte a;

    public /* synthetic */ Z3383101362411723454(byte b) {
        this.a = b;
    }

    public static /* synthetic */ void g() {
        throw new M8821877208104636290();
    }

    public static /* synthetic */ void h(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    public static /* synthetic */ void i(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + ((Object) String.valueOf(obj)));
    }

    public static /* synthetic */ void j(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void k(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void l(String str, Object obj) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void m(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void n() {
        throw new M8821877208104636290();
    }

    public static /* synthetic */ void o(String str) throws yi1 {
        throw new yi1(str);
    }

    public static /* synthetic */ void p(String str, Object obj) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void q(String str, Throwable th) throws IOException {
        throw new IOException(str, th);
    }

    public static /* synthetic */ void r() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void s() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void t() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void u() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void v() throws C17458191457732048292 {
        throw new C17458191457732048292();
    }

    @Override // dev.epro.r0.W15703198999188857860
    public I1581330382723795749 a(Z1953481206310471956 z1953481206310471956) throws GeneralSecurityException {
        D14731132657808549702 d14731132657808549702;
        switch (this.a) {
            case 5:
                Y2188645061177063576 y2188645061177063576 = (Y2188645061177063576) z1953481206310471956;
                I8444166898151492691 i8444166898151492691Z = Q3437092356240588267.z();
                byte[] bArrB = ((J4250663911053539605) y2188645061177063576.k.b).b();
                M18082356575916498704 m18082356575916498704I = N17666688112968464504.i(0, bArrB, bArrB.length);
                i8444166898151492691Z.e();
                ((Q3437092356240588267) i8444166898151492691Z.b).B(m18082356575916498704I);
                R10365513111800052132 r10365513111800052132Y = F8305575804941370353.y();
                D3673201505608512511 d3673201505608512511 = y2188645061177063576.j;
                int i = d3673201505608512511.b;
                r10365513111800052132Y.e();
                ((F8305575804941370353) r10365513111800052132Y.b).z(i);
                F8305575804941370353 f8305575804941370353 = (F8305575804941370353) r10365513111800052132Y.b();
                i8444166898151492691Z.e();
                ((Q3437092356240588267) i8444166898151492691Z.b).C(f8305575804941370353);
                M18082356575916498704 m18082356575916498704F = ((Q3437092356240588267) i8444166898151492691Z.b()).f();
                D14731132657808549702 d147311326578085497022 = D14731132657808549702.f0;
                D14731132657808549702 d147311326578085497023 = d3673201505608512511.a;
                if (d147311326578085497023 == D14731132657808549702.x0) {
                    d14731132657808549702 = D14731132657808549702.k0;
                } else {
                    if (d147311326578085497023 != D14731132657808549702.y0) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(d147311326578085497023)));
                    }
                    d14731132657808549702 = D14731132657808549702.m0;
                }
                return I1581330382723795749.f("type.googleapis.com/google.crypto.tink.XAesGcmKey", m18082356575916498704F, d147311326578085497022, d14731132657808549702, y2188645061177063576.m);
            default:
                X17251871386643959137 x17251871386643959137 = (X17251871386643959137) z1953481206310471956;
                M5186966676685540183 m5186966676685540183Y = O12181363265792497093.y();
                byte[] bArrB2 = ((J4250663911053539605) x17251871386643959137.k.b).b();
                M18082356575916498704 m18082356575916498704I2 = N17666688112968464504.i(0, bArrB2, bArrB2.length);
                m5186966676685540183Y.e();
                ((O12181363265792497093) m5186966676685540183Y.b).B(m18082356575916498704I2);
                return I1581330382723795749.f("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((O12181363265792497093) m5186966676685540183Y.b()).f(), D14731132657808549702.f0, J8045362843799184672.x0(x17251871386643959137.j.a), x17251871386643959137.m);
        }
    }

    @Override // dev.epro.r0.P11181209716866457693
    public Z1953481206310471956 b(I1581330382723795749 i1581330382723795749) throws GeneralSecurityException {
        D14731132657808549702 d14731132657808549702;
        byte b = 5;
        switch (this.a) {
            case 6:
                if (!((String) i1581330382723795749.a).equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    S10973172697741180971.j("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                    return null;
                }
                try {
                    Q3437092356240588267 q3437092356240588267A = Q3437092356240588267.A((N17666688112968464504) i1581330382723795749.b, R4931231174251890987.a());
                    if (q3437092356240588267A.y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (q3437092356240588267A.w().size() != 32) {
                        throw new GeneralSecurityException("Only 32 byte key size is accepted");
                    }
                    D14731132657808549702 d147311326578085497022 = (D14731132657808549702) i1581330382723795749.d;
                    if (d147311326578085497022 == D14731132657808549702.k0) {
                        d14731132657808549702 = D14731132657808549702.x0;
                    } else {
                        if (d147311326578085497022 != D14731132657808549702.m0) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(d147311326578085497022)));
                        }
                        d14731132657808549702 = D14731132657808549702.y0;
                    }
                    return Y2188645061177063576.e0(D3673201505608512511.b(q3437092356240588267A.x().x(), d14731132657808549702), new M9197813449740923653(J4250663911053539605.a(q3437092356240588267A.w().k()), b), (Integer) i1581330382723795749.e);
                } catch (N11355818201711573941 unused) {
                    W4415201450379021245.c("Parsing XAesGcmKey failed");
                    return null;
                }
            default:
                if (!((String) i1581330382723795749.a).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    S10973172697741180971.j("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                    return null;
                }
                try {
                    O12181363265792497093 o12181363265792497093Z = O12181363265792497093.z((N17666688112968464504) i1581330382723795749.b, R4931231174251890987.a());
                    if (o12181363265792497093Z.x() == 0) {
                        return X17251871386643959137.e0(J8045362843799184672.y0((D14731132657808549702) i1581330382723795749.d), new M9197813449740923653(J4250663911053539605.a(o12181363265792497093Z.w().k()), b), (Integer) i1581330382723795749.e);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (N11355818201711573941 unused2) {
                    W4415201450379021245.c("Parsing XChaCha20Poly1305Key failed");
                    return null;
                }
        }
    }

    @Override // dev.epro.r0.H14763425654620554740
    public W12973714701299903186 c(M11181104712105445833 m11181104712105445833) {
        return new W12973714701299903186(m11181104712105445833, B868928847454221112.a);
    }

    @Override // dev.epro.r0.I8220319968057211477
    public Object d(Z1953481206310471956 z1953481206310471956) throws GeneralSecurityException {
        switch (this.a) {
            case 2:
                Y2188645061177063576 y2188645061177063576 = (Y2188645061177063576) z1953481206310471956;
                int i = y2188645061177063576.j.b;
                if (i < 8 || i > 12) {
                    W4415201450379021245.c("invalid salt size");
                    return null;
                }
                byte[] bArrB = ((J4250663911053539605) y2188645061177063576.k.b).b();
                J4250663911053539605 j4250663911053539605 = y2188645061177063576.l;
                C12886615544961773984 c12886615544961773984 = new C12886615544961773984();
                J8045362843799184672.y(O1900704066613195549.d0(D2728421111140880766.b(bArrB.length), new M9197813449740923653((Object) J4250663911053539605.a(bArrB), (byte) 5)));
                j4250663911053539605.b();
                return c12886615544961773984;
            default:
                X17251871386643959137 x17251871386643959137 = (X17251871386643959137) z1953481206310471956;
                try {
                    G15739123543877306217.a();
                    Cipher cipherA = G15739123543877306217.a();
                    byte[] bArrB2 = ((J4250663911053539605) x17251871386643959137.k.b).b();
                    x17251871386643959137.l.b();
                    cipherA.getProvider();
                    C12886615544961773984 c128866155449617739842 = new C12886615544961773984();
                    if (!G6547577305291411977.c(1)) {
                        W4415201450379021245.c("Can not use ChaCha20Poly1305 in FIPS-mode.");
                        return null;
                    }
                    if (bArrB2.length == 32) {
                        return c128866155449617739842;
                    }
                    throw new InvalidKeyException("The key length in bytes must be 32.");
                } catch (GeneralSecurityException unused) {
                    byte[] bArrB3 = ((J4250663911053539605) x17251871386643959137.k.b).b();
                    x17251871386643959137.l.b();
                    C12886615544961773984 c128866155449617739843 = new C12886615544961773984();
                    new W6202574999258165942(bArrB3, (byte) 1);
                    return c128866155449617739843;
                }
        }
    }

    @Override // dev.epro.r0.D9017764184818113880
    public T5990920249823963282 e(I1632105416032993715 i1632105416032993715) throws GeneralSecurityException {
        D14731132657808549702 d14731132657808549702;
        switch (this.a) {
            case 4:
                String str = (String) i1632105416032993715.c;
                if (!str.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ", str));
                    return null;
                }
                try {
                    H7795772807593257574 h7795772807593257574Z = H7795772807593257574.z((N17666688112968464504) i1632105416032993715.b, R4931231174251890987.a());
                    if (h7795772807593257574Z.x() != 0) {
                        W4415201450379021245.c("Only version 0 parameters are accepted");
                        return null;
                    }
                    D14731132657808549702 d147311326578085497022 = (D14731132657808549702) i1632105416032993715.d;
                    if (d147311326578085497022 == D14731132657808549702.k0) {
                        d14731132657808549702 = D14731132657808549702.x0;
                    } else {
                        if (d147311326578085497022 != D14731132657808549702.m0) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(d147311326578085497022)));
                        }
                        d14731132657808549702 = D14731132657808549702.y0;
                    }
                    return D3673201505608512511.b(h7795772807593257574Z.w().x(), d14731132657808549702);
                } catch (N11355818201711573941 e) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e);
                }
            default:
                String str2 = (String) i1632105416032993715.c;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ", str2));
                    return null;
                }
                try {
                    if (L2589523028836516608.y((N17666688112968464504) i1632105416032993715.b, R4931231174251890987.a()).x() == 0) {
                        return new H358978911853820691(J8045362843799184672.y0((D14731132657808549702) i1632105416032993715.d));
                    }
                    W4415201450379021245.c("Only version 0 parameters are accepted");
                    return null;
                } catch (N11355818201711573941 e2) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e2);
                }
        }
    }

    @Override // dev.epro.r0.X2032800221577147908
    public I1632105416032993715 f(T5990920249823963282 t5990920249823963282) throws GeneralSecurityException {
        D14731132657808549702 d14731132657808549702;
        switch (this.a) {
            case 3:
                D3673201505608512511 d3673201505608512511 = (D3673201505608512511) t5990920249823963282;
                D14731132657808549702 d147311326578085497022 = d3673201505608512511.a;
                if (d147311326578085497022 == D14731132657808549702.x0) {
                    d14731132657808549702 = D14731132657808549702.k0;
                } else {
                    if (d147311326578085497022 != D14731132657808549702.y0) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(d147311326578085497022)));
                    }
                    d14731132657808549702 = D14731132657808549702.m0;
                }
                H18069562553086718710 h18069562553086718710Y = H7795772807593257574.y();
                R10365513111800052132 r10365513111800052132Y = F8305575804941370353.y();
                int i = d3673201505608512511.b;
                r10365513111800052132Y.e();
                ((F8305575804941370353) r10365513111800052132Y.b).z(i);
                F8305575804941370353 f8305575804941370353 = (F8305575804941370353) r10365513111800052132Y.b();
                h18069562553086718710Y.e();
                ((H7795772807593257574) h18069562553086718710Y.b).A(f8305575804941370353);
                return I1632105416032993715.d("type.googleapis.com/google.crypto.tink.XAesGcmKey", d14731132657808549702, ((H7795772807593257574) h18069562553086718710Y.b()).f());
            default:
                return I1632105416032993715.d("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", J8045362843799184672.x0(((H358978911853820691) t5990920249823963282).a), L2589523028836516608.w().f());
        }
    }
}
