.class public abstract Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;
.super Landroidx/recyclerview/widget/RecyclerView$へぬ〴づぞ;
.source ""


# instance fields
.field public 〺つふすそ:Landroid/widget/Scroller;

.field public final くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ぇぬぎばつ;

.field public げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$へぬ〴づぞ;-><init>()V

    new-instance v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ$げつ〴ぬぐ;-><init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;)V

    iput-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ぇぬぎばつ;

    return-void
.end method


# virtual methods
.method public abstract 〺つふすそ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;Landroid/view/View;)[I
.end method

.method public くし〴〺ぅ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    instance-of p1, p1, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$〺つふすそ;

    if-nez p1, :cond_6

    const/4 p1, 0x0

    return-object p1

    :cond_6
    new-instance p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ$〺つふすそ;

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ$〺つふすそ;-><init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;Landroid/content/Context;)V

    return-object p1
.end method

.method public げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    if-ne v0, p1, :cond_5

    return-void

    :cond_5
    if-eqz v0, :cond_16

    .line 1
    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ぇぬぎばつ;

    .line 2
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->〱かけばぜぐ:Ljava/util/List;

    if-eqz v0, :cond_10

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 3
    :cond_10
    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(Landroidx/recyclerview/widget/RecyclerView$へぬ〴づぞ;)V

    .line 4
    :cond_16
    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_4a

    .line 5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getOnFlingListener()Landroidx/recyclerview/widget/RecyclerView$へぬ〴づぞ;

    move-result-object p1

    if-nez p1, :cond_42

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ぇぬぎばつ;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->〳ぜぞぜべっ(Landroidx/recyclerview/widget/RecyclerView$ぇぬぎばつ;)V

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(Landroidx/recyclerview/widget/RecyclerView$へぬ〴づぞ;)V

    .line 6
    new-instance p1, Landroid/widget/Scroller;

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-direct {p1, v0, v1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->〺つふすそ:Landroid/widget/Scroller;

    invoke-virtual {p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->なぎぱいぢぎ()V

    goto :goto_4a

    .line 7
    :cond_42
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "An instance of OnFlingListener already set."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4a
    :goto_4a
    return-void
.end method

.method public abstract づざかべべ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;II)I
.end method

.method public なぎぱいぢぎ()V
    .registers 11

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_5

    return-void

    :cond_5
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    move-result-object v0

    if-nez v0, :cond_c

    return-void

    :cond_c
    invoke-virtual {p0, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->びぐびあび(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_13

    return-void

    :cond_13
    invoke-virtual {p0, v0, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->〺つふすそ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;Landroid/view/View;)[I

    move-result-object v0

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v3, 0x1

    if-nez v2, :cond_21

    aget v2, v0, v3

    if-eqz v2, :cond_2e

    :cond_21
    iget-object v4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    aget v5, v0, v1

    aget v6, v0, v3

    const/4 v9, 0x0

    const/high16 v8, -0x80000000

    const/4 v7, 0x0

    .line 1
    invoke-virtual/range {v4 .. v9}, Landroidx/recyclerview/widget/RecyclerView;->ぇいうげ〱〹(IILandroid/view/animation/Interpolator;IZ)V

    :cond_2e
    return-void
.end method

.method public abstract びぐびあび(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Landroid/view/View;
.end method
