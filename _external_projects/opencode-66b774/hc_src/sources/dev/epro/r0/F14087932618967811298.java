package dev.epro.r0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F14087932618967811298 implements ServiceConnection {
    public final HashMap a = new HashMap();
    public byte b = 2;
    public boolean c;
    public IBinder d;
    public final B7526239878873455655 e;
    public ComponentName f;
    public final /* synthetic */ K4690422250417820120 g;

    public F14087932618967811298(K4690422250417820120 k4690422250417820120, B7526239878873455655 b7526239878873455655) {
        this.g = k4690422250417820120;
        this.e = b7526239878873455655;
    }

    public final B6867906687934285025 a(String str, Executor executor) {
        try {
            Intent a = O12445779602426996689.a(this.g.b, this.e);
            this.b = (byte) 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(A16688663079799967257.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                K4690422250417820120 k4690422250417820120 = this.g;
                H12843822278061842084 h12843822278061842084 = k4690422250417820120.d;
                Context context = k4690422250417820120.b;
                B7526239878873455655 b7526239878873455655 = this.e;
                boolean M = h12843822278061842084.M(context, str, a, this, 4225, executor);
                this.c = M;
                if (M) {
                    k4690422250417820120.c.sendMessageDelayed(k4690422250417820120.c.obtainMessage(1, b7526239878873455655), k4690422250417820120.f);
                    B6867906687934285025 b6867906687934285025 = B6867906687934285025.i;
                    StrictMode.setVmPolicy(vmPolicy);
                    return b6867906687934285025;
                }
                this.b = (byte) 2;
                try {
                    k4690422250417820120.d.J(k4690422250417820120.b, this);
                } catch (IllegalArgumentException unused) {
                }
                B6867906687934285025 b68679066879342850252 = new B6867906687934285025(16, null, null);
                StrictMode.setVmPolicy(vmPolicy);
                return b68679066879342850252;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (E6645929122040922099 e) {
            return e.a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        K4690422250417820120 k4690422250417820120 = this.g;
        synchronized (k4690422250417820120.a) {
            try {
                k4690422250417820120.c.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = (byte) 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        K4690422250417820120 k4690422250417820120 = this.g;
        synchronized (k4690422250417820120.a) {
            try {
                k4690422250417820120.c.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = (byte) 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
