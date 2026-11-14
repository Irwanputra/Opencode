package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class S10973172697741180971 implements P8628803860726212495, I8220319968057211477, X2032800221577147908, D9017764184818113880, W15703198999188857860, P11181209716866457693, Q12717119941057887287, H4563649114871566866 {
    public final /* synthetic */ byte a;

    public /* synthetic */ S10973172697741180971(byte b) {
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void h(int i, int i2, String str) {
        throw new IllegalArgumentException((str + i + ((char) i2)).toString());
    }

    public static /* synthetic */ void i(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void j(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void k(String str, Object obj) {
        throw new O6142514240279757215(str + ((Object) obj.toString()));
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void n(String str, Object obj) {
        throw new M8821877208104636290(str + obj);
    }

    @Override // dev.epro.r0.W15703198999188857860
    public I1581330382723795749 a(Z1953481206310471956 z1953481206310471956) {
        M15360159357013500486 m15360159357013500486 = (M15360159357013500486) z1953481206310471956;
        Z14058267691604182071 y = S1619943405835536230.y();
        byte[] b = ((J4250663911053539605) m15360159357013500486.k.b).b();
        M18082356575916498704 i = N17666688112968464504.i(0, b, b.length);
        y.e();
        ((S1619943405835536230) y.b).B(i);
        return I1581330382723795749.f("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((S1619943405835536230) y.b()).f(), D14731132657808549702.f0, R7033599853981556291.X(m15360159357013500486.j.a), m15360159357013500486.m);
    }

    @Override // dev.epro.r0.P11181209716866457693
    public Z1953481206310471956 b(I1581330382723795749 i1581330382723795749) {
        if (!((String) i1581330382723795749.a).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            j("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
            return null;
        }
        try {
            S1619943405835536230 z = S1619943405835536230.z((N17666688112968464504) i1581330382723795749.b, R4931231174251890987.a());
            if (z.x() == 0) {
                return M15360159357013500486.e0(R7033599853981556291.b0((D14731132657808549702) i1581330382723795749.d), new M9197813449740923653((Object) J4250663911053539605.a(z.w().k()), (byte) 5), (Integer) i1581330382723795749.e);
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (N11355818201711573941 unused) {
            W4415201450379021245.c("Parsing ChaCha20Poly1305Key failed");
            return null;
        }
    }

    @Override // dev.epro.r0.H4563649114871566866
    public Object c() {
        switch (this.a) {
            case 17:
                return new H14305894327539119220(true);
            case 18:
                return new LinkedHashMap();
            case 19:
                return new TreeMap();
            case 20:
                return new ConcurrentHashMap();
            case 21:
                return new ConcurrentSkipListMap();
            case 22:
                return new ArrayList();
            case 23:
                return new LinkedHashSet();
            case 24:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }

    @Override // dev.epro.r0.I8220319968057211477
    public Object d(Z1953481206310471956 z1953481206310471956) {
        M15360159357013500486 m15360159357013500486 = (M15360159357013500486) z1953481206310471956;
        try {
            G15739123543877306217.a();
            Cipher a = G15739123543877306217.a();
            byte[] b = ((J4250663911053539605) m15360159357013500486.k.b).b();
            m15360159357013500486.l.b();
            a.getProvider();
            G15739123543877306217 g15739123543877306217 = new G15739123543877306217();
            if (!G6547577305291411977.c(1)) {
                W4415201450379021245.c("Can not use ChaCha20Poly1305 in FIPS-mode.");
                return null;
            }
            if (b.length != 32) {
                throw new InvalidKeyException("The key length in bytes must be 32.");
            }
            new SecretKeySpec(b, "ChaCha20");
            return g15739123543877306217;
        } catch (GeneralSecurityException unused) {
            byte[] b2 = ((J4250663911053539605) m15360159357013500486.k.b).b();
            m15360159357013500486.l.b();
            C12886615544961773984 c12886615544961773984 = new C12886615544961773984();
            new W6202574999258165942(b2, (byte) 0);
            return c12886615544961773984;
        }
    }

    @Override // dev.epro.r0.D9017764184818113880
    public T5990920249823963282 e(I1632105416032993715 i1632105416032993715) {
        String str = (String) i1632105416032993715.c;
        if (!str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            j(G6547577305291411977.C("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ", str));
            return null;
        }
        try {
            M3363271006561755345.x((N17666688112968464504) i1632105416032993715.b, R4931231174251890987.a());
            return new E16335363679722729023(R7033599853981556291.b0((D14731132657808549702) i1632105416032993715.d));
        } catch (N11355818201711573941 e) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
        }
    }

    @Override // dev.epro.r0.X2032800221577147908
    public I1632105416032993715 f(T5990920249823963282 t5990920249823963282) {
        return I1632105416032993715.d("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", R7033599853981556291.X(((E16335363679722729023) t5990920249823963282).a), M3363271006561755345.w().f());
    }

    @Override // dev.epro.r0.Q12717119941057887287
    public double g(double d) {
        switch (this.a) {
            case 10:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 11:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 12:
                float[] fArr = E4238948680093459570.a;
                return E4238948680093459570.b(E4238948680093459570.c, d);
            case 13:
                float[] fArr2 = E4238948680093459570.a;
                return E4238948680093459570.a(E4238948680093459570.c, d);
            case 14:
                float[] fArr3 = E4238948680093459570.a;
                return E4238948680093459570.d(E4238948680093459570.d, d);
            default:
                float[] fArr4 = E4238948680093459570.a;
                return E4238948680093459570.c(E4238948680093459570.d, d);
        }
    }

    @Override // dev.epro.r0.P8628803860726212495
    public void cancel() {
    }
}
