package p000.p001.p009;

import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.p001.C0629;
import p243.C2803;
import p243.C2810;
import p243.C2817;
import p243.C2821;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺふねづ〺.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0690 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public byte[] f4594;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public byte[] f4596;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final byte[] f4591 = {42};

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final String[] f4592 = new String[0];

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final String[] f4590 = {"*"};

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final C0690 f4589 = new C0690();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final AtomicBoolean f4595 = new AtomicBoolean(false);

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final CountDownLatch f4593 = new CountDownLatch(1);

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static String m1937(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    z = z2;
                    i3 = bArr2[i10][i11] & 255;
                }
                i4 = i3 - (bArr[i7 + i12] & 255);
                if (i4 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (bArr2[i10].length != i11) {
                        z2 = z;
                    } else {
                        if (i10 == bArr2.length - 1) {
                            break;
                        }
                        i10++;
                        z2 = true;
                        i11 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr, i7, i9, C0629.f4354);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i7 - 1;
        }
        return null;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m1938() {
        InputStream resourceAsStream = C0690.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        C2817 c2817 = new C2817(new C2821(C2810.m4894(resourceAsStream, new C2803())));
        try {
            byte[] bArr = new byte[c2817.mo4878()];
            c2817.m4907(bArr);
            byte[] bArr2 = new byte[c2817.mo4878()];
            c2817.m4907(bArr2);
            synchronized (this) {
                this.f4594 = bArr;
                this.f4596 = bArr2;
            }
            this.f4593.countDown();
        } finally {
            C0629.m1816(c2817);
        }
    }
}
