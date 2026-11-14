package dev.epro.r0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q13914734507241918864 {
    public final V15499216873564893116 a;
    public final D11883231851729262595 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Q15119607593561432156 d = new Q15119607593561432156(this, (byte) 1);

    public Q13914734507241918864(ExecutorService executorService) {
        V15499216873564893116 v15499216873564893116 = new V15499216873564893116(executorService);
        this.a = v15499216873564893116;
        this.b = V933048422416352811.r(v15499216873564893116);
    }
}
