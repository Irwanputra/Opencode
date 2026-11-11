package p000;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: 〳ぜぞぜべっ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0693 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final int f4602;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final boolean f4603;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final boolean f4604;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final boolean f4605;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int f4606;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final boolean f4607;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final boolean f4608;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final boolean f4609;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final boolean f4610;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    @Nullable
    public String f4611;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int f4612;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final int f4613;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final boolean f4614;

    static {
        TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
    }

    public C0693(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, @Nullable String str) {
        this.f4607 = z;
        this.f4603 = z2;
        this.f4606 = i;
        this.f4612 = i2;
        this.f4608 = z3;
        this.f4610 = z4;
        this.f4604 = z5;
        this.f4602 = i3;
        this.f4613 = i4;
        this.f4605 = z6;
        this.f4614 = z7;
        this.f4609 = z8;
        this.f4611 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000.C0693 m1942(p000.C0597 r22) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0693.m1942(〳ぜぞぜべっ.ぉざぅち〻):〳ぜぞぜべっ.くし〴〺ぅ");
    }

    public String toString() {
        String str = this.f4611;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f4607) {
                sb.append("no-cache, ");
            }
            if (this.f4603) {
                sb.append("no-store, ");
            }
            if (this.f4606 != -1) {
                sb.append("max-age=");
                sb.append(this.f4606);
                sb.append(", ");
            }
            if (this.f4612 != -1) {
                sb.append("s-maxage=");
                sb.append(this.f4612);
                sb.append(", ");
            }
            if (this.f4608) {
                sb.append("private, ");
            }
            if (this.f4610) {
                sb.append("public, ");
            }
            if (this.f4604) {
                sb.append("must-revalidate, ");
            }
            if (this.f4602 != -1) {
                sb.append("max-stale=");
                sb.append(this.f4602);
                sb.append(", ");
            }
            if (this.f4613 != -1) {
                sb.append("min-fresh=");
                sb.append(this.f4613);
                sb.append(", ");
            }
            if (this.f4605) {
                sb.append("only-if-cached, ");
            }
            if (this.f4614) {
                sb.append("no-transform, ");
            }
            if (this.f4609) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.f4611 = str;
        }
        return str;
    }
}
