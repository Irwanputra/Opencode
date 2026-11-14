package dev.epro.r0;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V4328009209000729594 extends A6444062906512207770 {
    @Override // dev.epro.r0.A6444062906512207770
    public final Font y(J18236984568855953541 j18236984568855953541) {
        Font d;
        Uri uri = j18236984568855953541.a;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str = j18236984568855953541.e;
        String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface create = Typeface.create(authority, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (d = K4066258037408482587.d(create)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return d;
                }
                try {
                    return new Font.Builder(d).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }
}
