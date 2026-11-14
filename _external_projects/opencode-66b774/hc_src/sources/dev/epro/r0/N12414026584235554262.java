package dev.epro.r0;

import android.os.Trace;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final /* synthetic */ class N12414026584235554262 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ S7974369370986781936 b;

    public /* synthetic */ N12414026584235554262(S7974369370986781936 s7974369370986781936, byte b) {
        this.a = b;
        this.b = s7974369370986781936;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        S7974369370986781936 s7974369370986781936 = this.b;
        switch (b) {
            case 0:
                N11678082982039175888 n11678082982039175888 = s7974369370986781936.i;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!n11678082982039175888.isEmpty()) {
                    try {
                        ((B13729205492206812220) n11678082982039175888.removeLast()).invoke();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            case 1:
                s7974369370986781936.x0 = false;
                MotionEvent motionEvent = s7974369370986781936.n0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    s7974369370986781936.L(motionEvent);
                    return;
                } else {
                    S10973172697741180971.m("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                S7974369370986781936.n(s7974369370986781936.getRoot());
                return;
            default:
                S7974369370986781936.n(s7974369370986781936.getRoot());
                return;
        }
    }
}
