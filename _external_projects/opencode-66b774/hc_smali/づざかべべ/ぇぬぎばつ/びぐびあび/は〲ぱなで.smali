.class public final Lづざかべべ/ぇぬぎばつ/びぐびあび/は〲ぱなで;
.super Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;
.source ""


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;-><init>(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;Lづざかべべ/ぇぬぎばつ/びぐびあび/ざとぅぼこ〺;)V

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げがぴうあだ()I

    move-result v0

    return v0
.end method

.method public 〺つふすそ(Landroid/view/View;)I
    .registers 4

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->なぶひせが(Landroid/view/View;)I

    move-result p1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, v0

    return p1
.end method

.method public ぁごぐすすぃ()I
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    .line 1
    iget v1, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉざぅち〻:I

    .line 2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げがぴうあだ()I

    move-result v0

    sub-int/2addr v1, v0

    return v1
.end method

.method public いいにぽつ()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    .line 1
    iget v0, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->へぬ〴づぞ:I

    return v0
.end method

.method public ぇぬぎばつ(I)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かづげぃぁ〺(I)V

    return-void
.end method

.method public おぐぴう〸ず(Landroid/view/View;)I
    .registers 5

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ:Landroid/graphics/Rect;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v2, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->こ〲しでおか(Landroid/view/View;ZLandroid/graphics/Rect;)V

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->top:I

    return p1
.end method

.method public くし〴〺ぅ(Landroid/view/View;)I
    .registers 4

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->じぜこほぱ(Landroid/view/View;)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, v0

    return p1
.end method

.method public づざかべべ(Landroid/view/View;)I
    .registers 4

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->せづっ〸ちね(Landroid/view/View;)I

    move-result p1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr p1, v0

    return p1
.end method

.method public てぜきぽく()I
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    .line 1
    iget v1, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉざぅち〻:I

    .line 2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ておぞぞはね()I

    move-result v0

    sub-int/2addr v1, v0

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げがぴうあだ()I

    move-result v0

    sub-int/2addr v1, v0

    return v1
.end method

.method public なぎぱいぢぎ()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    .line 1
    iget v0, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉざぅち〻:I

    return v0
.end method

.method public びぐびあび(Landroid/view/View;)I
    .registers 4

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぺづげぺが(Landroid/view/View;)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr p1, v0

    return p1
.end method

.method public へぬ〴づぞ(Landroid/view/View;)I
    .registers 5

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ:Landroid/graphics/Rect;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v2, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->こ〲しでおか(Landroid/view/View;ZLandroid/graphics/Rect;)V

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    return p1
.end method

.method public ぺぁあねじ()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    .line 1
    iget v0, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->おぐぴう〸ず:I

    return v0
.end method

.method public ぺふねづ〺()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ておぞぞはね()I

    move-result v0

    return v0
.end method
