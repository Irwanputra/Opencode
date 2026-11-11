package p034.p086.p091.p092;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p034.p086.p090.C1563;
import p034.p086.p090.C1566;
import p034.p086.p090.C1574;
import p034.p086.p090.C1575;
import p034.p086.p091.p093.C1654;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぇぬぎばつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1583 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1563 f7495;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean f7498;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public float f7499;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public MotionLayout.InterfaceC0117 f7500;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C1584 f7501;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final MotionLayout f7502;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public float f7503;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C1584 f7504;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public MotionEvent f7505;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public ArrayList<C1584> f7508 = new ArrayList<>();

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public ArrayList<C1584> f7506 = new ArrayList<>();

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public SparseArray<C1566> f7496 = new SparseArray<>();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public HashMap<String, Integer> f7494 = new HashMap<>();

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public SparseIntArray f7510 = new SparseIntArray();

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f7497 = 400;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f7511 = 0;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f7507 = false;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean f7509 = false;

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぇぬぎばつ$〺つふすそ, reason: contains not printable characters */
    public static class C1584 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public int f7512;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f7513;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int f7514;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public final C1583 f7515;

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public int f7516;

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public int f7517;

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public boolean f7518;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f7519;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f7520;

        /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
        public int f7521;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f7522;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public C1608 f7523;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public String f7524;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public ArrayList<ViewOnClickListenerC1585> f7525;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f7526;

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public int f7527;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public float f7528;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public ArrayList<C1580> f7529;

        /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぇぬぎばつ$〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
        public static class ViewOnClickListenerC1585 implements View.OnClickListener {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public final C1584 f7530;

            /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
            public int f7531;

            /* renamed from: びぐびあび, reason: contains not printable characters */
            public int f7532;

            public ViewOnClickListenerC1585(Context context, C1584 c1584, XmlPullParser xmlPullParser) {
                this.f7531 = -1;
                this.f7532 = 17;
                this.f7530 = c1584;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1575.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == C1575.OnClick_targetId) {
                        this.f7531 = obtainStyledAttributes.getResourceId(index, this.f7531);
                    } else if (index == C1575.OnClick_clickAction) {
                        this.f7532 = obtainStyledAttributes.getInt(index, this.f7532);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
            /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.view.View r11) {
                /*
                    Method dump skipped, instructions count: 207
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p034.p086.p091.p092.C1583.C1584.ViewOnClickListenerC1585.onClick(android.view.View):void");
            }

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public void m3552(MotionLayout motionLayout) {
                View findViewById;
                int i = this.f7531;
                if (i == -1 || (findViewById = motionLayout.findViewById(i)) == null) {
                    return;
                }
                findViewById.setOnClickListener(null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View] */
            /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
            public void m3553(MotionLayout motionLayout, int i, C1584 c1584) {
                int i2 = this.f7531;
                MotionLayout motionLayout2 = motionLayout;
                if (i2 != -1) {
                    motionLayout2 = motionLayout.findViewById(i2);
                }
                if (motionLayout2 == null) {
                    return;
                }
                int i3 = c1584.f7526;
                int i4 = c1584.f7519;
                if (i3 == -1) {
                    motionLayout2.setOnClickListener(this);
                    return;
                }
                int i5 = this.f7532;
                int i6 = i5 & 1;
                boolean z = false;
                boolean z2 = (i6 != 0 && i == i3) | (i6 != 0 && i == i3) | ((i5 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
                if ((i5 & NotificationCompat.FLAG_BUBBLE) != 0 && i == i4) {
                    z = true;
                }
                if (z2 || z) {
                    motionLayout2.setOnClickListener(this);
                }
            }
        }

        public C1584(C1583 c1583, Context context, XmlPullParser xmlPullParser) {
            int integer;
            C1566 c1566;
            SparseArray<C1566> sparseArray;
            int i;
            this.f7520 = -1;
            this.f7513 = false;
            this.f7519 = -1;
            this.f7526 = -1;
            this.f7522 = 0;
            this.f7524 = null;
            this.f7514 = -1;
            this.f7512 = 400;
            this.f7528 = 0.0f;
            this.f7529 = new ArrayList<>();
            this.f7523 = null;
            this.f7525 = new ArrayList<>();
            this.f7527 = 0;
            this.f7518 = false;
            this.f7516 = -1;
            this.f7517 = 0;
            this.f7521 = 0;
            this.f7512 = c1583.f7497;
            this.f7517 = c1583.f7511;
            this.f7515 = c1583;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1575.Transition);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == C1575.Transition_constraintSetEnd) {
                    this.f7519 = obtainStyledAttributes.getResourceId(index, this.f7519);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.f7519))) {
                        c1566 = new C1566();
                        c1566.m3504(context, this.f7519);
                        sparseArray = c1583.f7496;
                        i = this.f7519;
                        sparseArray.append(i, c1566);
                    }
                } else {
                    if (index == C1575.Transition_constraintSetStart) {
                        this.f7526 = obtainStyledAttributes.getResourceId(index, this.f7526);
                        if ("layout".equals(context.getResources().getResourceTypeName(this.f7526))) {
                            c1566 = new C1566();
                            c1566.m3504(context, this.f7526);
                            sparseArray = c1583.f7496;
                            i = this.f7526;
                            sparseArray.append(i, c1566);
                        }
                    } else if (index == C1575.Transition_motionInterpolator) {
                        int i3 = obtainStyledAttributes.peekValue(index).type;
                        if (i3 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f7514 = resourceId;
                            if (resourceId == -1) {
                            }
                            this.f7522 = -2;
                        } else {
                            if (i3 == 3) {
                                String string = obtainStyledAttributes.getString(index);
                                this.f7524 = string;
                                if (string.indexOf("/") > 0) {
                                    this.f7514 = obtainStyledAttributes.getResourceId(index, -1);
                                    this.f7522 = -2;
                                } else {
                                    integer = -1;
                                }
                            } else {
                                integer = obtainStyledAttributes.getInteger(index, this.f7522);
                            }
                            this.f7522 = integer;
                        }
                    } else if (index == C1575.Transition_duration) {
                        this.f7512 = obtainStyledAttributes.getInt(index, this.f7512);
                    } else if (index == C1575.Transition_staggered) {
                        this.f7528 = obtainStyledAttributes.getFloat(index, this.f7528);
                    } else if (index == C1575.Transition_autoTransition) {
                        this.f7527 = obtainStyledAttributes.getInteger(index, this.f7527);
                    } else if (index == C1575.Transition_android_id) {
                        this.f7520 = obtainStyledAttributes.getResourceId(index, this.f7520);
                    } else if (index == C1575.Transition_transitionDisable) {
                        this.f7518 = obtainStyledAttributes.getBoolean(index, this.f7518);
                    } else if (index == C1575.Transition_pathMotionArc) {
                        this.f7516 = obtainStyledAttributes.getInteger(index, -1);
                    } else if (index == C1575.Transition_layoutDuringTransition) {
                        this.f7517 = obtainStyledAttributes.getInteger(index, 0);
                    } else if (index == C1575.Transition_transitionFlags) {
                        this.f7521 = obtainStyledAttributes.getInteger(index, 0);
                    }
                }
            }
            if (this.f7526 == -1) {
                this.f7513 = true;
            }
            obtainStyledAttributes.recycle();
        }

        public C1584(C1583 c1583, C1584 c1584) {
            this.f7520 = -1;
            this.f7513 = false;
            this.f7519 = -1;
            this.f7526 = -1;
            this.f7522 = 0;
            this.f7524 = null;
            this.f7514 = -1;
            this.f7512 = 400;
            this.f7528 = 0.0f;
            this.f7529 = new ArrayList<>();
            this.f7523 = null;
            this.f7525 = new ArrayList<>();
            this.f7527 = 0;
            this.f7518 = false;
            this.f7516 = -1;
            this.f7517 = 0;
            this.f7521 = 0;
            this.f7515 = c1583;
            if (c1584 != null) {
                this.f7516 = c1584.f7516;
                this.f7522 = c1584.f7522;
                this.f7524 = c1584.f7524;
                this.f7514 = c1584.f7514;
                this.f7512 = c1584.f7512;
                this.f7529 = c1584.f7529;
                this.f7528 = c1584.f7528;
                this.f7517 = c1584.f7517;
            }
        }
    }

    /* renamed from: づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぇぬぎばつ$げつ〴ぬぐ, reason: contains not printable characters */
    public class InterpolatorC1586 implements Interpolator {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final /* synthetic */ C1654 f7533;

        public InterpolatorC1586(C1583 c1583, C1654 c1654) {
            this.f7533 = c1654;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.f7533.mo3603(f);
        }
    }

    public C1583(Context context, MotionLayout motionLayout, int i) {
        int eventType;
        C1584 c1584 = null;
        this.f7495 = null;
        this.f7501 = null;
        this.f7504 = null;
        this.f7502 = motionLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
        } catch (IOException | XmlPullParserException unused) {
        }
        while (true) {
            char c = 1;
            if (eventType == 1) {
                SparseArray<C1566> sparseArray = this.f7496;
                int i2 = C1574.motion_base;
                sparseArray.put(i2, new C1566());
                this.f7494.put("motion_base", Integer.valueOf(i2));
                return;
            }
            if (eventType == 0) {
                xml.getName();
            } else if (eventType == 2) {
                String name = xml.getName();
                switch (name.hashCode()) {
                    case -1349929691:
                        if (name.equals("ConstraintSet")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1239391468:
                        if (name.equals("KeyFrameSet")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 269306229:
                        if (name.equals("Transition")) {
                            break;
                        }
                        c = 65535;
                        break;
                    case 312750793:
                        if (name.equals("OnClick")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 327855227:
                        if (name.equals("OnSwipe")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 793277014:
                        if (name.equals("MotionScene")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1382829617:
                        if (name.equals("StateSet")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        m3551(context, xml);
                        break;
                    case 1:
                        ArrayList<C1584> arrayList = this.f7508;
                        C1584 c15842 = new C1584(this, context, xml);
                        arrayList.add(c15842);
                        if (this.f7501 == null && !c15842.f7513) {
                            this.f7501 = c15842;
                            C1608 c1608 = c15842.f7523;
                            if (c1608 != null) {
                                c1608.m3563(this.f7498);
                            }
                        }
                        if (c15842.f7513) {
                            if (c15842.f7519 == -1) {
                                this.f7504 = c15842;
                            } else {
                                this.f7506.add(c15842);
                            }
                            this.f7508.remove(c15842);
                        }
                        c1584 = c15842;
                        break;
                    case 2:
                        if (c1584 == null) {
                            context.getResources().getResourceEntryName(i);
                            xml.getLineNumber();
                        }
                        c1584.f7523 = new C1608(context, this.f7502, xml);
                        break;
                    case 3:
                        c1584.f7525.add(new C1584.ViewOnClickListenerC1585(context, c1584, xml));
                        break;
                    case 4:
                        this.f7495 = new C1563(context, xml);
                        break;
                    case 5:
                        m3541(context, xml);
                        break;
                    case 6:
                        c1584.f7529.add(new C1580(context, xml));
                        break;
                }
            }
            eventType = xml.next();
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float m3538() {
        C1608 c1608;
        C1584 c1584 = this.f7501;
        if (c1584 == null || (c1608 = c1584.f7523) == null) {
            return 0.0f;
        }
        return c1608.f7582;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1566 m3539(int i) {
        C1566 c1566;
        int m3501;
        C1563 c1563 = this.f7495;
        if (c1563 != null && (m3501 = c1563.m3501(i, -1, -1)) != -1) {
            i = m3501;
        }
        if (this.f7496.get(i) == null) {
            C2786.m4778(this.f7502.getContext(), i);
            SparseArray<C1566> sparseArray = this.f7496;
            c1566 = sparseArray.get(sparseArray.keyAt(0));
        } else {
            c1566 = this.f7496.get(i);
        }
        return c1566;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m3540(C1643 c1643) {
        C1584 c1584 = this.f7501;
        if (c1584 != null) {
            Iterator<C1580> it = c1584.f7529.iterator();
            while (it.hasNext()) {
                it.next().m3537(c1643);
            }
        } else {
            C1584 c15842 = this.f7504;
            if (c15842 != null) {
                Iterator<C1580> it2 = c15842.f7529.iterator();
                while (it2.hasNext()) {
                    it2.next().m3537(c1643);
                }
            }
        }
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final void m3541(Context context, XmlPullParser xmlPullParser) {
        C1566 c1566 = new C1566();
        c1566.f7348 = false;
        int attributeCount = xmlPullParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlPullParser.getAttributeName(i3);
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            attributeName.hashCode();
            if (attributeName.equals("deriveConstraintsFrom")) {
                i2 = m3544(context, attributeValue);
            } else if (attributeName.equals("id")) {
                i = m3544(context, attributeValue);
                HashMap<String, Integer> hashMap = this.f7494;
                int indexOf = attributeValue.indexOf(47);
                if (indexOf >= 0) {
                    attributeValue = attributeValue.substring(indexOf + 1);
                }
                hashMap.put(attributeValue, Integer.valueOf(i));
            }
        }
        if (i != -1) {
            int i4 = this.f7502.f698;
            c1566.m3512(context, xmlPullParser);
            if (i2 != -1) {
                this.f7510.put(i, i2);
            }
            this.f7496.put(i, c1566);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int m3542() {
        C1584 c1584 = this.f7501;
        return c1584 != null ? c1584.f7512 : this.f7497;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean m3543(MotionLayout motionLayout, int i) {
        MotionLayout.EnumC0120 enumC0120 = MotionLayout.EnumC0120.FINISHED;
        MotionLayout.EnumC0120 enumC01202 = MotionLayout.EnumC0120.MOVING;
        MotionLayout.EnumC0120 enumC01203 = MotionLayout.EnumC0120.SETUP;
        if (this.f7500 != null) {
            return false;
        }
        Iterator<C1584> it = this.f7508.iterator();
        while (it.hasNext()) {
            C1584 next = it.next();
            int i2 = next.f7527;
            if (i2 != 0 && this.f7501 != next) {
                if (i == next.f7526 && (i2 == 4 || i2 == 2)) {
                    motionLayout.setState(enumC0120);
                    motionLayout.setTransition(next);
                    if (next.f7527 == 4) {
                        motionLayout.m267(1.0f);
                        motionLayout.setState(enumC01203);
                        motionLayout.setState(enumC01202);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.m270(true);
                        motionLayout.setState(enumC01203);
                        motionLayout.setState(enumC01202);
                        motionLayout.setState(enumC0120);
                        motionLayout.m264();
                    }
                    return true;
                }
                if (i == next.f7519 && (i2 == 3 || i2 == 1)) {
                    motionLayout.setState(enumC0120);
                    motionLayout.setTransition(next);
                    if (next.f7527 == 3) {
                        motionLayout.m267(0.0f);
                        motionLayout.setState(enumC01203);
                        motionLayout.setState(enumC01202);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.m270(true);
                        motionLayout.setState(enumC01203);
                        motionLayout.setState(enumC01202);
                        motionLayout.setState(enumC0120);
                        motionLayout.m264();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final int m3544(Context context, String str) {
        int identifier = str.contains("/") ? context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName()) : -1;
        return (identifier != -1 || str.length() <= 1) ? identifier : Integer.parseInt(str.substring(1));
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final void m3545(int i) {
        int i2 = this.f7510.get(i);
        if (i2 > 0) {
            m3545(this.f7510.get(i));
            C1566 c1566 = this.f7496.get(i);
            C1566 c15662 = this.f7496.get(i2);
            if (c15662 == null) {
                C2786.m4778(this.f7502.getContext(), i2);
                return;
            }
            c1566.getClass();
            for (Integer num : c15662.f7349.keySet()) {
                int intValue = num.intValue();
                C1566.C1569 c1569 = c15662.f7349.get(num);
                if (!c1566.f7349.containsKey(Integer.valueOf(intValue))) {
                    c1566.f7349.put(Integer.valueOf(intValue), new C1566.C1569());
                }
                C1566.C1569 c15692 = c1566.f7349.get(Integer.valueOf(intValue));
                C1566.C1567 c1567 = c15692.f7427;
                if (!c1567.f7356) {
                    c1567.m3514(c1569.f7427);
                }
                C1566.C1571 c1571 = c15692.f7422;
                if (!c1571.f7444) {
                    c1571.m3523(c1569.f7422);
                }
                C1566.C1570 c1570 = c15692.f7425;
                if (!c1570.f7434) {
                    c1570.m3521(c1569.f7425);
                }
                C1566.C1568 c1568 = c15692.f7423;
                if (!c1568.f7418) {
                    c1568.m3516(c1569.f7423);
                }
                for (String str : c1569.f7426.keySet()) {
                    if (!c15692.f7426.containsKey(str)) {
                        c15692.f7426.put(str, c1569.f7426.get(str));
                    }
                }
            }
            this.f7510.put(i, -1);
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public Interpolator m3546() {
        C1584 c1584 = this.f7501;
        int i = c1584.f7522;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f7502.getContext(), this.f7501.f7514);
        }
        if (i == -1) {
            return new InterpolatorC1586(this, C1654.m3601(c1584.f7524));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new AnticipateInterpolator();
        }
        if (i != 5) {
            return null;
        }
        return new BounceInterpolator();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r2 != (-1)) goto L13;
     */
    /* renamed from: のぷのちつ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m3547(int r8, int r9) {
        /*
            r7 = this;
            づざかべべ.なぎぱいぢぎ.くし〴〺ぅ.ぁごぐすすぃ r0 = r7.f7495
            r1 = -1
            if (r0 == 0) goto L16
            int r0 = r0.m3501(r8, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r8
        Ld:
            づざかべべ.なぎぱいぢぎ.くし〴〺ぅ.ぁごぐすすぃ r2 = r7.f7495
            int r2 = r2.m3501(r9, r1, r1)
            if (r2 == r1) goto L17
            goto L18
        L16:
            r0 = r8
        L17:
            r2 = r9
        L18:
            java.util.ArrayList<づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぇぬぎばつ$〺つふすそ> r3 = r7.f7508
            java.util.Iterator r3 = r3.iterator()
        L1e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r4 = r3.next()
            づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぇぬぎばつ$〺つふすそ r4 = (p034.p086.p091.p092.C1583.C1584) r4
            int r5 = r4.f7519
            if (r5 != r2) goto L32
            int r6 = r4.f7526
            if (r6 == r0) goto L38
        L32:
            if (r5 != r9) goto L1e
            int r5 = r4.f7526
            if (r5 != r8) goto L1e
        L38:
            r7.f7501 = r4
            づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ざっざへづ r8 = r4.f7523
            if (r8 == 0) goto L43
            boolean r9 = r7.f7498
            r8.m3563(r9)
        L43:
            return
        L44:
            づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぇぬぎばつ$〺つふすそ r8 = r7.f7504
            java.util.ArrayList<づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぇぬぎばつ$〺つふすそ> r3 = r7.f7506
            java.util.Iterator r3 = r3.iterator()
        L4c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5e
            java.lang.Object r4 = r3.next()
            づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぇぬぎばつ$〺つふすそ r4 = (p034.p086.p091.p092.C1583.C1584) r4
            int r5 = r4.f7519
            if (r5 != r9) goto L4c
            r8 = r4
            goto L4c
        L5e:
            づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぇぬぎばつ$〺つふすそ r9 = new づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぇぬぎばつ$〺つふすそ
            r9.<init>(r7, r8)
            r9.f7526 = r0
            r9.f7519 = r2
            if (r0 == r1) goto L6e
            java.util.ArrayList<づざかべべ.なぎぱいぢぎ.げつ〴ぬぐ.〺つふすそ.ぇぬぎばつ$〺つふすそ> r8 = r7.f7508
            r8.add(r9)
        L6e:
            r7.f7501 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p086.p091.p092.C1583.m3547(int, int):void");
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int m3548() {
        C1584 c1584 = this.f7501;
        if (c1584 == null) {
            return -1;
        }
        return c1584.f7519;
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean m3549() {
        Iterator<C1584> it = this.f7508.iterator();
        while (it.hasNext()) {
            if (it.next().f7523 != null) {
                return true;
            }
        }
        C1584 c1584 = this.f7501;
        return (c1584 == null || c1584.f7523 == null) ? false : true;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int m3550() {
        C1584 c1584 = this.f7501;
        if (c1584 == null) {
            return -1;
        }
        return c1584.f7526;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final void m3551(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1575.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C1575.MotionScene_defaultDuration) {
                this.f7497 = obtainStyledAttributes.getInt(index, this.f7497);
            } else if (index == C1575.MotionScene_layoutDuringTransition) {
                this.f7511 = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
