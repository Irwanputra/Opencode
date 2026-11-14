package org.chromium.net;

import android.content.Context;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.M69217867917312856;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.W13223114868094258148;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public abstract class CronetProvider {
    private static final String GMS_CORE_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.GmsCoreCronetProvider";
    private static final String JAVA_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.JavaCronetProvider";
    private static final String NATIVE_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.NativeCronetProvider";
    private static final String PLAY_SERVICES_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.PlayServicesCronetProvider";
    public static final String PROVIDER_NAME_APP_PACKAGED = "App-Packaged-Cronet-Provider";
    public static final String PROVIDER_NAME_FALLBACK = "Fallback-Cronet-Provider";
    private static final String RES_KEY_CRONET_IMPL_CLASS = "CronetProviderClassName";
    private static final String TAG = "CronetProvider";
    protected final Context mContext;

    public CronetProvider(Context context) {
        if (context != null) {
            this.mContext = context;
        } else {
            S10973172697741180971.j("Context must not be null");
            throw null;
        }
    }

    private static boolean addCronetProviderFromResourceFile(Context context, W13223114868094258148 w13223114868094258148, Set<M69217867917312856> set) {
        String string;
        int identifier = context.getResources().getIdentifier(RES_KEY_CRONET_IMPL_CLASS, "string", context.getPackageName());
        if (identifier == 0 || (string = context.getString(identifier)) == null || string.equals(PLAY_SERVICES_CRONET_PROVIDER_CLASS) || string.equals(GMS_CORE_CRONET_PROVIDER_CLASS) || string.equals(JAVA_CRONET_PROVIDER_CLASS) || string.equals(NATIVE_CRONET_PROVIDER_CLASS)) {
            return false;
        }
        addCronetProviderImplByClassName(context, string, w13223114868094258148, set, true);
        return true;
    }

    private static boolean addCronetProviderImplByClassName(Context context, String str, W13223114868094258148 w13223114868094258148, Set<M69217867917312856> set, boolean z) {
        try {
            Constructor constructor = context.getClassLoader().loadClass(str).asSubclass(CronetProvider.class).getConstructor(Context.class);
            M69217867917312856 m69217867917312856 = new M69217867917312856();
            m69217867917312856.a = (CronetProvider) constructor.newInstance(context);
            m69217867917312856.b = w13223114868094258148;
            set.add(m69217867917312856);
            return true;
        } catch (ClassNotFoundException e) {
            logReflectiveOperationException(str, z, e);
            return false;
        } catch (IllegalAccessException e2) {
            logReflectiveOperationException(str, z, e2);
            return false;
        } catch (InstantiationException e3) {
            logReflectiveOperationException(str, z, e3);
            return false;
        } catch (NoSuchMethodException e4) {
            logReflectiveOperationException(str, z, e4);
            return false;
        } catch (InvocationTargetException e5) {
            logReflectiveOperationException(str, z, e5);
            return false;
        }
    }

    public static List<M69217867917312856> getAllProviderInfos(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        addCronetProviderFromResourceFile(context, W13223114868094258148.a, linkedHashSet);
        W13223114868094258148 w13223114868094258148 = W13223114868094258148.c;
        addCronetProviderImplByClassName(context, PLAY_SERVICES_CRONET_PROVIDER_CLASS, w13223114868094258148, linkedHashSet, false);
        addCronetProviderImplByClassName(context, GMS_CORE_CRONET_PROVIDER_CLASS, w13223114868094258148, linkedHashSet, false);
        addCronetProviderImplByClassName(context, NATIVE_CRONET_PROVIDER_CLASS, W13223114868094258148.b, linkedHashSet, false);
        addCronetProviderImplByClassName(context, JAVA_CRONET_PROVIDER_CLASS, W13223114868094258148.d, linkedHashSet, false);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public static List<CronetProvider> getAllProviders(Context context) {
        ArrayList arrayList = new ArrayList();
        Iterator<M69217867917312856> it = getAllProviderInfos(context).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public abstract CronetEngine.Builder createBuilder();

    public abstract String getName();

    public abstract String getVersion();

    public abstract boolean isEnabled();

    public String toString() {
        String name = getClass().getName();
        String name2 = getName();
        String version = getVersion();
        boolean zIsEnabled = isEnabled();
        StringBuilder sbY = G6547577305291411977.y("[class=", name, ", name=", name2, ", version=");
        sbY.append(version);
        sbY.append(", enabled=");
        sbY.append(zIsEnabled);
        sbY.append("]");
        return sbY.toString();
    }

    private static void logReflectiveOperationException(String str, boolean z, Exception exc) {
    }
}
