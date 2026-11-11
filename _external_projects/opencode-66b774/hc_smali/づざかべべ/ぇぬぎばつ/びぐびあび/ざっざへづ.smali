.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;
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
.method public final 〳ぜぞぜべっ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;)Landroid/view/View;
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

.method public 〺つふすそ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;Landroid/view/View;)[I
    .registers 7

    const/4 v0, 0x2

    new-array v0, v0, [I

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->づざかべべ()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_15

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;->ぺぁあねじ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    move-result-object v1

    invoke-virtual {p0, p2, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;->ぁごぐすすぃ(Landroid/view/View;Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;)I

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

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;->いいにぽつ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;->ぁごぐすすぃ(Landroid/view/View;Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;)I

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

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;->びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    if-eqz v0, :cond_8

    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    if-eq v0, p1, :cond_f

    .line 1
    :cond_8
    new-instance v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/は〲ぱなで;

    invoke-direct {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/は〲ぱなで;-><init>(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)V

    .line 2
    iput-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;->びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    :cond_f
    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;->びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    return-object p1
.end method

.method public くし〴〺ぅ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;
    .registers 3

    instance-of p1, p1, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$〺つふすそ;

    if-nez p1, :cond_6

    const/4 p1, 0x0

    return-object p1

    :cond_6
    new-instance p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ$げつ〴ぬぐ;

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ$げつ〴ぬぐ;-><init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;Landroid/content/Context;)V

    return-object p1
.end method

.method public づざかべべ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;II)I
    .registers 16

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->けときぜと()I

    move-result v0

    const/4 v1, -0x1

    if-nez v0, :cond_8

    return v1

    .line 1
    :cond_8
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->なぎぱいぢぎ()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_14

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;->いいにぽつ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    move-result-object v2

    goto :goto_20

    :cond_14
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->づざかべべ()Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;->ぺぁあねじ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    move-result-object v2

    goto :goto_20

    :cond_1f
    move-object v2, v3

    :goto_20
    if-nez v2, :cond_23

    return v1

    :cond_23
    const/high16 v4, -0x80000000

    const v5, 0x7fffffff

    .line 2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v6

    const/4 v7, 0x0

    move-object v4, v3

    const/high16 v5, -0x80000000

    const v8, 0x7fffffff

    const/4 v9, 0x0

    :goto_34
    if-ge v9, v6, :cond_50

    invoke-virtual {p1, v9}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v10

    if-nez v10, :cond_3d

    goto :goto_4d

    :cond_3d
    invoke-virtual {p0, v10, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;->ぁごぐすすぃ(Landroid/view/View;Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;)I

    move-result v11

    if-gtz v11, :cond_47

    if-le v11, v5, :cond_47

    move-object v4, v10

    move v5, v11

    :cond_47
    if-ltz v11, :cond_4d

    if-ge v11, v8, :cond_4d

    move-object v3, v10

    move v8, v11

    :cond_4d
    :goto_4d
    add-int/lit8 v9, v9, 0x1

    goto :goto_34

    .line 3
    :cond_50
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->づざかべべ()Z

    move-result v2

    const/4 v5, 0x1

    if-eqz v2, :cond_5d

    if-lez p2, :cond_5b

    :goto_59
    const/4 p2, 0x1

    goto :goto_60

    :cond_5b
    const/4 p2, 0x0

    goto :goto_60

    :cond_5d
    if-lez p3, :cond_5b

    goto :goto_59

    :goto_60
    if-eqz p2, :cond_69

    if-eqz v3, :cond_69

    .line 4
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result p1

    return p1

    :cond_69
    if-nez p2, :cond_72

    if-eqz v4, :cond_72

    invoke-virtual {p1, v4}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result p1

    return p1

    :cond_72
    if-eqz p2, :cond_75

    move-object v3, v4

    :cond_75
    if-nez v3, :cond_78

    return v1

    :cond_78
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result p3

    .line 5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->けときぜと()I

    move-result v2

    instance-of v3, p1, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$〺つふすそ;

    if-eqz v3, :cond_9b

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$〺つふすそ;

    sub-int/2addr v2, v5

    invoke-interface {p1, v2}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$〺つふすそ;->げつ〴ぬぐ(I)Landroid/graphics/PointF;

    move-result-object p1

    if-eqz p1, :cond_9b

    iget v2, p1, Landroid/graphics/PointF;->x:F

    const/4 v3, 0x0

    cmpg-float v2, v2, v3

    if-ltz v2, :cond_9a

    iget p1, p1, Landroid/graphics/PointF;->y:F

    cmpg-float p1, p1, v3

    if-gez p1, :cond_9b

    :cond_9a
    const/4 v7, 0x1

    :cond_9b
    if-ne v7, p2, :cond_9e

    const/4 v5, -0x1

    :cond_9e
    add-int/2addr p3, v5

    if-ltz p3, :cond_a5

    if-lt p3, v0, :cond_a4

    goto :goto_a5

    :cond_a4
    return p3

    :cond_a5
    :goto_a5
    return v1
.end method

.method public びぐびあび(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Landroid/view/View;
    .registers 2

    const p0, 0x0

    throw p0
.end method

.method public final ぺぁあねじ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    if-eqz v0, :cond_8

    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    if-eq v0, p1, :cond_f

    .line 1
    :cond_8
    new-instance v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざとぅぼこ〺;

    invoke-direct {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざとぅぼこ〺;-><init>(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)V

    .line 2
    iput-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    :cond_f
    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ざっざへづ;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    return-object p1
.end method
