.class public Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;
    }
.end annotation


# static fields
.field public static final ぶでにく〼〳:Landroid/view/animation/Interpolator;


# instance fields
.field public 〳ぜぞぜべっ:[I

.field public 〺つふすそ:I

.field public ぁごぐすすぃ:[F

.field public いいにぽつ:[I

.field public ぇぬぎばつ:I

.field public ぉざぅち〻:Landroid/widget/OverScroller;

.field public おぐぴう〸ず:I

.field public くし〴〺ぅ:I

.field public げつ〴ぬぐ:I

.field public ごづごきえ:Z

.field public final ざっざへづ:Landroid/view/ViewGroup;

.field public final ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

.field public づざかべべ:[F

.field public てぜきぽく:Landroid/view/VelocityTracker;

.field public final でどあくず:Ljava/lang/Runnable;

.field public なぎぱいぢぎ:[F

.field public のぷのちつ:F

.field public は〲ぱなで:Landroid/view/View;

.field public びぐびあび:[F

.field public へぬ〴づぞ:F

.field public ぺぁあねじ:[I

.field public ぺふねづ〺:I


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$げつ〴ぬぐ;

    invoke-direct {v0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$げつ〴ぬぐ;-><init>()V

    sput-object v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぶでにく〼〳:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:I

    new-instance v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$〺つふすそ;

    invoke-direct {v0, p0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$〺つふすそ;-><init>(Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;)V

    iput-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->でどあくず:Ljava/lang/Runnable;

    if-eqz p3, :cond_49

    iput-object p2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざっざへづ:Landroid/view/ViewGroup;

    iput-object p3, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    const/high16 v0, 0x41a00000    # 20.0f

    mul-float p3, p3, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p3, v0

    float-to-int p3, p3

    iput p3, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->おぐぴう〸ず:I

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p3

    iput p3, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:I

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result p3

    int-to-float p3, p3

    iput p3, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->のぷのちつ:F

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->へぬ〴づぞ:F

    new-instance p2, Landroid/widget/OverScroller;

    sget-object p3, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぶでにく〼〳:Landroid/view/animation/Interpolator;

    invoke-direct {p2, p1, p3}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object p2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉざぅち〻:Landroid/widget/OverScroller;

    return-void

    :cond_49
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Callback may not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ぺふねづ〺(Landroid/view/ViewGroup;FLづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;)Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;
    .registers 5

    .line 1
    new-instance v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0, p2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;)V

    .line 2
    iget p0, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:I

    int-to-float p0, p0

    const/high16 p2, 0x3f800000    # 1.0f

    div-float/2addr p2, p1

    mul-float p2, p2, p0

    float-to-int p0, p2

    iput p0, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:I

    return-object v0
.end method


# virtual methods
.method public final 〳ぜぞぜべっ(I)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びぐびあび:[F

    if-eqz v0, :cond_33

    invoke-virtual {p0, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->おぐぴう〸ず(I)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_33

    :cond_b
    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びぐびあび:[F

    const/4 v1, 0x0

    aput v1, v0, p1

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->づざかべべ:[F

    aput v1, v0, p1

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->なぎぱいぢぎ:[F

    aput v1, v0, p1

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぁごぐすすぃ:[F

    aput v1, v0, p1

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〳ぜぞぜべっ:[I

    const/4 v1, 0x0

    aput v1, v0, p1

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぺぁあねじ:[I

    aput v1, v0, p1

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->いいにぽつ:[I

    aput v1, v0, p1

    iget v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぺふねづ〺:I

    const/4 v1, 0x1

    shl-int p1, v1, p1

    xor-int/lit8 p1, p1, -0x1

    and-int/2addr p1, v0

    iput p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぺふねづ〺:I

    :cond_33
    :goto_33
    return-void
.end method

.method public 〺つふすそ()V
    .registers 3

    const/4 v0, -0x1

    iput v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:I

    .line 1
    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びぐびあび:[F

    if-nez v0, :cond_8

    goto :goto_2d

    :cond_8
    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->づざかべべ:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->なぎぱいぢぎ:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぁごぐすすぃ:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〳ぜぞぜべっ:[I

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぺぁあねじ:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->いいにぽつ:[I

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    iput v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぺふねづ〺:I

    .line 2
    :goto_2d
    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->てぜきぽく:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_37

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    iput-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->てぜきぽく:Landroid/view/VelocityTracker;

    :cond_37
    return-void
.end method

.method public 〻ぞまぎな〻(II)Z
    .registers 6

    iget-boolean v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ごづごきえ:Z

    if-eqz v0, :cond_1b

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->てぜきぽく:Landroid/view/VelocityTracker;

    iget v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:I

    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v0

    float-to-int v0, v0

    iget-object v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->てぜきぽく:Landroid/view/VelocityTracker;

    iget v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:I

    invoke-virtual {v1, v2}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p0, p1, p2, v0, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->へぬ〴づぞ(IIII)Z

    move-result p1

    return p1

    :cond_1b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ぁごぐすすぃ(III)I
    .registers 5

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v0

    if-ge v0, p2, :cond_8

    const/4 p1, 0x0

    return p1

    :cond_8
    if-le v0, p3, :cond_f

    if-lez p1, :cond_d

    goto :goto_e

    :cond_d
    neg-int p3, p3

    :goto_e
    return p3

    :cond_f
    return p1
.end method

.method public いいにぽつ(Z)Z
    .registers 13

    iget v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ne v0, v1, :cond_6a

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉざぅち〻:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v0

    iget-object v3, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉざぅち〻:Landroid/widget/OverScroller;

    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v3

    iget-object v4, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉざぅち〻:Landroid/widget/OverScroller;

    invoke-virtual {v4}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v10

    iget-object v4, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v4

    sub-int v8, v3, v4

    iget-object v4, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v4

    sub-int v9, v10, v4

    if-eqz v8, :cond_2f

    iget-object v4, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    invoke-static {v4, v8}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぇ〳〲〺すっ(Landroid/view/View;I)V

    :cond_2f
    if-eqz v9, :cond_36

    iget-object v4, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    invoke-static {v4, v9}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->びえぁぜい(Landroid/view/View;I)V

    :cond_36
    if-nez v8, :cond_3a

    if-eqz v9, :cond_43

    :cond_3a
    iget-object v4, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    iget-object v5, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    move v6, v3

    move v7, v10

    invoke-virtual/range {v4 .. v9}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->いいにぽつ(Landroid/view/View;IIII)V

    :cond_43
    if-eqz v0, :cond_5b

    iget-object v4, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉざぅち〻:Landroid/widget/OverScroller;

    invoke-virtual {v4}, Landroid/widget/OverScroller;->getFinalX()I

    move-result v4

    if-ne v3, v4, :cond_5b

    iget-object v3, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉざぅち〻:Landroid/widget/OverScroller;

    invoke-virtual {v3}, Landroid/widget/OverScroller;->getFinalY()I

    move-result v3

    if-ne v10, v3, :cond_5b

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉざぅち〻:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    const/4 v0, 0x0

    :cond_5b
    if-nez v0, :cond_6a

    if-eqz p1, :cond_67

    iget-object p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざっざへづ:Landroid/view/ViewGroup;

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->でどあくず:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    goto :goto_6a

    :cond_67
    invoke-virtual {p0, v2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぶでにく〼〳(I)V

    :cond_6a
    :goto_6a
    iget p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    if-ne p1, v1, :cond_6f

    const/4 v2, 0x1

    :cond_6f
    return v2
.end method

.method public ぇ〳〲〺すっ(Landroid/view/View;II)Z
    .registers 4

    iput-object p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    const/4 p1, -0x1

    iput p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:I

    const/4 p1, 0x0

    invoke-virtual {p0, p2, p3, p1, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->へぬ〴づぞ(IIII)Z

    move-result p1

    if-nez p1, :cond_17

    iget p2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    if-nez p2, :cond_17

    iget-object p2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    if-eqz p2, :cond_17

    const/4 p2, 0x0

    iput-object p2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    :cond_17
    return p1
.end method

.method public final ぇぬぎばつ(I)Z
    .registers 2

    invoke-virtual {p0, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->おぐぴう〸ず(I)Z

    move-result p1

    if-nez p1, :cond_8

    const/4 p1, 0x0

    return p1

    :cond_8
    const/4 p1, 0x1

    return p1
.end method

.method public ぉ〲なぱぽた(Landroid/view/MotionEvent;)Z
    .registers 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v3

    if-nez v2, :cond_11

    invoke-virtual/range {p0 .. p0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ()V

    :cond_11
    iget-object v4, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->てぜきぽく:Landroid/view/VelocityTracker;

    if-nez v4, :cond_1b

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v4

    iput-object v4, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->てぜきぽく:Landroid/view/VelocityTracker;

    :cond_1b
    iget-object v4, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->てぜきぽく:Landroid/view/VelocityTracker;

    invoke-virtual {v4, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    const/4 v4, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_104

    if-eq v2, v6, :cond_ff

    if-eq v2, v4, :cond_70

    const/4 v7, 0x3

    if-eq v2, v7, :cond_ff

    const/4 v7, 0x5

    if-eq v2, v7, :cond_3c

    const/4 v4, 0x6

    if-eq v2, v4, :cond_33

    goto/16 :goto_102

    :cond_33
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〳ぜぞぜべっ(I)V

    goto/16 :goto_102

    :cond_3c
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v7

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    invoke-virtual {v0, v7, v1, v2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざっざへづ(FFI)V

    iget v3, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    if-nez v3, :cond_5f

    iget-object v1, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〳ぜぞぜべっ:[I

    aget v1, v1, v2

    iget v3, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぇぬぎばつ:I

    and-int/2addr v1, v3

    if-eqz v1, :cond_102

    iget-object v3, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    invoke-virtual {v3, v1, v2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->ぁごぐすすぃ(II)V

    goto/16 :goto_102

    :cond_5f
    if-ne v3, v4, :cond_102

    float-to-int v3, v7

    float-to-int v1, v1

    invoke-virtual {v0, v3, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->のぷのちつ(II)Landroid/view/View;

    move-result-object v1

    iget-object v3, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    if-ne v1, v3, :cond_102

    invoke-virtual {v0, v1, v2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びえぁぜい(Landroid/view/View;I)Z

    goto/16 :goto_102

    :cond_70
    iget-object v2, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びぐびあび:[F

    if-eqz v2, :cond_102

    iget-object v2, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->づざかべべ:[F

    if-nez v2, :cond_7a

    goto/16 :goto_102

    :cond_7a
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    const/4 v3, 0x0

    :goto_7f
    if-ge v3, v2, :cond_fb

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v4

    invoke-virtual {v0, v4}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぇぬぎばつ(I)Z

    move-result v7

    if-nez v7, :cond_8d

    goto/16 :goto_f8

    :cond_8d
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v7

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v8

    iget-object v9, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びぐびあび:[F

    aget v9, v9, v4

    sub-float v9, v7, v9

    iget-object v10, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->づざかべべ:[F

    aget v10, v10, v4

    sub-float v10, v8, v10

    float-to-int v7, v7

    float-to-int v8, v8

    invoke-virtual {v0, v7, v8}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->のぷのちつ(II)Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_b1

    invoke-virtual {v0, v7, v9, v10}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->づざかべべ(Landroid/view/View;FF)Z

    move-result v8

    if-eqz v8, :cond_b1

    const/4 v8, 0x1

    goto :goto_b2

    :cond_b1
    const/4 v8, 0x0

    :goto_b2
    if-eqz v8, :cond_e7

    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v11

    float-to-int v12, v9

    add-int v13, v11, v12

    iget-object v14, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    invoke-virtual {v14, v7, v13, v12}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->げつ〴ぬぐ(Landroid/view/View;II)I

    move-result v12

    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v13

    float-to-int v14, v10

    add-int v15, v13, v14

    iget-object v5, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    invoke-virtual {v5, v7, v15, v14}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->〺つふすそ(Landroid/view/View;II)I

    move-result v5

    iget-object v14, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    invoke-virtual {v14, v7}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v14

    iget-object v15, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    invoke-virtual {v15, v7}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->びぐびあび(Landroid/view/View;)I

    move-result v15

    if-eqz v14, :cond_e0

    if-lez v14, :cond_e7

    if-ne v12, v11, :cond_e7

    :cond_e0
    if-eqz v15, :cond_fb

    if-lez v15, :cond_e7

    if-ne v5, v13, :cond_e7

    goto :goto_fb

    :cond_e7
    invoke-virtual {v0, v9, v10, v4}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ごづごきえ(FFI)V

    iget v5, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    if-ne v5, v6, :cond_ef

    goto :goto_fb

    :cond_ef
    if-eqz v8, :cond_f8

    invoke-virtual {v0, v7, v4}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びえぁぜい(Landroid/view/View;I)Z

    move-result v4

    if-eqz v4, :cond_f8

    goto :goto_fb

    :cond_f8
    :goto_f8
    add-int/lit8 v3, v3, 0x1

    goto :goto_7f

    :cond_fb
    :goto_fb
    invoke-virtual/range {p0 .. p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->でどあくず(Landroid/view/MotionEvent;)V

    goto :goto_102

    :cond_ff
    invoke-virtual/range {p0 .. p0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ()V

    :cond_102
    :goto_102
    const/4 v5, 0x0

    goto :goto_133

    :cond_104
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    const/4 v5, 0x0

    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    invoke-virtual {v0, v2, v3, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざっざへづ(FFI)V

    float-to-int v2, v2

    float-to-int v3, v3

    invoke-virtual {v0, v2, v3}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->のぷのちつ(II)Landroid/view/View;

    move-result-object v2

    iget-object v3, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    if-ne v2, v3, :cond_125

    iget v3, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    if-ne v3, v4, :cond_125

    invoke-virtual {v0, v2, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びえぁぜい(Landroid/view/View;I)Z

    :cond_125
    iget-object v2, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〳ぜぞぜべっ:[I

    aget v2, v2, v1

    iget v3, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぇぬぎばつ:I

    and-int/2addr v2, v3

    if-eqz v2, :cond_133

    iget-object v3, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    invoke-virtual {v3, v2, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->ぁごぐすすぃ(II)V

    :cond_133
    :goto_133
    iget v1, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    if-ne v1, v6, :cond_138

    const/4 v5, 0x1

    :cond_138
    return v5
.end method

.method public ぉざぅち〻(Landroid/view/View;II)Z
    .registers 6

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return v0

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v1

    if-lt p2, v1, :cond_1d

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    if-ge p2, v1, :cond_1d

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p2

    if-lt p3, p2, :cond_1d

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    if-ge p3, p1, :cond_1d

    const/4 v0, 0x1

    :cond_1d
    return v0
.end method

.method public おぐぴう〸ず(I)Z
    .registers 4

    iget v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぺふねづ〺:I

    const/4 v1, 0x1

    shl-int p1, v1, p1

    and-int/2addr p1, v0

    if-eqz p1, :cond_9

    goto :goto_a

    :cond_9
    const/4 v1, 0x0

    :goto_a
    return v1
.end method

.method public くし〴〺ぅ(Landroid/view/View;I)V
    .registers 5

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざっざへづ:Landroid/view/ViewGroup;

    if-ne v0, v1, :cond_16

    iput-object p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    iput p2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:I

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    invoke-virtual {v0, p1, p2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->〳ぜぞぜべっ(Landroid/view/View;I)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぶでにく〼〳(I)V

    return-void

    :cond_16
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view ("

    invoke-static {p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざっざへづ:Landroid/view/ViewGroup;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public げつ〴ぬぐ()V
    .registers 10

    invoke-virtual {p0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ()V

    iget v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_30

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉざぅち〻:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v0

    iget-object v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉざぅち〻:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v1

    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉざぅち〻:Landroid/widget/OverScroller;

    invoke-virtual {v2}, Landroid/widget/OverScroller;->abortAnimation()V

    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉざぅち〻:Landroid/widget/OverScroller;

    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v5

    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉざぅち〻:Landroid/widget/OverScroller;

    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v6

    iget-object v3, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    iget-object v4, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    sub-int v7, v5, v0

    sub-int v8, v6, v1

    invoke-virtual/range {v3 .. v8}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->いいにぽつ(Landroid/view/View;IIII)V

    :cond_30
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぶでにく〼〳(I)V

    return-void
.end method

.method public final ごづごきえ(FFI)V
    .registers 6

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, p3, v0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びぐびあび(FFII)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    const/4 v1, 0x4

    invoke-virtual {p0, p2, p1, p3, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びぐびあび(FFII)Z

    move-result v1

    if-eqz v1, :cond_12

    or-int/lit8 v0, v0, 0x4

    :cond_12
    const/4 v1, 0x2

    invoke-virtual {p0, p1, p2, p3, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びぐびあび(FFII)Z

    move-result v1

    if-eqz v1, :cond_1b

    or-int/lit8 v0, v0, 0x2

    :cond_1b
    const/16 v1, 0x8

    invoke-virtual {p0, p2, p1, p3, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びぐびあび(FFII)Z

    move-result p1

    if-eqz p1, :cond_25

    or-int/lit8 v0, v0, 0x8

    :cond_25
    if-eqz v0, :cond_33

    iget-object p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぺぁあねじ:[I

    aget p2, p1, p3

    or-int/2addr p2, v0

    aput p2, p1, p3

    iget-object p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    invoke-virtual {p1, v0, p3}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->づざかべべ(II)V

    :cond_33
    return-void
.end method

.method public final ざっざへづ(FFI)V
    .registers 14

    .line 1
    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びぐびあび:[F

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    array-length v2, v0

    if-gt v2, p3, :cond_50

    :cond_8
    add-int/lit8 v2, p3, 0x1

    new-array v3, v2, [F

    new-array v4, v2, [F

    new-array v5, v2, [F

    new-array v6, v2, [F

    new-array v7, v2, [I

    new-array v8, v2, [I

    new-array v2, v2, [I

    if-eqz v0, :cond_42

    array-length v9, v0

    invoke-static {v0, v1, v3, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->づざかべべ:[F

    array-length v9, v0

    invoke-static {v0, v1, v4, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->なぎぱいぢぎ:[F

    array-length v9, v0

    invoke-static {v0, v1, v5, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぁごぐすすぃ:[F

    array-length v9, v0

    invoke-static {v0, v1, v6, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〳ぜぞぜべっ:[I

    array-length v9, v0

    invoke-static {v0, v1, v7, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぺぁあねじ:[I

    array-length v9, v0

    invoke-static {v0, v1, v8, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->いいにぽつ:[I

    array-length v9, v0

    invoke-static {v0, v1, v2, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_42
    iput-object v3, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びぐびあび:[F

    iput-object v4, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->づざかべべ:[F

    iput-object v5, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->なぎぱいぢぎ:[F

    iput-object v6, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぁごぐすすぃ:[F

    iput-object v7, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〳ぜぞぜべっ:[I

    iput-object v8, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぺぁあねじ:[I

    iput-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->いいにぽつ:[I

    .line 2
    :cond_50
    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びぐびあび:[F

    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->なぎぱいぢぎ:[F

    aput p1, v2, p3

    aput p1, v0, p3

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->づざかべべ:[F

    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぁごぐすすぃ:[F

    aput p2, v2, p3

    aput p2, v0, p3

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〳ぜぞぜべっ:[I

    float-to-int p1, p1

    float-to-int p2, p2

    .line 3
    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざっざへづ:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getLeft()I

    move-result v2

    iget v3, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->おぐぴう〸ず:I

    add-int/2addr v2, v3

    const/4 v3, 0x1

    if-ge p1, v2, :cond_71

    const/4 v1, 0x1

    :cond_71
    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざっざへづ:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getTop()I

    move-result v2

    iget v4, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->おぐぴう〸ず:I

    add-int/2addr v2, v4

    if-ge p2, v2, :cond_7e

    or-int/lit8 v1, v1, 0x4

    :cond_7e
    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざっざへづ:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getRight()I

    move-result v2

    iget v4, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->おぐぴう〸ず:I

    sub-int/2addr v2, v4

    if-le p1, v2, :cond_8b

    or-int/lit8 v1, v1, 0x2

    :cond_8b
    iget-object p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざっざへづ:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getBottom()I

    move-result p1

    iget v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->おぐぴう〸ず:I

    sub-int/2addr p1, v2

    if-le p2, p1, :cond_98

    or-int/lit8 v1, v1, 0x8

    .line 4
    :cond_98
    aput v1, v0, p3

    iget p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぺふねづ〺:I

    shl-int p2, v3, p3

    or-int/2addr p1, p2

    iput p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぺふねづ〺:I

    return-void
.end method

.method public ざとぅぼこ〺(Landroid/view/MotionEvent;)V
    .registers 16

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v1

    if-nez v0, :cond_d

    invoke-virtual {p0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ()V

    :cond_d
    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->てぜきぽく:Landroid/view/VelocityTracker;

    if-nez v2, :cond_17

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v2

    iput-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->てぜきぽく:Landroid/view/VelocityTracker;

    :cond_17
    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->てぜきぽく:Landroid/view/VelocityTracker;

    invoke-virtual {v2, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    const/4 v2, 0x0

    if-eqz v0, :cond_188

    const/4 v3, 0x1

    if-eq v0, v3, :cond_17d

    const/4 v4, 0x2

    if-eq v0, v4, :cond_be

    const/4 v4, 0x3

    if-eq v0, v4, :cond_b4

    const/4 v4, 0x5

    if-eq v0, v4, :cond_75

    const/4 v4, 0x6

    if-eq v0, v4, :cond_30

    goto/16 :goto_1b0

    :cond_30
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iget v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    if-ne v1, v3, :cond_70

    iget v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:I

    if-ne v0, v1, :cond_70

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v1

    :goto_40
    const/4 v3, -0x1

    if-ge v2, v1, :cond_6a

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v4

    iget v5, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:I

    if-ne v4, v5, :cond_4c

    goto :goto_67

    :cond_4c
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v5

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    float-to-int v5, v5

    float-to-int v6, v6

    invoke-virtual {p0, v5, v6}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->のぷのちつ(II)Landroid/view/View;

    move-result-object v5

    iget-object v6, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    if-ne v5, v6, :cond_67

    invoke-virtual {p0, v6, v4}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びえぁぜい(Landroid/view/View;I)Z

    move-result v4

    if-eqz v4, :cond_67

    iget p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:I

    goto :goto_6b

    :cond_67
    :goto_67
    add-int/lit8 v2, v2, 0x1

    goto :goto_40

    :cond_6a
    const/4 p1, -0x1

    :goto_6b
    if-ne p1, v3, :cond_70

    invoke-virtual {p0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで()V

    :cond_70
    invoke-virtual {p0, v0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〳ぜぞぜべっ(I)V

    goto/16 :goto_1b0

    :cond_75
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    invoke-virtual {p0, v2, p1, v0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざっざへづ(FFI)V

    iget v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    if-nez v1, :cond_a3

    float-to-int v1, v2

    float-to-int p1, p1

    invoke-virtual {p0, v1, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->のぷのちつ(II)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びえぁぜい(Landroid/view/View;I)Z

    iget-object p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〳ぜぞぜべっ:[I

    aget p1, p1, v0

    iget v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぇぬぎばつ:I

    and-int v2, p1, v1

    if-eqz v2, :cond_1b0

    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    and-int/2addr p1, v1

    invoke-virtual {v2, p1, v0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->ぁごぐすすぃ(II)V

    goto/16 :goto_1b0

    :cond_a3
    float-to-int v1, v2

    float-to-int p1, p1

    .line 1
    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    invoke-virtual {p0, v2, v1, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉざぅち〻(Landroid/view/View;II)Z

    move-result p1

    if-eqz p1, :cond_1b0

    .line 2
    iget-object p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    invoke-virtual {p0, p1, v0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びえぁぜい(Landroid/view/View;I)Z

    goto/16 :goto_1b0

    :cond_b4
    iget p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    if-ne p1, v3, :cond_184

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->てぜきぽく(FF)V

    goto/16 :goto_184

    :cond_be
    iget v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    if-ne v0, v3, :cond_13a

    iget v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:I

    invoke-virtual {p0, v0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぇぬぎばつ(I)Z

    move-result v0

    if-nez v0, :cond_cc

    goto/16 :goto_1b0

    :cond_cc
    iget v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->なぎぱいぢぎ:[F

    iget v3, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:I

    aget v2, v2, v3

    sub-float/2addr v1, v2

    float-to-int v1, v1

    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぁごぐすすぃ:[F

    aget v2, v2, v3

    sub-float/2addr v0, v2

    float-to-int v0, v0

    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v2

    add-int/2addr v2, v1

    iget-object v3, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    add-int/2addr v3, v0

    .line 3
    iget-object v4, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v4

    iget-object v5, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v5

    if-eqz v1, :cond_113

    iget-object v6, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    iget-object v7, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    invoke-virtual {v6, v7, v2, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->げつ〴ぬぐ(Landroid/view/View;II)I

    move-result v2

    iget-object v6, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    sub-int v7, v2, v4

    invoke-static {v6, v7}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぇ〳〲〺すっ(Landroid/view/View;I)V

    :cond_113
    move v10, v2

    if-eqz v0, :cond_125

    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    iget-object v6, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    invoke-virtual {v2, v6, v3, v0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->〺つふすそ(Landroid/view/View;II)I

    move-result v3

    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    sub-int v6, v3, v5

    invoke-static {v2, v6}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->びえぁぜい(Landroid/view/View;I)V

    :cond_125
    move v11, v3

    if-nez v1, :cond_12a

    if-eqz v0, :cond_135

    :cond_12a
    sub-int v12, v10, v4

    sub-int v13, v11, v5

    iget-object v8, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    iget-object v9, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    invoke-virtual/range {v8 .. v13}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->いいにぽつ(Landroid/view/View;IIII)V

    .line 4
    :cond_135
    :goto_135
    invoke-virtual {p0, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->でどあくず(Landroid/view/MotionEvent;)V

    goto/16 :goto_1b0

    :cond_13a
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    :goto_13e
    if-ge v2, v0, :cond_135

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    invoke-virtual {p0, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぇぬぎばつ(I)Z

    move-result v4

    if-nez v4, :cond_14b

    goto :goto_17a

    :cond_14b
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v5

    iget-object v6, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びぐびあび:[F

    aget v6, v6, v1

    sub-float v6, v4, v6

    iget-object v7, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->づざかべべ:[F

    aget v7, v7, v1

    sub-float v7, v5, v7

    invoke-virtual {p0, v6, v7, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ごづごきえ(FFI)V

    iget v8, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    if-ne v8, v3, :cond_167

    goto :goto_135

    :cond_167
    float-to-int v4, v4

    float-to-int v5, v5

    invoke-virtual {p0, v4, v5}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->のぷのちつ(II)Landroid/view/View;

    move-result-object v4

    invoke-virtual {p0, v4, v6, v7}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->づざかべべ(Landroid/view/View;FF)Z

    move-result v5

    if-eqz v5, :cond_17a

    invoke-virtual {p0, v4, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びえぁぜい(Landroid/view/View;I)Z

    move-result v1

    if-eqz v1, :cond_17a

    goto :goto_135

    :cond_17a
    :goto_17a
    add-int/lit8 v2, v2, 0x1

    goto :goto_13e

    :cond_17d
    iget p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    if-ne p1, v3, :cond_184

    invoke-virtual {p0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで()V

    :cond_184
    :goto_184
    invoke-virtual {p0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ()V

    goto :goto_1b0

    :cond_188
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    float-to-int v2, v0

    float-to-int v3, v1

    invoke-virtual {p0, v2, v3}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->のぷのちつ(II)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v0, v1, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざっざへづ(FFI)V

    invoke-virtual {p0, v2, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->びえぁぜい(Landroid/view/View;I)Z

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〳ぜぞぜべっ:[I

    aget v0, v0, p1

    iget v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぇぬぎばつ:I

    and-int v2, v0, v1

    if-eqz v2, :cond_1b0

    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    and-int/2addr v0, v1

    invoke-virtual {v2, v0, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->ぁごぐすすぃ(II)V

    :cond_1b0
    :goto_1b0
    return-void
.end method

.method public final づざかべべ(Landroid/view/View;FF)Z
    .registers 8

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return v0

    :cond_4
    iget-object v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    invoke-virtual {v1, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v1

    const/4 v2, 0x1

    if-lez v1, :cond_f

    const/4 v1, 0x1

    goto :goto_10

    :cond_f
    const/4 v1, 0x0

    :goto_10
    iget-object v3, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    invoke-virtual {v3, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->びぐびあび(Landroid/view/View;)I

    move-result p1

    if-lez p1, :cond_1a

    const/4 p1, 0x1

    goto :goto_1b

    :cond_1a
    const/4 p1, 0x0

    :goto_1b
    if-eqz v1, :cond_2f

    if-eqz p1, :cond_2f

    mul-float p2, p2, p2

    mul-float p3, p3, p3

    add-float/2addr p3, p2

    iget p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:I

    mul-int p1, p1, p1

    int-to-float p1, p1

    cmpl-float p1, p3, p1

    if-lez p1, :cond_2e

    const/4 v0, 0x1

    :cond_2e
    return v0

    :cond_2f
    if-eqz v1, :cond_3e

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget p2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:I

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-lez p1, :cond_3d

    const/4 v0, 0x1

    :cond_3d
    return v0

    :cond_3e
    if-eqz p1, :cond_4c

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget p2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:I

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-lez p1, :cond_4c

    const/4 v0, 0x1

    :cond_4c
    return v0
.end method

.method public final てぜきぽく(FF)V
    .registers 6

    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ごづごきえ:Z

    iget-object v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    invoke-virtual {v1, v2, p1, p2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->ぺふねづ〺(Landroid/view/View;FF)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ごづごきえ:Z

    iget p2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    if-ne p2, v0, :cond_14

    invoke-virtual {p0, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぶでにく〼〳(I)V

    :cond_14
    return-void
.end method

.method public final でどあくず(Landroid/view/MotionEvent;)V
    .registers 8

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_25

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    invoke-virtual {p0, v2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぇぬぎばつ(I)Z

    move-result v3

    if-nez v3, :cond_12

    goto :goto_22

    :cond_12
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v4

    iget-object v5, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->なぎぱいぢぎ:[F

    aput v3, v5, v2

    iget-object v3, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぁごぐすすぃ:[F

    aput v4, v3, v2

    :goto_22
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_25
    return-void
.end method

.method public final なぎぱいぢぎ(FFF)F
    .registers 6

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/4 v1, 0x0

    cmpg-float p2, v0, p2

    if-gez p2, :cond_a

    return v1

    :cond_a
    cmpl-float p2, v0, p3

    if-lez p2, :cond_15

    cmpl-float p1, p1, v1

    if-lez p1, :cond_13

    goto :goto_14

    :cond_13
    neg-float p3, p3

    :goto_14
    return p3

    :cond_15
    return p1
.end method

.method public のぷのちつ(II)Landroid/view/View;
    .registers 6

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざっざへづ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_8
    if-ltz v0, :cond_31

    iget-object v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざっざへづ:Landroid/view/ViewGroup;

    iget-object v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    .line 1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v2

    if-lt p1, v2, :cond_2e

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v2

    if-ge p1, v2, :cond_2e

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    if-lt p2, v2, :cond_2e

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v2

    if-ge p2, v2, :cond_2e

    return-object v1

    :cond_2e
    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    :cond_31
    const/4 p1, 0x0

    return-object p1
.end method

.method public final は〲ぱなで()V
    .registers 5

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->てぜきぽく:Landroid/view/VelocityTracker;

    iget v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->のぷのちつ:F

    const/16 v2, 0x3e8

    invoke-virtual {v0, v2, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->てぜきぽく:Landroid/view/VelocityTracker;

    iget v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:I

    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v0

    iget v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->へぬ〴づぞ:F

    iget v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->のぷのちつ:F

    invoke-virtual {p0, v0, v1, v2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->なぎぱいぢぎ(FFF)F

    move-result v0

    iget-object v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->てぜきぽく:Landroid/view/VelocityTracker;

    iget v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:I

    invoke-virtual {v1, v2}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v1

    iget v2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->へぬ〴づぞ:F

    iget v3, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->のぷのちつ:F

    invoke-virtual {p0, v1, v2, v3}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->なぎぱいぢぎ(FFF)F

    move-result v1

    invoke-virtual {p0, v0, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->てぜきぽく(FF)V

    return-void
.end method

.method public びえぁぜい(Landroid/view/View;I)Z
    .registers 5

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_a

    iget v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:I

    if-ne v0, p2, :cond_a

    return v1

    :cond_a
    if-eqz p1, :cond_1a

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    invoke-virtual {v0, p1, p2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->てぜきぽく(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_1a

    iput p2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ:I

    invoke-virtual {p0, p1, p2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ(Landroid/view/View;I)V

    return v1

    :cond_1a
    const/4 p1, 0x0

    return p1
.end method

.method public final びぐびあび(FFII)Z
    .registers 8

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〳ぜぞぜべっ:[I

    aget v0, v0, p3

    and-int/2addr v0, p4

    const/4 v1, 0x0

    if-ne v0, p4, :cond_57

    iget v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぇぬぎばつ:I

    and-int/2addr v0, p4

    if-eqz v0, :cond_57

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->いいにぽつ:[I

    aget v0, v0, p3

    and-int/2addr v0, p4

    if-eq v0, p4, :cond_57

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぺぁあねじ:[I

    aget v0, v0, p3

    and-int/2addr v0, p4

    if-eq v0, p4, :cond_57

    iget v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:I

    int-to-float v2, v0

    cmpg-float v2, p1, v2

    if-gtz v2, :cond_30

    int-to-float v0, v0

    cmpg-float v0, p2, v0

    if-gtz v0, :cond_30

    goto :goto_57

    :cond_30
    const/high16 v0, 0x3f000000    # 0.5f

    mul-float p2, p2, v0

    cmpg-float p2, p1, p2

    if-gez p2, :cond_48

    iget-object p2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    invoke-virtual {p2, p4}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->なぎぱいぢぎ(I)Z

    move-result p2

    if-eqz p2, :cond_48

    iget-object p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->いいにぽつ:[I

    aget p2, p1, p3

    or-int/2addr p2, p4

    aput p2, p1, p3

    return v1

    :cond_48
    iget-object p2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぺぁあねじ:[I

    aget p2, p2, p3

    and-int/2addr p2, p4

    if-nez p2, :cond_57

    iget p2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〺つふすそ:I

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-lez p1, :cond_57

    const/4 v1, 0x1

    :cond_57
    :goto_57
    return v1
.end method

.method public ぶでにく〼〳(I)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざっざへづ:Landroid/view/ViewGroup;

    iget-object v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->でどあくず:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    if-eq v0, p1, :cond_19

    iput p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    invoke-virtual {v0, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->ぺぁあねじ(I)V

    iget p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    if-nez p1, :cond_19

    const/4 p1, 0x0

    iput-object p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    :cond_19
    return-void
.end method

.method public final へぬ〴づぞ(IIII)Z
    .registers 14

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v2

    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v3

    sub-int v4, p1, v2

    sub-int v5, p2, v3

    if-nez v4, :cond_1e

    if-nez v5, :cond_1e

    iget-object p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉざぅち〻:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->abortAnimation()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぶでにく〼〳(I)V

    return p1

    :cond_1e
    iget-object p1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    .line 1
    iget p2, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->へぬ〴づぞ:F

    float-to-int p2, p2

    iget v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->のぷのちつ:F

    float-to-int v0, v0

    invoke-virtual {p0, p3, p2, v0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぁごぐすすぃ(III)I

    move-result p2

    iget p3, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->へぬ〴づぞ:F

    float-to-int p3, p3

    iget v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->のぷのちつ:F

    float-to-int v0, v0

    invoke-virtual {p0, p4, p3, v0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぁごぐすすぃ(III)I

    move-result p3

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result p4

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result v6

    add-int v7, v1, v6

    add-int v8, p4, v0

    if-eqz p2, :cond_4d

    int-to-float p4, v1

    int-to-float v1, v7

    goto :goto_4f

    :cond_4d
    int-to-float p4, p4

    int-to-float v1, v8

    :goto_4f
    div-float/2addr p4, v1

    if-eqz p3, :cond_55

    int-to-float v0, v6

    int-to-float v1, v7

    goto :goto_57

    :cond_55
    int-to-float v0, v0

    int-to-float v1, v8

    :goto_57
    div-float/2addr v0, v1

    iget-object v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    invoke-virtual {v1, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v1

    invoke-virtual {p0, v4, p2, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぺぁあねじ(III)I

    move-result p2

    iget-object v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざとぅぼこ〺:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;

    invoke-virtual {v1, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;->びぐびあび(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p0, v5, p3, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぺぁあねじ(III)I

    move-result p1

    int-to-float p2, p2

    mul-float p2, p2, p4

    int-to-float p1, p1

    mul-float p1, p1, v0

    add-float/2addr p1, p2

    float-to-int v6, p1

    .line 2
    iget-object v1, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぉざぅち〻:Landroid/widget/OverScroller;

    invoke-virtual/range {v1 .. v6}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ぶでにく〼〳(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ぺぁあねじ(III)I
    .registers 8

    if-nez p1, :cond_4

    const/4 p1, 0x0

    return p1

    :cond_4
    iget-object v0, p0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->ざっざへづ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v0

    div-int/lit8 v1, v0, 0x2

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v2

    int-to-float v2, v2

    int-to-float v0, v0

    div-float/2addr v2, v0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    int-to-float v1, v1

    const/high16 v3, 0x3f000000    # 0.5f

    sub-float/2addr v2, v3

    const v3, 0x3ef1463b

    mul-float v2, v2, v3

    float-to-double v2, v2

    .line 1
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float v2, v2, v1

    add-float/2addr v2, v1

    .line 2
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    if-lez p2, :cond_42

    const/high16 p1, 0x447a0000    # 1000.0f

    int-to-float p2, p2

    div-float/2addr v2, p2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    mul-float p2, p2, p1

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p1

    mul-int/lit8 p1, p1, 0x4

    goto :goto_4f

    :cond_42
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-float p1, p1

    int-to-float p2, p3

    div-float/2addr p1, p2

    add-float/2addr p1, v0

    const/high16 p2, 0x43800000    # 256.0f

    mul-float p1, p1, p2

    float-to-int p1, p1

    :goto_4f
    const/16 p2, 0x258

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method
