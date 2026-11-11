package p131.p161.p162.p193.p205;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p034.p095.C1687;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class ServiceConnectionC2514 implements ServiceConnection {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean f9855 = false;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final BlockingQueue<IBinder> f9854 = new LinkedBlockingQueue();

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f9854.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final IBinder m4527(TimeUnit timeUnit) {
        C1687.m3676("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f9855) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f9855 = true;
        IBinder poll = this.f9854.poll(10000L, timeUnit);
        if (poll != null) {
            return poll;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }
}
