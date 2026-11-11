package p034.p086.p087;

import java.util.Arrays;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1550 {

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static int f7260 = 1;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean f7266;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public float f7267;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public EnumC1551 f7272;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f7262 = -1;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f7265 = -1;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f7271 = 0;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f7269 = false;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public float[] f7263 = new float[9];

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float[] f7261 = new float[9];

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public C1548[] f7264 = new C1548[16];

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f7273 = 0;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f7268 = 0;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f7270 = -1;

    /* renamed from: づざかべべ.なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ$げつ〴ぬぐ, reason: contains not printable characters */
    public enum EnumC1551 {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C1550(EnumC1551 enumC1551) {
        this.f7272 = enumC1551;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("");
        m4207.append(this.f7262);
        return m4207.toString();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m3467(C1548 c1548) {
        int i = this.f7273;
        int i2 = 0;
        while (i2 < i) {
            if (this.f7264[i2] == c1548) {
                while (i2 < i - 1) {
                    C1548[] c1548Arr = this.f7264;
                    int i3 = i2 + 1;
                    c1548Arr[i2] = c1548Arr[i3];
                    i2 = i3;
                }
                this.f7273--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m3468() {
        this.f7272 = EnumC1551.UNKNOWN;
        this.f7271 = 0;
        this.f7262 = -1;
        this.f7265 = -1;
        this.f7267 = 0.0f;
        this.f7269 = false;
        this.f7270 = -1;
        int i = this.f7273;
        for (int i2 = 0; i2 < i; i2++) {
            this.f7264[i2] = null;
        }
        this.f7273 = 0;
        this.f7268 = 0;
        this.f7266 = false;
        Arrays.fill(this.f7261, 0.0f);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m3469(C1548 c1548) {
        int i = 0;
        while (true) {
            int i2 = this.f7273;
            if (i >= i2) {
                C1548[] c1548Arr = this.f7264;
                if (i2 >= c1548Arr.length) {
                    this.f7264 = (C1548[]) Arrays.copyOf(c1548Arr, c1548Arr.length * 2);
                }
                C1548[] c1548Arr2 = this.f7264;
                int i3 = this.f7273;
                c1548Arr2[i3] = c1548;
                this.f7273 = i3 + 1;
                return;
            }
            if (this.f7264[i] == c1548) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m3470(C1558 c1558, C1548 c1548) {
        int i = this.f7273;
        for (int i2 = 0; i2 < i; i2++) {
            this.f7264[i2].mo3451(c1558, c1548, false);
        }
        this.f7273 = 0;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m3471(C1558 c1558, float f) {
        this.f7267 = f;
        this.f7269 = true;
        this.f7270 = -1;
        int i = this.f7273;
        this.f7265 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f7264[i2].m3455(c1558, this, false);
        }
        this.f7273 = 0;
    }
}
