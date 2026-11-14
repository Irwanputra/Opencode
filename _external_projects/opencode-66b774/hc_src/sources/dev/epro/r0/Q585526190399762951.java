package dev.epro.r0;

import android.widget.Magnifier;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public class Q585526190399762951 implements S12520703221617747961 {
    public final Magnifier a;

    public Q585526190399762951(Magnifier magnifier) {
        this.a = magnifier;
    }

    @Override // dev.epro.r0.S12520703221617747961
    public void a(long j, long j2, float f) {
        this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void b() {
        this.a.dismiss();
    }

    public final long c() {
        return (this.a.getWidth() << 32) | (this.a.getHeight() & 4294967295L);
    }

    public final void d() {
        this.a.update();
    }
}
