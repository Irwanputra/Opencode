package p131.p161.p211.p214;

import java.lang.reflect.Method;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.でどあくず, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2634 extends AbstractC2620 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ int f10074;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ Method f10075;

    public C2634(Method method, int i) {
        this.f10075 = method;
        this.f10074 = i;
    }

    @Override // p131.p161.p211.p214.AbstractC2620
    /* renamed from: 〺つふすそ */
    public <T> T mo4590(Class<T> cls) {
        AbstractC2620.m4610(cls);
        return (T) this.f10075.invoke(null, cls, Integer.valueOf(this.f10074));
    }
}
