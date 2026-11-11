package p034.p086.p090;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: づざかべべ.なぎぱいぢぎ.くし〴〺ぅ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1563 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public SparseArray<C1565> f7336 = new SparseArray<>();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int f7337;

    /* renamed from: づざかべべ.なぎぱいぢぎ.くし〴〺ぅ.ぁごぐすすぃ$〺つふすそ, reason: contains not printable characters */
    public static class C1564 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public float f7338;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public float f7339;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public float f7340;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f7341;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public float f7342;

        public C1564(Context context, XmlPullParser xmlPullParser) {
            this.f7340 = Float.NaN;
            this.f7338 = Float.NaN;
            this.f7339 = Float.NaN;
            this.f7342 = Float.NaN;
            this.f7341 = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1575.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1575.Variant_constraints) {
                    this.f7341 = obtainStyledAttributes.getResourceId(index, this.f7341);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f7341);
                    context.getResources().getResourceName(this.f7341);
                    "layout".equals(resourceTypeName);
                } else if (index == C1575.Variant_region_heightLessThan) {
                    this.f7342 = obtainStyledAttributes.getDimension(index, this.f7342);
                } else if (index == C1575.Variant_region_heightMoreThan) {
                    this.f7338 = obtainStyledAttributes.getDimension(index, this.f7338);
                } else if (index == C1575.Variant_region_widthLessThan) {
                    this.f7339 = obtainStyledAttributes.getDimension(index, this.f7339);
                } else if (index == C1575.Variant_region_widthMoreThan) {
                    this.f7340 = obtainStyledAttributes.getDimension(index, this.f7340);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean m3502(float f, float f2) {
            if (!Float.isNaN(this.f7340) && f < this.f7340) {
                return false;
            }
            if (!Float.isNaN(this.f7338) && f2 < this.f7338) {
                return false;
            }
            if (Float.isNaN(this.f7339) || f <= this.f7339) {
                return Float.isNaN(this.f7342) || f2 <= this.f7342;
            }
            return false;
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.くし〴〺ぅ.ぁごぐすすぃ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1565 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public ArrayList<C1564> f7343 = new ArrayList<>();

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f7344;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f7345;

        public C1565(Context context, XmlPullParser xmlPullParser) {
            this.f7344 = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1575.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1575.State_android_id) {
                    this.f7345 = obtainStyledAttributes.getResourceId(index, this.f7345);
                } else if (index == C1575.State_constraints) {
                    this.f7344 = obtainStyledAttributes.getResourceId(index, this.f7344);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f7344);
                    context.getResources().getResourceName(this.f7344);
                    "layout".equals(resourceTypeName);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int m3503(float f, float f2) {
            for (int i = 0; i < this.f7343.size(); i++) {
                if (this.f7343.get(i).m3502(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public C1563(Context context, XmlPullParser xmlPullParser) {
        char c;
        this.f7337 = -1;
        new SparseArray();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1575.StateSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C1575.StateSet_defaultState) {
                this.f7337 = obtainStyledAttributes.getResourceId(index, this.f7337);
            }
        }
        obtainStyledAttributes.recycle();
        C1565 c1565 = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                c = 0;
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
                            c1565 = new C1565(context, xmlPullParser);
                            this.f7336.put(c1565.f7345, c1565);
                        } else if (c == 3) {
                            C1564 c1564 = new C1564(context, xmlPullParser);
                            if (c1565 != null) {
                                c1565.f7343.add(c1564);
                            }
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r3 = r3.f7344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        r3 = r3.f7343.get(r4).f7341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r4 == (-1)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r4 == (-1)) goto L14;
     */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m3501(int r3, int r4, int r5) {
        /*
            r2 = this;
            float r4 = (float) r4
            float r5 = (float) r5
            r0 = -1
            if (r0 != r3) goto L32
            if (r3 != r0) goto Lf
            android.util.SparseArray<づざかべべ.なぎぱいぢぎ.くし〴〺ぅ.ぁごぐすすぃ$げつ〴ぬぐ> r3 = r2.f7336
            r1 = 0
            java.lang.Object r3 = r3.valueAt(r1)
            goto L15
        Lf:
            android.util.SparseArray<づざかべべ.なぎぱいぢぎ.くし〴〺ぅ.ぁごぐすすぃ$げつ〴ぬぐ> r3 = r2.f7336
            java.lang.Object r3 = r3.get(r0)
        L15:
            づざかべべ.なぎぱいぢぎ.くし〴〺ぅ.ぁごぐすすぃ$げつ〴ぬぐ r3 = (p034.p086.p090.C1563.C1565) r3
            if (r3 != 0) goto L1a
            goto L44
        L1a:
            int r4 = r3.m3503(r4, r5)
            if (r0 != r4) goto L21
            goto L44
        L21:
            if (r4 != r0) goto L26
        L23:
            int r3 = r3.f7344
            goto L30
        L26:
            java.util.ArrayList<づざかべべ.なぎぱいぢぎ.くし〴〺ぅ.ぁごぐすすぃ$〺つふすそ> r3 = r3.f7343
            java.lang.Object r3 = r3.get(r4)
            づざかべべ.なぎぱいぢぎ.くし〴〺ぅ.ぁごぐすすぃ$〺つふすそ r3 = (p034.p086.p090.C1563.C1564) r3
            int r3 = r3.f7341
        L30:
            r0 = r3
            goto L44
        L32:
            android.util.SparseArray<づざかべべ.なぎぱいぢぎ.くし〴〺ぅ.ぁごぐすすぃ$げつ〴ぬぐ> r1 = r2.f7336
            java.lang.Object r3 = r1.get(r3)
            づざかべべ.なぎぱいぢぎ.くし〴〺ぅ.ぁごぐすすぃ$げつ〴ぬぐ r3 = (p034.p086.p090.C1563.C1565) r3
            if (r3 != 0) goto L3d
            goto L44
        L3d:
            int r4 = r3.m3503(r4, r5)
            if (r4 != r0) goto L26
            goto L23
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p086.p090.C1563.m3501(int, int, int):int");
    }
}
