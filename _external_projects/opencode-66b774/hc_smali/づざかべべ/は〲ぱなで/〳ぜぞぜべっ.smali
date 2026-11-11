.class public Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;
.super Landroid/widget/FrameLayout;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# static fields
.field public static final synthetic びぐびあび:I


# instance fields
.field public 〺つふすそ:Landroid/view/ViewGroup;

.field public くし〴〺ぅ:Z


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .registers 3

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setClipChildren(Z)V

    iput-object p1, p0, Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;->〺つふすそ:Landroid/view/ViewGroup;

    sget v0, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->ghost_view_holder:I

    invoke-virtual {p1, v0, p0}, Landroid/view/ViewGroup;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;->〺つふすそ:Landroid/view/ViewGroup;

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/じぜこほぱ;->げつ〴ぬぐ(Landroid/view/ViewGroup;)Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;

    move-result-object p1

    invoke-interface {p1, p0}, Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;->げつ〴ぬぐ(Landroid/view/View;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;->くし〴〺ぅ:Z

    return-void
.end method

.method public static げつ〴ぬぐ(Landroid/view/View;Ljava/util/ArrayList;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_d

    check-cast v0, Landroid/view/View;

    invoke-static {v0, p1}, Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;->げつ〴ぬぐ(Landroid/view/View;Ljava/util/ArrayList;)V

    :cond_d
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public onViewAdded(Landroid/view/View;)V
    .registers 3

    iget-boolean v0, p0, Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;->くし〴〺ぅ:Z

    if-eqz v0, :cond_8

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onViewAdded(Landroid/view/View;)V

    return-void

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This GhostViewHolder is detached!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .registers 5

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onViewRemoved(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_11

    invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eq v0, p1, :cond_17

    :cond_11
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result p1

    if-nez p1, :cond_2a

    :cond_17
    iget-object p1, p0, Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;->〺つふすそ:Landroid/view/ViewGroup;

    sget v0, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->ghost_view_holder:I

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2}, Landroid/view/ViewGroup;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;->〺つふすそ:Landroid/view/ViewGroup;

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/じぜこほぱ;->げつ〴ぬぐ(Landroid/view/ViewGroup;)Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;

    move-result-object p1

    invoke-interface {p1, p0}, Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;->〺つふすそ(Landroid/view/View;)V

    iput-boolean v1, p0, Lづざかべべ/は〲ぱなで/〳ぜぞぜべっ;->くし〴〺ぅ:Z

    :cond_2a
    return-void
.end method
