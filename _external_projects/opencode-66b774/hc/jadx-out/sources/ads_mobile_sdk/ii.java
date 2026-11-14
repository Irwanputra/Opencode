package ads_mobile_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import dev.epro.r0.A6650193808056408155;
import dev.epro.r0.D15596191924284547207;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.H7219028874700587498;
import dev.epro.r0.K3711868874634114208;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O14838623545224379975;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P7827270438547540384;
import dev.epro.r0.Q6344330807969154194;
import dev.epro.r0.R122968600551594484;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.S14461012662136963693;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.X2485016533998461232;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ii implements P7827270438547540384, K3711868874634114208 {
    public static ii c;
    public Object a;
    public Object b;

    public ii(Context context) {
        this.a = context.getPackageName();
        this.b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public void a(String str, Object obj) throws IOException {
        boolean zCommit;
        SharedPreferences sharedPreferences = (SharedPreferences) this.b;
        if (obj instanceof String) {
            zCommit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            zCommit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                obj.getClass().toString();
                StringBuilder sbG = X2485016533998461232.g("Failed to store ", str, " for app ");
                sbG.append((String) this.a);
                throw new IOException(sbG.toString());
            }
            zCommit = sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (zCommit) {
            return;
        }
        StringBuilder sbG2 = X2485016533998461232.g("Failed to store ", str, " for app ");
        sbG2.append((String) this.a);
        throw new IOException(sbG2.toString());
    }

    @Override // dev.epro.r0.K3711868874634114208
    public Object b(R4833348786910499294 r4833348786910499294) {
        if (!((AtomicBoolean) this.b).getAndSet(true)) {
            ql1 ql1Var = ((xj) this.a).a;
            ql1Var.c = ql1Var.b.decrementAndGet();
        }
        return O9245300239821758723.a;
    }

    public Object getValue(Object obj, D15596191924284547207 d15596191924284547207) {
        Object obj2;
        obj.getClass();
        d15596191924284547207.getClass();
        synchronized (this) {
            obj2 = this.b;
        }
        return obj2;
    }

    @Override // dev.epro.r0.P7827270438547540384
    public void onComplete(S14461012662136963693 s14461012662136963693) {
        if (s14461012662136963693.d()) {
            R122968600551594484 r122968600551594484 = (R122968600551594484) s14461012662136963693.c();
            E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
            ((ji) this.a).c.getClass();
            ((H7219028874700587498) this.b).resumeWith(new xu0(new uq(r122968600551594484, M9216324016624295870.a0(SystemClock.elapsedRealtime(), N13798149404328803870.MILLISECONDS))));
            return;
        }
        if (s14461012662136963693.d) {
            ((ji) this.a).b.a("AppSet Id task was cancelled", (Throwable) new CancellationException("AppSet Id task was cancelled"));
            ((H7219028874700587498) this.b).resumeWith(new tu0("Gms Task for getting AppSetId was cancelled", 1));
            return;
        }
        Exception excB = s14461012662136963693.b();
        if (excB == null) {
            excB = new Exception("AppSet Id task wasn't successful or cancelled, but had no exception.");
        }
        ((ji) this.a).b.a("Task failed while getting AppSet Id", (Throwable) excB);
        ((H7219028874700587498) this.b).resumeWith(new qu0(excB, 0, null, 6));
    }

    public void setValue(Object obj, D15596191924284547207 d15596191924284547207, Object obj2) {
        obj.getClass();
        d15596191924284547207.getClass();
        synchronized (this) {
            this.b = obj2;
            F4096073349764486348 f4096073349764486348 = (F4096073349764486348) this.a;
            if (f4096073349764486348 != null) {
                f4096073349764486348.invoke(obj2);
            }
        }
    }

    public /* synthetic */ ii(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public ii(WebView webView, A6650193808056408155 a6650193808056408155) {
        if (webView != null) {
            this.a = webView;
            this.b = a6650193808056408155;
        } else {
            S10973172697741180971.j("WebView is null");
            throw null;
        }
    }

    public ii(int i, int i2) {
        this.a = O14838623545224379975.j(i);
        this.b = O14838623545224379975.j(i2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m5a() {
        WebView webView = (WebView) this.a;
        A6650193808056408155 a6650193808056408155 = (A6650193808056408155) this.b;
        try {
            if (!Q6344330807969154194.b(WebViewFeature.WEB_MESSAGE_LISTENER)) {
                a6650193808056408155.b();
                return;
            }
            try {
                WebViewCompat.removeWebMessageListener(webView, a6650193808056408155.a());
                WebViewCompat.addWebMessageListener(webView, a6650193808056408155.a(), new HashSet(Arrays.asList("*")), new c7((Object) this, (byte) 23));
            } catch (Exception unused) {
                a6650193808056408155.b();
            }
        } catch (NoClassDefFoundError unused2) {
            a6650193808056408155.b();
        }
    }

    public void a(V2597580950516131749 v2597580950516131749) {
        ((List) this.a).add(v2597580950516131749);
    }

    public r33 a() {
        return new r33((List) this.a, (List) this.b);
    }

    public static ii a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                return new ii(str, str2);
            }
            S10973172697741180971.j("Version is null or empty");
            return null;
        }
        S10973172697741180971.j("Name is null or empty");
        return null;
    }

    public void a(String str) throws IOException {
        if (((SharedPreferences) this.b).edit().remove(str).commit()) {
            return;
        }
        StringBuilder sbG = X2485016533998461232.g("Failed to remove ", str, " for app ");
        sbG.append((String) this.a);
        throw new IOException(sbG.toString());
    }
}
