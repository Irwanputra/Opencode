package dev.epro.r0;

import android.content.Context;
import dev.epro.relay.ClientSession;
import dev.epro.relay.RuntimeHost;
import java.util.concurrent.atomic.AtomicReference;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class I17640762759778572247 {
    public static final /* synthetic */ int h = 0;
    public final Context a;
    public final Object b;
    public long c;
    public ClientSession d;
    public I572770422023142481 e;
    public F14698075708856328710 f;
    public int g;

    static {
        izmyclvb.dpqpjfpoanwt1(697);
        bgpzcvxohddi();
    }

    private static native void bgpzcvxohddi();

    private native void zrxxecitndgx(Context context);

    public final native boolean a(long j);

    public final native void b();

    public final native void c(L13228523046976612098 l13228523046976612098);

    public static final class Y11460403151847909905 {
        public final String a;
        public final JSONObject b;

        static {
            izmyclvb.dpqpjfpoanwt1(1843);
        }

        private native void fmstyzlghewe(String str, JSONObject jSONObject);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Y11460403151847909905(String str, JSONObject jSONObject) {
            str.getClass();
            jSONObject.getClass();
            fmstyzlghewe(str, jSONObject);
        }
    }

    public static final class Y6921797927338498306 {
        static {
            izmyclvb.dpqpjfpoanwt1(2069);
        }

        private native void mnlbrmzguvas(O18369580107802500074 o18369580107802500074);

        private native void waukrgleipfl();

        public /* synthetic */ Y6921797927338498306(O18369580107802500074 o18369580107802500074) {
            this();
            mnlbrmzguvas(o18369580107802500074);
        }

        private Y6921797927338498306() {
            waukrgleipfl();
        }
    }

    public final class Z11244019023321623390 implements RuntimeHost {
        public final long a;
        public final H11638700117962051797 b;
        public final AtomicReference c;
        public final /* synthetic */ I17640762759778572247 d;

        static {
            izmyclvb.dpqpjfpoanwt1(775);
        }

        public static native Y11460403151847909905 a(String str, String str2);

        private native void ofgwrlpxtplo(I17640762759778572247 i17640762759778572247, long j, H11638700117962051797 h11638700117962051797);

        @Override // dev.epro.relay.RuntimeHost
        public final native void onActive(String str);

        @Override // dev.epro.relay.RuntimeHost
        public final native void onClientRegion(String str);

        @Override // dev.epro.relay.RuntimeHost
        public final native void onDialing(String str);

        @Override // dev.epro.relay.RuntimeHost
        public final native void onError(String str);

        @Override // dev.epro.relay.RuntimeHost
        public final native void onListening(int i);

        @Override // dev.epro.relay.RuntimeHost
        public final native void onReconnectLimitReached(int i);

        @Override // dev.epro.relay.RuntimeHost, dev.epro.mobile.RetryHandler
        public final native void onRetry(int i, int i2);

        @Override // dev.epro.relay.RuntimeHost
        public final native void onState(String str);

        @Override // dev.epro.relay.RuntimeHost
        public final native void onTrafficRateLimits(long j, long j2);

        @Override // dev.epro.relay.RuntimeHost, dev.epro.xray.SocketProtector
        public final native boolean protect(long j);

        public Z11244019023321623390(I17640762759778572247 i17640762759778572247, long j, H11638700117962051797 h11638700117962051797) {
            h11638700117962051797.getClass();
            this.d = i17640762759778572247;
            ofgwrlpxtplo(i17640762759778572247, j, h11638700117962051797);
        }
    }

    public I17640762759778572247(Context context) {
        context.getClass();
        zrxxecitndgx(context);
    }
}
