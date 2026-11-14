package dev.epro.r0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H2282843232792910150 implements LayoutInflater.Factory2 {
    public final P14575954172000745949 a;

    public H2282843232792910150(P14575954172000745949 p14575954172000745949) {
        this.a = p14575954172000745949;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        B11652692535345282996 e;
        boolean equals = B8973123839147806920.class.getName().equals(str);
        P14575954172000745949 p14575954172000745949 = this.a;
        if (equals) {
            return new B8973123839147806920(context, attributeSet, p14575954172000745949);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Z15406236664963307934.a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = C13374971588771233833.class.isAssignableFrom(U1393585516073146670.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    C13374971588771233833 z2 = resourceId != -1 ? p14575954172000745949.z(resourceId) : null;
                    if (z2 == null && string != null) {
                        J15730374346044043770 j15730374346044043770 = p14575954172000745949.c;
                        ArrayList arrayList = (ArrayList) j15730374346044043770.c;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                C13374971588771233833 c13374971588771233833 = (C13374971588771233833) arrayList.get(size);
                                if (c13374971588771233833 != null && string.equals(c13374971588771233833.x)) {
                                    z2 = c13374971588771233833;
                                    break;
                                }
                                size--;
                            } else {
                                Iterator it = ((HashMap) j15730374346044043770.d).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z2 = null;
                                        break;
                                    }
                                    B11652692535345282996 b11652692535345282996 = (B11652692535345282996) it.next();
                                    if (b11652692535345282996 != null) {
                                        C13374971588771233833 c133749715887712338332 = b11652692535345282996.c;
                                        if (string.equals(c133749715887712338332.x)) {
                                            z2 = c133749715887712338332;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (z2 == null && id != -1) {
                        z2 = p14575954172000745949.z(id);
                    }
                    if (z2 == null) {
                        U1393585516073146670 B = p14575954172000745949.B();
                        context.getClassLoader();
                        z2 = B.a(attributeValue);
                        z2.m = true;
                        if (resourceId == 0) {
                            resourceId = id;
                        }
                        z2.v = resourceId;
                        z2.w = id;
                        z2.x = string;
                        z2.n = true;
                        z2.r = p14575954172000745949;
                        C10994625127000459680 c10994625127000459680 = p14575954172000745949.t;
                        z2.s = c10994625127000459680;
                        R13227154569034155950 r13227154569034155950 = c10994625127000459680.r;
                        z2.C = true;
                        if ((c10994625127000459680 == null ? null : c10994625127000459680.q) != null) {
                            z2.C = true;
                        }
                        e = p14575954172000745949.a(z2);
                    } else {
                        if (z2.n) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        z2.n = true;
                        z2.r = p14575954172000745949;
                        C10994625127000459680 c109946251270004596802 = p14575954172000745949.t;
                        z2.s = c109946251270004596802;
                        R13227154569034155950 r132271545690341559502 = c109946251270004596802.r;
                        z2.C = true;
                        if ((c109946251270004596802 == null ? null : c109946251270004596802.q) != null) {
                            z2.C = true;
                        }
                        e = p14575954172000745949.e(z2);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    Z6416034831270929891 z6416034831270929891 = X3799397131215715439.a;
                    new D1853448697196391467("Attempting to use <fragment> tag to add fragment " + z2 + " to container " + viewGroup);
                    X3799397131215715439.a(z2).getClass();
                    z2.D = viewGroup;
                    e.j();
                    e.i();
                    S10973172697741180971.m(G6547577305291411977.s("Fragment ", attributeValue, " did not create a view."));
                    return null;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
