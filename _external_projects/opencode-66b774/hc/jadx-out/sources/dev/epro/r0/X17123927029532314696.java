package dev.epro.r0;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.Window;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X17123927029532314696 {
    public final Application a;
    public final O6655543165492094776 b;
    public final G5446205426701161097 c;
    public final O3923701449542713850 d;
    public final F6353700998356592239 e;
    public final A7202329723792933819 f;
    public Dialog g;
    public A4716120536771319554 h;
    public final AtomicBoolean i = new AtomicBoolean();
    public final AtomicReference j = new AtomicReference();
    public final AtomicReference k = new AtomicReference();
    public final AtomicReference l = new AtomicReference();
    public boolean m = false;
    public boolean n = false;

    public X17123927029532314696(Application application, O6655543165492094776 o6655543165492094776, G5446205426701161097 g5446205426701161097, O3923701449542713850 o3923701449542713850, F6353700998356592239 f6353700998356592239, A7202329723792933819 a7202329723792933819) {
        this.a = application;
        this.b = o6655543165492094776;
        this.c = g5446205426701161097;
        this.d = o3923701449542713850;
        this.e = f6353700998356592239;
        this.f = a7202329723792933819;
    }

    public final void a(Activity activity, S14143580604745876919 s14143580604745876919) {
        L7597948271951285043.a();
        ((Queue) this.f.h.get()).add(Long.valueOf(System.currentTimeMillis()));
        byte b = 0;
        if (!this.i.compareAndSet(false, true)) {
            I10210771329789820200 i10210771329789820200 = new I10210771329789820200(3, true != this.m ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.");
            d(i10210771329789820200);
            s14143580604745876919.a(i10210771329789820200.a());
            return;
        }
        A4716120536771319554 a4716120536771319554 = this.h;
        a4716120536771319554.a.post(new R14776647425038466172(a4716120536771319554.b, b));
        Q7424779606472524857 q7424779606472524857 = new Q7424779606472524857(this, activity);
        this.a.registerActivityLifecycleCallbacks(q7424779606472524857);
        this.l.set(q7424779606472524857);
        this.b.a = activity;
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.h);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            I10210771329789820200 i102107713297898202002 = new I10210771329789820200(3, "Activity with null windows is passed in.");
            d(i102107713297898202002);
            s14143580604745876919.a(i102107713297898202002.a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        E17665849472693074628.i(window, false);
        this.k.set(s14143580604745876919);
        dialog.show();
        this.g = dialog;
        this.h.a("UMP_messagePresented", "");
        d(null);
    }

    public final void b(P221537849541086423 p221537849541086423, A10930401833958772877 a10930401833958772877) {
        F6353700998356592239 f6353700998356592239 = this.e;
        O6655543165492094776 o6655543165492094776 = (O6655543165492094776) ((D9201356603168736774) f6353700998356592239.b).h();
        Handler handler = L7597948271951285043.a;
        Q3791352212346016950.m(handler);
        this.h = new A4716120536771319554(o6655543165492094776, handler, ((B16853324304735504143) f6353700998356592239.c).h());
        boolean z = this.m;
        A7202329723792933819 a7202329723792933819 = this.f;
        if (!z) {
            ((Queue) a7202329723792933819.j.get()).add(Long.valueOf(System.currentTimeMillis()));
        }
        A4716120536771319554 a4716120536771319554 = this.h;
        a4716120536771319554.setBackgroundColor(0);
        a4716120536771319554.getSettings().setJavaScriptEnabled(true);
        a4716120536771319554.getSettings().setAllowFileAccess(false);
        a4716120536771319554.getSettings().setAllowContentAccess(false);
        a4716120536771319554.setWebViewClient(new O14090912391717061492(a4716120536771319554));
        if (!this.m) {
            a7202329723792933819.a((Queue) a7202329723792933819.j.get(), 3, 2, null);
        }
        this.j.set(new D16890448397538465578(p221537849541086423, a10930401833958772877));
        A4716120536771319554 a47161205367713195542 = this.h;
        O3923701449542713850 o3923701449542713850 = this.d;
        a47161205367713195542.loadDataWithBaseURL(o3923701449542713850.a, o3923701449542713850.b, "text/html", "UTF-8", null);
        handler.postDelayed(new U3594978070141619353((Object) this, (byte) 17), 10000L);
    }

    public final void c(I10210771329789820200 i10210771329789820200) {
        D16890448397538465578 d16890448397538465578 = (D16890448397538465578) this.j.getAndSet(null);
        if (d16890448397538465578 == null) {
            return;
        }
        if (!this.m) {
            String message = i10210771329789820200.getMessage();
            boolean z = this.n;
            A7202329723792933819 a7202329723792933819 = this.f;
            if (z) {
                a7202329723792933819.a((Queue) a7202329723792933819.i.get(), 10, 11, message);
            } else {
                a7202329723792933819.a((Queue) a7202329723792933819.g.get(), 4, 5, message);
            }
        }
        d16890448397538465578.c(i10210771329789820200.a());
    }

    public final void d(I10210771329789820200 i10210771329789820200) {
        if (this.m) {
            return;
        }
        String message = i10210771329789820200 == null ? null : i10210771329789820200.getMessage();
        boolean z = this.n;
        A7202329723792933819 a7202329723792933819 = this.f;
        if (z) {
            a7202329723792933819.a((Queue) a7202329723792933819.i.get(), 10, 11, message);
        } else {
            a7202329723792933819.a((Queue) a7202329723792933819.h.get(), 6, 7, message);
        }
    }
}
