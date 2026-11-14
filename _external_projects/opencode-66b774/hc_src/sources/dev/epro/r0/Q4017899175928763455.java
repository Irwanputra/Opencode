package dev.epro.r0;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class Q4017899175928763455 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static P16142420860494385953 b(View view, P16142420860494385953 p16142420860494385953) {
        ContentInfo n = p16142420860494385953.a.n();
        Objects.requireNonNull(n);
        ContentInfo performReceiveContent = view.performReceiveContent(n);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == n ? p16142420860494385953 : new P16142420860494385953(new H12843822278061842084(performReceiveContent));
    }
}
