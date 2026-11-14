package dev.epro.r0;

import android.content.Context;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U9296548531947164180 implements H11246634969386575622, H3430986877638506198 {
    public final Context a;

    public U9296548531947164180(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // dev.epro.r0.H11246634969386575622
    public void a(R7033599853981556291 r7033599853981556291) {
        W1882561930554124601 w1882561930554124601 = new W1882561930554124601("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), w1882561930554124601);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new E138661690457992157(this, r7033599853981556291, threadPoolExecutor, (byte) 1));
    }

    @Override // dev.epro.r0.H3430986877638506198
    public Object f() {
        V11923105316530470448 V;
        V = Z860808776098365610.V(this.a, HsdpDeepLinkServiceFactory.createHsdpServiceIntent());
        return V;
    }

    public /* synthetic */ U9296548531947164180(Context context, boolean z) {
        this.a = context;
    }
}
