package p131.p161.p211.p214;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import p131.p155.p156.p157.C2098;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2544<T> implements InterfaceC2629<T> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ Constructor f9913;

    public C2544(C2547 c2547, Constructor constructor) {
        this.f9913 = constructor;
    }

    @Override // p131.p161.p211.p214.InterfaceC2629
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public T mo4589() {
        try {
            return (T) this.f9913.newInstance(null);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InstantiationException e2) {
            StringBuilder m4207 = C2098.m4207("Failed to invoke ");
            m4207.append(this.f9913);
            m4207.append(" with no args");
            throw new RuntimeException(m4207.toString(), e2);
        } catch (InvocationTargetException e3) {
            StringBuilder m42072 = C2098.m4207("Failed to invoke ");
            m42072.append(this.f9913);
            m42072.append(" with no args");
            throw new RuntimeException(m42072.toString(), e3.getTargetException());
        }
    }
}
