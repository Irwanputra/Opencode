package dev.epro.r0;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F10802198521110867507 implements S17354436298385972004 {
    public final float a;

    public F10802198521110867507(float f) {
        this.a = f;
    }

    @Override // dev.epro.r0.S17354436298385972004
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F10802198521110867507) && this.a == ((F10802198521110867507) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return E12098517352909843120.n(new StringBuilder(), (int) (this.a * 100.0f), "%");
    }
}
