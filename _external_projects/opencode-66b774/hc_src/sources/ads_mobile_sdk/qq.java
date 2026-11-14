package ads_mobile_sdk;

import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.L8361547894089146393;
import dev.epro.r0.Z3383101362411723454;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class qq extends L8361547894089146393 {
    public final byte[] d;

    public qq(byte[] bArr) {
        bArr.getClass();
        this.d = bArr;
    }

    @Override // dev.epro.r0.L8361547894089146393
    public final boolean a(sq sqVar, int i, int i2) {
        int size = sqVar.size();
        byte[] bArr = this.d;
        if (i2 > size) {
            Z3383101362411723454.h(i2, bArr.length);
            return false;
        }
        int i3 = i + i2;
        if (i3 > sqVar.size()) {
            int size2 = sqVar.size();
            StringBuilder p = E12098517352909843120.p(i, i2, "Ran off end of other: ", ", ", ", ");
            p.append(size2);
            throw new IllegalArgumentException(p.toString());
        }
        if (sqVar instanceof qq) {
            return sq.a(0, i, bArr, i2, ((qq) sqVar).d);
        }
        if (!(sqVar instanceof mq)) {
            return sqVar.b(i, i3).equals(b(0, i2));
        }
        mq mqVar = (mq) sqVar;
        return sq.a(0, mqVar.e + i, bArr, i2, mqVar.d);
    }

    @Override // ads_mobile_sdk.sq
    public final boolean b(sq sqVar) {
        boolean z = sqVar instanceof qq;
        byte[] bArr = this.d;
        return z ? Arrays.equals(bArr, ((qq) sqVar).d) : sqVar instanceof mq ? a(sqVar, 0, bArr.length) : sqVar.b(this);
    }

    @Override // ads_mobile_sdk.sq
    public final int size() {
        return this.d.length;
    }

    @Override // ads_mobile_sdk.sq
    public final byte b(int i) {
        return this.d[i];
    }

    @Override // ads_mobile_sdk.sq
    public final int b(int i, int i2, int i3) {
        byte[] bArr = rb1.a;
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.d[i4];
        }
        return i;
    }

    @Override // ads_mobile_sdk.sq
    public final sq b(int i, int i2) {
        byte[] bArr = this.d;
        int a = sq.a(i, i2, bArr.length);
        if (a == 0) {
            return sq.b;
        }
        return new mq(bArr, i, a);
    }

    @Override // ads_mobile_sdk.sq
    public final void a(int i, int i2, byte[] bArr, int i3) {
        System.arraycopy(this.d, i, bArr, i2, i3);
    }

    @Override // ads_mobile_sdk.sq
    public final sq a(int i, int i2) {
        byte[] bArr = this.d;
        int a = sq.a(i, i2, bArr.length);
        if (a == 0) {
            return sq.b;
        }
        return new mq(bArr, i, a);
    }

    @Override // ads_mobile_sdk.sq
    public final void a(yu yuVar) {
        byte[] bArr = this.d;
        yuVar.a(0, bArr, bArr.length);
    }

    @Override // ads_mobile_sdk.sq
    /* renamed from: a */
    public final String mo7a() {
        return new String(this.d, StandardCharsets.ISO_8859_1);
    }
}
