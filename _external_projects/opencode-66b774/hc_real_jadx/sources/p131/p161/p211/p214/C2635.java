package p131.p161.p211.p214;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import p131.p155.p156.p157.C2098;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2635<T> implements InterfaceC2629<T> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ Class f10076;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ Type f10077;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final AbstractC2620 f10078;

    public C2635(C2547 c2547, Class cls, Type type) {
        AbstractC2620 c2546;
        this.f10076 = cls;
        this.f10077 = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            c2546 = new C2630(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    c2546 = new C2634(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    c2546 = new C2649(declaredMethod3);
                }
            } catch (Exception unused3) {
                c2546 = new C2546();
            }
        }
        this.f10078 = c2546;
    }

    @Override // p131.p161.p211.p214.InterfaceC2629
    /* renamed from: げつ〴ぬぐ */
    public T mo4589() {
        try {
            return (T) this.f10078.mo4590(this.f10076);
        } catch (Exception e) {
            StringBuilder m4207 = C2098.m4207("Unable to invoke no-args constructor for ");
            m4207.append(this.f10077);
            m4207.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(m4207.toString(), e);
        }
    }
}
