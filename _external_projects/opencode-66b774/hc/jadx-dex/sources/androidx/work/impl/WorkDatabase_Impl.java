package androidx.work.impl;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class WorkDatabase_Impl extends androidx.work.impl.WorkDatabase {
    public final dev.epro.r0.O12494175665883759871 l = new dev.epro.r0.O12494175665883759871(new dev.epro.r0.P3750678984247799506(this, (byte) 0));
    public final dev.epro.r0.O12494175665883759871 m = new dev.epro.r0.O12494175665883759871(new dev.epro.r0.P3750678984247799506(this, (byte) 1));
    public final dev.epro.r0.O12494175665883759871 n = new dev.epro.r0.O12494175665883759871(new dev.epro.r0.P3750678984247799506(this, (byte) 2));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final dev.epro.r0.O12494175665883759871 f143o = new dev.epro.r0.O12494175665883759871(new dev.epro.r0.P3750678984247799506(this, (byte) 3));
    public final dev.epro.r0.O12494175665883759871 p = new dev.epro.r0.O12494175665883759871(new dev.epro.r0.P3750678984247799506(this, (byte) 4));
    public final dev.epro.r0.O12494175665883759871 q = new dev.epro.r0.O12494175665883759871(new dev.epro.r0.P3750678984247799506(this, (byte) 5));
    public final dev.epro.r0.O12494175665883759871 r = new dev.epro.r0.O12494175665883759871(new dev.epro.r0.P3750678984247799506(this, (byte) 6));

    public WorkDatabase_Impl() {
        new dev.epro.r0.O12494175665883759871(new dev.epro.r0.N3036857611236089530(this, (byte) 26));
    }

    public final java.util.List d(java.util.LinkedHashMap linkedHashMap) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new dev.epro.r0.Y11786291788827544965(13, 14, (byte) 10));
        arrayList.add(new dev.epro.r0.T6855588684610159253((byte) 0));
        arrayList.add(new dev.epro.r0.Y11786291788827544965(16, 17, (byte) 11));
        arrayList.add(new dev.epro.r0.Y11786291788827544965(17, 18, (byte) 12));
        arrayList.add(new dev.epro.r0.Y11786291788827544965(18, 19, (byte) 13));
        arrayList.add(new dev.epro.r0.T6855588684610159253((byte) 1));
        arrayList.add(new dev.epro.r0.Y11786291788827544965(20, 21, (byte) 14));
        arrayList.add(new dev.epro.r0.Y11786291788827544965(22, 23, (byte) 15));
        arrayList.add(new dev.epro.r0.Y11786291788827544965(23, 24, (byte) 16));
        return arrayList;
    }

    public final dev.epro.r0.Q11096631689211733349 e() {
        return new dev.epro.r0.Q11096631689211733349(this, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), new java.lang.String[]{"Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference"});
    }

    public final dev.epro.r0.Y7729682184936279366 f() {
        return new dev.epro.r0.L4480019317650718358(this);
    }

    public final java.util.Set i() {
        return new java.util.LinkedHashSet();
    }

    public final java.util.LinkedHashMap j() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        dev.epro.r0.V6281043481934004271 v6281043481934004271A = dev.epro.r0.J17975719213314763068.a(dev.epro.r0.R6421434650946170247.class);
        dev.epro.r0.O2161699089510411363 o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
        linkedHashMap.put(v6281043481934004271A, o2161699089510411363);
        linkedHashMap.put(dev.epro.r0.J17975719213314763068.a(dev.epro.r0.I16138585026445501844.class), o2161699089510411363);
        linkedHashMap.put(dev.epro.r0.J17975719213314763068.a(dev.epro.r0.O7265960433762398955.class), o2161699089510411363);
        linkedHashMap.put(dev.epro.r0.J17975719213314763068.a(dev.epro.r0.O11820069373841472725.class), o2161699089510411363);
        linkedHashMap.put(dev.epro.r0.J17975719213314763068.a(dev.epro.r0.V86870880106114790.class), o2161699089510411363);
        linkedHashMap.put(dev.epro.r0.J17975719213314763068.a(dev.epro.r0.Z16582172441672663350.class), o2161699089510411363);
        linkedHashMap.put(dev.epro.r0.J17975719213314763068.a(dev.epro.r0.M11776140525670923943.class), o2161699089510411363);
        linkedHashMap.put(dev.epro.r0.J17975719213314763068.a(dev.epro.r0.B14824868959299866349.class), o2161699089510411363);
        return linkedHashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final dev.epro.r0.I16138585026445501844 s() {
        return (dev.epro.r0.I16138585026445501844) this.m.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final dev.epro.r0.M11776140525670923943 t() {
        return (dev.epro.r0.M11776140525670923943) this.r.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final dev.epro.r0.O11820069373841472725 u() {
        return (dev.epro.r0.O11820069373841472725) this.f143o.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final dev.epro.r0.V86870880106114790 v() {
        return (dev.epro.r0.V86870880106114790) this.p.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final dev.epro.r0.Z16582172441672663350 w() {
        return (dev.epro.r0.Z16582172441672663350) this.q.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final dev.epro.r0.R6421434650946170247 x() {
        return (dev.epro.r0.R6421434650946170247) this.l.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final dev.epro.r0.O7265960433762398955 y() {
        return (dev.epro.r0.O7265960433762398955) this.n.getValue();
    }
}
