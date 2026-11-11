.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇぬぎばつ;
.super Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;
.source ""


# instance fields
.field public づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

.field public びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;-><init>()V

    return-void
.end method


# virtual methods
.method public final 〳ぜぞぜべっ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;II)I
    .registers 16

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 1
    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->〺つふすそ:Landroid/widget/Scroller;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/high16 v6, -0x80000000

    const v7, 0x7fffffff

    const/high16 v8, -0x80000000

    const v9, 0x7fffffff

    move v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v9}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    iget-object p3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->〺つふすそ:Landroid/widget/Scroller;

    invoke-virtual {p3}, Landroid/widget/Scroller;->getFinalX()I

    move-result p3

    const/4 p4, 0x0

    aput p3, v0, p4

    iget-object p3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->〺つふすそ:Landroid/widget/Scroller;

    invoke-virtual {p3}, Landroid/widget/Scroller;->getFinalY()I

    move-result p3

    const/4 v1, 0x1

    aput p3, v0, v1

    .line 2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result p3

    const/high16 v2, 0x3f800000    # 1.0f

    if-nez p3, :cond_31

    goto :goto_80

    :cond_31
    const/4 v3, 0x0

    const v4, 0x7fffffff

    const/high16 v5, -0x80000000

    move-object v4, v3

    const v5, 0x7fffffff

    const/high16 v6, -0x80000000

    const/4 v7, 0x0

    :goto_3e
    if-ge v7, p3, :cond_57

    invoke-virtual {p1, v7}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {p1, v8}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v9

    const/4 v10, -0x1

    if-ne v9, v10, :cond_4c

    goto :goto_54

    :cond_4c
    if-ge v9, v5, :cond_50

    move-object v3, v8

    move v5, v9

    :cond_50
    if-le v9, v6, :cond_54

    move-object v4, v8

    move v6, v9

    :cond_54
    :goto_54
    add-int/lit8 v7, v7, 0x1

    goto :goto_3e

    :cond_57
    if-eqz v3, :cond_80

    if-nez v4, :cond_5c

    goto :goto_80

    :cond_5c
    invoke-virtual {p2, v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p2, v4}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result p3

    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {p2, v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result p3

    invoke-virtual {p2, v4}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result p2

    invoke-static {p3, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    sub-int/2addr p2, p1

    if-nez p2, :cond_78

    goto :goto_80

    :cond_78
    int-to-float p1, p2

    mul-float p1, p1, v2

    sub-int/2addr v6, v5

    add-int/2addr v6, v1

    int-to-float p2, v6

    div-float v2, p1, p2

    :cond_80
    :goto_80
    const/4 p1, 0x0

    cmpg-float p1, v2, p1

    if-gtz p1, :cond_86

    return p4

    .line 3
    :cond_86
    aget p1, v0, p4

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    aget p2, v0, v1

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    if-le p1, p2, :cond_97

    aget p1, v0, p4

    goto :goto_99

    :cond_97
    aget p1, v0, v1

    :goto_99
    int-to-float p1, p1

    div-float/2addr p1, v2

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1
.end method

.method public 〺つふすそ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;Landroid/view/View;)[I
    .registers 7

    const/4 v0, 0x2

    new-array v0, v0, [I

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->づざかべべ()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_15

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇぬぎばつ;->いいにぽつ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    move-result-object v1

    invoke-virtual {p0, p2, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇぬぎばつ;->ぁごぐすすぃ(Landroid/view/View;Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;)I

    move-result v1

    aput v1, v0, v2

    goto :goto_17

    :cond_15
    aput v2, v0, v2

    :goto_17
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->なぎぱいぢぎ()Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_29

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇぬぎばつ;->ぺふねづ〺(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇぬぎばつ;->ぁごぐすすぃ(Landroid/view/View;Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;)I

    move-result p1

    aput p1, v0, v3

    goto :goto_2b

    :cond_29
    aput v2, v0, v3

    :goto_2b
    return-object v0
.end method

.method public final ぁごぐすすぃ(Landroid/view/View;Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;)I
    .registers 4

    invoke-virtual {p2, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p2, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ(Landroid/view/View;)I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    add-int/2addr p1, v0

    invoke-virtual {p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v0

    invoke-virtual {p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->てぜきぽく()I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    add-int/2addr p2, v0

    sub-int/2addr p1, p2

    return p1
.end method

.method public final いいにぽつ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇぬぎばつ;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    if-eqz v0, :cond_8

    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    if-eq v0, p1, :cond_f

    .line 1
    :cond_8
    new-instance v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざとぅぼこ〺;

    invoke-direct {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざとぅぼこ〺;-><init>(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)V

    .line 2
    iput-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇぬぎばつ;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    :cond_f
    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇぬぎばつ;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    return-object p1
.end method

.method public づざかべべ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;II)I
    .registers 12

    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$〺つふすそ;

    const/4 v1, -0x1

    if-nez v0, :cond_6

    return v1

    :cond_6
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->けときぜと()I

    move-result v0

    if-nez v0, :cond_d

    return v1

    :cond_d
    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇぬぎばつ;->びぐびあび(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_14

    return v1

    :cond_14
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v2

    if-ne v2, v1, :cond_1b

    return v1

    :cond_1b
    move-object v3, p1

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$〺つふすそ;

    add-int/lit8 v4, v0, -0x1

    invoke-interface {v3, v4}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$〺つふすそ;->げつ〴ぬぐ(I)Landroid/graphics/PointF;

    move-result-object v3

    if-nez v3, :cond_27

    return v1

    :cond_27
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->づざかべべ()Z

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v5, :cond_3f

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇぬぎばつ;->いいにぽつ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    move-result-object v5

    invoke-virtual {p0, p1, v5, p2, v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇぬぎばつ;->〳ぜぞぜべっ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;II)I

    move-result p2

    iget v5, v3, Landroid/graphics/PointF;->x:F

    cmpg-float v5, v5, v6

    if-gez v5, :cond_40

    neg-int p2, p2

    goto :goto_40

    :cond_3f
    const/4 p2, 0x0

    :cond_40
    :goto_40
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->なぎぱいぢぎ()Z

    move-result v5

    if-eqz v5, :cond_56

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇぬぎばつ;->ぺふねづ〺(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    move-result-object v5

    invoke-virtual {p0, p1, v5, v7, p3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇぬぎばつ;->〳ぜぞぜべっ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;II)I

    move-result p3

    iget v3, v3, Landroid/graphics/PointF;->y:F

    cmpg-float v3, v3, v6

    if-gez v3, :cond_57

    neg-int p3, p3

    goto :goto_57

    :cond_56
    const/4 p3, 0x0

    :cond_57
    :goto_57
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->なぎぱいぢぎ()Z

    move-result p1

    if-eqz p1, :cond_5e

    move p2, p3

    :cond_5e
    if-nez p2, :cond_61

    return v1

    :cond_61
    add-int/2addr v2, p2

    if-gez v2, :cond_65

    goto :goto_66

    :cond_65
    move v7, v2

    :goto_66
    if-lt v7, v0, :cond_69

    goto :goto_6a

    :cond_69
    move v4, v7

    :goto_6a
    return v4
.end method

.method public びぐびあび(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Landroid/view/View;
    .registers 3

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->なぎぱいぢぎ()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇぬぎばつ;->ぺふねづ〺(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    move-result-object v0

    goto :goto_15

    :cond_b
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->づざかべべ()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇぬぎばつ;->いいにぽつ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    move-result-object v0

    :goto_15
    invoke-virtual {p0, p1, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇぬぎばつ;->ぺぁあねじ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_1a
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ぺぁあねじ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;)Landroid/view/View;
    .registers 11

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    return-object v1

    :cond_8
    invoke-virtual {p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v2

    invoke-virtual {p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->てぜきぽく()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v3, v2

    const v2, 0x7fffffff

    const/4 v4, 0x0

    :goto_17
    if-ge v4, v0, :cond_34

    invoke-virtual {p1, v4}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {p2, v5}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v6

    invoke-virtual {p2, v5}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v7

    div-int/lit8 v7, v7, 0x2

    add-int/2addr v7, v6

    sub-int/2addr v7, v3

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v6

    if-ge v6, v2, :cond_31

    move-object v1, v5

    move v2, v6

    :cond_31
    add-int/lit8 v4, v4, 0x1

    goto :goto_17

    :cond_34
    return-object v1
.end method

.method public final ぺふねづ〺(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇぬぎばつ;->びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    if-eqz v0, :cond_8

    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    if-eq v0, p1, :cond_f

    .line 1
    :cond_8
    new-instance v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/は〲ぱなで;

    invoke-direct {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/は〲ぱなで;-><init>(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)V

    .line 2
    iput-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇぬぎばつ;->びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    :cond_f
    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇぬぎばつ;->びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    return-object p1
.end method
