package p034.p086.p090;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import org.xmlpull.v1.XmlPullParser;
import p131.p155.p156.p157.C2098;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.なぎぱいぢぎ.くし〴〺ぅ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1572 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public EnumC1573 f7447;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f7448;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f7449;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public String f7450;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public String f7451;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f7452;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public float f7453;

    /* renamed from: づざかべべ.なぎぱいぢぎ.くし〴〺ぅ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public enum EnumC1573 {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public C1572(String str, EnumC1573 enumC1573, Object obj) {
        this.f7450 = str;
        this.f7447 = enumC1573;
        m3527(obj);
    }

    public C1572(C1572 c1572, Object obj) {
        this.f7450 = c1572.f7450;
        this.f7447 = c1572.f7447;
        m3527(obj);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static int m3524(int i) {
        int i2 = (i & ((i >> 31) ^ (-1))) - 255;
        return (i2 & (i2 >> 31)) + Base64.BASELENGTH;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static void m3525(Context context, XmlPullParser xmlPullParser, HashMap<String, C1572> hashMap) {
        EnumC1573 enumC1573;
        Object string;
        int integer;
        float dimension;
        EnumC1573 enumC15732 = EnumC1573.DIMENSION_TYPE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1575.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC1573 enumC15733 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C1575.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == C1575.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                enumC15733 = EnumC1573.BOOLEAN_TYPE;
            } else {
                if (index == C1575.CustomAttribute_customColorValue) {
                    enumC1573 = EnumC1573.COLOR_TYPE;
                } else if (index == C1575.CustomAttribute_customColorDrawableValue) {
                    enumC1573 = EnumC1573.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == C1575.CustomAttribute_customPixelDimension) {
                        dimension = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == C1575.CustomAttribute_customDimension) {
                        dimension = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else {
                        if (index == C1575.CustomAttribute_customFloatValue) {
                            enumC1573 = EnumC1573.FLOAT_TYPE;
                            string = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                        } else if (index == C1575.CustomAttribute_customIntegerValue) {
                            enumC1573 = EnumC1573.INT_TYPE;
                            integer = obtainStyledAttributes.getInteger(index, -1);
                            string = Integer.valueOf(integer);
                        } else if (index == C1575.CustomAttribute_customStringValue) {
                            enumC1573 = EnumC1573.STRING_TYPE;
                            string = obtainStyledAttributes.getString(index);
                        }
                        Object obj2 = string;
                        enumC15733 = enumC1573;
                        obj = obj2;
                    }
                    obj = Float.valueOf(dimension);
                    enumC15733 = enumC15732;
                }
                integer = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                Object obj22 = string;
                enumC15733 = enumC1573;
                obj = obj22;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new C1572(str, enumC15733, obj));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static void m3526(View view, HashMap<String, C1572> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C1572 c1572 = hashMap.get(str);
            String m4205 = C2098.m4205("set", str);
            try {
                switch (c1572.f7447) {
                    case INT_TYPE:
                        cls.getMethod(m4205, Integer.TYPE).invoke(view, Integer.valueOf(c1572.f7449));
                        break;
                    case FLOAT_TYPE:
                        cls.getMethod(m4205, Float.TYPE).invoke(view, Float.valueOf(c1572.f7453));
                        break;
                    case COLOR_TYPE:
                        cls.getMethod(m4205, Integer.TYPE).invoke(view, Integer.valueOf(c1572.f7448));
                        break;
                    case COLOR_DRAWABLE_TYPE:
                        Method method = cls.getMethod(m4205, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(c1572.f7448);
                        method.invoke(view, colorDrawable);
                        break;
                    case STRING_TYPE:
                        cls.getMethod(m4205, CharSequence.class).invoke(view, c1572.f7451);
                        break;
                    case BOOLEAN_TYPE:
                        cls.getMethod(m4205, Boolean.TYPE).invoke(view, Boolean.valueOf(c1572.f7452));
                        break;
                    case DIMENSION_TYPE:
                        cls.getMethod(m4205, Float.TYPE).invoke(view, Float.valueOf(c1572.f7453));
                        break;
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                cls.getName();
            } catch (NoSuchMethodException e) {
                e.getMessage();
                cls.getName();
            }
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m3527(Object obj) {
        switch (this.f7447) {
            case INT_TYPE:
                this.f7449 = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
            case DIMENSION_TYPE:
                this.f7453 = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f7448 = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f7451 = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f7452 = ((Boolean) obj).booleanValue();
                break;
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public float m3528() {
        switch (this.f7447) {
            case INT_TYPE:
                return this.f7449;
            case FLOAT_TYPE:
                return this.f7453;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case STRING_TYPE:
                throw new RuntimeException("Cannot interpolate String");
            case BOOLEAN_TYPE:
                return this.f7452 ? 1.0f : 0.0f;
            case DIMENSION_TYPE:
                return this.f7453;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m3529(View view, float[] fArr) {
        Class<?> cls = view.getClass();
        StringBuilder m4207 = C2098.m4207("set");
        m4207.append(this.f7450);
        String sb = m4207.toString();
        try {
            boolean z = true;
            switch (this.f7447) {
                case INT_TYPE:
                    cls.getMethod(sb, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case FLOAT_TYPE:
                    cls.getMethod(sb, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case COLOR_TYPE:
                    cls.getMethod(sb, Integer.TYPE).invoke(view, Integer.valueOf((m3524((int) (fArr[3] * 255.0f)) << 24) | (m3524((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m3524((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m3524((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case COLOR_DRAWABLE_TYPE:
                    Method method = cls.getMethod(sb, Drawable.class);
                    int m3524 = (m3524((int) (fArr[3] * 255.0f)) << 24) | (m3524((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m3524((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m3524((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(m3524);
                    method.invoke(view, colorDrawable);
                    return;
                case STRING_TYPE:
                    throw new RuntimeException("unable to interpolate strings " + this.f7450);
                case BOOLEAN_TYPE:
                    Method method2 = cls.getMethod(sb, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    method2.invoke(view, objArr);
                    return;
                case DIMENSION_TYPE:
                    cls.getMethod(sb, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            C2786.m4795(view);
        } catch (InvocationTargetException unused2) {
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m3530(float[] fArr) {
        switch (this.f7447) {
            case INT_TYPE:
                fArr[0] = this.f7449;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.f7453;
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i = this.f7448;
                int i2 = (i >> 24) & Base64.BASELENGTH;
                int i3 = (i >> 16) & Base64.BASELENGTH;
                int i4 = (i >> 8) & Base64.BASELENGTH;
                int i5 = i & Base64.BASELENGTH;
                float pow = (float) Math.pow(i3 / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(i4 / 255.0f, 2.2d);
                float pow3 = (float) Math.pow(i5 / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i2 / 255.0f;
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                fArr[0] = this.f7452 ? 1.0f : 0.0f;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.f7453;
                return;
            default:
                return;
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int m3531() {
        int ordinal = this.f7447.ordinal();
        return (ordinal == 2 || ordinal == 3) ? 4 : 1;
    }
}
