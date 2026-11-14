package dev.epro.r0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class W13734796219485846113 {
    public static W13734796219485846113 k;
    public static W13734796219485846113 l;
    public static final Object m;
    public final Context a;
    public final W1977247516027959386 b;
    public final WorkDatabase c;
    public final Q13914734507241918864 d;
    public final List e;
    public final N12253737202470468561 f;
    public final G240381062716048330 g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final I6674524549538428163 j;

    public W13734796219485846113(Context context, final W1977247516027959386 w1977247516027959386, Q13914734507241918864 q13914734507241918864, final WorkDatabase workDatabase, final List list, N12253737202470468561 n12253737202470468561, I6674524549538428163 i6674524549538428163) {
        Context applicationContext = context.getApplicationContext();
        R4833348786910499294 r4833348786910499294 = null;
        if (applicationContext.isDeviceProtectedStorage()) {
            S10973172697741180971.m("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        w1977247516027959386.getClass();
        B14824868959299866349 b14824868959299866349 = new B14824868959299866349(4);
        synchronized (B14824868959299866349.i) {
            try {
                if (B14824868959299866349.j == null) {
                    B14824868959299866349.j = b14824868959299866349;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = applicationContext;
        this.d = q13914734507241918864;
        this.c = workDatabase;
        this.f = n12253737202470468561;
        this.j = i6674524549538428163;
        this.b = w1977247516027959386;
        this.e = list;
        D11883231851729262595 d11883231851729262595 = q13914734507241918864.b;
        d11883231851729262595.getClass();
        A2789795882633926065 a2789795882633926065A = O8620973563946607355.a(d11883231851729262595);
        this.g = new G240381062716048330(workDatabase);
        final V15499216873564893116 v15499216873564893116 = q13914734507241918864.a;
        int i = D5189746287310821661.a;
        n12253737202470468561.a(new T16632042582001818609() { // from class: dev.epro.r0.S7394983674774924779
            @Override // dev.epro.r0.T16632042582001818609
            public final void d(T4643696886244492064 t4643696886244492064, boolean z) {
                v15499216873564893116.execute(new C6304971381494908806(list, t4643696886244492064, w1977247516027959386, workDatabase, (byte) 2));
            }
        });
        q13914734507241918864.a.execute(new O13592913085879973388(applicationContext, this));
        int i2 = H15104563917493595201.a;
        if (Q15434108051134495466.a(applicationContext, w1977247516027959386)) {
            O5354877807466160604.W(new R3229391822211813842(M9216324016624295870.v(U16229988784104357932.y(new K12650811430861268746(C9869900372345142877.v(workDatabase.x().a, new String[]{"workspec"}, new A11054869418321976017((byte) 7)), new A3672266205716302703(4, null), (byte) 1), -1)), new G16212247282630895364(applicationContext, r4833348786910499294, (byte) 23), (byte) 2), a2789795882633926065A);
        }
    }

    public static native W13734796219485846113 b(Context context);

    public static void c(Context context, W1977247516027959386 w1977247516027959386) {
        synchronized (m) {
            try {
                W13734796219485846113 w13734796219485846113 = k;
                if (w13734796219485846113 != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (w13734796219485846113 == null) {
                    Context applicationContext = context.getApplicationContext();
                    W13734796219485846113 w13734796219485846113M = l;
                    if (w13734796219485846113M == null) {
                        w13734796219485846113M = O4077903568229246.m(applicationContext, w1977247516027959386);
                        l = w13734796219485846113M;
                    }
                    k = w13734796219485846113M;
                }
            } finally {
            }
        }
    }

    public final void a(M10089736868580320414 m10089736868580320414) {
        List listU = K5751602218013079365.U(m10089736868580320414);
        if (listU.isEmpty()) {
            S10973172697741180971.j("enqueue needs at least one WorkRequest.");
            return;
        }
        B9934915652113529982 b9934915652113529982 = new B9934915652113529982(this, listU);
        if (!b9934915652113529982.e) {
            D15913187640519482289.z(this.b.h, "EnqueueRunnable_KEEP", this.d.a, new E6464496061242537963(b9934915652113529982, (byte) 11));
            return;
        }
        B14824868959299866349 b14824868959299866349N = B14824868959299866349.n();
        TextUtils.join(", ", b9934915652113529982.c);
        b14824868959299866349N.getClass();
    }

    public final void d() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        M10846389789027735899 m10846389789027735899 = this.b.h;
        D1591114510419059768 d1591114510419059768 = new D1591114510419059768(this, (byte) 1);
        boolean zP = U8836654130139556418.p();
        if (zP) {
            try {
                Trace.beginSection(U8836654130139556418.B("ReschedulingWork"));
            } finally {
                if (zP) {
                    Trace.endSection();
                }
            }
        }
        d1591114510419059768.invoke();
    }

    static {
        izmyclvb.qgayjvbiagej2(1904);
        B14824868959299866349.o("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }
}
