package ads_mobile_sdk;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import dev.epro.r0.I6819901599980491061;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class qj3 implements Runnable {
    public final Object a;
    public final /* synthetic */ byte b;

    public qj3(xu1 xu1Var) {
        this.b = (byte) 2;
        this.a = xu1Var.e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        byte b = this.b;
        Object obj = this.a;
        switch (b) {
            case 0:
                ii iiVar = ((tj3) obj).e;
                ((r6) iiVar.b).a(new I6819901599980491061(iiVar));
                break;
            case 1:
                si0 si0Var = (si0) obj;
                int streamVolume = si0Var.c.getStreamVolume(3);
                int streamMaxVolume = si0Var.c.getStreamMaxVolume(3);
                if (streamMaxVolume <= 0 || streamVolume <= 0) {
                    f = 0.0f;
                } else {
                    f = streamVolume / streamMaxVolume;
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                }
                si0Var.g.set(false);
                if (((Float) si0Var.f.getAndSet(Float.valueOf(f))).floatValue() != f) {
                    si0Var.a.post(new qi0(this, f));
                }
                break;
            case 2:
                ((WebView) obj).destroy();
                break;
            default:
                try {
                    WebSettings.getDefaultUserAgent((Context) obj);
                } catch (Throwable unused) {
                    return;
                }
                break;
        }
    }

    public /* synthetic */ qj3(Object obj, byte b) {
        this.b = b;
        this.a = obj;
    }
}
