package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A9351041829071350263 implements H7323971265464188398 {
    public final A9351041829071350263 a;
    public final J7128855986599981135 b;

    public A9351041829071350263(A9351041829071350263 a9351041829071350263, J7128855986599981135 j7128855986599981135) {
        this.a = a9351041829071350263;
        this.b = j7128855986599981135;
    }

    public final void a(J7128855986599981135 j7128855986599981135) {
        if (this.b == j7128855986599981135) {
            S10973172697741180971.m("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        A9351041829071350263 a9351041829071350263 = this.a;
        if (a9351041829071350263 != null) {
            a9351041829071350263.a(j7128855986599981135);
        }
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final Object fold(L12639328004344855510 l12639328004344855510, Object obj) {
        return l12639328004344855510.invoke(obj, this);
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final /* bridge */ H7323971265464188398 get(R12081023847482212386 r12081023847482212386) {
        return S10823041268949770285.I(this, r12081023847482212386);
    }

    @Override // dev.epro.r0.H7323971265464188398
    public final R12081023847482212386 getKey() {
        return T13350664027331345869.G;
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final /* bridge */ G8001132634698687269 minusKey(R12081023847482212386 r12081023847482212386) {
        return S10823041268949770285.M(this, r12081023847482212386);
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final /* bridge */ G8001132634698687269 plus(G8001132634698687269 g8001132634698687269) {
        return S10823041268949770285.O(this, g8001132634698687269);
    }
}
