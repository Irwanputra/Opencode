package dev.epro.r0;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T977856106332750807 extends F7192844493769026772 {
    public static T977856106332750807 c;
    public static final O12545633033254628644 d = new O12545633033254628644((byte) 5);
    public final Application b;

    public T977856106332750807(Application application) {
        this.b = application;
    }

    @Override // dev.epro.r0.F7192844493769026772, dev.epro.r0.Q15796038708469204840
    public final J14024120050125738337 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        D11988991656201568495.j("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // dev.epro.r0.F7192844493769026772, dev.epro.r0.Q15796038708469204840
    public final J14024120050125738337 b(Class cls, X8580441079827879338 x8580441079827879338) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) x8580441079827879338.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!T137263189637380015.class.isAssignableFrom(cls)) {
            return A10225670138084435446.B(cls);
        }
        S10973172697741180971.j("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final J14024120050125738337 d(Class cls, Application application) {
        if (!T137263189637380015.class.isAssignableFrom(cls)) {
            return A10225670138084435446.B(cls);
        }
        try {
            J14024120050125738337 j14024120050125738337 = (J14024120050125738337) cls.getConstructor(Application.class).newInstance(application);
            j14024120050125738337.getClass();
            return j14024120050125738337;
        } catch (IllegalAccessException e) {
            K2042933864045806308.m("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            K2042933864045806308.m("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            K2042933864045806308.m("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            K2042933864045806308.m("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
