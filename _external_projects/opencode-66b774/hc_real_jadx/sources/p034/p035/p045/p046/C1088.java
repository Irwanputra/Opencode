package p034.p035.p045.p046;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.ぉ〲なぱぽた.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1088 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object f5568;

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.ぉ〲なぱぽた.くし〴〺ぅ$〺つふすそ, reason: contains not printable characters */
    public static class C1089 extends C1090 {
        public C1089(C1088 c1088) {
            super(c1088);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            C1084 mo2472 = this.f5569.mo2472(i);
            if (mo2472 == null) {
                return null;
            }
            return mo2472.f5550;
        }
    }

    /* renamed from: づざかべべ.〳ぜぞぜべっ.のぷのちつ.ぉ〲なぱぽた.くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1090 extends AccessibilityNodeProvider {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final C1088 f5569;

        public C1090(C1088 c1088) {
            this.f5569 = c1088;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C1084 mo2474 = this.f5569.mo2474(i);
            if (mo2474 == null) {
                return null;
            }
            return mo2474.f5550;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            this.f5569.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f5569.mo2473(i, i2, bundle);
        }
    }

    public C1088() {
        int i = Build.VERSION.SDK_INT;
        this.f5568 = i >= 19 ? new C1089(this) : i >= 16 ? new C1090(this) : null;
    }

    public C1088(Object obj) {
        this.f5568 = obj;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1084 mo2472(int i) {
        return null;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean mo2473(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C1084 mo2474(int i) {
        return null;
    }
}
