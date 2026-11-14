package dev.epro.r0;

import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V16467367819314239412 implements WebMessagePayloadBoundaryInterface {
    public final boolean a;
    public final String b;
    public final byte[] c;

    public V16467367819314239412(String str) {
        this.a = false;
        this.b = str;
        this.c = null;
    }

    public final void a(int i) {
        boolean z = this.a;
        if (z == i) {
            return;
        }
        S10973172697741180971.m(E12098517352909843120.l("Expected ", i, z ? 1 : 0, ", but type is "));
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final byte[] getAsArrayBuffer() {
        a(1);
        byte[] bArr = this.c;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final String getAsString() {
        a(0);
        return this.b;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final int getType() {
        return this.a ? 1 : 0;
    }

    public V16467367819314239412(byte[] bArr) {
        this.a = true;
        this.b = null;
        this.c = bArr;
    }
}
