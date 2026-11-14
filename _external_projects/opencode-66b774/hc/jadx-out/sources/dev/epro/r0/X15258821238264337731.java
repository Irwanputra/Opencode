package dev.epro.r0;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class X15258821238264337731 implements Choreographer.FrameCallback {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((W13948953340889349604) obj).run();
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new C10246743001969768588((Context) obj, (byte) 2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
        }
    }
}
