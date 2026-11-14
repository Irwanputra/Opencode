package ads_mobile_sdk;

import android.content.Context;
import android.os.HandlerThread;
import dev.epro.r0.B6867906687934285025;
import dev.epro.r0.I8344119817086563006;
import dev.epro.r0.V5431423861497278836;
import dev.epro.r0.Z5019126814379845930;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class lt0 implements I8344119817086563006, Z5019126814379845930 {
    public final rt0 a;
    public final String b;
    public final String c;
    public final LinkedBlockingQueue d;
    public final HandlerThread e;

    public lt0(Context context, String str, String str2) {
        this.b = str;
        this.c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.e = handlerThread;
        handlerThread.start();
        rt0 rt0Var = new rt0(9200000, context, handlerThread.getLooper(), this, this);
        this.a = rt0Var;
        this.d = new LinkedBlockingQueue();
        rt0Var.checkAvailabilityAndConnect();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    @Override // dev.epro.r0.I8344119817086563006
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onConnected() {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lt0.onConnected():void");
    }

    @Override // dev.epro.r0.Z5019126814379845930
    public final void onConnectionFailed(B6867906687934285025 b6867906687934285025) {
        try {
            LinkedBlockingQueue linkedBlockingQueue = this.d;
            V5431423861497278836 v5431423861497278836W = pd.w();
            v5431423861497278836W.c(32768L);
            linkedBlockingQueue.put((pd) v5431423861497278836W.a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // dev.epro.r0.I8344119817086563006
    public final void onConnectionSuspended(int i) {
        try {
            LinkedBlockingQueue linkedBlockingQueue = this.d;
            V5431423861497278836 v5431423861497278836W = pd.w();
            v5431423861497278836W.c(32768L);
            linkedBlockingQueue.put((pd) v5431423861497278836W.a());
        } catch (InterruptedException unused) {
        }
    }
}
