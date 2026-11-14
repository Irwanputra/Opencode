package dev.epro.r0;

import android.os.Looper;
import java.util.concurrent.Executor;
import org.chromium.net.InlineExecutionProhibitedException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q15119607593561432156 implements Executor {
    public final /* synthetic */ byte a;
    public final Object b;

    public Q15119607593561432156() {
        this.a = (byte) 2;
        R502132765509599220 r502132765509599220 = new R502132765509599220(Looper.getMainLooper());
        Looper.getMainLooper();
        this.b = r502132765509599220;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                F16393152783805540385 f16393152783805540385 = new F16393152783805540385(runnable, Thread.currentThread());
                ((Executor) obj).execute(f16393152783805540385);
                InlineExecutionProhibitedException inlineExecutionProhibitedException = (InlineExecutionProhibitedException) f16393152783805540385.d;
                if (inlineExecutionProhibitedException != null) {
                    throw inlineExecutionProhibitedException;
                }
                f16393152783805540385.c = null;
                return;
            case 1:
                ((Q13914734507241918864) obj).c.post(runnable);
                return;
            default:
                ((R502132765509599220) obj).post(runnable);
                return;
        }
    }

    public /* synthetic */ Q15119607593561432156(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
