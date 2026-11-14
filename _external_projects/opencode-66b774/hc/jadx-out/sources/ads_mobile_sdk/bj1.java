package ads_mobile_sdk;

import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import dev.epro.r0.A6650193808056408155;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.N4024785987441166868;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.V7496420559085948492;
import dev.epro.r0.W5797197595347441198;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class bj1 extends TimerTask {
    public final /* synthetic */ V7496420559085948492 a;
    public final /* synthetic */ Timer b;
    public final /* synthetic */ dj1 c;

    public bj1(dj1 dj1Var, V7496420559085948492 v7496420559085948492, Timer timer) {
        this.c = dj1Var;
        this.a = v7496420559085948492;
        this.b = timer;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        ii iiVar = this.c.g;
        WebViewCompat.removeWebMessageListener((WebView) iiVar.a, ((A6650193808056408155) iiVar.b).a());
        w62 w62Var = this.a.a;
        W5797197595347441198 w5797197595347441198 = w62Var.c;
        N4024785987441166868 n4024785987441166868 = new N4024785987441166868(w62Var, null, (byte) 17);
        w5797197595347441198.getClass();
        R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(n4024785987441166868, null, (byte) 1), 2);
        this.b.cancel();
    }
}
