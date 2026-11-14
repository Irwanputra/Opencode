package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A9351041829071350263 implements dev.epro.r0.H7323971265464188398 {
    public final dev.epro.r0.A9351041829071350263 a;
    public final dev.epro.r0.J7128855986599981135 b;

    public A9351041829071350263(dev.epro.r0.A9351041829071350263 a9351041829071350263, dev.epro.r0.J7128855986599981135 j7128855986599981135) {
        this.a = a9351041829071350263;
        this.b = j7128855986599981135;
    }

    public final void a(dev.epro.r0.J7128855986599981135 j7128855986599981135) {
        if (this.b == j7128855986599981135) {
            dev.epro.r0.S10973172697741180971.m("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        dev.epro.r0.A9351041829071350263 a9351041829071350263 = this.a;
        if (a9351041829071350263 != null) {
            a9351041829071350263.a(j7128855986599981135);
        }
    }

    public final java.lang.Object fold(dev.epro.r0.L12639328004344855510 l12639328004344855510, java.lang.Object obj) {
        return l12639328004344855510.invoke(obj, this);
    }

    public final /* bridge */ dev.epro.r0.H7323971265464188398 get(dev.epro.r0.R12081023847482212386 r12081023847482212386) {
        return dev.epro.r0.S10823041268949770285.I(this, r12081023847482212386);
    }

    public final dev.epro.r0.R12081023847482212386 getKey() {
        return dev.epro.r0.T13350664027331345869.G;
    }

    public final /* bridge */ dev.epro.r0.G8001132634698687269 minusKey(dev.epro.r0.R12081023847482212386 r12081023847482212386) {
        return dev.epro.r0.S10823041268949770285.M(this, r12081023847482212386);
    }

    public final /* bridge */ dev.epro.r0.G8001132634698687269 plus(dev.epro.r0.G8001132634698687269 g8001132634698687269) {
        return dev.epro.r0.S10823041268949770285.O(this, g8001132634698687269);
    }
}
