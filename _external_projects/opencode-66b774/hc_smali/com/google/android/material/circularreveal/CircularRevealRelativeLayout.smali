.class public Lcom/google/android/material/circularreveal/CircularRevealRelativeLayout;
.super Landroid/widget/RelativeLayout;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ;


# instance fields
.field public final 〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/material/circularreveal/CircularRevealRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;

    invoke-direct {p1, p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ$げつ〴ぬぐ;)V

    iput-object p1, p0, Lcom/google/android/material/circularreveal/CircularRevealRelativeLayout;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/circularreveal/CircularRevealRelativeLayout;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;

    if-eqz v0, :cond_8

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->くし〴〺ぅ(Landroid/graphics/Canvas;)V

    goto :goto_b

    :cond_8
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->draw(Landroid/graphics/Canvas;)V

    :goto_b
    return-void
.end method

.method public getCircularRevealOverlayDrawable()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/circularreveal/CircularRevealRelativeLayout;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getCircularRevealScrimColor()I
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/circularreveal/CircularRevealRelativeLayout;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->びぐびあび()I

    move-result v0

    return v0
.end method

.method public getRevealInfo()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/circularreveal/CircularRevealRelativeLayout;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->なぎぱいぢぎ()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;

    move-result-object v0

    return-object v0
.end method

.method public isOpaque()Z
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/circularreveal/CircularRevealRelativeLayout;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->ぁごぐすすぃ()Z

    move-result v0

    return v0

    :cond_9
    invoke-super {p0}, Landroid/widget/RelativeLayout;->isOpaque()Z

    move-result v0

    return v0
.end method

.method public setCircularRevealOverlayDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/circularreveal/CircularRevealRelativeLayout;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;

    .line 1
    iput-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->ぁごぐすすぃ:Landroid/graphics/drawable/Drawable;

    iget-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setCircularRevealScrimColor(I)V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/circularreveal/CircularRevealRelativeLayout;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->づざかべべ:Landroid/graphics/Paint;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setRevealInfo(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;)V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/circularreveal/CircularRevealRelativeLayout;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;

    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〳ぜぞぜべっ(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/くし〴〺ぅ$づざかべべ;)V

    return-void
.end method

.method public 〺つふすそ(Landroid/graphics/Canvas;)V
    .registers 2

    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public くし〴〺ぅ()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/circularreveal/CircularRevealRelativeLayout;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->げつ〴ぬぐ()V

    return-void
.end method

.method public げつ〴ぬぐ()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/material/circularreveal/CircularRevealRelativeLayout;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぶでにく〼〳/〺つふすそ;->〺つふすそ()V

    return-void
.end method

.method public びぐびあび()Z
    .registers 2

    invoke-super {p0}, Landroid/widget/RelativeLayout;->isOpaque()Z

    move-result v0

    return v0
.end method
