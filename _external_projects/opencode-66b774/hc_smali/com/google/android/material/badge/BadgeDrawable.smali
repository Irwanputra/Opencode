.class public Lcom/google/android/material/badge/BadgeDrawable;
.super Landroid/graphics/drawable/Drawable;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ$〺つふすそ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/badge/BadgeDrawable$SavedState;
    }
.end annotation


# static fields
.field public static final ざとぅぼこ〺:I

.field public static final は〲ぱなで:I


# instance fields
.field public final 〳ぜぞぜべっ:F

.field public final 〺つふすそ:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final ぁごぐすすぃ:F

.field public いいにぽつ:F

.field public ぇぬぎばつ:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public ぉざぅち〻:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/ViewGroup;",
            ">;"
        }
    .end annotation
.end field

.field public おぐぴう〸ず:F

.field public final くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

.field public final づざかべべ:Landroid/graphics/Rect;

.field public てぜきぽく:I

.field public final なぎぱいぢぎ:F

.field public のぷのちつ:F

.field public final びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

.field public へぬ〴づぞ:F

.field public final ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

.field public ぺふねづ〺:F


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺふねづ〺;->Widget_MaterialComponents_Badge:I

    sput v0, Lcom/google/android/material/badge/BadgeDrawable;->ざとぅぼこ〺:I

    sget v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〺つふすそ;->badgeStyle:I

    sput v0, Lcom/google/android/material/badge/BadgeDrawable;->は〲ぱなで:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 6

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->〺つふすそ:Ljava/lang/ref/WeakReference;

    .line 1
    sget-object v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->〺つふすそ:[I

    const-string v2, "Theme.MaterialComponents"

    invoke-static {p1, v1, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/いいにぽつ;->くし〴〺ぅ(Landroid/content/Context;[ILjava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->づざかべべ:Landroid/graphics/Rect;

    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    invoke-direct {v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;-><init>()V

    iput-object v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->mtrl_badge_radius:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    int-to-float v2, v2

    iput v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->なぎぱいぢぎ:F

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->mtrl_badge_long_text_horizontal_padding:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    int-to-float v2, v2

    iput v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->〳ぜぞぜべっ:F

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->mtrl_badge_with_text_radius:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぁごぐすすぃ:F

    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    invoke-direct {v1, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ$〺つふすそ;)V

    iput-object v1, p0, Lcom/google/android/material/badge/BadgeDrawable;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    .line 3
    iget-object v2, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    .line 4
    sget-object v3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v2, v3}, Landroid/text/TextPaint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    new-instance v2, Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    invoke-direct {v2, p1}, Lcom/google/android/material/badge/BadgeDrawable$SavedState;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    sget p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぺふねづ〺;->TextAppearance_MaterialComponents_Badge:I

    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    if-nez v2, :cond_5e

    goto :goto_77

    :cond_5e
    new-instance v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;

    invoke-direct {v3, v2, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;-><init>(Landroid/content/Context;I)V

    .line 6
    iget-object p1, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->なぎぱいぢぎ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;

    if-ne p1, v3, :cond_68

    goto :goto_77

    .line 7
    :cond_68
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    if-nez p1, :cond_71

    goto :goto_77

    :cond_71
    invoke-virtual {v1, v3, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->〺つふすそ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/〺つふすそ;Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/google/android/material/badge/BadgeDrawable;->ぺふねづ〺()V

    :goto_77
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .registers 7

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4a

    .line 1
    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 2
    iget v0, v0, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->びぐびあび:I

    if-eqz v0, :cond_4a

    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_17

    goto :goto_4a

    :cond_17
    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Lcom/google/android/material/badge/BadgeDrawable;->づざかべべ()Z

    move-result v0

    if-eqz v0, :cond_4a

    .line 4
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/material/badge/BadgeDrawable;->〺つふすそ()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    .line 5
    iget-object v2, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    const/4 v3, 0x0

    .line 6
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v2, v1, v3, v4, v0}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    iget v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->いいにぽつ:F

    iget v3, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺふねづ〺:F

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    add-float/2addr v3, v0

    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    .line 7
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    .line 8
    invoke-virtual {p1, v1, v2, v3, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_4a
    :goto_4a
    return-void
.end method

.method public getAlpha()I
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 1
    iget v0, v0, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->びぐびあび:I

    return v0
.end method

.method public getIntrinsicHeight()I
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->づざかべべ:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    return v0
.end method

.method public getIntrinsicWidth()I
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->づざかべべ:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    return v0
.end method

.method public getOpacity()I
    .registers 2

    const/4 v0, -0x3

    return v0
.end method

.method public isStateful()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public onStateChange([I)Z
    .registers 2

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onStateChange([I)Z

    move-result p1

    return p1
.end method

.method public setAlpha(I)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 1
    iput p1, v0, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->びぐびあび:I

    .line 2
    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    .line 3
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    .line 4
    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setAlpha(I)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .registers 2

    return-void
.end method

.method public 〳ぜぞぜべっ(I)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 1
    iput p1, v0, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->くし〴〺ぅ:I

    .line 2
    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    .line 3
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    .line 4
    invoke-virtual {v0}, Landroid/text/TextPaint;->getColor()I

    move-result v0

    if-eq v0, p1, :cond_18

    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    .line 5
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/text/TextPaint;

    .line 6
    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setColor(I)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_18
    return-void
.end method

.method public final 〺つふすそ()Ljava/lang/String;
    .registers 6

    invoke-virtual {p0}, Lcom/google/android/material/badge/BadgeDrawable;->びぐびあび()I

    move-result v0

    iget v1, p0, Lcom/google/android/material/badge/BadgeDrawable;->てぜきぽく:I

    if-gt v0, v1, :cond_11

    invoke-virtual {p0}, Lcom/google/android/material/badge/BadgeDrawable;->びぐびあび()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_11
    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->〺つふすそ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_1e

    const-string v0, ""

    return-object v0

    :cond_1e
    sget v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/いいにぽつ;->mtrl_exceed_max_badge_number_suffix:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget v4, p0, Lcom/google/android/material/badge/BadgeDrawable;->てぜきぽく:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-string v4, "+"

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ぁごぐすすぃ(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 1
    iget v1, v0, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->いいにぽつ:I

    if-eq v1, p1, :cond_3a

    .line 2
    iput p1, v0, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->いいにぽつ:I

    .line 3
    iget-object p1, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぇぬぎばつ:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_3a

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3a

    iget-object p1, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぇぬぎばつ:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぉざぅち〻:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_25

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    goto :goto_26

    :cond_25
    const/4 v0, 0x0

    .line 4
    :goto_26
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぇぬぎばつ:Ljava/lang/ref/WeakReference;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぉざぅち〻:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Lcom/google/android/material/badge/BadgeDrawable;->ぺふねづ〺()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_3a
    return-void
.end method

.method public いいにぽつ(I)V
    .registers 4

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 1
    iget v1, v0, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->づざかべべ:I

    if-eq v1, p1, :cond_18

    .line 2
    iput p1, v0, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->づざかべべ:I

    .line 3
    iget-object p1, p0, Lcom/google/android/material/badge/BadgeDrawable;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->びぐびあび:Z

    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/badge/BadgeDrawable;->ぺふねづ〺()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_18
    return-void
.end method

.method public くし〴〺ぅ()Ljava/lang/CharSequence;
    .registers 7

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    return-object v1

    :cond_8
    invoke-virtual {p0}, Lcom/google/android/material/badge/BadgeDrawable;->づざかべべ()Z

    move-result v0

    if-eqz v0, :cond_58

    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 1
    iget v0, v0, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->〳ぜぞぜべっ:I

    if-lez v0, :cond_57

    .line 2
    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->〺つふすそ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_1f

    return-object v1

    :cond_1f
    invoke-virtual {p0}, Lcom/google/android/material/badge/BadgeDrawable;->びぐびあび()I

    move-result v1

    iget v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->てぜきぽく:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-gt v1, v2, :cond_46

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 3
    iget v1, v1, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->〳ぜぞぜべっ:I

    .line 4
    invoke-virtual {p0}, Lcom/google/android/material/badge/BadgeDrawable;->びぐびあび()I

    move-result v2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/material/badge/BadgeDrawable;->びぐびあび()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v3

    invoke-virtual {v0, v1, v2, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_46
    iget-object v1, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 5
    iget v1, v1, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->ぺぁあねじ:I

    new-array v4, v4, [Ljava/lang/Object;

    .line 6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v3

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_57
    return-object v1

    :cond_58
    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 7
    iget-object v0, v0, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->ぁごぐすすぃ:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public げつ〴ぬぐ()V
    .registers 1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public づざかべべ()Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 1
    iget v0, v0, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->づざかべべ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_9

    const/4 v0, 0x1

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return v0
.end method

.method public なぎぱいぢぎ(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 1
    iput p1, v0, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->〺つふすそ:I

    .line 2
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    .line 3
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;

    iget-object v1, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->びぐびあび:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_16

    .line 4
    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ごづごきえ(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_16
    return-void
.end method

.method public びぐびあび()I
    .registers 2

    invoke-virtual {p0}, Lcom/google/android/material/badge/BadgeDrawable;->づざかべべ()Z

    move-result v0

    if-nez v0, :cond_8

    const/4 v0, 0x0

    return v0

    :cond_8
    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 1
    iget v0, v0, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->づざかべべ:I

    return v0
.end method

.method public ぺぁあねじ(I)V
    .registers 6

    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 1
    iget v1, v0, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->なぎぱいぢぎ:I

    if-eq v1, p1, :cond_28

    .line 2
    iput p1, v0, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->なぎぱいぢぎ:I

    int-to-double v0, p1

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 3
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v0, v2

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-int p1, v0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/android/material/badge/BadgeDrawable;->てぜきぽく:I

    .line 4
    iget-object p1, p0, Lcom/google/android/material/badge/BadgeDrawable;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->びぐびあび:Z

    .line 6
    invoke-virtual {p0}, Lcom/google/android/material/badge/BadgeDrawable;->ぺふねづ〺()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_28
    return-void
.end method

.method public final ぺふねづ〺()V
    .registers 9

    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->〺つふすそ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぇぬぎばつ:Ljava/lang/ref/WeakReference;

    const/4 v2, 0x0

    if-eqz v1, :cond_14

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    goto :goto_15

    :cond_14
    move-object v1, v2

    :goto_15
    if-eqz v0, :cond_117

    if-nez v1, :cond_1b

    goto/16 :goto_117

    :cond_1b
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iget-object v4, p0, Lcom/google/android/material/badge/BadgeDrawable;->づざかべべ:Landroid/graphics/Rect;

    invoke-virtual {v3, v4}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v1, v4}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    iget-object v5, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぉざぅち〻:Ljava/lang/ref/WeakReference;

    if-eqz v5, :cond_37

    invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    :cond_37
    if-nez v2, :cond_3d

    sget-boolean v5, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おぐぴう〸ず/げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-eqz v5, :cond_48

    :cond_3d
    if-nez v2, :cond_45

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    :cond_45
    invoke-virtual {v2, v1, v4}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1
    :cond_48
    iget-object v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 2
    iget v5, v2, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->いいにぽつ:I

    const v6, 0x800053

    if-eq v5, v6, :cond_5c

    const v7, 0x800055

    if-eq v5, v7, :cond_5c

    .line 3
    iget v5, v4, Landroid/graphics/Rect;->top:I

    .line 4
    iget v2, v2, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->てぜきぽく:I

    add-int/2addr v5, v2

    goto :goto_61

    .line 5
    :cond_5c
    iget v5, v4, Landroid/graphics/Rect;->bottom:I

    .line 6
    iget v2, v2, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->てぜきぽく:I

    sub-int/2addr v5, v2

    :goto_61
    int-to-float v2, v5

    .line 7
    iput v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺふねづ〺:F

    invoke-virtual {p0}, Lcom/google/android/material/badge/BadgeDrawable;->びぐびあび()I

    move-result v2

    const/16 v5, 0x9

    if-gt v2, v5, :cond_7c

    invoke-virtual {p0}, Lcom/google/android/material/badge/BadgeDrawable;->づざかべべ()Z

    move-result v2

    if-nez v2, :cond_75

    iget v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->なぎぱいぢぎ:F

    goto :goto_77

    :cond_75
    iget v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぁごぐすすぃ:F

    :goto_77
    iput v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->のぷのちつ:F

    iput v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->おぐぴう〸ず:F

    goto :goto_92

    :cond_7c
    iget v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぁごぐすすぃ:F

    iput v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->のぷのちつ:F

    iput v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->おぐぴう〸ず:F

    invoke-virtual {p0}, Lcom/google/android/material/badge/BadgeDrawable;->〺つふすそ()Ljava/lang/String;

    move-result-object v2

    iget-object v5, p0, Lcom/google/android/material/badge/BadgeDrawable;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;

    invoke-virtual {v5, v2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/〳ぜぞぜべっ;->げつ〴ぬぐ(Ljava/lang/String;)F

    move-result v2

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v2, v5

    iget v5, p0, Lcom/google/android/material/badge/BadgeDrawable;->〳ぜぞぜべっ:F

    add-float/2addr v2, v5

    :goto_92
    iput v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->へぬ〴づぞ:F

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/material/badge/BadgeDrawable;->づざかべべ()Z

    move-result v2

    if-eqz v2, :cond_a1

    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->mtrl_badge_text_horizontal_edge_offset:I

    goto :goto_a3

    :cond_a1
    sget v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->mtrl_badge_horizontal_edge_offset:I

    :goto_a3
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iget-object v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 8
    iget v2, v2, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->いいにぽつ:I

    const v5, 0x800033

    if-eq v2, v5, :cond_b9

    if-eq v2, v6, :cond_b9

    .line 9
    invoke-static {v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v1

    if-nez v1, :cond_bf

    goto :goto_ce

    :cond_b9
    invoke-static {v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v1

    if-nez v1, :cond_ce

    :cond_bf
    iget v1, v4, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->へぬ〴づぞ:F

    sub-float/2addr v1, v2

    int-to-float v0, v0

    add-float/2addr v1, v0

    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 10
    iget v0, v0, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->ぺふねづ〺:I

    int-to-float v0, v0

    add-float/2addr v1, v0

    goto :goto_dc

    .line 11
    :cond_ce
    :goto_ce
    iget v1, v4, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    iget v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->へぬ〴づぞ:F

    add-float/2addr v1, v2

    int-to-float v0, v0

    sub-float/2addr v1, v0

    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺぁあねじ:Lcom/google/android/material/badge/BadgeDrawable$SavedState;

    .line 12
    iget v0, v0, Lcom/google/android/material/badge/BadgeDrawable$SavedState;->ぺふねづ〺:I

    int-to-float v0, v0

    sub-float/2addr v1, v0

    .line 13
    :goto_dc
    iput v1, p0, Lcom/google/android/material/badge/BadgeDrawable;->いいにぽつ:F

    .line 14
    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->づざかべべ:Landroid/graphics/Rect;

    iget v2, p0, Lcom/google/android/material/badge/BadgeDrawable;->ぺふねづ〺:F

    iget v4, p0, Lcom/google/android/material/badge/BadgeDrawable;->へぬ〴づぞ:F

    iget v5, p0, Lcom/google/android/material/badge/BadgeDrawable;->おぐぴう〸ず:F

    .line 15
    sget-boolean v6, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おぐぴう〸ず/げつ〴ぬぐ;->げつ〴ぬぐ:Z

    sub-float v6, v1, v4

    float-to-int v6, v6

    sub-float v7, v2, v5

    float-to-int v7, v7

    add-float/2addr v1, v4

    float-to-int v1, v1

    add-float/2addr v2, v5

    float-to-int v2, v2

    invoke-virtual {v0, v6, v7, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 16
    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    iget v1, p0, Lcom/google/android/material/badge/BadgeDrawable;->のぷのちつ:F

    .line 17
    iget-object v2, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;

    iget-object v2, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    invoke-virtual {v2, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;->づざかべべ(F)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    move-result-object v1

    .line 18
    iget-object v2, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;

    iput-object v1, v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ$〺つふすそ;->げつ〴ぬぐ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->invalidateSelf()V

    .line 19
    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->づざかべべ:Landroid/graphics/Rect;

    invoke-virtual {v3, v0}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_117

    iget-object v0, p0, Lcom/google/android/material/badge/BadgeDrawable;->くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    iget-object v1, p0, Lcom/google/android/material/badge/BadgeDrawable;->づざかべべ:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    :cond_117
    :goto_117
    return-void
.end method
