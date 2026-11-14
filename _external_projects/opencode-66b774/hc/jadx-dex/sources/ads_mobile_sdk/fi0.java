package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class fi0 {
    public final ads_mobile_sdk.jr0 a;
    public final java.util.concurrent.atomic.AtomicReference b;
    public final java.util.concurrent.atomic.AtomicReference c;
    public final android.app.ActivityManager d;

    public fi0(android.content.Context context, ads_mobile_sdk.jr0 jr0Var) {
        context.getClass();
        jr0Var.getClass();
        this.a = jr0Var;
        this.b = new java.util.concurrent.atomic.AtomicReference(ads_mobile_sdk.ph0.TIER_UNKNOWN);
        this.c = new java.util.concurrent.atomic.AtomicReference(ads_mobile_sdk.rh0.PROCESSOR_TIER_UNKNOWN);
        this.d = (android.app.ActivityManager) context.getSystemService(android.app.ActivityManager.class);
    }

    public final ads_mobile_sdk.qh0 a() {
        ads_mobile_sdk.jr0 jr0Var = this.a;
        jr0Var.getClass();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$11;
        if (!((java.lang.Boolean) jr0Var.a("gads:device_tier_manager:enabled", bool, aoVar)).booleanValue() || !((java.lang.Boolean) jr0Var.a("gads:available_memory_tier:enabled", java.lang.Boolean.FALSE, aoVar)).booleanValue()) {
            return ads_mobile_sdk.qh0.AVAILABLE_MEMORY_TIER_UNKNOWN;
        }
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        this.d.getMemoryInfo(memoryInfo);
        return (ads_mobile_sdk.qh0) a(memoryInfo.availMem, (java.util.List) jr0Var.a("gads:device_tier:available_memory_thresholds_gb", dev.epro.r0.K5751602218013079365.V(new java.lang.Integer[]{1, 2, 4, 6, 8, 12, 16}), ads_mobile_sdk.ao.a$19), dev.epro.r0.K5751602218013079365.V(new java.lang.Long[]{1L, 2L, 4L, 6L, 8L, 12L, 16L}), dev.epro.r0.K5751602218013079365.V(new ads_mobile_sdk.qh0[]{ads_mobile_sdk.qh0.AVAILABLE_MEMORY_TIER_EXTREME_LOW, ads_mobile_sdk.qh0.AVAILABLE_MEMORY_TIER_VERY_LOW, ads_mobile_sdk.qh0.AVAILABLE_MEMORY_TIER_LOW, ads_mobile_sdk.qh0.AVAILABLE_MEMORY_TIER_MID, ads_mobile_sdk.qh0.AVAILABLE_MEMORY_TIER_MID_PLUS, ads_mobile_sdk.qh0.AVAILABLE_MEMORY_TIER_HIGH, ads_mobile_sdk.qh0.AVAILABLE_MEMORY_TIER_VERY_HIGH}), ads_mobile_sdk.qh0.AVAILABLE_MEMORY_TIER_INVALID_DATA_SOURCE, ads_mobile_sdk.qh0.AVAILABLE_MEMORY_TIER_EXTREME_HIGH, 1073741824L);
    }

    public final void b() {
        long jE;
        ads_mobile_sdk.jr0 jr0Var = this.a;
        jr0Var.getClass();
        if (((java.lang.Boolean) jr0Var.a("gads:device_tier_manager:enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.b;
            java.lang.Object obj = atomicReference.get();
            ads_mobile_sdk.ph0 ph0Var = ads_mobile_sdk.ph0.TIER_UNKNOWN;
            java.util.concurrent.atomic.AtomicReference atomicReference2 = this.c;
            if (obj == ph0Var || atomicReference2.get() == ads_mobile_sdk.rh0.PROCESSOR_TIER_UNKNOWN) {
                int i = android.os.Build.VERSION.SDK_INT;
                android.app.ActivityManager activityManager = this.d;
                if (i >= 34) {
                    android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    jE = dev.epro.r0.J14472086795230312938.e(memoryInfo);
                } else {
                    android.app.ActivityManager.MemoryInfo memoryInfo2 = new android.app.ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo2);
                    jE = memoryInfo2.totalMem;
                }
                long j = jE;
                atomicReference.set((ads_mobile_sdk.ph0) a(j, (java.util.List) jr0Var.a("gads:device_tier:advertised_memory_thresholds_gb", dev.epro.r0.K5751602218013079365.V(new java.lang.Integer[]{1, 2, 4, 6, 8, 12, 16}), ads_mobile_sdk.ao.a$19), dev.epro.r0.K5751602218013079365.V(new java.lang.Long[]{1L, 2L, 4L, 6L, 8L, 12L, 16L}), dev.epro.r0.K5751602218013079365.V(new ads_mobile_sdk.ph0[]{ads_mobile_sdk.ph0.TIER_EXTREME_LOW, ads_mobile_sdk.ph0.TIER_VERY_LOW, ads_mobile_sdk.ph0.TIER_LOW, ads_mobile_sdk.ph0.TIER_MID, ads_mobile_sdk.ph0.TIER_MID_PLUS, ads_mobile_sdk.ph0.TIER_HIGH, ads_mobile_sdk.ph0.TIER_VERY_HIGH}), ads_mobile_sdk.ph0.TIER_INVALID_DATA_SOURCE, ads_mobile_sdk.ph0.TIER_EXTREME_HIGH, 1073741824L));
                atomicReference2.set(a(java.lang.Runtime.getRuntime().availableProcessors()));
            }
        }
    }

    public final ads_mobile_sdk.rh0 a(int i) {
        long j = i;
        ads_mobile_sdk.jr0 jr0Var = this.a;
        jr0Var.getClass();
        return (ads_mobile_sdk.rh0) a(j, (java.util.List) jr0Var.a("gads:device_tier:available_processor_thresholds", dev.epro.r0.K5751602218013079365.V(new java.lang.Integer[]{2, 4, 6, 8, 10}), ads_mobile_sdk.ao.a$19), dev.epro.r0.K5751602218013079365.V(new java.lang.Long[]{2L, 4L, 6L, 8L, 10L}), dev.epro.r0.K5751602218013079365.V(new ads_mobile_sdk.rh0[]{ads_mobile_sdk.rh0.PROCESSOR_TIER_EXTREME_LOW, ads_mobile_sdk.rh0.PROCESSOR_TIER_LOW, ads_mobile_sdk.rh0.PROCESSOR_TIER_MID, ads_mobile_sdk.rh0.PROCESSOR_TIER_MID_PLUS, ads_mobile_sdk.rh0.PROCESSOR_TIER_HIGH}), ads_mobile_sdk.rh0.PROCESSOR_TIER_INVALID_DATA_SOURCE, ads_mobile_sdk.rh0.PROCESSOR_TIER_EXTREME_HIGH, 1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static java.lang.Object a(long j, java.util.List list, java.util.List list2, java.util.List list3, java.lang.Enum r7, java.lang.Enum r8, long j2) {
        if (j <= 0) {
            return r7;
        }
        if (!list.isEmpty()) {
            list2 = new java.util.ArrayList(dev.epro.r0.Z115818233709597990.k0(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(java.lang.Long.valueOf(((java.lang.Number) it.next()).intValue()));
            }
        }
        int size = list2.size();
        for (int i = 0; i < size && i < list3.size(); i++) {
            if (j <= ((java.lang.Number) list2.get(i)).longValue() * j2) {
                return list3.get(i);
            }
        }
        return r8;
    }
}
