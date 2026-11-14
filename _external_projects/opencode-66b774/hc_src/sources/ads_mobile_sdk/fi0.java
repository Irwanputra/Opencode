package ads_mobile_sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.Z115818233709597990;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class fi0 {
    public final jr0 a;
    public final AtomicReference b;
    public final AtomicReference c;
    public final ActivityManager d;

    public fi0(Context context, jr0 jr0Var) {
        context.getClass();
        jr0Var.getClass();
        this.a = jr0Var;
        this.b = new AtomicReference(ph0.TIER_UNKNOWN);
        this.c = new AtomicReference(rh0.PROCESSOR_TIER_UNKNOWN);
        this.d = (ActivityManager) context.getSystemService(ActivityManager.class);
    }

    public final qh0 a() {
        jr0 jr0Var = this.a;
        jr0Var.getClass();
        Boolean bool = Boolean.TRUE;
        ao aoVar = ao.a$11;
        if (!((Boolean) jr0Var.a("gads:device_tier_manager:enabled", bool, aoVar)).booleanValue() || !((Boolean) jr0Var.a("gads:available_memory_tier:enabled", Boolean.FALSE, aoVar)).booleanValue()) {
            return qh0.AVAILABLE_MEMORY_TIER_UNKNOWN;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.d.getMemoryInfo(memoryInfo);
        return (qh0) a(memoryInfo.availMem, (List) jr0Var.a("gads:device_tier:available_memory_thresholds_gb", K5751602218013079365.V(1, 2, 4, 6, 8, 12, 16), ao.a$19), K5751602218013079365.V(1L, 2L, 4L, 6L, 8L, 12L, 16L), K5751602218013079365.V(qh0.AVAILABLE_MEMORY_TIER_EXTREME_LOW, qh0.AVAILABLE_MEMORY_TIER_VERY_LOW, qh0.AVAILABLE_MEMORY_TIER_LOW, qh0.AVAILABLE_MEMORY_TIER_MID, qh0.AVAILABLE_MEMORY_TIER_MID_PLUS, qh0.AVAILABLE_MEMORY_TIER_HIGH, qh0.AVAILABLE_MEMORY_TIER_VERY_HIGH), qh0.AVAILABLE_MEMORY_TIER_INVALID_DATA_SOURCE, qh0.AVAILABLE_MEMORY_TIER_EXTREME_HIGH, 1073741824L);
    }

    public final void b() {
        long j;
        jr0 jr0Var = this.a;
        jr0Var.getClass();
        if (((Boolean) jr0Var.a("gads:device_tier_manager:enabled", Boolean.TRUE, ao.a$11)).booleanValue()) {
            AtomicReference atomicReference = this.b;
            Object obj = atomicReference.get();
            ph0 ph0Var = ph0.TIER_UNKNOWN;
            AtomicReference atomicReference2 = this.c;
            if (obj == ph0Var || atomicReference2.get() == rh0.PROCESSOR_TIER_UNKNOWN) {
                int i = Build.VERSION.SDK_INT;
                ActivityManager activityManager = this.d;
                if (i >= 34) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    j = memoryInfo.advertisedMem;
                } else {
                    ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo2);
                    j = memoryInfo2.totalMem;
                }
                long j2 = j;
                atomicReference.set((ph0) a(j2, (List) jr0Var.a("gads:device_tier:advertised_memory_thresholds_gb", K5751602218013079365.V(1, 2, 4, 6, 8, 12, 16), ao.a$19), K5751602218013079365.V(1L, 2L, 4L, 6L, 8L, 12L, 16L), K5751602218013079365.V(ph0.TIER_EXTREME_LOW, ph0.TIER_VERY_LOW, ph0.TIER_LOW, ph0.TIER_MID, ph0.TIER_MID_PLUS, ph0.TIER_HIGH, ph0.TIER_VERY_HIGH), ph0.TIER_INVALID_DATA_SOURCE, ph0.TIER_EXTREME_HIGH, 1073741824L));
                atomicReference2.set(a(Runtime.getRuntime().availableProcessors()));
            }
        }
    }

    public final rh0 a(int i) {
        long j = i;
        jr0 jr0Var = this.a;
        jr0Var.getClass();
        return (rh0) a(j, (List) jr0Var.a("gads:device_tier:available_processor_thresholds", K5751602218013079365.V(2, 4, 6, 8, 10), ao.a$19), K5751602218013079365.V(2L, 4L, 6L, 8L, 10L), K5751602218013079365.V(rh0.PROCESSOR_TIER_EXTREME_LOW, rh0.PROCESSOR_TIER_LOW, rh0.PROCESSOR_TIER_MID, rh0.PROCESSOR_TIER_MID_PLUS, rh0.PROCESSOR_TIER_HIGH), rh0.PROCESSOR_TIER_INVALID_DATA_SOURCE, rh0.PROCESSOR_TIER_EXTREME_HIGH, 1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static Object a(long j, List list, List list2, List list3, Enum r7, Enum r8, long j2) {
        if (j <= 0) {
            return r7;
        }
        if (!list.isEmpty()) {
            list2 = new ArrayList(Z115818233709597990.k0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(Long.valueOf(((Number) it.next()).intValue()));
            }
        }
        int size = list2.size();
        for (int i = 0; i < size && i < list3.size(); i++) {
            if (j <= ((Number) list2.get(i)).longValue() * j2) {
                return list3.get(i);
            }
        }
        return r8;
    }
}
