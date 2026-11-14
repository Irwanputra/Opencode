package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class d20 extends org.chromium.net.UrlRequest.Callback {
    public final java.io.ByteArrayOutputStream a;
    public final java.nio.channels.WritableByteChannel b;
    public final java.nio.ByteBuffer c;
    public boolean d;
    public dev.epro.r0.A18119328133183277592 e;
    public dev.epro.r0.H7219028874700587498 f;
    public final /* synthetic */ ads_mobile_sdk.w20 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ads_mobile_sdk.y11 i;

    public d20(dev.epro.r0.H7219028874700587498 h7219028874700587498, ads_mobile_sdk.w20 w20Var, boolean z, ads_mobile_sdk.y11 y11Var) {
        this.g = w20Var;
        this.h = z;
        this.i = y11Var;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        this.a = byteArrayOutputStream;
        this.b = java.nio.channels.Channels.newChannel(byteArrayOutputStream);
        this.c = java.nio.ByteBuffer.allocateDirect(32768);
        this.f = h7219028874700587498;
    }

    public final void a(dev.epro.r0.M16184408391440927034 m16184408391440927034) {
        if (!this.d) {
            try {
                this.b.close();
            } catch (java.lang.Throwable unused) {
            }
        }
        dev.epro.r0.H7219028874700587498 h7219028874700587498 = this.f;
        if (h7219028874700587498 != null && (h7219028874700587498.s() instanceof dev.epro.r0.B9271643986061518267)) {
            h7219028874700587498.resumeWith(m16184408391440927034);
        }
        this.f = null;
    }

    public final void onCanceled(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        if (!this.d) {
            a(new ads_mobile_sdk.tu0("Request was cancelled", 17));
            return;
        }
        dev.epro.r0.A18119328133183277592 a18119328133183277592 = this.e;
        if (a18119328133183277592 != null) {
            a18119328133183277592.f0(new java.util.concurrent.CancellationException("Request was cancelled"));
        }
        try {
            this.b.close();
        } catch (java.lang.Throwable unused) {
        }
    }

    public final void onFailed(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
        urlRequest.getClass();
        cronetException.getClass();
        if (this.d) {
            dev.epro.r0.A18119328133183277592 a18119328133183277592 = this.e;
            if (a18119328133183277592 != null) {
                a18119328133183277592.f0(cronetException);
            }
            try {
                this.b.close();
                return;
            } catch (java.lang.Throwable unused) {
                return;
            }
        }
        if (!(cronetException instanceof org.chromium.net.NetworkException) || ((org.chromium.net.NetworkException) cronetException).immediatelyRetryable()) {
            a(new ads_mobile_sdk.qu0(cronetException, 5, null, 4));
            return;
        }
        java.lang.String message = cronetException.getMessage();
        if (message == null) {
            message = "Non-retryable Cronet network error";
        }
        a(new ads_mobile_sdk.vu0(message, cronetException));
    }

    public final void onReadCompleted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        urlRequest.getClass();
        urlResponseInfo.getClass();
        byteBuffer.getClass();
        byteBuffer.flip();
        this.b.write(byteBuffer);
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    public final void onRedirectReceived(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) {
        urlRequest.getClass();
        urlResponseInfo.getClass();
        dev.epro.r0.G6575252167976303972 g6575252167976303972 = new dev.epro.r0.G6575252167976303972((byte) 2);
        g6575252167976303972.a = urlResponseInfo.getHttpStatusCode();
        g6575252167976303972.a(urlResponseInfo.getAllHeaders());
        g6575252167976303972.b = urlResponseInfo.getHttpStatusText();
        g6575252167976303972.f = str;
        a(new ads_mobile_sdk.xu0(g6575252167976303972.a()));
        urlRequest.cancel();
    }

    public final void onResponseStarted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        urlRequest.getClass();
        urlResponseInfo.getClass();
        ads_mobile_sdk.w20 w20Var = this.g;
        ads_mobile_sdk.jr0 jr0Var = w20Var.b;
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = w20Var.a;
        ads_mobile_sdk.fb fbVar = new ads_mobile_sdk.fb((java.lang.Object) this.i, (java.lang.Object) urlResponseInfo, (dev.epro.r0.R4833348786910499294) null, (byte) 3);
        w5797197595347441198.getClass();
        dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(fbVar, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        if (this.h && jr0Var != null && ((java.lang.Boolean) jr0Var.a("gads:enable_normalization_before_body", java.lang.Boolean.FALSE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
            java.util.Map allHeaders = urlResponseInfo.getAllHeaders();
            allHeaders.getClass();
            if (!allHeaders.isEmpty()) {
                java.util.Iterator it = allHeaders.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    java.lang.String str = (java.lang.String) entry.getKey();
                    jr0Var.getClass();
                    if (dev.epro.r0.Z13168519540281190457.A(str, (java.lang.String) jr0Var.a("gads:html_body_header", "X-Afma-Is-Html-Response", ads_mobile_sdk.ao.a$6), true)) {
                        java.lang.Object value = entry.getValue();
                        value.getClass();
                        if (java.lang.Boolean.parseBoolean((java.lang.String) dev.epro.r0.R9411874267597469228.D0((java.util.List) value))) {
                            this.d = true;
                            this.e = new dev.epro.r0.A18119328133183277592();
                            dev.epro.r0.G6575252167976303972 g6575252167976303972 = new dev.epro.r0.G6575252167976303972((byte) 2);
                            g6575252167976303972.a = urlResponseInfo.getHttpStatusCode();
                            g6575252167976303972.a(urlResponseInfo.getAllHeaders());
                            g6575252167976303972.b = urlResponseInfo.getHttpStatusText();
                            g6575252167976303972.e = this.e;
                            a(new ads_mobile_sdk.xu0(g6575252167976303972.a()));
                            break;
                        }
                    }
                }
            }
        }
        urlRequest.read(this.c);
    }

    public final void onSucceeded(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        urlRequest.getClass();
        urlResponseInfo.getClass();
        boolean z = this.d;
        java.io.ByteArrayOutputStream byteArrayOutputStream = this.a;
        if (z) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
            ads_mobile_sdk.ww2 ww2Var = new ads_mobile_sdk.ww2(byteArray);
            dev.epro.r0.A18119328133183277592 a18119328133183277592 = this.e;
            if (a18119328133183277592 != null) {
                a18119328133183277592.S(ww2Var);
            }
            try {
                this.b.close();
                return;
            } catch (java.lang.Throwable unused) {
                return;
            }
        }
        dev.epro.r0.G6575252167976303972 g6575252167976303972 = new dev.epro.r0.G6575252167976303972((byte) 2);
        g6575252167976303972.a = urlResponseInfo.getHttpStatusCode();
        g6575252167976303972.a(urlResponseInfo.getAllHeaders());
        g6575252167976303972.b = urlResponseInfo.getHttpStatusText();
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        if (byteArray2 != null) {
            g6575252167976303972.d = new ads_mobile_sdk.ww2(byteArray2);
        }
        a(new ads_mobile_sdk.xu0(g6575252167976303972.a()));
    }
}
