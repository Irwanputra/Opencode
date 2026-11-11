package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ParcelableSparseArray;
import p034.p050.p051.p052.C1164;
import p034.p050.p051.p052.C1197;
import p034.p050.p051.p052.InterfaceC1186;
import p034.p050.p051.p052.SubMenuC1180;
import p034.p095.C1722;
import p131.p161.p162.p163.p175.C2223;

/* loaded from: /tmp/opencode/hc_real.dex */
public class BottomNavigationPresenter implements InterfaceC1186 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1164 f3078;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public BottomNavigationMenuView f3079;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f3080;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f3081 = false;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0405();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f3082;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public ParcelableSparseArray f3083;

        /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0405 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f3082 = parcel.readInt();
            this.f3083 = (ParcelableSparseArray) parcel.readParcelable(SavedState.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3082);
            parcel.writeParcelable(this.f3083, 0);
        }
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    public int getId() {
        return this.f3080;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: 〳ぜぞぜべっ */
    public boolean mo117() {
        return false;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: ぁごぐすすぃ */
    public void mo119(boolean z) {
        if (this.f3081) {
            return;
        }
        if (z) {
            this.f3079.m1334();
            return;
        }
        BottomNavigationMenuView bottomNavigationMenuView = this.f3079;
        C1164 c1164 = bottomNavigationMenuView.f3057;
        if (c1164 == null || bottomNavigationMenuView.f3067 == null) {
            return;
        }
        int size = c1164.size();
        if (size != bottomNavigationMenuView.f3067.length) {
            bottomNavigationMenuView.m1334();
            return;
        }
        int i = bottomNavigationMenuView.f3070;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = bottomNavigationMenuView.f3057.getItem(i2);
            if (item.isChecked()) {
                bottomNavigationMenuView.f3070 = item.getItemId();
                bottomNavigationMenuView.f3074 = i2;
            }
        }
        if (i != bottomNavigationMenuView.f3070) {
            C1722.m3765(bottomNavigationMenuView, bottomNavigationMenuView.f3053);
        }
        boolean m1335 = bottomNavigationMenuView.m1335(bottomNavigationMenuView.f3076, bottomNavigationMenuView.f3057.m2625().size());
        for (int i3 = 0; i3 < size; i3++) {
            bottomNavigationMenuView.f3059.f3081 = true;
            bottomNavigationMenuView.f3067[i3].setLabelVisibilityMode(bottomNavigationMenuView.f3076);
            bottomNavigationMenuView.f3067[i3].setShifting(m1335);
            bottomNavigationMenuView.f3067[i3].mo88((C1197) bottomNavigationMenuView.f3057.getItem(i3), 0);
            bottomNavigationMenuView.f3059.f3081 = false;
        }
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: いいにぽつ */
    public boolean mo242(C1164 c1164, C1197 c1197) {
        return false;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: くし〴〺ぅ */
    public void mo122(Context context, C1164 c1164) {
        this.f3078 = c1164;
        this.f3079.f3057 = c1164;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: げつ〴ぬぐ */
    public void mo123(C1164 c1164, boolean z) {
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: づざかべべ */
    public boolean mo124(SubMenuC1180 subMenuC1180) {
        return false;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: びぐびあび */
    public void mo127(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            BottomNavigationMenuView bottomNavigationMenuView = this.f3079;
            SavedState savedState = (SavedState) parcelable;
            int i = savedState.f3082;
            int size = bottomNavigationMenuView.f3057.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = bottomNavigationMenuView.f3057.getItem(i2);
                if (i == item.getItemId()) {
                    bottomNavigationMenuView.f3070 = i;
                    bottomNavigationMenuView.f3074 = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.f3079.getContext();
            ParcelableSparseArray parcelableSparseArray = savedState.f3083;
            boolean z = C2223.f9238;
            SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
            for (int i3 = 0; i3 < parcelableSparseArray.size(); i3++) {
                int keyAt = parcelableSparseArray.keyAt(i3);
                BadgeDrawable.SavedState savedState2 = (BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i3);
                if (savedState2 == null) {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
                BadgeDrawable badgeDrawable = new BadgeDrawable(context);
                badgeDrawable.m1306(savedState2.f2981);
                int i4 = savedState2.f2979;
                if (i4 != -1) {
                    badgeDrawable.m1300(i4);
                }
                badgeDrawable.m1304(savedState2.f2975);
                badgeDrawable.m1297(savedState2.f2978);
                badgeDrawable.m1299(savedState2.f2977);
                badgeDrawable.f2972.f2984 = savedState2.f2984;
                badgeDrawable.m1307();
                badgeDrawable.f2972.f2980 = savedState2.f2980;
                badgeDrawable.m1307();
                sparseArray.put(keyAt, badgeDrawable);
            }
            this.f3079.setBadgeDrawables(sparseArray);
        }
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: ぺぁあねじ */
    public Parcelable mo129() {
        SavedState savedState = new SavedState();
        savedState.f3082 = this.f3079.getSelectedItemId();
        SparseArray<BadgeDrawable> badgeDrawables = this.f3079.getBadgeDrawables();
        boolean z = C2223.f9238;
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int keyAt = badgeDrawables.keyAt(i);
            BadgeDrawable valueAt = badgeDrawables.valueAt(i);
            if (valueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            parcelableSparseArray.put(keyAt, valueAt.f2972);
        }
        savedState.f3083 = parcelableSparseArray;
        return savedState;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: ぺふねづ〺 */
    public boolean mo243(C1164 c1164, C1197 c1197) {
        return false;
    }
}
