package dev.epro.r0;

import androidx.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U9795041254872424247 extends B1412794554478658227 {
    public final /* synthetic */ D6544101850911802081 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U9795041254872424247(D6544101850911802081 d6544101850911802081) {
        super(25);
        this.g = d6544101850911802081;
    }

    @Override // dev.epro.r0.B1412794554478658227
    public final Object a(Object obj) {
        return this.g.a.prepare((String) obj);
    }

    @Override // dev.epro.r0.B1412794554478658227
    public final void b(Object obj, Object obj2, Object obj3) throws Exception {
        ((String) obj).getClass();
        ((SQLiteStatement) obj2).close();
    }
}
