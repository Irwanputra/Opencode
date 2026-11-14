package dev.epro.r0;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C9545841876279676430 {
    public final Q13914734507241918864 a;
    public final N12253737202470468561 b;
    public final R6421434650946170247 c;

    static {
        B14824868959299866349.o("WMFgUpdater");
    }

    public C9545841876279676430(WorkDatabase workDatabase, N12253737202470468561 n12253737202470468561, Q13914734507241918864 q13914734507241918864) {
        this.b = n12253737202470468561;
        this.a = q13914734507241918864;
        this.c = workDatabase.x();
    }
}
