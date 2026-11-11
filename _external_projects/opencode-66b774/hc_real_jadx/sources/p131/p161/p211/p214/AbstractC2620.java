package p131.p161.p211.p214;

import java.lang.reflect.Modifier;
import p131.p155.p156.p157.C2098;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぉ〲なぱぽた, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC2620 {
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m4610(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder m4207 = C2098.m4207("Interface can't be instantiated! Interface name: ");
            m4207.append(cls.getName());
            throw new UnsupportedOperationException(m4207.toString());
        }
        if (Modifier.isAbstract(modifiers)) {
            StringBuilder m42072 = C2098.m4207("Abstract class can't be instantiated! Class name: ");
            m42072.append(cls.getName());
            throw new UnsupportedOperationException(m42072.toString());
        }
    }

    /* renamed from: 〺つふすそ */
    public abstract <T> T mo4590(Class<T> cls);
}
