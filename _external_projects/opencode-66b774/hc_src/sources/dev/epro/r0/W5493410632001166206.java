package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W5493410632001166206 implements C13258628320776285546 {
    public static final W5493410632001166206 a = new W5493410632001166206();
    public static Boolean b;

    @Override // dev.epro.r0.C13258628320776285546
    public final boolean a() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw L11610354117192841236.j("canFocus is read before it is written");
    }

    @Override // dev.epro.r0.C13258628320776285546
    public final void c(boolean z) {
        b = Boolean.valueOf(z);
    }
}
