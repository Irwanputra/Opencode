package dev.epro.r0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L12119018558356739237 implements S4170173850086311843 {
    public final InputContentInfo a;

    public L12119018558356739237(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // dev.epro.r0.S4170173850086311843
    public final Object a() {
        return this.a;
    }

    @Override // dev.epro.r0.S4170173850086311843
    public final Uri b() {
        return this.a.getContentUri();
    }

    @Override // dev.epro.r0.S4170173850086311843
    public final void d() {
        this.a.requestPermission();
    }

    @Override // dev.epro.r0.S4170173850086311843
    public final Uri e() {
        return this.a.getLinkUri();
    }

    @Override // dev.epro.r0.S4170173850086311843
    public final ClipDescription getDescription() {
        return this.a.getDescription();
    }

    public L12119018558356739237(Object obj) {
        this.a = (InputContentInfo) obj;
    }
}
