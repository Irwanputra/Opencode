package ads_mobile_sdk;

import android.app.Activity;
import android.content.ComponentName;
import android.net.Uri;
import android.os.RemoteException;
import dev.epro.r0.F11625739791267273945;
import dev.epro.r0.F4673815160636847046;
import dev.epro.r0.H10456395662455432781;
import dev.epro.r0.Q7316561721656982910;
import dev.epro.r0.W8455343525638953052;
import dev.epro.r0.X9877988182490498425;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class g92 extends X9877988182490498425 {
    public final /* synthetic */ m92 a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Map e;

    public g92(m92 m92Var, Activity activity, Uri uri, String str, Map map) {
        this.a = m92Var;
        this.b = activity;
        this.c = uri;
        this.d = str;
        this.e = map;
    }

    @Override // dev.epro.r0.X9877988182490498425
    public final void onCustomTabsServiceConnected(ComponentName componentName, W8455343525638953052 w8455343525638953052) {
        F11625739791267273945 f11625739791267273945 = (F11625739791267273945) w8455343525638953052.b;
        componentName.getClass();
        try {
            ((H10456395662455432781) f11625739791267273945).c();
        } catch (RemoteException unused) {
        }
        Q7316561721656982910 q7316561721656982910 = null;
        F4673815160636847046 f4673815160636847046 = new F4673815160636847046(null);
        try {
            if (((H10456395662455432781) f11625739791267273945).b(f4673815160636847046)) {
                q7316561721656982910 = new Q7316561721656982910(f11625739791267273945, f4673815160636847046, (ComponentName) w8455343525638953052.c);
            }
        } catch (RemoteException unused2) {
        }
        String str = this.d;
        Map map = this.e;
        this.a.a(q7316561721656982910, this.b, this.c, str, map);
        this.b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
    }
}
