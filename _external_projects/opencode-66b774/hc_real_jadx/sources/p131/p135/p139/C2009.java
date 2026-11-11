package p131.p135.p139;

import java.util.concurrent.Executor;

/* renamed from: なぎぱいぢぎ.〺つふすそ.くし〴〺ぅ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2009 implements InterfaceC2015 {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final int f8734 = (Runtime.getRuntime().availableProcessors() * 2) + 1;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C2010 f8735;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Executor f8736;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C2010 f8737;

    public C2009() {
        ThreadFactoryC2013 threadFactoryC2013 = new ThreadFactoryC2013(10);
        this.f8737 = new C2010(f8734, threadFactoryC2013);
        this.f8735 = new C2010(2, threadFactoryC2013);
        this.f8736 = new ExecutorC2012();
    }
}
