package ads_mobile_sdk;

import dev.epro.r0.F16059529287866721367;
import java.io.Closeable;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ww2 implements Closeable {
    public final byte[] a;

    public ww2(byte[] bArr) {
        this.a = bArr;
    }

    public static String a(ww2 ww2Var) {
        Charset charset = F16059529287866721367.a;
        ww2Var.getClass();
        charset.getClass();
        return new String(ww2Var.a, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
