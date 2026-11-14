package dev.epro.r0;

import java.math.BigInteger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C9142879380583651391 {
    public final byte[] a;
    public int b = 0;
    public final int c;

    public C9142879380583651391(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        if (bArr.length < 0) {
            S10973172697741180971.j("Illegal offset.");
            throw null;
        }
        if (i < 0 || i > bArr.length) {
            S10973172697741180971.j("Illegal length.");
            throw null;
        }
    }

    public final boolean a() {
        int i = this.b;
        if (i < this.c) {
            this.b = i + 1;
            return this.a[i] != 0;
        }
        Q11088980322693754445.h("Packet too short.");
        return false;
    }

    public final int b() {
        int i = this.b;
        if (i < this.c) {
            this.b = i + 1;
            return this.a[i] & 255;
        }
        Q11088980322693754445.h("Packet too short.");
        return 0;
    }

    public final byte[] c() {
        int i = i();
        int i2 = this.b;
        if (i + i2 > this.c) {
            Q11088980322693754445.h("Malformed SSH byte string.");
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.a, i2, bArr, 0, i);
        this.b += i;
        return bArr;
    }

    public final byte[] d(int i) {
        int i2 = this.b;
        if (i2 + i > this.c) {
            Q11088980322693754445.h("Packet too short.");
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.a, i2, bArr, 0, i);
        this.b += i;
        return bArr;
    }

    public final BigInteger e() {
        byte[] c = c();
        return c.length == 0 ? BigInteger.ZERO : new BigInteger(c);
    }

    public final String[] f() {
        return X7410747940286448830.p(g(), ',');
    }

    public final String g() {
        int i = i();
        int i2 = this.b;
        if (i + i2 > this.c) {
            Q11088980322693754445.h("Malformed SSH string.");
            return null;
        }
        String str = new String(this.a, i2, i, "ISO-8859-1");
        this.b += i;
        return str;
    }

    public final String h(String str) {
        int i = i();
        int i2 = this.b;
        if (i + i2 > this.c) {
            Q11088980322693754445.h("Malformed SSH string.");
            return null;
        }
        String str2 = new String(this.a, i2, i, str);
        this.b += i;
        return str2;
    }

    public final int i() {
        int i = this.b;
        if (i + 4 > this.c) {
            Q11088980322693754445.h("Packet too short.");
            return 0;
        }
        int i2 = i + 1;
        this.b = i2;
        byte[] bArr = this.a;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    public final int j() {
        return this.c - this.b;
    }

    public C9142879380583651391(byte[] bArr) {
        this.c = 0;
        this.a = bArr;
        this.c = bArr.length;
    }
}
