package dev.epro.r0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public final class A1911903426537153785 implements ServiceConnection {
    public final CountDownLatch a;
    public final AtomicReference b;
    public final Handler c;

    static {
        izmyclvb.oeynnivvrnts0(1094);
    }

    private native void utketkgnnqui();

    public final native J8418317850116464745 a();

    public final native void b(J8418317850116464745 j8418317850116464745);

    public final native void c(String str);

    @Override // android.content.ServiceConnection
    public final native void onBindingDied(ComponentName componentName);

    @Override // android.content.ServiceConnection
    public final native void onNullBinding(ComponentName componentName);

    @Override // android.content.ServiceConnection
    public final native void onServiceConnected(ComponentName componentName, IBinder iBinder);

    @Override // android.content.ServiceConnection
    public final native void onServiceDisconnected(ComponentName componentName);

    public A1911903426537153785() {
        utketkgnnqui();
    }
}
