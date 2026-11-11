.class public Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
.super Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/bottomsheet/BottomSheetBehavior$SavedState;,
        Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;,
        Lcom/google/android/material/bottomsheet/BottomSheetBehavior$びぐびあび;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior<",
        "TV;>;"
    }
.end annotation


# static fields
.field public static final ぃぜぶの〸ぃ:I


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public 〺つふすそ:Z

.field public 〺でおいここ:I

.field public 〻ぞまぎな〻:Z

.field public ぁごぐすすぃ:I

.field public いいにぽつ:I

.field public ぅみぱぎぎ:I

.field public ぇ〳〲〺すっ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

.field public ぇとしたべど:Z

.field public ぇぬぎばつ:I

.field public ぉ〲なぱぽた:I

.field public ぉざぅち〻:I

.field public ぉひのべい:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "TV;>;"
        }
    .end annotation
.end field

.field public おかぷせ〱:I

.field public おぐぴう〸ず:Landroid/animation/ValueAnimator;

.field public くし〴〺ぅ:F

.field public けときぜと:Landroid/view/VelocityTracker;

.field public げがぴうあだ:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/view/View;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public げつ〴ぬぐ:I

.field public ごづごきえ:I

.field public ざっざへづ:F

.field public ざとぅぼこ〺:I

.field public じぜこほぱ:I

.field public せづっ〸ちね:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public づざかべべ:Z

.field public てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

.field public でどあくず:Z

.field public どぇぞほだ:Z

.field public final ながふずは:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

.field public なぎぱいぢぎ:I

.field public なぶひせが:I

.field public のぷのちつ:Z

.field public は〲ぱなで:F

.field public びえぁぜい:Z

.field public びぐびあび:I

.field public ぶでにく〼〳:Z

.field public final ぷぞてのほき:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$\u3073\u3050\u3073\u3042\u3073;",
            ">;"
        }
    .end annotation
.end field

.field public へぬ〴づぞ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/material/bottomsheet/BottomSheetBehavior<",
            "TV;>.\u3065\u3056\u304b\u3079\u3079;"
        }
    .end annotation
.end field

.field public ぺぁあねじ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

.field public ぺづげぺが:I

.field public ぺふねづ〺:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺふねづ〺;->Widget_Design_BottomSheet_Modal:I

    sput v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぃぜぶの〸ぃ:I

    return-void
.end method

