package androidx.work.impl.foreground;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class SystemForegroundService extends android.app.Service implements dev.epro.r0.I4293432593871965076 {
    public static final /* synthetic */ int e = 0;
    public final dev.epro.r0.I1632105416032993715 a = new dev.epro.r0.I1632105416032993715(this);
    public boolean b;
    public dev.epro.r0.Y13568929412073945273 c;
    public android.app.NotificationManager d;

    static {
        dev.epro.r0.B14824868959299866349.o("SystemFgService");
    }

    public final void c() {
        this.d = (android.app.NotificationManager) getApplicationContext().getSystemService("notification");
        dev.epro.r0.Y13568929412073945273 y13568929412073945273 = new dev.epro.r0.Y13568929412073945273(getApplicationContext());
        this.c = y13568929412073945273;
        if (y13568929412073945273.i != null) {
            dev.epro.r0.B14824868959299866349.n().getClass();
        } else {
            y13568929412073945273.i = this;
        }
    }

    public final void d() {
        dev.epro.r0.I1632105416032993715 i1632105416032993715 = this.a;
        i1632105416032993715.getClass();
        i1632105416032993715.u(dev.epro.r0.P72364327365747079.ON_CREATE);
        super.onCreate();
    }

    public final void e() {
        dev.epro.r0.I1632105416032993715 i1632105416032993715 = this.a;
        i1632105416032993715.getClass();
        i1632105416032993715.u(dev.epro.r0.P72364327365747079.ON_STOP);
        i1632105416032993715.u(dev.epro.r0.P72364327365747079.ON_DESTROY);
        super.onDestroy();
    }

    public final dev.epro.r0.R3192876217964974737 j() {
        return (dev.epro.r0.I1283052979100930176) this.a.b;
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        intent.getClass();
        dev.epro.r0.I1632105416032993715 i1632105416032993715 = this.a;
        i1632105416032993715.getClass();
        i1632105416032993715.u(dev.epro.r0.P72364327365747079.ON_START);
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
    public final void onStart(android.content.Intent intent, int i) {
        dev.epro.r0.I1632105416032993715 i1632105416032993715 = this.a;
        i1632105416032993715.getClass();
        i1632105416032993715.u(dev.epro.r0.P72364327365747079.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.b) {
            dev.epro.r0.B14824868959299866349.n().getClass();
            this.c.e();
            c();
            this.b = false;
        }
        if (intent == null) {
            return 3;
        }
        dev.epro.r0.Y13568929412073945273 y13568929412073945273 = this.c;
        y13568929412073945273.getClass();
        java.lang.String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            dev.epro.r0.B14824868959299866349 b14824868959299866349N = dev.epro.r0.B14824868959299866349.n();
            java.util.Objects.toString(intent);
            b14824868959299866349N.getClass();
            java.lang.String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            dev.epro.r0.Q13914734507241918864 q13914734507241918864 = y13568929412073945273.b;
            q13914734507241918864.a.execute(new dev.epro.r0.I3863025946240164840(y13568929412073945273, stringExtra, false, (byte) 17));
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
            dev.epro.r0.B14824868959299866349.n().getClass();
            androidx.work.impl.foreground.SystemForegroundService systemForegroundService = y13568929412073945273.i;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.b = true;
            dev.epro.r0.B14824868959299866349.n().getClass();
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i2);
            return 3;
        }
        dev.epro.r0.B14824868959299866349 b14824868959299866349N2 = dev.epro.r0.B14824868959299866349.n();
        java.util.Objects.toString(intent);
        b14824868959299866349N2.getClass();
        java.lang.String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || android.text.TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        dev.epro.r0.W13734796219485846113 w13734796219485846113 = y13568929412073945273.a;
        java.util.UUID uuidFromString = java.util.UUID.fromString(stringExtra2);
        w13734796219485846113.getClass();
        uuidFromString.getClass();
        dev.epro.r0.M10846389789027735899 m10846389789027735899 = w13734796219485846113.b.h;
        dev.epro.r0.V15499216873564893116 v15499216873564893116 = w13734796219485846113.d.a;
        v15499216873564893116.getClass();
        dev.epro.r0.D15913187640519482289.z(m10846389789027735899, "CancelWorkById", v15499216873564893116, new dev.epro.r0.D16945471218061474327(w13734796219485846113, uuidFromString, (byte) 19));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.c.f(i, 2048);
    }

    public final void onTimeout(int i, int i2) {
        this.c.f(i, i2);
    }
}
