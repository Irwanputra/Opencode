package dev.epro.r0;

import android.text.Editable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U5279105031341998911 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile U5279105031341998911 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new E9997701474979625536(cls, charSequence) : super.newEditable(charSequence);
    }
}
