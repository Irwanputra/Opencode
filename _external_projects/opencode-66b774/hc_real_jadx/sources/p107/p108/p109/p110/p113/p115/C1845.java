package p107.p108.p109.p110.p113.p115;

import androidx.core.app.NotificationCompat;
import java.io.OutputStream;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぇぬぎばつ.てぜきぽく.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1845 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final byte[] f8216 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final byte[] f8215 = new byte[NotificationCompat.FLAG_HIGH_PRIORITY];

    public C1845() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f8216;
            if (i >= bArr.length) {
                return;
            }
            this.f8215[bArr[i]] = (byte) i;
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6  */
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m3961(byte[] r10, int r11, int r12, java.io.OutputStream r13) {
        /*
            r9 = this;
            int r0 = r12 % 3
            int r12 = r12 - r0
            r1 = r11
        L4:
            int r2 = r11 + r12
            r3 = 4
            r4 = 2
            if (r1 >= r2) goto L4c
            r2 = r10[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r5 = r1 + 1
            r5 = r10[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r6 = r1 + 2
            r6 = r10[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte[] r7 = r9.f8216
            int r8 = r2 >>> 2
            r8 = r8 & 63
            r7 = r7[r8]
            r13.write(r7)
            byte[] r7 = r9.f8216
            int r2 = r2 << r3
            int r3 = r5 >>> 4
            r2 = r2 | r3
            r2 = r2 & 63
            r2 = r7[r2]
            r13.write(r2)
            byte[] r2 = r9.f8216
            int r3 = r5 << 2
            int r4 = r6 >>> 6
            r3 = r3 | r4
            r3 = r3 & 63
            r2 = r2[r3]
            r13.write(r2)
            byte[] r2 = r9.f8216
            r3 = r6 & 63
            r2 = r2[r3]
            r13.write(r2)
            int r1 = r1 + 3
            goto L4
        L4c:
            r11 = 61
            r1 = 1
            if (r0 == r1) goto L81
            if (r0 == r4) goto L54
            goto La0
        L54:
            r5 = r10[r2]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r1
            r10 = r10[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r1 = r5 >>> 2
            r1 = r1 & 63
            int r2 = r5 << 4
            int r5 = r10 >>> 4
            r2 = r2 | r5
            r2 = r2 & 63
            int r10 = r10 << r4
            r10 = r10 & 63
            byte[] r4 = r9.f8216
            r1 = r4[r1]
            r13.write(r1)
            byte[] r1 = r9.f8216
            r1 = r1[r2]
            r13.write(r1)
            byte[] r1 = r9.f8216
            r10 = r1[r10]
            r13.write(r10)
            goto L9d
        L81:
            r10 = r10[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r1 = r10 >>> 2
            r1 = r1 & 63
            int r10 = r10 << r3
            r10 = r10 & 63
            byte[] r2 = r9.f8216
            r1 = r2[r1]
            r13.write(r1)
            byte[] r1 = r9.f8216
            r10 = r1[r10]
            r13.write(r10)
            r13.write(r11)
        L9d:
            r13.write(r11)
        La0:
            int r12 = r12 / 3
            int r12 = r12 * 4
            if (r0 != 0) goto La7
            r3 = 0
        La7:
            int r12 = r12 + r3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p107.p108.p109.p110.p113.p115.C1845.m3961(byte[], int, int, java.io.OutputStream):int");
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final boolean m3962(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int m3963(byte[] bArr, int i, int i2, OutputStream outputStream) {
        int i3;
        int i4 = i2 + i;
        while (i4 > i) {
            int i5 = i4 - 1;
            if (!m3962((char) bArr[i5])) {
                break;
            }
            i4 = i5;
        }
        int i6 = i4 - 4;
        int m3964 = m3964(bArr, i, i6);
        int i7 = 0;
        while (true) {
            i3 = 2;
            if (m3964 >= i6) {
                break;
            }
            int i8 = m3964 + 1;
            byte b = this.f8215[bArr[m3964]];
            int m39642 = m3964(bArr, i8, i6);
            int i9 = m39642 + 1;
            byte b2 = this.f8215[bArr[m39642]];
            int m39643 = m3964(bArr, i9, i6);
            int i10 = m39643 + 1;
            byte b3 = this.f8215[bArr[m39643]];
            int m39644 = m3964(bArr, i10, i6);
            int i11 = m39644 + 1;
            byte b4 = this.f8215[bArr[m39644]];
            outputStream.write((b << 2) | (b2 >> 4));
            outputStream.write((b2 << 4) | (b3 >> 2));
            outputStream.write((b3 << 6) | b4);
            i7 += 3;
            m3964 = m3964(bArr, i11, i6);
        }
        char c = (char) bArr[i6];
        char c2 = (char) bArr[i4 - 3];
        char c3 = (char) bArr[i4 - 2];
        char c4 = (char) bArr[i4 - 1];
        if (c3 == '=') {
            byte[] bArr2 = this.f8215;
            outputStream.write((bArr2[c2] >> 4) | (bArr2[c] << 2));
            i3 = 1;
        } else if (c4 == '=') {
            byte[] bArr3 = this.f8215;
            byte b5 = bArr3[c];
            byte b6 = bArr3[c2];
            byte b7 = bArr3[c3];
            outputStream.write((b5 << 2) | (b6 >> 4));
            outputStream.write((b7 >> 2) | (b6 << 4));
        } else {
            byte[] bArr4 = this.f8215;
            byte b8 = bArr4[c];
            byte b9 = bArr4[c2];
            byte b10 = bArr4[c3];
            byte b11 = bArr4[c4];
            outputStream.write((b8 << 2) | (b9 >> 4));
            outputStream.write((b9 << 4) | (b10 >> 2));
            outputStream.write(b11 | (b10 << 6));
            i3 = 3;
        }
        return i7 + i3;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int m3964(byte[] bArr, int i, int i2) {
        while (i < i2 && m3962((char) bArr[i])) {
            i++;
        }
        return i;
    }
}
