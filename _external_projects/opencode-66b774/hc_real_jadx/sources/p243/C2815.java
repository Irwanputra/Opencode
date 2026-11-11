package p243;

import javax.annotation.Nullable;

/* renamed from: ぺぁあねじ.ごづごきえ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2815 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static long f10491;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    @Nullable
    public static C2825 f10492;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static C2825 m4901() {
        synchronized (C2815.class) {
            C2825 c2825 = f10492;
            if (c2825 == null) {
                return new C2825();
            }
            f10492 = c2825.f10517;
            c2825.f10517 = null;
            f10491 -= 8192;
            return c2825;
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m4902(C2825 c2825) {
        if (c2825.f10517 != null || c2825.f10513 != null) {
            throw new IllegalArgumentException();
        }
        if (c2825.f10518) {
            return;
        }
        synchronized (C2815.class) {
            long j = f10491 + 8192;
            if (j > 65536) {
                return;
            }
            f10491 = j;
            c2825.f10517 = f10492;
            c2825.f10514 = 0;
            c2825.f10512 = 0;
            f10492 = c2825;
        }
    }
}
