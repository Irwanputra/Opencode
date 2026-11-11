package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import p034.p086.p087.C1558;
import p034.p086.p087.p088.C1515;
import p034.p086.p087.p088.C1520;
import p034.p086.p087.p088.C1521;
import p034.p086.p087.p088.C1544;
import p034.p086.p087.p088.InterfaceC1513;
import p034.p086.p087.p088.p089.C1525;
import p034.p086.p090.AbstractC1576;
import p034.p086.p090.C1560;
import p034.p086.p090.C1566;
import p034.p086.p090.C1575;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f848;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public SparseArray<View> f849;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f850;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f851;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int f852;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public SparseArray<C1544> f853;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f854;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ArrayList<ConstraintHelper> f855;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f856;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public C0127 f857;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f858;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C1560 f859;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f860;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f861;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int f862;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C1520 f863;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public HashMap<String, Integer> f864;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f865;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public C1566 f866;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
        public int f867;

        /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
        public boolean f868;

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public int f869;

        /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
        public int f870;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f871;

        /* renamed from: 〺でおいここ, reason: contains not printable characters */
        public int f872;

        /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
        public int f873;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int f874;

        /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
        public int f875;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public int f876;

        /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
        public float f877;

        /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
        public float f878;

        /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
        public float f879;

        /* renamed from: ぇとしたべど, reason: contains not printable characters */
        public int f880;

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public int f881;

        /* renamed from: えがぐせほち, reason: contains not printable characters */
        public boolean f882;

        /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
        public int f883;

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public int f884;

        /* renamed from: ぉひのべい, reason: contains not printable characters */
        public int f885;

        /* renamed from: おかぷせ〱, reason: contains not printable characters */
        public int f886;

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public float f887;

        /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
        public int f888;

        /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
        public int f889;

        /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
        public int f890;

        /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
        public boolean f891;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public float f892;

        /* renamed from: くねねぱす〻, reason: contains not printable characters */
        public boolean f893;

        /* renamed from: けときぜと, reason: contains not printable characters */
        public int f894;

        /* renamed from: げがぴうあだ, reason: contains not printable characters */
        public float f895;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f896;

        /* renamed from: こ〲しでおか, reason: contains not printable characters */
        public boolean f897;

        /* renamed from: ごづごきえ, reason: contains not printable characters */
        public int f898;

        /* renamed from: ごまけがぢは, reason: contains not printable characters */
        public String f899;

        /* renamed from: ざっざへづ, reason: contains not printable characters */
        public int f900;

        /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
        public int f901;

        /* renamed from: じぜこほぱ, reason: contains not printable characters */
        public float f902;

        /* renamed from: ずまげせび〳, reason: contains not printable characters */
        public int f903;

        /* renamed from: せづっ〸ちね, reason: contains not printable characters */
        public int f904;

        /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
        public int f905;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f906;

        /* renamed from: ておぞぞはね, reason: contains not printable characters */
        public int f907;

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public int f908;

        /* renamed from: でどあくず, reason: contains not printable characters */
        public int f909;

        /* renamed from: どぇぞほだ, reason: contains not printable characters */
        public int f910;

        /* renamed from: な〱ちぉじ, reason: contains not printable characters */
        public float f911;

        /* renamed from: ながふずは, reason: contains not printable characters */
        public float f912;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f913;

        /* renamed from: なぶひせが, reason: contains not printable characters */
        public String f914;

        /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
        public boolean f915;

        /* renamed from: のびぶけせ, reason: contains not printable characters */
        public int f916;

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public int f917;

        /* renamed from: は〲ぱなで, reason: contains not printable characters */
        public int f918;

        /* renamed from: はつきどっ, reason: contains not printable characters */
        public int f919;

        /* renamed from: ばおぢでぎか, reason: contains not printable characters */
        public boolean f920;

        /* renamed from: びえぁぜい, reason: contains not printable characters */
        public float f921;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f922;

        /* renamed from: びちづぼぬ, reason: contains not printable characters */
        public C1544 f923;

        /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
        public int f924;

        /* renamed from: ぷぞてのほき, reason: contains not printable characters */
        public int f925;

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public int f926;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public int f927;

        /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
        public boolean f928;

        /* renamed from: ぺづげぺが, reason: contains not printable characters */
        public int f929;

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public int f930;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$LayoutParams$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0126 {

            /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
            public static final SparseIntArray f931;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f931 = sparseIntArray;
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(C1575.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                f931.append(C1575.ConstraintLayout_Layout_layout_constraintTag, 51);
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f896 = -1;
            this.f871 = -1;
            this.f892 = -1.0f;
            this.f922 = -1;
            this.f906 = -1;
            this.f913 = -1;
            this.f874 = -1;
            this.f869 = -1;
            this.f927 = -1;
            this.f876 = -1;
            this.f930 = -1;
            this.f908 = -1;
            this.f917 = -1;
            this.f926 = 0;
            this.f887 = 0.0f;
            this.f881 = -1;
            this.f884 = -1;
            this.f901 = -1;
            this.f918 = -1;
            this.f898 = -1;
            this.f900 = -1;
            this.f909 = -1;
            this.f924 = -1;
            this.f873 = -1;
            this.f883 = -1;
            this.f878 = 0.5f;
            this.f921 = 0.5f;
            this.f914 = null;
            this.f910 = 1;
            this.f877 = -1.0f;
            this.f902 = -1.0f;
            this.f929 = 0;
            this.f885 = 0;
            this.f904 = 0;
            this.f925 = 0;
            this.f894 = 0;
            this.f886 = 0;
            this.f872 = 0;
            this.f880 = 0;
            this.f895 = 1.0f;
            this.f912 = 1.0f;
            this.f875 = -1;
            this.f907 = -1;
            this.f905 = -1;
            this.f882 = false;
            this.f920 = false;
            this.f899 = null;
            this.f897 = true;
            this.f928 = true;
            this.f915 = false;
            this.f893 = false;
            this.f868 = false;
            this.f891 = false;
            this.f903 = -1;
            this.f888 = -1;
            this.f870 = -1;
            this.f919 = -1;
            this.f867 = -1;
            this.f890 = -1;
            this.f911 = 0.5f;
            this.f923 = new C1544();
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            this.f896 = -1;
            this.f871 = -1;
            this.f892 = -1.0f;
            this.f922 = -1;
            this.f906 = -1;
            this.f913 = -1;
            this.f874 = -1;
            this.f869 = -1;
            this.f927 = -1;
            this.f876 = -1;
            this.f930 = -1;
            this.f908 = -1;
            this.f917 = -1;
            this.f926 = 0;
            this.f887 = 0.0f;
            this.f881 = -1;
            this.f884 = -1;
            this.f901 = -1;
            this.f918 = -1;
            this.f898 = -1;
            this.f900 = -1;
            this.f909 = -1;
            this.f924 = -1;
            this.f873 = -1;
            this.f883 = -1;
            this.f878 = 0.5f;
            this.f921 = 0.5f;
            this.f914 = null;
            this.f910 = 1;
            this.f877 = -1.0f;
            this.f902 = -1.0f;
            this.f929 = 0;
            this.f885 = 0;
            this.f904 = 0;
            this.f925 = 0;
            this.f894 = 0;
            this.f886 = 0;
            this.f872 = 0;
            this.f880 = 0;
            this.f895 = 1.0f;
            this.f912 = 1.0f;
            this.f875 = -1;
            this.f907 = -1;
            this.f905 = -1;
            this.f882 = false;
            this.f920 = false;
            this.f899 = null;
            this.f897 = true;
            this.f928 = true;
            this.f915 = false;
            this.f893 = false;
            this.f868 = false;
            this.f891 = false;
            this.f903 = -1;
            this.f888 = -1;
            this.f870 = -1;
            this.f919 = -1;
            this.f867 = -1;
            this.f890 = -1;
            this.f911 = 0.5f;
            this.f923 = new C1544();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1575.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0126.f931.get(index);
                switch (i3) {
                    case 1:
                        this.f905 = obtainStyledAttributes.getInt(index, this.f905);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f917);
                        this.f917 = resourceId;
                        if (resourceId == -1) {
                            this.f917 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f926 = obtainStyledAttributes.getDimensionPixelSize(index, this.f926);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f887) % 360.0f;
                        this.f887 = f;
                        if (f < 0.0f) {
                            this.f887 = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f896 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f896);
                        break;
                    case 6:
                        this.f871 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f871);
                        break;
                    case 7:
                        this.f892 = obtainStyledAttributes.getFloat(index, this.f892);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f922);
                        this.f922 = resourceId2;
                        if (resourceId2 == -1) {
                            this.f922 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f906);
                        this.f906 = resourceId3;
                        if (resourceId3 == -1) {
                            this.f906 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f913);
                        this.f913 = resourceId4;
                        if (resourceId4 == -1) {
                            this.f913 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f874);
                        this.f874 = resourceId5;
                        if (resourceId5 == -1) {
                            this.f874 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f869);
                        this.f869 = resourceId6;
                        if (resourceId6 == -1) {
                            this.f869 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f927);
                        this.f927 = resourceId7;
                        if (resourceId7 == -1) {
                            this.f927 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f876);
                        this.f876 = resourceId8;
                        if (resourceId8 == -1) {
                            this.f876 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f930);
                        this.f930 = resourceId9;
                        if (resourceId9 == -1) {
                            this.f930 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f908);
                        this.f908 = resourceId10;
                        if (resourceId10 == -1) {
                            this.f908 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f881);
                        this.f881 = resourceId11;
                        if (resourceId11 == -1) {
                            this.f881 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f884);
                        this.f884 = resourceId12;
                        if (resourceId12 == -1) {
                            this.f884 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f901);
                        this.f901 = resourceId13;
                        if (resourceId13 == -1) {
                            this.f901 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f918);
                        this.f918 = resourceId14;
                        if (resourceId14 == -1) {
                            this.f918 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f898 = obtainStyledAttributes.getDimensionPixelSize(index, this.f898);
                        break;
                    case 22:
                        this.f900 = obtainStyledAttributes.getDimensionPixelSize(index, this.f900);
                        break;
                    case 23:
                        this.f909 = obtainStyledAttributes.getDimensionPixelSize(index, this.f909);
                        break;
                    case 24:
                        this.f924 = obtainStyledAttributes.getDimensionPixelSize(index, this.f924);
                        break;
                    case 25:
                        this.f873 = obtainStyledAttributes.getDimensionPixelSize(index, this.f873);
                        break;
                    case 26:
                        this.f883 = obtainStyledAttributes.getDimensionPixelSize(index, this.f883);
                        break;
                    case 27:
                        this.f882 = obtainStyledAttributes.getBoolean(index, this.f882);
                        break;
                    case 28:
                        this.f920 = obtainStyledAttributes.getBoolean(index, this.f920);
                        break;
                    case 29:
                        this.f878 = obtainStyledAttributes.getFloat(index, this.f878);
                        break;
                    case 30:
                        this.f921 = obtainStyledAttributes.getFloat(index, this.f921);
                        break;
                    case 31:
                        this.f904 = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.f925 = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.f894 = obtainStyledAttributes.getDimensionPixelSize(index, this.f894);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f894) == -2) {
                                this.f894 = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f872 = obtainStyledAttributes.getDimensionPixelSize(index, this.f872);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f872) == -2) {
                                this.f872 = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f895 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f895));
                        this.f904 = 2;
                        break;
                    case 36:
                        try {
                            this.f886 = obtainStyledAttributes.getDimensionPixelSize(index, this.f886);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f886) == -2) {
                                this.f886 = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f880 = obtainStyledAttributes.getDimensionPixelSize(index, this.f880);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f880) == -2) {
                                this.f880 = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f912 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f912));
                        this.f925 = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f914 = string;
                                this.f910 = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.f914.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f914.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f910 = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f910 = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f914.indexOf(58);
                                    if (indexOf2 < 0 || indexOf2 >= length - 1) {
                                        String substring2 = this.f914.substring(i);
                                        if (substring2.length() > 0) {
                                            Float.parseFloat(substring2);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        String substring3 = this.f914.substring(i, indexOf2);
                                        String substring4 = this.f914.substring(indexOf2 + 1);
                                        if (substring3.length() > 0 && substring4.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring3);
                                                float parseFloat2 = Float.parseFloat(substring4);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f910 == 1) {
                                                        Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    break;
                                }
                                break;
                            case 45:
                                this.f877 = obtainStyledAttributes.getFloat(index, this.f877);
                                break;
                            case 46:
                                this.f902 = obtainStyledAttributes.getFloat(index, this.f902);
                                break;
                            case 47:
                                this.f929 = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f885 = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f875 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f875);
                                break;
                            case 50:
                                this.f907 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f907);
                                break;
                            case 51:
                                this.f899 = obtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            m317();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f896 = -1;
            this.f871 = -1;
            this.f892 = -1.0f;
            this.f922 = -1;
            this.f906 = -1;
            this.f913 = -1;
            this.f874 = -1;
            this.f869 = -1;
            this.f927 = -1;
            this.f876 = -1;
            this.f930 = -1;
            this.f908 = -1;
            this.f917 = -1;
            this.f926 = 0;
            this.f887 = 0.0f;
            this.f881 = -1;
            this.f884 = -1;
            this.f901 = -1;
            this.f918 = -1;
            this.f898 = -1;
            this.f900 = -1;
            this.f909 = -1;
            this.f924 = -1;
            this.f873 = -1;
            this.f883 = -1;
            this.f878 = 0.5f;
            this.f921 = 0.5f;
            this.f914 = null;
            this.f910 = 1;
            this.f877 = -1.0f;
            this.f902 = -1.0f;
            this.f929 = 0;
            this.f885 = 0;
            this.f904 = 0;
            this.f925 = 0;
            this.f894 = 0;
            this.f886 = 0;
            this.f872 = 0;
            this.f880 = 0;
            this.f895 = 1.0f;
            this.f912 = 1.0f;
            this.f875 = -1;
            this.f907 = -1;
            this.f905 = -1;
            this.f882 = false;
            this.f920 = false;
            this.f899 = null;
            this.f897 = true;
            this.f928 = true;
            this.f915 = false;
            this.f893 = false;
            this.f868 = false;
            this.f891 = false;
            this.f903 = -1;
            this.f888 = -1;
            this.f870 = -1;
            this.f919 = -1;
            this.f867 = -1;
            this.f890 = -1;
            this.f911 = 0.5f;
            this.f923 = new C1544();
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
        
            if (r1 > 0) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
        
            ((android.view.ViewGroup.MarginLayoutParams) r9).rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x00e3, code lost:
        
            if (r1 > 0) goto L75;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00f5  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m317() {
            this.f893 = false;
            this.f897 = true;
            this.f928 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f882) {
                this.f897 = false;
                if (this.f904 == 0) {
                    this.f904 = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f920) {
                this.f928 = false;
                if (this.f925 == 0) {
                    this.f925 = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f897 = false;
                if (i == 0 && this.f904 == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f882 = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f928 = false;
                if (i2 == 0 && this.f925 == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f920 = true;
                }
            }
            if (this.f892 == -1.0f && this.f896 == -1 && this.f871 == -1) {
                return;
            }
            this.f893 = true;
            this.f897 = true;
            this.f928 = true;
            if (!(this.f923 instanceof C1515)) {
                this.f923 = new C1515();
            }
            ((C1515) this.f923).m3318(this.f905);
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0127 implements C1525.InterfaceC1526 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f933;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int f934;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f935;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public ConstraintLayout f936;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f937;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f938;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f939;

        public C0127(ConstraintLayout constraintLayout) {
            this.f936 = constraintLayout;
        }

        /* JADX WARN: Removed duplicated region for block: B:147:0x01c2  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01bb  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01c0  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01c7 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01cf A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01d8  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01e3  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01ee A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01ef  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m318(p034.p086.p087.p088.C1544 r18, p034.p086.p087.p088.p089.C1525.C1527 r19) {
            /*
                Method dump skipped, instructions count: 740
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0127.m318(づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.びぐびあび, づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.のぷのちつ.〺つふすそ$げつ〴ぬぐ):void");
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final boolean m319(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.f849 = new SparseArray<>();
        this.f855 = new ArrayList<>(4);
        this.f863 = new C1520();
        this.f858 = 0;
        this.f860 = 0;
        this.f850 = Integer.MAX_VALUE;
        this.f848 = Integer.MAX_VALUE;
        this.f865 = true;
        this.f851 = 257;
        this.f866 = null;
        this.f859 = null;
        this.f861 = -1;
        this.f864 = new HashMap<>();
        this.f854 = -1;
        this.f852 = -1;
        this.f853 = new SparseArray<>();
        this.f857 = new C0127(this);
        this.f862 = 0;
        this.f856 = 0;
        m316(null, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f849 = new SparseArray<>();
        this.f855 = new ArrayList<>(4);
        this.f863 = new C1520();
        this.f858 = 0;
        this.f860 = 0;
        this.f850 = Integer.MAX_VALUE;
        this.f848 = Integer.MAX_VALUE;
        this.f865 = true;
        this.f851 = 257;
        this.f866 = null;
        this.f859 = null;
        this.f861 = -1;
        this.f864 = new HashMap<>();
        this.f854 = -1;
        this.f852 = -1;
        this.f853 = new SparseArray<>();
        this.f857 = new C0127(this);
        this.f862 = 0;
        this.f856 = 0;
        m316(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f849 = new SparseArray<>();
        this.f855 = new ArrayList<>(4);
        this.f863 = new C1520();
        this.f858 = 0;
        this.f860 = 0;
        this.f850 = Integer.MAX_VALUE;
        this.f848 = Integer.MAX_VALUE;
        this.f865 = true;
        this.f851 = 257;
        this.f866 = null;
        this.f859 = null;
        this.f861 = -1;
        this.f864 = new HashMap<>();
        this.f854 = -1;
        this.f852 = -1;
        this.f853 = new SparseArray<>();
        this.f857 = new C0127(this);
        this.f862 = 0;
        this.f856 = 0;
        m316(attributeSet, i, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Build.VERSION.SDK_INT >= 17 ? Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart()) : 0;
        return max2 > 0 ? max2 : max;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f855;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.f855.get(i).mo255(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        this.f865 = true;
        this.f854 = -1;
        this.f852 = -1;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getMaxHeight() {
        return this.f848;
    }

    public int getMaxWidth() {
        return this.f850;
    }

    public int getMinHeight() {
        return this.f860;
    }

    public int getMinWidth() {
        return this.f858;
    }

    public int getOptimizationLevel() {
        return this.f863.f7017;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            C1544 c1544 = layoutParams.f923;
            if ((childAt.getVisibility() != 8 || layoutParams.f893 || layoutParams.f868 || isInEditMode) && !layoutParams.f891) {
                int m3409 = c1544.m3409();
                int m3417 = c1544.m3417();
                int m3438 = c1544.m3438() + m3409;
                int m3418 = c1544.m3418() + m3417;
                childAt.layout(m3409, m3417, m3438, m3418);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(m3409, m3417, m3438, m3418);
                }
            }
        }
        int size = this.f855.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f855.get(i6).mo256(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int m3438;
        int m3418;
        C1520 c1520;
        boolean z;
        boolean z2;
        String str;
        int m306;
        String resourceName;
        int id;
        C1544 c1544;
        if (!this.f865) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                if (getChildAt(i3).isLayoutRequested()) {
                    this.f865 = true;
                    break;
                }
                i3++;
            }
        }
        if (!this.f865) {
            int i4 = this.f862;
            if (i4 == i && this.f856 == i2) {
                m3438 = this.f863.m3438();
                m3418 = this.f863.m3418();
                c1520 = this.f863;
                z = c1520.f7027;
            } else if (i4 == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.f856) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= this.f863.m3418()) {
                this.f862 = i;
                this.f856 = i2;
                m3438 = this.f863.m3438();
                m3418 = this.f863.m3418();
                c1520 = this.f863;
                z = c1520.f7027;
            }
            m311(i, i2, m3438, m3418, z, c1520.f7029);
        }
        this.f862 = i;
        this.f856 = i2;
        this.f863.f7024 = m309();
        if (this.f865) {
            this.f865 = false;
            int childCount2 = getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount2) {
                    z2 = false;
                    break;
                } else {
                    if (getChildAt(i5).isLayoutRequested()) {
                        z2 = true;
                        break;
                    }
                    i5++;
                }
            }
            if (z2) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i6 = 0; i6 < childCount3; i6++) {
                    C1544 m314 = m314(getChildAt(i6));
                    if (m314 != null) {
                        m314.mo3342();
                    }
                }
                if (isInEditMode) {
                    for (int i7 = 0; i7 < childCount3; i7++) {
                        View childAt = getChildAt(i7);
                        try {
                            resourceName = getResources().getResourceName(childAt.getId());
                            setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                            int indexOf = resourceName.indexOf(47);
                            if (indexOf != -1) {
                                resourceName = resourceName.substring(indexOf + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = this.f849.get(id);
                            if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
                                onViewAdded(view);
                            }
                            if (view != this) {
                                c1544 = view == null ? null : ((LayoutParams) view.getLayoutParams()).f923;
                                c1544.f7172 = resourceName;
                            }
                        }
                        c1544 = this.f863;
                        c1544.f7172 = resourceName;
                    }
                }
                if (this.f861 != -1) {
                    for (int i8 = 0; i8 < childCount3; i8++) {
                        View childAt2 = getChildAt(i8);
                        if (childAt2.getId() == this.f861 && (childAt2 instanceof Constraints)) {
                            this.f866 = ((Constraints) childAt2).getConstraintSet();
                        }
                    }
                }
                C1566 c1566 = this.f866;
                if (c1566 != null) {
                    c1566.m3507(this, true);
                }
                this.f863.f7035.clear();
                int size = this.f855.size();
                if (size > 0) {
                    for (int i9 = 0; i9 < size; i9++) {
                        ConstraintHelper constraintHelper = this.f855.get(i9);
                        if (constraintHelper.isInEditMode()) {
                            constraintHelper.setIds(constraintHelper.f845);
                        }
                        InterfaceC1513 interfaceC1513 = constraintHelper.f844;
                        if (interfaceC1513 != null) {
                            interfaceC1513.mo3310();
                            for (int i10 = 0; i10 < constraintHelper.f843; i10++) {
                                int i11 = constraintHelper.f841[i10];
                                View m315 = m315(i11);
                                if (m315 == null && (m306 = constraintHelper.m306(this, (str = constraintHelper.f847.get(Integer.valueOf(i11))))) != 0) {
                                    constraintHelper.f841[i10] = m306;
                                    constraintHelper.f847.put(Integer.valueOf(m306), str);
                                    m315 = m315(m306);
                                }
                                if (m315 != null) {
                                    constraintHelper.f844.mo3311(m314(m315));
                                }
                            }
                            constraintHelper.f844.mo3309(this.f863);
                        }
                    }
                }
                for (int i12 = 0; i12 < childCount3; i12++) {
                    View childAt3 = getChildAt(i12);
                    if (childAt3 instanceof Placeholder) {
                        Placeholder placeholder = (Placeholder) childAt3;
                        if (placeholder.f954 == -1 && !placeholder.isInEditMode()) {
                            placeholder.setVisibility(placeholder.f956);
                        }
                        View findViewById = findViewById(placeholder.f954);
                        placeholder.f955 = findViewById;
                        if (findViewById != null) {
                            ((LayoutParams) findViewById.getLayoutParams()).f891 = true;
                            placeholder.f955.setVisibility(0);
                            placeholder.setVisibility(0);
                        }
                    }
                }
                this.f853.clear();
                this.f853.put(0, this.f863);
                this.f853.put(getId(), this.f863);
                for (int i13 = 0; i13 < childCount3; i13++) {
                    View childAt4 = getChildAt(i13);
                    this.f853.put(childAt4.getId(), m314(childAt4));
                }
                for (int i14 = 0; i14 < childCount3; i14++) {
                    View childAt5 = getChildAt(i14);
                    C1544 m3142 = m314(childAt5);
                    if (m3142 != null) {
                        LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                        C1520 c15202 = this.f863;
                        c15202.f7035.add(m3142);
                        C1544 c15442 = m3142.f7203;
                        if (c15442 != null) {
                            ((C1521) c15442).f7035.remove(m3142);
                            m3142.mo3342();
                        }
                        m3142.f7203 = c15202;
                        m313(isInEditMode, childAt5, m3142, layoutParams, this.f853);
                    }
                }
            }
            if (z2) {
                C1520 c15203 = this.f863;
                c15203.f7019.m3371(c15203);
            }
        }
        m310(this.f863, this.f851, i, i2);
        m3438 = this.f863.m3438();
        m3418 = this.f863.m3418();
        c1520 = this.f863;
        z = c1520.f7027;
        m311(i, i2, m3438, m3418, z, c1520.f7029);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C1544 m314 = m314(view);
        if ((view instanceof Guideline) && !(m314 instanceof C1515)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            C1515 c1515 = new C1515();
            layoutParams.f923 = c1515;
            layoutParams.f893 = true;
            c1515.m3318(layoutParams.f905);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.m305();
            ((LayoutParams) view.getLayoutParams()).f868 = true;
            if (!this.f855.contains(constraintHelper)) {
                this.f855.add(constraintHelper);
            }
        }
        this.f849.put(view.getId(), view);
        this.f865 = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f849.remove(view.getId());
        C1544 m314 = m314(view);
        this.f863.f7035.remove(m314);
        m314.mo3342();
        this.f855.remove(view);
        this.f865 = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f865 = true;
        this.f854 = -1;
        this.f852 = -1;
        super.requestLayout();
    }

    public void setConstraintSet(C1566 c1566) {
        this.f866 = c1566;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f864 == null) {
                this.f864 = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f864.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.f849.remove(getId());
        super.setId(i);
        this.f849.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f848) {
            return;
        }
        this.f848 = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f850) {
            return;
        }
        this.f850 = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f860) {
            return;
        }
        this.f860 = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f858) {
            return;
        }
        this.f858 = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC1576 abstractC1576) {
        C1560 c1560 = this.f859;
        if (c1560 != null) {
            c1560.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f851 = i;
        C1520 c1520 = this.f863;
        c1520.f7017 = i;
        C1558.f7303 = c1520.m3350(512);
    }

    public void setState(int i, int i2, int i3) {
        C1560 c1560 = this.f859;
        if (c1560 != null) {
            c1560.m3497(i, i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* renamed from: 〺つふすそ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean m309() {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0553 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c8  */
    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m310(p034.p086.p087.p088.C1520 r29, int r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 1931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m310(づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.づざかべべ, int, int, int):void");
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public void m311(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0127 c0127 = this.f857;
        int i5 = c0127.f937;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i3 + c0127.f939, i, 0);
        int resolveSizeAndState2 = ViewGroup.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int min = Math.min(this.f850, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f848, resolveSizeAndState2);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f854 = min;
        this.f852 = min2;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Object m312(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f864;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f864.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01a6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x0382 -> B:97:0x0383). Please report as a decompilation issue!!! */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m313(boolean r23, android.view.View r24, p034.p086.p087.p088.C1544 r25, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r26, android.util.SparseArray<p034.p086.p087.p088.C1544> r27) {
        /*
            Method dump skipped, instructions count: 1005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m313(boolean, android.view.View, づざかべべ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ.びぐびあび, androidx.constraintlayout.widget.ConstraintLayout$LayoutParams, android.util.SparseArray):void");
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final C1544 m314(View view) {
        if (view == this) {
            return this.f863;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f923;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public View m315(int i) {
        return this.f849.get(i);
    }

    /* renamed from: へぬ〴づぞ */
    public void mo276(int i) {
        this.f859 = new C1560(getContext(), this, i);
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final void m316(AttributeSet attributeSet, int i, int i2) {
        C1520 c1520 = this.f863;
        c1520.f7210 = this;
        c1520.m3340(this.f857);
        this.f849.put(getId(), this);
        this.f866 = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1575.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C1575.ConstraintLayout_Layout_android_minWidth) {
                    this.f858 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f858);
                } else if (index == C1575.ConstraintLayout_Layout_android_minHeight) {
                    this.f860 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f860);
                } else if (index == C1575.ConstraintLayout_Layout_android_maxWidth) {
                    this.f850 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f850);
                } else if (index == C1575.ConstraintLayout_Layout_android_maxHeight) {
                    this.f848 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f848);
                } else if (index == C1575.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f851 = obtainStyledAttributes.getInt(index, this.f851);
                } else if (index == C1575.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo276(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f859 = null;
                        }
                    }
                } else if (index == C1575.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C1566 c1566 = new C1566();
                        this.f866 = c1566;
                        c1566.m3504(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f866 = null;
                    }
                    this.f861 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f863.m3344(this.f851);
    }
}
