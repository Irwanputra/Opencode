package dev.epro.r0;

import android.app.Application;
import android.os.Parcel;
import android.util.SparseIntArray;
import androidx.webkit.WebViewFeature;
import androidx.webkit.WebViewStartUpConfig;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M204440408817344908 implements R5827688671290015495, Y16209271193599430318, WebMessageListenerBoundaryInterface, WebViewStartUpConfigBoundaryInterface, I8344119817086563006, Z5019126814379845930, P14073887229229024046, P221537849541086423, A10930401833958772877, I3673563500665330592, G3906313092368799651 {
    public final /* synthetic */ byte a;
    public Object b;

    public M204440408817344908(float f, float f2, Z13251062865217617579 z13251062865217617579) {
        this.a = (byte) 1;
        int[] iArr = X10619738580506686296.a;
        this.b = new J15730374346044043770((z13251062865217617579 == null && f == 1.0f && f2 == 1500.0f) ? Z13307485094822810014.a : z13251062865217617579 != null ? new M9197813449740923653(f, f2, z13251062865217617579) : new M9197813449740923653(f, f2), (byte) 20);
    }

    @Override // dev.epro.r0.Y16209271193599430318, dev.epro.r0.V9266657454036696449
    public boolean a() {
        return false;
    }

    @Override // dev.epro.r0.P14073887229229024046
    public void accept(Object obj, Object obj2) {
        X12923627983819883516 x12923627983819883516 = (X12923627983819883516) this.b;
        M17133811648581684718 m17133811648581684718 = (M17133811648581684718) obj2;
        X5601567687078639138 x5601567687078639138 = (X5601567687078639138) ((Y9876475513294825521) obj).getService();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(x5601567687078639138.c);
        int i = P5711368119050701608.a;
        if (x12923627983819883516 == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            x12923627983819883516.writeToParcel(parcelObtain, 0);
        }
        try {
            x5601567687078639138.b.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            m17133811648581684718.a.f(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // dev.epro.r0.V9266657454036696449
    public long b(Z13251062865217617579 z13251062865217617579, Z13251062865217617579 z132510628652176175792, Z13251062865217617579 z132510628652176175793) {
        return ((J15730374346044043770) this.b).b(z13251062865217617579, z132510628652176175792, z132510628652176175793);
    }

    @Override // dev.epro.r0.A10930401833958772877
    public void c(D14731132657808549702 d14731132657808549702) {
        ((D1625857060574188343) this.b).a(d14731132657808549702);
    }

    @Override // dev.epro.r0.V9266657454036696449
    public Z13251062865217617579 d(Z13251062865217617579 z13251062865217617579, Z13251062865217617579 z132510628652176175792, Z13251062865217617579 z132510628652176175793) {
        return ((J15730374346044043770) this.b).d(z13251062865217617579, z132510628652176175792, z132510628652176175793);
    }

    @Override // dev.epro.r0.V9266657454036696449
    public Z13251062865217617579 e(long j, Z13251062865217617579 z13251062865217617579, Z13251062865217617579 z132510628652176175792, Z13251062865217617579 z132510628652176175793) {
        return ((J15730374346044043770) this.b).e(j, z13251062865217617579, z132510628652176175792, z132510628652176175793);
    }

    @Override // dev.epro.r0.P221537849541086423
    public void f(X17123927029532314696 x17123927029532314696) {
        ((AtomicReference) this.b).set(x17123927029532314696);
    }

    @Override // dev.epro.r0.G3906313092368799651
    public N17310361809908093775 g(Class cls) {
        for (int i = 0; i < 2; i++) {
            G3906313092368799651 g3906313092368799651 = ((G3906313092368799651[]) this.b)[i];
            if (g3906313092368799651.i(cls)) {
                return g3906313092368799651.g(cls);
            }
        }
        D11988991656201568495.j("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // dev.epro.r0.R5827688671290015495
    public K6937929821947263863 get(int i) {
        return (K6937929821947263863) this.b;
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public Executor getBackgroundExecutor() {
        return ((WebViewStartUpConfig) this.b).getBackgroundExecutor();
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public Set getProfileNamesToLoad() {
        return ((WebViewStartUpConfig) this.b).getProfilesToLoadDuringStartup();
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{WebViewFeature.WEB_MESSAGE_LISTENER, WebViewFeature.WEB_MESSAGE_ARRAY_BUFFER};
    }

    @Override // dev.epro.r0.I3673563500665330592
    public Object h() {
        switch (this.a) {
            case 15:
                L10699316803831699764 l10699316803831699764 = L7597948271951285043.b;
                Q3791352212346016950.m(l10699316803831699764);
                return new G15068739404623149094((C7482541032955929215) this.b, l10699316803831699764);
            case 16:
                return new O6655543165492094776((Application) ((I3673563500665330592) this.b).h());
            default:
                D9201356603168736774 d9201356603168736774 = (D9201356603168736774) this.b;
                if (d9201356603168736774 != null) {
                    return d9201356603168736774.h();
                }
                Z3383101362411723454.r();
                return null;
        }
    }

    @Override // dev.epro.r0.G3906313092368799651
    public boolean i(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((G3906313092368799651[]) this.b)[i].i(cls)) {
                return true;
            }
        }
        return false;
    }

    public long j(long j) {
        H14072535535744303516 h14072535535744303516 = (H14072535535744303516) this.b;
        if (L9139634373441254073.b(j) <= 0.0f || L9139634373441254073.c(j) <= 0.0f) {
            P753981624812481271.b("maximumVelocity should be a positive value. You specified=".concat(L9139634373441254073.g(j)));
        }
        return T3224757362656795885.a(h14072535535744303516.a.c(L9139634373441254073.b(j)), h14072535535744303516.b.c(L9139634373441254073.c(j)));
    }

    public S14461012662136963693 k(S14461012662136963693 s14461012662136963693) {
        W12609257429008829531 w12609257429008829531 = (W12609257429008829531) this.b;
        if (!s14461012662136963693.d() && !s14461012662136963693.d) {
            Exception excB = s14461012662136963693.b();
            if (excB instanceof X4906216915227203322) {
                int i = ((X4906216915227203322) excB).a.d;
                if (i == 43001 || i == 43002 || i == 43003 || i == 17) {
                    return ((W12609257429008829531) w12609257429008829531.c).a();
                }
                if (i == 43000) {
                    Exception exc = new Exception("Failed to get app set ID due to an internal error. Please try again later.");
                    S14461012662136963693 s144610126621369636932 = new S14461012662136963693();
                    s144610126621369636932.e(exc);
                    return s144610126621369636932;
                }
                if (i == 15) {
                    Exception exc2 = new Exception("The operation to get app set ID timed out. Please try again later.");
                    S14461012662136963693 s144610126621369636933 = new S14461012662136963693();
                    s144610126621369636933.e(exc2);
                    return s144610126621369636933;
                }
            }
        }
        return s14461012662136963693;
    }

    public void l(int i, Object obj, L16757957611328596921 l16757957611328596921) {
        M15366967277392692994 m15366967277392692994 = (M15366967277392692994) this.b;
        L17990604304028499756 l17990604304028499756 = (L17990604304028499756) obj;
        m15366967277392692994.X(i, 2);
        m15366967277392692994.Z(l17990604304028499756.b(l16757957611328596921));
        l16757957611328596921.a(l17990604304028499756, this);
    }

    @Override // dev.epro.r0.I8344119817086563006
    public void onConnected() {
        ((U11179075180450893832) this.b).onConnected();
    }

    @Override // dev.epro.r0.Z5019126814379845930
    public void onConnectionFailed(B6867906687934285025 b6867906687934285025) {
        ((R3599537314284374589) this.b).onConnectionFailed(b6867906687934285025);
    }

    @Override // dev.epro.r0.I8344119817086563006
    public void onConnectionSuspended(int i) {
        ((U11179075180450893832) this.b).onConnectionSuspended(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPostMessage(android.webkit.WebView r5, java.lang.reflect.InvocationHandler r6, android.net.Uri r7, boolean r8, java.lang.reflect.InvocationHandler r9) {
        /*
            r4 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r5 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r5 = dev.epro.r0.K5751602218013079365.w(r5, r6)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r5 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r5
            java.lang.reflect.InvocationHandler[] r6 = r5.getPorts()
            int r7 = r6.length
            dev.epro.r0.U15597528598182133107[] r7 = new dev.epro.r0.U15597528598182133107[r7]
            r8 = 0
            r0 = r8
        L11:
            int r1 = r6.length
            if (r0 >= r1) goto L2a
            dev.epro.r0.L455553177668166676 r1 = new dev.epro.r0.L455553177668166676
            r2 = r6[r0]
            r1.<init>()
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface> r3 = org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class
            java.lang.Object r2 = dev.epro.r0.K5751602218013079365.w(r3, r2)
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r2 = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) r2
            r1.b = r2
            r7[r0] = r1
            int r0 = r0 + 1
            goto L11
        L2a:
            dev.epro.r0.B5488833628674465193 r6 = dev.epro.r0.Q6344330807969154194.e
            boolean r6 = r6.b()
            if (r6 == 0) goto L5e
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r6 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r5 = r5.getMessagePayload()
            java.lang.Object r5 = dev.epro.r0.K5751602218013079365.w(r6, r5)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r5 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r5
            int r6 = r5.getType()
            if (r6 == 0) goto L54
            r0 = 1
            if (r6 == r0) goto L49
            r5 = 0
            goto L68
        L49:
            dev.epro.r0.D5229586195471132766 r6 = new dev.epro.r0.D5229586195471132766
            byte[] r5 = r5.getAsArrayBuffer()
            r6.<init>(r5, r7)
        L52:
            r5 = r6
            goto L68
        L54:
            dev.epro.r0.D5229586195471132766 r6 = new dev.epro.r0.D5229586195471132766
            java.lang.String r5 = r5.getAsString()
            r6.<init>(r5, r7)
            goto L52
        L5e:
            dev.epro.r0.D5229586195471132766 r6 = new dev.epro.r0.D5229586195471132766
            java.lang.String r5 = r5.getData()
            r6.<init>(r5, r7)
            goto L52
        L68:
            if (r5 == 0) goto La4
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r6 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r6 = dev.epro.r0.K5751602218013079365.w(r6, r9)
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r6 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r6
            dev.epro.r0.J5800360223679855765 r7 = new dev.epro.r0.J5800360223679855765
            r7.<init>(r6, r8)
            java.lang.Object r6 = r6.getOrCreatePeer(r7)
            dev.epro.r0.A18296507893906114885 r6 = (dev.epro.r0.A18296507893906114885) r6
            java.lang.Object r4 = r4.b
            dev.epro.r0.P14171055790411190215 r4 = (dev.epro.r0.P14171055790411190215) r4
            ads_mobile_sdk.c7 r4 = (ads_mobile_sdk.c7) r4
            java.lang.Object r4 = r4.a
            ads_mobile_sdk.ii r4 = (ads_mobile_sdk.ii) r4
            r5.a(r8)
            java.lang.String r5 = r5.b
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> La4
            r6.<init>(r5)     // Catch: org.json.JSONException -> La4
            java.lang.String r5 = "method"
            java.lang.String r5 = r6.getString(r5)     // Catch: org.json.JSONException -> La4
            java.lang.String r7 = "data"
            org.json.JSONObject r6 = r6.getJSONObject(r7)     // Catch: org.json.JSONException -> La4
            java.lang.Object r4 = r4.b     // Catch: org.json.JSONException -> La4
            dev.epro.r0.A6650193808056408155 r4 = (dev.epro.r0.A6650193808056408155) r4     // Catch: org.json.JSONException -> La4
            r4.a(r5, r6)     // Catch: org.json.JSONException -> La4
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M204440408817344908.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override // dev.epro.r0.V9266657454036696449
    public Z13251062865217617579 r(long j, Z13251062865217617579 z13251062865217617579, Z13251062865217617579 z132510628652176175792, Z13251062865217617579 z132510628652176175793) {
        return ((J15730374346044043770) this.b).r(j, z13251062865217617579, z132510628652176175792, z132510628652176175793);
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public boolean shouldRunUiThreadStartUpTasks() {
        return ((WebViewStartUpConfig) this.b).shouldRunUiThreadStartUpTasks();
    }

    public /* synthetic */ M204440408817344908(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public M204440408817344908(M15366967277392692994 m15366967277392692994) {
        this.a = (byte) 17;
        Charset charset = W16701142256148280421.a;
        this.b = m15366967277392692994;
        m15366967277392692994.e = this;
    }

    public M204440408817344908(byte b) {
        this.a = b;
        switch (b) {
            case 11:
                Object obj = X11123940576545591343.c;
                this.b = new SparseIntArray();
                break;
            case 20:
                break;
            default:
                this.b = new H14072535535744303516();
                break;
        }
    }
}
