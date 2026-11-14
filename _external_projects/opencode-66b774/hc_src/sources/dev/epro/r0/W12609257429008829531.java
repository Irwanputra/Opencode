package dev.epro.r0;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W12609257429008829531 implements Y2933697625406090147 {
    public static W12609257429008829531 d;
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public W12609257429008829531(Context context, byte b) {
        W12609257429008829531 w12609257429008829531;
        this.a = b;
        switch (b) {
            case 1:
                this.b = new K10338866325111423474(context, G14026964626121631668.b);
                synchronized (W12609257429008829531.class) {
                    w12609257429008829531 = d;
                    if (w12609257429008829531 == null) {
                        w12609257429008829531 = new W12609257429008829531(context.getApplicationContext(), (byte) 0);
                        d = w12609257429008829531;
                    }
                }
                this.c = w12609257429008829531;
                return;
            default:
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.c = Executors.newSingleThreadExecutor();
                this.b = context;
                newSingleThreadScheduledExecutor.scheduleAtFixedRate(new U3594978070141619353(this, (byte) 22), 0L, 86400L, TimeUnit.SECONDS);
                return;
        }
    }

    public static final SharedPreferences b(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void c(Context context) {
        SharedPreferences b = b(context);
        if (b.edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        if (valueOf.length() != 0) {
            "Failed to store app set ID last used time for App ".concat(valueOf);
        }
        throw new Z17584938815677520411("Failed to store the app set ID last used time.");
    }

    @Override // dev.epro.r0.Y2933697625406090147
    public final S14461012662136963693 a() {
        switch (this.a) {
            case 0:
                M17133811648581684718 m17133811648581684718 = new M17133811648581684718();
                ((ExecutorService) this.c).execute(new I3863025946240164840(this, m17133811648581684718, (byte) 26));
                return m17133811648581684718.a;
            default:
                S14461012662136963693 a = ((K10338866325111423474) this.b).a();
                M204440408817344908 m204440408817344908 = new M204440408817344908(this, (byte) 18);
                Q15119607593561432156 q15119607593561432156 = P12466553659249280316.a;
                S14461012662136963693 s14461012662136963693 = new S14461012662136963693();
                a.b.b(new I6845661640435175914(q15119607593561432156, m204440408817344908, s14461012662136963693, (byte) 0));
                a.i();
                return s14461012662136963693;
        }
    }
}
