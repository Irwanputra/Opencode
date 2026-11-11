package p034.p086.p090;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: づざかべべ.なぎぱいぢぎ.くし〴〺ぅ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1560 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final ConstraintLayout f7323;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f7321 = -1;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f7322 = -1;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public SparseArray<C1562> f7325 = new SparseArray<>();

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public SparseArray<C1566> f7324 = new SparseArray<>();

    /* renamed from: づざかべべ.なぎぱいぢぎ.くし〴〺ぅ.〺つふすそ$〺つふすそ, reason: contains not printable characters */
    public static class C1561 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public float f7326;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public float f7327;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public float f7328;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f7329;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public C1566 f7330;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public float f7331;

        public C1561(Context context, XmlPullParser xmlPullParser) {
            this.f7328 = Float.NaN;
            this.f7326 = Float.NaN;
            this.f7327 = Float.NaN;
            this.f7331 = Float.NaN;
            this.f7329 = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1575.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1575.Variant_constraints) {
                    this.f7329 = obtainStyledAttributes.getResourceId(index, this.f7329);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f7329);
                    context.getResources().getResourceName(this.f7329);
                    if ("layout".equals(resourceTypeName)) {
                        C1566 c1566 = new C1566();
                        this.f7330 = c1566;
                        c1566.m3511(context, this.f7329);
                    }
                } else if (index == C1575.Variant_region_heightLessThan) {
                    this.f7331 = obtainStyledAttributes.getDimension(index, this.f7331);
                } else if (index == C1575.Variant_region_heightMoreThan) {
                    this.f7326 = obtainStyledAttributes.getDimension(index, this.f7326);
                } else if (index == C1575.Variant_region_widthLessThan) {
                    this.f7327 = obtainStyledAttributes.getDimension(index, this.f7327);
                } else if (index == C1575.Variant_region_widthMoreThan) {
                    this.f7328 = obtainStyledAttributes.getDimension(index, this.f7328);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean m3499(float f, float f2) {
            if (!Float.isNaN(this.f7328) && f < this.f7328) {
                return false;
            }
            if (!Float.isNaN(this.f7326) && f2 < this.f7326) {
                return false;
            }
            if (Float.isNaN(this.f7327) || f <= this.f7327) {
                return Float.isNaN(this.f7331) || f2 <= this.f7331;
            }
            return false;
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.くし〴〺ぅ.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1562 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public ArrayList<C1561> f7332 = new ArrayList<>();

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f7333;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f7334;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public C1566 f7335;

        public C1562(Context context, XmlPullParser xmlPullParser) {
            this.f7333 = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1575.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1575.State_android_id) {
                    this.f7334 = obtainStyledAttributes.getResourceId(index, this.f7334);
                } else if (index == C1575.State_constraints) {
                    this.f7333 = obtainStyledAttributes.getResourceId(index, this.f7333);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f7333);
                    context.getResources().getResourceName(this.f7333);
                    if ("layout".equals(resourceTypeName)) {
                        C1566 c1566 = new C1566();
                        this.f7335 = c1566;
                        c1566.m3511(context, this.f7333);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int m3500(float f, float f2) {
            for (int i = 0; i < this.f7332.size(); i++) {
                if (this.f7332.get(i).m3499(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public C1560(Context context, ConstraintLayout constraintLayout, int i) {
        char c;
        this.f7323 = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C1562 c1562 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 0 && c != 1) {
                        if (c == 2) {
                            C1562 c15622 = new C1562(context, xml);
                            this.f7325.put(c15622.f7334, c15622);
                            c1562 = c15622;
                        } else if (c == 3) {
                            C1561 c1561 = new C1561(context, xml);
                            if (c1562 != null) {
                                c1562.f7332.add(c1561);
                            }
                        } else if (c == 4) {
                            m3498(context, xml);
                        }
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m3497(int i, float f, float f2) {
        int m3500;
        C1566 c1566;
        int i2 = this.f7321;
        if (i2 == i) {
            C1562 valueAt = i == -1 ? this.f7325.valueAt(0) : this.f7325.get(i2);
            int i3 = this.f7322;
            if ((i3 != -1 && valueAt.f7332.get(i3).m3499(f, f2)) || this.f7322 == (m3500 = valueAt.m3500(f, f2))) {
                return;
            }
            c1566 = m3500 == -1 ? null : valueAt.f7332.get(m3500).f7330;
            if (m3500 != -1) {
                int i4 = valueAt.f7332.get(m3500).f7329;
            }
            if (c1566 == null) {
                return;
            }
        } else {
            this.f7321 = i;
            C1562 c1562 = this.f7325.get(i);
            m3500 = c1562.m3500(f, f2);
            c1566 = m3500 == -1 ? c1562.f7335 : c1562.f7332.get(m3500).f7330;
            if (m3500 != -1) {
                int i5 = c1562.f7332.get(m3500).f7329;
            }
            if (c1566 == null) {
                return;
            }
        }
        this.f7322 = m3500;
        c1566.m3505(this.f7323);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m3498(Context context, XmlPullParser xmlPullParser) {
        C1566 c1566 = new C1566();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlPullParser.getAttributeName(i))) {
                String attributeValue = xmlPullParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                c1566.m3512(context, xmlPullParser);
                this.f7324.put(identifier, c1566);
                return;
            }
        }
    }
}
