package dev.epro.r0;

import android.app.Activity;
import android.content.Context;
import android.os.IInterface;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U3594978070141619353 implements Runnable {
    public final /* synthetic */ byte a;
    public final Object b;

    public U3594978070141619353(R6049685344928759060 r6049685344928759060, T17032536773975598836 t17032536773975598836) {
        this.a = (byte) 15;
        this.b = t17032536773975598836;
    }

    private final void a() {
        synchronized (((I6845661640435175914) this.b).c) {
            ((I6845661640435175914) ((I6845661640435175914) this.b).d).a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int actionMasked;
        int i;
        Object obj;
        T6475866889761571877 b;
        T1878852318042345820 t1878852318042345820;
        byte b2 = 2;
        byte b3 = 1;
        int i2 = 0;
        switch (this.a) {
            case 0:
                S7974369370986781936 s7974369370986781936 = (S7974369370986781936) this.b;
                s7974369370986781936.removeCallbacks(this);
                MotionEvent motionEvent = s7974369370986781936.n0;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                if (actionMasked != 7) {
                    if (actionMasked == 8) {
                        i = 9;
                    } else if (actionMasked != 9) {
                        i = 2;
                    }
                    s7974369370986781936.M(motionEvent, i, s7974369370986781936.o0, false);
                    return;
                }
                i = 7;
                s7974369370986781936.M(motionEvent, i, s7974369370986781936.o0, false);
                return;
            case 1:
                V17114972836633323622 v17114972836633323622 = (V17114972836633323622) this.b;
                S9684361936304835821 s9684361936304835821 = v17114972836633323622.c;
                K2139607335583824538 k2139607335583824538 = v17114972836633323622.a;
                if (v17114972836633323622.n) {
                    if (v17114972836633323622.l) {
                        v17114972836633323622.l = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        k2139607335583824538.e = currentAnimationTimeMillis;
                        k2139607335583824538.g = -1L;
                        k2139607335583824538.f = currentAnimationTimeMillis;
                        k2139607335583824538.h = 0.5f;
                    }
                    if ((k2139607335583824538.g > 0 && AnimationUtils.currentAnimationTimeMillis() > k2139607335583824538.g + k2139607335583824538.i) || !v17114972836633323622.e()) {
                        v17114972836633323622.n = false;
                        return;
                    }
                    if (v17114972836633323622.m) {
                        v17114972836633323622.m = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        s9684361936304835821.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (k2139607335583824538.f == 0) {
                        K2042933864045806308.i("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = k2139607335583824538.a(currentAnimationTimeMillis2);
                    long j = currentAnimationTimeMillis2 - k2139607335583824538.f;
                    k2139607335583824538.f = currentAnimationTimeMillis2;
                    v17114972836633323622.p.scrollListBy((int) (j * ((a * 4.0f) + ((-4.0f) * a * a)) * k2139607335583824538.d));
                    WeakHashMap weakHashMap = W10240872260424387225.a;
                    s9684361936304835821.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((H12843822278061842084) this.b).b;
                int i3 = bottomSheetBehavior.A;
                if (i3 != 2 || i3 == 0) {
                    return;
                }
                bottomSheetBehavior.A = 0;
                return;
            case 3:
                U12005525216752176281 u12005525216752176281 = (U12005525216752176281) this.b;
                u12005525216752176281.T.onDismiss(u12005525216752176281.b0);
                return;
            case 4:
                S9684361936304835821 s96843619363048358212 = (S9684361936304835821) this.b;
                s96843619363048358212.l = null;
                s96843619363048358212.drawableStateChanged();
                return;
            case 5:
                ((P14575954172000745949) this.b).x(true);
                return;
            case 6:
                Z11821137052809198413 z11821137052809198413 = (Z11821137052809198413) this.b;
                z11821137052809198413.m = z11821137052809198413.p;
                z11821137052809198413.p = null;
                z11821137052809198413.c(new S8612901348883321174(z11821137052809198413, new U1304231070282229830(z11821137052809198413, b3), b2), "fireOpenConnection");
                return;
            case 7:
                synchronized (((I1378617920849948703) this.b).a) {
                    obj = ((I1378617920849948703) this.b).f;
                    ((I1378617920849948703) this.b).f = I1378617920849948703.k;
                }
                ((I1378617920849948703) this.b).e(obj);
                return;
            case 8:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.b;
                if (searchView$SearchAutoComplete.f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f = false;
                    return;
                }
                return;
            case 9:
                M10634075818626712574 m10634075818626712574 = (M10634075818626712574) this.b;
                synchronized (m10634075818626712574) {
                    m10634075818626712574.f++;
                    b = m10634075818626712574.b();
                }
                if (b == null) {
                    return;
                }
                Thread currentThread = Thread.currentThread();
                String name = currentThread.getName();
                do {
                    T6475866889761571877 t6475866889761571877 = b;
                    try {
                        currentThread.setName(t6475866889761571877.a);
                        t6475866889761571877.c.getClass();
                        Level level = Level.FINE;
                        long a2 = t6475866889761571877.a();
                        M10634075818626712574 m106340758186267125742 = (M10634075818626712574) this.b;
                        synchronized (m106340758186267125742) {
                            m106340758186267125742.a(t6475866889761571877, a2, true);
                            b = m106340758186267125742.b();
                        }
                    } catch (Throwable th) {
                        try {
                            M10634075818626712574 m106340758186267125743 = (M10634075818626712574) this.b;
                            synchronized (m106340758186267125743) {
                                m106340758186267125743.a(t6475866889761571877, -1L, false);
                                if (!(th instanceof InterruptedException)) {
                                    throw th;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th2) {
                            currentThread.setName(name);
                            throw th2;
                        }
                    }
                } while (b != null);
                currentThread.setName(name);
                return;
            case 10:
                ActionMenuView actionMenuView = ((Toolbar) this.b).a;
                if (actionMenuView == null || (t1878852318042345820 = actionMenuView.t) == null) {
                    return;
                }
                t1878852318042345820.l();
                return;
            case 11:
                T1177712003054613961 t1177712003054613961 = (T1177712003054613961) this.b;
                try {
                    t1177712003054613961.i();
                    throw null;
                } catch (IOException e) {
                    L4980660535418402690 l4980660535418402690 = T1177712003054613961.p;
                    t1177712003054613961.b(e, false);
                    Vector vector = t1177712003054613961.j;
                    M18133917112013001009 m18133917112013001009 = t1177712003054613961.i;
                    if (m18133917112013001009 != null) {
                        try {
                            m18133917112013001009.b(e);
                        } catch (IOException unused) {
                        }
                    }
                    while (i2 < vector.size()) {
                        try {
                            ((M11333858610097094041) vector.elementAt(i2)).a.b(e);
                        } catch (Exception unused2) {
                        }
                        i2++;
                    }
                    return;
                }
            case 12:
                ((Z102412548944701279) this.b).e();
                return;
            case 13:
                N2113054325721141872 n2113054325721141872 = ((Z102412548944701279) ((M204440408817344908) this.b).b).b;
                n2113054325721141872.disconnect(n2113054325721141872.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 14:
                ((Z7373362977535421473) this.b).p.a(new B6867906687934285025(4, null, null));
                return;
            case 15:
                throw null;
            case 16:
                I1632105416032993715 i1632105416032993715 = (I1632105416032993715) this.b;
                Activity activity = (Activity) i1632105416032993715.b;
                View view = (View) i1632105416032993715.d;
                if (view == null) {
                    return;
                }
                if (activity.isInPictureInPictureMode()) {
                    View view2 = (View) i1632105416032993715.d;
                    if (view2 == null) {
                        return;
                    }
                    ((Activity) i1632105416032993715.b).runOnUiThread(new I3863025946240164840(i1632105416032993715, view2, (byte) 20));
                    return;
                }
                try {
                    WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = Math.min(activity.getResources().getDimensionPixelSize(R.dimen.sdk_hsdp_loading_ui_height), (int) (T13998044911588922055.p(activity) * 0.6f));
                        if (activity.getResources().getConfiguration().screenWidthDp > 640) {
                            layoutParams.width = T13998044911588922055.o(activity, 640);
                        } else {
                            layoutParams.width = -1;
                        }
                        ((WindowManager) i1632105416032993715.c).updateViewLayout(view, layoutParams);
                        return;
                    }
                    return;
                } catch (RuntimeException unused3) {
                    return;
                }
            case 17:
                ((X17123927029532314696) this.b).c(new I10210771329789820200(4, "Web view timed out."));
                return;
            case 18:
                P17112279574965248524 p17112279574965248524 = (P17112279574965248524) ((P16318072974459194610) this.b).b;
                IInterface iInterface = (IInterface) p17112279574965248524.j;
                if (iInterface != null) {
                    iInterface.asBinder().unlinkToDeath((D1811628803814760955) p17112279574965248524.h, 0);
                    p17112279574965248524.j = null;
                    p17112279574965248524.b();
                }
                p17112279574965248524.a = false;
                return;
            case 19:
                ((G15068739404623149094) this.b).a();
                return;
            case 20:
                A7202329723792933819 a7202329723792933819 = (A7202329723792933819) this.b;
                AtomicReference atomicReference = a7202329723792933819.k;
                String str = (String) a7202329723792933819.a.get();
                if (str == null) {
                    return;
                }
                int size = ((Queue) atomicReference.get()).size();
                while (i2 < size) {
                    R11149085407531885860 r11149085407531885860 = (R11149085407531885860) ((Queue) atomicReference.get()).poll();
                    if (r11149085407531885860 != null) {
                        try {
                            HttpURLConnection httpURLConnection = (HttpURLConnection) new URI(str).toURL().openConnection();
                            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(a7202329723792933819.b));
                            httpURLConnection.setConnectTimeout(10000);
                            httpURLConnection.setReadTimeout(30000);
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setRequestMethod("POST");
                            httpURLConnection.setRequestProperty("Content-Type", "application/protobuf");
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            int c = r11149085407531885860.c();
                            Logger logger = M15366967277392692994.j;
                            if (c > 4096) {
                                c = 4096;
                            }
                            M15366967277392692994 m15366967277392692994 = new M15366967277392692994(c, outputStream);
                            r11149085407531885860.a(m15366967277392692994);
                            if (m15366967277392692994.h > 0) {
                                m15366967277392692994.J();
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            if (responseCode != 200 && responseCode != 204) {
                                if (httpURLConnection.getErrorStream() != null) {
                                    new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next();
                                }
                                ((Queue) atomicReference.get()).add(r11149085407531885860);
                            }
                        } catch (IOException e2) {
                            "Fail to ping metrics reporting URL: ".concat(String.valueOf(e2.getMessage()));
                            ((Queue) atomicReference.get()).add(r11149085407531885860);
                        } catch (URISyntaxException e3) {
                            e3.getMessage();
                        }
                    }
                    i2++;
                }
                return;
            case 21:
                a();
                return;
            case 22:
                Context context = (Context) ((W12609257429008829531) this.b).b;
                long j2 = W12609257429008829531.b(context).getLong("app_set_id_last_used_time", -1L);
                long j3 = j2 != -1 ? j2 + 33696000000L : -1L;
                if (j3 == -1 || System.currentTimeMillis() <= j3) {
                    return;
                }
                if (!W12609257429008829531.b(context).edit().remove("app_set_id").commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    if (valueOf.length() != 0) {
                        "Failed to clear app set ID generated for App ".concat(valueOf);
                    }
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String valueOf2 = String.valueOf(context.getPackageName());
                if (valueOf2.length() != 0) {
                    "Failed to clear app set ID last used time for App ".concat(valueOf2);
                    return;
                }
                return;
            case 23:
                ((O16666702949169506062) this.b).b();
                return;
            default:
                Iterator it = ((R2847330884077978889) this.b).c.values().iterator();
                while (it.hasNext()) {
                    ((S9286526287894964911) it.next()).a(4);
                    it.remove();
                }
                return;
        }
    }

    public /* synthetic */ U3594978070141619353(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
