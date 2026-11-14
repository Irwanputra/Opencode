package ads_mobile_sdk;

import android.content.Context;
import android.os.Looper;
import dev.epro.r0.E1636901823844057514;
import dev.epro.r0.I8344119817086563006;
import dev.epro.r0.Z5019126814379845930;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class rt0 extends E1636901823844057514 {
    public final int a;

    public rt0(int i, Context context, Looper looper, I8344119817086563006 i8344119817086563006, Z5019126814379845930 z5019126814379845930) {
        super(116, context, looper, i8344119817086563006, z5019126814379845930);
        this.a = i;
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final int getMinApkVersion() {
        return this.a;
    }
}
