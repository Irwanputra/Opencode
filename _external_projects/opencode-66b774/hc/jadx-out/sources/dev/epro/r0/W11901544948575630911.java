package dev.epro.r0;

import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class W11901544948575630911 extends K10678596132709730734 {
    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) throws IOException {
        if (d13396727227989475489.H() == 9) {
            d13396727227989475489.D();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(d13396727227989475489.F(), "_");
        String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) throws IOException {
        Locale locale = (Locale) obj;
        y14132333989764804283.D(locale == null ? null : locale.toString());
    }
}
