package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import dev.epro.r0.F11625739791267273945;
import dev.epro.r0.F4673815160636847046;
import dev.epro.r0.H10456395662455432781;
import dev.epro.r0.Q7316561721656982910;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.W8455343525638953052;
import dev.epro.r0.X9877988182490498425;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class i80 extends X9877988182490498425 {
    public final Context a;
    public final W5797197595347441198 b;
    public final kz2 c;
    public Q7316561721656982910 d;
    public W8455343525638953052 e;
    public final AtomicBoolean f;

    public i80(Context context, W5797197595347441198 w5797197595347441198, kz2 kz2Var) {
        context.getClass();
        w5797197595347441198.getClass();
        kz2Var.getClass();
        this.a = context;
        this.b = w5797197595347441198;
        this.c = kz2Var;
        this.f = new AtomicBoolean(false);
    }

    @Override // dev.epro.r0.X9877988182490498425
    public final void onCustomTabsServiceConnected(ComponentName componentName, W8455343525638953052 w8455343525638953052) {
        F11625739791267273945 f11625739791267273945 = (F11625739791267273945) w8455343525638953052.b;
        componentName.getClass();
        this.e = w8455343525638953052;
        try {
            ((H10456395662455432781) f11625739791267273945).c();
        } catch (RemoteException unused) {
        }
        F4673815160636847046 f4673815160636847046 = new F4673815160636847046(new h80(this));
        Q7316561721656982910 q7316561721656982910 = !((H10456395662455432781) f11625739791267273945).b(f4673815160636847046) ? null : new Q7316561721656982910(f11625739791267273945, f4673815160636847046, (ComponentName) w8455343525638953052.c);
        this.d = q7316561721656982910;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.d = null;
        this.e = null;
    }
}
