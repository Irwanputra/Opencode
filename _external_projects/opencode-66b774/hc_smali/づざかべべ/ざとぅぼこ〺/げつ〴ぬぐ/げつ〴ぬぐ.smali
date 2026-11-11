.class public Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;
.super Landroid/widget/ImageView;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〺つふすそ:Landroid/view/animation/Animation$AnimationListener;

.field public くし〴〺ぅ:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .registers 9

    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v0, 0x3fe00000    # 1.75f

    mul-float v0, v0, p1

    float-to-int v0, v0

    const/4 v1, 0x0

    mul-float v1, v1, p1

    float-to-int v1, v1

    const/high16 v2, 0x40600000    # 3.5f

    mul-float v2, v2, p1

    float-to-int v2, v2

    iput v2, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:I

    .line 1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v3, 0x1

    const/16 v4, 0x15

    if-lt v2, v4, :cond_2a

    const/4 v4, 0x1

    goto :goto_2b

    :cond_2a
    const/4 v4, 0x0

    :goto_2b
    if-eqz v4, :cond_3f

    .line 2
    new-instance v0, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v1, Landroid/graphics/drawable/shapes/OvalShape;

    invoke-direct {v1}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    const/high16 v1, 0x40800000    # 4.0f

    mul-float p1, p1, v1

    invoke-static {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ながふずは(Landroid/view/View;F)V

    goto :goto_66

    :cond_3f
    new-instance p1, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    iget v4, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-direct {p1, p0, v4}, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;I)V

    new-instance v4, Landroid/graphics/drawable/ShapeDrawable;

    invoke-direct {v4, p1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    invoke-virtual {v4}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object p1

    invoke-virtual {p0, v3, p1}, Landroid/widget/ImageView;->setLayerType(ILandroid/graphics/Paint;)V

    invoke-virtual {v4}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object p1

    iget v3, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:I

    int-to-float v3, v3

    int-to-float v1, v1

    int-to-float v0, v0

    const/high16 v5, 0x1e000000

    invoke-virtual {p1, v3, v1, v0, v5}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    iget p1, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {p0, p1, p1, p1, p1}, Landroid/widget/ImageView;->setPadding(IIII)V

    move-object v0, v4

    :goto_66
    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    sget-object p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    const/16 p1, 0x10

    if-lt v2, p1, :cond_77

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_7a

    :cond_77
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_7a
    return-void
.end method


# virtual methods
.method public onAnimationEnd()V
    .registers 3

    invoke-super {p0}, Landroid/widget/ImageView;->onAnimationEnd()V

    iget-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Landroid/view/animation/Animation$AnimationListener;

    if-eqz v0, :cond_e

    invoke-virtual {p0}, Landroid/widget/ImageView;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/view/animation/Animation$AnimationListener;->onAnimationEnd(Landroid/view/animation/Animation;)V

    :cond_e
    return-void
.end method

.method public onAnimationStart()V
    .registers 3

    invoke-super {p0}, Landroid/widget/ImageView;->onAnimationStart()V

    iget-object v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Landroid/view/animation/Animation$AnimationListener;

    if-eqz v0, :cond_e

    invoke-virtual {p0}, Landroid/widget/ImageView;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/view/animation/Animation$AnimationListener;->onAnimationStart(Landroid/view/animation/Animation;)V

    :cond_e
    return-void
.end method

.method public onMeasure(II)V
    .registers 4

    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V

    .line 1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x15

    if-lt p1, p2, :cond_b

    const/4 p1, 0x1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    :goto_c
    if-nez p1, :cond_23

    .line 2
    invoke-virtual {p0}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result p1

    iget p2, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:I

    mul-int/lit8 p2, p2, 0x2

    add-int/2addr p2, p1

    invoke-virtual {p0}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result p1

    iget v0, p0, Lづざかべべ/ざとぅぼこ〺/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:I

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr v0, p1

    invoke-virtual {p0, p2, v0}, Landroid/widget/ImageView;->setMeasuredDimension(II)V

    :cond_23
    return-void
.end method

.method public setBackgroundColor(I)V
    .registers 3

    invoke-virtual {p0}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Landroid/graphics/drawable/ShapeDrawable;

    if-eqz v0, :cond_15

    invoke-virtual {p0}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_15
    return-void
.end method
