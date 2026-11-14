package dev.epro.r0;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B3341448995934144234 implements S17354436298385972004 {
    public final S17354436298385972004 a;
    public final float b;

    public B3341448995934144234(float f, S17354436298385972004 s17354436298385972004) {
        while (s17354436298385972004 instanceof B3341448995934144234) {
            s17354436298385972004 = ((B3341448995934144234) s17354436298385972004).a;
            f += ((B3341448995934144234) s17354436298385972004).b;
        }
        this.a = s17354436298385972004;
        this.b = f;
    }

    @Override // dev.epro.r0.S17354436298385972004
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B3341448995934144234)) {
            return false;
        }
        B3341448995934144234 b3341448995934144234 = (B3341448995934144234) obj;
        return this.a.equals(b3341448995934144234.a) && this.b == b3341448995934144234.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
