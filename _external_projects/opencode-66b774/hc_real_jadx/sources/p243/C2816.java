package p243;

import java.util.Arrays;

/* renamed from: ぺぁあねじ.ざっざへづ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2816 extends C2801 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final transient int[] f10493;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final transient byte[][] f10494;

    public C2816(C2819 c2819, int i) {
        super(null);
        C2808.m4880(c2819.f10501, 0L, i);
        C2825 c2825 = c2819.f10500;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c2825.f10514;
            int i6 = c2825.f10512;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c2825 = c2825.f10517;
        }
        this.f10494 = new byte[i4][];
        this.f10493 = new int[i4 * 2];
        C2825 c28252 = c2819.f10500;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f10494;
            bArr[i7] = c28252.f10515;
            int i8 = c28252.f10514;
            int i9 = c28252.f10512;
            int i10 = (i8 - i9) + i2;
            i2 = i10 > i ? i : i10;
            int[] iArr = this.f10493;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            c28252.f10518 = true;
            i7++;
            c28252 = c28252.f10517;
        }
    }

    @Override // p243.C2801
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2801) {
            C2801 c2801 = (C2801) obj;
            if (c2801.mo4855() == mo4855() && mo4854(0, c2801, 0, mo4855())) {
                return true;
            }
        }
        return false;
    }

    @Override // p243.C2801
    public int hashCode() {
        int i = this.f10466;
        if (i != 0) {
            return i;
        }
        int length = this.f10494.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f10494[i2];
            int[] iArr = this.f10493;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f10466 = i4;
        return i4;
    }

    @Override // p243.C2801
    public String toString() {
        return m4904().toString();
    }

    @Override // p243.C2801
    /* renamed from: ぁごぐすすぃ */
    public String mo4844() {
        return m4904().mo4844();
    }

    @Override // p243.C2801
    /* renamed from: いいにぽつ */
    public boolean mo4845(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > mo4855() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int m4903 = m4903(i);
        while (i3 > 0) {
            int i4 = m4903 == 0 ? 0 : this.f10493[m4903 - 1];
            int min = Math.min(i3, ((this.f10493[m4903] - i4) + i4) - i);
            int[] iArr = this.f10493;
            byte[][] bArr2 = this.f10494;
            if (!C2808.m4881(bArr2[m4903], (i - i4) + iArr[bArr2.length + m4903], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            m4903++;
        }
        return true;
    }

    @Override // p243.C2801
    /* renamed from: ぇぬぎばつ */
    public void mo4846(C2819 c2819) {
        int length = this.f10494.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f10493;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C2825 c2825 = new C2825(this.f10494[i], i3, (i3 + i4) - i2, true, false);
            C2825 c28252 = c2819.f10500;
            if (c28252 == null) {
                c2825.f10513 = c2825;
                c2825.f10517 = c2825;
                c2819.f10500 = c2825;
            } else {
                c28252.f10513.m4934(c2825);
            }
            i++;
            i2 = i4;
        }
        c2819.f10501 += i2;
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final int m4903(int i) {
        int binarySearch = Arrays.binarySearch(this.f10493, 0, this.f10494.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ (-1);
    }

    @Override // p243.C2801
    /* renamed from: おぐぴう〸ず */
    public String mo4847() {
        return m4904().mo4847();
    }

    @Override // p243.C2801
    /* renamed from: げつ〴ぬぐ */
    public String mo4848() {
        return m4904().mo4848();
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public final C2801 m4904() {
        return new C2801(mo4853());
    }

    @Override // p243.C2801
    /* renamed from: てぜきぽく */
    public C2801 mo4849(int i, int i2) {
        return m4904().mo4849(i, i2);
    }

    @Override // p243.C2801
    /* renamed from: なぎぱいぢぎ */
    public byte mo4850(int i) {
        C2808.m4880(this.f10493[this.f10494.length - 1], i, 1L);
        int m4903 = m4903(i);
        int i2 = m4903 == 0 ? 0 : this.f10493[m4903 - 1];
        int[] iArr = this.f10493;
        byte[][] bArr = this.f10494;
        return bArr[m4903][(i - i2) + iArr[bArr.length + m4903]];
    }

    @Override // p243.C2801
    /* renamed from: のぷのちつ */
    public C2801 mo4851() {
        return m4904().mo4851();
    }

    @Override // p243.C2801
    /* renamed from: へぬ〴づぞ */
    public byte[] mo4853() {
        int[] iArr = this.f10493;
        byte[][] bArr = this.f10494;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f10493;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f10494[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // p243.C2801
    /* renamed from: ぺぁあねじ */
    public boolean mo4854(int i, C2801 c2801, int i2, int i3) {
        if (i < 0 || i > mo4855() - i3) {
            return false;
        }
        int m4903 = m4903(i);
        while (i3 > 0) {
            int i4 = m4903 == 0 ? 0 : this.f10493[m4903 - 1];
            int min = Math.min(i3, ((this.f10493[m4903] - i4) + i4) - i);
            int[] iArr = this.f10493;
            byte[][] bArr = this.f10494;
            if (!c2801.mo4845(i2, bArr[m4903], (i - i4) + iArr[bArr.length + m4903], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            m4903++;
        }
        return true;
    }

    @Override // p243.C2801
    /* renamed from: ぺふねづ〺 */
    public int mo4855() {
        return this.f10493[this.f10494.length - 1];
    }
}
