package dev.epro.r0;

import java.math.BigInteger;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y13277292519794314229 implements A8947685337014270457 {
    public static final byte[] g = new byte[0];
    public static final byte[] h = {0};
    public static final K12477491117444883648 i;
    public static final K12477491117444883648 j;
    public static final K12477491117444883648 k;
    public final ECPublicKey a;
    public final String b;
    public final V14134441514818836082 c;
    public final byte[] d;
    public final byte[] e;
    public final Provider f;

    static {
        A1960181136934585864 a = K12477491117444883648.a();
        a.a(S14062146164092607729.a, D14731132657808549702.A);
        a.a(S14062146164092607729.b, D14731132657808549702.B);
        a.a(S14062146164092607729.c, D14731132657808549702.C);
        i = a.b();
        A1960181136934585864 a2 = K12477491117444883648.a();
        a2.a(V14134441514818836082.a, D14731132657808549702.D);
        a2.a(V14134441514818836082.b, D14731132657808549702.E);
        j = a2.b();
        A1960181136934585864 a3 = K12477491117444883648.a();
        a3.a(J1101004311847117810.a, H5270339962551858100.c);
        a3.a(J1101004311847117810.b, H5270339962551858100.d);
        a3.a(J1101004311847117810.c, H5270339962551858100.e);
        k = a3.b();
    }

    public Y13277292519794314229(ECPublicKey eCPublicKey, S14062146164092607729 s14062146164092607729, V14134441514818836082 v14134441514818836082, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!G6547577305291411977.d(2)) {
            W4415201450379021245.c("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
            throw null;
        }
        M3250598633778217966.d(s14062146164092607729);
        this.b = String.valueOf(s14062146164092607729).concat("withECDSA");
        this.a = eCPublicKey;
        this.c = v14134441514818836082;
        this.d = bArr;
        this.e = bArr2;
        this.f = provider;
    }

    @Override // dev.epro.r0.A8947685337014270457
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.d;
        if (bArr3.length == 0) {
            b(bArr, bArr2);
        } else if (Z12670897225348479586.b(bArr3, bArr)) {
            b(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        } else {
            W4415201450379021245.c("Invalid signature (output prefix mismatch)");
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int i2;
        V14134441514818836082 v14134441514818836082 = this.c;
        V14134441514818836082 v141344415148188360822 = V14134441514818836082.a;
        boolean z = false;
        ECPublicKey eCPublicKey = this.a;
        if (v14134441514818836082 == v141344415148188360822) {
            if (bArr.length != ((R11362382501444029219.d(eCPublicKey.getParams().getCurve()).subtract(BigInteger.ONE).bitLength() + 7) / 8) * 2) {
                W4415201450379021245.c("Invalid signature");
                return;
            }
            if (bArr.length % 2 != 0 || bArr.length == 0 || bArr.length > 132) {
                W4415201450379021245.c("Invalid IEEE_P1363 encoding");
                return;
            }
            byte[] i0 = K5751602218013079365.i0(Arrays.copyOf(bArr, bArr.length / 2));
            byte[] i02 = K5751602218013079365.i0(Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length));
            int length = i0.length + 4 + i02.length;
            if (length >= 128) {
                bArr3 = new byte[length + 3];
                bArr3[0] = 48;
                bArr3[1] = -127;
                bArr3[2] = (byte) length;
                i2 = 3;
            } else {
                bArr3 = new byte[length + 2];
                bArr3[0] = 48;
                bArr3[1] = (byte) length;
                i2 = 2;
            }
            int i3 = i2 + 1;
            bArr3[i2] = 2;
            int i4 = i2 + 2;
            bArr3[i3] = (byte) i0.length;
            System.arraycopy(i0, 0, bArr3, i4, i0.length);
            int length2 = i4 + i0.length;
            bArr3[length2] = 2;
            bArr3[length2 + 1] = (byte) i02.length;
            System.arraycopy(i02, 0, bArr3, length2 + 2, i02.length);
            bArr = bArr3;
        }
        if (!K5751602218013079365.S(bArr)) {
            W4415201450379021245.c("Invalid signature");
            return;
        }
        String str = this.b;
        Provider provider = this.f;
        Signature signature = provider != null ? Signature.getInstance(str, provider) : (Signature) W8357658991043002609.d.a.a(str);
        signature.initVerify(eCPublicKey);
        signature.update(bArr2);
        byte[] bArr4 = this.e;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            z = signature.verify(bArr);
        } catch (RuntimeException unused) {
        }
        if (z) {
            return;
        }
        W4415201450379021245.c("Invalid signature");
    }
}
