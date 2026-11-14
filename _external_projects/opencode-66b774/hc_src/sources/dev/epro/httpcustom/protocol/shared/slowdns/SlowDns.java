package dev.epro.httpcustom.protocol.shared.slowdns;

import dev.epro.slowdns.DestinationObserver;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public final class SlowDns {
    public static final int $stable = 0;
    public static final SlowDns INSTANCE;

    static {
        int qwsojjcusaoq;
        izmyclvb.oeynnivvrnts0(59);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                qwsojjcusaoq = qwsojjcusaoq(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (qwsojjcusaoq != 0) {
                switch (qwsojjcusaoq) {
                    case 1:
                        INSTANCE = (SlowDns) objArr[1];
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static final native boolean isReady(String str);

    private static native int qwsojjcusaoq(Object[] objArr);

    public static final native int start(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6);

    public static native /* synthetic */ int startConfiguredObserved$app$default(SlowDns slowDns, String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, DestinationObserver destinationObserver, String str7, String str8, int i3, boolean z, int i4, int i5, boolean z2, int i6, Object obj);

    public static final native void stop();

    public static final native void stopByListen(String str);

    private native void tqjezjqzsidg();

    public final native boolean isCalibrationPending$app(String str);

    public final native int startConfiguredObserved$app(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, DestinationObserver destinationObserver, String str7, String str8, int i3, boolean z, int i4, int i5, boolean z2);

    public final native int startObserved$app(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, DestinationObserver destinationObserver);

    private SlowDns() {
        tqjezjqzsidg();
    }
}
