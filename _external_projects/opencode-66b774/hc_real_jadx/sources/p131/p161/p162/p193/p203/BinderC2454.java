package p131.p161.p162.p193.p203;

import android.os.IBinder;
import java.lang.reflect.Field;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.づざかべべ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class BinderC2454<T> extends InterfaceC2455.AbstractBinderC2456 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final T f9803;

    public BinderC2454(T t) {
        this.f9803 = t;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static <T> T m4502(InterfaceC2455 interfaceC2455) {
        if (interfaceC2455 instanceof BinderC2454) {
            return ((BinderC2454) interfaceC2455).f9803;
        }
        IBinder asBinder = interfaceC2455.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
