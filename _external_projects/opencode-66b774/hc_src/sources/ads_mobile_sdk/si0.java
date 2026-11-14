package ads_mobile_sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import dev.epro.r0.Y2677586711477821327;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class si0 extends ContentObserver {
    public final Handler a;
    public final Context b;
    public final AudioManager c;
    public final p72 e;
    public final AtomicReference f;
    public final AtomicBoolean g;
    public final ExecutorService h;

    public si0(Handler handler, Context context, Y2677586711477821327 y2677586711477821327, p72 p72Var) {
        super(handler);
        this.f = new AtomicReference(Float.valueOf(-1.0f));
        this.g = new AtomicBoolean(false);
        this.h = Executors.newSingleThreadExecutor();
        this.a = handler;
        this.b = context;
        this.c = (AudioManager) context.getSystemService("audio");
        this.e = p72Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        byte b = 1;
        if (this.g.getAndSet(true)) {
            return;
        }
        this.h.submit(new qj3(this, b));
    }
}
