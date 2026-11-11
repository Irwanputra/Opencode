package p034.p086.p091.p092;

import android.content.Context;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p034.p086.p090.C1572;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1580 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static HashMap<String, Constructor<? extends AbstractC1579>> f7475;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public HashMap<Integer, ArrayList<AbstractC1579>> f7476 = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends AbstractC1579>> hashMap = new HashMap<>();
        f7475 = hashMap;
        try {
            hashMap.put("KeyAttribute", C1604.class.getConstructor(new Class[0]));
            f7475.put("KeyPosition", C1577.class.getConstructor(new Class[0]));
            f7475.put("KeyCycle", C1623.class.getConstructor(new Class[0]));
            f7475.put("KeyTimeCycle", C1581.class.getConstructor(new Class[0]));
            f7475.put("KeyTrigger", C1648.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public C1580(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, C1572> hashMap;
        try {
            int eventType = xmlPullParser.getEventType();
            AbstractC1579 abstractC1579 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (f7475.containsKey(name)) {
                        try {
                            AbstractC1579 newInstance = f7475.get(name).newInstance(new Object[0]);
                            try {
                                newInstance.mo3532(context, Xml.asAttributeSet(xmlPullParser));
                                m3536(newInstance);
                            } catch (Exception unused) {
                            }
                            abstractC1579 = newInstance;
                        } catch (Exception unused2) {
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute") && abstractC1579 != null && (hashMap = abstractC1579.f7474) != null) {
                        C1572.m3525(context, xmlPullParser, hashMap);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused3) {
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m3536(AbstractC1579 abstractC1579) {
        if (!this.f7476.containsKey(Integer.valueOf(abstractC1579.f7471))) {
            this.f7476.put(Integer.valueOf(abstractC1579.f7471), new ArrayList<>());
        }
        this.f7476.get(Integer.valueOf(abstractC1579.f7471)).add(abstractC1579);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m3537(C1643 c1643) {
        ArrayList<AbstractC1579> arrayList = this.f7476.get(Integer.valueOf(c1643.f7670));
        if (arrayList != null) {
            c1643.f7686.addAll(arrayList);
        }
        ArrayList<AbstractC1579> arrayList2 = this.f7476.get(-1);
        if (arrayList2 != null) {
            Iterator<AbstractC1579> it = arrayList2.iterator();
            while (it.hasNext()) {
                AbstractC1579 next = it.next();
                String str = ((ConstraintLayout.LayoutParams) c1643.f7680.getLayoutParams()).f899;
                String str2 = next.f7472;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    c1643.f7686.add(next);
                }
            }
        }
    }
}
