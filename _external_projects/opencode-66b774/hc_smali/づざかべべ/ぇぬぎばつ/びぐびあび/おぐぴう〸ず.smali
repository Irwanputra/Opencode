.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;
.super Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;
.source ""


# instance fields
.field public final いいにぽつ:Landroid/view/animation/DecelerateInterpolator;

.field public ぇぬぎばつ:I

.field public おぐぴう〸ず:I

.field public final てぜきぽく:Landroid/util/DisplayMetrics;

.field public のぷのちつ:Z

.field public へぬ〴づぞ:F

.field public final ぺぁあねじ:Landroid/view/animation/LinearInterpolator;

.field public ぺふねづ〺:Landroid/graphics/PointF;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;-><init>()V

    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    iput-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->ぺぁあねじ:Landroid/view/animation/LinearInterpolator;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    iput-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->いいにぽつ:Landroid/view/animation/DecelerateInterpolator;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->のぷのちつ:Z

    iput v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->おぐぴう〸ず:I

    iput v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->ぇぬぎばつ:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->てぜきぽく:Landroid/util/DisplayMetrics;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;)V
    .registers 14

    .line 1
    iget-object p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->ぺふねづ〺:Landroid/graphics/PointF;

    const/4 v0, 0x1

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz p2, :cond_17

    iget p2, p2, Landroid/graphics/PointF;->x:F

    cmpl-float v4, p2, v2

    if-nez v4, :cond_f

    goto :goto_17

    :cond_f
    cmpl-float p2, p2, v2

    if-lez p2, :cond_15

    const/4 v9, 0x1

    goto :goto_18

    :cond_15
    const/4 v9, -0x1

    goto :goto_18

    :cond_17
    :goto_17
    const/4 v9, 0x0

    .line 2
    :goto_18
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    if-eqz p2, :cond_49

    .line 3
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->づざかべべ()Z

    move-result v4

    if-nez v4, :cond_23

    goto :goto_49

    :cond_23
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぅみぱぎぎ(Landroid/view/View;)I

    move-result v5

    iget v6, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr v5, v6

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉひのべい(Landroid/view/View;)I

    move-result v6

    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v6, v4

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ながふずは()I

    move-result v7

    .line 4
    iget v4, p2, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇぬぎばつ:I

    .line 5
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぃぜぶの〸ぃ()I

    move-result p2

    sub-int v8, v4, p2

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->びぐびあび(IIIII)I

    move-result p2

    goto :goto_4a

    :cond_49
    :goto_49
    const/4 p2, 0x0

    .line 6
    :goto_4a
    iget-object v4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->ぺふねづ〺:Landroid/graphics/PointF;

    if-eqz v4, :cond_5d

    iget v4, v4, Landroid/graphics/PointF;->y:F

    cmpl-float v5, v4, v2

    if-nez v5, :cond_55

    goto :goto_5d

    :cond_55
    cmpl-float v2, v4, v2

    if-lez v2, :cond_5b

    const/4 v9, 0x1

    goto :goto_5e

    :cond_5b
    const/4 v9, -0x1

    goto :goto_5e

    :cond_5d
    :goto_5d
    const/4 v9, 0x0

    .line 7
    :goto_5e
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    if-eqz v0, :cond_90

    .line 8
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->なぎぱいぢぎ()Z

    move-result v1

    if-nez v1, :cond_69

    goto :goto_90

    :cond_69
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->せづっ〸ちね(Landroid/view/View;)I

    move-result v2

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int v5, v2, v3

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->なぶひせが(Landroid/view/View;)I

    move-result p1

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int v6, p1, v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ておぞぞはね()I

    move-result v7

    .line 9
    iget p1, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉざぅち〻:I

    .line 10
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げがぴうあだ()I

    move-result v0

    sub-int v8, p1, v0

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->びぐびあび(IIIII)I

    move-result v3

    :cond_90
    :goto_90
    mul-int p1, p2, p2

    mul-int v0, v3, v3

    add-int/2addr v0, p1

    int-to-double v0, v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-int p1, v0

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->なぎぱいぢぎ(I)I

    move-result p1

    if-lez p1, :cond_a8

    neg-int p2, p2

    neg-int v0, v3

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->いいにぽつ:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {p3, p2, v0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->〺つふすそ(IIILandroid/view/animation/Interpolator;)V

    :cond_a8
    return-void
.end method

.method public ぁごぐすすぃ(I)I
    .registers 4

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-float p1, p1

    .line 1
    iget-boolean v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->のぷのちつ:Z

    if-nez v0, :cond_14

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->てぜきぽく:Landroid/util/DisplayMetrics;

    invoke-virtual {p0, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->づざかべべ(Landroid/util/DisplayMetrics;)F

    move-result v0

    iput v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->へぬ〴づぞ:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->のぷのちつ:Z

    :cond_14
    iget v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->へぬ〴づぞ:F

    mul-float p1, p1, v0

    float-to-double v0, p1

    .line 2
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p1, v0

    return p1
.end method

.method public づざかべべ(Landroid/util/DisplayMetrics;)F
    .registers 3

    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float p1, p1

    const/high16 v0, 0x41c80000    # 25.0f

    div-float/2addr v0, p1

    return v0
.end method

.method public なぎぱいぢぎ(I)I
    .registers 6

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->ぁごぐすすぃ(I)I

    move-result p1

    int-to-double v0, p1

    const-wide v2, 0x3fd57a786c22680aL    # 0.3356

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p1, v0

    return p1
.end method

.method public びぐびあび(IIIII)I
    .registers 7

    const/4 v0, -0x1

    if-eq p5, v0, :cond_1c

    if-eqz p5, :cond_12

    const/4 p1, 0x1

    if-ne p5, p1, :cond_a

    sub-int/2addr p4, p2

    return p4

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_12
    sub-int/2addr p3, p1

    if-lez p3, :cond_16

    return p3

    :cond_16
    sub-int/2addr p4, p2

    if-gez p4, :cond_1a

    return p4

    :cond_1a
    const/4 p1, 0x0

    return p1

    :cond_1c
    sub-int/2addr p3, p1

    return p3
.end method
