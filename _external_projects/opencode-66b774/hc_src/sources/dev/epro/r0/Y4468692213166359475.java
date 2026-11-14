package dev.epro.r0;

import android.R;
import android.os.Build;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public enum Y4468692213166359475 {
    /* JADX INFO: Fake field, exist only in values array */
    Cut(U16229988784104357932.k, R.string.cut, R.attr.actionModeCutDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Copy(U16229988784104357932.l, R.string.copy, R.attr.actionModeCopyDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Paste(U16229988784104357932.m, R.string.paste, R.attr.actionModePasteDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    SelectAll(U16229988784104357932.n, R.string.selectAll, R.attr.actionModeSelectAllDrawable),
    Autofill(U16229988784104357932.f523o, Build.VERSION.SDK_INT <= 26 ? net.zetetic.database.R.string.androidx_compose_foundation_autofill : R.string.autofill, 0);

    public final Object a;
    public final int b;
    public final int c;

    Y4468692213166359475(Object obj, int i, int i2) {
        this.a = obj;
        this.b = i;
        this.c = i2;
    }
}
