package p034.p105.p106;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p034.p035.C1037;
import p034.p035.p045.C1096;

@SuppressLint({"UnknownNullness"})
/* renamed from: づざかべべ.ぺふねづ〺.げつ〴ぬぐ.ぇ〳〲〺すっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1787 {
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static boolean m3828(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static void m3829(List<View> list, View view) {
        int size = list.size();
        if (m3828(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m3828(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static boolean m3830(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: 〺つふすそ */
    public abstract void mo3767(Object obj, ArrayList<View> arrayList);

    /* renamed from: ぁごぐすすぃ */
    public abstract Object mo3768(Object obj);

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void m3831(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    /* renamed from: ぇぬぎばつ */
    public abstract void mo3769(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: ぉざぅち〻 */
    public abstract void mo3770(Object obj, Rect rect);

    /* renamed from: おぐぴう〸ず */
    public abstract void mo3771(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: くし〴〺ぅ */
    public abstract void mo3772(ViewGroup viewGroup, Object obj);

    /* renamed from: げつ〴ぬぐ */
    public abstract void mo3773(Object obj, View view);

    /* renamed from: ごづごきえ */
    public abstract void mo3774(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: ざっざへづ */
    public abstract Object mo3775(Object obj);

    /* renamed from: ざとぅぼこ〺 */
    public abstract void mo3776(Object obj, View view);

    /* renamed from: づざかべべ */
    public abstract boolean mo3777(Object obj);

    /* renamed from: てぜきぽく */
    public abstract Object mo3778(Object obj, Object obj2, Object obj3);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.ArrayList<android.view.View>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.View, android.view.ViewGroup] */
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m3832(ArrayList<View> arrayList, View view) {
        boolean z;
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                view = (ViewGroup) view;
                if (Build.VERSION.SDK_INT >= 21) {
                    z = view.isTransitionGroup();
                } else {
                    Boolean bool = (Boolean) view.getTag(C1037.tag_transition_group);
                    z = ((bool == null || !bool.booleanValue()) && view.getBackground() == null && C1096.m2497(view) == null) ? false : true;
                }
                if (!z) {
                    int childCount = view.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        m3832(arrayList, view.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(view);
        }
    }

    /* renamed from: のぷのちつ */
    public abstract void mo3779(Object obj, View view);

    /* renamed from: は〲ぱなで */
    public abstract void mo3780(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: へぬ〴づぞ */
    public abstract void mo3781(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m3833(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String m2497 = C1096.m2497(view);
            if (m2497 != null) {
                map.put(m2497, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m3833(map, viewGroup.getChildAt(i));
                }
            }
        }
    }
}
