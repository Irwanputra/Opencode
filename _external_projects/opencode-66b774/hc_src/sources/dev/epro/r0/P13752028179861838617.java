package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class P13752028179861838617 {
    public static final ThreadLocal a = new ThreadLocal();

    public static I17129535152515035455 a() {
        ThreadLocal threadLocal = a;
        I17129535152515035455 i17129535152515035455 = (I17129535152515035455) threadLocal.get();
        if (i17129535152515035455 != null) {
            return i17129535152515035455;
        }
        W1183754292268043044 w1183754292268043044 = new W1183754292268043044(Thread.currentThread());
        threadLocal.set(w1183754292268043044);
        return w1183754292268043044;
    }
}
