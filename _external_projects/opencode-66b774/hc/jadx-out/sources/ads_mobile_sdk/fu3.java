package ads_mobile_sdk;

import dev.epro.r0.K1641439379888813200;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fu3 implements Supplier {
    public final /* synthetic */ boolean a;
    public static final /* synthetic */ fu3 c = new fu3(1);
    public static final /* synthetic */ fu3 b = new fu3(0);

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fu3(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? vu3.a((Object) null) : new K1641439379888813200();
    }
}
