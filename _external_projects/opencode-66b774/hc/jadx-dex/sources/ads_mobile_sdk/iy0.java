package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class iy0 extends android.webkit.WebViewClient {
    public final dev.epro.r0.C9731525580007922156 a;
    public final ads_mobile_sdk.tx0 b;
    public final dev.epro.r0.W5797197595347441198 c;
    public final ads_mobile_sdk.rw0 d;
    public final ads_mobile_sdk.k8 e;
    public final ads_mobile_sdk.jr0 f;
    public final ads_mobile_sdk.w81 g;
    public final dev.epro.r0.O12043144740933444288 h;
    public final ads_mobile_sdk.ii i;
    public final java.util.concurrent.atomic.AtomicBoolean j;
    public final java.util.concurrent.atomic.AtomicBoolean k;
    public final java.util.concurrent.atomic.AtomicInteger l;
    public final ads_mobile_sdk.ii m;
    public final ads_mobile_sdk.ii n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ads_mobile_sdk.ii f56o;
    public final ads_mobile_sdk.ii p;
    public ads_mobile_sdk.hr1 q;
    public ads_mobile_sdk.zs3 r;
    public final ads_mobile_sdk.ii s;
    public final java.util.concurrent.atomic.AtomicBoolean t;
    public volatile ads_mobile_sdk.z03 u;
    public static final /* synthetic */ dev.epro.r0.D15596191924284547207[] w = {dev.epro.r0.T1335862270807194835.f("loadedDeferred", "getLoadedDeferred()Lkotlinx/coroutines/CompletableDeferred;", ads_mobile_sdk.iy0.class), dev.epro.r0.T1335862270807194835.f("encounteredError", "getEncounteredError()Lcom/google/android/libraries/ads/mobile/sdk/internal/util/GmaResult$WebError;", ads_mobile_sdk.iy0.class), dev.epro.r0.T1335862270807194835.f("followUrls", "getFollowUrls()Z", ads_mobile_sdk.iy0.class), dev.epro.r0.T1335862270807194835.f("isCrossProcessAdEnabled", "isCrossProcessAdEnabled()Z", ads_mobile_sdk.iy0.class), dev.epro.r0.T1335862270807194835.f("adEventEmitter", "getAdEventEmitter()Lcom/google/android/libraries/ads/mobile/sdk/internal/event/InternalAdEventListener;", ads_mobile_sdk.iy0.class), dev.epro.r0.T1335862270807194835.f("onJavascriptReadyListener", "getOnJavascriptReadyListener()Lcom/google/android/libraries/ads/mobile/sdk/internal/webview/JavascriptReadyListener;", ads_mobile_sdk.iy0.class)};
    public static final dev.epro.r0.Y2677586711477821327 v = new dev.epro.r0.Y2677586711477821327((byte) 14);

    public iy0(dev.epro.r0.C9731525580007922156 c9731525580007922156, ads_mobile_sdk.tx0 tx0Var, dev.epro.r0.W5797197595347441198 w5797197595347441198, ads_mobile_sdk.rw0 rw0Var, ads_mobile_sdk.k8 k8Var, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.w81 w81Var, dev.epro.r0.O12043144740933444288 o12043144740933444288) {
        w5797197595347441198.getClass();
        rw0Var.getClass();
        k8Var.getClass();
        jr0Var.getClass();
        o12043144740933444288.getClass();
        this.a = c9731525580007922156;
        this.b = tx0Var;
        this.c = w5797197595347441198;
        this.d = rw0Var;
        this.e = k8Var;
        this.f = jr0Var;
        this.g = w81Var;
        this.h = o12043144740933444288;
        this.i = new ads_mobile_sdk.ii((java.lang.Object) null, (java.lang.Object) null);
        this.j = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.k = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.l = new java.util.concurrent.atomic.AtomicInteger(0);
        this.m = new ads_mobile_sdk.ii((java.lang.Object) null, (java.lang.Object) null);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.n = new ads_mobile_sdk.ii((java.lang.Object) null, bool);
        this.f56o = new ads_mobile_sdk.ii((java.lang.Object) null, bool);
        this.p = new ads_mobile_sdk.ii((java.lang.Object) null, (java.lang.Object) null);
        this.s = new ads_mobile_sdk.ii((java.lang.Object) null, (java.lang.Object) null);
        this.t = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final void a(android.net.Uri uri) {
        dev.epro.r0.I3826119971291161142 i3826119971291161142 = dev.epro.r0.I3826119971291161142.a;
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(this.e.a(uri, this.b));
        ads_mobile_sdk.z03 z03Var = this.u;
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = null;
        if (z03Var != null && !z03Var.a()) {
            dev.epro.r0.R7033599853981556291.E(this.c, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.vx0(this, uri, r4833348786910499294, (byte) 0), 3);
            return;
        }
        if (this.d.a(intent)) {
            byte b = 2;
            if (!this.t.getAndSet(true)) {
                dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.c;
                dev.epro.r0.I15284427961769500538 i15284427961769500538 = new dev.epro.r0.I15284427961769500538(this, uri, (dev.epro.r0.R4833348786910499294) null, (byte) 7);
                w5797197595347441198.getClass();
                dev.epro.r0.R7033599853981556291.E(w5797197595347441198, i3826119971291161142, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(i15284427961769500538, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
            }
            if (((java.lang.Boolean) this.f56o.getValue(this, w[3])).booleanValue()) {
                dev.epro.r0.W5797197595347441198 w57971975953474411982 = this.c;
                ads_mobile_sdk.ay0 ay0Var = new ads_mobile_sdk.ay0(this, r4833348786910499294, b);
                w57971975953474411982.getClass();
                dev.epro.r0.R7033599853981556291.E(w57971975953474411982, i3826119971291161142, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(ay0Var, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
            }
        }
    }

    public final void d() {
        dev.epro.r0.D15596191924284547207[] d15596191924284547207Arr = w;
        ads_mobile_sdk.zu0 zu0Var = (ads_mobile_sdk.zu0) this.m.getValue(this, d15596191924284547207Arr[1]);
        ads_mobile_sdk.ii iiVar = this.i;
        if (zu0Var != null) {
            dev.epro.r0.H5998176783492007232 h5998176783492007232 = (dev.epro.r0.H5998176783492007232) iiVar.getValue(this, d15596191924284547207Arr[0]);
            if (h5998176783492007232 != null) {
                ((dev.epro.r0.A18119328133183277592) h5998176783492007232).S(zu0Var);
            }
            iiVar.setValue(this, d15596191924284547207Arr[0], null);
            return;
        }
        boolean z = this.b.k.get();
        ads_mobile_sdk.bv0 bv0Var = ads_mobile_sdk.bv0.c;
        if (z) {
            dev.epro.r0.H5998176783492007232 h59981767834920072322 = (dev.epro.r0.H5998176783492007232) iiVar.getValue(this, d15596191924284547207Arr[0]);
            if (h59981767834920072322 != null) {
                ((dev.epro.r0.A18119328133183277592) h59981767834920072322).S(bv0Var);
            }
            iiVar.setValue(this, d15596191924284547207Arr[0], null);
            return;
        }
        if (this.k.get()) {
            dev.epro.r0.H5998176783492007232 h59981767834920072323 = (dev.epro.r0.H5998176783492007232) iiVar.getValue(this, d15596191924284547207Arr[0]);
            if (h59981767834920072323 != null) {
                ((dev.epro.r0.A18119328133183277592) h59981767834920072323).S(bv0Var);
            }
            iiVar.setValue(this, d15596191924284547207Arr[0], null);
            return;
        }
        if (!this.j.get() || this.l.get() > 0) {
            return;
        }
        ads_mobile_sdk.xu0 xu0Var = new ads_mobile_sdk.xu0(dev.epro.r0.O9245300239821758723.a);
        dev.epro.r0.H5998176783492007232 h59981767834920072324 = (dev.epro.r0.H5998176783492007232) iiVar.getValue(this, d15596191924284547207Arr[0]);
        if (h59981767834920072324 != null) {
            ((dev.epro.r0.A18119328133183277592) h59981767834920072324).S(xu0Var);
        }
        iiVar.setValue(this, d15596191924284547207Arr[0], null);
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        webView.getClass();
        str.getClass();
        android.net.Uri uri = android.net.Uri.parse(str);
        v.getClass();
        uri.getClass();
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            dev.epro.r0.J8045362843799184672.s0(new ads_mobile_sdk.vx0(this, uri, null, (byte) 1));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        webView.getClass();
        str.getClass();
        byte b = 1;
        this.j.set(true);
        ads_mobile_sdk.ty1 ty1Var = (ads_mobile_sdk.ty1) this.s.getValue(this, w[5]);
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = null;
        if (ty1Var != null) {
            dev.epro.r0.J8045362843799184672.s0(new ads_mobile_sdk.aq1(ty1Var.a, ty1Var.b, r4833348786910499294, (byte) 3));
        }
        d();
        if (this.b.k.get()) {
            ads_mobile_sdk.ay0 ay0Var = new ads_mobile_sdk.ay0(this, r4833348786910499294, b);
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.c;
            w5797197595347441198.getClass();
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(ay0Var, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        super.onReceivedError(webView, i, str, str2);
        ads_mobile_sdk.zu0 zu0Var = new ads_mobile_sdk.zu0(i, str, str2);
        this.m.setValue(this, w[1], zu0Var);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        webView.getClass();
        renderProcessGoneDetail.getClass();
        boolean zK = dev.epro.r0.M13159286552657112763.k(renderProcessGoneDetail);
        int iA = dev.epro.r0.M13159286552657112763.a(renderProcessGoneDetail);
        ads_mobile_sdk.tx0 tx0Var = this.b;
        android.view.ViewParent parent = tx0Var.getParent();
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(tx0Var);
        }
        ads_mobile_sdk.zi3.a(tx0Var.b, new ads_mobile_sdk.bx0(tx0Var, r4833348786910499294, (byte) 4));
        ads_mobile_sdk.zi3.a(tx0Var.c, new ads_mobile_sdk.bx0(tx0Var, r4833348786910499294, (byte) 5));
        java.lang.String str = "WebView render process gone. Crashed? " + zK + " Priority? " + iA;
        tx0Var.e.a(str, (java.lang.Throwable) new java.lang.Exception(str));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        android.webkit.WebResourceResponse webResourceResponse;
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = null;
        android.net.Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url == null) {
            return null;
        }
        if (!dev.epro.r0.S10823041268949770285.t(url.toString(), "https://googlemobileads.com/warmup")) {
            ads_mobile_sdk.iy0 iy0Var = this;
            android.webkit.WebResourceRequest webResourceRequest2 = webResourceRequest;
            android.net.Uri uri = url;
            dev.epro.r0.R7033599853981556291.E(iy0Var.c, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.cy0(url, webResourceRequest2, iy0Var, r4833348786910499294, (byte) 0), 3);
            ads_mobile_sdk.hr1 hr1Var = iy0Var.q;
            dev.epro.r0.I3826119971291161142 i3826119971291161142 = dev.epro.r0.I3826119971291161142.a;
            if (hr1Var != null) {
                dev.epro.r0.H4546125934900659656 h4546125934900659656 = new dev.epro.r0.H4546125934900659656(hr1Var, iy0Var, webResourceRequest2, (dev.epro.r0.R4833348786910499294) null, (byte) 3);
                iy0Var = iy0Var;
                webResourceRequest2 = webResourceRequest2;
                webResourceResponse = (android.webkit.WebResourceResponse) dev.epro.r0.J8045362843799184672.r0(i3826119971291161142, h4546125934900659656);
            } else {
                webResourceResponse = null;
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
            ads_mobile_sdk.jr0 jr0Var = iy0Var.f;
            jr0Var.getClass();
            return ((java.lang.Boolean) jr0Var.a("gads_analytics_events_via_webview_requests", java.lang.Boolean.FALSE, ads_mobile_sdk.ao.a$11)).booleanValue() ? (android.webkit.WebResourceResponse) dev.epro.r0.J8045362843799184672.r0(i3826119971291161142, new ads_mobile_sdk.cy0(uri, webResourceRequest2, iy0Var, r4833348786910499294, (byte) 1)) : (android.webkit.WebResourceResponse) dev.epro.r0.J8045362843799184672.r0(i3826119971291161142, new dev.epro.r0.S14769385926647291222(uri, webResourceRequest2, iy0Var, (dev.epro.r0.R4833348786910499294) null));
        }
        dev.epro.r0.O2161699089510411363<java.lang.String> o2161699089510411363 = (java.util.List) this.b.z.poll();
        if (o2161699089510411363 == null) {
            o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
        }
        v.getClass();
        if (o2161699089510411363.isEmpty()) {
            return new android.webkit.WebResourceResponse("text/html", "UTF-8", new java.io.ByteArrayInputStream(new byte[0]));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("<!DOCTYPE html><html><head></head><body><p>Warmup page</p>");
        for (java.lang.String str : o2161699089510411363) {
            java.lang.String path = android.net.Uri.parse(str).getPath();
            if (path == null) {
                path = "";
            }
            if (dev.epro.r0.Z13168519540281190457.z(path, ".js", true)) {
                sb.append("<script src=\"" + str + "\"></script>");
            } else if (dev.epro.r0.Z13168519540281190457.z(path, ".css", true)) {
                sb.append("<link rel=\"stylesheet\" href=\"" + str + "\">");
            }
        }
        sb.append("</body></html>");
        java.lang.String string = sb.toString();
        java.nio.charset.Charset charsetForName = java.nio.charset.Charset.forName("UTF-8");
        charsetForName.getClass();
        byte[] bytes = string.getBytes(charsetForName);
        bytes.getClass();
        return new android.webkit.WebResourceResponse("text/html", "UTF-8", new java.io.ByteArrayInputStream(bytes));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        dev.epro.r0.Y2677586711477821327 y2677586711477821327 = v;
        android.net.Uri url = webResourceRequest.getUrl();
        url.getClass();
        y2677586711477821327.getClass();
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = null;
        byte b = 1;
        if ("gmsg".equalsIgnoreCase(url.getScheme()) && "mobileads.google.com".equalsIgnoreCase(url.getHost())) {
            android.net.Uri url2 = webResourceRequest.getUrl();
            url2.getClass();
            dev.epro.r0.J8045362843799184672.s0(new ads_mobile_sdk.vx0(this, url2, r4833348786910499294, b));
            return true;
        }
        if (((java.lang.Boolean) this.n.getValue(this, w[2])).booleanValue()) {
            android.net.Uri url3 = webResourceRequest.getUrl();
            url3.getClass();
            if (dev.epro.r0.Z13168519540281190457.A(url3.getScheme(), "http", true) || dev.epro.r0.Z13168519540281190457.A(url3.getScheme(), "https", true)) {
                ads_mobile_sdk.z03 z03Var = this.u;
                if (z03Var != null && !z03Var.a()) {
                    dev.epro.r0.R7033599853981556291.E(this.c, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.fb((java.lang.Object) this, (java.lang.Object) webResourceRequest, r4833348786910499294, (byte) 9), 3);
                    return true;
                }
                if (!this.t.getAndSet(true)) {
                    ads_mobile_sdk.zi3.a(this.c, (dev.epro.r0.L12639328004344855510) new dev.epro.r0.I15284427961769500538(this, webResourceRequest, (dev.epro.r0.R4833348786910499294) null, (byte) 2));
                }
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
        }
        if (this.b.willNotDraw()) {
            java.util.Objects.toString(webResourceRequest.getUrl());
            return true;
        }
        android.net.Uri url4 = webResourceRequest.getUrl();
        url4.getClass();
        a(url4);
        return true;
    }
}
