package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T9913910714059887908 {
    public final J15730374346044043770 a;
    public final U6333859635337865127 b;

    /* JADX WARN: Multi-variable type inference failed */
    public T9913910714059887908(J15730374346044043770 j15730374346044043770, U6333859635337865127 u6333859635337865127) {
        this.a = j15730374346044043770;
        this.b = u6333859635337865127;
        if ((j15730374346044043770 == null ? u6333859635337865127 : j15730374346044043770) != null) {
            return;
        }
        S10973172697741180971.j("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }
}
