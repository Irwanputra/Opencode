package androidx.webkit;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import dev.epro.r0.B5488833628674465193;
import dev.epro.r0.C9778412775309886225;
import dev.epro.r0.D11233951040630298423;
import dev.epro.r0.D14855838667584681226;
import dev.epro.r0.D5229586195471132766;
import dev.epro.r0.E138661690457992157;
import dev.epro.r0.F8386944463392899325;
import dev.epro.r0.G17481180015085314196;
import dev.epro.r0.I7493096322950559070;
import dev.epro.r0.J15503348699114933825;
import dev.epro.r0.J15525459402216671908;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.L13204042424726572761;
import dev.epro.r0.L455553177668166676;
import dev.epro.r0.L5815873079508621496;
import dev.epro.r0.M10846389789027735899;
import dev.epro.r0.M204440408817344908;
import dev.epro.r0.M8343230242072415229;
import dev.epro.r0.M9197813449740923653;
import dev.epro.r0.O11523571296633534285;
import dev.epro.r0.O14070163759106485193;
import dev.epro.r0.P14171055790411190215;
import dev.epro.r0.P15074860773939817654;
import dev.epro.r0.P6965373180190123089;
import dev.epro.r0.Q11088980322693754445;
import dev.epro.r0.Q4876319591349642912;
import dev.epro.r0.Q6344330807969154194;
import dev.epro.r0.S5971084437471961660;
import dev.epro.r0.U15597528598182133107;
import dev.epro.r0.Y6045160740911807311;
import dev.epro.r0.Y6459367219375642744;
import dev.epro.r0.Z12604781490060456085;
import dev.epro.r0.Z3383101362411723454;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class WebViewCompat {
    public static final Uri a = Uri.parse("*");
    public static final Uri b = Uri.parse("");
    public static final WeakHashMap c = new WeakHashMap();

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public interface WebViewStartUpCallback {
        void onSuccess(WebViewStartUpResult webViewStartUpResult);
    }

    public static void a(WebView webView) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
                return;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                Q11088980322693754445.k(e);
                return;
            }
        }
        Looper webViewLooper = webView.getWebViewLooper();
        if (webViewLooper == Looper.myLooper()) {
            return;
        }
        StringBuilder sb = new StringBuilder("A WebView method was called on thread '");
        sb.append(Thread.currentThread().getName());
        sb.append("'. All WebView methods must be called on the same thread. (Expected Looper ");
        sb.append(webViewLooper);
        sb.append(" called on ");
        sb.append(Looper.myLooper());
        Looper mainLooper = Looper.getMainLooper();
        sb.append(", FYI main Looper is ");
        sb.append(mainLooper);
        sb.append(")");
        throw new RuntimeException(sb.toString());
    }

    public static F8386944463392899325 addDocumentStartJavaScript(WebView webView, String str, Set<String> set) {
        if (!Q6344330807969154194.m.b()) {
            throw Q6344330807969154194.a();
        }
        S5971084437471961660 s5971084437471961660C = c(webView);
        return new M9197813449740923653(K5751602218013079365.w(ScriptHandlerBoundaryInterface.class, s5971084437471961660C.a.addDocumentStartJavaScript(str, (String[]) set.toArray(new String[0]))), (byte) 3);
    }

    public static void addNavigationListener(WebView webView, Executor executor, D11233951040630298423 d11233951040630298423) {
        if (!Q6344330807969154194.y.b()) {
            throw Q6344330807969154194.a();
        }
        S5971084437471961660 s5971084437471961660C = c(webView);
        s5971084437471961660C.a.addWebViewNavigationListener(executor, new J15503348699114933825(new O11523571296633534285()));
    }

    public static void addWebMessageListener(WebView webView, String str, Set<String> set, P14171055790411190215 p14171055790411190215) {
        if (!Q6344330807969154194.l.b()) {
            throw Q6344330807969154194.a();
        }
        S5971084437471961660 s5971084437471961660C = c(webView);
        s5971084437471961660C.a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new J15503348699114933825(new M204440408817344908(p14171055790411190215, (byte) 4)));
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static S5971084437471961660 c(WebView webView) {
        if (!Q6344330807969154194.z.b()) {
            return new S5971084437471961660(G17481180015085314196.a.createWebView(webView));
        }
        WeakHashMap weakHashMap = c;
        S5971084437471961660 s5971084437471961660 = (S5971084437471961660) weakHashMap.get(webView);
        if (s5971084437471961660 != null) {
            return s5971084437471961660;
        }
        S5971084437471961660 s59710844374719616602 = new S5971084437471961660(G17481180015085314196.a.createWebView(webView));
        weakHashMap.put(webView, s59710844374719616602);
        return s59710844374719616602;
    }

    public static U15597528598182133107[] createWebMessageChannel(WebView webView) {
        WebMessagePort[] webMessagePortArrCreateWebMessageChannel = webView.createWebMessageChannel();
        if (webMessagePortArrCreateWebMessageChannel == null) {
            return null;
        }
        U15597528598182133107[] u15597528598182133107Arr = new U15597528598182133107[webMessagePortArrCreateWebMessageChannel.length];
        for (int i = 0; i < webMessagePortArrCreateWebMessageChannel.length; i++) {
            WebMessagePort webMessagePort = webMessagePortArrCreateWebMessageChannel[i];
            L455553177668166676 l455553177668166676 = new L455553177668166676();
            l455553177668166676.a = webMessagePort;
            u15597528598182133107Arr[i] = l455553177668166676;
        }
        return u15597528598182133107Arr;
    }

    public static PackageInfo getCurrentLoadedWebViewPackage() {
        if (Build.VERSION.SDK_INT >= 26) {
            return WebView.getCurrentWebViewPackage();
        }
        try {
            return b();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static PackageInfo getCurrentWebViewPackage(Context context) {
        PackageInfo currentLoadedWebViewPackage = getCurrentLoadedWebViewPackage();
        if (currentLoadedWebViewPackage != null) {
            return currentLoadedWebViewPackage;
        }
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str != null) {
                return context.getPackageManager().getPackageInfo(str, 0);
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return null;
    }

    public static Profile getProfile(WebView webView) {
        if (Q6344330807969154194.f456o.b()) {
            return new Z12604781490060456085((ProfileBoundaryInterface) K5751602218013079365.w(ProfileBoundaryInterface.class, c(webView).a.getProfile()));
        }
        throw Q6344330807969154194.a();
    }

    public static Uri getSafeBrowsingPrivacyPolicyUrl() {
        B5488833628674465193 b5488833628674465193 = Q6344330807969154194.d;
        if (b5488833628674465193.a()) {
            return WebView.getSafeBrowsingPrivacyPolicyUrl();
        }
        if (b5488833628674465193.b()) {
            return G17481180015085314196.a.getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw Q6344330807969154194.a();
    }

    public static String getVariationsHeader() {
        if (Q6344330807969154194.n.b()) {
            return G17481180015085314196.a.getStatics().getVariationsHeader();
        }
        throw Q6344330807969154194.a();
    }

    public static WebChromeClient getWebChromeClient(WebView webView) {
        B5488833628674465193 b5488833628674465193 = Q6344330807969154194.h;
        if (b5488833628674465193.a()) {
            return webView.getWebChromeClient();
        }
        if (!b5488833628674465193.b()) {
            throw Q6344330807969154194.a();
        }
        a(webView);
        return c(webView).a.getWebChromeClient();
    }

    @Deprecated
    public static Q4876319591349642912 getWebNavigationClient(WebView webView) {
        if (!Q6344330807969154194.x.b()) {
            throw Q6344330807969154194.a();
        }
        InvocationHandler webViewNavigationClient = c(webView).a.getWebViewNavigationClient();
        if (webViewNavigationClient == null) {
            return null;
        }
        return null;
    }

    public static WebViewClient getWebViewClient(WebView webView) {
        B5488833628674465193 b5488833628674465193 = Q6344330807969154194.g;
        if (b5488833628674465193.a()) {
            return webView.getWebViewClient();
        }
        if (!b5488833628674465193.b()) {
            throw Q6344330807969154194.a();
        }
        a(webView);
        return c(webView).a.getWebViewClient();
    }

    public static P6965373180190123089 getWebViewRenderProcess(WebView webView) {
        B5488833628674465193 b5488833628674465193 = Q6344330807969154194.i;
        if (b5488833628674465193.a()) {
            WebViewRenderProcess webViewRenderProcess = webView.getWebViewRenderProcess();
            if (webViewRenderProcess != null) {
                return Y6459367219375642744.a(webViewRenderProcess);
            }
            return null;
        }
        if (!b5488833628674465193.b()) {
            throw Q6344330807969154194.a();
        }
        a(webView);
        return Y6459367219375642744.b(c(webView).a.getWebViewRenderer());
    }

    public static I7493096322950559070 getWebViewRenderProcessClient(WebView webView) {
        B5488833628674465193 b5488833628674465193 = Q6344330807969154194.j;
        if (b5488833628674465193.a()) {
            webView.getWebViewRenderProcessClient();
        } else {
            if (!b5488833628674465193.b()) {
                throw Q6344330807969154194.a();
            }
            a(webView);
            InvocationHandler webViewRendererClient = c(webView).a.getWebViewRendererClient();
            if (webViewRendererClient != null) {
                Z3383101362411723454.s();
                return null;
            }
        }
        return null;
    }

    public static boolean isAudioMuted(WebView webView) {
        if (Q6344330807969154194.p.b()) {
            return c(webView).a.isAudioMuted();
        }
        throw Q6344330807969154194.a();
    }

    public static boolean isMultiProcessEnabled() {
        if (Q6344330807969154194.k.b()) {
            return G17481180015085314196.a.getStatics().isMultiProcessEnabled();
        }
        throw Q6344330807969154194.a();
    }

    public static void postVisualStateCallback(WebView webView, long j, M8343230242072415229 m8343230242072415229) {
        webView.postVisualStateCallback(j, new P15074860773939817654());
    }

    public static void postWebMessage(WebView webView, D5229586195471132766 d5229586195471132766, Uri uri) {
        boolean z;
        if (a.equals(uri)) {
            uri = b;
        }
        B5488833628674465193 b5488833628674465193 = Q6344330807969154194.f;
        if (d5229586195471132766.d) {
            if (!b5488833628674465193.b() || ((z = d5229586195471132766.d) && !(z && Q6344330807969154194.e.b()))) {
                throw Q6344330807969154194.a();
            }
            a(webView);
            c(webView).a.postMessageToMainFrame(new J15503348699114933825(new C9778412775309886225(d5229586195471132766)), uri);
            return;
        }
        d5229586195471132766.a(0);
        String str = d5229586195471132766.b;
        U15597528598182133107[] u15597528598182133107Arr = d5229586195471132766.a;
        int length = u15597528598182133107Arr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i = 0; i < length; i++) {
            L455553177668166676 l455553177668166676 = (L455553177668166676) u15597528598182133107Arr[i];
            WebMessagePort webMessagePort = l455553177668166676.a;
            if (webMessagePort == null) {
                webMessagePort = (WebMessagePort) ((WebkitToCompatConverterBoundaryInterface) D14855838667584681226.a.b).convertWebMessagePort(Proxy.getInvocationHandler(l455553177668166676.b));
                l455553177668166676.a = webMessagePort;
            }
            webMessagePortArr[i] = webMessagePort;
        }
        webView.postWebMessage(new WebMessage(str, webMessagePortArr), uri);
    }

    public static void prerenderUrlAsync(WebView webView, String str, CancellationSignal cancellationSignal, Executor executor, L5815873079508621496 l5815873079508621496, J15525459402216671908 j15525459402216671908) {
        if (!Q6344330807969154194.u.b()) {
            throw Q6344330807969154194.a();
        }
        S5971084437471961660 s5971084437471961660C = c(webView);
        s5971084437471961660C.a.prerenderUrl(str, cancellationSignal, executor, new J15503348699114933825(new M10846389789027735899((byte) 29)), new Y6045160740911807311(j15525459402216671908, (byte) 0), new Y6045160740911807311(j15525459402216671908, (byte) 1));
    }

    public static void removeNavigationListener(WebView webView, D11233951040630298423 d11233951040630298423) {
        if (!Q6344330807969154194.y.b()) {
            throw Q6344330807969154194.a();
        }
        S5971084437471961660 s5971084437471961660C = c(webView);
        s5971084437471961660C.a.removeWebViewNavigationListener(new J15503348699114933825(new O11523571296633534285()));
    }

    public static void removeWebMessageListener(WebView webView, String str) {
        if (!Q6344330807969154194.l.b()) {
            throw Q6344330807969154194.a();
        }
        c(webView).a.removeWebMessageListener(str);
    }

    public static void saveState(WebView webView, Bundle bundle, int i, boolean z) {
        if (!Q6344330807969154194.w.b()) {
            throw Q6344330807969154194.a();
        }
        c(webView).a.saveState(bundle, i, z);
    }

    public static void setAudioMuted(WebView webView, boolean z) {
        if (!Q6344330807969154194.p.b()) {
            throw Q6344330807969154194.a();
        }
        c(webView).a.setAudioMuted(z);
    }

    public static void setDefaultTrafficStatsTag(int i) {
        if (!Q6344330807969154194.t.b()) {
            throw Q6344330807969154194.a();
        }
        G17481180015085314196.a.getStatics().setDefaultTrafficStatsTag(i);
    }

    public static void setProfile(WebView webView, String str) {
        if (!Q6344330807969154194.f456o.b()) {
            throw Q6344330807969154194.a();
        }
        c(webView).a.setProfile(str);
    }

    public static void setSafeBrowsingAllowlist(Set<String> set, ValueCallback<Boolean> valueCallback) {
        B5488833628674465193 b5488833628674465193 = Q6344330807969154194.c;
        B5488833628674465193 b54888336286744651932 = Q6344330807969154194.b;
        if (b5488833628674465193.b()) {
            G17481180015085314196.a.getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        if (b54888336286744651932.a()) {
            WebView.setSafeBrowsingWhitelist(arrayList, valueCallback);
        } else {
            if (!b54888336286744651932.b()) {
                throw Q6344330807969154194.a();
            }
            G17481180015085314196.a.getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        }
    }

    @Deprecated
    public static void setSafeBrowsingWhitelist(List<String> list, ValueCallback<Boolean> valueCallback) {
        setSafeBrowsingAllowlist(new HashSet(list), valueCallback);
    }

    @Deprecated
    public static void setWebNavigationClient(WebView webView, Q4876319591349642912 q4876319591349642912) {
        if (!Q6344330807969154194.x.b()) {
            throw Q6344330807969154194.a();
        }
        S5971084437471961660 s5971084437471961660C = c(webView);
        s5971084437471961660C.a.setWebViewNavigationClient(new J15503348699114933825(new L13204042424726572761()));
    }

    public static void setWebViewRenderProcessClient(WebView webView, Executor executor, I7493096322950559070 i7493096322950559070) {
        B5488833628674465193 b5488833628674465193 = Q6344330807969154194.j;
        if (b5488833628674465193.a()) {
            webView.setWebViewRenderProcessClient(executor, null);
        } else {
            if (!b5488833628674465193.b()) {
                throw Q6344330807969154194.a();
            }
            a(webView);
            c(webView).a.setWebViewRendererClient(null);
        }
    }

    @Deprecated
    public static void startSafeBrowsing(Context context, ValueCallback<Boolean> valueCallback) {
        B5488833628674465193 b5488833628674465193 = Q6344330807969154194.a;
        if (b5488833628674465193.a()) {
            WebView.startSafeBrowsing(context, valueCallback);
        } else {
            if (!b5488833628674465193.b()) {
                throw Q6344330807969154194.a();
            }
            G17481180015085314196.a.getStatics().initSafeBrowsing(context, valueCallback);
        }
    }

    public static void startUpWebView(Context context, WebViewStartUpConfig webViewStartUpConfig, WebViewStartUpCallback webViewStartUpCallback) {
        webViewStartUpConfig.getBackgroundExecutor().execute(new E138661690457992157(webViewStartUpConfig, webViewStartUpCallback, context, (byte) 8));
    }

    public static void addNavigationListener(WebView webView, D11233951040630298423 d11233951040630298423) {
        addNavigationListener(webView, new O14070163759106485193(new Handler(Looper.getMainLooper()), (byte) 1), d11233951040630298423);
    }

    public static void setWebViewRenderProcessClient(WebView webView, I7493096322950559070 i7493096322950559070) {
        B5488833628674465193 b5488833628674465193 = Q6344330807969154194.j;
        if (b5488833628674465193.a()) {
            webView.setWebViewRenderProcessClient(null);
        } else {
            if (b5488833628674465193.b()) {
                a(webView);
                c(webView).a.setWebViewRendererClient(null);
                return;
            }
            throw Q6344330807969154194.a();
        }
    }

    public static void prerenderUrlAsync(WebView webView, String str, CancellationSignal cancellationSignal, Executor executor, J15525459402216671908 j15525459402216671908) {
        if (Q6344330807969154194.u.b()) {
            S5971084437471961660 s5971084437471961660C = c(webView);
            s5971084437471961660C.a.prerenderUrl(str, cancellationSignal, executor, new Y6045160740911807311(j15525459402216671908, (byte) 2), new Y6045160740911807311(j15525459402216671908, (byte) 3));
            return;
        }
        throw Q6344330807969154194.a();
    }
}
