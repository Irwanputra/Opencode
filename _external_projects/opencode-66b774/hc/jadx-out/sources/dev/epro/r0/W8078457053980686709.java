package dev.epro.r0;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W8078457053980686709 implements S17354436298385972004 {
    public final float a;

    public W8078457053980686709(float f) {
        this.a = f;
    }

    @Override // dev.epro.r0.S17354436298385972004
    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W8078457053980686709) && this.a == ((W8078457053980686709) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return this.a + "px";
    }
}
