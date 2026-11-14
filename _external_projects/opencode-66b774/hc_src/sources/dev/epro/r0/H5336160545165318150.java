package dev.epro.r0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H5336160545165318150 implements Serializable {
    public static final P4215636032809486793 b = new P4215636032809486793();
    public final Pattern a;

    public H5336160545165318150(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((M7765909118661531151) it.next()).a;
        }
        Pattern compile = Pattern.compile("^Proxy-Authorization\\s*:", P4215636032809486793.a(i));
        compile.getClass();
        this.a = compile;
    }

    public static U12307647644992999381 b(H5336160545165318150 h5336160545165318150, CharSequence charSequence) {
        h5336160545165318150.getClass();
        charSequence.getClass();
        Matcher matcher = h5336160545165318150.a.matcher(charSequence);
        matcher.getClass();
        return U8836654130139556418.l(matcher, 0, charSequence);
    }

    public static B2664082256516729321 c(H5336160545165318150 h5336160545165318150, CharSequence charSequence) {
        h5336160545165318150.getClass();
        if (charSequence.length() >= 0) {
            return new B2664082256516729321((Object) new P3286589736814227645((Object) h5336160545165318150, (Object) charSequence, (byte) 21), (F4096073349764486348) O8184708763649885836.h, (byte) 4);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + charSequence.length());
    }

    public final boolean a(CharSequence charSequence) {
        charSequence.getClass();
        return this.a.matcher(charSequence).find();
    }

    public final U12307647644992999381 d(int i, String str) {
        Matcher region = this.a.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (region.lookingAt()) {
            return new U12307647644992999381(region, str);
        }
        return null;
    }

    public final U12307647644992999381 e(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.a.matcher(charSequence);
        matcher.getClass();
        if (matcher.matches()) {
            return new U12307647644992999381(matcher, charSequence);
        }
        return null;
    }

    public final boolean f(CharSequence charSequence) {
        charSequence.getClass();
        return this.a.matcher(charSequence).matches();
    }

    public final String g(CharSequence charSequence, F4096073349764486348 f4096073349764486348) {
        charSequence.getClass();
        Matcher matcher = this.a.matcher(charSequence);
        matcher.getClass();
        int i = 0;
        U12307647644992999381 l = U8836654130139556418.l(matcher, 0, charSequence);
        if (l == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i, l.b().a);
            sb.append((CharSequence) f4096073349764486348.invoke(l));
            i = l.b().b + 1;
            l = l.d();
            if (i >= length) {
                break;
            }
        } while (l != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        return sb.toString();
    }

    public final String h(CharSequence charSequence, String str) {
        charSequence.getClass();
        String replaceAll = this.a.matcher(charSequence).replaceAll(str);
        replaceAll.getClass();
        return replaceAll;
    }

    public final List i(int i, String str) {
        str.getClass();
        M8927913404651150384.m0(i);
        Matcher matcher = this.a.matcher(str);
        if (i == 1 || !matcher.find()) {
            return K5751602218013079365.U(str.toString());
        }
        int i2 = 10;
        if (i > 0 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i - 1;
        int i4 = 0;
        do {
            arrayList.add(str.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            if (i3 >= 0 && arrayList.size() == i3) {
                break;
            }
        } while (matcher.find());
        arrayList.add(str.subSequence(i4, str.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String pattern = this.a.toString();
        pattern.getClass();
        return pattern;
    }

    public H5336160545165318150(String str) {
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.a = compile;
    }

    public H5336160545165318150(String str, M7765909118661531151 m7765909118661531151) {
        str.getClass();
        Pattern compile = Pattern.compile(str, P4215636032809486793.a(m7765909118661531151.a));
        compile.getClass();
        this.a = compile;
    }
}
