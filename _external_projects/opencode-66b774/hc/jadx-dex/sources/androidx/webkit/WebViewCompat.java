package androidx.webkit;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class WebViewCompat {
    public static final android.net.Uri a = android.net.Uri.parse("*");
    public static final android.net.Uri b = android.net.Uri.parse("");
    public static final java.util.WeakHashMap c = new java.util.WeakHashMap();

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public interface WebViewStartUpCallback {
        void onSuccess(androidx.webkit.WebViewStartUpResult webViewStartUpResult);
    }

    public static void a(android.webkit.WebView webView) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            try {
                java.lang.reflect.Method declaredMethod = android.webkit.WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
                return;
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
                dev.epro.r0.Q11088980322693754445.k(e);
                return;
            }
        }
        android.os.Looper looperE = dev.epro.r0.V5057341886547923963.e(webView);
        if (looperE == android.os.Looper.myLooper()) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("A WebView method was called on thread '");
        sb.append(java.lang.Thread.currentThread().getName());
        sb.append("'. All WebView methods must be called on the same thread. (Expected Looper ");
        sb.append(looperE);
        sb.append(" called on ");
        sb.append(android.os.Looper.myLooper());
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        sb.append(", FYI main Looper is ");
        sb.append(mainLooper);
        sb.append(")");
        throw new java.lang.RuntimeException(sb.toString());
    }

    public static dev.epro.r0.F8386944463392899325 addDocumentStartJavaScript(android.webkit.WebView webView, java.lang.String str, java.util.Set<java.lang.String> set) {
        if (!dev.epro.r0.Q6344330807969154194.m.b()) {
            throw dev.epro.r0.Q6344330807969154194.a();
        }
        dev.epro.r0.S5971084437471961660 s5971084437471961660C = c(webView);
        return new dev.epro.r0.M9197813449740923653((org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface) dev.epro.r0.K5751602218013079365.w(org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface.class, s5971084437471961660C.a.addDocumentStartJavaScript(str, (java.lang.String[]) set.toArray(new java.lang.String[0]))), (byte) 3);
    }

    public static void addNavigationListener(android.webkit.WebView webView, java.util.concurrent.Executor executor, dev.epro.r0.D11233951040630298423 d11233951040630298423) {
        if (!dev.epro.r0.Q6344330807969154194.y.b()) {
            throw dev.epro.r0.Q6344330807969154194.a();
        }
        dev.epro.r0.S5971084437471961660 s5971084437471961660C = c(webView);
        s5971084437471961660C.a.addWebViewNavigationListener(executor, new dev.epro.r0.J15503348699114933825(new dev.epro.r0.O11523571296633534285()));
    }

    public static void addWebMessageListener(android.webkit.WebView webView, java.lang.String str, java.util.Set<java.lang.String> set, dev.epro.r0.P14171055790411190215 p14171055790411190215) {
        if (!dev.epro.r0.Q6344330807969154194.l.b()) {
            throw dev.epro.r0.Q6344330807969154194.a();
        }
        dev.epro.r0.S5971084437471961660 s5971084437471961660C = c(webView);
        s5971084437471961660C.a.addWebMessageListener(str, (java.lang.String[]) set.toArray(new java.lang.String[0]), new dev.epro.r0.J15503348699114933825(new dev.epro.r0.M204440408817344908(p14171055790411190215, (byte) 4)));
    }

    public static android.content.pm.PackageInfo b() {
        return (android.content.pm.PackageInfo) java.lang.Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static dev.epro.r0.S5971084437471961660 c(android.webkit.WebView webView) {
        if (!dev.epro.r0.Q6344330807969154194.z.b()) {
            return new dev.epro.r0.S5971084437471961660(dev.epro.r0.G17481180015085314196.a.createWebView(webView));
        }
        java.util.WeakHashMap weakHashMap = c;
        dev.epro.r0.S5971084437471961660 s5971084437471961660 = (dev.epro.r0.S5971084437471961660) weakHashMap.get(webView);
        if (s5971084437471961660 != null) {
            return s5971084437471961660;
        }
        dev.epro.r0.S5971084437471961660 s59710844374719616602 = new dev.epro.r0.S5971084437471961660(dev.epro.r0.G17481180015085314196.a.createWebView(webView));
        weakHashMap.put(webView, s59710844374719616602);
        return s59710844374719616602;
    }

    public static dev.epro.r0.U15597528598182133107[] createWebMessageChannel(android.webkit.WebView webView) {
        android.webkit.WebMessagePort[] webMessagePortArrCreateWebMessageChannel = webView.createWebMessageChannel();
        if (webMessagePortArrCreateWebMessageChannel == null) {
            return null;
        }
        dev.epro.r0.U15597528598182133107[] u15597528598182133107Arr = new dev.epro.r0.U15597528598182133107[webMessagePortArrCreateWebMessageChannel.length];
        for (int i = 0; i < webMessagePortArrCreateWebMessageChannel.length; i++) {
            android.webkit.WebMessagePort webMessagePort = webMessagePortArrCreateWebMessageChannel[i];
            dev.epro.r0.L455553177668166676 l455553177668166676 = new dev.epro.r0.L455553177668166676();
            l455553177668166676.a = webMessagePort;
            u15597528598182133107Arr[i] = l455553177668166676;
        }
        return u15597528598182133107Arr;
    }

    public static android.content.pm.PackageInfo getCurrentLoadedWebViewPackage() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return dev.epro.r0.J16238531192459137453.b();
        }
        try {
            return b();
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    public static android.content.pm.PackageInfo getCurrentWebViewPackage(android.content.Context context) {
        android.content.pm.PackageInfo currentLoadedWebViewPackage = getCurrentLoadedWebViewPackage();
        if (currentLoadedWebViewPackage != null) {
            return currentLoadedWebViewPackage;
        }
        try {
            java.lang.String str = (java.lang.String) java.lang.Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str != null) {
                return context.getPackageManager().getPackageInfo(str, 0);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
        }
        return null;
    }

    public static androidx.webkit.Profile getProfile(android.webkit.WebView webView) {
        if (dev.epro.r0.Q6344330807969154194.o.b()) {
            return new dev.epro.r0.Z12604781490060456085((org.chromium.support_lib_boundary.ProfileBoundaryInterface) dev.epro.r0.K5751602218013079365.w(org.chromium.support_lib_boundary.ProfileBoundaryInterface.class, c(webView).a.getProfile()));
        }
        throw dev.epro.r0.Q6344330807969154194.a();
    }

    public static android.net.Uri getSafeBrowsingPrivacyPolicyUrl() {
        dev.epro.r0.B5488833628674465193 b5488833628674465193 = dev.epro.r0.Q6344330807969154194.d;
        if (b5488833628674465193.a()) {
            return dev.epro.r0.S14644675364543608827.b();
        }
        if (b5488833628674465193.b()) {
            return dev.epro.r0.G17481180015085314196.a.getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw dev.epro.r0.Q6344330807969154194.a();
    }

    public static java.lang.String getVariationsHeader() {
        if (dev.epro.r0.Q6344330807969154194.n.b()) {
            return dev.epro.r0.G17481180015085314196.a.getStatics().getVariationsHeader();
        }
        throw dev.epro.r0.Q6344330807969154194.a();
    }

    public static android.webkit.WebChromeClient getWebChromeClient(android.webkit.WebView webView) {
        dev.epro.r0.B5488833628674465193 b5488833628674465193 = dev.epro.r0.Q6344330807969154194.h;
        if (b5488833628674465193.a()) {
            return dev.epro.r0.J16238531192459137453.j(webView);
        }
        if (!b5488833628674465193.b()) {
            throw dev.epro.r0.Q6344330807969154194.a();
        }
        a(webView);
        return c(webView).a.getWebChromeClient();
    }

    @java.lang.Deprecated
    public static dev.epro.r0.Q4876319591349642912 getWebNavigationClient(android.webkit.WebView webView) {
        if (!dev.epro.r0.Q6344330807969154194.x.b()) {
            throw dev.epro.r0.Q6344330807969154194.a();
        }
        dev.epro.r0.J15503348699114933825 webViewNavigationClient = c(webView).a.getWebViewNavigationClient();
        if (webViewNavigationClient == null) {
            return null;
        }
        return null;
    }

    public static android.webkit.WebViewClient getWebViewClient(android.webkit.WebView webView) {
        dev.epro.r0.B5488833628674465193 b5488833628674465193 = dev.epro.r0.Q6344330807969154194.g;
        if (b5488833628674465193.a()) {
            return dev.epro.r0.M13159286552657112763.d(webView);
        }
        if (!b5488833628674465193.b()) {
            throw dev.epro.r0.Q6344330807969154194.a();
        }
        a(webView);
        return c(webView).a.getWebViewClient();
    }

    public static dev.epro.r0.P6965373180190123089 getWebViewRenderProcess(android.webkit.WebView webView) {
        dev.epro.r0.B5488833628674465193 b5488833628674465193 = dev.epro.r0.Q6344330807969154194.i;
        if (b5488833628674465193.a()) {
            android.webkit.WebViewRenderProcess webViewRenderProcessE = dev.epro.r0.Z609035949372769296.e(webView);
            if (webViewRenderProcessE != null) {
                return dev.epro.r0.Y6459367219375642744.a(webViewRenderProcessE);
            }
            return null;
        }
        if (!b5488833628674465193.b()) {
            throw dev.epro.r0.Q6344330807969154194.a();
        }
        a(webView);
        return dev.epro.r0.Y6459367219375642744.b(c(webView).a.getWebViewRenderer());
    }

    public static dev.epro.r0.I7493096322950559070 getWebViewRenderProcessClient(android.webkit.WebView webView) {
        dev.epro.r0.B5488833628674465193 b5488833628674465193 = dev.epro.r0.Q6344330807969154194.j;
        if (b5488833628674465193.a()) {
            dev.epro.r0.Z609035949372769296.f(webView);
        } else {
            if (!b5488833628674465193.b()) {
                throw dev.epro.r0.Q6344330807969154194.a();
            }
            a(webView);
            if (c(webView).a.getWebViewRendererClient() != null) {
                dev.epro.r0.Z3383101362411723454.s();
                return null;
            }
        }
        return null;
    }

    public static boolean isAudioMuted(android.webkit.WebView webView) {
        if (dev.epro.r0.Q6344330807969154194.p.b()) {
            return c(webView).a.isAudioMuted();
        }
        throw dev.epro.r0.Q6344330807969154194.a();
    }

    public static boolean isMultiProcessEnabled() {
        if (dev.epro.r0.Q6344330807969154194.k.b()) {
            return dev.epro.r0.G17481180015085314196.a.getStatics().isMultiProcessEnabled();
        }
        throw dev.epro.r0.Q6344330807969154194.a();
    }

    public static void postVisualStateCallback(android.webkit.WebView webView, long j, dev.epro.r0.M8343230242072415229 m8343230242072415229) {
        webView.postVisualStateCallback(j, new dev.epro.r0.P15074860773939817654());
    }

    public static void postWebMessage(android.webkit.WebView webView, dev.epro.r0.D5229586195471132766 d5229586195471132766, android.net.Uri uri) {
        boolean z;
        if (a.equals(uri)) {
            uri = b;
        }
        dev.epro.r0.B5488833628674465193 b5488833628674465193 = dev.epro.r0.Q6344330807969154194.f;
        if (d5229586195471132766.d) {
            if (!b5488833628674465193.b() || ((z = d5229586195471132766.d) && !(z && dev.epro.r0.Q6344330807969154194.e.b()))) {
                throw dev.epro.r0.Q6344330807969154194.a();
            }
            a(webView);
            c(webView).a.postMessageToMainFrame(new dev.epro.r0.J15503348699114933825(new dev.epro.r0.C9778412775309886225(d5229586195471132766)), uri);
            return;
        }
        d5229586195471132766.a(0);
        java.lang.String str = d5229586195471132766.b;
        dev.epro.r0.L455553177668166676[] l455553177668166676Arr = d5229586195471132766.a;
        int length = l455553177668166676Arr.length;
        android.webkit.WebMessagePort[] webMessagePortArr = new android.webkit.WebMessagePort[length];
        for (int i = 0; i < length; i++) {
            dev.epro.r0.L455553177668166676 l455553177668166676 = l455553177668166676Arr[i];
            android.webkit.WebMessagePort webMessagePort = l455553177668166676.a;
            if (webMessagePort == null) {
                webMessagePort = (android.webkit.WebMessagePort) ((org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface) dev.epro.r0.D14855838667584681226.a.b).convertWebMessagePort(java.lang.reflect.Proxy.getInvocationHandler(l455553177668166676.b));
                l455553177668166676.a = webMessagePort;
            }
            webMessagePortArr[i] = webMessagePort;
        }
        webView.postWebMessage(new android.webkit.WebMessage(str, webMessagePortArr), uri);
    }

    public static void prerenderUrlAsync(android.webkit.WebView webView, java.lang.String str, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, dev.epro.r0.L5815873079508621496 l5815873079508621496, dev.epro.r0.J15525459402216671908 j15525459402216671908) {
        if (!dev.epro.r0.Q6344330807969154194.u.b()) {
            throw dev.epro.r0.Q6344330807969154194.a();
        }
        dev.epro.r0.S5971084437471961660 s5971084437471961660C = c(webView);
        s5971084437471961660C.a.prerenderUrl(str, cancellationSignal, executor, new dev.epro.r0.J15503348699114933825(new dev.epro.r0.M10846389789027735899((byte) 29)), new dev.epro.r0.Y6045160740911807311(j15525459402216671908, (byte) 0), new dev.epro.r0.Y6045160740911807311(j15525459402216671908, (byte) 1));
    }

    public static void removeNavigationListener(android.webkit.WebView webView, dev.epro.r0.D11233951040630298423 d11233951040630298423) {
        if (!dev.epro.r0.Q6344330807969154194.y.b()) {
            throw dev.epro.r0.Q6344330807969154194.a();
        }
        dev.epro.r0.S5971084437471961660 s5971084437471961660C = c(webView);
        s5971084437471961660C.a.removeWebViewNavigationListener(new dev.epro.r0.J15503348699114933825(new dev.epro.r0.O11523571296633534285()));
    }

    public static void removeWebMessageListener(android.webkit.WebView webView, java.lang.String str) {
        if (!dev.epro.r0.Q6344330807969154194.l.b()) {
            throw dev.epro.r0.Q6344330807969154194.a();
        }
        c(webView).a.removeWebMessageListener(str);
    }

    public static void saveState(android.webkit.WebView webView, android.os.Bundle bundle, int i, boolean z) {
        if (!dev.epro.r0.Q6344330807969154194.w.b()) {
            throw dev.epro.r0.Q6344330807969154194.a();
        }
        c(webView).a.saveState(bundle, i, z);
    }

    public static void setAudioMuted(android.webkit.WebView webView, boolean z) {
        if (!dev.epro.r0.Q6344330807969154194.p.b()) {
            throw dev.epro.r0.Q6344330807969154194.a();
        }
        c(webView).a.setAudioMuted(z);
    }

    public static void setDefaultTrafficStatsTag(int i) {
        if (!dev.epro.r0.Q6344330807969154194.t.b()) {
            throw dev.epro.r0.Q6344330807969154194.a();
        }
        dev.epro.r0.G17481180015085314196.a.getStatics().setDefaultTrafficStatsTag(i);
    }

    public static void setProfile(android.webkit.WebView webView, java.lang.String str) {
        if (!dev.epro.r0.Q6344330807969154194.o.b()) {
            throw dev.epro.r0.Q6344330807969154194.a();
        }
        c(webView).a.setProfile(str);
    }

    public static void setSafeBrowsingAllowlist(java.util.Set<java.lang.String> set, android.webkit.ValueCallback<java.lang.Boolean> valueCallback) {
        dev.epro.r0.B5488833628674465193 b5488833628674465193 = dev.epro.r0.Q6344330807969154194.c;
        dev.epro.r0.B5488833628674465193 b54888336286744651932 = dev.epro.r0.Q6344330807969154194.b;
        if (b5488833628674465193.b()) {
            dev.epro.r0.G17481180015085314196.a.getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(set);
        if (b54888336286744651932.a()) {
            dev.epro.r0.S14644675364543608827.j(arrayList, valueCallback);
        } else {
            if (!b54888336286744651932.b()) {
                throw dev.epro.r0.Q6344330807969154194.a();
            }
            dev.epro.r0.G17481180015085314196.a.getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        }
    }

    @java.lang.Deprecated
    public static void setSafeBrowsingWhitelist(java.util.List<java.lang.String> list, android.webkit.ValueCallback<java.lang.Boolean> valueCallback) {
        setSafeBrowsingAllowlist(new java.util.HashSet(list), valueCallback);
    }

    @java.lang.Deprecated
    public static void setWebNavigationClient(android.webkit.WebView webView, dev.epro.r0.Q4876319591349642912 q4876319591349642912) {
        if (!dev.epro.r0.Q6344330807969154194.x.b()) {
            throw dev.epro.r0.Q6344330807969154194.a();
        }
        dev.epro.r0.S5971084437471961660 s5971084437471961660C = c(webView);
        s5971084437471961660C.a.setWebViewNavigationClient(new dev.epro.r0.J15503348699114933825(new dev.epro.r0.L13204042424726572761()));
    }

    public static void setWebViewRenderProcessClient(android.webkit.WebView webView, java.util.concurrent.Executor executor, dev.epro.r0.I7493096322950559070 i7493096322950559070) {
        dev.epro.r0.B5488833628674465193 b5488833628674465193 = dev.epro.r0.Q6344330807969154194.j;
        if (b5488833628674465193.a()) {
            dev.epro.r0.Z609035949372769296.t(webView, executor);
        } else {
            if (!b5488833628674465193.b()) {
                throw dev.epro.r0.Q6344330807969154194.a();
            }
            a(webView);
            c(webView).a.setWebViewRendererClient((java.lang.reflect.InvocationHandler) null);
        }
    }

    @java.lang.Deprecated
    public static void startSafeBrowsing(android.content.Context context, android.webkit.ValueCallback<java.lang.Boolean> valueCallback) {
        dev.epro.r0.B5488833628674465193 b5488833628674465193 = dev.epro.r0.Q6344330807969154194.a;
        if (b5488833628674465193.a()) {
            dev.epro.r0.S14644675364543608827.f(context, valueCallback);
        } else {
            if (!b5488833628674465193.b()) {
                throw dev.epro.r0.Q6344330807969154194.a();
            }
            dev.epro.r0.G17481180015085314196.a.getStatics().initSafeBrowsing(context, valueCallback);
        }
    }

    public static void startUpWebView(android.content.Context context, androidx.webkit.WebViewStartUpConfig webViewStartUpConfig, androidx.webkit.WebViewCompat.WebViewStartUpCallback webViewStartUpCallback) {
        webViewStartUpConfig.getBackgroundExecutor().execute(new dev.epro.r0.E138661690457992157(webViewStartUpConfig, webViewStartUpCallback, context, (byte) 8));
    }

    public static void addNavigationListener(android.webkit.WebView webView, dev.epro.r0.D11233951040630298423 d11233951040630298423) {
        addNavigationListener(webView, new dev.epro.r0.O14070163759106485193(new android.os.Handler(android.os.Looper.getMainLooper()), (byte) 1), d11233951040630298423);
    }

    public static void setWebViewRenderProcessClient(android.webkit.WebView webView, dev.epro.r0.I7493096322950559070 i7493096322950559070) {
        dev.epro.r0.B5488833628674465193 b5488833628674465193 = dev.epro.r0.Q6344330807969154194.j;
        if (b5488833628674465193.a()) {
            dev.epro.r0.Z609035949372769296.s(webView);
        } else {
            if (b5488833628674465193.b()) {
                a(webView);
                c(webView).a.setWebViewRendererClient((java.lang.reflect.InvocationHandler) null);
                return;
            }
            throw dev.epro.r0.Q6344330807969154194.a();
        }
    }

    public static void prerenderUrlAsync(android.webkit.WebView webView, java.lang.String str, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, dev.epro.r0.J15525459402216671908 j15525459402216671908) {
        if (dev.epro.r0.Q6344330807969154194.u.b()) {
            dev.epro.r0.S5971084437471961660 s5971084437471961660C = c(webView);
            s5971084437471961660C.a.prerenderUrl(str, cancellationSignal, executor, new dev.epro.r0.Y6045160740911807311(j15525459402216671908, (byte) 2), new dev.epro.r0.Y6045160740911807311(j15525459402216671908, (byte) 3));
            return;
        }
        throw dev.epro.r0.Q6344330807969154194.a();
    }
}
