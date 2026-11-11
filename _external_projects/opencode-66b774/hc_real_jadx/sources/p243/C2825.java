package p243;

import javax.annotation.Nullable;

/* renamed from: ぺぁあねじ.は〲ぱなで, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2825 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f10512;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C2825 f10513;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f10514;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final byte[] f10515;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f10516;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C2825 f10517;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f10518;

    public C2825() {
        this.f10515 = new byte[8192];
        this.f10516 = true;
        this.f10518 = false;
    }

    public C2825(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f10515 = bArr;
        this.f10512 = i;
        this.f10514 = i2;
        this.f10518 = z;
        this.f10516 = z2;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C2825 m4934(C2825 c2825) {
        c2825.f10513 = this;
        c2825.f10517 = this.f10517;
        this.f10517.f10513 = c2825;
        this.f10517 = c2825;
        return c2825;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C2825 m4935() {
        this.f10518 = true;
        return new C2825(this.f10515, this.f10512, this.f10514, true, false);
    }

    @Nullable
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C2825 m4936() {
        C2825 c2825 = this.f10517;
        C2825 c28252 = c2825 != this ? c2825 : null;
        C2825 c28253 = this.f10513;
        c28253.f10517 = c2825;
        this.f10517.f10513 = c28253;
        this.f10517 = null;
        this.f10513 = null;
        return c28252;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m4937(C2825 c2825, int i) {
        if (!c2825.f10516) {
            throw new IllegalArgumentException();
        }
        int i2 = c2825.f10514;
        if (i2 + i > 8192) {
            if (c2825.f10518) {
                throw new IllegalArgumentException();
            }
            int i3 = c2825.f10512;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = c2825.f10515;
            System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
            c2825.f10514 -= c2825.f10512;
            c2825.f10512 = 0;
        }
        System.arraycopy(this.f10515, this.f10512, c2825.f10515, c2825.f10514, i);
        c2825.f10514 += i;
        this.f10512 += i;
    }
}
