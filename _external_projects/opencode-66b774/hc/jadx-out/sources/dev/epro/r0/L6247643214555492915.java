package dev.epro.r0;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L6247643214555492915 extends N2001496495389762459 implements Runnable {
    public final WeakReference a;

    public L6247643214555492915(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // dev.epro.r0.N2001496495389762459
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.a.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        R198795765466717154.a((EditText) this.a.get(), 1);
    }
}
