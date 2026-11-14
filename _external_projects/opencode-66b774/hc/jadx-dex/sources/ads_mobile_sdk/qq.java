package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class qq extends dev.epro.r0.L8361547894089146393 {
    public final byte[] d;

    public qq(byte[] bArr) {
        bArr.getClass();
        this.d = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(ads_mobile_sdk.sq sqVar, int i, int i2) {
        int size = sqVar.size();
        byte[] bArr = this.d;
        if (i2 > size) {
            dev.epro.r0.Z3383101362411723454.h(i2, bArr.length);
            return false;
        }
        int i3 = i + i2;
        if (i3 > sqVar.size()) {
            int size2 = sqVar.size();
            java.lang.StringBuilder sbP = dev.epro.r0.E12098517352909843120.p(i, i2, "Ran off end of other: ", ", ", ", ");
            sbP.append(size2);
            throw new java.lang.IllegalArgumentException(sbP.toString());
        }
        if (sqVar instanceof ads_mobile_sdk.qq) {
            return ads_mobile_sdk.sq.a(0, i, bArr, i2, ((ads_mobile_sdk.qq) sqVar).d);
        }
        if (!(sqVar instanceof ads_mobile_sdk.mq)) {
            return sqVar.b(i, i3).equals(b(0, i2));
        }
        ads_mobile_sdk.mq mqVar = (ads_mobile_sdk.mq) sqVar;
        return ads_mobile_sdk.sq.a(0, mqVar.e + i, bArr, i2, mqVar.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(ads_mobile_sdk.sq sqVar) {
        boolean z = sqVar instanceof ads_mobile_sdk.qq;
        byte[] bArr = this.d;
        return z ? java.util.Arrays.equals(bArr, ((ads_mobile_sdk.qq) sqVar).d) : sqVar instanceof ads_mobile_sdk.mq ? a(sqVar, 0, bArr.length) : sqVar.b((ads_mobile_sdk.sq) this);
    }

    public final int size() {
        return this.d.length;
    }

    public final byte b(int i) {
        return this.d[i];
    }

    public final int b(int i, int i2, int i3) {
        byte[] bArr = ads_mobile_sdk.rb1.a;
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.d[i4];
        }
        return i;
    }

    public final ads_mobile_sdk.sq b(int i, int i2) {
        byte[] bArr = this.d;
        int iA = ads_mobile_sdk.sq.a(i, i2, bArr.length);
        if (iA == 0) {
            return ads_mobile_sdk.sq.b;
        }
        return new ads_mobile_sdk.mq(bArr, i, iA);
    }

    public final void a(int i, int i2, byte[] bArr, int i3) {
        java.lang.System.arraycopy(this.d, i, bArr, i2, i3);
    }

    public final ads_mobile_sdk.sq a(int i, int i2) {
        byte[] bArr = this.d;
        int iA = ads_mobile_sdk.sq.a(i, i2, bArr.length);
        if (iA == 0) {
            return ads_mobile_sdk.sq.b;
        }
        return new ads_mobile_sdk.mq(bArr, i, iA);
    }

    public final void a(ads_mobile_sdk.yu yuVar) {
        byte[] bArr = this.d;
        yuVar.a(0, bArr, bArr.length);
    }

    public final java.lang.String a() {
        return new java.lang.String(this.d, java.nio.charset.StandardCharsets.ISO_8859_1);
    }
}
