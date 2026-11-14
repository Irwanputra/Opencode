package dev.epro.r0;

import android.content.Context;
import dev.epro.relay.ServerAddressResolver;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class I572770422023142481 implements ServerAddressResolver, AutoCloseable {
    public final D1333116679386793246 a;

    static {
        izmyclvb.dpqpjfpoanwt1(842);
        rqnuelfiqvvh();
    }

    private native void btatdlohfydu(Context context);

    private static native void rqnuelfiqvvh();

    @Override // java.lang.AutoCloseable
    public final native void close();

    @Override // dev.epro.relay.ServerAddressResolver
    public final native String lookup(String str);

    public I572770422023142481(Context context) {
        context.getClass();
        btatdlohfydu(context);
    }
}
