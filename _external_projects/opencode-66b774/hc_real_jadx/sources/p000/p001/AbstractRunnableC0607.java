package p000.p001;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractRunnableC0607 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String f4282;

    public AbstractRunnableC0607(String str, Object... objArr) {
        this.f4282 = C0629.m1820(str, objArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f4282);
        try {
            mo1725();
        } finally {
            Thread.currentThread().setName(name);
        }
    }

    /* renamed from: げつ〴ぬぐ */
    public abstract void mo1725();
}
