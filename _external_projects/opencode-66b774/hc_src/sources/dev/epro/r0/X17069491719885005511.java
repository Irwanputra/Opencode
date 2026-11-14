package dev.epro.r0;

import android.content.Context;
import dev.epro.xray.ServerAddressResolver;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class X17069491719885005511 implements ServerAddressResolver, AutoCloseable {
    public final D1333116679386793246 a;

    static {
        izmyclvb.qgayjvbiagej2(1328);
        pfalfuzdhcjj();
    }

    private static native void pfalfuzdhcjj();

    private native void zujeukxcxeoe(Context context);

    @Override // java.lang.AutoCloseable
    public final native void close();

    @Override // dev.epro.xray.ServerAddressResolver
    public final native String lookup(String str);

    public X17069491719885005511(Context context) {
        context.getClass();
        zujeukxcxeoe(context);
    }
}
