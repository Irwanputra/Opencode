package dev.epro.r0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O14070163759106485193 implements Executor {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ O14070163759106485193(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                S7974369370986781936 s7974369370986781936M32getOutOfFrameExecutor = ((S7974369370986781936) obj).m32getOutOfFrameExecutor();
                if (s7974369370986781936M32getOutOfFrameExecutor != null) {
                    s7974369370986781936M32getOutOfFrameExecutor.I(new A307398149131398783(0, runnable, Runnable.class, "run", "run()V", 0, (byte) 1));
                }
                break;
            default:
                ((Handler) obj).post(runnable);
                break;
        }
    }
}
