package p131.p225.p226.p229;

import java.io.IOException;
import java.math.BigInteger;
import p034.p095.C1687;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.おぐぴう〸ず.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2742 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f10310;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f10311;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public byte[] f10312;

    public C2742(byte[] bArr) {
        this.f10310 = 0;
        this.f10311 = 0;
        this.f10312 = bArr;
        this.f10310 = 0;
        this.f10311 = bArr.length;
    }

    public C2742(byte[] bArr, int i, int i2) {
        this.f10310 = 0;
        this.f10311 = 0;
        this.f10312 = bArr;
        this.f10310 = i;
        int i3 = i2 + i;
        this.f10311 = i3;
        if (i < 0 || i > bArr.length) {
            throw new IllegalArgumentException(Crypt.a(Crypt.xrc("O4k\u001e4mM4m\u001a7;\u001bel\u001dfmA7iM0n@6:HbkJc")));
        }
        if (i3 < 0 || i3 > bArr.length) {
            throw new IllegalArgumentException(Crypt.a(Crypt.xrc("MdkHeh\u0019b=\u001df=\u001b0:\u001d3:KfoM3g\u001c`kK1g\u001e3")));
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public String m4692(String str) {
        int m4701 = m4701();
        if (this.f10310 + m4701 > this.f10311) {
            throw new IOException(Crypt.a(Crypt.xrc("@ek\u0019afMej\u0019jj\u0019jgHcf\u001d3;Kki@`<\u0019`o\u001ejkNj9J0hOclOcm\u001a0;H0nI1gMcnK4m\u001d3j\u001e")));
        }
        String str2 = new String(this.f10312, this.f10310, m4701, str);
        this.f10310 += m4701;
        return str2;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int m4693() {
        int i = this.f10310;
        if (i >= this.f10311) {
            throw new IOException(Crypt.a(Crypt.xrc("A0g\u001dbkLjjAcg\u001cdoLc>@eo\u0019eo\u001b0:AegL6<Ldn\u001d7=J6jO6mAj>\u001c`j\u001d7iLd9J1g\u001cd=J")));
        }
        byte[] bArr = this.f10312;
        this.f10310 = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public String m4694() {
        int m4701 = m4701();
        if (this.f10310 + m4701 > this.f10311) {
            throw new IOException(Crypt.a(Crypt.xrc("@ek\u0019afMej\u0019jj\u0019jgHcf\u001d3;Kki@`<\u0019`o\u001ejkNj9J0hOclOcm\u001a0;H0nI1gMcnK4m\u001d3j\u001e")));
        }
        String str = new String(this.f10312, this.f10310, m4701, Crypt.a(Crypt.xrc("\u001c0<Jgf\u001b0<\u001dgf\u001db=\u001b`kL`m@a>Nkh\u001ecnH7")));
        this.f10310 += m4701;
        return str;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int m4695() {
        return this.f10311 - this.f10310;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public byte[] m4696() {
        int m4701 = m4701();
        int i = this.f10310;
        if (m4701 + i > this.f10311) {
            throw new IOException(Crypt.a(Crypt.xrc("\u001a4=Mcl\u001c7=\u0019gj\u001a`oO`=\u001c7hJbg\u001eekJbj\u001daf\u001b1kJc<A1h\u001c1:\u001dg>K0hNfn\u001a4fL3i\u001c09\u001e")));
        }
        byte[] bArr = new byte[m4701];
        System.arraycopy(this.f10312, i, bArr, 0, m4701);
        this.f10310 += m4701;
        return bArr;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean m4697() {
        int i = this.f10310;
        if (i >= this.f10311) {
            throw new IOException(Crypt.a(Crypt.xrc("A0g\u001dbkLjjAcg\u001cdoLc>@eo\u0019eo\u001b0:AegL6<Ldn\u001d7=J6jO6mAj>\u001c`j\u001d7iLd9J1g\u001cd=J")));
        }
        byte[] bArr = this.f10312;
        this.f10310 = i + 1;
        return bArr[i] != 0;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public BigInteger m4698() {
        byte[] m4696 = m4696();
        return m4696.length == 0 ? BigInteger.ZERO : new BigInteger(m4696);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public String[] m4699() {
        return C1687.m3686(m4694(), ',');
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public byte[] m4700(int i) {
        int i2 = this.f10310;
        if (i2 + i > this.f10311) {
            throw new IOException(Crypt.a(Crypt.xrc("A0g\u001dbkLjjAcg\u001cdoLc>@eo\u0019eo\u001b0:AegL6<Ldn\u001d7=J6jO6mAj>\u001c`j\u001d7iLd9J1g\u001cd=J")));
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f10312, i2, bArr, 0, i);
        this.f10310 += i;
        return bArr;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int m4701() {
        int i = this.f10310;
        if (i + 4 > this.f10311) {
            throw new IOException(Crypt.a(Crypt.xrc("A0g\u001dbkLjjAcg\u001cdoLc>@eo\u0019eo\u001b0:AegL6<Ldn\u001d7=J6jO6mAj>\u001c`j\u001d7iLd9J1g\u001cd=J")));
        }
        byte[] bArr = this.f10312;
        int i2 = i + 1;
        this.f10310 = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i2 + 1;
        this.f10310 = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 16);
        int i6 = i4 + 1;
        this.f10310 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f10310 = i6 + 1;
        return i7 | (bArr[i6] & 255);
    }
}
