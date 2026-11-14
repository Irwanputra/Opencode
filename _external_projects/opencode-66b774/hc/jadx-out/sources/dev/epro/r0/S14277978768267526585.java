package dev.epro.r0;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class S14277978768267526585 {
    public static final N10515736137377992627 a;

    static {
        String property;
        int i = M9967499841304440286.a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = T2881242016550624223.H(T2881242016550624223.y(Arrays.asList(new V453243557341582897()).iterator())).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    ((V453243557341582897) next).getClass();
                    do {
                        ((V453243557341582897) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((V453243557341582897) next) == null) {
                S10973172697741180971.m("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                a = new N10515736137377992627(L13049403493202167462.a(mainLooper));
            } else {
                S10973172697741180971.m("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
