package dev.epro.r0;

import java.util.List;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U12307647644992999381 {
    public final Matcher a;
    public final CharSequence b;
    public final C8145984272139078584 c;
    public A10468597346719636873 d;

    public U12307647644992999381(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new C8145984272139078584(this, (byte) 0);
    }

    public final List a() {
        A10468597346719636873 a10468597346719636873 = this.d;
        if (a10468597346719636873 != null) {
            return a10468597346719636873;
        }
        A10468597346719636873 a104685973467196368732 = new A10468597346719636873(this);
        this.d = a104685973467196368732;
        return a104685973467196368732;
    }

    public final P8646985343900033725 b() {
        Matcher matcher = this.a;
        return W7808703833045379622.N(matcher.start(), matcher.end());
    }

    public final String c() {
        String group = this.a.group();
        group.getClass();
        return group;
    }

    public final U12307647644992999381 d() {
        Matcher matcher = this.a;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return U8836654130139556418.l(matcher2, end, charSequence);
    }
}
