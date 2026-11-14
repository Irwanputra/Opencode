package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import dev.epro.r0.B14824868959299866349;
import dev.epro.r0.D15913187640519482289;
import dev.epro.r0.D16945471218061474327;
import dev.epro.r0.I1283052979100930176;
import dev.epro.r0.I1632105416032993715;
import dev.epro.r0.I3863025946240164840;
import dev.epro.r0.I4293432593871965076;
import dev.epro.r0.M10846389789027735899;
import dev.epro.r0.P72364327365747079;
import dev.epro.r0.Q13914734507241918864;
import dev.epro.r0.R3192876217964974737;
import dev.epro.r0.V15499216873564893116;
import dev.epro.r0.W13734796219485846113;
import dev.epro.r0.Y13568929412073945273;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class SystemForegroundService extends Service implements I4293432593871965076 {
    public static final /* synthetic */ int e = 0;
    public final I1632105416032993715 a = new I1632105416032993715(this);
    public boolean b;
    public Y13568929412073945273 c;
    public NotificationManager d;

    static {
        B14824868959299866349.o("SystemFgService");
    }

    public final void c() {
        this.d = (NotificationManager) getApplicationContext().getSystemService("notification");
        Y13568929412073945273 y13568929412073945273 = new Y13568929412073945273(getApplicationContext());
        this.c = y13568929412073945273;
        if (y13568929412073945273.i != null) {
            B14824868959299866349.n().getClass();
        } else {
            y13568929412073945273.i = this;
        }
    }

    public final void d() {
        I1632105416032993715 i1632105416032993715 = this.a;
        i1632105416032993715.getClass();
        i1632105416032993715.u(P72364327365747079.ON_CREATE);
        super.onCreate();
    }

    public final void e() {
        I1632105416032993715 i1632105416032993715 = this.a;
        i1632105416032993715.getClass();
        i1632105416032993715.u(P72364327365747079.ON_STOP);
        i1632105416032993715.u(P72364327365747079.ON_DESTROY);
        super.onDestroy();
    }

    @Override // dev.epro.r0.I4293432593871965076
    public final R3192876217964974737 j() {
        return (I1283052979100930176) this.a.b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        I1632105416032993715 i1632105416032993715 = this.a;
        i1632105416032993715.getClass();
        i1632105416032993715.u(P72364327365747079.ON_START);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        d();
        c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        e();
        this.c.e();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        I1632105416032993715 i1632105416032993715 = this.a;
        i1632105416032993715.getClass();
        i1632105416032993715.u(P72364327365747079.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.b) {
            B14824868959299866349.n().getClass();
            this.c.e();
            c();
            this.b = false;
        }
        if (intent == null) {
            return 3;
        }
        Y13568929412073945273 y13568929412073945273 = this.c;
        y13568929412073945273.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            B14824868959299866349 n = B14824868959299866349.n();
            Objects.toString(intent);
            n.getClass();
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            Q13914734507241918864 q13914734507241918864 = y13568929412073945273.b;
            q13914734507241918864.a.execute(new I3863025946240164840((Object) y13568929412073945273, (Object) stringExtra, false, (byte) 17));
            y13568929412073945273.b(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            y13568929412073945273.b(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            B14824868959299866349.n().getClass();
            SystemForegroundService systemForegroundService = y13568929412073945273.i;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.b = true;
            B14824868959299866349.n().getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i2);
            return 3;
        }
        B14824868959299866349 n2 = B14824868959299866349.n();
        Objects.toString(intent);
        n2.getClass();
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        W13734796219485846113 w13734796219485846113 = y13568929412073945273.a;
        UUID fromString = UUID.fromString(stringExtra2);
        w13734796219485846113.getClass();
        fromString.getClass();
        M10846389789027735899 m10846389789027735899 = w13734796219485846113.b.h;
        V15499216873564893116 v15499216873564893116 = w13734796219485846113.d.a;
        v15499216873564893116.getClass();
        D15913187640519482289.z(m10846389789027735899, "CancelWorkById", v15499216873564893116, new D16945471218061474327(w13734796219485846113, fromString, (byte) 19));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.c.f(i, 2048);
    }

    public final void onTimeout(int i, int i2) {
        this.c.f(i, i2);
    }
}
