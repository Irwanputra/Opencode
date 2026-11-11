package p015.p029.p030.p033;

import androidx.core.app.NotificationCompat;

/* renamed from: いいにぽつ.びぐびあび.げつ〴ぬぐ.げつ〴ぬぐ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0996 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final byte[] f5370 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final byte[] f5369 = new byte[NotificationCompat.FLAG_HIGH_PRIORITY];

    public C0996() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f5370;
            if (i >= bArr.length) {
                return;
            }
            this.f5369[bArr[i]] = (byte) i;
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6  */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m2324(byte[] r10, int r11, int r12, java.io.OutputStream r13) {
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
            byte[] r7 = r9.f5370
            int r8 = r2 >>> 2
            r8 = r8 & 63
            r7 = r7[r8]
            r13.write(r7)
            byte[] r7 = r9.f5370
            int r2 = r2 << r3
            int r3 = r5 >>> 4
            r2 = r2 | r3
            r2 = r2 & 63
            r2 = r7[r2]
            r13.write(r2)
            byte[] r2 = r9.f5370
            int r3 = r5 << 2
            int r4 = r6 >>> 6
            r3 = r3 | r4
            r3 = r3 & 63
            r2 = r2[r3]
            r13.write(r2)
            byte[] r2 = r9.f5370
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
            byte[] r4 = r9.f5370
            r1 = r4[r1]
            r13.write(r1)
            byte[] r1 = r9.f5370
            r1 = r1[r2]
            r13.write(r1)
            byte[] r1 = r9.f5370
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
            byte[] r2 = r9.f5370
            r1 = r2[r1]
            r13.write(r1)
            byte[] r1 = r9.f5370
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
        throw new UnsupportedOperationException("Method not decompiled: p015.p029.p030.p033.C0996.m2324(byte[], int, int, java.io.OutputStream):int");
    }
}
