.class public Landroidx/recyclerview/widget/RecyclerView$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが$〺つふすそ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;)V
    .registers 12

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->てぜきぽく(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    .line 1
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ごづごきえ(Z)V

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->〺でおいここ:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;

    move-object v2, v1

    check-cast v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぉ〲なぱぽた;

    .line 2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v4, p2, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;->げつ〴ぬぐ:I

    iget v5, p2, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;->〺つふすそ:I

    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    if-nez p3, :cond_25

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v1

    goto :goto_27

    :cond_25
    iget v1, p3, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;->げつ〴ぬぐ:I

    :goto_27
    move v6, v1

    if-nez p3, :cond_2f

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p3

    goto :goto_31

    :cond_2f
    iget p3, p3, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;->〺つふすそ:I

    :goto_31
    move v7, p3

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ()Z

    move-result p3

    if-nez p3, :cond_4f

    if-ne v4, v6, :cond_3c

    if-eq v5, v7, :cond_4f

    :cond_3c
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result p3

    add-int/2addr p3, v6

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v1

    add-int/2addr v1, v7

    invoke-virtual {p2, v6, v7, p3, v1}, Landroid/view/View;->layout(IIII)V

    move-object v3, p1

    invoke-virtual/range {v2 .. v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぉ〲なぱぽた;->ぺぁあねじ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;IIII)Z

    move-result p1

    goto :goto_5a

    :cond_4f
    check-cast v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    .line 3
    invoke-virtual {v2, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->へぬ〴づぞ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    iget-object p2, v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->〳ぜぞぜべっ:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    :goto_5a
    if-eqz p1, :cond_5f

    .line 4
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->〱こか〺ぃせ()V

    :cond_5f
    return-void
.end method

.method public げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;)V
    .registers 12

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ごづごきえ(Z)V

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->〺でおいここ:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;

    move-object v2, v1

    check-cast v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぉ〲なぱぽた;

    .line 2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_29

    iget v4, p2, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;->げつ〴ぬぐ:I

    iget v6, p3, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;->げつ〴ぬぐ:I

    if-ne v4, v6, :cond_1f

    iget v1, p2, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;->〺つふすそ:I

    iget v3, p3, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;->〺つふすそ:I

    if-eq v1, v3, :cond_29

    :cond_1f
    iget v5, p2, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;->〺つふすそ:I

    iget v7, p3, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;->〺つふすそ:I

    move-object v3, p1

    invoke-virtual/range {v2 .. v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぉ〲なぱぽた;->ぺぁあねじ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;IIII)Z

    move-result p1

    goto :goto_3a

    :cond_29
    check-cast v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    .line 3
    invoke-virtual {v2, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->へぬ〴づぞ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Landroid/view/View;->setAlpha(F)V

    iget-object p2, v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->ぺぁあねじ:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    :goto_3a
    if-eqz p1, :cond_3f

    .line 4
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->〱こか〺ぃせ()V

    :cond_3f
    return-void
.end method
