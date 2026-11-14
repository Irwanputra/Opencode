package dev.epro.r0;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O10642937410579854520 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long a = SystemClock.uptimeMillis() + 10000;
    public Runnable b;
    public boolean c;
    public final /* synthetic */ T17336508261397230716 d;

    public O10642937410579854520(T17336508261397230716 t17336508261397230716) {
        this.d = t17336508261397230716;
    }

    public final void a(View view) {
        if (this.c) {
            return;
        }
        this.c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        decorView.getClass();
        if (!this.c) {
            decorView.postOnAnimation(new W13948953340889349604(this, (byte) 6));
        } else if (S10823041268949770285.t(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.a) {
                this.c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.b = null;
        M1224903511523771423 m1224903511523771423 = (M1224903511523771423) this.d.g.getValue();
        synchronized (m1224903511523771423.a) {
            z = m1224903511523771423.b;
        }
        if (z) {
            this.c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
