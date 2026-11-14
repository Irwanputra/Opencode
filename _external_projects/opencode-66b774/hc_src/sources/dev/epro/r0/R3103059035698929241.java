package dev.epro.r0;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R3103059035698929241 {
    public final ColorFilter a;
    public final long b;
    public final int c;

    public R3103059035698929241(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            Z609035949372769296.g();
            porterDuffColorFilter = Z609035949372769296.c(J8045362843799184672.u0(j), K5751602218013079365.g0(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(J8045362843799184672.u0(j), K5751602218013079365.j0(i));
        }
        this.a = porterDuffColorFilter;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R3103059035698929241)) {
            return false;
        }
        R3103059035698929241 r3103059035698929241 = (R3103059035698929241) obj;
        long j = r3103059035698929241.b;
        int i = U10174709222559481877.i;
        return P15388715743159210616.a(this.b, j) && this.c == r3103059035698929241.c;
    }

    public final int hashCode() {
        int i = U10174709222559481877.i;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return E12098517352909843120.m("BlendModeColorFilter(color=", U10174709222559481877.h(this.b), ", blendMode=", D15913187640519482289.J(this.c), ")");
    }
}
