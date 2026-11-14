package dev.epro.r0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.ContextThemeWrapper;
import java.io.IOException;
import net.zetetic.database.R;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R3555377658195931925 implements I9906786506247477813 {
    public final int a;
    public final A11042752882447342413 b;
    public final int[][] c;
    public final A11042752882447342413[] d;

    public R3555377658195931925(O3228356295430981133 o3228356295430981133) {
        this.a = o3228356295430981133.a;
        this.b = (A11042752882447342413) o3228356295430981133.b;
        this.c = (int[][]) o3228356295430981133.c;
        this.d = (A11042752882447342413[]) o3228356295430981133.d;
    }

    public static void e(O3228356295430981133 o3228356295430981133, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = Q9005017131391967988.j;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                W8078457053980686709 w8078457053980686709 = new W8078457053980686709(0.0f);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
                if (resourceId2 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
                }
                A11042752882447342413 a11042752882447342413A = A11042752882447342413.f(contextThemeWrapper.obtainStyledAttributes(Q9005017131391967988.f460o), w8078457053980686709).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i);
                int i4 = o3228356295430981133.a;
                if (i4 == 0 || iArrTrimStateSet.length == 0) {
                    o3228356295430981133.b = a11042752882447342413A;
                }
                int[][] iArr3 = (int[][]) o3228356295430981133.c;
                if (i4 >= iArr3.length) {
                    int i5 = i4 + 10;
                    int[][] iArr4 = new int[i5][];
                    System.arraycopy(iArr3, 0, iArr4, 0, i4);
                    o3228356295430981133.c = iArr4;
                    A11042752882447342413[] a11042752882447342413Arr = new A11042752882447342413[i5];
                    System.arraycopy((A11042752882447342413[]) o3228356295430981133.d, 0, a11042752882447342413Arr, 0, i4);
                    o3228356295430981133.d = a11042752882447342413Arr;
                }
                int[][] iArr5 = (int[][]) o3228356295430981133.c;
                int i6 = o3228356295430981133.a;
                iArr5[i6] = iArrTrimStateSet;
                ((A11042752882447342413[]) o3228356295430981133.d)[i6] = a11042752882447342413A;
                o3228356295430981133.a = i6 + 1;
            }
        }
    }

    @Override // dev.epro.r0.I9906786506247477813
    public final A11042752882447342413 a(float f) {
        return this.b.a(f);
    }

    @Override // dev.epro.r0.I9906786506247477813
    public final A11042752882447342413 b(int[] iArr) {
        int i;
        int i2;
        int[][] iArr2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = -1;
            i2 = this.a;
            iArr2 = this.c;
            if (i4 >= i2) {
                i4 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i4], iArr)) {
                break;
            }
            i4++;
        }
        if (i4 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr2[i3], iArr3)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            i4 = i;
        }
        return this.d[i4];
    }

    @Override // dev.epro.r0.I9906786506247477813
    public final A11042752882447342413 c() {
        return this.b;
    }

    @Override // dev.epro.r0.I9906786506247477813
    public final boolean d() {
        return this.a > 1;
    }
}
