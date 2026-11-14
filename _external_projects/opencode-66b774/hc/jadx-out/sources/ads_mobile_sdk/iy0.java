package ads_mobile_sdk;

import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import dev.epro.r0.A18119328133183277592;
import dev.epro.r0.C9731525580007922156;
import dev.epro.r0.D15596191924284547207;
import dev.epro.r0.H4546125934900659656;
import dev.epro.r0.H5998176783492007232;
import dev.epro.r0.I15284427961769500538;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.J8045362843799184672;
import dev.epro.r0.O12043144740933444288;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.S14769385926647291222;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Y2677586711477821327;
import dev.epro.r0.Z13168519540281190457;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class iy0 extends WebViewClient {
    public final C9731525580007922156 a;
    public final tx0 b;
    public final W5797197595347441198 c;
    public final rw0 d;
    public final k8 e;
    public final jr0 f;
    public final w81 g;
    public final O12043144740933444288 h;
    public final ii i;
    public final AtomicBoolean j;
    public final AtomicBoolean k;
    public final AtomicInteger l;
    public final ii m;
    public final ii n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ii f56o;
    public final ii p;
    public hr1 q;
    public zs3 r;
    public final ii s;
    public final AtomicBoolean t;
    public volatile z03 u;
    public static final /* synthetic */ D15596191924284547207[] w = {T1335862270807194835.f("loadedDeferred", "getLoadedDeferred()Lkotlinx/coroutines/CompletableDeferred;", iy0.class), T1335862270807194835.f("encounteredError", "getEncounteredError()Lcom/google/android/libraries/ads/mobile/sdk/internal/util/GmaResult$WebError;", iy0.class), T1335862270807194835.f("followUrls", "getFollowUrls()Z", iy0.class), T1335862270807194835.f("isCrossProcessAdEnabled", "isCrossProcessAdEnabled()Z", iy0.class), T1335862270807194835.f("adEventEmitter", "getAdEventEmitter()Lcom/google/android/libraries/ads/mobile/sdk/internal/event/InternalAdEventListener;", iy0.class), T1335862270807194835.f("onJavascriptReadyListener", "getOnJavascriptReadyListener()Lcom/google/android/libraries/ads/mobile/sdk/internal/webview/JavascriptReadyListener;", iy0.class)};
    public static final Y2677586711477821327 v = new Y2677586711477821327((byte) 14);

    public iy0(C9731525580007922156 c9731525580007922156, tx0 tx0Var, W5797197595347441198 w5797197595347441198, rw0 rw0Var, k8 k8Var, jr0 jr0Var, w81 w81Var, O12043144740933444288 o12043144740933444288) {
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
        this.i = new ii((Object) null, (Object) null);
        this.j = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
        this.l = new AtomicInteger(0);
        this.m = new ii((Object) null, (Object) null);
        Boolean bool = Boolean.FALSE;
        this.n = new ii((Object) null, bool);
        this.f56o = new ii((Object) null, bool);
        this.p = new ii((Object) null, (Object) null);
        this.s = new ii((Object) null, (Object) null);
        this.t = new AtomicBoolean(false);
    }

    public final void a(Uri uri) {
        I3826119971291161142 i3826119971291161142 = I3826119971291161142.a;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(this.e.a(uri, this.b));
        z03 z03Var = this.u;
        R4833348786910499294 r4833348786910499294 = null;
        if (z03Var != null && !z03Var.a()) {
            R7033599853981556291.E(this.c, null, null, new vx0(this, uri, r4833348786910499294, (byte) 0), 3);
            return;
        }
        if (this.d.a(intent)) {
            byte b = 2;
            if (!this.t.getAndSet(true)) {
                W5797197595347441198 w5797197595347441198 = this.c;
                I15284427961769500538 i15284427961769500538 = new I15284427961769500538(this, uri, r4833348786910499294, (byte) 7);
                w5797197595347441198.getClass();
                R7033599853981556291.E(w5797197595347441198, i3826119971291161142, null, new P7598478828797568949(i15284427961769500538, null, (byte) 1), 2);
            }
            if (((Boolean) this.f56o.getValue(this, w[3])).booleanValue()) {
                W5797197595347441198 w57971975953474411982 = this.c;
                ay0 ay0Var = new ay0(this, r4833348786910499294, b);
                w57971975953474411982.getClass();
                R7033599853981556291.E(w57971975953474411982, i3826119971291161142, null, new P7598478828797568949(ay0Var, null, (byte) 1), 2);
            }
        }
    }

    public final void d() {
        D15596191924284547207[] d15596191924284547207Arr = w;
        zu0 zu0Var = (zu0) this.m.getValue(this, d15596191924284547207Arr[1]);
        ii iiVar = this.i;
        if (zu0Var != null) {
            H5998176783492007232 h5998176783492007232 = (H5998176783492007232) iiVar.getValue(this, d15596191924284547207Arr[0]);
            if (h5998176783492007232 != null) {
                ((A18119328133183277592) h5998176783492007232).S(zu0Var);
            }
            iiVar.setValue(this, d15596191924284547207Arr[0], null);
            return;
        }
        boolean z = this.b.k.get();
        bv0 bv0Var = bv0.c;
        if (z) {
            H5998176783492007232 h59981767834920072322 = (H5998176783492007232) iiVar.getValue(this, d15596191924284547207Arr[0]);
            if (h59981767834920072322 != null) {
                ((A18119328133183277592) h59981767834920072322).S(bv0Var);
            }
            iiVar.setValue(this, d15596191924284547207Arr[0], null);
            return;
        }
        if (this.k.get()) {
            H5998176783492007232 h59981767834920072323 = (H5998176783492007232) iiVar.getValue(this, d15596191924284547207Arr[0]);
            if (h59981767834920072323 != null) {
                ((A18119328133183277592) h59981767834920072323).S(bv0Var);
            }
            iiVar.setValue(this, d15596191924284547207Arr[0], null);
            return;
        }
        if (!this.j.get() || this.l.get() > 0) {
            return;
        }
        xu0 xu0Var = new xu0(O9245300239821758723.a);
        H5998176783492007232 h59981767834920072324 = (H5998176783492007232) iiVar.getValue(this, d15596191924284547207Arr[0]);
        if (h59981767834920072324 != null) {
            ((A18119328133183277592) h59981767834920072324).S(xu0Var);
        }
        iiVar.setValue(this, d15596191924284547207Arr[0], null);
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        Uri uri = Uri.parse(str);
        v.getClass();
        uri.getClass();
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            J8045362843799184672.s0(new vx0(this, uri, null, (byte) 1));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        byte b = 1;
        this.j.set(true);
        ty1 ty1Var = (ty1) this.s.getValue(this, w[5]);
        R4833348786910499294 r4833348786910499294 = null;
        if (ty1Var != null) {
            J8045362843799184672.s0(new aq1(ty1Var.a, ty1Var.b, r4833348786910499294, (byte) 3));
        }
        d();
        if (this.b.k.get()) {
            ay0 ay0Var = new ay0(this, r4833348786910499294, b);
            W5797197595347441198 w5797197595347441198 = this.c;
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(ay0Var, null, (byte) 1), 2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        zu0 zu0Var = new zu0(i, str, str2);
        this.m.setValue(this, w[1], zu0Var);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        webView.getClass();
        renderProcessGoneDetail.getClass();
        boolean zDidCrash = renderProcessGoneDetail.didCrash();
        int iRendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        tx0 tx0Var = this.b;
        ViewParent parent = tx0Var.getParent();
        R4833348786910499294 r4833348786910499294 = null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(tx0Var);
        }
        zi3.a(tx0Var.b, new bx0(tx0Var, r4833348786910499294, (byte) 4));
        zi3.a(tx0Var.c, new bx0(tx0Var, r4833348786910499294, (byte) 5));
        String str = "WebView render process gone. Crashed? " + zDidCrash + " Priority? " + iRendererPriorityAtExit;
        tx0Var.e.a(str, (Throwable) new Exception(str));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponse;
        R4833348786910499294 r4833348786910499294 = null;
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url == null) {
            return null;
        }
        if (!S10823041268949770285.t(url.toString(), "https://googlemobileads.com/warmup")) {
            iy0 iy0Var = this;
            WebResourceRequest webResourceRequest2 = webResourceRequest;
            Uri uri = url;
            R7033599853981556291.E(iy0Var.c, null, null, new cy0(url, webResourceRequest2, iy0Var, r4833348786910499294, (byte) 0), 3);
            hr1 hr1Var = iy0Var.q;
            I3826119971291161142 i3826119971291161142 = I3826119971291161142.a;
            if (hr1Var != null) {
                H4546125934900659656 h4546125934900659656 = new H4546125934900659656(hr1Var, iy0Var, webResourceRequest2, (R4833348786910499294) null, (byte) 3);
                iy0Var = iy0Var;
                webResourceRequest2 = webResourceRequest2;
                webResourceResponse = (WebResourceResponse) J8045362843799184672.r0(i3826119971291161142, h4546125934900659656);
            } else {
                webResourceResponse = null;
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
            jr0 jr0Var = iy0Var.f;
            jr0Var.getClass();
            return ((Boolean) jr0Var.a("gads_analytics_events_via_webview_requests", Boolean.FALSE, ao.a$11)).booleanValue() ? (WebResourceResponse) J8045362843799184672.r0(i3826119971291161142, new cy0(uri, webResourceRequest2, iy0Var, r4833348786910499294, (byte) 1)) : (WebResourceResponse) J8045362843799184672.r0(i3826119971291161142, new S14769385926647291222(uri, webResourceRequest2, iy0Var, (R4833348786910499294) null));
        }
        List<String> list = (List) this.b.z.poll();
        if (list == null) {
            list = O2161699089510411363.a;
        }
        v.getClass();
        if (list.isEmpty()) {
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(new byte[0]));
        }
        StringBuilder sb = new StringBuilder("<!DOCTYPE html><html><head></head><body><p>Warmup page</p>");
        for (String str : list) {
            String path = Uri.parse(str).getPath();
            if (path == null) {
                path = "";
            }
            if (Z13168519540281190457.z(path, ".js", true)) {
                sb.append("<script src=\"" + str + "\"></script>");
            } else if (Z13168519540281190457.z(path, ".css", true)) {
                sb.append("<link rel=\"stylesheet\" href=\"" + str + "\">");
            }
        }
        sb.append("</body></html>");
        String string = sb.toString();
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        byte[] bytes = string.getBytes(charsetForName);
        bytes.getClass();
        return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(bytes));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        Y2677586711477821327 y2677586711477821327 = v;
        Uri url = webResourceRequest.getUrl();
        url.getClass();
        y2677586711477821327.getClass();
        R4833348786910499294 r4833348786910499294 = null;
        byte b = 1;
        if ("gmsg".equalsIgnoreCase(url.getScheme()) && "mobileads.google.com".equalsIgnoreCase(url.getHost())) {
            Uri url2 = webResourceRequest.getUrl();
            url2.getClass();
            J8045362843799184672.s0(new vx0(this, url2, r4833348786910499294, b));
            return true;
        }
        byte b2 = 2;
        if (((Boolean) this.n.getValue(this, w[2])).booleanValue()) {
            Uri url3 = webResourceRequest.getUrl();
            url3.getClass();
            if (Z13168519540281190457.A(url3.getScheme(), "http", true) || Z13168519540281190457.A(url3.getScheme(), "https", true)) {
                z03 z03Var = this.u;
                if (z03Var != null && !z03Var.a()) {
                    R7033599853981556291.E(this.c, null, null, new fb((Object) this, (Object) webResourceRequest, r4833348786910499294, (byte) 9), 3);
                    return true;
                }
                if (!this.t.getAndSet(true)) {
                    zi3.a(this.c, new I15284427961769500538(this, webResourceRequest, r4833348786910499294, b2));
                }
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
        }
        if (this.b.willNotDraw()) {
            Objects.toString(webResourceRequest.getUrl());
            return true;
        }
        Uri url4 = webResourceRequest.getUrl();
        url4.getClass();
        a(url4);
        return true;
    }
}
