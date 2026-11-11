package p034.p035.p043.p044;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* renamed from: づざかべべ.〳ぜぞぜべっ.なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1059 {

    /* renamed from: づざかべべ.〳ぜぞぜべっ.なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ$〺つふすそ, reason: contains not printable characters */
    public class RunnableC1060 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ int f5508;

        public RunnableC1060(int i) {
            this.f5508 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1059.this.mo2398(this.f5508);
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC1061 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ Typeface f5510;

        public RunnableC1061(Typeface typeface) {
            this.f5510 = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1059.this.mo2400(this.f5510);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m2397(Typeface typeface, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new RunnableC1061(typeface));
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public abstract void mo2398(int i);

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m2399(int i, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new RunnableC1060(i));
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public abstract void mo2400(Typeface typeface);
}
