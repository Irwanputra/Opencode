.class public Lづざかべべ/は〲ぱなで/なぶひせが;
.super Lづざかべべ/は〲ぱなで/ぉひのべい;
.source ""

# interfaces
.implements Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Lづざかべべ/は〲ぱなで/ぉひのべい;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/ぉひのべい;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;

    .line 1
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    invoke-virtual {v0}, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->げつ〴ぬぐ()V

    return-void
.end method

.method public げつ〴ぬぐ(Landroid/view/View;)V
    .registers 8

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/ぉひのべい;->げつ〴ぬぐ:Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;

    .line 1
    iget-boolean v1, v0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    if-nez v1, :cond_53

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_4f

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iget-object v2, v0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->〺つふすそ:Landroid/view/ViewGroup;

    if-eq v1, v2, :cond_43

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_43

    invoke-static {v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->でどあくず(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_43

    const/4 v2, 0x2

    new-array v3, v2, [I

    new-array v2, v2, [I

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    iget-object v4, v0, Lづざかべべ/は〲ぱなで/ぉひのべい$げつ〴ぬぐ;->〺つふすそ:Landroid/view/ViewGroup;

    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    const/4 v4, 0x0

    aget v5, v3, v4

    aget v4, v2, v4

    sub-int/2addr v5, v4

    invoke-static {p1, v5}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぇ〳〲〺すっ(Landroid/view/View;I)V

    const/4 v4, 0x1

    aget v3, v3, v4

    aget v2, v2, v4

    sub-int/2addr v3, v2

    invoke-static {p1, v3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->びえぁぜい(Landroid/view/View;I)V

    :cond_43
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_4f

    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_4f
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    .line 3
    :cond_53
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
