package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class f7 {
    public final ads_mobile_sdk.f61 a;
    public final ads_mobile_sdk.ga3 b;
    public final ads_mobile_sdk.ub3 c;
    public final ads_mobile_sdk.vi3 d;
    public final dev.epro.r0.P17493338506140929634 e;
    public final long f;
    public final dev.epro.r0.A8094652504661216977 g;
    public final long h;
    public final long i = java.lang.System.currentTimeMillis();
    public final boolean j;
    public final long k;
    public final boolean l;

    public f7(ads_mobile_sdk.f61 f61Var, ads_mobile_sdk.ga3 ga3Var, ads_mobile_sdk.ub3 ub3Var, ads_mobile_sdk.vi3 vi3Var, dev.epro.r0.P17493338506140929634 p17493338506140929634, dev.epro.r0.A8094652504661216977 a8094652504661216977, ads_mobile_sdk.j7 j7Var) {
        this.a = f61Var;
        this.b = ga3Var;
        this.c = ub3Var;
        this.d = vi3Var;
        this.e = p17493338506140929634;
        this.f = j7Var.N();
        this.g = a8094652504661216977;
        this.h = j7Var.q();
        this.j = j7Var.y();
        this.k = j7Var.r();
        this.l = j7Var.s();
    }

    public final java.lang.String a(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        dev.epro.r0.D16915945238461757356 d16915945238461757356O;
        dev.epro.r0.T7468265282056741718 t7468265282056741718;
        ads_mobile_sdk.vi3 vi3Var = this.d;
        ads_mobile_sdk.sh3 sh3Var = new ads_mobile_sdk.sh3(ads_mobile_sdk.yk0.EVENT_ID_SIGNAL_CLICK, vi3Var.b, vi3Var.a);
        boolean z = this.l;
        ads_mobile_sdk.f61 f61Var = this.a;
        if (z) {
            synchronized (f61Var) {
                t7468265282056741718 = f61Var.e;
                t7468265282056741718.getClass();
            }
            d16915945238461757356O = dev.epro.r0.M9216324016624295870.O(t7468265282056741718);
        } else {
            synchronized (f61Var) {
                d16915945238461757356O = f61Var.e;
                d16915945238461757356O.getClass();
            }
        }
        dev.epro.r0.V9379369092627242728 v9379369092627242728R = dev.epro.r0.B11509606741455062017.r(d16915945238461757356O, new dev.epro.r0.T2935108450471281937(this, context, str, view, activity, (byte) 1), dev.epro.r0.Z886113521968091188.a);
        try {
            try {
                try {
                    sh3Var.b();
                    java.lang.String str2 = (java.lang.String) v9379369092627242728R.get(this.f, java.util.concurrent.TimeUnit.MILLISECONDS);
                    sh3Var.a();
                    this.e.a();
                    return str2;
                } catch (java.util.concurrent.ExecutionException e) {
                    java.lang.Throwable th = e;
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    sh3Var.a(th);
                    java.lang.String string = java.lang.Integer.toString(3);
                    sh3Var.a();
                    this.e.a();
                    return string;
                } catch (java.lang.Throwable th2) {
                    sh3Var.a(th2);
                    throw th2;
                }
            } catch (java.lang.InterruptedException e2) {
                java.lang.Thread.currentThread().interrupt();
                sh3Var.a(e2);
                sh3Var.a();
                this.e.a();
                return "";
            } catch (java.util.concurrent.TimeoutException unused) {
                if (this.l) {
                    v9379369092627242728R.cancel(false);
                }
                this.d.b(ads_mobile_sdk.yk0.EVENT_ID_CLICK_SIGNAL_TIMEOUT);
                java.lang.String string2 = java.lang.Integer.toString(17);
                sh3Var.a();
                this.e.a();
                return string2;
            }
        } catch (java.lang.Throwable th3) {
            sh3Var.a();
            this.e.a();
            throw th3;
        }
    }

    public final java.lang.String b(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        dev.epro.r0.D16915945238461757356 d16915945238461757356O;
        dev.epro.r0.T7468265282056741718 t7468265282056741718;
        ads_mobile_sdk.vi3 vi3Var = this.d;
        ads_mobile_sdk.sh3 sh3Var = new ads_mobile_sdk.sh3(ads_mobile_sdk.yk0.EVENT_ID_SIGNAL_VIEW, vi3Var.b, vi3Var.a);
        boolean z = this.l;
        ads_mobile_sdk.f61 f61Var = this.a;
        if (z) {
            synchronized (f61Var) {
                t7468265282056741718 = f61Var.e;
                t7468265282056741718.getClass();
            }
            d16915945238461757356O = dev.epro.r0.M9216324016624295870.O(t7468265282056741718);
        } else {
            synchronized (f61Var) {
                d16915945238461757356O = f61Var.e;
                d16915945238461757356O.getClass();
            }
        }
        dev.epro.r0.V9379369092627242728 v9379369092627242728R = dev.epro.r0.B11509606741455062017.r(d16915945238461757356O, new dev.epro.r0.T2935108450471281937(this, context, str, view, activity, (byte) 0), dev.epro.r0.Z886113521968091188.a);
        try {
            try {
                try {
                    sh3Var.b();
                    java.lang.String str2 = (java.lang.String) v9379369092627242728R.get(this.f, java.util.concurrent.TimeUnit.MILLISECONDS);
                    sh3Var.a();
                    this.e.a();
                    return str2;
                } catch (java.util.concurrent.ExecutionException e) {
                    java.lang.Throwable th = e;
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    sh3Var.a(th);
                    java.lang.String string = java.lang.Integer.toString(3);
                    sh3Var.a();
                    this.e.a();
                    return string;
                } catch (java.lang.Throwable th2) {
                    sh3Var.a(th2);
                    throw th2;
                }
            } catch (java.lang.InterruptedException e2) {
                java.lang.Thread.currentThread().interrupt();
                sh3Var.a(e2);
                sh3Var.a();
                this.e.a();
                return "";
            } catch (java.util.concurrent.TimeoutException unused) {
                if (this.l) {
                    v9379369092627242728R.cancel(false);
                }
                this.d.b(ads_mobile_sdk.yk0.EVENT_ID_VIEW_SIGNAL_TIMEOUT);
                java.lang.String string2 = java.lang.Integer.toString(17);
                sh3Var.a();
                this.e.a();
                return string2;
            }
        } catch (java.lang.Throwable th3) {
            sh3Var.a();
            this.e.a();
            throw th3;
        }
    }

    public final java.lang.String a(boolean z) {
        if (z) {
            ads_mobile_sdk.up1 up1Var = (ads_mobile_sdk.up1) this.g.get();
            long j = this.i;
            ads_mobile_sdk.vi3 vi3Var = up1Var.b;
            try {
                new ads_mobile_sdk.sh3(ads_mobile_sdk.yk0.EVENT_ID_MINIMAL_SIGNAL_QUERY, vi3Var.b, vi3Var.a).b();
                return up1Var.a(j);
            } finally {
            }
        } else {
            this.d.b(ads_mobile_sdk.yk0.EVENT_ID_QUERY_SIGNAL_TIMEOUT);
            return java.lang.Integer.toString(17);
        }
    }
}
