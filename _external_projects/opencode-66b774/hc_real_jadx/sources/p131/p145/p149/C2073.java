package p131.p145.p149;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p131.p145.p146.AbstractC2029;
import p131.p145.p147.p148.C2031;
import p131.p155.p156.p157.C2098;

/* renamed from: なぎぱいぢぎ.ぁごぐすすぃ.げつ〴ぬぐ.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2073 extends C2064 {

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public static final Map<String, AbstractC2029> f8856;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public Object f8857;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public AbstractC2029 f8858;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public String f8859;

    static {
        HashMap hashMap = new HashMap();
        f8856 = hashMap;
        hashMap.put("alpha", C2043.f8815);
        hashMap.put("pivotX", C2043.f8811);
        hashMap.put("pivotY", C2043.f8814);
        hashMap.put("translationX", C2043.f8820);
        hashMap.put("translationY", C2043.f8816);
        hashMap.put("rotation", C2043.f8818);
        hashMap.put("rotationX", C2043.f8812);
        hashMap.put("rotationY", C2043.f8810);
        hashMap.put("scaleX", C2043.f8822);
        hashMap.put("scaleY", C2043.f8813);
        hashMap.put("scrollX", C2043.f8823);
        hashMap.put("scrollY", C2043.f8817);
        hashMap.put("x", C2043.f8819);
        hashMap.put("y", C2043.f8821);
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static C2073 m4161(Object obj, C2074... c2074Arr) {
        C2073 c2073 = new C2073();
        c2073.f8857 = obj;
        c2073.m4154(c2074Arr);
        return c2073;
    }

    @Override // p131.p145.p149.C2064
    public String toString() {
        StringBuilder m4207 = C2098.m4207("ObjectAnimator@");
        m4207.append(Integer.toHexString(hashCode()));
        m4207.append(", target ");
        m4207.append(this.f8857);
        String sb = m4207.toString();
        if (this.f8840 != null) {
            for (int i = 0; i < this.f8840.length; i++) {
                StringBuilder m4179 = C2098.m4179(sb, "\n    ");
                m4179.append(this.f8840[i].toString());
                sb = m4179.toString();
            }
        }
        return sb;
    }

    @Override // p131.p145.p149.C2064
    /* renamed from: ぁごぐすすぃ */
    public void mo4151(float f) {
        super.mo4151(f);
        int length = this.f8840.length;
        for (int i = 0; i < length; i++) {
            this.f8840[i].mo4170(this.f8857);
        }
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public C2073 m4162(long j) {
        super.m4153(j);
        return this;
    }

    @Override // p131.p145.p149.C2064
    /* renamed from: おぐぴう〸ず, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C2073 clone() {
        return (C2073) super.clone();
    }

    @Override // p131.p145.p149.C2064, p131.p145.p149.AbstractC2059
    /* renamed from: なぎぱいぢぎ */
    public void mo4135() {
        super.mo4135();
    }

    @Override // p131.p145.p149.C2064
    /* renamed from: ぺふねづ〺 */
    public void mo4157() {
        if (this.f8851) {
            return;
        }
        if (this.f8858 == null && C2031.f8757 && (this.f8857 instanceof View)) {
            Map<String, AbstractC2029> map = f8856;
            if (map.containsKey(this.f8859)) {
                AbstractC2029 abstractC2029 = map.get(this.f8859);
                C2074[] c2074Arr = this.f8840;
                if (c2074Arr != null) {
                    C2074 c2074 = c2074Arr[0];
                    String str = c2074.f8868;
                    c2074.f8871 = abstractC2029;
                    this.f8841.remove(str);
                    this.f8841.put(this.f8859, c2074);
                }
                if (this.f8858 != null) {
                    this.f8859 = abstractC2029.f8756;
                }
                this.f8858 = abstractC2029;
                this.f8851 = false;
            }
        }
        int length = this.f8840.length;
        for (int i = 0; i < length; i++) {
            C2074 c20742 = this.f8840[i];
            Object obj = this.f8857;
            AbstractC2029 abstractC20292 = c20742.f8871;
            if (abstractC20292 != null) {
                try {
                    abstractC20292.mo4120(obj);
                    Iterator<AbstractC2040> it = c20742.f8869.f8778.iterator();
                    while (it.hasNext()) {
                        AbstractC2040 next = it.next();
                        if (!next.f8806) {
                            next.mo4144(c20742.f8871.mo4120(obj));
                        }
                    }
                } catch (ClassCastException unused) {
                    StringBuilder m4207 = C2098.m4207("No such property (");
                    m4207.append(c20742.f8871.f8756);
                    m4207.append(") on target object ");
                    m4207.append(obj);
                    m4207.append(". Trying reflection instead");
                    m4207.toString();
                    c20742.f8871 = null;
                }
            }
            Class<?> cls = obj.getClass();
            if (c20742.f8874 == null) {
                c20742.mo4167(cls);
            }
            Iterator<AbstractC2040> it2 = c20742.f8869.f8778.iterator();
            while (it2.hasNext()) {
                AbstractC2040 next2 = it2.next();
                if (!next2.f8806) {
                    if (c20742.f8872 == null) {
                        c20742.f8872 = c20742.m4165(cls, C2074.f8863, "get", null);
                    }
                    try {
                        next2.mo4144(c20742.f8872.invoke(obj, new Object[0]));
                    } catch (IllegalAccessException e) {
                        e.toString();
                    } catch (InvocationTargetException e2) {
                        e2.toString();
                    }
                }
            }
        }
        super.mo4157();
    }
}
