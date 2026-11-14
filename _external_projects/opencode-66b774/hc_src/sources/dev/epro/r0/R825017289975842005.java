package dev.epro.r0;

import android.os.Build;
import android.view.DisplayCutout;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R825017289975842005 {
    public final DisplayCutout a;

    public R825017289975842005(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final Z1975157152518754667 a() {
        return Build.VERSION.SDK_INT >= 30 ? Z1975157152518754667.c(G4756000168812988315.d(this.a)) : Z1975157152518754667.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || R825017289975842005.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((R825017289975842005) obj).a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
