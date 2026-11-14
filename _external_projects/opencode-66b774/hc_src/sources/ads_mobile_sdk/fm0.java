package ads_mobile_sdk;

import dev.epro.r0.E9507284769322407406;
import dev.epro.r0.H8027516537527559298;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.T10029384717875810847;
import dev.epro.r0.W6764693637816104089;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class fm0 {
    public final File a;
    public final ExecutorService b;
    public final T10029384717875810847 c;
    public final W6764693637816104089 d;

    public fm0(File file, ExecutorService executorService, T10029384717875810847 t10029384717875810847, W6764693637816104089 w6764693637816104089) {
        this.a = file;
        this.b = executorService;
        this.c = t10029384717875810847;
        this.d = w6764693637816104089;
    }

    public final H8027516537527559298 a(Object obj) {
        return M9216324016624295870.X(new E9507284769322407406(this, obj, (byte) 2), this.b);
    }
}
