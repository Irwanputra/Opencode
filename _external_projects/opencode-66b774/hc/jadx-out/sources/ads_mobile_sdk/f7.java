package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import dev.epro.r0.A8094652504661216977;
import dev.epro.r0.B11509606741455062017;
import dev.epro.r0.D16915945238461757356;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.P17493338506140929634;
import dev.epro.r0.T2935108450471281937;
import dev.epro.r0.T7468265282056741718;
import dev.epro.r0.V9379369092627242728;
import dev.epro.r0.Z886113521968091188;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class f7 {
    public final f61 a;
    public final ga3 b;
    public final ub3 c;
    public final vi3 d;
    public final P17493338506140929634 e;
    public final long f;
    public final A8094652504661216977 g;
    public final long h;
    public final long i = System.currentTimeMillis();
    public final boolean j;
    public final long k;
    public final boolean l;

    public f7(f61 f61Var, ga3 ga3Var, ub3 ub3Var, vi3 vi3Var, P17493338506140929634 p17493338506140929634, A8094652504661216977 a8094652504661216977, j7 j7Var) {
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

    public final String a(Context context, String str, View view, Activity activity) {
        D16915945238461757356 d16915945238461757356O;
        T7468265282056741718 t7468265282056741718;
        vi3 vi3Var = this.d;
        sh3 sh3Var = new sh3(yk0.EVENT_ID_SIGNAL_CLICK, vi3Var.b, vi3Var.a);
        boolean z = this.l;
        f61 f61Var = this.a;
        if (z) {
            synchronized (f61Var) {
                t7468265282056741718 = f61Var.e;
                t7468265282056741718.getClass();
            }
            d16915945238461757356O = M9216324016624295870.O(t7468265282056741718);
        } else {
            synchronized (f61Var) {
                d16915945238461757356O = f61Var.e;
                d16915945238461757356O.getClass();
            }
        }
        V9379369092627242728 v9379369092627242728R = B11509606741455062017.r(d16915945238461757356O, new T2935108450471281937(this, context, str, view, activity, (byte) 1), Z886113521968091188.a);
        try {
            try {
                try {
                    sh3Var.b();
                    String str2 = (String) v9379369092627242728R.get(this.f, TimeUnit.MILLISECONDS);
                    sh3Var.a();
                    this.e.a();
                    return str2;
                } catch (ExecutionException e) {
                    Throwable th = e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    sh3Var.a(th);
                    String string = Integer.toString(3);
                    sh3Var.a();
                    this.e.a();
                    return string;
                } catch (Throwable th2) {
                    sh3Var.a(th2);
                    throw th2;
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                sh3Var.a(e2);
                sh3Var.a();
                this.e.a();
                return "";
            } catch (TimeoutException unused) {
                if (this.l) {
                    v9379369092627242728R.cancel(false);
                }
                this.d.b(yk0.EVENT_ID_CLICK_SIGNAL_TIMEOUT);
                String string2 = Integer.toString(17);
                sh3Var.a();
                this.e.a();
                return string2;
            }
        } catch (Throwable th3) {
            sh3Var.a();
            this.e.a();
            throw th3;
        }
    }

    public final String b(Context context, String str, View view, Activity activity) {
        D16915945238461757356 d16915945238461757356O;
        T7468265282056741718 t7468265282056741718;
        vi3 vi3Var = this.d;
        sh3 sh3Var = new sh3(yk0.EVENT_ID_SIGNAL_VIEW, vi3Var.b, vi3Var.a);
        boolean z = this.l;
        f61 f61Var = this.a;
        if (z) {
            synchronized (f61Var) {
                t7468265282056741718 = f61Var.e;
                t7468265282056741718.getClass();
            }
            d16915945238461757356O = M9216324016624295870.O(t7468265282056741718);
        } else {
            synchronized (f61Var) {
                d16915945238461757356O = f61Var.e;
                d16915945238461757356O.getClass();
            }
        }
        V9379369092627242728 v9379369092627242728R = B11509606741455062017.r(d16915945238461757356O, new T2935108450471281937(this, context, str, view, activity, (byte) 0), Z886113521968091188.a);
        try {
            try {
                try {
                    sh3Var.b();
                    String str2 = (String) v9379369092627242728R.get(this.f, TimeUnit.MILLISECONDS);
                    sh3Var.a();
                    this.e.a();
                    return str2;
                } catch (ExecutionException e) {
                    Throwable th = e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    sh3Var.a(th);
                    String string = Integer.toString(3);
                    sh3Var.a();
                    this.e.a();
                    return string;
                } catch (Throwable th2) {
                    sh3Var.a(th2);
                    throw th2;
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                sh3Var.a(e2);
                sh3Var.a();
                this.e.a();
                return "";
            } catch (TimeoutException unused) {
                if (this.l) {
                    v9379369092627242728R.cancel(false);
                }
                this.d.b(yk0.EVENT_ID_VIEW_SIGNAL_TIMEOUT);
                String string2 = Integer.toString(17);
                sh3Var.a();
                this.e.a();
                return string2;
            }
        } catch (Throwable th3) {
            sh3Var.a();
            this.e.a();
            throw th3;
        }
    }

    public final String a(boolean z) {
        if (z) {
            up1 up1Var = (up1) this.g.get();
            long j = this.i;
            vi3 vi3Var = up1Var.b;
            try {
                new sh3(yk0.EVENT_ID_MINIMAL_SIGNAL_QUERY, vi3Var.b, vi3Var.a).b();
                return up1Var.a(j);
            } finally {
            }
        } else {
            this.d.b(yk0.EVENT_ID_QUERY_SIGNAL_TIMEOUT);
            return Integer.toString(17);
        }
    }
}
