package dev.epro.r0;

import ads_mobile_sdk.a70;
import ads_mobile_sdk.ao;
import ads_mobile_sdk.b30;
import ads_mobile_sdk.b43;
import ads_mobile_sdk.ba1;
import ads_mobile_sdk.c72;
import ads_mobile_sdk.c92;
import ads_mobile_sdk.d81;
import ads_mobile_sdk.dr0;
import ads_mobile_sdk.et0;
import ads_mobile_sdk.fb2;
import ads_mobile_sdk.fz;
import ads_mobile_sdk.gu0;
import ads_mobile_sdk.i6;
import ads_mobile_sdk.i80;
import ads_mobile_sdk.ib1;
import ads_mobile_sdk.jr0;
import ads_mobile_sdk.k80;
import ads_mobile_sdk.lp3;
import ads_mobile_sdk.nr0;
import ads_mobile_sdk.ny0;
import ads_mobile_sdk.of1;
import ads_mobile_sdk.p;
import ads_mobile_sdk.p72;
import ads_mobile_sdk.qi;
import ads_mobile_sdk.qj3;
import ads_mobile_sdk.rw0;
import ads_mobile_sdk.si0;
import ads_mobile_sdk.sq3;
import ads_mobile_sdk.sy0;
import ads_mobile_sdk.tx0;
import ads_mobile_sdk.w13;
import ads_mobile_sdk.w81;
import ads_mobile_sdk.x52;
import ads_mobile_sdk.xv;
import ads_mobile_sdk.yz0;
import ads_mobile_sdk.z62;
import ads_mobile_sdk.zg2;
import ads_mobile_sdk.zj;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Process;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.textclassifier.TextClassifier;
import android.webkit.CookieManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R16580349318584449994 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R16580349318584449994(Object obj, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.u = obj;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.u;
        switch (b) {
            case 0:
                return new R16580349318584449994((P5204863746366580363) obj2, r4833348786910499294, (byte) 0);
            case 1:
                return new R16580349318584449994((b30) obj2, r4833348786910499294, (byte) 1);
            case 2:
                return new R16580349318584449994((b43) obj2, r4833348786910499294, (byte) 2);
            case 3:
                return new R16580349318584449994((ba1) obj2, r4833348786910499294, (byte) 3);
            case 4:
                return new R16580349318584449994((fb2) obj2, r4833348786910499294, (byte) 4);
            case 5:
                return new R16580349318584449994((sy0) obj2, r4833348786910499294, (byte) 5);
            case 6:
                return new R16580349318584449994((Application) obj2, r4833348786910499294, (byte) 6);
            case 7:
                return new R16580349318584449994((a70) obj2, r4833348786910499294, (byte) 7);
            case 8:
                return new R16580349318584449994((i80) obj2, r4833348786910499294, (byte) 8);
            case 9:
                return new R16580349318584449994((of1) obj2, r4833348786910499294, (byte) 9);
            case 10:
                return new R16580349318584449994((k80) obj2, r4833348786910499294, (byte) 10);
            case 11:
                return new R16580349318584449994((T17336508261397230716) obj2, r4833348786910499294, (byte) 11);
            case 12:
                return new R16580349318584449994((nr0) obj2, r4833348786910499294, (byte) 12);
            case 13:
                return new R16580349318584449994((x52) obj2, r4833348786910499294, (byte) 13);
            case 14:
                return new R16580349318584449994((qi) obj2, r4833348786910499294, (byte) 14);
            case 15:
                return new R16580349318584449994((et0) obj2, r4833348786910499294, (byte) 15);
            case 16:
                return new R16580349318584449994((fz) obj2, r4833348786910499294, (byte) 16);
            case 17:
                return new R16580349318584449994((zg2) obj2, r4833348786910499294, (byte) 17);
            case 18:
                return new R16580349318584449994((yz0) obj2, r4833348786910499294, (byte) 18);
            case 19:
                return new R16580349318584449994((c92) obj2, r4833348786910499294, (byte) 19);
            case 20:
                return new R16580349318584449994((dr0) obj2, r4833348786910499294, (byte) 20);
            case 21:
                return new R16580349318584449994((L16425900549479658727) obj2, r4833348786910499294, (byte) 21);
            case 22:
                return new R16580349318584449994((K1755082528704418605) obj2, r4833348786910499294, (byte) 22);
            default:
                return new R16580349318584449994((B13729205492206812220) obj2, r4833348786910499294, (byte) 23);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Object obj3 = this.u;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                ((R16580349318584449994) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 1:
                new R16580349318584449994((b30) obj3, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 2:
                new R16580349318584449994((b43) obj3, (R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 3:
                ba1 ba1Var = (ba1) obj3;
                new R16580349318584449994(ba1Var, (R4833348786910499294) obj2, (byte) 3);
                E17665849472693074628.k(o9245300239821758723);
                return ba1Var;
            case 4:
                new R16580349318584449994((fb2) obj3, (R4833348786910499294) obj2, (byte) 4).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 5:
                new R16580349318584449994((sy0) obj3, (R4833348786910499294) obj2, (byte) 5).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 6:
                new R16580349318584449994((Application) obj3, (R4833348786910499294) obj2, (byte) 6).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 7:
                a70 a70Var = (a70) obj3;
                new R16580349318584449994(a70Var, (R4833348786910499294) obj2, (byte) 7);
                E17665849472693074628.k(o9245300239821758723);
                return a70Var;
            case 8:
                new R16580349318584449994((i80) obj3, (R4833348786910499294) obj2, (byte) 8).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 9:
                new R16580349318584449994((of1) obj3, (R4833348786910499294) obj2, (byte) 9).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 10:
                new R16580349318584449994((k80) obj3, (R4833348786910499294) obj2, (byte) 10).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 11:
                new R16580349318584449994((T17336508261397230716) obj3, (R4833348786910499294) obj2, (byte) 11).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 12:
                new R16580349318584449994((nr0) obj3, (R4833348786910499294) obj2, (byte) 12).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 13:
                new R16580349318584449994((x52) obj3, (R4833348786910499294) obj2, (byte) 13).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 14:
                qi qiVar = (qi) obj3;
                new R16580349318584449994(qiVar, (R4833348786910499294) obj2, (byte) 14);
                E17665849472693074628.k(o9245300239821758723);
                return qiVar;
            case 15:
                new R16580349318584449994((et0) obj3, (R4833348786910499294) obj2, (byte) 15).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 16:
                new R16580349318584449994((fz) obj3, (R4833348786910499294) obj2, (byte) 16).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 17:
                new R16580349318584449994((zg2) obj3, (R4833348786910499294) obj2, (byte) 17).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 18:
                new R16580349318584449994((yz0) obj3, (R4833348786910499294) obj2, (byte) 18).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 19:
                return new R16580349318584449994((c92) obj3, (R4833348786910499294) obj2, (byte) 19).invokeSuspend(o9245300239821758723);
            case 20:
                new R16580349318584449994((dr0) obj3, (R4833348786910499294) obj2, (byte) 20).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 21:
                ((R16580349318584449994) create((R4833348786910499294) obj2, (G11493083415162978130) obj)).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            case 22:
                return ((R16580349318584449994) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                ((R16580349318584449994) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [dev.epro.r0.R4833348786910499294] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        boolean z;
        O9245300239821758723 o9245300239821758723;
        Executor k7613050519047686686;
        String strD;
        String strD2;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        byte b = 1;
        CookieManager cookieManager = 0;
        cookieManager = 0;
        cookieManager = 0;
        cookieManager = 0;
        cookieManager = 0;
        switch (this.t) {
            case 0:
                E17665849472693074628.k(obj);
                ((P5204863746366580363) this.u).a();
                return O9245300239821758723.a;
            case 1:
                E17665849472693074628.k(obj);
                ((b30) this.u).c();
                return O9245300239821758723.a;
            case 2:
                E17665849472693074628.k(obj);
                b43 b43Var = (b43) this.u;
                w81 w81Var = b43Var.i;
                if (w81Var != null) {
                    int i2 = b43Var.h;
                    jr0 jr0Var = w81Var.i;
                    if (i2 == ((Number) jr0Var.a("gads:inspector:shake_count", O17574792317020433029.c(jr0Var, "gads:inspector:shake_count", 3), ao.a$18)).intValue()) {
                        W5797197595347441198 w5797197595347441198 = w81Var.d;
                        d81 d81Var = new d81(w81Var, cookieManager, b);
                        I3826119971291161142 i3826119971291161142 = I3826119971291161142.a;
                        w5797197595347441198.getClass();
                        R7033599853981556291.E(w5797197595347441198, i3826119971291161142, null, new P7598478828797568949(d81Var, null, (byte) 1), 2);
                    }
                }
                return O9245300239821758723.a;
            case 3:
                E17665849472693074628.k(obj);
                return (ba1) this.u;
            case 4:
                E17665849472693074628.k(obj);
                ArrayList arrayList = ((fb2) this.u).g;
                if (arrayList == null) {
                    S10823041268949770285.b0("renderingJobs");
                    throw null;
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((Q15035754882231748864) obj2).c(new CancellationException("Best possible ad config has been rendered, cancelling inflight renderers."));
                }
                return O9245300239821758723.a;
            case 5:
                E17665849472693074628.k(obj);
                sy0 sy0Var = (sy0) this.u;
                synchronized (sy0Var.f) {
                    synchronized (sy0Var.f) {
                        z = sy0Var.m;
                    }
                    int i3 = sy0Var.i;
                    sy0Var.i = 4;
                    R7033599853981556291.E(sy0Var.a, null, null, new ny0(sy0Var, i3, 4, z, z, null), 3);
                    o9245300239821758723 = O9245300239821758723.a;
                }
                return o9245300239821758723;
            case 6:
                E17665849472693074628.k(obj);
                gu0 gu0Var = gu0.a;
                Application application = (Application) this.u;
                SharedPreferences sharedPreferences = application.getSharedPreferences("GoogleMobileAds", 0);
                int i4 = sharedPreferences.getInt("early_webview_init_count", 0);
                String string = sharedPreferences.getString("early_webview_init_profiles", "");
                String str = string != null ? string : "";
                Set setZ = M8927913404651150384.Y(str) ? T8598786036980488824.z("Default") : T8598786036980488824.s(T8598786036980488824.z("Default"), R9411874267597469228.h1(M8927913404651150384.p0(str, new String[]{","}, 6)));
                if (i4 > 0) {
                    AtomicBoolean atomicBoolean = lp3.a;
                    Y10288379321248498973 y10288379321248498973 = M979257876727257621.a;
                    N11611180034702960692 n11611180034702960692 = N11611180034702960692.c;
                    N11611180034702960692 n116111800347029606922 = n11611180034702960692 != null ? n11611180034702960692 : null;
                    if (n116111800347029606922 == null || (k7613050519047686686 = n116111800347029606922.D()) == null) {
                        k7613050519047686686 = new K7613050519047686686(n11611180034702960692);
                    }
                    lp3.a(application, k7613050519047686686, true, setZ, null);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putInt("early_webview_init_count", i4 - 1);
                    editorEdit.apply();
                }
                return O9245300239821758723.a;
            case 7:
                E17665849472693074628.k(obj);
                return (a70) this.u;
            case 8:
                E17665849472693074628.k(obj);
                i80 i80Var = (i80) this.u;
                Context context = i80Var.a;
                if (i80Var.e == null && (strD = W8455343525638953052.D(context)) != null && !strD.equals(context.getPackageName())) {
                    W8455343525638953052.j(context, strD, i80Var);
                }
                return O9245300239821758723.a;
            case 9:
                E17665849472693074628.k(obj);
                of1 of1Var = (of1) this.u;
                E4916761685899363666 e4916761685899363666A = of1Var.p.a();
                Context context2 = of1Var.a;
                if (!e4916761685899363666A.a(context2)) {
                    P5733283974459951585 p5733283974459951585 = rw0.f;
                    P5733283974459951585.d(context2);
                }
                return O9245300239821758723.a;
            case 10:
                E17665849472693074628.k(obj);
                i80 i80Var2 = ((k80) this.u).c;
                i80Var2.f.getAndSet(true);
                Context context3 = i80Var2.a;
                if (i80Var2.e == null && (strD2 = W8455343525638953052.D(context3)) != null && !strD2.equals(context3.getPackageName())) {
                    W8455343525638953052.j(context3, strD2, i80Var2);
                }
                return O9245300239821758723.a;
            case 11:
                E17665849472693074628.k(obj);
                ((T17336508261397230716) this.u).finish();
                return O9245300239821758723.a;
            case 12:
                E17665849472693074628.k(obj);
                nr0 nr0Var = (nr0) this.u;
                w81 w81Var2 = nr0Var.m;
                if (w81Var2 != null) {
                    int i5 = nr0Var.j;
                    jr0 jr0Var2 = w81Var2.i;
                    if (i5 == ((Number) jr0Var2.a("gads:inspector:flick_count", O17574792317020433029.c(jr0Var2, "gads:inspector:flick_count", 2), ao.a$18)).intValue()) {
                        W5797197595347441198 w57971975953474411982 = w81Var2.d;
                        d81 d81Var2 = new d81(w81Var2, cookieManager, z2 ? 1 : 0);
                        I3826119971291161142 i38261199712911611422 = I3826119971291161142.a;
                        w57971975953474411982.getClass();
                        R7033599853981556291.E(w57971975953474411982, i38261199712911611422, null, new P7598478828797568949(d81Var2, null, (byte) 1), 2);
                    }
                }
                return O9245300239821758723.a;
            case 13:
                E17665849472693074628.k(obj);
                Context context4 = ((x52) this.u).c;
                z62 z62Var = K5751602218013079365.C;
                Context applicationContext = context4.getApplicationContext();
                if (applicationContext == null) {
                    S10973172697741180971.j("Application Context cannot be null");
                    return null;
                }
                if (!z62Var.a) {
                    z62Var.a = true;
                    p72 p72VarA = p72.a();
                    p72VarA.d = new si0(new Handler(), applicationContext, new Y2677586711477821327((byte) 10), p72VarA);
                    i6 i6Var = i6.d;
                    boolean z4 = applicationContext instanceof Application;
                    if (z4) {
                        ((Application) applicationContext).registerActivityLifecycleCallbacks(i6Var);
                    }
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    xv.f3a = applicationContext2;
                    if (applicationContext2 == null) {
                        xv.f3a = applicationContext;
                    }
                    xv.b = 0;
                    ExecutorService executorService = c72.a;
                    c72.f = applicationContext.getResources().getDisplayMetrics().density;
                    c72.b = (WindowManager) applicationContext.getSystemService("window");
                    c72.c = null;
                    c72.a.submit(new A8962658062045365505((byte) 3));
                    DisplayManager displayManager = (DisplayManager) applicationContext.getSystemService("display");
                    if (displayManager != null) {
                        D15790576501325811873 d15790576501325811873 = c72.d;
                        if (d15790576501325811873 != null) {
                            displayManager.unregisterDisplayListener(d15790576501325811873);
                            c72.d = null;
                        }
                        D15790576501325811873 d157905765013258118732 = new D15790576501325811873();
                        c72.d = d157905765013258118732;
                        displayManager.registerDisplayListener(d157905765013258118732, null);
                    }
                    applicationContext.registerReceiver(new B13379005111179728343(z3 ? 1 : 0), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
                    ib1.b.a = applicationContext.getApplicationContext();
                    p pVar = p.f;
                    if (!pVar.c) {
                        zj zjVar = pVar.d;
                        if (z4) {
                            ((Application) applicationContext).registerActivityLifecycleCallbacks(zjVar);
                        }
                        zj zjVar2 = pVar.d;
                        zjVar2.c = pVar;
                        zjVar2.a = true;
                        zjVar2.b = zjVar2.a();
                        pVar.e = pVar.d.b;
                        pVar.c = true;
                    }
                    w13.d.a = new WeakReference(applicationContext);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    applicationContext.registerReceiver(new B13379005111179728343(b), intentFilter);
                    Executors.newSingleThreadExecutor().execute(new qj3(applicationContext, (byte) 3));
                }
                return O9245300239821758723.a;
            case 14:
                E17665849472693074628.k(obj);
                return (qi) this.u;
            case 15:
                E17665849472693074628.k(obj);
                ((et0) this.u).a$1(3);
                return O9245300239821758723.a;
            case 16:
                E17665849472693074628.k(obj);
                fz fzVar = (fz) this.u;
                fzVar.i.getClass();
                int iMyUid = Process.myUid();
                if (iMyUid != 0 && iMyUid != 1000 && iMyUid != 1001 && iMyUid != 1002 && iMyUid != 1027) {
                    cookieManager = CookieManager.getInstance();
                }
                fzVar.C = cookieManager;
                return O9245300239821758723.a;
            case 17:
                E17665849472693074628.k(obj);
                zg2.a((zg2) this.u);
                return O9245300239821758723.a;
            case 18:
                E17665849472693074628.k(obj);
                yz0 yz0Var = (yz0) this.u;
                tx0 tx0Var = (tx0) yz0Var.b.d.get();
                if (tx0Var != null) {
                    tx0Var.setVisibility(8);
                }
                yz0Var.c.h.getAndSet(false);
                return O9245300239821758723.a;
            case 19:
                E17665849472693074628.k(obj);
                c92 c92Var = (c92) this.u;
                sq3 sq3Var = c92Var.R;
                if (sq3Var == null) {
                    return null;
                }
                ViewGroup viewGroup = sq3Var.c;
                ((tx0) c92Var.H.getValue()).n.set(false);
                if (viewGroup.indexOfChild(c92Var.g()) == -1) {
                    viewGroup.addView(c92Var.g(), sq3Var.b, sq3Var.a);
                }
                return O9245300239821758723.a;
            case 20:
                E17665849472693074628.k(obj);
                ((dr0) this.u).a();
                return O9245300239821758723.a;
            case 21:
                E17665849472693074628.k(obj);
                int i6 = I7491942769070885638.a;
                L16425900549479658727 l16425900549479658727 = (L16425900549479658727) this.u;
                B14824868959299866349 b14824868959299866349N = B14824868959299866349.n();
                Objects.toString(l16425900549479658727);
                b14824868959299866349N.getClass();
                return O9245300239821758723.a;
            case 22:
                E17665849472693074628.k(obj);
                K1755082528704418605 k1755082528704418605 = (K1755082528704418605) this.u;
                TextClassifier textClassifierD = C15025379344307230271.d(k1755082528704418605.b, k1755082528704418605.c);
                k1755082528704418605.f = textClassifierD;
                return textClassifierD;
            default:
                E17665849472693074628.k(obj);
                ((B13729205492206812220) this.u).invoke();
                return O9245300239821758723.a;
        }
    }
}
