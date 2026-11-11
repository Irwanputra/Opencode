.class public abstract Lづざかべべ/ぇぬぎばつ/びぐびあび/ぉ〲なぱぽた;
.super Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;
.source ""


# instance fields
.field public ぁごぐすすぃ:Z


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぉ〲なぱぽた;->ぁごぐすすぃ:Z

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;)Z
    .registers 14

    iget v3, p3, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;->げつ〴ぬぐ:I

    iget v4, p3, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;->〺つふすそ:I

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ざっざへづ()Z

    move-result v0

    if-eqz v0, :cond_11

    iget p4, p3, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;->げつ〴ぬぐ:I

    iget p3, p3, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;->〺つふすそ:I

    move v6, p3

    move v5, p4

    goto :goto_17

    :cond_11
    iget p3, p4, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;->げつ〴ぬぐ:I

    iget p4, p4, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;->〺つふすそ:I

    move v5, p3

    move v6, p4

    :goto_17
    move-object v0, p0

    check-cast v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    if-ne p1, p2, :cond_26

    move-object v1, p1

    move v2, v3

    move v3, v4

    move v4, v5

    move v5, v6

    .line 1
    invoke-virtual/range {v0 .. v5}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->ぺぁあねじ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;IIII)Z

    move-result p1

    goto :goto_79

    :cond_26
    iget-object p3, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getTranslationX()F

    move-result p3

    iget-object p4, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {p4}, Landroid/view/View;->getTranslationY()F

    move-result p4

    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    move-result v1

    invoke-virtual {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->へぬ〴づぞ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    sub-int v2, v5, v3

    int-to-float v2, v2

    sub-float/2addr v2, p3

    float-to-int v2, v2

    sub-int v7, v6, v4

    int-to-float v7, v7

    sub-float/2addr v7, p4

    float-to-int v7, v7

    iget-object v8, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v8, p3}, Landroid/view/View;->setTranslationX(F)V

    iget-object p3, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {p3, p4}, Landroid/view/View;->setTranslationY(F)V

    iget-object p3, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {p3, v1}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v0, p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->へぬ〴づぞ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    neg-int p4, v2

    int-to-float p4, p4

    invoke-virtual {p3, p4}, Landroid/view/View;->setTranslationX(F)V

    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    neg-int p4, v7

    int-to-float p4, p4

    invoke-virtual {p3, p4}, Landroid/view/View;->setTranslationY(F)V

    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    const/4 p4, 0x0

    invoke-virtual {p3, p4}, Landroid/view/View;->setAlpha(F)V

    iget-object p3, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->ぺふねづ〺:Ljava/util/ArrayList;

    new-instance p4, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;-><init>(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;IIII)V

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    :goto_79
    return p1
.end method

.method public abstract ぺぁあねじ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;IIII)Z
.end method
