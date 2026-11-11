package p131.p161.p211.p218;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p131.p161.p211.p214.C2625;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぺづげぺが.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2672<T> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Type f10128;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int f10129;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Class<? super T> f10130;

    public C2672() {
        Type genericSuperclass = C2672.class.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Type m4617 = C2625.m4617(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.f10128 = m4617;
        this.f10130 = (Class<? super T>) C2625.m4618(m4617);
        this.f10129 = m4617.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2672) && C2625.m4616(this.f10128, ((C2672) obj).f10128);
    }

    public final int hashCode() {
        return this.f10129;
    }

    public final String toString() {
        return C2625.m4621(this.f10128);
    }

    public C2672(Type type) {
        type.getClass();
        Type m4617 = C2625.m4617(type);
        this.f10128 = m4617;
        this.f10130 = (Class<? super T>) C2625.m4618(m4617);
        this.f10129 = m4617.hashCode();
    }
}
