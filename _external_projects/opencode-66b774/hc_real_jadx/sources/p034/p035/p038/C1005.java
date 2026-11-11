package p034.p035.p038;

import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.〳ぜぞぜべっ.ぁごぐすすぃ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1005 {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final C1005 f5372 = new C1005(0, 0, 0, 0);

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int f5373;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int f5374;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final int f5375;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int f5376;

    public C1005(int i, int i2, int i3, int i4) {
        this.f5375 = i;
        this.f5373 = i2;
        this.f5374 = i3;
        this.f5376 = i4;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static C1005 m2331(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f5372 : new C1005(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1005.class != obj.getClass()) {
            return false;
        }
        C1005 c1005 = (C1005) obj;
        return this.f5376 == c1005.f5376 && this.f5375 == c1005.f5375 && this.f5374 == c1005.f5374 && this.f5373 == c1005.f5373;
    }

    public int hashCode() {
        return (((((this.f5375 * 31) + this.f5373) * 31) + this.f5374) * 31) + this.f5376;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("Insets{left=");
        m4207.append(this.f5375);
        m4207.append(", top=");
        m4207.append(this.f5373);
        m4207.append(", right=");
        m4207.append(this.f5374);
        m4207.append(", bottom=");
        return C2098.m4203(m4207, this.f5376, '}');
    }
}
