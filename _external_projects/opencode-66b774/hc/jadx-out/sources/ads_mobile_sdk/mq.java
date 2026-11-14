package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.L8361547894089146393;
import dev.epro.r0.Z3383101362411723454;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class mq extends L8361547894089146393 {
    public final byte[] d;
    public final int e;
    public final int f;

    public mq(byte[] bArr, int i, int i2) {
        sq.a(i, i + i2, bArr.length);
        this.d = bArr;
        this.e = i;
        this.f = i2;
    }

    @Override // dev.epro.r0.L8361547894089146393
    public final boolean a(sq sqVar, int i, int i2) {
        if (i2 > sqVar.size()) {
            Z3383101362411723454.h(i2, this.f);
            return false;
        }
        int i3 = i + i2;
        if (i3 > sqVar.size()) {
            int size = sqVar.size();
            StringBuilder sbP = E12098517352909843120.p(i, i2, "Ran off end of other: ", ", ", ", ");
            sbP.append(size);
            throw new IllegalArgumentException(sbP.toString());
        }
        boolean z = sqVar instanceof qq;
        byte[] bArr = this.d;
        int i4 = this.e;
        if (z) {
            return sq.a(i4, i, bArr, i2, ((qq) sqVar).d);
        }
        if (!(sqVar instanceof mq)) {
            return sqVar.b(i, i3).equals(b(i4, i2 + i4));
        }
        mq mqVar = (mq) sqVar;
        return sq.a(i4, mqVar.e + i, bArr, i2, mqVar.d);
    }

    @Override // ads_mobile_sdk.sq
    public final boolean b(sq sqVar) {
        return ((sqVar instanceof qq) || (sqVar instanceof mq)) ? a(sqVar, 0, this.f) : sqVar.b(this);
    }

    @Override // ads_mobile_sdk.sq
    public final int size() {
        return this.f;
    }

    @Override // ads_mobile_sdk.sq
    public final byte b(int i) {
        return this.d[this.e + i];
    }

    @Override // ads_mobile_sdk.sq
    public final int b(int i, int i2, int i3) {
        int i4 = this.e + i2;
        byte[] bArr = rb1.a;
        for (int i5 = i4; i5 < i4 + i3; i5++) {
            i = (i * 31) + this.d[i5];
        }
        return i;
    }

    @Override // ads_mobile_sdk.sq
    public final sq b(int i, int i2) {
        int iA = sq.a(i, i2, this.f);
        if (iA == 0) {
            return sq.b;
        }
        return new mq(this.d, this.e + i, iA);
    }

    @Override // ads_mobile_sdk.sq
    public final void a(int i, int i2, byte[] bArr, int i3) {
        System.arraycopy(this.d, this.e + i, bArr, i2, i3);
    }

    @Override // ads_mobile_sdk.sq
    public final sq a(int i, int i2) {
        int iA = sq.a(i, i2, this.f);
        if (iA == 0) {
            return sq.b;
        }
        return new mq(this.d, this.e + i, iA);
    }

    @Override // ads_mobile_sdk.sq
    public final void a(yu yuVar) {
        yuVar.a(this.e, this.d, this.f);
    }

    @Override // ads_mobile_sdk.sq
    /* JADX INFO: renamed from: a */
    public final String mo7a() {
        Charset charset = StandardCharsets.ISO_8859_1;
        return new String(this.d, this.e, this.f, charset);
    }
}
