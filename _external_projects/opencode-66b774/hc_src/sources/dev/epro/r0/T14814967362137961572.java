package dev.epro.r0;

import android.view.View;
import android.widget.Magnifier;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T14814967362137961572 implements V9509531021431440752 {
    public static final T14814967362137961572 a = new T14814967362137961572();

    @Override // dev.epro.r0.V9509531021431440752
    public final boolean a() {
        return true;
    }

    @Override // dev.epro.r0.V9509531021431440752
    public final S12520703221617747961 b(View view, boolean z, long j, float f, float f2, boolean z2, R8540738700654750557 r8540738700654750557, float f3) {
        if (z) {
            return new Q18208205007687518459(new Magnifier(view));
        }
        long t0 = r8540738700654750557.t0(j);
        float K = r8540738700654750557.K(f);
        float K2 = r8540738700654750557.K(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (t0 != 9205357640488583168L) {
            builder.setSize(T18016951143603335921.Z(Float.intBitsToFloat((int) (t0 >> 32))), T18016951143603335921.Z(Float.intBitsToFloat((int) (t0 & 4294967295L))));
        }
        if (!Float.isNaN(K)) {
            builder.setCornerRadius(K);
        }
        if (!Float.isNaN(K2)) {
            builder.setElevation(K2);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new Q18208205007687518459(builder.build());
    }
}
