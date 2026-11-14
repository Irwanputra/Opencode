package dev.epro.r0;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R4640732916975281784 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ V7723538628475019968 b;

    public /* synthetic */ R4640732916975281784(V7723538628475019968 v7723538628475019968, byte b) {
        this.a = b;
        this.b = v7723538628475019968;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        V7723538628475019968 v7723538628475019968 = this.b;
        switch (b) {
            case 0:
                ViewParent parent = v7723538628475019968.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                v7723538628475019968.a();
                View view = v7723538628475019968.d;
                if (view.isEnabled() && !view.isLongClickable() && v7723538628475019968.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    v7723538628475019968.g = true;
                    break;
                }
                break;
        }
    }
}
