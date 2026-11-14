package ads_mobile_sdk;

import dev.epro.r0.A18119328133183277592;
import dev.epro.r0.B9271643986061518267;
import dev.epro.r0.G6575252167976303972;
import dev.epro.r0.H7219028874700587498;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.M16184408391440927034;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.R9411874267597469228;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z13168519540281190457;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class d20 extends UrlRequest.Callback {
    public final ByteArrayOutputStream a;
    public final WritableByteChannel b;
    public final ByteBuffer c;
    public boolean d;
    public A18119328133183277592 e;
    public H7219028874700587498 f;
    public final /* synthetic */ w20 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ y11 i;

    public d20(H7219028874700587498 h7219028874700587498, w20 w20Var, boolean z, y11 y11Var) {
        this.g = w20Var;
        this.h = z;
        this.i = y11Var;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.a = byteArrayOutputStream;
        this.b = Channels.newChannel(byteArrayOutputStream);
        this.c = ByteBuffer.allocateDirect(32768);
        this.f = h7219028874700587498;
    }

    public final void a(M16184408391440927034 m16184408391440927034) {
        if (!this.d) {
            try {
                this.b.close();
            } catch (Throwable unused) {
            }
        }
        H7219028874700587498 h7219028874700587498 = this.f;
        if (h7219028874700587498 != null && (h7219028874700587498.s() instanceof B9271643986061518267)) {
            h7219028874700587498.resumeWith(m16184408391440927034);
        }
        this.f = null;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (!this.d) {
            a(new tu0("Request was cancelled", 17));
            return;
        }
        A18119328133183277592 a18119328133183277592 = this.e;
        if (a18119328133183277592 != null) {
            a18119328133183277592.f0(new CancellationException("Request was cancelled"));
        }
        try {
            this.b.close();
        } catch (Throwable unused) {
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        urlRequest.getClass();
        cronetException.getClass();
        if (this.d) {
            A18119328133183277592 a18119328133183277592 = this.e;
            if (a18119328133183277592 != null) {
                a18119328133183277592.f0(cronetException);
            }
            try {
                this.b.close();
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        if (!(cronetException instanceof NetworkException) || ((NetworkException) cronetException).immediatelyRetryable()) {
            a(new qu0(cronetException, 5, null, 4));
            return;
        }
        String message = cronetException.getMessage();
        if (message == null) {
            message = "Non-retryable Cronet network error";
        }
        a(new vu0(message, cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        urlRequest.getClass();
        urlResponseInfo.getClass();
        byteBuffer.getClass();
        byteBuffer.flip();
        this.b.write(byteBuffer);
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.getClass();
        urlResponseInfo.getClass();
        G6575252167976303972 g6575252167976303972 = new G6575252167976303972((byte) 2);
        g6575252167976303972.a = urlResponseInfo.getHttpStatusCode();
        g6575252167976303972.a(urlResponseInfo.getAllHeaders());
        g6575252167976303972.b = urlResponseInfo.getHttpStatusText();
        g6575252167976303972.f = str;
        a(new xu0(g6575252167976303972.a()));
        urlRequest.cancel();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        urlRequest.getClass();
        urlResponseInfo.getClass();
        w20 w20Var = this.g;
        jr0 jr0Var = w20Var.b;
        W5797197595347441198 w5797197595347441198 = w20Var.a;
        fb fbVar = new fb((Object) this.i, (Object) urlResponseInfo, (R4833348786910499294) null, (byte) 3);
        w5797197595347441198.getClass();
        R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(fbVar, null, (byte) 1), 2);
        if (this.h && jr0Var != null && ((Boolean) jr0Var.a("gads:enable_normalization_before_body", Boolean.FALSE, ao.a$11)).booleanValue()) {
            Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
            allHeaders.getClass();
            if (!allHeaders.isEmpty()) {
                Iterator<Map.Entry<String, List<String>>> it = allHeaders.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, List<String>> next = it.next();
                    String key = next.getKey();
                    jr0Var.getClass();
                    if (Z13168519540281190457.A(key, (String) jr0Var.a("gads:html_body_header", "X-Afma-Is-Html-Response", ao.a$6), true)) {
                        List<String> value = next.getValue();
                        value.getClass();
                        if (Boolean.parseBoolean((String) R9411874267597469228.D0(value))) {
                            this.d = true;
                            this.e = new A18119328133183277592();
                            G6575252167976303972 g6575252167976303972 = new G6575252167976303972((byte) 2);
                            g6575252167976303972.a = urlResponseInfo.getHttpStatusCode();
                            g6575252167976303972.a(urlResponseInfo.getAllHeaders());
                            g6575252167976303972.b = urlResponseInfo.getHttpStatusText();
                            g6575252167976303972.e = this.e;
                            a(new xu0(g6575252167976303972.a()));
                            break;
                        }
                    }
                }
            }
        }
        urlRequest.read(this.c);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        urlRequest.getClass();
        urlResponseInfo.getClass();
        boolean z = this.d;
        ByteArrayOutputStream byteArrayOutputStream = this.a;
        if (z) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
            ww2 ww2Var = new ww2(byteArray);
            A18119328133183277592 a18119328133183277592 = this.e;
            if (a18119328133183277592 != null) {
                a18119328133183277592.S(ww2Var);
            }
            try {
                this.b.close();
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        G6575252167976303972 g6575252167976303972 = new G6575252167976303972((byte) 2);
        g6575252167976303972.a = urlResponseInfo.getHttpStatusCode();
        g6575252167976303972.a(urlResponseInfo.getAllHeaders());
        g6575252167976303972.b = urlResponseInfo.getHttpStatusText();
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        if (byteArray2 != null) {
            g6575252167976303972.d = new ww2(byteArray2);
        }
        a(new xu0(g6575252167976303972.a()));
    }
}
