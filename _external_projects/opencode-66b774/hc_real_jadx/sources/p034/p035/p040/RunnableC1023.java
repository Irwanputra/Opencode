package p034.p035.p040;

import android.os.Handler;
import java.util.concurrent.Callable;
import p034.p035.p040.C1032;

/* renamed from: づざかべべ.〳ぜぞぜべっ.いいにぽつ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1023 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ Callable f5414;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ Handler f5415;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ C1032.InterfaceC1034 f5416;

    /* renamed from: づざかべべ.〳ぜぞぜべっ.いいにぽつ.ぁごぐすすぃ$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC1024 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ Object f5417;

        public RunnableC1024(Object obj) {
            this.f5417 = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC1023.this.f5416.mo2365(this.f5417);
        }
    }

    public RunnableC1023(C1032 c1032, Callable callable, Handler handler, C1032.InterfaceC1034 interfaceC1034) {
        this.f5414 = callable;
        this.f5415 = handler;
        this.f5416 = interfaceC1034;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        try {
            obj = this.f5414.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f5415.post(new RunnableC1024(obj));
    }
}
