.class public Lづざかべべ/は〲ぱなで/いいにぽつ;
.super Landroid/view/ViewGroup;
.source ""

# interfaces
.implements Lづざかべべ/は〲ぱなで/ぁごぐすすぃ;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# static fields
.field public static final synthetic 〳ぜぞぜべっ:I


# instance fields
.field public 〺つふすそ:Landroid/view/ViewGroup;

.field public final ぁごぐすすぃ:Landroid/view/ViewTreeObserver$OnPreDrawListener;

.field public くし〴〺ぅ:Landroid/view/View;

.field public づざかべべ:I

.field public なぎぱいぢぎ:Landroid/graphics/Matrix;

.field public final びぐびあび:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .registers 3

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    new-instance v0, Lづざかべべ/は〲ぱなで/いいにぽつ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lづざかべべ/は〲ぱなで/いいにぽつ$げつ〴ぬぐ;-><init>(Lづざかべべ/は〲ぱなで/いいにぽつ;)V

    iput-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->ぁごぐすすぃ:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    iput-object p1, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->びぐびあび:Landroid/view/View;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V

    const/4 p1, 0x2

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->setLayerType(ILandroid/graphics/Paint;)V

    return-void
.end method

.method public static 〺つふすそ(Landroid/view/View;Landroid/view/View;)V
    .registers 6

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    add-int/2addr p0, v2

    invoke-static {p1, v0, v1, v3, p0}, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->くし〴〺ぅ(Landroid/view/View;IIII)V

    return-void
.end method

.method public static くし〴〺ぅ(Landroid/view/View;)Lづざかべべ/は〲ぱなで/いいにぽつ;
    .registers 2

    sget v0, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->ghost_view:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lづざかべべ/は〲ぱなで/いいにぽつ;

    return-object p0
.end method


# virtual methods
.method public onAttachedToWindow()V
    .registers 4

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->びぐびあび:Landroid/view/View;

    .line 1
    sget v1, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->ghost_view:I

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->びぐびあび:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->ぁごぐすすぃ:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->びぐびあび:Landroid/view/View;

    .line 3
    sget-object v1, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;

    const/4 v2, 0x4

    invoke-virtual {v1, v0, v2}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->ぁごぐすすぃ(Landroid/view/View;I)V

    .line 4
    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->びぐびあび:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_30

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->びぐびあび:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_30
    return-void
.end method

.method public onDetachedFromWindow()V
    .registers 4

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->びぐびあび:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->ぁごぐすすぃ:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->びぐびあび:Landroid/view/View;

    .line 1
    sget-object v1, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->ぁごぐすすぃ(Landroid/view/View;I)V

    .line 2
    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->びぐびあび:Landroid/view/View;

    .line 3
    sget v1, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->ghost_view:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 4
    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->びぐびあび:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_2e

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->びぐびあび:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_2e
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 7

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lづざかべべ/は〲ぱなで/〺つふすそ;->は〲ぱなで(Landroid/graphics/Canvas;Z)V

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->なぎぱいぢぎ:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->びぐびあび:Landroid/view/View;

    .line 1
    sget-object v1, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->ぁごぐすすぃ(Landroid/view/View;I)V

    .line 2
    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->びぐびあび:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->びぐびあび:Landroid/view/View;

    const/4 v3, 0x4

    .line 3
    invoke-virtual {v1, v0, v3}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->ぁごぐすすぃ(Landroid/view/View;I)V

    .line 4
    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->びぐびあび:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getDrawingTime()J

    move-result-wide v3

    invoke-virtual {p0, p1, v0, v3, v4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    invoke-static {p1, v2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->は〲ぱなで(Landroid/graphics/Canvas;Z)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .registers 6

    return-void
.end method

.method public setVisibility(I)V
    .registers 4

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->びぐびあび:Landroid/view/View;

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/いいにぽつ;->くし〴〺ぅ(Landroid/view/View;)Lづざかべべ/は〲ぱなで/いいにぽつ;

    move-result-object v0

    if-ne v0, p0, :cond_17

    if-nez p1, :cond_f

    const/4 p1, 0x4

    goto :goto_10

    :cond_f
    const/4 p1, 0x0

    :goto_10
    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->びぐびあび:Landroid/view/View;

    .line 1
    sget-object v1, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/げがぴうあだ;

    invoke-virtual {v1, v0, p1}, Lづざかべべ/は〲ぱなで/げがぴうあだ;->ぁごぐすすぃ(Landroid/view/View;I)V

    :cond_17
    return-void
.end method

.method public げつ〴ぬぐ(Landroid/view/ViewGroup;Landroid/view/View;)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->〺つふすそ:Landroid/view/ViewGroup;

    iput-object p2, p0, Lづざかべべ/は〲ぱなで/いいにぽつ;->くし〴〺ぅ:Landroid/view/View;

    return-void
.end method
