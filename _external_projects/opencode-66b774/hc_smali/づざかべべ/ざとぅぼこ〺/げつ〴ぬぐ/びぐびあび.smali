.class public Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;
.super Landroid/graphics/drawable/Drawable;
.source ""

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static final 〳ぜぞぜべっ:Landroid/view/animation/Interpolator;

.field public static final いいにぽつ:[I

.field public static final ぺぁあねじ:Landroid/view/animation/Interpolator;


# instance fields
.field public final 〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

.field public ぁごぐすすぃ:Z

.field public くし〴〺ぅ:F

.field public づざかべべ:Landroid/animation/Animator;

.field public なぎぱいぢぎ:F

.field public びぐびあび:Landroid/content/res/Resources;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    sput-object v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〳ぜぞぜべっ:Landroid/view/animation/Interpolator;

    new-instance v0, Lづざかべべ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    invoke-direct {v0}, Lづざかべべ/てぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;-><init>()V

    sput-object v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->ぺぁあねじ:Landroid/view/animation/Interpolator;

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const/high16 v2, -0x1000000

    aput v2, v0, v1

    sput-object v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->いいにぽつ:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iput-object p1, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->びぐびあび:Landroid/content/res/Resources;

    new-instance p1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    invoke-direct {p1}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;-><init>()V

    iput-object p1, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    sget-object v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->いいにぽつ:[I

    .line 3
    iput-object v0, p1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぺぁあねじ:[I

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->げつ〴ぬぐ(I)V

    const/high16 v0, 0x40200000    # 2.5f

    .line 4
    iput v0, p1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->〳ぜぞぜべっ:F

    iget-object v1, p1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->〺つふすそ:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 6
    fill-array-data v0, :array_52

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    new-instance v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/〺つふすそ;

    invoke-direct {v1, p0, p1}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/〺つふすそ;-><init>(Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    sget-object v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〳ぜぞぜべっ:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/くし〴〺ぅ;

    invoke-direct {v1, p0, p1}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/くし〴〺ぅ;-><init>(Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iput-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->づざかべべ:Landroid/animation/Animator;

    return-void

    nop

    :array_52
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .registers 14

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget v1, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->くし〴〺ぅ:F

    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterX()F

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v3

    invoke-virtual {p1, v1, v2, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    iget-object v1, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    .line 1
    iget-object v8, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/graphics/RectF;

    iget v2, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぉざぅち〻:F

    iget v3, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->〳ぜぞぜべっ:F

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v3, v9

    add-float/2addr v3, v2

    const/4 v10, 0x0

    cmpg-float v2, v2, v10

    if-gtz v2, :cond_44

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v9

    iget v3, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ざとぅぼこ〺:I

    int-to-float v3, v3

    iget v4, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぇぬぎばつ:F

    mul-float v3, v3, v4

    div-float/2addr v3, v9

    iget v4, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->〳ぜぞぜべっ:F

    div-float/2addr v4, v9

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    sub-float v3, v2, v3

    :cond_44
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v2, v3

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v4, v3

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v5, v3

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v0, v3

    invoke-virtual {v8, v2, v4, v5, v0}, Landroid/graphics/RectF;->set(FFFF)V

    iget v0, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->づざかべべ:F

    iget v2, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぁごぐすすぃ:F

    add-float/2addr v0, v2

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float v0, v0, v3

    iget v4, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->なぎぱいぢぎ:F

    add-float/2addr v4, v2

    mul-float v4, v4, v3

    sub-float v11, v4, v0

    iget-object v2, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->〺つふすそ:Landroid/graphics/Paint;

    iget v3, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ざっざへづ:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->〺つふすそ:Landroid/graphics/Paint;

    iget v3, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ごづごきえ:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget v2, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->〳ぜぞぜべっ:F

    div-float/2addr v2, v9

    invoke-virtual {v8, v2, v2}, Landroid/graphics/RectF;->inset(FF)V

    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    invoke-virtual {v8}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    invoke-virtual {v8}, Landroid/graphics/RectF;->width()F

    move-result v5

    div-float/2addr v5, v9

    iget-object v6, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->びぐびあび:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    neg-float v2, v2

    invoke-virtual {v8, v2, v2}, Landroid/graphics/RectF;->inset(FF)V

    const/4 v6, 0x0

    iget-object v7, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->〺つふすそ:Landroid/graphics/Paint;

    move-object v2, p1

    move-object v3, v8

    move v4, v0

    move v5, v11

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 2
    iget-boolean v2, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->へぬ〴づぞ:Z

    if-eqz v2, :cond_132

    iget-object v2, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->おぐぴう〸ず:Landroid/graphics/Path;

    if-nez v2, :cond_b8

    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    iput-object v2, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->おぐぴう〸ず:Landroid/graphics/Path;

    sget-object v3, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    invoke-virtual {v2, v3}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    goto :goto_bb

    :cond_b8
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    :goto_bb
    invoke-virtual {v8}, Landroid/graphics/RectF;->width()F

    move-result v2

    invoke-virtual {v8}, Landroid/graphics/RectF;->height()F

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    div-float/2addr v2, v9

    iget v3, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ざとぅぼこ〺:I

    int-to-float v3, v3

    iget v4, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぇぬぎばつ:F

    mul-float v3, v3, v4

    div-float/2addr v3, v9

    iget-object v4, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->おぐぴう〸ず:Landroid/graphics/Path;

    invoke-virtual {v4, v10, v10}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v4, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->おぐぴう〸ず:Landroid/graphics/Path;

    iget v5, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ざとぅぼこ〺:I

    int-to-float v5, v5

    iget v6, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぇぬぎばつ:F

    mul-float v5, v5, v6

    invoke-virtual {v4, v5, v10}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v4, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->おぐぴう〸ず:Landroid/graphics/Path;

    iget v5, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ざとぅぼこ〺:I

    int-to-float v5, v5

    iget v6, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぇぬぎばつ:F

    mul-float v5, v5, v6

    div-float/2addr v5, v9

    iget v7, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->は〲ぱなで:I

    int-to-float v7, v7

    mul-float v7, v7, v6

    invoke-virtual {v4, v5, v7}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v4, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->おぐぴう〸ず:Landroid/graphics/Path;

    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    move-result v5

    add-float/2addr v5, v2

    sub-float/2addr v5, v3

    invoke-virtual {v8}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    iget v3, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->〳ぜぞぜべっ:F

    div-float/2addr v3, v9

    add-float/2addr v3, v2

    invoke-virtual {v4, v5, v3}, Landroid/graphics/Path;->offset(FF)V

    iget-object v2, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->おぐぴう〸ず:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->close()V

    iget-object v2, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/graphics/Paint;

    iget v3, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ざっざへづ:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/graphics/Paint;

    iget v3, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ごづごきえ:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    add-float/2addr v0, v11

    invoke-virtual {v8}, Landroid/graphics/RectF;->centerX()F

    move-result v2

    invoke-virtual {v8}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    invoke-virtual {p1, v0, v2, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    iget-object v0, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->おぐぴう〸ず:Landroid/graphics/Path;

    iget-object v1, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 3
    :cond_132
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public getAlpha()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    .line 1
    iget v0, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ごづごきえ:I

    return v0
.end method

.method public getOpacity()I
    .registers 2

    const/4 v0, -0x3

    return v0
.end method

.method public isRunning()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->づざかべべ:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    move-result v0

    return v0
.end method

.method public setAlpha(I)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    .line 1
    iput p1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ごづごきえ:I

    .line 2
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    .line 1
    iget-object v0, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->〺つふすそ:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 2
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public start()V
    .registers 5

    iget-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->づざかべべ:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    iget-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    .line 1
    iget v1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->づざかべべ:F

    iput v1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぺふねづ〺:F

    iget v2, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->なぎぱいぢぎ:F

    iput v2, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->てぜきぽく:F

    iget v3, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぁごぐすすぃ:F

    iput v3, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->のぷのちつ:F

    cmpl-float v1, v2, v1

    if-eqz v1, :cond_1f

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->ぁごぐすすぃ:Z

    iget-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->づざかべべ:Landroid/animation/Animator;

    const-wide/16 v1, 0x29a

    goto :goto_36

    :cond_1f
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->げつ〴ぬぐ(I)V

    iget-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    const/4 v1, 0x0

    .line 3
    iput v1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぺふねづ〺:F

    iput v1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->てぜきぽく:F

    iput v1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->のぷのちつ:F

    .line 4
    iput v1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->づざかべべ:F

    .line 5
    iput v1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->なぎぱいぢぎ:F

    .line 6
    iput v1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぁごぐすすぃ:F

    .line 7
    iget-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->づざかべべ:Landroid/animation/Animator;

    const-wide/16 v1, 0x534

    :goto_36
    invoke-virtual {v0, v1, v2}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    iget-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->づざかべべ:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    return-void
.end method

.method public stop()V
    .registers 4

    iget-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->づざかべべ:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->くし〴〺ぅ:F

    .line 2
    iget-object v1, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->〺つふすそ(Z)V

    iget-object v1, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    invoke-virtual {v1, v2}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->げつ〴ぬぐ(I)V

    iget-object v1, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    .line 3
    iput v0, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぺふねづ〺:F

    iput v0, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->てぜきぽく:F

    iput v0, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->のぷのちつ:F

    .line 4
    iput v0, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->づざかべべ:F

    .line 5
    iput v0, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->なぎぱいぢぎ:F

    .line 6
    iput v0, v1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぁごぐすすぃ:F

    .line 7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final 〺つふすそ(FFFF)V
    .registers 8

    iget-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ:Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;

    iget-object v1, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->びぐびあび:Landroid/content/res/Resources;

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float p2, p2, v1

    .line 1
    iput p2, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->〳ぜぞぜべっ:F

    iget-object v2, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->〺つふすそ:Landroid/graphics/Paint;

    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    mul-float p1, p1, v1

    .line 2
    iput p1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぉざぅち〻:F

    const/4 p1, 0x0

    .line 3
    invoke-virtual {v0, p1}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->げつ〴ぬぐ(I)V

    mul-float p3, p3, v1

    mul-float p4, p4, v1

    float-to-int p1, p3

    .line 4
    iput p1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ざとぅぼこ〺:I

    float-to-int p1, p4

    iput p1, v0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->は〲ぱなで:I

    return-void
.end method

.method public くし〴〺ぅ(I)V
    .registers 5

    if-nez p1, :cond_b

    const/high16 p1, 0x41300000    # 11.0f

    const/high16 v0, 0x40400000    # 3.0f

    const/high16 v1, 0x41400000    # 12.0f

    const/high16 v2, 0x40c00000    # 6.0f

    goto :goto_13

    :cond_b
    const/high16 p1, 0x40f00000    # 7.5f

    const/high16 v0, 0x40200000    # 2.5f

    const/high16 v1, 0x41200000    # 10.0f

    const/high16 v2, 0x40a00000    # 5.0f

    :goto_13
    invoke-virtual {p0, p1, v0, v1, v2}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->〺つふすそ(FFFF)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public げつ〴ぬぐ(FLづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;Z)V
    .registers 11

    iget-boolean v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->ぁごぐすすぃ:Z

    const v1, 0x3c23d70a    # 0.01f

    if-eqz v0, :cond_30

    .line 1
    invoke-virtual {p0, p1, p2}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->びぐびあび(FLづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;)V

    .line 2
    iget p3, p2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->のぷのちつ:F

    const v0, 0x3f4ccccd    # 0.8f

    div-float/2addr p3, v0

    float-to-double v2, p3

    .line 3
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    add-double/2addr v2, v4

    double-to-float p3, v2

    .line 4
    iget v0, p2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぺふねづ〺:F

    .line 5
    iget v2, p2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->てぜきぽく:F

    sub-float v1, v2, v1

    sub-float/2addr v1, v0

    mul-float v1, v1, p1

    add-float/2addr v1, v0

    .line 6
    iput v1, p2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->づざかべべ:F

    .line 7
    iput v2, p2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->なぎぱいぢぎ:F

    .line 8
    iget v0, p2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->のぷのちつ:F

    invoke-static {p3, v0, p1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(FFFF)F

    move-result p1

    .line 9
    iput p1, p2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぁごぐすすぃ:F

    goto :goto_7c

    :cond_30
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v2, p1, v0

    if-nez v2, :cond_38

    if-eqz p3, :cond_7c

    .line 10
    :cond_38
    iget p3, p2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->のぷのちつ:F

    const v2, 0x3f4a3d71    # 0.79f

    const/high16 v3, 0x3f000000    # 0.5f

    cmpg-float v4, p1, v3

    if-gez v4, :cond_52

    div-float v0, p1, v3

    .line 11
    iget v3, p2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぺふねづ〺:F

    .line 12
    sget-object v4, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->ぺぁあねじ:Landroid/view/animation/Interpolator;

    invoke-interface {v4, v0}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v0

    mul-float v0, v0, v2

    add-float/2addr v0, v1

    add-float/2addr v0, v3

    goto :goto_67

    :cond_52
    sub-float v4, p1, v3

    div-float/2addr v4, v3

    .line 13
    iget v3, p2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぺふねづ〺:F

    add-float/2addr v3, v2

    .line 14
    sget-object v5, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->ぺぁあねじ:Landroid/view/animation/Interpolator;

    invoke-interface {v5, v4}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v4

    sub-float/2addr v0, v4

    mul-float v0, v0, v2

    add-float/2addr v0, v1

    sub-float v0, v3, v0

    move v6, v3

    move v3, v0

    move v0, v6

    :goto_67
    const v1, 0x3e570a3c    # 0.20999998f

    mul-float v1, v1, p1

    add-float/2addr v1, p3

    const/high16 p3, 0x43580000    # 216.0f

    iget v2, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->なぎぱいぢぎ:F

    add-float/2addr p1, v2

    mul-float p1, p1, p3

    .line 15
    iput v3, p2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->づざかべべ:F

    .line 16
    iput v0, p2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->なぎぱいぢぎ:F

    .line 17
    iput v1, p2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぁごぐすすぃ:F

    .line 18
    iput p1, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび;->くし〴〺ぅ:F

    :cond_7c
    :goto_7c
    return-void
.end method

.method public びぐびあび(FLづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;)V
    .registers 11

    const/high16 v0, 0x3f400000    # 0.75f

    cmpl-float v1, p1, v0

    if-lez v1, :cond_55

    sub-float/2addr p1, v0

    const/high16 v0, 0x3e800000    # 0.25f

    div-float/2addr p1, v0

    .line 1
    iget-object v0, p2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぺぁあねじ:[I

    iget v1, p2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->いいにぽつ:I

    aget v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    .line 2
    array-length v3, v0

    rem-int/2addr v1, v3

    .line 3
    aget v0, v0, v1

    shr-int/lit8 v1, v2, 0x18

    and-int/lit16 v1, v1, 0xff

    shr-int/lit8 v3, v2, 0x10

    and-int/lit16 v3, v3, 0xff

    shr-int/lit8 v4, v2, 0x8

    and-int/lit16 v4, v4, 0xff

    and-int/lit16 v2, v2, 0xff

    shr-int/lit8 v5, v0, 0x18

    and-int/lit16 v5, v5, 0xff

    shr-int/lit8 v6, v0, 0x10

    and-int/lit16 v6, v6, 0xff

    shr-int/lit8 v7, v0, 0x8

    and-int/lit16 v7, v7, 0xff

    and-int/lit16 v0, v0, 0xff

    sub-int/2addr v5, v1

    int-to-float v5, v5

    mul-float v5, v5, p1

    float-to-int v5, v5

    add-int/2addr v1, v5

    shl-int/lit8 v1, v1, 0x18

    sub-int/2addr v6, v3

    int-to-float v5, v6

    mul-float v5, v5, p1

    float-to-int v5, v5

    add-int/2addr v3, v5

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v1, v3

    sub-int/2addr v7, v4

    int-to-float v3, v7

    mul-float v3, v3, p1

    float-to-int v3, v3

    add-int/2addr v4, v3

    shl-int/lit8 v3, v4, 0x8

    or-int/2addr v1, v3

    sub-int/2addr v0, v2

    int-to-float v0, v0

    mul-float p1, p1, v0

    float-to-int p1, p1

    add-int/2addr v2, p1

    or-int p1, v1, v2

    goto :goto_5b

    .line 4
    :cond_55
    iget-object p1, p2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ぺぁあねじ:[I

    iget v0, p2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->いいにぽつ:I

    aget p1, p1, v0

    .line 5
    :goto_5b
    iput p1, p2, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/びぐびあび$げつ〴ぬぐ;->ざっざへづ:I

    return-void
.end method
