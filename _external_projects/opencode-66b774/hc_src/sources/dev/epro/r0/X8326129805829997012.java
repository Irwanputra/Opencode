package dev.epro.r0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class X8326129805829997012 {
    public final O827298036535440209 a;
    public final O827298036535440209 b;
    public final O827298036535440209 c;

    public X8326129805829997012(O827298036535440209 o827298036535440209, O827298036535440209 o8272980365354402092, O827298036535440209 o8272980365354402093) {
        this.a = o827298036535440209;
        this.b = o8272980365354402092;
        this.c = o8272980365354402093;
    }

    public abstract H12008688365557887712 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        O827298036535440209 o827298036535440209 = this.c;
        Class cls2 = (Class) o827298036535440209.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        o827298036535440209.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        O827298036535440209 o827298036535440209 = this.a;
        Method method = (Method) o827298036535440209.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, X8326129805829997012.class.getClassLoader()).getDeclaredMethod("read", X8326129805829997012.class);
        o827298036535440209.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        O827298036535440209 o827298036535440209 = this.b;
        Method method = (Method) o827298036535440209.get(name);
        if (method != null) {
            return method;
        }
        Class b = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, X8326129805829997012.class);
        o827298036535440209.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((H12008688365557887712) this).e.readParcelable(H12008688365557887712.class.getClassLoader());
    }

    public final Q4740749949665887008 g() {
        String readString = ((H12008688365557887712) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (Q4740749949665887008) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            Z3383101362411723454.m("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            Z3383101362411723454.m("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Z3383101362411723454.m("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            Z3383101362411723454.m("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void h(int i);

    public final void i(Q4740749949665887008 q4740749949665887008) {
        if (q4740749949665887008 == null) {
            ((H12008688365557887712) this).e.writeString(null);
            return;
        }
        try {
            ((H12008688365557887712) this).e.writeString(b(q4740749949665887008.getClass()).getName());
            H12008688365557887712 a = a();
            try {
                d(q4740749949665887008.getClass()).invoke(null, q4740749949665887008, a);
                Parcel parcel = a.e;
                int i = a.i;
                if (i >= 0) {
                    int i2 = a.d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                Z3383101362411723454.m("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                Z3383101362411723454.m("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                Z3383101362411723454.m("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                Z3383101362411723454.m("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            Z3383101362411723454.m(q4740749949665887008.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
