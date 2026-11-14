package dev.epro.r0;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F17886576884473518056 extends L14144435763408236280 implements N16696004871980921107 {
    public final Object j;

    public F17886576884473518056(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", (byte) 3);
        this.j = obj;
    }

    public static N16696004871980921107 d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof N16696004871980921107 ? (N16696004871980921107) queryLocalInterface : new W11493741211317946243(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", (byte) 2);
    }

    public static Object e(N16696004871980921107 n16696004871980921107) {
        if (n16696004871980921107 instanceof F17886576884473518056) {
            return ((F17886576884473518056) n16696004871980921107).j;
        }
        IBinder asBinder = n16696004871980921107.asBinder();
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
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 53);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        M18113111391818111737.v(field);
        if (field.isAccessible()) {
            S10973172697741180971.j("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
