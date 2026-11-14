package org.chromium.net;

import android.net.TrafficStats;
import dev.epro.r0.Z3383101362411723454;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public class ThreadStatsUid {
    private static final Method sClearThreadStatsUid;
    private static final Method sSetThreadStatsUid;

    static {
        try {
            sSetThreadStatsUid = TrafficStats.class.getMethod("setThreadStatsUid", Integer.TYPE);
            sClearThreadStatsUid = TrafficStats.class.getMethod("clearThreadStatsUid", null);
        } catch (NoSuchMethodException | SecurityException e) {
            Z3383101362411723454.m("Unable to get TrafficStats methods", e);
        }
    }

    public static void clear() {
        try {
            sClearThreadStatsUid.invoke(null, null);
        } catch (IllegalAccessException e) {
            Z3383101362411723454.m("TrafficStats.clearThreadStatsUid failed", e);
        } catch (InvocationTargetException e2) {
            Z3383101362411723454.m("TrafficStats.clearThreadStatsUid failed", e2);
        }
    }

    public static void set(int i) {
        try {
            sSetThreadStatsUid.invoke(null, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            Z3383101362411723454.m("TrafficStats.setThreadStatsUid failed", e);
        } catch (InvocationTargetException e2) {
            Z3383101362411723454.m("TrafficStats.setThreadStatsUid failed", e2);
        }
    }
}
