.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;
.super Landroidx/recyclerview/widget/RecyclerView$ぺふねづ〺;
.source ""

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$おぐぴう〸ず;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく$びぐびあび;,
        Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく$くし〴〺ぅ;
    }
.end annotation


# static fields
.field public static final ぅみぱぎぎ:[I

.field public static final じぜこほぱ:[I


# instance fields
.field public final 〳ぜぞぜべっ:Landroid/graphics/drawable/Drawable;

.field public final 〺つふすそ:I

.field public final 〻ぞまぎな〻:[I

.field public final ぁごぐすすぃ:Landroid/graphics/drawable/StateListDrawable;

.field public final いいにぽつ:I

.field public final ぇ〳〲〺すっ:Landroid/animation/ValueAnimator;

.field public ぇぬぎばつ:F

.field public final ぉ〲なぱぽた:[I

.field public ぉざぅち〻:I

.field public おぐぴう〸ず:I

.field public final くし〴〺ぅ:Landroid/graphics/drawable/StateListDrawable;

.field public final げつ〴ぬぐ:I

.field public ごづごきえ:Z

.field public ざっざへづ:Z

.field public ざとぅぼこ〺:I

.field public final づざかべべ:I

.field public てぜきぽく:I

.field public でどあくず:I

.field public final どぇぞほだ:Landroidx/recyclerview/widget/RecyclerView$ぇぬぎばつ;

.field public final なぎぱいぢぎ:I

.field public final なぶひせが:Ljava/lang/Runnable;

.field public のぷのちつ:F

.field public は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

.field public びえぁぜい:I

.field public final びぐびあび:Landroid/graphics/drawable/Drawable;

.field public ぶでにく〼〳:I

.field public へぬ〴づぞ:I

.field public final ぺぁあねじ:I

.field public ぺふねづ〺:I


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    const/4 v0, 0x1

    new-array v0, v0, [I

    const v1, 0x10100a7

    const/4 v2, 0x0

    aput v1, v0, v2

    sput-object v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぅみぱぎぎ:[I

    new-array v0, v2, [I

    sput-object v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->じぜこほぱ:[I

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;III)V
    .registers 14

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ぺふねづ〺;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぉざぅち〻:I

    iput v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ざとぅぼこ〺:I

    iput-boolean v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ごづごきえ:Z

    iput-boolean v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ざっざへづ:Z

    iput v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->でどあくず:I

    iput v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぶでにく〼〳:I

    const/4 v1, 0x2

    new-array v2, v1, [I

    iput-object v2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->〻ぞまぎな〻:[I

    new-array v2, v1, [I

    iput-object v2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぉ〲なぱぽた:[I

    new-array v2, v1, [F

    fill-array-data v2, :array_da

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    iput-object v2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぇ〳〲〺すっ:Landroid/animation/ValueAnimator;

    iput v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->びえぁぜい:I

    new-instance v3, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく$げつ〴ぬぐ;

    invoke-direct {v3, p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく$げつ〴ぬぐ;-><init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;)V

    iput-object v3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->なぶひせが:Ljava/lang/Runnable;

    new-instance v3, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく$〺つふすそ;

    invoke-direct {v3, p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく$〺つふすそ;-><init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;)V

    iput-object v3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->どぇぞほだ:Landroidx/recyclerview/widget/RecyclerView$ぇぬぎばつ;

    iput-object p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->くし〴〺ぅ:Landroid/graphics/drawable/StateListDrawable;

    iput-object p3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->びぐびあび:Landroid/graphics/drawable/Drawable;

    iput-object p4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぁごぐすすぃ:Landroid/graphics/drawable/StateListDrawable;

    iput-object p5, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->〳ぜぞぜべっ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2}, Landroid/graphics/drawable/StateListDrawable;->getIntrinsicWidth()I

    move-result v4

    invoke-static {p6, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->づざかべべ:I

    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    invoke-static {p6, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->なぎぱいぢぎ:I

    invoke-virtual {p4}, Landroid/graphics/drawable/StateListDrawable;->getIntrinsicWidth()I

    move-result p4

    invoke-static {p6, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    iput p4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぺぁあねじ:I

    invoke-virtual {p5}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result p4

    invoke-static {p6, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    iput p4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->いいにぽつ:I

    iput p7, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->げつ〴ぬぐ:I

    iput p8, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->〺つふすそ:I

    const/16 p4, 0xff

    invoke-virtual {p2, p4}, Landroid/graphics/drawable/StateListDrawable;->setAlpha(I)V

    invoke-virtual {p3, p4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    new-instance p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく$くし〴〺ぅ;

    invoke-direct {p2, p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく$くし〴〺ぅ;-><init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;)V

    invoke-virtual {v2, p2}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく$びぐびあび;

    invoke-direct {p2, p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく$びぐびあび;-><init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;)V

    invoke-virtual {v2, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 1
    iget-object p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    if-ne p2, p1, :cond_85

    goto :goto_d8

    :cond_85
    if-eqz p2, :cond_c7

    .line 2
    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView;->のぷのちつ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    if-eqz p3, :cond_90

    const-string p4, "Cannot remove item decoration during a scroll  or layout"

    invoke-virtual {p3, p4}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->びぐびあび(Ljava/lang/String;)V

    :cond_90
    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView;->おぐぴう〸ず:Ljava/util/ArrayList;

    invoke-virtual {p3, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView;->おぐぴう〸ず:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_a7

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getOverScrollMode()I

    move-result p3

    if-ne p3, v1, :cond_a4

    const/4 v0, 0x1

    :cond_a4
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V

    :cond_a7
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->ておぞぞはね()V

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 3
    iget-object p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView;->ぇぬぎばつ:Ljava/util/ArrayList;

    invoke-virtual {p3, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView;->ぉざぅち〻:Landroidx/recyclerview/widget/RecyclerView$おぐぴう〸ず;

    if-ne p3, p0, :cond_bb

    const/4 p3, 0x0

    iput-object p3, p2, Landroidx/recyclerview/widget/RecyclerView;->ぉざぅち〻:Landroidx/recyclerview/widget/RecyclerView$おぐぴう〸ず;

    .line 5
    :cond_bb
    iget-object p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView;->〱かけばぜぐ:Ljava/util/List;

    if-eqz p2, :cond_c4

    invoke-interface {p2, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 7
    :cond_c4
    invoke-virtual {p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぁごぐすすぃ()V

    .line 8
    :cond_c7
    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->ぁごぐすすぃ(Landroidx/recyclerview/widget/RecyclerView$ぺふねづ〺;)V

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->ぇぬぎばつ:Ljava/util/ArrayList;

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->〳ぜぞぜべっ(Landroidx/recyclerview/widget/RecyclerView$ぇぬぎばつ;)V

    :goto_d8
    return-void

    nop

    :array_da
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public 〳ぜぞぜべっ(FF)Z
    .registers 5

    iget v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ざとぅぼこ〺:I

    iget v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぺぁあねじ:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    cmpl-float p2, p2, v0

    if-ltz p2, :cond_21

    iget p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->おぐぴう〸ず:I

    iget v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->へぬ〴づぞ:I

    div-int/lit8 v1, v0, 0x2

    sub-int v1, p2, v1

    int-to-float v1, v1

    cmpl-float v1, p1, v1

    if-ltz v1, :cond_21

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, p2

    int-to-float p2, v0

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_21

    const/4 p1, 0x1

    goto :goto_22

    :cond_21
    const/4 p1, 0x0

    :goto_22
    return p1
.end method

.method public 〺つふすそ(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V
    .registers 14

    iget p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->でどあくず:I

    if-nez p1, :cond_5

    return-void

    :cond_5
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-nez p1, :cond_47

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {p0, p1, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぺぁあねじ(FF)Z

    move-result p1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {p0, v2, v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->〳ぜぞぜべっ(FF)Z

    move-result v2

    if-nez p1, :cond_29

    if-eqz v2, :cond_107

    :cond_29
    if-eqz v2, :cond_36

    iput v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぶでにく〼〳:I

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    float-to-int p1, p1

    int-to-float p1, p1

    iput p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぇぬぎばつ:F

    goto :goto_42

    :cond_36
    if-eqz p1, :cond_42

    iput v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぶでにく〼〳:I

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    int-to-float p1, p1

    iput p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->のぷのちつ:F

    :cond_42
    :goto_42
    invoke-virtual {p0, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぺふねづ〺(I)V

    goto/16 :goto_107

    :cond_47
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v2, 0x0

    if-ne p1, v1, :cond_5e

    iget p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->でどあくず:I

    if-ne p1, v0, :cond_5e

    const/4 p1, 0x0

    iput p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->のぷのちつ:F

    iput p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぇぬぎばつ:F

    invoke-virtual {p0, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぺふねづ〺(I)V

    iput v2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぶでにく〼〳:I

    goto/16 :goto_107

    :cond_5e
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-ne p1, v0, :cond_107

    iget p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->でどあくず:I

    if-ne p1, v0, :cond_107

    invoke-virtual {p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->てぜきぽく()V

    iget p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぶでにく〼〳:I

    const/high16 v3, 0x40000000    # 2.0f

    if-ne p1, v1, :cond_ba

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    .line 1
    iget-object v7, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぉ〲なぱぽた:[I

    iget v4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->〺つふすそ:I

    aput v4, v7, v2

    iget v5, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぉざぅち〻:I

    sub-int/2addr v5, v4

    aput v5, v7, v1

    .line 2
    aget v4, v7, v2

    int-to-float v4, v4

    aget v5, v7, v1

    int-to-float v5, v5

    invoke-static {v5, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {v4, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iget v4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->おぐぴう〸ず:I

    int-to-float v4, v4

    sub-float/2addr v4, p1

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpg-float v4, v4, v3

    if-gez v4, :cond_9b

    goto :goto_ba

    :cond_9b
    iget v5, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぇぬぎばつ:F

    iget-object v4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollRange()I

    move-result v8

    iget-object v4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollOffset()I

    move-result v9

    iget v10, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぉざぅち〻:I

    move-object v4, p0

    move v6, p1

    invoke-virtual/range {v4 .. v10}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->いいにぽつ(FF[IIII)I

    move-result v4

    if-eqz v4, :cond_b8

    iget-object v5, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5, v4, v2}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    :cond_b8
    iput p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぇぬぎばつ:F

    .line 3
    :cond_ba
    :goto_ba
    iget p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぶでにく〼〳:I

    if-ne p1, v0, :cond_107

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 4
    iget-object v7, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->〻ぞまぎな〻:[I

    iget p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->〺つふすそ:I

    aput p2, v7, v2

    iget v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ざとぅぼこ〺:I

    sub-int/2addr v0, p2

    aput v0, v7, v1

    .line 5
    aget p2, v7, v2

    int-to-float p2, p2

    aget v0, v7, v1

    int-to-float v0, v0

    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iget p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->てぜきぽく:I

    int-to-float p2, p2

    sub-float/2addr p2, p1

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpg-float p2, p2, v3

    if-gez p2, :cond_e8

    goto :goto_107

    :cond_e8
    iget v5, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->のぷのちつ:F

    iget-object p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollRange()I

    move-result v8

    iget-object p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    move-result v9

    iget v10, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ざとぅぼこ〺:I

    move-object v4, p0

    move v6, p1

    invoke-virtual/range {v4 .. v10}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->いいにぽつ(FF[IIII)I

    move-result p2

    if-eqz p2, :cond_105

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    :cond_105
    iput p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->のぷのちつ:F

    :cond_107
    :goto_107
    return-void
.end method

.method public final ぁごぐすすぃ()V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->なぶひせが:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final いいにぽつ(FF[IIII)I
    .registers 9

    const/4 v0, 0x1

    aget v0, p3, v0

    const/4 v1, 0x0

    aget p3, p3, v1

    sub-int/2addr v0, p3

    if-nez v0, :cond_a

    return v1

    :cond_a
    sub-float/2addr p2, p1

    int-to-float p1, v0

    div-float/2addr p2, p1

    sub-int/2addr p4, p6

    int-to-float p1, p4

    mul-float p2, p2, p1

    float-to-int p1, p2

    add-int/2addr p5, p1

    if-ge p5, p4, :cond_18

    if-ltz p5, :cond_18

    return p1

    :cond_18
    return v1
.end method

.method public くし〴〺ぅ(Z)V
    .registers 2

    return-void
.end method

.method public げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z
    .registers 7

    iget p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->でどあくず:I

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-ne p1, v0, :cond_45

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {p0, p1, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぺぁあねじ(FF)Z

    move-result p1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {p0, v2, v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->〳ぜぞぜべっ(FF)Z

    move-result v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    if-nez v3, :cond_48

    if-nez p1, :cond_28

    if-eqz v2, :cond_48

    :cond_28
    if-eqz v2, :cond_35

    iput v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぶでにく〼〳:I

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    float-to-int p1, p1

    int-to-float p1, p1

    iput p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぇぬぎばつ:F

    goto :goto_41

    :cond_35
    if-eqz p1, :cond_41

    iput v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぶでにく〼〳:I

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    int-to-float p1, p1

    iput p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->のぷのちつ:F

    :cond_41
    :goto_41
    invoke-virtual {p0, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぺふねづ〺(I)V

    goto :goto_49

    :cond_45
    if-ne p1, v1, :cond_48

    goto :goto_49

    :cond_48
    const/4 v0, 0x0

    :goto_49
    return v0
.end method

.method public てぜきぽく()V
    .registers 6

    iget v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->びえぁぜい:I

    if-eqz v0, :cond_d

    const/4 v1, 0x3

    if-eq v0, v1, :cond_8

    goto :goto_3c

    :cond_8
    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぇ〳〲〺すっ:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_d
    const/4 v0, 0x1

    iput v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->びえぁぜい:I

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぇ〳〲〺すっ:Landroid/animation/ValueAnimator;

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    aput v4, v2, v3

    const/high16 v3, 0x3f800000    # 1.0f

    aput v3, v2, v0

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぇ〳〲〺すっ:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぇ〳〲〺すっ:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぇ〳〲〺すっ:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    :goto_3c
    return-void
.end method

.method public なぎぱいぢぎ(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)V
    .registers 9

    iget p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぉざぅち〻:I

    iget-object p3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getWidth()I

    move-result p3

    const/4 v0, 0x0

    if-ne p2, p3, :cond_b6

    iget p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ざとぅぼこ〺:I

    iget-object p3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getHeight()I

    move-result p3

    if-eq p2, p3, :cond_17

    goto/16 :goto_b6

    :cond_17
    iget p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->びえぁぜい:I

    if-eqz p2, :cond_b5

    iget-boolean p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ごづごきえ:Z

    const/4 p3, 0x0

    if-eqz p2, :cond_7e

    .line 1
    iget p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぉざぅち〻:I

    iget v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->づざかべべ:I

    sub-int/2addr p2, v1

    iget v2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->てぜきぽく:I

    iget v3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぺふねづ〺:I

    div-int/lit8 v4, v3, 0x2

    sub-int/2addr v2, v4

    iget-object v4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->くし〴〺ぅ:Landroid/graphics/drawable/StateListDrawable;

    invoke-virtual {v4, v0, v0, v1, v3}, Landroid/graphics/drawable/StateListDrawable;->setBounds(IIII)V

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->びぐびあび:Landroid/graphics/drawable/Drawable;

    iget v3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->なぎぱいぢぎ:I

    iget v4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ざとぅぼこ〺:I

    invoke-virtual {v1, v0, v0, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 2
    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_44

    goto :goto_45

    :cond_44
    const/4 v3, 0x0

    :goto_45
    if-eqz v3, :cond_65

    .line 3
    iget-object p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->びぐびあび:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    iget p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->づざかべべ:I

    int-to-float p2, p2

    int-to-float v1, v2

    invoke-virtual {p1, p2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    const/high16 p2, -0x40800000    # -1.0f

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2, v1}, Landroid/graphics/Canvas;->scale(FF)V

    iget-object p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->くし〴〺ぅ:Landroid/graphics/drawable/StateListDrawable;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/StateListDrawable;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1, v1, v1}, Landroid/graphics/Canvas;->scale(FF)V

    iget p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->づざかべべ:I

    goto :goto_77

    :cond_65
    int-to-float v1, p2

    invoke-virtual {p1, v1, p3}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->びぐびあび:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    int-to-float v1, v2

    invoke-virtual {p1, p3, v1}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->くし〴〺ぅ:Landroid/graphics/drawable/StateListDrawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/StateListDrawable;->draw(Landroid/graphics/Canvas;)V

    :goto_77
    neg-int p2, p2

    int-to-float p2, p2

    neg-int v1, v2

    int-to-float v1, v1

    invoke-virtual {p1, p2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 4
    :cond_7e
    iget-boolean p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ざっざへづ:Z

    if-eqz p2, :cond_b5

    .line 5
    iget p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ざとぅぼこ〺:I

    iget v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぺぁあねじ:I

    sub-int/2addr p2, v1

    iget v2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->おぐぴう〸ず:I

    iget v3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->へぬ〴づぞ:I

    div-int/lit8 v4, v3, 0x2

    sub-int/2addr v2, v4

    iget-object v4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぁごぐすすぃ:Landroid/graphics/drawable/StateListDrawable;

    invoke-virtual {v4, v0, v0, v3, v1}, Landroid/graphics/drawable/StateListDrawable;->setBounds(IIII)V

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->〳ぜぞぜべっ:Landroid/graphics/drawable/Drawable;

    iget v3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぉざぅち〻:I

    iget v4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->いいにぽつ:I

    invoke-virtual {v1, v0, v0, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    int-to-float v0, p2

    invoke-virtual {p1, p3, v0}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->〳ぜぞぜべっ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    int-to-float v0, v2

    invoke-virtual {p1, v0, p3}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object p3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぁごぐすすぃ:Landroid/graphics/drawable/StateListDrawable;

    invoke-virtual {p3, p1}, Landroid/graphics/drawable/StateListDrawable;->draw(Landroid/graphics/Canvas;)V

    neg-int p3, v2

    int-to-float p3, p3

    neg-int p2, p2

    int-to-float p2, p2

    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_b5
    return-void

    .line 6
    :cond_b6
    :goto_b6
    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I

    move-result p1

    iput p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぉざぅち〻:I

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I

    move-result p1

    iput p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ざとぅぼこ〺:I

    invoke-virtual {p0, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぺふねづ〺(I)V

    return-void
.end method

.method public ぺぁあねじ(FF)Z
    .registers 7

    .line 1
    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_c

    const/4 v0, 0x1

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    :goto_d
    if-eqz v0, :cond_19

    .line 2
    iget v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->づざかべべ:I

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_37

    goto :goto_23

    :cond_19
    iget v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぉざぅち〻:I

    iget v3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->づざかべべ:I

    sub-int/2addr v0, v3

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-ltz p1, :cond_37

    :goto_23
    iget p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->てぜきぽく:I

    iget v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぺふねづ〺:I

    div-int/lit8 v0, v0, 0x2

    sub-int v3, p1, v0

    int-to-float v3, v3

    cmpl-float v3, p2, v3

    if-ltz v3, :cond_37

    add-int/2addr v0, p1

    int-to-float p1, v0

    cmpg-float p1, p2, p1

    if-gtz p1, :cond_37

    const/4 v1, 0x1

    :cond_37
    return v1
.end method

.method public ぺふねづ〺(I)V
    .registers 7

    const/4 v0, 0x2

    if-ne p1, v0, :cond_11

    iget v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->でどあくず:I

    if-eq v1, v0, :cond_11

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->くし〴〺ぅ:Landroid/graphics/drawable/StateListDrawable;

    sget-object v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぅみぱぎぎ:[I

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/StateListDrawable;->setState([I)Z

    invoke-virtual {p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぁごぐすすぃ()V

    :cond_11
    if-nez p1, :cond_19

    .line 1
    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->invalidate()V

    goto :goto_1c

    .line 2
    :cond_19
    invoke-virtual {p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->てぜきぽく()V

    :goto_1c
    iget v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->でどあくず:I

    if-ne v1, v0, :cond_2c

    if-eq p1, v0, :cond_2c

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->くし〴〺ぅ:Landroid/graphics/drawable/StateListDrawable;

    sget-object v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->じぜこほぱ:[I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/StateListDrawable;->setState([I)Z

    const/16 v0, 0x4b0

    goto :goto_31

    :cond_2c
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3c

    const/16 v0, 0x5dc

    .line 3
    :goto_31
    invoke-virtual {p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->ぁごぐすすぃ()V

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->は〲ぱなで:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->なぶひせが:Ljava/lang/Runnable;

    int-to-long v3, v0

    invoke-virtual {v1, v2, v3, v4}, Landroid/view/ViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 4
    :cond_3c
    iput p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/てぜきぽく;->でどあくず:I

    return-void
.end method