.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->げつ〴ぬぐ:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺つふすそ:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->へぬ〴づぞ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;

    const/high16 v1, 0x3f000000    # 0.5f

    iput v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->は〲ぱなで:F

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ざっざへづ:F

    iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〻ぞまぎな〻:Z

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぷぞてのほき:Ljava/util/ArrayList;

    new-instance v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;

    invoke-direct {v0, p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ながふずは:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 12

    invoke-direct {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->げつ〴ぬぐ:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺つふすそ:Z

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->へぬ〴づぞ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;

    const/high16 v3, 0x3f000000    # 0.5f

    iput v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->は〲ぱなで:F

    const/high16 v4, -0x40800000    # -1.0f

    iput v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ざっざへづ:F

    iput-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〻ぞまぎな〻:Z

    const/4 v5, 0x4

    iput v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぷぞてのほき:Ljava/util/ArrayList;

    new-instance v6, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;

    invoke-direct {v6, p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$〺つふすそ;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    iput-object v6, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ながふずは:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->mtrl_min_touch_target_size:I

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    iput v6, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぁごぐすすぃ:I

    sget-object v6, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomSheetBehavior_Layout:[I

    invoke-virtual {p1, p2, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v6

    sget v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomSheetBehavior_Layout_shapeAppearance:I

    invoke-virtual {v6, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v7

    iput-boolean v7, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〳ぜぞぜべっ:Z

    sget v7, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomSheetBehavior_Layout_backgroundTint:I

    invoke-virtual {v6, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v8

    if-eqz v8, :cond_51

    invoke-static {p1, v6, v7}, Lづざかべべ/は〲ぱなで/〺つふすそ;->〻ぞまぎな〻(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {p0, p1, p2, v8, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->じぜこほぱ(Landroid/content/Context;Landroid/util/AttributeSet;ZLandroid/content/res/ColorStateList;)V

    goto :goto_54

    .line 1
    :cond_51
    invoke-virtual {p0, p1, p2, v8, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->じぜこほぱ(Landroid/content/Context;Landroid/util/AttributeSet;ZLandroid/content/res/ColorStateList;)V

    :goto_54
    const/4 p2, 0x2

    new-array p2, p2, [F

    .line 2
    fill-array-data p2, :array_156

    invoke-static {p2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おぐぴう〸ず:Landroid/animation/ValueAnimator;

    const-wide/16 v7, 0x1f4

    invoke-virtual {p2, v7, v8}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おぐぴう〸ず:Landroid/animation/ValueAnimator;

    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/は〲ぱなで/げつ〴ぬぐ;

    invoke-direct {v2, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/は〲ぱなで/げつ〴ぬぐ;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    invoke-virtual {p2, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 3
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt p2, v2, :cond_7d

    sget p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomSheetBehavior_Layout_android_elevation:I

    invoke-virtual {v6, p2, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ざっざへづ:F

    :cond_7d
    sget p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomSheetBehavior_Layout_behavior_peekHeight:I

    invoke-virtual {v6, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v2

    const/4 v4, -0x1

    if-eqz v2, :cond_8e

    iget v2, v2, Landroid/util/TypedValue;->data:I

    if-ne v2, v4, :cond_8e

    invoke-virtual {p0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぷぞてのほき(I)V

    goto :goto_95

    :cond_8e
    invoke-virtual {v6, p2, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぷぞてのほき(I)V

    :goto_95
    sget p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomSheetBehavior_Layout_behavior_hideable:I

    invoke-virtual {v6, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 4
    iget-boolean v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->でどあくず:Z

    if-eq v2, p2, :cond_ae

    iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->でどあくず:Z

    if-nez p2, :cond_ab

    iget p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    const/4 v2, 0x5

    if-ne p2, v2, :cond_ab

    invoke-virtual {p0, v5}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->けときぜと(I)V

    :cond_ab
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぃぜぶの〸ぃ()V

    .line 5
    :cond_ae
    sget p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomSheetBehavior_Layout_gestureInsetBottomIgnored:I

    invoke-virtual {v6, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 6
    iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺふねづ〺:Z

    .line 7
    sget p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomSheetBehavior_Layout_behavior_fitToContents:I

    invoke-virtual {v6, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 8
    iget-boolean v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺つふすそ:Z

    if-ne v2, p2, :cond_c1

    goto :goto_dd

    :cond_c1
    iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺つふすそ:Z

    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉひのべい:Ljava/lang/ref/WeakReference;

    if-eqz p2, :cond_ca

    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->どぇぞほだ()V

    :cond_ca
    iget-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺つふすそ:Z

    if-eqz p2, :cond_d5

    iget p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    const/4 v2, 0x6

    if-ne p2, v2, :cond_d5

    const/4 p2, 0x3

    goto :goto_d7

    :cond_d5
    iget p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    :goto_d7
    invoke-virtual {p0, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おかぷせ〱(I)V

    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぃぜぶの〸ぃ()V

    .line 9
    :goto_dd
    sget p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomSheetBehavior_Layout_behavior_skipCollapsed:I

    invoke-virtual {v6, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 10
    iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぶでにく〼〳:Z

    .line 11
    sget p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomSheetBehavior_Layout_behavior_draggable:I

    invoke-virtual {v6, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 12
    iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〻ぞまぎな〻:Z

    .line 13
    sget p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomSheetBehavior_Layout_behavior_saveFlags:I

    invoke-virtual {v6, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    .line 14
    iput p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->げつ〴ぬぐ:I

    .line 15
    sget p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomSheetBehavior_Layout_behavior_halfExpandedRatio:I

    invoke-virtual {v6, p2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    const/4 v1, 0x0

    cmpg-float v1, p2, v1

    if-lez v1, :cond_14d

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v2, p2, v1

    if-gez v2, :cond_14d

    .line 16
    iput p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->は〲ぱなで:F

    iget-object v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉひのべい:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_115

    .line 17
    iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺづげぺが:I

    int-to-float v2, v2

    sub-float/2addr v1, p2

    mul-float v1, v1, v2

    float-to-int p2, v1

    iput p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ざとぅぼこ〺:I

    .line 18
    :cond_115
    sget p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/てぜきぽく;->BottomSheetBehavior_Layout_behavior_expandedOffset:I

    invoke-virtual {v6, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v1

    const-string v2, "offset must be greater than or equal to 0"

    if-eqz v1, :cond_130

    iget v3, v1, Landroid/util/TypedValue;->type:I

    const/16 v4, 0x10

    if-ne v3, v4, :cond_130

    iget p2, v1, Landroid/util/TypedValue;->data:I

    if-ltz p2, :cond_12a

    goto :goto_136

    .line 19
    :cond_12a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 20
    :cond_130
    invoke-virtual {v6, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p2

    if-ltz p2, :cond_147

    .line 21
    :goto_136
    iput p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇぬぎばつ:I

    .line 22
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->くし〴〺ぅ:F

    return-void

    .line 23
    :cond_147
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 24
    :cond_14d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "ratio must be a float value between 0 and 1"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :array_156
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public 〺でおいここ(Landroid/view/View;I)V
    .registers 5

    const/4 v0, 0x3

    const/4 v1, 0x4

    if-ne p2, v1, :cond_7

    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    goto :goto_27

    :cond_7
    const/4 v1, 0x6

    if-ne p2, v1, :cond_17

    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ざとぅぼこ〺:I

    iget-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺つふすそ:Z

    if-eqz v1, :cond_27

    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉざぅち〻:I

    if-gt v0, v1, :cond_27

    const/4 p2, 0x3

    move v0, v1

    goto :goto_27

    :cond_17
    if-ne p2, v0, :cond_1e

    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->せづっ〸ちね()I

    move-result v0

    goto :goto_27

    :cond_1e
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->でどあくず:Z

    if-eqz v0, :cond_2c

    const/4 v0, 0x5

    if-ne p2, v0, :cond_2c

    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺづげぺが:I

    :cond_27
    :goto_27
    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ながふずは(Landroid/view/View;IIZ)V

    return-void

    :cond_2c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Illegal state argument: "

    invoke-static {v0, p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public 〻ぞまぎな〻(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "Landroid/view/View;",
            "II)Z"
        }
    .end annotation

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->なぶひせが:I

    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->どぇぞほだ:Z

    and-int/lit8 p2, p5, 0x2

    if-eqz p2, :cond_a

    const/4 p1, 0x1

    :cond_a
    return p1
.end method

.method public final ぃぜぶの〸ぃ()V
    .registers 6

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉひのべい:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_5

    return-void

    :cond_5
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_e

    return-void

    :cond_e
    const/high16 v1, 0x80000

    invoke-static {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぺづげぺが(Landroid/view/View;I)V

    const/high16 v1, 0x40000

    invoke-static {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぺづげぺが(Landroid/view/View;I)V

    const/high16 v1, 0x100000

    invoke-static {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぺづげぺが(Landroid/view/View;I)V

    iget-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->でどあくず:Z

    if-eqz v1, :cond_2b

    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    const/4 v2, 0x5

    if-eq v1, v2, :cond_2b

    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;->てぜきぽく:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->なぶひせが(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;I)V

    :cond_2b
    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    const/4 v2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x3

    if-eq v1, v4, :cond_4a

    if-eq v1, v3, :cond_42

    if-eq v1, v2, :cond_37

    goto :goto_54

    :cond_37
    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;->ぺふねづ〺:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {p0, v0, v1, v3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->なぶひせが(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;I)V

    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;->いいにぽつ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {p0, v0, v1, v4}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->なぶひせが(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;I)V

    goto :goto_54

    :cond_42
    iget-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺つふすそ:Z

    if-eqz v1, :cond_47

    const/4 v2, 0x3

    :cond_47
    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;->いいにぽつ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;

    goto :goto_51

    :cond_4a
    iget-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺つふすそ:Z

    if-eqz v1, :cond_4f

    const/4 v2, 0x4

    :cond_4f
    sget-object v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;->ぺふねづ〺:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;

    :goto_51
    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->なぶひせが(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;I)V

    :goto_54
    return-void
.end method

.method public いいにぽつ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/MotionEvent;",
            ")Z"
        }
    .end annotation

    invoke-virtual {p2}, Landroid/view/View;->isShown()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_d8

    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〻ぞまぎな〻:Z

    if-nez v0, :cond_e

    goto/16 :goto_d8

    :cond_e
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-nez v0, :cond_21

    .line 1
    iput v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おかぷせ〱:I

    iget-object v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->けときぜと:Landroid/view/VelocityTracker;

    if-eqz v5, :cond_21

    invoke-virtual {v5}, Landroid/view/VelocityTracker;->recycle()V

    iput-object v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->けときぜと:Landroid/view/VelocityTracker;

    .line 2
    :cond_21
    iget-object v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->けときぜと:Landroid/view/VelocityTracker;

    if-nez v5, :cond_2b

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v5

    iput-object v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->けときぜと:Landroid/view/VelocityTracker;

    :cond_2b
    iget-object v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->けときぜと:Landroid/view/VelocityTracker;

    invoke-virtual {v5, p3}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    const/4 v5, 0x2

    if-eqz v0, :cond_44

    if-eq v0, v2, :cond_39

    const/4 p2, 0x3

    if-eq v0, p2, :cond_39

    goto :goto_87

    :cond_39
    iput-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇとしたべど:Z

    iput v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おかぷせ〱:I

    iget-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->びえぁぜい:Z

    if-eqz p2, :cond_87

    iput-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->びえぁぜい:Z

    return v1

    :cond_44
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result v6

    float-to-int v6, v6

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v7

    float-to-int v7, v7

    iput v7, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺でおいここ:I

    iget v7, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    if-eq v7, v5, :cond_76

    iget-object v7, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->せづっ〸ちね:Ljava/lang/ref/WeakReference;

    if-eqz v7, :cond_5f

    invoke-virtual {v7}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/view/View;

    goto :goto_60

    :cond_5f
    move-object v7, v3

    :goto_60
    if-eqz v7, :cond_76

    iget v8, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺でおいここ:I

    invoke-virtual {p1, v7, v6, v8}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざっざへづ(Landroid/view/View;II)Z

    move-result v7

    if-eqz v7, :cond_76

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v7

    invoke-virtual {p3, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v7

    iput v7, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おかぷせ〱:I

    iput-boolean v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇとしたべど:Z

    :cond_76
    iget v7, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おかぷせ〱:I

    if-ne v7, v4, :cond_84

    iget v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺でおいここ:I

    invoke-virtual {p1, p2, v6, v4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざっざへづ(Landroid/view/View;II)Z

    move-result p2

    if-nez p2, :cond_84

    const/4 p2, 0x1

    goto :goto_85

    :cond_84
    const/4 p2, 0x0

    :goto_85
    iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->びえぁぜい:Z

    :cond_87
    :goto_87
    iget-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->びえぁぜい:Z

    if-nez p2, :cond_96

    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇ〳〲〺すっ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    if-eqz p2, :cond_96

    invoke-virtual {p2, p3}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉ〲なぱぽた(Landroid/view/MotionEvent;)Z

    move-result p2

    if-eqz p2, :cond_96

    return v2

    :cond_96
    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->せづっ〸ちね:Ljava/lang/ref/WeakReference;

    if-eqz p2, :cond_a1

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Landroid/view/View;

    :cond_a1
    if-ne v0, v5, :cond_d7

    if-eqz v3, :cond_d7

    iget-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->びえぁぜい:Z

    if-nez p2, :cond_d7

    iget p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    if-eq p2, v2, :cond_d7

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result p2

    float-to-int p2, p2

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1, v3, p2, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ざっざへづ(Landroid/view/View;II)Z

    move-result p1

    if-nez p1, :cond_d7

    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇ〳〲〺すっ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    if-eqz p1, :cond_d7

    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺でおいここ:I

    int-to-float p1, p1

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    sub-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇ〳〲〺すっ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    .line 3
    iget p2, p2, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:I

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-lez p1, :cond_d7

    const/4 v1, 0x1

    :cond_d7
    return v1

    .line 4
    :cond_d8
    :goto_d8
    iput-boolean v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->びえぁぜい:Z

    return v1
.end method

.method public final ぅみぱぎぎ()I
    .registers 4

    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->づざかべべ:Z

    if-eqz v0, :cond_1a

    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->なぎぱいぢぎ:I

    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺづげぺが:I

    iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->じぜこほぱ:I

    mul-int/lit8 v2, v2, 0x9

    div-int/lit8 v2, v2, 0x10

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぅみぱぎぎ:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0

    :cond_1a
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺふねづ〺:Z

    if-nez v0, :cond_2c

    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->いいにぽつ:I

    if-lez v0, :cond_2c

    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->びぐびあび:I

    iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぁごぐすすぃ:I

    add-int/2addr v0, v2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0

    :cond_2c
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->びぐびあび:I

    return v0
.end method

.method public ぇ〳〲〺すっ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "I)V"
        }
    .end annotation

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p1

    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->せづっ〸ちね()I

    move-result p4

    const/4 v0, 0x3

    if-ne p1, p4, :cond_f

    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おかぷせ〱(I)V

    return-void

    :cond_f
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->せづっ〸ちね:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_be

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-ne p3, p1, :cond_be

    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->どぇぞほだ:Z

    if-nez p1, :cond_1f

    goto/16 :goto_be

    :cond_1f
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->なぶひせが:I

    if-lez p1, :cond_32

    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺つふすそ:Z

    if-eqz p1, :cond_28

    goto :goto_72

    :cond_28
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p1

    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ざとぅぼこ〺:I

    if-le p1, p3, :cond_83

    goto/16 :goto_b2

    :cond_32
    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->でどあくず:Z

    if-eqz p1, :cond_55

    .line 1
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->けときぜと:Landroid/view/VelocityTracker;

    if-nez p1, :cond_3c

    const/4 p1, 0x0

    goto :goto_4b

    :cond_3c
    const/16 p3, 0x3e8

    iget p4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->くし〴〺ぅ:F

    invoke-virtual {p1, p3, p4}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->けときぜと:Landroid/view/VelocityTracker;

    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おかぷせ〱:I

    invoke-virtual {p1, p3}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result p1

    .line 2
    :goto_4b
    invoke-virtual {p0, p2, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->げがぴうあだ(Landroid/view/View;F)Z

    move-result p1

    if-eqz p1, :cond_55

    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺづげぺが:I

    const/4 v0, 0x5

    goto :goto_b8

    :cond_55
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->なぶひせが:I

    if-nez p1, :cond_96

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p1

    iget-boolean p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺つふすそ:Z

    if-eqz p3, :cond_75

    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉざぅち〻:I

    sub-int p3, p1, p3

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    iget p4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    sub-int/2addr p1, p4

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    if-ge p3, p1, :cond_b5

    .line 3
    :goto_72
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉざぅち〻:I

    goto :goto_b8

    .line 4
    :cond_75
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ざとぅぼこ〺:I

    if-ge p1, p3, :cond_86

    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    sub-int p3, p1, p3

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    if-ge p1, p3, :cond_b0

    .line 5
    :cond_83
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇぬぎばつ:I

    goto :goto_b8

    :cond_86
    sub-int p3, p1, p3

    .line 6
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    iget p4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    sub-int/2addr p1, p4

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    if-ge p3, p1, :cond_b5

    goto :goto_b0

    :cond_96
    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺つふすそ:Z

    if-eqz p1, :cond_9b

    goto :goto_b5

    :cond_9b
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p1

    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ざとぅぼこ〺:I

    sub-int p3, p1, p3

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    iget p4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    sub-int/2addr p1, p4

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    if-ge p3, p1, :cond_b5

    :cond_b0
    :goto_b0
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ざとぅぼこ〺:I

    :goto_b2
    const/4 v0, 0x6

    move p1, p3

    goto :goto_b8

    :cond_b5
    :goto_b5
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    const/4 v0, 0x4

    :goto_b8
    const/4 p3, 0x0

    invoke-virtual {p0, p2, v0, p1, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ながふずは(Landroid/view/View;IIZ)V

    iput-boolean p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->どぇぞほだ:Z

    :cond_be
    :goto_be
    return-void
.end method

.method public final ぇとしたべど(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉひのべい:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_b

    return-void

    :cond_b
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_26

    invoke-interface {v1}, Landroid/view/ViewParent;->isLayoutRequested()Z

    move-result v1

    if-eqz v1, :cond_26

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->でどあくず(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_26

    new-instance v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$げつ〴ぬぐ;

    invoke-direct {v1, p0, v0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$げつ〴ぬぐ;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_29

    :cond_26
    invoke-virtual {p0, v0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺でおいここ(Landroid/view/View;I)V

    :goto_29
    return-void
.end method

.method public ぇぬぎばつ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "II[II)V"
        }
    .end annotation

    const/4 p1, 0x1

    if-ne p7, p1, :cond_4

    return-void

    :cond_4
    iget-object p4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->せづっ〸ちね:Ljava/lang/ref/WeakReference;

    if-eqz p4, :cond_f

    invoke-virtual {p4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/view/View;

    goto :goto_10

    :cond_f
    const/4 p4, 0x0

    :goto_10
    if-eq p3, p4, :cond_13

    return-void

    :cond_13
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p4

    sub-int p7, p4, p5

    if-lez p5, :cond_38

    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->せづっ〸ちね()I

    move-result p3

    if-ge p7, p3, :cond_30

    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->せづっ〸ちね()I

    move-result p3

    sub-int/2addr p4, p3

    aput p4, p6, p1

    aget p3, p6, p1

    neg-int p3, p3

    invoke-static {p2, p3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->びえぁぜい(Landroid/view/View;I)V

    const/4 p3, 0x3

    goto :goto_54

    :cond_30
    iget-boolean p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〻ぞまぎな〻:Z

    if-nez p3, :cond_35

    return-void

    :cond_35
    aput p5, p6, p1

    goto :goto_5f

    :cond_38
    if-gez p5, :cond_66

    const/4 v0, -0x1

    invoke-virtual {p3, v0}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p3

    if-nez p3, :cond_66

    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    if-le p7, p3, :cond_58

    iget-boolean p7, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->でどあくず:Z

    if-eqz p7, :cond_4a

    goto :goto_58

    :cond_4a
    sub-int/2addr p4, p3

    aput p4, p6, p1

    aget p3, p6, p1

    neg-int p3, p3

    invoke-static {p2, p3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->びえぁぜい(Landroid/view/View;I)V

    const/4 p3, 0x4

    :goto_54
    invoke-virtual {p0, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おかぷせ〱(I)V

    goto :goto_66

    :cond_58
    :goto_58
    iget-boolean p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〻ぞまぎな〻:Z

    if-nez p3, :cond_5d

    return-void

    :cond_5d
    aput p5, p6, p1

    :goto_5f
    neg-int p3, p5

    invoke-static {p2, p3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->びえぁぜい(Landroid/view/View;I)V

    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おかぷせ〱(I)V

    :cond_66
    :goto_66
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺづげぺが(I)V

    iput p5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->なぶひせが:I

    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->どぇぞほだ:Z

    return-void
.end method

.method public final えがぐせほち(Z)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉひのべい:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_21

    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->どぇぞほだ()V

    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_21

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉひのべい:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_21

    if-eqz p1, :cond_1e

    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇとしたべど(I)V

    goto :goto_21

    :cond_1e
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    :cond_21
    :goto_21
    return-void
.end method

.method public ぉひのべい(Landroid/view/View;)Landroid/view/View;
    .registers 5

    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->〻ぞまぎな〻(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_7

    return-object p1

    :cond_7
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_22

    check-cast p1, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    :goto_12
    if-ge v0, v1, :cond_22

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉひのべい(Landroid/view/View;)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1f

    return-object v2

    :cond_1f
    add-int/lit8 v0, v0, 0x1

    goto :goto_12

    :cond_22
    const/4 p1, 0x0

    return-object p1
.end method

.method public おかぷせ〱(I)V
    .registers 5

    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    if-ne v0, p1, :cond_5

    return-void

    :cond_5
    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉひのべい:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_c

    return-void

    :cond_c
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_15

    return-void

    :cond_15
    const/4 v1, 0x3

    const/4 v2, 0x0

    if-ne p1, v1, :cond_1e

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ち〴みぎ〻び(Z)V

    goto :goto_2a

    :cond_1e
    const/4 v1, 0x6

    if-eq p1, v1, :cond_27

    const/4 v1, 0x5

    if-eq p1, v1, :cond_27

    const/4 v1, 0x4

    if-ne p1, v1, :cond_2a

    :cond_27
    invoke-virtual {p0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ち〴みぎ〻び(Z)V

    :cond_2a
    :goto_2a
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ておぞぞはね(I)V

    :goto_2d
    iget-object v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぷぞてのほき:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v2, v1, :cond_43

    iget-object v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぷぞてのほき:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$びぐびあび;

    invoke-virtual {v1, v0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$びぐびあび;->〺つふすそ(Landroid/view/View;I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2d

    :cond_43
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぃぜぶの〸ぃ()V

    return-void
.end method

.method public けときぜと(I)V
    .registers 3

    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    if-ne p1, v0, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉひのべい:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_1c

    const/4 v0, 0x4

    if-eq p1, v0, :cond_19

    const/4 v0, 0x3

    if-eq p1, v0, :cond_19

    const/4 v0, 0x6

    if-eq p1, v0, :cond_19

    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->でどあくず:Z

    if-eqz v0, :cond_1b

    const/4 v0, 0x5

    if-ne p1, v0, :cond_1b

    :cond_19
    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    :cond_1b
    return-void

    :cond_1c
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇとしたべど(I)V

    return-void
.end method

.method public げがぴうあだ(Landroid/view/View;F)Z
    .registers 7

    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぶでにく〼〳:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_6

    return v1

    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    const/4 v3, 0x0

    if-ge v0, v2, :cond_10

    return v3

    :cond_10
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぅみぱぎぎ()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    int-to-float p1, p1

    const v2, 0x3dcccccd    # 0.1f

    mul-float p2, p2, v2

    add-float/2addr p2, p1

    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    int-to-float p1, p1

    sub-float/2addr p2, p1

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    int-to-float p2, v0

    div-float/2addr p1, p2

    const/high16 p2, 0x3f000000    # 0.5f

    cmpl-float p1, p1, p2

    if-lez p1, :cond_30

    goto :goto_31

    :cond_30
    const/4 v1, 0x0

    :goto_31
    return v1
.end method

.method public ざっざへづ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/os/Parcelable;",
            ")V"
        }
    .end annotation

    check-cast p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$SavedState;

    .line 1
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->げつ〴ぬぐ:I

    const/4 p2, 0x1

    const/4 v0, 0x2

    const/4 v1, 0x4

    if-nez p1, :cond_a

    goto :goto_34

    :cond_a
    const/4 v2, -0x1

    if-eq p1, v2, :cond_11

    and-int/lit8 v3, p1, 0x1

    if-ne v3, p2, :cond_15

    :cond_11
    iget v3, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$SavedState;->づざかべべ:I

    iput v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->びぐびあび:I

    :cond_15
    if-eq p1, v2, :cond_1b

    and-int/lit8 v3, p1, 0x2

    if-ne v3, v0, :cond_1f

    :cond_1b
    iget-boolean v3, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$SavedState;->なぎぱいぢぎ:Z

    iput-boolean v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺つふすそ:Z

    :cond_1f
    if-eq p1, v2, :cond_25

    and-int/lit8 v3, p1, 0x4

    if-ne v3, v1, :cond_29

    :cond_25
    iget-boolean v3, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$SavedState;->ぁごぐすすぃ:Z

    iput-boolean v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->でどあくず:Z

    :cond_29
    if-eq p1, v2, :cond_30

    const/16 v2, 0x8

    and-int/2addr p1, v2

    if-ne p1, v2, :cond_34

    :cond_30
    iget-boolean p1, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$SavedState;->〳ぜぞぜべっ:Z

    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぶでにく〼〳:Z

    .line 2
    :cond_34
    :goto_34
    iget p1, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$SavedState;->びぐびあび:I

    if-eq p1, p2, :cond_3e

    if-ne p1, v0, :cond_3b

    goto :goto_3e

    :cond_3b
    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    goto :goto_40

    :cond_3e
    :goto_3e
    iput v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    :goto_40
    return-void
.end method

.method public ざとぅぼこ〺(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;IIIII[I)V
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "IIIII[I)V"
        }
    .end annotation

    return-void
.end method

.method public final じぜこほぱ(Landroid/content/Context;Landroid/util/AttributeSet;ZLandroid/content/res/ColorStateList;)V
    .registers 9

    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〳ぜぞぜべっ:Z

    if-eqz v0, :cond_4f

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->bottomSheetStyle:I

    sget v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぃぜぶの〸ぃ:I

    .line 1
    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/げつ〴ぬぐ;

    const/4 v3, 0x0

    int-to-float v3, v3

    invoke-direct {v2, v3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/げつ〴ぬぐ;-><init>(F)V

    invoke-static {p1, p2, v0, v1, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;->〺つふすそ(Landroid/content/Context;Landroid/util/AttributeSet;IILなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/くし〴〺ぅ;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく$〺つふすそ;

    move-result-object p2

    .line 2
    invoke-virtual {p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく$〺つふすそ;->げつ〴ぬぐ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    new-instance p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->てぜきぽく:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    invoke-direct {p2, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;)V

    iput-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺぁあねじ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    .line 3
    iget-object v0, p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;

    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;

    invoke-direct {v1, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉ〲なぱぽた/げつ〴ぬぐ;

    invoke-virtual {p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ぺづげぺが()V

    if-eqz p3, :cond_38

    if-eqz p4, :cond_38

    .line 4
    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺぁあねじ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    invoke-virtual {p1, p4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ごづごきえ(Landroid/content/res/ColorStateList;)V

    goto :goto_4f

    :cond_38
    new-instance p2, Landroid/util/TypedValue;

    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    const p3, 0x1010031

    const/4 p4, 0x1

    invoke-virtual {p1, p3, p2, p4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺぁあねじ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    iget p2, p2, Landroid/util/TypedValue;->data:I

    invoke-virtual {p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->setTint(I)V

    :cond_4f
    :goto_4f
    return-void
.end method

.method public せづっ〸ちね()I
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺つふすそ:Z

    if-eqz v0, :cond_7

    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉざぅち〻:I

    goto :goto_9

    :cond_7
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇぬぎばつ:I

    :goto_9
    return v0
.end method

.method public final ち〴みぎ〻び(Z)V
    .registers 9

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉひのべい:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_5

    return-void

    :cond_5
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    if-nez v1, :cond_14

    return-void

    :cond_14
    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x10

    if-lt v2, v3, :cond_2f

    if-eqz p1, :cond_2f

    iget-object v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->げがぴうあだ:Ljava/util/Map;

    if-nez v2, :cond_2e

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->げがぴうあだ:Ljava/util/Map;

    goto :goto_2f

    :cond_2e
    return-void

    :cond_2f
    :goto_2f
    const/4 v2, 0x0

    :goto_30
    if-ge v2, v1, :cond_55

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉひのべい:Ljava/lang/ref/WeakReference;

    invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_3f

    goto :goto_52

    :cond_3f
    if-eqz p1, :cond_52

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v5, v3, :cond_52

    iget-object v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->げがぴうあだ:Ljava/util/Map;

    invoke-virtual {v4}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_52
    :goto_52
    add-int/lit8 v2, v2, 0x1

    goto :goto_30

    :cond_55
    if-nez p1, :cond_5a

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->げがぴうあだ:Ljava/util/Map;

    :cond_5a
    return-void
.end method

.method public final ておぞぞはね(I)V
    .registers 7

    const/4 v0, 0x2

    if-ne p1, v0, :cond_4

    return-void

    :cond_4
    const/4 v1, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne p1, v1, :cond_b

    const/4 p1, 0x1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    :goto_c
    iget-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->のぷのちつ:Z

    if-eq v1, p1, :cond_3f

    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->のぷのちつ:Z

    iget-object v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺぁあねじ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    if-eqz v1, :cond_3f

    iget-object v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おぐぴう〸ず:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_3f

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_26

    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おぐぴう〸ず:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->reverse()V

    goto :goto_3f

    :cond_26
    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz p1, :cond_2c

    const/4 p1, 0x0

    goto :goto_2e

    :cond_2c
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_2e
    sub-float/2addr v1, p1

    iget-object v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おぐぴう〸ず:Landroid/animation/ValueAnimator;

    new-array v0, v0, [F

    aput v1, v0, v3

    aput p1, v0, v2

    invoke-virtual {v4, v0}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おぐぴう〸ず:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    :cond_3f
    :goto_3f
    return-void
.end method

.method public でどあくず(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;)",
            "Landroid/os/Parcelable;"
        }
    .end annotation

    new-instance p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$SavedState;

    .line 1
    sget-object p2, Landroid/view/View$BaseSavedState;->EMPTY_STATE:Landroid/view/AbsSavedState;

    .line 2
    invoke-direct {p1, p2, p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$SavedState;-><init>(Landroid/os/Parcelable;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    return-object p1
.end method

.method public final どぇぞほだ()V
    .registers 3

    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぅみぱぎぎ()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺つふすそ:Z

    if-eqz v1, :cond_14

    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺづげぺが:I

    sub-int/2addr v1, v0

    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉざぅち〻:I

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    goto :goto_19

    :cond_14
    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺづげぺが:I

    sub-int/2addr v1, v0

    iput v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    :goto_19
    return-void
.end method

.method public ながふずは(Landroid/view/View;IIZ)V
    .registers 7

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇ〳〲〺すっ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    const/4 v1, 0x1

    if-eqz v0, :cond_1e

    if-eqz p4, :cond_12

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p4

    invoke-virtual {v0, p4, p3}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〻ぞまぎな〻(II)Z

    move-result p3

    if-eqz p3, :cond_1e

    goto :goto_1c

    :cond_12
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p4

    invoke-virtual {v0, p1, p4, p3}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぇ〳〲〺すっ(Landroid/view/View;II)Z

    move-result p3

    if-eqz p3, :cond_1e

    :goto_1c
    const/4 p3, 0x1

    goto :goto_1f

    :cond_1e
    const/4 p3, 0x0

    :goto_1f
    if-eqz p3, :cond_43

    const/4 p3, 0x2

    invoke-virtual {p0, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おかぷせ〱(I)V

    invoke-virtual {p0, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ておぞぞはね(I)V

    iget-object p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->へぬ〴づぞ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;

    if-nez p3, :cond_33

    new-instance p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;

    invoke-direct {p3, p0, p1, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;I)V

    iput-object p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->へぬ〴づぞ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;

    :cond_33
    iget-object p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->へぬ〴づぞ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;

    .line 1
    iget-boolean p4, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;->くし〴〺ぅ:Z

    .line 2
    iput p2, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;->びぐびあび:I

    if-nez p4, :cond_46

    invoke-static {p1, p3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぅみぱぎぎ(Landroid/view/View;Ljava/lang/Runnable;)V

    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->へぬ〴づぞ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;

    .line 3
    iput-boolean v1, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;->くし〴〺ぅ:Z

    goto :goto_46

    .line 4
    :cond_43
    invoke-virtual {p0, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おかぷせ〱(I)V

    :cond_46
    :goto_46
    return-void
.end method

.method public なぎぱいぢぎ(Landroidx/coordinatorlayout/widget/CoordinatorLayout$づざかべべ;)V
    .registers 2

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉひのべい:Ljava/lang/ref/WeakReference;

    iput-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇ〳〲〺すっ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    return-void
.end method

.method public final なぶひせが(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;I)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u306e\u3077\u306e\u3061\u3064/\u3049\u3032\u306a\u3071\u307d\u305f/\u303a\u3064\u3075\u3059\u305d$\u3052\u3064\u3034\u306c\u3050;",
            "I)V"
        }
    .end annotation

    new-instance v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$くし〴〺ぅ;

    invoke-direct {v0, p0, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$くし〴〺ぅ;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V

    const/4 p3, 0x0

    invoke-static {p1, p2, p3, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->せづっ〸ちね(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;Ljava/lang/CharSequence;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/びぐびあび;)V

    return-void
.end method

.method public びえぁぜい(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/MotionEvent;",
            ")Z"
        }
    .end annotation

    invoke-virtual {p2}, Landroid/view/View;->isShown()Z

    move-result p1

    if-nez p1, :cond_8

    const/4 p1, 0x0

    return p1

    :cond_8
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_14

    if-nez p1, :cond_14

    return v1

    :cond_14
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇ〳〲〺すっ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    if-eqz v0, :cond_1b

    invoke-virtual {v0, p3}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺(Landroid/view/MotionEvent;)V

    :cond_1b
    if-nez p1, :cond_2a

    const/4 v0, -0x1

    .line 1
    iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おかぷせ〱:I

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->けときぜと:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_2a

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->けときぜと:Landroid/view/VelocityTracker;

    .line 2
    :cond_2a
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->けときぜと:Landroid/view/VelocityTracker;

    if-nez v0, :cond_34

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->けときぜと:Landroid/view/VelocityTracker;

    :cond_34
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->けときぜと:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p3}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇ〳〲〺すっ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    if-eqz v0, :cond_64

    const/4 v0, 0x2

    if-ne p1, v0, :cond_64

    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->びえぁぜい:Z

    if-nez p1, :cond_64

    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〺でおいここ:I

    int-to-float p1, p1

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇ〳〲〺すっ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    .line 3
    iget v2, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:I

    int-to-float v2, v2

    cmpl-float p1, p1, v2

    if-lez p1, :cond_64

    .line 4
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result p1

    invoke-virtual {p3, p1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    invoke-virtual {v0, p2, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ(Landroid/view/View;I)V

    :cond_64
    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->びえぁぜい:Z

    xor-int/2addr p1, v1

    return p1
.end method

.method public ぷぞてのほき(I)V
    .registers 5

    const/4 v0, 0x1

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne p1, v1, :cond_c

    .line 1
    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->づざかべべ:Z

    if-nez p1, :cond_15

    iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->づざかべべ:Z

    goto :goto_1f

    :cond_c
    iget-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->づざかべべ:Z

    if-nez v1, :cond_17

    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->びぐびあび:I

    if-eq v1, p1, :cond_15

    goto :goto_17

    :cond_15
    const/4 v0, 0x0

    goto :goto_1f

    :cond_17
    :goto_17
    iput-boolean v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->づざかべべ:Z

    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->びぐびあび:I

    :goto_1f
    if-eqz v0, :cond_24

    invoke-virtual {p0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->えがぐせほち(Z)V

    :cond_24
    return-void
.end method

.method public へぬ〴づぞ(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "FF)Z"
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->せづっ〸ちね:Ljava/lang/ref/WeakReference;

    const/4 p2, 0x0

    if-eqz p1, :cond_12

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-ne p3, p1, :cond_12

    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    const/4 p3, 0x3

    if-ne p1, p3, :cond_11

    goto :goto_12

    :cond_11
    const/4 p2, 0x1

    :cond_12
    :goto_12
    return p2
.end method

.method public ぺぁあねじ()V
    .registers 2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉひのべい:Ljava/lang/ref/WeakReference;

    iput-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇ〳〲〺すっ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    return-void
.end method

.method public ぺづげぺが(I)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉひのべい:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_4a

    iget-object v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぷぞてのほき:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4a

    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    if-gt p1, v1, :cond_29

    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->せづっ〸ちね()I

    move-result v2

    if-ne v1, v2, :cond_1d

    goto :goto_29

    :cond_1d
    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    sub-int p1, v1, p1

    int-to-float p1, p1

    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->せづっ〸ちね()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    goto :goto_32

    :cond_29
    :goto_29
    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    sub-int p1, v1, p1

    int-to-float p1, p1

    iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺづげぺが:I

    sub-int/2addr v2, v1

    int-to-float v1, v2

    :goto_32
    div-float/2addr p1, v1

    const/4 v1, 0x0

    :goto_34
    iget-object v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぷぞてのほき:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_4a

    iget-object v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぷぞてのほき:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$びぐびあび;

    invoke-virtual {v2, v0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$びぐびあび;->げつ〴ぬぐ(Landroid/view/View;F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_34

    :cond_4a
    return-void
.end method

.method public ぺふねづ〺(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;I)Z"
        }
    .end annotation

    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->のぷのちつ(Landroid/view/View;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_10

    invoke-static {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->のぷのちつ(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_10

    invoke-virtual {p2, v1}, Landroid/view/View;->setFitsSystemWindows(Z)V

    :cond_10
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉひのべい:Ljava/lang/ref/WeakReference;

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    if-nez v0, :cond_87

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->design_bottom_sheet_peek_height_min:I

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->なぎぱいぢぎ:I

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1d

    if-lt v0, v5, :cond_3a

    .line 2
    iget-boolean v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺふねづ〺:Z

    if-nez v5, :cond_3a

    .line 3
    iget-boolean v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->づざかべべ:Z

    if-nez v5, :cond_3a

    new-instance v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/は〲ぱなで/〺つふすそ;

    invoke-direct {v5, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/は〲ぱなで/〺つふすそ;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    invoke-static {p2, v5}, Lづざかべべ/は〲ぱなで/〺つふすそ;->おぐぴう〸ず(Landroid/view/View;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/ざとぅぼこ〺;)V

    .line 4
    :cond_3a
    new-instance v5, Ljava/lang/ref/WeakReference;

    invoke-direct {v5, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉひのべい:Ljava/lang/ref/WeakReference;

    iget-boolean v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->〳ぜぞぜべっ:Z

    if-eqz v5, :cond_54

    iget-object v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺぁあねじ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    if-eqz v5, :cond_54

    const/16 v6, 0x10

    if-lt v0, v6, :cond_51

    .line 5
    invoke-virtual {p2, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_54

    :cond_51
    invoke-virtual {p2, v5}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 6
    :cond_54
    :goto_54
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺぁあねじ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    if-eqz v0, :cond_7b

    iget v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ざっざへづ:F

    const/high16 v6, -0x40800000    # -1.0f

    cmpl-float v6, v5, v6

    if-nez v6, :cond_64

    invoke-static {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぺふねづ〺(Landroid/view/View;)F

    move-result v5

    :cond_64
    invoke-virtual {v0, v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->は〲ぱなで(F)V

    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    if-ne v0, v2, :cond_6d

    const/4 v0, 0x1

    goto :goto_6e

    :cond_6d
    const/4 v0, 0x0

    :goto_6e
    iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->のぷのちつ:Z

    iget-object v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺぁあねじ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    if-eqz v0, :cond_76

    const/4 v0, 0x0

    goto :goto_78

    :cond_76
    const/high16 v0, 0x3f800000    # 1.0f

    :goto_78
    invoke-virtual {v5, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ざっざへづ(F)V

    :cond_7b
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぃぜぶの〸ぃ()V

    invoke-static {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->へぬ〴づぞ(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_87

    invoke-static {p2, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ておぞぞはね(Landroid/view/View;I)V

    :cond_87
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇ〳〲〺すっ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    if-nez v0, :cond_98

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ながふずは:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    .line 7
    new-instance v5, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6, p1, v0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;)V

    .line 8
    iput-object v5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇ〳〲〺すっ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    :cond_98
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->ぶでにく〼〳(Landroid/view/View;I)V

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I

    move-result p3

    iput p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->じぜこほぱ:I

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I

    move-result p1

    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺづげぺが:I

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p1

    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぅみぱぎぎ:I

    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺづげぺが:I

    sub-int/2addr p3, p1

    invoke-static {v3, p3}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉざぅち〻:I

    .line 9
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺづげぺが:I

    int-to-float p1, p1

    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->は〲ぱなで:F

    sub-float/2addr v4, p3

    mul-float v4, v4, p1

    float-to-int p1, v4

    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ざとぅぼこ〺:I

    .line 10
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->どぇぞほだ()V

    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉ〲なぱぽた:I

    if-ne p1, v2, :cond_d1

    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->せづっ〸ちね()I

    move-result p1

    goto :goto_e6

    :cond_d1
    const/4 p3, 0x6

    if-ne p1, p3, :cond_d7

    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ざとぅぼこ〺:I

    goto :goto_e6

    :cond_d7
    iget-boolean p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->でどあくず:Z

    if-eqz p3, :cond_e1

    const/4 p3, 0x5

    if-ne p1, p3, :cond_e1

    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺづげぺが:I

    goto :goto_e6

    :cond_e1
    const/4 p3, 0x4

    if-ne p1, p3, :cond_ea

    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ごづごきえ:I

    :goto_e6
    invoke-static {p2, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->びえぁぜい(Landroid/view/View;I)V

    goto :goto_f7

    :cond_ea
    if-eq p1, v1, :cond_ef

    const/4 p3, 0x2

    if-ne p1, p3, :cond_f7

    :cond_ef
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p1

    sub-int/2addr v0, p1

    invoke-static {p2, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->びえぁぜい(Landroid/view/View;I)V

    :cond_f7
    :goto_f7
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-virtual {p0, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぉひのべい(Landroid/view/View;)Landroid/view/View;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->せづっ〸ちね:Ljava/lang/ref/WeakReference;

    return v1
.end method
