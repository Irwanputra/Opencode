package dev.epro.r0;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class X9877988182490498425 implements ServiceConnection {
    private Context mApplicationContext;

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, W8455343525638953052 w8455343525638953052);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        F11625739791267273945 f11625739791267273945;
        if (this.mApplicationContext == null) {
            S10973172697741180971.m("Custom Tabs Service connected before an applicationcontext has been provided.");
            return;
        }
        int i = N5541348707974092890.a;
        if (iBinder == null) {
            f11625739791267273945 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(F11625739791267273945.So);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof F11625739791267273945)) {
                H10456395662455432781 h10456395662455432781 = new H10456395662455432781();
                h10456395662455432781.a = iBinder;
                f11625739791267273945 = h10456395662455432781;
            } else {
                f11625739791267273945 = (F11625739791267273945) queryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new W8455343525638953052(f11625739791267273945, componentName, false, (byte) 17));
    }

    public final void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
