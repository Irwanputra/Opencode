package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class mq extends dev.epro.r0.L8361547894089146393 {
    public final byte[] d;
    public final int e;
    public final int f;

    public mq(byte[] bArr, int i, int i2) {
        ads_mobile_sdk.sq.a(i, i + i2, bArr.length);
        this.d = bArr;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(ads_mobile_sdk.sq sqVar, int i, int i2) {
        if (i2 > sqVar.size()) {
            dev.epro.r0.Z3383101362411723454.h(i2, this.f);
            return false;
        }
        int i3 = i + i2;
        if (i3 > sqVar.size()) {
            int size = sqVar.size();
            java.lang.StringBuilder sbP = dev.epro.r0.E12098517352909843120.p(i, i2, "Ran off end of other: ", ", ", ", ");
            sbP.append(size);
            throw new java.lang.IllegalArgumentException(sbP.toString());
        }
        boolean z = sqVar instanceof ads_mobile_sdk.qq;
        byte[] bArr = this.d;
        int i4 = this.e;
        if (z) {
            return ads_mobile_sdk.sq.a(i4, i, bArr, i2, ((ads_mobile_sdk.qq) sqVar).d);
        }
        if (!(sqVar instanceof ads_mobile_sdk.mq)) {
            return sqVar.b(i, i3).equals(b(i4, i2 + i4));
        }
        ads_mobile_sdk.mq mqVar = (ads_mobile_sdk.mq) sqVar;
        return ads_mobile_sdk.sq.a(i4, mqVar.e + i, bArr, i2, mqVar.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(ads_mobile_sdk.sq sqVar) {
        return ((sqVar instanceof ads_mobile_sdk.qq) || (sqVar instanceof ads_mobile_sdk.mq)) ? a(sqVar, 0, this.f) : sqVar.b((ads_mobile_sdk.sq) this);
    }

    public final int size() {
        return this.f;
    }

    public final byte b(int i) {
        return this.d[this.e + i];
    }

    public final int b(int i, int i2, int i3) {
        int i4 = this.e + i2;
        byte[] bArr = ads_mobile_sdk.rb1.a;
        for (int i5 = i4; i5 < i4 + i3; i5++) {
            i = (i * 31) + this.d[i5];
        }
        return i;
    }

    public final ads_mobile_sdk.sq b(int i, int i2) {
        int iA = ads_mobile_sdk.sq.a(i, i2, this.f);
        if (iA == 0) {
            return ads_mobile_sdk.sq.b;
        }
        return new ads_mobile_sdk.mq(this.d, this.e + i, iA);
    }

    public final void a(int i, int i2, byte[] bArr, int i3) {
        java.lang.System.arraycopy(this.d, this.e + i, bArr, i2, i3);
    }

    public final ads_mobile_sdk.sq a(int i, int i2) {
        int iA = ads_mobile_sdk.sq.a(i, i2, this.f);
        if (iA == 0) {
            return ads_mobile_sdk.sq.b;
        }
        return new ads_mobile_sdk.mq(this.d, this.e + i, iA);
    }

    public final void a(ads_mobile_sdk.yu yuVar) {
        yuVar.a(this.e, this.d, this.f);
    }

    public final java.lang.String a() {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.ISO_8859_1;
        return new java.lang.String(this.d, this.e, this.f, charset);
    }
}
