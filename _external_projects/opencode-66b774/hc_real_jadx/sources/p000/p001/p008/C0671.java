package p000.p001.p008;

import p000.p001.C0629;
import p243.C2801;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0671 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C2801 f4524;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int f4525;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C2801 f4526;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final C2801 f4522 = C2801.m4843(":");

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final C2801 f4520 = C2801.m4843(":status");

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final C2801 f4521 = C2801.m4843(":method");

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final C2801 f4519 = C2801.m4843(":path");

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final C2801 f4518 = C2801.m4843(":scheme");

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static final C2801 f4523 = C2801.m4843(":authority");

    public C0671(String str, String str2) {
        this(C2801.m4843(str), C2801.m4843(str2));
    }

    public C0671(C2801 c2801, String str) {
        this(c2801, C2801.m4843(str));
    }

    public C0671(C2801 c2801, C2801 c28012) {
        this.f4526 = c2801;
        this.f4524 = c28012;
        this.f4525 = c28012.mo4855() + c2801.mo4855() + 32;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0671)) {
            return false;
        }
        C0671 c0671 = (C0671) obj;
        return this.f4526.equals(c0671.f4526) && this.f4524.equals(c0671.f4524);
    }

    public int hashCode() {
        return this.f4524.hashCode() + ((this.f4526.hashCode() + 527) * 31);
    }

    public String toString() {
        return C0629.m1820("%s: %s", this.f4526.mo4847(), this.f4524.mo4847());
    }
}
