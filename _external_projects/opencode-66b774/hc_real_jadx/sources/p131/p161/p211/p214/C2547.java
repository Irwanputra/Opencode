package p131.p161.p211.p214;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import p131.p161.p211.InterfaceC2659;
import p131.p161.p211.p214.p217.AbstractC2645;
import p131.p161.p211.p218.C2672;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2547 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final AbstractC2645 f9914 = AbstractC2645.f10101;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Map<Type, InterfaceC2659<?>> f9915;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぁごぐすすぃ$〺つふすそ, reason: contains not printable characters */
    public class C2548<T> implements InterfaceC2629<T> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ Type f9916;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC2659 f9917;

        public C2548(C2547 c2547, InterfaceC2659 interfaceC2659, Type type) {
            this.f9917 = interfaceC2659;
            this.f9916 = type;
        }

        @Override // p131.p161.p211.p214.InterfaceC2629
        /* renamed from: げつ〴ぬぐ */
        public T mo4589() {
            return (T) this.f9917.m4639(this.f9916);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぁごぐすすぃ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2549<T> implements InterfaceC2629<T> {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ Type f9918;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC2659 f9919;

        public C2549(C2547 c2547, InterfaceC2659 interfaceC2659, Type type) {
            this.f9919 = interfaceC2659;
            this.f9918 = type;
        }

        @Override // p131.p161.p211.p214.InterfaceC2629
        /* renamed from: げつ〴ぬぐ */
        public T mo4589() {
            return (T) this.f9919.m4639(this.f9918);
        }
    }

    public C2547(Map<Type, InterfaceC2659<?>> map) {
        this.f9915 = map;
    }

    public String toString() {
        return this.f9915.toString();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public <T> InterfaceC2629<T> m4591(C2672<T> c2672) {
        C2544 c2544;
        Type type = c2672.f10128;
        Class<? super T> cls = c2672.f10130;
        InterfaceC2659<?> interfaceC2659 = this.f9915.get(type);
        if (interfaceC2659 != null) {
            return new C2549(this, interfaceC2659, type);
        }
        InterfaceC2659<?> interfaceC26592 = this.f9915.get(cls);
        if (interfaceC26592 != null) {
            return new C2548(this, interfaceC26592, type);
        }
        InterfaceC2629<T> interfaceC2629 = null;
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f9914.mo4631(declaredConstructor);
            }
            c2544 = new C2544(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            c2544 = null;
        }
        if (c2544 != null) {
            return c2544;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            interfaceC2629 = SortedSet.class.isAssignableFrom(cls) ? new C2651<>(this) : EnumSet.class.isAssignableFrom(cls) ? new C2550<>(this, type) : Set.class.isAssignableFrom(cls) ? new C2652<>(this) : Queue.class.isAssignableFrom(cls) ? new C2633<>(this) : new C2636<>(this);
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                interfaceC2629 = new C2650<>(this);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                interfaceC2629 = new C2545<>(this);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                interfaceC2629 = new C2624<>(this);
            } else {
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    type2.getClass();
                    Type m4617 = C2625.m4617(type2);
                    Class<?> m4618 = C2625.m4618(m4617);
                    m4617.hashCode();
                    if (!String.class.isAssignableFrom(m4618)) {
                        interfaceC2629 = new C2648<>(this);
                    }
                }
                interfaceC2629 = new C2632<>(this);
            }
        }
        return interfaceC2629 != null ? interfaceC2629 : new C2635(this, cls, type);
    }
}
