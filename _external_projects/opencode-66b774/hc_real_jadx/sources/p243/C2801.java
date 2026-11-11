package p243;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import org.jasypt.digest.StandardStringDigester;
import p131.p155.p156.p157.C2098;

/* renamed from: ぺぁあねじ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2801 implements Serializable, Comparable<C2801> {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final char[] f10463 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final C2801 f10464 = m4840(new byte[0]);

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final byte[] f10465;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public transient int f10466;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public transient String f10467;

    public C2801(byte[] bArr) {
        this.f10465 = bArr;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static C2801 m4840(byte... bArr) {
        if (bArr != null) {
            return new C2801((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static C2801 m4841(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException(C2098.m4205("Unexpected hex string: ", str));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (m4842(str.charAt(i2 + 1)) + (m4842(str.charAt(i2)) << 4));
        }
        return m4840(bArr);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static int m4842(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static C2801 m4843(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        C2801 c2801 = new C2801(str.getBytes(C2808.f10476));
        c2801.f10467 = str;
        return c2801;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(p243.C2801 r10) {
        /*
            r9 = this;
            ぺぁあねじ.〳ぜぞぜべっ r10 = (p243.C2801) r10
            int r0 = r9.mo4855()
            int r1 = r10.mo4855()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L10:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.mo4850(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.mo4850(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L25
            int r4 = r4 + 1
            goto L10
        L25:
            if (r7 >= r8) goto L29
        L27:
            r3 = -1
            goto L31
        L29:
            r3 = 1
            goto L31
        L2b:
            if (r0 != r1) goto L2e
            goto L31
        L2e:
            if (r0 >= r1) goto L29
            goto L27
        L31:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p243.C2801.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2801) {
            C2801 c2801 = (C2801) obj;
            int mo4855 = c2801.mo4855();
            byte[] bArr = this.f10465;
            if (mo4855 == bArr.length && c2801.mo4845(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f10466;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f10465);
        this.f10466 = hashCode;
        return hashCode;
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder m4207;
        if (this.f10465.length == 0) {
            return "[size=0]";
        }
        String mo4847 = mo4847();
        int length = mo4847.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = mo4847.length();
                break;
            }
            if (i2 == 64) {
                break;
            }
            int codePointAt = mo4847.codePointAt(i);
            if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                i2++;
                i += Character.charCount(codePointAt);
            }
        }
        i = -1;
        if (i == -1) {
            if (this.f10465.length <= 64) {
                m4207 = C2098.m4207("[hex=");
                m4207.append(mo4844());
                m4207.append("]");
            } else {
                m4207 = C2098.m4207("[size=");
                m4207.append(this.f10465.length);
                m4207.append(" hex=");
                m4207.append(mo4849(0, 64).mo4844());
                m4207.append("…]");
            }
            return m4207.toString();
        }
        String replace = mo4847.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (i < mo4847.length()) {
            sb = C2098.m4207("[size=");
            sb.append(this.f10465.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public String mo4844() {
        byte[] bArr = this.f10465;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f10463;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean mo4845(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f10465;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C2808.m4881(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public void mo4846(C2819 c2819) {
        byte[] bArr = this.f10465;
        c2819.m4923(bArr, 0, bArr.length);
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public String mo4847() {
        String str = this.f10467;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f10465, C2808.f10476);
        this.f10467 = str2;
        return str2;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public String mo4848() {
        byte[] bArr = this.f10465;
        byte[] bArr2 = C2826.f10519;
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int i3 = i + 1;
            bArr3[i] = bArr2[(bArr[i2] & 255) >> 2];
            int i4 = i3 + 1;
            int i5 = i2 + 1;
            bArr3[i3] = bArr2[((bArr[i2] & 3) << 4) | ((bArr[i5] & 255) >> 4)];
            int i6 = i4 + 1;
            int i7 = (bArr[i5] & 15) << 2;
            int i8 = i2 + 2;
            bArr3[i4] = bArr2[i7 | ((bArr[i8] & 255) >> 6)];
            i = i6 + 1;
            bArr3[i6] = bArr2[bArr[i8] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            int i9 = i + 1;
            bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i9] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i10] = Base64.PAD;
            bArr3[i10 + 1] = Base64.PAD;
        } else if (length2 == 2) {
            int i11 = i + 1;
            bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
            int i12 = i11 + 1;
            int i13 = (bArr[length] & 3) << 4;
            int i14 = length + 1;
            bArr3[i11] = bArr2[((bArr[i14] & 255) >> 4) | i13];
            bArr3[i12] = bArr2[(bArr[i14] & 15) << 2];
            bArr3[i12 + 1] = Base64.PAD;
        }
        try {
            return new String(bArr3, StandardStringDigester.DIGEST_CHARSET);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C2801 mo4849(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f10465;
        if (i2 > bArr.length) {
            StringBuilder m4207 = C2098.m4207("endIndex > length(");
            m4207.append(this.f10465.length);
            m4207.append(")");
            throw new IllegalArgumentException(m4207.toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return new C2801(bArr2);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public byte mo4850(int i) {
        return this.f10465[i];
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public C2801 mo4851() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f10465;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new C2801(bArr2);
            }
            i++;
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C2801 m4852(String str) {
        try {
            return m4840(MessageDigest.getInstance(str).digest(this.f10465));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public byte[] mo4853() {
        return (byte[]) this.f10465.clone();
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean mo4854(int i, C2801 c2801, int i2, int i3) {
        return c2801.mo4845(i2, this.f10465, i, i3);
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int mo4855() {
        return this.f10465.length;
    }
}
