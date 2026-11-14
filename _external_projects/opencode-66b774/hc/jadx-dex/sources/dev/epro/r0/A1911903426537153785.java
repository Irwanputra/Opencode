package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A1911903426537153785 implements android.content.ServiceConnection {
    public final java.util.concurrent.CountDownLatch a;
    public final java.util.concurrent.atomic.AtomicReference b;
    public final android.os.Handler c;

    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(1094);
    }

    private native void utketkgnnqui();

    public final native dev.epro.r0.J8418317850116464745 a();

    public final native void b(dev.epro.r0.J8418317850116464745 j8418317850116464745);

    public final native void c(java.lang.String str);

    @Override // android.content.ServiceConnection
    public final native void onBindingDied(android.content.ComponentName componentName);

    @Override // android.content.ServiceConnection
    public final native void onNullBinding(android.content.ComponentName componentName);

    @Override // android.content.ServiceConnection
    public final native void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder);

    @Override // android.content.ServiceConnection
    public final native void onServiceDisconnected(android.content.ComponentName componentName);

    public A1911903426537153785() {
        utketkgnnqui();
    }
}
