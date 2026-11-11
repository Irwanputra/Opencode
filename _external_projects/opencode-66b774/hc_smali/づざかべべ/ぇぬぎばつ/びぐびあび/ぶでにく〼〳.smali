.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/ぶでにく〼〳;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ$げつ〴ぬぐ;


# instance fields
.field public final synthetic げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぶでにく〼〳;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(I)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;
    .registers 9

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぶでにく〼〳;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    .line 1
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〳ぜぞぜべっ()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, v3

    :goto_b
    if-ge v2, v1, :cond_35

    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v5, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->ぁごぐすすぃ(I)Landroid/view/View;

    move-result-object v5

    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v5

    if-eqz v5, :cond_32

    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ()Z

    move-result v6

    if-nez v6, :cond_32

    iget v6, v5, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    if-eq v6, p1, :cond_24

    goto :goto_32

    :cond_24
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    iget-object v6, v5, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v4, v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->ぺふねづ〺(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_30

    move-object v4, v5

    goto :goto_32

    :cond_30
    move-object v4, v5

    goto :goto_35

    :cond_32
    :goto_32
    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    :cond_35
    :goto_35
    if-nez v4, :cond_38

    return-object v3

    .line 2
    :cond_38
    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぶでにく〼〳;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    iget-object v0, v4, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {p1, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->ぺふねづ〺(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_45

    return-object v3

    :cond_45
    return-object v4
.end method

.method public くし〴〺ぅ(IILjava/lang/Object;)V
    .registers 12

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぶでにく〼〳;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    .line 1
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〳ぜぞぜべっ()I

    move-result v1

    add-int/2addr p2, p1

    const/4 v2, 0x0

    :goto_a
    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ge v2, v1, :cond_38

    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v5, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->ぁごぐすすぃ(I)Landroid/view/View;

    move-result-object v5

    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v6

    if-eqz v6, :cond_35

    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ざっざへづ()Z

    move-result v7

    if-eqz v7, :cond_21

    goto :goto_35

    :cond_21
    iget v7, v6, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    if-lt v7, p1, :cond_35

    if-ge v7, p2, :cond_35

    invoke-virtual {v6, v3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〺つふすそ(I)V

    invoke-virtual {v6, p3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ(Ljava/lang/Object;)V

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iput-boolean v4, v3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->くし〴〺ぅ:Z

    :cond_35
    :goto_35
    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    :cond_38
    iget-object p3, v0, Landroidx/recyclerview/widget/RecyclerView;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    .line 2
    iget-object v0, p3, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :cond_40
    :goto_40
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_5c

    iget-object v1, p3, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    if-nez v1, :cond_4f

    goto :goto_40

    :cond_4f
    iget v2, v1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    if-lt v2, p1, :cond_40

    if-ge v2, p2, :cond_40

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〺つふすそ(I)V

    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぁごぐすすぃ(I)V

    goto :goto_40

    .line 3
    :cond_5c
    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぶでにく〼〳;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    iput-boolean v4, p1, Landroidx/recyclerview/widget/RecyclerView;->な〱ちぉじ:Z

    return-void
.end method

.method public げつ〴ぬぐ(Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ$〺つふすそ;)V
    .registers 6

    iget v0, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ$〺つふすそ;->げつ〴ぬぐ:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_36

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2a

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1c

    const/16 v2, 0x8

    if-eq v0, v2, :cond_10

    goto :goto_41

    :cond_10
    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぶでにく〼〳;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->のぷのちつ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    iget v3, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:I

    iget p1, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ$〺つふすそ;->びぐびあび:I

    invoke-virtual {v2, v0, v3, p1, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->へえどぜせ(Landroidx/recyclerview/widget/RecyclerView;III)V

    goto :goto_41

    :cond_1c
    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぶでにく〼〳;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->のぷのちつ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    iget v2, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:I

    iget v3, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ$〺つふすそ;->びぐびあび:I

    iget-object p1, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ$〺つふすそ;->くし〴〺ぅ:Ljava/lang/Object;

    invoke-virtual {v1, v0, v2, v3, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->がぐくいおす(Landroidx/recyclerview/widget/RecyclerView;IILjava/lang/Object;)V

    goto :goto_41

    :cond_2a
    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぶでにく〼〳;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->のぷのちつ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    iget v2, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:I

    iget p1, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ$〺つふすそ;->びぐびあび:I

    invoke-virtual {v1, v0, v2, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぅばづそほせ(Landroidx/recyclerview/widget/RecyclerView;II)V

    goto :goto_41

    :cond_36
    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぶでにく〼〳;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->のぷのちつ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    iget v2, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:I

    iget p1, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ$〺つふすそ;->びぐびあび:I

    invoke-virtual {v1, v0, v2, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->へぼ〳〻び(Landroidx/recyclerview/widget/RecyclerView;II)V

    :goto_41
    return-void
.end method

.method public づざかべべ(II)V
    .registers 14

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぶでにく〼〳;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    .line 1
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〳ぜぞぜべっ()I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-ge p1, p2, :cond_10

    move v4, p1

    move v5, p2

    const/4 v6, -0x1

    goto :goto_13

    :cond_10
    move v5, p1

    move v4, p2

    const/4 v6, 0x1

    :goto_13
    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_15
    if-ge v8, v1, :cond_3c

    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v9, v8}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->ぁごぐすすぃ(I)Landroid/view/View;

    move-result-object v9

    invoke-static {v9}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v9

    if-eqz v9, :cond_39

    iget v10, v9, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    if-lt v10, v4, :cond_39

    if-le v10, v5, :cond_2a

    goto :goto_39

    :cond_2a
    if-ne v10, p1, :cond_32

    sub-int v10, p2, p1

    invoke-virtual {v9, v10, v7}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぉざぅち〻(IZ)V

    goto :goto_35

    :cond_32
    invoke-virtual {v9, v6, v7}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぉざぅち〻(IZ)V

    :goto_35
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    iput-boolean v3, v9, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->なぎぱいぢぎ:Z

    :cond_39
    :goto_39
    add-int/lit8 v8, v8, 0x1

    goto :goto_15

    :cond_3c
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    if-ge p1, p2, :cond_43

    move v4, p1

    move v5, p2

    goto :goto_46

    :cond_43
    move v5, p1

    move v4, p2

    const/4 v2, 0x1

    .line 2
    :goto_46
    iget-object v6, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v8, 0x0

    :goto_4d
    if-ge v8, v6, :cond_6e

    iget-object v9, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    if-eqz v9, :cond_6b

    iget v10, v9, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    if-lt v10, v4, :cond_6b

    if-le v10, v5, :cond_60

    goto :goto_6b

    :cond_60
    if-ne v10, p1, :cond_68

    sub-int v10, p2, p1

    invoke-virtual {v9, v10, v7}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぉざぅち〻(IZ)V

    goto :goto_6b

    :cond_68
    invoke-virtual {v9, v2, v7}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぉざぅち〻(IZ)V

    :cond_6b
    :goto_6b
    add-int/lit8 v8, v8, 0x1

    goto :goto_4d

    .line 3
    :cond_6e
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 4
    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぶでにく〼〳;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    iput-boolean v3, p1, Landroidx/recyclerview/widget/RecyclerView;->ぎきぁ〱ぢ:Z

    return-void
.end method

.method public びぐびあび(II)V
    .registers 10

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぶでにく〼〳;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    .line 1
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〳ぜぞぜべっ()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_a
    const/4 v4, 0x1

    if-ge v3, v1, :cond_2d

    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v5, v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->ぁごぐすすぃ(I)Landroid/view/View;

    move-result-object v5

    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v5

    if-eqz v5, :cond_2a

    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ざっざへづ()Z

    move-result v6

    if-nez v6, :cond_2a

    iget v6, v5, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    if-lt v6, p1, :cond_2a

    invoke-virtual {v5, p2, v2}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぉざぅち〻(IZ)V

    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    iput-boolean v4, v5, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->なぎぱいぢぎ:Z

    :cond_2a
    add-int/lit8 v3, v3, 0x1

    goto :goto_a

    :cond_2d
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    .line 2
    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    :goto_35
    if-ge v2, v3, :cond_4b

    iget-object v5, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    if-eqz v5, :cond_48

    iget v6, v5, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    if-lt v6, p1, :cond_48

    invoke-virtual {v5, p2, v4}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぉざぅち〻(IZ)V

    :cond_48
    add-int/lit8 v2, v2, 0x1

    goto :goto_35

    .line 3
    :cond_4b
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 4
    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぶでにく〼〳;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    iput-boolean v4, p1, Landroidx/recyclerview/widget/RecyclerView;->ぎきぁ〱ぢ:Z

    return-void
.end method
