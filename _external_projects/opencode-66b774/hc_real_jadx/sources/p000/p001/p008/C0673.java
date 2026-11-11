package p000.p001.p008;

import androidx.core.app.NotificationCompat;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ごづごきえ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0673 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int[] f4527 = new int[10];

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int f4528;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C0673 m1917(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f4527;
            if (i < iArr.length) {
                this.f4528 = (1 << i) | this.f4528;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int m1918() {
        if ((this.f4528 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0) {
            return this.f4527[7];
        }
        return 65535;
    }
}
