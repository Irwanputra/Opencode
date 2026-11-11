.class public Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
.super Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;
.source ""

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$〺つふすそ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;,
        Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;,
        Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;,
        Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;,
        Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;
    }
.end annotation


# instance fields
.field public 〺でおいここ:Z

.field public final 〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

.field public ぅみぱぎぎ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

.field public ぇ〳〲〺すっ:Z

.field public ぇとしたべど:[I

.field public ぉ〲なぱぽた:Z

.field public ぉひのべい:Z

.field public final おかぷせ〱:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;

.field public final けときぜと:Landroid/graphics/Rect;

.field public final げがぴうあだ:Ljava/lang/Runnable;

.field public ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

.field public ざっざへづ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

.field public ざとぅぼこ〺:I

.field public じぜこほぱ:I

.field public せづっ〸ちね:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

.field public でどあくず:I

.field public どぇぞほだ:I

.field public なぶひせが:I

.field public は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

.field public びえぁぜい:Ljava/util/BitSet;

.field public ぶでにく〼〳:I

.field public ぷぞてのほき:I

.field public ぺづげぺが:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 8

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぉ〲なぱぽた:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->なぶひせが:I

    const/high16 v0, -0x80000000

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->どぇぞほだ:I

    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-direct {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぅみぱぎぎ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    const/4 v0, 0x2

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->じぜこほぱ:I

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->けときぜと:Landroid/graphics/Rect;

    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->おかぷせ〱:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〺でおいここ:Z

    new-instance v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$げつ〴ぬぐ;

    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$げつ〴ぬぐ;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V

    iput-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->げがぴうあだ:Ljava/lang/Runnable;

    invoke-static {p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->えがぐせほち(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$びぐびあび;

    move-result-object p1

    iget p2, p1, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$びぐびあび;->げつ〴ぬぐ:I

    if-eqz p2, :cond_46

    if-ne p2, v0, :cond_3e

    goto :goto_46

    .line 1
    :cond_3e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid orientation."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_46
    :goto_46
    const/4 p3, 0x0

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->びぐびあび(Ljava/lang/String;)V

    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    if-ne p2, p4, :cond_4f

    goto :goto_5c

    :cond_4f
    iput p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざっざへづ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    iput-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    iput-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざっざへづ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かちして〹づ()V

    .line 2
    :goto_5c
    iget p2, p1, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$びぐびあび;->〺つふすそ:I

    .line 3
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->びぐびあび(Ljava/lang/String;)V

    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-eq p2, p4, :cond_91

    .line 4
    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぅみぱぎぎ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->げつ〴ぬぐ()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かちして〹づ()V

    .line 5
    iput p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    new-instance p2, Ljava/util/BitSet;

    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    invoke-direct {p2, p4}, Ljava/util/BitSet;-><init>(I)V

    iput-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->びえぁぜい:Ljava/util/BitSet;

    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    new-array p2, p2, [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    iput-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    :goto_7e
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-ge v1, p2, :cond_8e

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    new-instance p4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    invoke-direct {p4, p0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;I)V

    aput-object p4, p2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_7e

    :cond_8e
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かちして〹づ()V

    .line 6
    :cond_91
    iget-boolean p1, p1, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$びぐびあび;->くし〴〺ぅ:Z

    .line 7
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->びぐびあび(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->せづっ〸ちね:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz p2, :cond_a0

    iget-boolean p3, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->ぺぁあねじ:Z

    if-eq p3, p1, :cond_a0

    iput-boolean p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->ぺぁあねじ:Z

    :cond_a0
    iput-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぉ〲なぱぽた:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かちして〹づ()V

    .line 8
    new-instance p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    invoke-direct {p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    .line 9
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    invoke-static {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;I)Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    sub-int/2addr v0, p1

    invoke-static {p0, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;I)Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざっざへづ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    return-void
.end method


# virtual methods
.method public 〱〴なぱへて(I)V
    .registers 2

    if-nez p1, :cond_5

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->おぬぃかはど()Z

    :cond_5
    return-void
.end method

.method public 〱〵つてう(Landroid/os/Parcelable;)V
    .registers 3

    instance-of v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v0, :cond_b

    check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->せづっ〸ちね:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かちして〹づ()V

    :cond_b
    return-void
.end method

.method public 〳に〴あぽ()Z
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->せづっ〸ちね:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-nez v0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    return v0
.end method

.method public 〴おちすく(Z)Landroid/view/View;
    .registers 10

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_12
    if-ge v4, v2, :cond_36

    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v5

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6, v5}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v6

    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7, v5}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result v7

    if-le v7, v0, :cond_33

    if-lt v6, v1, :cond_29

    goto :goto_33

    :cond_29
    if-ge v6, v0, :cond_32

    if-nez p1, :cond_2e

    goto :goto_32

    :cond_2e
    if-nez v3, :cond_33

    move-object v3, v5

    goto :goto_33

    :cond_32
    :goto_32
    return-object v5

    :cond_33
    :goto_33
    add-int/lit8 v4, v4, 0x1

    goto :goto_12

    :cond_36
    return-object v3
.end method

.method public final 〵いどうねぢ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 9

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    if-nez v0, :cond_8

    const/4 p1, 0x0

    return p1

    :cond_8
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〺でおいここ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〴おちすく(Z)Landroid/view/View;

    move-result-object v2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〺でおいここ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぉいけぐつ(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〺でおいここ:Z

    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v6}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->おぐぴう〸ず(Landroidx/recyclerview/widget/RecyclerView$でどあくず;Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;ZZ)I

    move-result p1

    return p1
.end method

.method public 〵げとずぐみ()Z
    .registers 3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->おかぷせ〱()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    goto :goto_9

    :cond_8
    const/4 v1, 0x0

    :goto_9
    return v1
.end method

.method public 〺〲に〼へ〸(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)V
    .registers 2

    const/4 p1, -0x1

    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->なぶひせが:I

    const/high16 p1, -0x80000000

    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->どぇぞほだ:I

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->せづっ〸ちね:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->おかぷせ〱:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->〺つふすそ()V

    return-void
.end method

.method public final 〻だくけはく(I)I
    .registers 5

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-nez v0, :cond_e

    iget-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    if-eqz p1, :cond_d

    const/4 v1, 0x1

    :cond_d
    return v1

    :cond_e
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぎがえべぱど()I

    move-result v0

    if-ge p1, v0, :cond_16

    const/4 p1, 0x1

    goto :goto_17

    :cond_16
    const/4 p1, 0x0

    :goto_17
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    if-eq p1, v0, :cond_1c

    goto :goto_1d

    :cond_1c
    const/4 v1, 0x1

    :goto_1d
    return v1
.end method

.method public ぁごぐすすぃ(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z
    .registers 2

    instance-of p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    return p1
.end method

.method public ぁないぼぎへ(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぅみぱぎぎ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->げつ〴ぬぐ()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かちして〹づ()V

    return-void
.end method

.method public ぁにあがあ()Landroid/os/Parcelable;
    .registers 6

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->せづっ〸ちね:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v0, :cond_a

    new-instance v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    invoke-direct {v1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;)V

    return-object v1

    :cond_a
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    invoke-direct {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;-><init>()V

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぉ〲なぱぽた:Z

    iput-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->ぺぁあねじ:Z

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぺづげぺが:Z

    iput-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->いいにぽつ:Z

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぉひのべい:Z

    iput-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->ぺふねづ〺:Z

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぅみぱぎぎ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    const/4 v2, 0x0

    if-eqz v1, :cond_2e

    iget-object v3, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->げつ〴ぬぐ:[I

    if-eqz v3, :cond_2e

    iput-object v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->ぁごぐすすぃ:[I

    array-length v3, v3

    iput v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->なぎぱいぢぎ:I

    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->〺つふすそ:Ljava/util/List;

    iput-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->〳ぜぞぜべっ:Ljava/util/List;

    goto :goto_30

    :cond_2e
    iput v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->なぎぱいぢぎ:I

    :goto_30
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v1

    const/4 v3, -0x1

    if-lez v1, :cond_98

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぺづげぺが:Z

    if-eqz v1, :cond_40

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->えげて〱でく()I

    move-result v1

    goto :goto_44

    :cond_40
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぎがえべぱど()I

    move-result v1

    :goto_44
    iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->〺つふすそ:I

    .line 1
    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    const/4 v4, 0x1

    if-eqz v1, :cond_50

    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぉいけぐつ(Z)Landroid/view/View;

    move-result-object v1

    goto :goto_54

    :cond_50
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〴おちすく(Z)Landroid/view/View;

    move-result-object v1

    :goto_54
    if-nez v1, :cond_57

    goto :goto_5b

    :cond_57
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v3

    .line 2
    :goto_5b
    iput v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->くし〴〺ぅ:I

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->びぐびあび:I

    new-array v1, v1, [I

    iput-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->づざかべべ:[I

    :goto_65
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-ge v2, v1, :cond_9e

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぺづげぺが:Z

    const/high16 v3, -0x80000000

    if-eqz v1, :cond_80

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v1, v1, v2

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ(I)I

    move-result v1

    if-eq v1, v3, :cond_91

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v3

    goto :goto_90

    :cond_80
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v1, v1, v2

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->ぺふねづ〺(I)I

    move-result v1

    if-eq v1, v3, :cond_91

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v3

    :goto_90
    sub-int/2addr v1, v3

    :cond_91
    iget-object v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->づざかべべ:[I

    aput v1, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_65

    :cond_98
    iput v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->〺つふすそ:I

    iput v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->くし〴〺ぅ:I

    iput v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->びぐびあび:I

    :cond_9e
    return-object v0
.end method

.method public final ぃぉみぜす(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)V
    .registers 6

    const/high16 v0, -0x80000000

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->づふぱぐそ〹(I)I

    move-result v1

    if-ne v1, v0, :cond_9

    return-void

    :cond_9
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v0

    sub-int/2addr v0, v1

    if-lez v0, :cond_22

    neg-int v1, v0

    invoke-virtual {p0, v1, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->うでこすぢた(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    neg-int p1, p1

    sub-int/2addr v0, p1

    if-eqz p3, :cond_22

    if-lez v0, :cond_22

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p1, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぇぬぎばつ(I)V

    :cond_22
    return-void
.end method

.method public ぅばづそほせ(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 4

    const/4 p1, 0x2

    invoke-virtual {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->がぴぽぁぬ(III)V

    return-void
.end method

.method public うでこすぢた(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 6

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_31

    if-nez p1, :cond_a

    goto :goto_31

    :cond_a
    invoke-virtual {p0, p1, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->のとけっぬ(ILandroidx/recyclerview/widget/RecyclerView$でどあくず;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    invoke-virtual {p0, p2, v0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぴまけ〸だて(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p3

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iget v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->〺つふすそ:I

    if-ge v0, p3, :cond_1a

    goto :goto_1f

    :cond_1a
    if-gez p1, :cond_1e

    neg-int p1, p3

    goto :goto_1f

    :cond_1e
    move p1, p3

    :goto_1f
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    neg-int v0, p1

    invoke-virtual {p3, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぇぬぎばつ(I)V

    iget-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    iput-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぺづげぺが:Z

    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iput v1, p3, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->〺つふすそ:I

    invoke-virtual {p0, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->けいっど〱(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;)V

    return p1

    :cond_31
    :goto_31
    return v1
.end method

.method public ぇぬぎばつ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->っあつぜっ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public えげて〱でく()I
    .registers 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    if-nez v0, :cond_8

    const/4 v0, 0x0

    goto :goto_12

    :cond_8
    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v0

    :goto_12
    return v0
.end method

.method public ぉいけぐつ(Z)Landroid/view/View;
    .registers 9

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    :goto_13
    if-ltz v2, :cond_37

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v4

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v5, v4}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v5

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6, v4}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result v6

    if-le v6, v0, :cond_34

    if-lt v5, v1, :cond_2a

    goto :goto_34

    :cond_2a
    if-le v6, v1, :cond_33

    if-nez p1, :cond_2f

    goto :goto_33

    :cond_2f
    if-nez v3, :cond_34

    move-object v3, v4

    goto :goto_34

    :cond_33
    :goto_33
    return-object v4

    :cond_34
    :goto_34
    add-int/lit8 v2, v2, -0x1

    goto :goto_13

    :cond_37
    return-object v3
.end method

.method public final ぉさひねい()V
    .registers 3

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_10

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〵げとずぐみ()Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_10

    :cond_c
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぉ〲なぱぽた:Z

    xor-int/2addr v0, v1

    goto :goto_12

    :cond_10
    :goto_10
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぉ〲なぱぽた:Z

    :goto_12
    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    return-void
.end method

.method public final お〵かぜて(I)V
    .registers 6

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iput p1, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->づざかべべ:I

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-ne p1, v3, :cond_c

    const/4 p1, 0x1

    goto :goto_d

    :cond_c
    const/4 p1, 0x0

    :goto_d
    if-ne v1, p1, :cond_10

    goto :goto_11

    :cond_10
    const/4 v2, -0x1

    :goto_11
    iput v2, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->びぐびあび:I

    return-void
.end method

.method public おぐぴう〸ず(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〵いどうねぢ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public おぬぃかはど()Z
    .registers 4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_37

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->じぜこほぱ:I

    if-eqz v0, :cond_37

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぺぁあねじ:Z

    if-nez v0, :cond_10

    goto :goto_37

    .line 2
    :cond_10
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    if-eqz v0, :cond_1c

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->えげて〱でく()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぎがえべぱど()I

    goto :goto_23

    :cond_1c
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぎがえべぱど()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->えげて〱でく()I

    :goto_23
    const/4 v2, 0x1

    if-nez v0, :cond_37

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざぇぎぱ〺()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_37

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぅみぱぎぎ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->げつ〴ぬぐ()V

    .line 3
    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〳ぜぞぜべっ:Z

    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かちして〹づ()V

    return v2

    :cond_37
    :goto_37
    return v1
.end method

.method public final かこあぇ〸〼(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;I)V
    .registers 7

    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    if-lez v0, :cond_39

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v1, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result v1

    if-gt v1, p2, :cond_39

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v1, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->へぬ〴づぞ(Landroid/view/View;)I

    move-result v1

    if-gt v1, p2, :cond_39

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->づざかべべ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    iget-object v2, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_30

    return-void

    :cond_30
    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->づざかべべ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->のぷのちつ()V

    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->えみにぃほす(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)V

    goto :goto_0

    :cond_39
    return-void
.end method

.method public かづげぃぁ〺(I)V
    .registers 6

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かづげぃぁ〺(I)V

    const/4 v0, 0x0

    :goto_4
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-ge v0, v1, :cond_1f

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v1, v1, v0

    .line 1
    iget v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    const/high16 v3, -0x80000000

    if-eq v2, v3, :cond_15

    add-int/2addr v2, p1

    iput v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    :cond_15
    iget v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    if-eq v2, v3, :cond_1c

    add-int/2addr v2, p1

    iput v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    :cond_1c
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_1f
    return-void
.end method

.method public がぐくいおす(Landroidx/recyclerview/widget/RecyclerView;IILjava/lang/Object;)V
    .registers 5

    const/4 p1, 0x4

    invoke-virtual {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->がぴぽぁぬ(III)V

    return-void
.end method

.method public final がぴぽぁぬ(III)V
    .registers 10

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->えげて〱でく()I

    move-result v0

    goto :goto_d

    :cond_9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぎがえべぱど()I

    move-result v0

    :goto_d
    const/16 v1, 0x8

    if-ne p3, v1, :cond_1a

    if-ge p1, p2, :cond_16

    add-int/lit8 v2, p2, 0x1

    goto :goto_1c

    :cond_16
    add-int/lit8 v2, p1, 0x1

    move v3, p2

    goto :goto_1d

    :cond_1a
    add-int v2, p1, p2

    :goto_1c
    move v3, p1

    :goto_1d
    iget-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぅみぱぎぎ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->びぐびあび(I)I

    const/4 v4, 0x1

    if-eq p3, v4, :cond_3c

    const/4 v5, 0x2

    if-eq p3, v5, :cond_36

    if-eq p3, v1, :cond_2b

    goto :goto_41

    :cond_2b
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぅみぱぎぎ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {p3, p1, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->なぎぱいぢぎ(II)V

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぅみぱぎぎ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {p1, p2, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->づざかべべ(II)V

    goto :goto_41

    :cond_36
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぅみぱぎぎ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {p3, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->なぎぱいぢぎ(II)V

    goto :goto_41

    :cond_3c
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぅみぱぎぎ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {p3, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->づざかべべ(II)V

    :goto_41
    if-gt v2, v0, :cond_44

    return-void

    :cond_44
    iget-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    if-eqz p1, :cond_4d

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぎがえべぱど()I

    move-result p1

    goto :goto_51

    :cond_4d
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->えげて〱でく()I

    move-result p1

    :goto_51
    if-gt v3, p1, :cond_56

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かちして〹づ()V

    :cond_56
    return-void
.end method

.method public final きづぢばちつ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)V
    .registers 15

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->おかぷせ〱:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->せづっ〸ちね:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    const/4 v2, -0x1

    if-nez v1, :cond_b

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->なぶひせが:I

    if-eq v1, v2, :cond_18

    :cond_b
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v1

    if-nez v1, :cond_18

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ひぞ〴つき(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)V

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->〺つふすそ()V

    return-void

    :cond_18
    iget-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->づざかべべ:Z

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_29

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->なぶひせが:I

    if-ne v1, v2, :cond_29

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->せづっ〸ちね:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v1, :cond_27

    goto :goto_29

    :cond_27
    const/4 v1, 0x0

    goto :goto_2a

    :cond_29
    :goto_29
    const/4 v1, 0x1

    :goto_2a
    const/high16 v5, -0x80000000

    if-eqz v1, :cond_1e7

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->〺つふすそ()V

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->せづっ〸ちね:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v6, :cond_b8

    .line 1
    iget v7, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->びぐびあび:I

    const/4 v8, 0x0

    if-lez v7, :cond_7d

    iget v9, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-ne v7, v9, :cond_6f

    const/4 v6, 0x0

    :goto_3f
    iget v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-ge v6, v7, :cond_7d

    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v7, v7, v6

    invoke-virtual {v7}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->びぐびあび()V

    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->せづっ〸ちね:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iget-object v9, v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->づざかべべ:[I

    aget v9, v9, v6

    if-eq v9, v5, :cond_64

    iget-boolean v7, v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->いいにぽつ:Z

    if-eqz v7, :cond_5d

    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v7

    goto :goto_63

    :cond_5d
    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v7

    :goto_63
    add-int/2addr v9, v7

    :cond_64
    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v7, v7, v6

    .line 2
    iput v9, v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    iput v9, v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    add-int/lit8 v6, v6, 0x1

    goto :goto_3f

    .line 3
    :cond_6f
    iput-object v8, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->づざかべべ:[I

    iput v4, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->びぐびあび:I

    iput v4, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->なぎぱいぢぎ:I

    iput-object v8, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->ぁごぐすすぃ:[I

    iput-object v8, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->〳ぜぞぜべっ:Ljava/util/List;

    .line 4
    iget v7, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->くし〴〺ぅ:I

    iput v7, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->〺つふすそ:I

    :cond_7d
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->せづっ〸ちね:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iget-boolean v7, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->ぺふねづ〺:Z

    iput-boolean v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぉひのべい:Z

    iget-boolean v6, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->ぺぁあねじ:Z

    .line 5
    invoke-virtual {p0, v8}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->びぐびあび(Ljava/lang/String;)V

    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->せづっ〸ちね:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v7, :cond_92

    iget-boolean v8, v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->ぺぁあねじ:Z

    if-eq v8, v6, :cond_92

    iput-boolean v6, v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->ぺぁあねじ:Z

    :cond_92
    iput-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぉ〲なぱぽた:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かちして〹づ()V

    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぉさひねい()V

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->せづっ〸ちね:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    iget v7, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->〺つふすそ:I

    if-eq v7, v2, :cond_a5

    iput v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->なぶひせが:I

    iget-boolean v7, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->いいにぽつ:Z

    goto :goto_a7

    :cond_a5
    iget-boolean v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    :goto_a7
    iput-boolean v7, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->くし〴〺ぅ:Z

    iget v7, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->なぎぱいぢぎ:I

    if-le v7, v3, :cond_bf

    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぅみぱぎぎ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    iget-object v8, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->ぁごぐすすぃ:[I

    iput-object v8, v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->げつ〴ぬぐ:[I

    iget-object v6, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->〳ぜぞぜべっ:Ljava/util/List;

    iput-object v6, v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->〺つふすそ:Ljava/util/List;

    goto :goto_bf

    .line 7
    :cond_b8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぉさひねい()V

    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    iput-boolean v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->くし〴〺ぅ:Z

    .line 8
    :cond_bf
    :goto_bf
    iget-boolean v6, p2, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-nez v6, :cond_1a8

    .line 9
    iget v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->なぶひせが:I

    if-ne v6, v2, :cond_c9

    goto/16 :goto_1a8

    :cond_c9
    if-ltz v6, :cond_1a4

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v7

    if-lt v6, v7, :cond_d3

    goto/16 :goto_1a4

    :cond_d3
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->せづっ〸ちね:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v6, :cond_e8

    iget v7, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->〺つふすそ:I

    if-eq v7, v2, :cond_e8

    iget v6, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->びぐびあび:I

    if-ge v6, v3, :cond_e0

    goto :goto_e8

    :cond_e0
    iput v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->〺つふすそ:I

    iget v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->なぶひせが:I

    iput v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->げつ〴ぬぐ:I

    goto/16 :goto_1a2

    :cond_e8
    :goto_e8
    iget v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->なぶひせが:I

    invoke-virtual {p0, v6}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ごづごきえ(I)Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_170

    iget-boolean v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    if-eqz v7, :cond_f9

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->えげて〱でく()I

    move-result v7

    goto :goto_fd

    :cond_f9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぎがえべぱど()I

    move-result v7

    :goto_fd
    iput v7, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->げつ〴ぬぐ:I

    iget v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->どぇぞほだ:I

    if-eq v7, v5, :cond_128

    iget-boolean v7, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->くし〴〺ぅ:Z

    if-eqz v7, :cond_117

    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v7

    iget v8, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->どぇぞほだ:I

    sub-int/2addr v7, v8

    iget-object v8, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v8, v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result v6

    goto :goto_126

    :cond_117
    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v7

    iget v8, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->どぇぞほだ:I

    add-int/2addr v7, v8

    iget-object v8, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v8, v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v6

    :goto_126
    sub-int/2addr v7, v6

    goto :goto_16a

    :cond_128
    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7, v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v7

    iget-object v8, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v8}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->てぜきぽく()I

    move-result v8

    if-le v7, v8, :cond_148

    iget-boolean v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->くし〴〺ぅ:Z

    if-eqz v6, :cond_141

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v6

    goto :goto_158

    :cond_141
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v6

    goto :goto_158

    :cond_148
    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7, v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v7

    iget-object v8, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v8}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v8

    sub-int/2addr v7, v8

    if-gez v7, :cond_15b

    neg-int v6, v7

    :goto_158
    iput v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->〺つふすそ:I

    goto :goto_1a2

    :cond_15b
    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v7

    iget-object v8, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v8, v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result v6

    sub-int/2addr v7, v6

    if-gez v7, :cond_16d

    :goto_16a
    iput v7, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->〺つふすそ:I

    goto :goto_1a2

    :cond_16d
    iput v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->〺つふすそ:I

    goto :goto_1a2

    :cond_170
    iget v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->なぶひせが:I

    iput v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->げつ〴ぬぐ:I

    iget v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->どぇぞほだ:I

    if-ne v7, v5, :cond_187

    invoke-virtual {p0, v6}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻だくけはく(I)I

    move-result v6

    if-ne v6, v3, :cond_180

    const/4 v6, 0x1

    goto :goto_181

    :cond_180
    const/4 v6, 0x0

    :goto_181
    iput-boolean v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->くし〴〺ぅ:Z

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->げつ〴ぬぐ()V

    goto :goto_1a0

    .line 10
    :cond_187
    iget-boolean v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->くし〴〺ぅ:Z

    if-eqz v6, :cond_195

    iget-object v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->ぁごぐすすぃ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v6, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v6

    sub-int/2addr v6, v7

    goto :goto_19e

    :cond_195
    iget-object v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->ぁごぐすすぃ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v6, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v6

    add-int/2addr v6, v7

    :goto_19e
    iput v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->〺つふすそ:I

    .line 11
    :goto_1a0
    iput-boolean v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->びぐびあび:Z

    :goto_1a2
    const/4 v6, 0x1

    goto :goto_1a9

    :cond_1a4
    :goto_1a4
    iput v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->なぶひせが:I

    iput v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->どぇぞほだ:I

    :cond_1a8
    :goto_1a8
    const/4 v6, 0x0

    :goto_1a9
    if-eqz v6, :cond_1ac

    goto :goto_1e5

    .line 12
    :cond_1ac
    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぺづげぺが:Z

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v7

    if-eqz v6, :cond_1c8

    .line 13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v6

    :cond_1b8
    add-int/2addr v6, v2

    if-ltz v6, :cond_1e0

    invoke-virtual {p0, v6}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {p0, v8}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v8

    if-ltz v8, :cond_1b8

    if-ge v8, v7, :cond_1b8

    goto :goto_1e1

    .line 14
    :cond_1c8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v6

    const/4 v8, 0x0

    :goto_1cd
    if-ge v8, v6, :cond_1e0

    invoke-virtual {p0, v8}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v9

    invoke-virtual {p0, v9}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v9

    if-ltz v9, :cond_1dd

    if-ge v9, v7, :cond_1dd

    move v8, v9

    goto :goto_1e1

    :cond_1dd
    add-int/lit8 v8, v8, 0x1

    goto :goto_1cd

    :cond_1e0
    const/4 v8, 0x0

    .line 15
    :goto_1e1
    iput v8, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->げつ〴ぬぐ:I

    iput v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->〺つふすそ:I

    .line 16
    :goto_1e5
    iput-boolean v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->づざかべべ:Z

    :cond_1e7
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->せづっ〸ちね:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-nez v6, :cond_204

    iget v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->なぶひせが:I

    if-ne v6, v2, :cond_204

    iget-boolean v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->くし〴〺ぅ:Z

    iget-boolean v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぺづげぺが:Z

    if-ne v6, v7, :cond_1fd

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〵げとずぐみ()Z

    move-result v6

    iget-boolean v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぉひのべい:Z

    if-eq v6, v7, :cond_204

    :cond_1fd
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぅみぱぎぎ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    invoke-virtual {v6}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->げつ〴ぬぐ()V

    iput-boolean v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->びぐびあび:Z

    :cond_204
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v6

    if-lez v6, :cond_2bc

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->せづっ〸ちね:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v6, :cond_212

    iget v6, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->びぐびあび:I

    if-ge v6, v3, :cond_2bc

    :cond_212
    iget-boolean v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->びぐびあび:Z

    if-eqz v6, :cond_231

    const/4 v1, 0x0

    :goto_217
    iget v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-ge v1, v6, :cond_2bc

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v6, v6, v1

    invoke-virtual {v6}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->びぐびあび()V

    iget v6, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->〺つふすそ:I

    if-eq v6, v5, :cond_22e

    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v7, v7, v1

    .line 17
    iput v6, v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    iput v6, v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    :cond_22e
    add-int/lit8 v1, v1, 0x1

    goto :goto_217

    :cond_231
    if-nez v1, :cond_253

    .line 18
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->おかぷせ〱:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;

    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->なぎぱいぢぎ:[I

    if-nez v1, :cond_23a

    goto :goto_253

    :cond_23a
    const/4 v1, 0x0

    :goto_23b
    iget v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-ge v1, v6, :cond_2bc

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v6, v6, v1

    invoke-virtual {v6}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->びぐびあび()V

    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->おかぷせ〱:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;

    iget-object v7, v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->なぎぱいぢぎ:[I

    aget v7, v7, v1

    .line 19
    iput v7, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    iput v7, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    add-int/lit8 v1, v1, 0x1

    goto :goto_23b

    :cond_253
    :goto_253
    const/4 v1, 0x0

    .line 20
    :goto_254
    iget v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-ge v1, v6, :cond_294

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v6, v6, v1

    iget-boolean v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    iget v8, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->〺つふすそ:I

    if-eqz v7, :cond_267

    .line 21
    invoke-virtual {v6, v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ(I)I

    move-result v9

    goto :goto_26b

    :cond_267
    invoke-virtual {v6, v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->ぺふねづ〺(I)I

    move-result v9

    :goto_26b
    invoke-virtual {v6}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->びぐびあび()V

    if-ne v9, v5, :cond_271

    goto :goto_291

    :cond_271
    if-eqz v7, :cond_27d

    iget-object v10, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->なぎぱいぢぎ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v10, v10, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v10}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v10

    if-lt v9, v10, :cond_291

    :cond_27d
    if-nez v7, :cond_28a

    iget-object v7, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->なぎぱいぢぎ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v7, v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v7

    if-le v9, v7, :cond_28a

    goto :goto_291

    :cond_28a
    if-eq v8, v5, :cond_28d

    add-int/2addr v9, v8

    :cond_28d
    iput v9, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    iput v9, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    :cond_291
    :goto_291
    add-int/lit8 v1, v1, 0x1

    goto :goto_254

    .line 22
    :cond_294
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->おかぷせ〱:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v7, v6

    iget-object v8, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->なぎぱいぢぎ:[I

    if-eqz v8, :cond_2a3

    array-length v8, v8

    if-ge v8, v7, :cond_2ac

    :cond_2a3
    iget-object v8, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->ぁごぐすすぃ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v8, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    array-length v8, v8

    new-array v8, v8, [I

    iput-object v8, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->なぎぱいぢぎ:[I

    :cond_2ac
    const/4 v8, 0x0

    :goto_2ad
    if-ge v8, v7, :cond_2bc

    iget-object v9, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->なぎぱいぢぎ:[I

    aget-object v10, v6, v8

    invoke-virtual {v10, v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->ぺふねづ〺(I)I

    move-result v10

    aput v10, v9, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_2ad

    .line 24
    :cond_2bc
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉざぅち〻(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)V

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iput-boolean v4, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->げつ〴ぬぐ:Z

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざっざへづ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->てぜきぽく()I

    move-result v1

    .line 25
    iget v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    div-int v6, v1, v6

    iput v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぶでにく〼〳:I

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざっざへづ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺぁあねじ()I

    move-result v6

    invoke-static {v1, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぷぞてのほき:I

    .line 26
    iget v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->げつ〴ぬぐ:I

    invoke-virtual {p0, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->どつち〻ぎづ(ILandroidx/recyclerview/widget/RecyclerView$でどあくず;)V

    iget-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->くし〴〺ぅ:Z

    if-eqz v1, :cond_2f0

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->お〵かぜて(I)V

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    invoke-virtual {p0, p1, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぴまけ〸だて(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->お〵かぜて(I)V

    goto :goto_2fb

    :cond_2f0
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->お〵かぜて(I)V

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    invoke-virtual {p0, p1, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぴまけ〸だて(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->お〵かぜて(I)V

    :goto_2fb
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iget v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->げつ〴ぬぐ:I

    iget v6, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->びぐびあび:I

    add-int/2addr v2, v6

    iput v2, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    invoke-virtual {p0, p1, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぴまけ〸だて(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    .line 27
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざっざへづ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺぁあねじ()I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    if-ne v1, v2, :cond_313

    goto/16 :goto_3ba

    :cond_313
    const/4 v1, 0x0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v2

    const/4 v6, 0x0

    :goto_319
    if-ge v6, v2, :cond_33b

    invoke-virtual {p0, v6}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v7

    iget-object v8, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざっざへづ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v8, v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v8

    int-to-float v8, v8

    cmpg-float v9, v8, v1

    if-gez v9, :cond_32b

    goto :goto_338

    :cond_32b
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v8}, Ljava/lang/Math;->max(FF)F

    move-result v1

    :goto_338
    add-int/lit8 v6, v6, 0x1

    goto :goto_319

    :cond_33b
    iget v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぶでにく〼〳:I

    iget v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    int-to-float v7, v7

    mul-float v1, v1, v7

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざっざへづ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺぁあねじ()I

    move-result v7

    if-ne v7, v5, :cond_358

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざっざへづ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v5}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->てぜきぽく()I

    move-result v5

    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 28
    :cond_358
    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    div-int v5, v1, v5

    iput v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぶでにく〼〳:I

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざっざへづ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v5}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺぁあねじ()I

    move-result v5

    invoke-static {v1, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぷぞてのほき:I

    .line 29
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぶでにく〼〳:I

    if-ne v1, v6, :cond_36f

    goto :goto_3ba

    :cond_36f
    const/4 v1, 0x0

    :goto_370
    if-ge v1, v2, :cond_3ba

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〵げとずぐみ()Z

    move-result v8

    if-eqz v8, :cond_3a1

    iget v8, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    if-ne v8, v3, :cond_3a1

    iget v8, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    add-int/lit8 v9, v8, -0x1

    iget-object v7, v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->づざかべべ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    iget v7, v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->づざかべべ:I

    sub-int/2addr v9, v7

    neg-int v9, v9

    iget v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぶでにく〼〳:I

    mul-int v9, v9, v10

    sub-int/2addr v8, v3

    sub-int/2addr v8, v7

    neg-int v7, v8

    mul-int v7, v7, v6

    sub-int/2addr v9, v7

    invoke-virtual {v5, v9}, Landroid/view/View;->offsetLeftAndRight(I)V

    goto :goto_3b7

    :cond_3a1
    iget-object v7, v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->づざかべべ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    iget v7, v7, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->づざかべべ:I

    iget v8, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぶでにく〼〳:I

    mul-int v8, v8, v7

    mul-int v7, v7, v6

    iget v9, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    sub-int/2addr v8, v7

    if-ne v9, v3, :cond_3b4

    invoke-virtual {v5, v8}, Landroid/view/View;->offsetLeftAndRight(I)V

    goto :goto_3b7

    :cond_3b4
    invoke-virtual {v5, v8}, Landroid/view/View;->offsetTopAndBottom(I)V

    :goto_3b7
    add-int/lit8 v1, v1, 0x1

    goto :goto_370

    .line 30
    :cond_3ba
    :goto_3ba
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v1

    if-lez v1, :cond_3d1

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    if-eqz v1, :cond_3cb

    invoke-virtual {p0, p1, p2, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぃぉみぜす(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)V

    invoke-virtual {p0, p1, p2, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->づ〵ぬきすへ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)V

    goto :goto_3d1

    :cond_3cb
    invoke-virtual {p0, p1, p2, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->づ〵ぬきすへ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)V

    invoke-virtual {p0, p1, p2, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぃぉみぜす(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)V

    :cond_3d1
    :goto_3d1
    if-eqz p3, :cond_3fc

    .line 31
    iget-boolean p3, p2, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-nez p3, :cond_3fc

    .line 32
    iget p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->じぜこほぱ:I

    if-eqz p3, :cond_3e9

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result p3

    if-lez p3, :cond_3e9

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざぇぎぱ〺()Landroid/view/View;

    move-result-object p3

    if-eqz p3, :cond_3e9

    const/4 p3, 0x1

    goto :goto_3ea

    :cond_3e9
    const/4 p3, 0x0

    :goto_3ea
    if-eqz p3, :cond_3fc

    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->げがぴうあだ:Ljava/lang/Runnable;

    .line 33
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_3f5

    invoke-virtual {v1, p3}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 34
    :cond_3f5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->おぬぃかはど()Z

    move-result p3

    if-eqz p3, :cond_3fc

    goto :goto_3fd

    :cond_3fc
    const/4 v3, 0x0

    .line 35
    :goto_3fd
    iget-boolean p3, p2, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-eqz p3, :cond_406

    .line 36
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->おかぷせ〱:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;

    invoke-virtual {p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->〺つふすそ()V

    :cond_406
    iget-boolean p3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->くし〴〺ぅ:Z

    iput-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぺづげぺが:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〵げとずぐみ()Z

    move-result p3

    iput-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぉひのべい:Z

    if-eqz v3, :cond_41a

    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->おかぷせ〱:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;

    invoke-virtual {p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$〺つふすそ;->〺つふすそ()V

    invoke-virtual {p0, p1, p2, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->きづぢばちつ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)V

    :cond_41a
    return-void
.end method

.method public きぬどぼみ〸(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)Landroid/view/View;
    .registers 13

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    return-object v1

    :cond_8
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->は〲ぱなで(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_f

    return-object v1

    :cond_f
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぉさひねい()V

    const/high16 v0, -0x80000000

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-eq p2, v3, :cond_4f

    const/4 v4, 0x2

    if-eq p2, v4, :cond_43

    const/16 v4, 0x11

    if-eq p2, v4, :cond_3b

    const/16 v4, 0x21

    if-eq p2, v4, :cond_36

    const/16 v4, 0x42

    if-eq p2, v4, :cond_31

    const/16 v4, 0x82

    if-eq p2, v4, :cond_2c

    goto :goto_40

    .line 1
    :cond_2c
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    if-ne p2, v3, :cond_40

    goto :goto_5a

    :cond_31
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    if-nez p2, :cond_40

    goto :goto_5a

    :cond_36
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    if-ne p2, v3, :cond_40

    goto :goto_5c

    :cond_3b
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    if-nez p2, :cond_40

    goto :goto_5c

    :cond_40
    :goto_40
    const/high16 p2, -0x80000000

    goto :goto_5d

    :cond_43
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    if-ne p2, v3, :cond_48

    goto :goto_5a

    :cond_48
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〵げとずぐみ()Z

    move-result p2

    if-eqz p2, :cond_5a

    goto :goto_5c

    :cond_4f
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    if-ne p2, v3, :cond_54

    goto :goto_5c

    :cond_54
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〵げとずぐみ()Z

    move-result p2

    if-eqz p2, :cond_5c

    :cond_5a
    :goto_5a
    const/4 p2, 0x1

    goto :goto_5d

    :cond_5c
    :goto_5c
    const/4 p2, -0x1

    :goto_5d
    if-ne p2, v0, :cond_60

    return-object v1

    .line 2
    :cond_60
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->づざかべべ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    if-ne p2, v3, :cond_72

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->えげて〱でく()I

    move-result v4

    goto :goto_76

    :cond_72
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぎがえべぱど()I

    move-result v4

    :goto_76
    invoke-virtual {p0, v4, p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->どつち〻ぎづ(ILandroidx/recyclerview/widget/RecyclerView$でどあくず;)V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->お〵かぜて(I)V

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iget v6, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->びぐびあび:I

    add-int/2addr v6, v4

    iput v6, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    const v6, 0x3eaaaaab

    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->てぜきぽく()I

    move-result v7

    int-to-float v7, v7

    mul-float v7, v7, v6

    float-to-int v6, v7

    iput v6, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->〺つふすそ:I

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iput-boolean v3, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->〳ぜぞぜべっ:Z

    const/4 v6, 0x0

    iput-boolean v6, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->げつ〴ぬぐ:Z

    invoke-virtual {p0, p3, v5, p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぴまけ〸だて(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    iget-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    iput-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぺづげぺが:Z

    invoke-virtual {v0, v4, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->ぺぁあねじ(II)Landroid/view/View;

    move-result-object p3

    if-eqz p3, :cond_a9

    if-eq p3, p1, :cond_a9

    return-object p3

    :cond_a9
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->つなつぼず(I)Z

    move-result p3

    if-eqz p3, :cond_c4

    iget p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    sub-int/2addr p3, v3

    :goto_b2
    if-ltz p3, :cond_d9

    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object p4, p4, p3

    invoke-virtual {p4, v4, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->ぺぁあねじ(II)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_c1

    if-eq p4, p1, :cond_c1

    return-object p4

    :cond_c1
    add-int/lit8 p3, p3, -0x1

    goto :goto_b2

    :cond_c4
    const/4 p3, 0x0

    :goto_c5
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-ge p3, p4, :cond_d9

    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object p4, p4, p3

    invoke-virtual {p4, v4, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->ぺぁあねじ(II)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_d6

    if-eq p4, p1, :cond_d6

    return-object p4

    :cond_d6
    add-int/lit8 p3, p3, 0x1

    goto :goto_c5

    :cond_d9
    iget-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぉ〲なぱぽた:Z

    xor-int/2addr p3, v3

    if-ne p2, v2, :cond_e0

    const/4 p4, 0x1

    goto :goto_e1

    :cond_e0
    const/4 p4, 0x0

    :goto_e1
    if-ne p3, p4, :cond_e5

    const/4 p3, 0x1

    goto :goto_e6

    :cond_e5
    const/4 p3, 0x0

    :goto_e6
    if-eqz p3, :cond_ed

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->づざかべべ()I

    move-result p4

    goto :goto_f1

    :cond_ed
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->なぎぱいぢぎ()I

    move-result p4

    :goto_f1
    invoke-virtual {p0, p4}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ごづごきえ(I)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_fa

    if-eq p4, p1, :cond_fa

    return-object p4

    :cond_fa
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->つなつぼず(I)Z

    move-result p2

    if-eqz p2, :cond_127

    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    sub-int/2addr p2, v3

    :goto_103
    if-ltz p2, :cond_148

    iget p4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->づざかべべ:I

    if-ne p2, p4, :cond_10a

    goto :goto_124

    :cond_10a
    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    if-eqz p3, :cond_115

    aget-object p4, p4, p2

    invoke-virtual {p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->づざかべべ()I

    move-result p4

    goto :goto_11b

    :cond_115
    aget-object p4, p4, p2

    invoke-virtual {p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->なぎぱいぢぎ()I

    move-result p4

    :goto_11b
    invoke-virtual {p0, p4}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ごづごきえ(I)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_124

    if-eq p4, p1, :cond_124

    return-object p4

    :cond_124
    :goto_124
    add-int/lit8 p2, p2, -0x1

    goto :goto_103

    :cond_127
    :goto_127
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-ge v6, p2, :cond_148

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    if-eqz p3, :cond_136

    aget-object p2, p2, v6

    invoke-virtual {p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->づざかべべ()I

    move-result p2

    goto :goto_13c

    :cond_136
    aget-object p2, p2, v6

    invoke-virtual {p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->なぎぱいぢぎ()I

    move-result p2

    :goto_13c
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ごづごきえ(I)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_145

    if-eq p2, p1, :cond_145

    return-object p2

    :cond_145
    add-int/lit8 v6, v6, 0x1

    goto :goto_127

    :cond_148
    return-object v1
.end method

.method public ぎがえべぱど()I
    .registers 3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_8

    goto :goto_10

    :cond_8
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v1

    :goto_10
    return v1
.end method

.method public く〱なおぎ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 4

    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->うでこすぢた(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public final ぐいぎぽぼ(Landroid/view/View;IIZ)V
    .registers 9

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->けときぜと:Landroid/graphics/Rect;

    .line 1
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v1, :cond_b

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_12

    :cond_b
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->〺でおいここ(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 2
    :goto_12
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->けときぜと:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v2, v2, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v2

    invoke-virtual {p0, p2, v1, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->さぬうづぃ(III)I

    move-result p2

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->けときぜと:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->top:I

    add-int/2addr v1, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v2

    invoke-virtual {p0, p3, v1, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->さぬうづぃ(III)I

    move-result p3

    if-eqz p4, :cond_3f

    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->え〱さぽぜ(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z

    move-result p4

    goto :goto_43

    :cond_3f
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->づあてぐく(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z

    move-result p4

    :goto_43
    if-eqz p4, :cond_48

    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    :cond_48
    return-void
.end method

.method public final けいっど〱(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;)V
    .registers 7

    iget-boolean v0, p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_7c

    iget-boolean v0, p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->ぺぁあねじ:Z

    if-eqz v0, :cond_a

    goto/16 :goto_7c

    :cond_a
    iget v0, p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->〺つふすそ:I

    const/4 v1, -0x1

    if-nez v0, :cond_1f

    iget v0, p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->づざかべべ:I

    if-ne v0, v1, :cond_19

    :goto_13
    iget p2, p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->ぁごぐすすぃ:I

    :goto_15
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ひ〲どぼぢだ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;I)V

    goto :goto_7c

    :cond_19
    :goto_19
    iget p2, p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->なぎぱいぢぎ:I

    :goto_1b
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->かこあぇ〸〼(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;I)V

    goto :goto_7c

    :cond_1f
    iget v0, p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->づざかべべ:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_50

    iget v0, p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->なぎぱいぢぎ:I

    .line 1
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v1, v1, v2

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->ぺふねづ〺(I)I

    move-result v1

    :goto_2f
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-ge v3, v2, :cond_41

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v2, v2, v3

    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->ぺふねづ〺(I)I

    move-result v2

    if-le v2, v1, :cond_3e

    move v1, v2

    :cond_3e
    add-int/lit8 v3, v3, 0x1

    goto :goto_2f

    :cond_41
    sub-int/2addr v0, v1

    if-gez v0, :cond_45

    goto :goto_13

    .line 2
    :cond_45
    iget v1, p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->ぁごぐすすぃ:I

    iget p2, p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->〺つふすそ:I

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    sub-int p2, v1, p2

    goto :goto_15

    :cond_50
    iget v0, p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->ぁごぐすすぃ:I

    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v1, v1, v2

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ(I)I

    move-result v1

    :goto_5a
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-ge v3, v2, :cond_6c

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v2, v2, v3

    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ(I)I

    move-result v2

    if-ge v2, v1, :cond_69

    move v1, v2

    :cond_69
    add-int/lit8 v3, v3, 0x1

    goto :goto_5a

    .line 4
    :cond_6c
    iget v0, p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->ぁごぐすすぃ:I

    sub-int/2addr v1, v0

    if-gez v1, :cond_72

    goto :goto_19

    :cond_72
    iget v0, p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->なぎぱいぢぎ:I

    iget p2, p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->〺つふすそ:I

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/2addr p2, v0

    goto :goto_1b

    :cond_7c
    :goto_7c
    return-void
.end method

.method public げつ〴ぬぐ(I)Landroid/graphics/PointF;
    .registers 5

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻だくけはく(I)I

    move-result p1

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    if-nez p1, :cond_d

    const/4 p1, 0x0

    return-object p1

    :cond_d
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    const/4 v2, 0x0

    if-nez v1, :cond_18

    int-to-float p1, p1

    iput p1, v0, Landroid/graphics/PointF;->x:F

    iput v2, v0, Landroid/graphics/PointF;->y:F

    goto :goto_1d

    :cond_18
    iput v2, v0, Landroid/graphics/PointF;->x:F

    int-to-float p1, p1

    iput p1, v0, Landroid/graphics/PointF;->y:F

    :goto_1d
    return-object v0
.end method

.method public final さぬうづぃ(III)I
    .registers 6

    if-nez p2, :cond_5

    if-nez p3, :cond_5

    return p1

    :cond_5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_13

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_12

    goto :goto_13

    :cond_12
    return p1

    :cond_13
    :goto_13
    const/4 v1, 0x0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    sub-int/2addr p1, p2

    sub-int/2addr p1, p3

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    return p1
.end method

.method public ざぇぎぱ〺()Landroid/view/View;
    .registers 13

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    new-instance v2, Ljava/util/BitSet;

    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    invoke-direct {v2, v3}, Ljava/util/BitSet;-><init>(I)V

    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3, v1}, Ljava/util/BitSet;->set(IIZ)V

    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    const/4 v5, -0x1

    if-ne v3, v1, :cond_20

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〵げとずぐみ()Z

    move-result v3

    if-eqz v3, :cond_20

    const/4 v3, 0x1

    goto :goto_21

    :cond_20
    const/4 v3, -0x1

    :goto_21
    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    if-eqz v6, :cond_27

    const/4 v6, -0x1

    goto :goto_2b

    :cond_27
    add-int/lit8 v0, v0, 0x1

    move v6, v0

    const/4 v0, 0x0

    :goto_2b
    if-ge v0, v6, :cond_2e

    const/4 v5, 0x1

    :cond_2e
    :goto_2e
    if-eq v0, v6, :cond_eb

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    iget-object v9, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->づざかべべ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    iget v9, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->づざかべべ:I

    invoke-virtual {v2, v9}, Ljava/util/BitSet;->get(I)Z

    move-result v9

    if-eqz v9, :cond_98

    iget-object v9, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->づざかべべ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    .line 1
    iget-boolean v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    const/high16 v11, -0x80000000

    if-eqz v10, :cond_6a

    .line 2
    iget v10, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    if-eq v10, v11, :cond_51

    goto :goto_56

    :cond_51
    invoke-virtual {v9}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〺つふすそ()V

    iget v10, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    .line 3
    :goto_56
    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v11}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v11

    if-ge v10, v11, :cond_8d

    iget-object v10, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v11

    sub-int/2addr v11, v1

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    goto :goto_82

    .line 4
    :cond_6a
    iget v10, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    if-eq v10, v11, :cond_6f

    goto :goto_74

    :cond_6f
    invoke-virtual {v9}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->くし〴〺ぅ()V

    iget v10, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    .line 5
    :goto_74
    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v11}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v11

    if-le v10, v11, :cond_8d

    iget-object v10, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    :goto_82
    check-cast v10, Landroid/view/View;

    invoke-virtual {v9, v10}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->いいにぽつ(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v9, 0x1

    goto :goto_8e

    :cond_8d
    const/4 v9, 0x0

    :goto_8e
    if-eqz v9, :cond_91

    return-object v7

    .line 6
    :cond_91
    iget-object v9, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->づざかべべ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    iget v9, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->づざかべべ:I

    invoke-virtual {v2, v9}, Ljava/util/BitSet;->clear(I)V

    :cond_98
    add-int v9, v0, v5

    if-eq v9, v6, :cond_e8

    invoke-virtual {p0, v9}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v9

    iget-boolean v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    if-eqz v10, :cond_b6

    iget-object v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v10, v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result v10

    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v11, v9}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result v11

    if-ge v10, v11, :cond_b3

    return-object v7

    :cond_b3
    if-ne v10, v11, :cond_c9

    goto :goto_c7

    :cond_b6
    iget-object v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v10, v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v10

    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v11, v9}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v11

    if-le v10, v11, :cond_c5

    return-object v7

    :cond_c5
    if-ne v10, v11, :cond_c9

    :goto_c7
    const/4 v10, 0x1

    goto :goto_ca

    :cond_c9
    const/4 v10, 0x0

    :goto_ca
    if-eqz v10, :cond_e8

    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    iget-object v8, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->づざかべべ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    iget v8, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->づざかべべ:I

    iget-object v9, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->づざかべべ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    iget v9, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->づざかべべ:I

    sub-int/2addr v8, v9

    if-gez v8, :cond_df

    const/4 v8, 0x1

    goto :goto_e0

    :cond_df
    const/4 v8, 0x0

    :goto_e0
    if-gez v3, :cond_e4

    const/4 v9, 0x1

    goto :goto_e5

    :cond_e4
    const/4 v9, 0x0

    :goto_e5
    if-eq v8, v9, :cond_e8

    return-object v7

    :cond_e8
    add-int/2addr v0, v5

    goto/16 :goto_2e

    :cond_eb
    const/4 v0, 0x0

    return-object v0
.end method

.method public ざっざへづ()Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .registers 4

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    const/4 v1, -0x2

    const/4 v2, -0x1

    if-nez v0, :cond_c

    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(II)V

    return-object v0

    :cond_c
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    invoke-direct {v0, v2, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public しげにけぃ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)V
    .registers 4

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->きづぢばちつ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)V

    return-void
.end method

.method public ずまげせび〳(I)V
    .registers 6

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ずまげせび〳(I)V

    const/4 v0, 0x0

    :goto_4
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-ge v0, v1, :cond_1f

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v1, v1, v0

    .line 1
    iget v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    const/high16 v3, -0x80000000

    if-eq v2, v3, :cond_15

    add-int/2addr v2, p1

    iput v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    :cond_15
    iget v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    if-eq v2, v3, :cond_1c

    add-int/2addr v2, p1

    iput v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    :cond_1c
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_1f
    return-void
.end method

.method public final せばぴ〸び(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 8

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    if-nez v0, :cond_8

    const/4 p1, 0x0

    return p1

    :cond_8
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〺でおいここ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〴おちすく(Z)Landroid/view/View;

    move-result-object v2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〺でおいここ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぉいけぐつ(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〺でおいここ:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->へぬ〴づぞ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;Z)I

    move-result p1

    return p1
.end method

.method public final っあつぜっ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 8

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    if-nez v0, :cond_8

    const/4 p1, 0x0

    return p1

    :cond_8
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〺でおいここ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〴おちすく(Z)Landroid/view/View;

    move-result-object v2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〺でおいここ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぉいけぐつ(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〺でおいここ:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぇぬぎばつ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;Z)I

    move-result p1

    return p1
.end method

.method public final つなつぼず(I)Z
    .registers 6

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_13

    if-ne p1, v1, :cond_b

    const/4 p1, 0x1

    goto :goto_c

    :cond_b
    const/4 p1, 0x0

    :goto_c
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    if-eq p1, v0, :cond_11

    goto :goto_12

    :cond_11
    const/4 v2, 0x0

    :goto_12
    return v2

    :cond_13
    if-ne p1, v1, :cond_17

    const/4 p1, 0x1

    goto :goto_18

    :cond_17
    const/4 p1, 0x0

    :goto_18
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    if-ne p1, v0, :cond_1e

    const/4 p1, 0x1

    goto :goto_1f

    :cond_1e
    const/4 p1, 0x0

    :goto_1f
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〵げとずぐみ()Z

    move-result v0

    if-ne p1, v0, :cond_26

    goto :goto_27

    :cond_26
    const/4 v2, 0x0

    :goto_27
    return v2
.end method

.method public final つびたくず(II)V
    .registers 5

    const/4 v0, 0x0

    :goto_1
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-ge v0, v1, :cond_1c

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v1, v1, v0

    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_19

    :cond_12
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v1, v1, v0

    invoke-virtual {p0, v1, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ほ〱たうえの(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;II)V

    :goto_19
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1c
    return-void
.end method

.method public final づ〵ぬきすへ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)V
    .registers 6

    const v0, 0x7fffffff

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->へざ〴ばび〻(I)I

    move-result v1

    if-ne v1, v0, :cond_a

    return-void

    :cond_a
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v0

    sub-int/2addr v1, v0

    if-lez v1, :cond_22

    invoke-virtual {p0, v1, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->うでこすぢた(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    sub-int/2addr v1, p1

    if-eqz p3, :cond_22

    if-lez v1, :cond_22

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    neg-int p2, v1

    invoke-virtual {p1, p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぇぬぎばつ(I)V

    :cond_22
    return-void
.end method

.method public づおぴ〱いづ(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$でどあくず;I)V
    .registers 4

    new-instance p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;-><init>(Landroid/content/Context;)V

    .line 1
    iput p3, p2, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->げつ〴ぬぐ:I

    .line 2
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->いおてぢび(Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;)V

    return-void
.end method

.method public づざかべべ()Z
    .registers 2

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    if-nez v0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    return v0
.end method

.method public final づふぱぐそ〹(I)I
    .registers 5

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ(I)I

    move-result v0

    const/4 v1, 0x1

    :goto_a
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-ge v1, v2, :cond_1c

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ(I)I

    move-result v2

    if-le v2, v0, :cond_19

    move v0, v2

    :cond_19
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_1c
    return v0
.end method

.method public てぜきぽく(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〵いどうねぢ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public でどあくず(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .registers 4

    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    invoke-direct {v0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final どつち〻ぎづ(ILandroidx/recyclerview/widget/RecyclerView$でどあくず;)V
    .registers 7

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    const/4 v1, 0x0

    iput v1, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->〺つふすそ:I

    iput p1, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;

    const/4 v2, 0x1

    if-eqz v0, :cond_12

    .line 2
    iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->づざかべべ:Z

    if-eqz v0, :cond_12

    const/4 v0, 0x1

    goto :goto_13

    :cond_12
    const/4 v0, 0x0

    :goto_13
    if-eqz v0, :cond_33

    .line 3
    iget p2, p2, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->げつ〴ぬぐ:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_33

    .line 4
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    if-ge p2, p1, :cond_20

    const/4 p1, 0x1

    goto :goto_21

    :cond_20
    const/4 p1, 0x0

    :goto_21
    if-ne v0, p1, :cond_2a

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->てぜきぽく()I

    move-result p1

    goto :goto_34

    :cond_2a
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->てぜきぽく()I

    move-result p1

    move p2, p1

    const/4 p1, 0x0

    goto :goto_35

    :cond_33
    const/4 p1, 0x0

    :goto_34
    const/4 p2, 0x0

    .line 5
    :goto_35
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_3f

    iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView;->〳ぜぞぜべっ:Z

    if-eqz v0, :cond_3f

    const/4 v0, 0x1

    goto :goto_40

    :cond_3f
    const/4 v0, 0x0

    :goto_40
    if-eqz v0, :cond_59

    .line 6
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v3

    sub-int/2addr v3, p2

    iput v3, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->なぎぱいぢぎ:I

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v0

    add-int/2addr v0, p1

    iput v0, p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->ぁごぐすすぃ:I

    goto :goto_69

    :cond_59
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->なぎぱいぢぎ()I

    move-result v3

    add-int/2addr v3, p1

    iput v3, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->ぁごぐすすぃ:I

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    neg-int p2, p2

    iput p2, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->なぎぱいぢぎ:I

    :goto_69
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iput-boolean v1, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->〳ぜぞぜべっ:Z

    iput-boolean v2, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->げつ〴ぬぐ:Z

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺぁあねじ()I

    move-result p2

    if-nez p2, :cond_80

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->なぎぱいぢぎ()I

    move-result p2

    if-nez p2, :cond_80

    const/4 v1, 0x1

    :cond_80
    iput-boolean v1, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->ぺぁあねじ:Z

    return-void
.end method

.method public な〱ちぉじ(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぎきぁ〱ぢ()V

    .line 2
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->げがぴうあだ:Ljava/lang/Runnable;

    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_c

    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_c
    const/4 p2, 0x0

    .line 4
    :goto_d
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-ge p2, v0, :cond_1b

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v0, v0, p2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->びぐびあび()V

    add-int/lit8 p2, p2, 0x1

    goto :goto_d

    :cond_1b
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    return-void
.end method

.method public なぎぱいぢぎ()Z
    .registers 3

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    goto :goto_7

    :cond_6
    const/4 v1, 0x0

    :goto_7
    return v1
.end method

.method public にぢ〱ぁな(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V
    .registers 12

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    instance-of p2, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    if-nez p2, :cond_c

    invoke-virtual {p0, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉねぞはがぞ(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V

    return-void

    :cond_c
    check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    const/4 p3, 0x1

    const/4 v0, -0x1

    if-nez p2, :cond_21

    .line 1
    iget-object p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->づざかべべ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    if-nez p1, :cond_1a

    const/4 p1, -0x1

    goto :goto_1c

    :cond_1a
    iget p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->づざかべべ:I

    :goto_1c
    move v1, p1

    const/4 v2, 0x1

    const/4 v3, -0x1

    const/4 v4, -0x1

    goto :goto_2d

    :cond_21
    iget-object p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->づざかべべ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    if-nez p1, :cond_27

    const/4 p1, -0x1

    goto :goto_29

    :cond_27
    iget p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->づざかべべ:I

    :goto_29
    move v3, p1

    const/4 v1, -0x1

    const/4 v2, -0x1

    const/4 v4, 0x1

    :goto_2d
    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 2
    invoke-static/range {v1 .. v6}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$くし〴〺ぅ;->げつ〴ぬぐ(IIIIZZ)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$くし〴〺ぅ;

    move-result-object p1

    invoke-virtual {p4, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->ざっざへづ(Ljava/lang/Object;)V

    return-void
.end method

.method public のとけっぬ(ILandroidx/recyclerview/widget/RecyclerView$でどあくず;)V
    .registers 7

    const/4 v0, 0x1

    if-lez p1, :cond_9

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->えげて〱でく()I

    move-result v1

    const/4 v2, 0x1

    goto :goto_10

    :cond_9
    const/4 v1, -0x1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぎがえべぱど()I

    move-result v2

    move v1, v2

    const/4 v2, -0x1

    :goto_10
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iput-boolean v0, v3, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->げつ〴ぬぐ:Z

    invoke-virtual {p0, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->どつち〻ぎづ(ILandroidx/recyclerview/widget/RecyclerView$でどあくず;)V

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->お〵かぜて(I)V

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iget v0, p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->びぐびあび:I

    add-int/2addr v1, v0

    iput v1, p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    iput p1, p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->〺つふすそ:I

    return-void
.end method

.method public のびぶけせ(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇいうげ〱〹(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    if-lez v0, :cond_33

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〴おちすく(Z)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぉいけぐつ(Z)Landroid/view/View;

    move-result-object v0

    if-eqz v1, :cond_33

    if-nez v0, :cond_1b

    goto :goto_33

    :cond_1b
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v0

    if-ge v1, v0, :cond_2c

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V

    goto :goto_33

    :cond_2c
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V

    nop

    :cond_33
    :goto_33
    return-void
.end method

.method public のぷのちつ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->っあつぜっ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public はぁとそぎ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 4

    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->うでこすぢた(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public ばおぢでぎか(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 4

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    if-nez v0, :cond_7

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    return p1

    :cond_7
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ばおぢでぎか(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public final ひ〲どぼぢだ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;I)V
    .registers 8

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_6
    if-ltz v0, :cond_3b

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v3, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v3

    if-lt v3, p2, :cond_3b

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v3, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v3

    if-lt v3, p2, :cond_3b

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->づざかべべ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    iget-object v4, v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ne v4, v1, :cond_30

    return-void

    :cond_30
    iget-object v3, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->づざかべべ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->てぜきぽく()V

    invoke-virtual {p0, v2, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->えみにぃほす(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_6

    :cond_3b
    return-void
.end method

.method public びえぁぜい(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 5

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    return p1

    :cond_8
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->びえぁぜい(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public びぐびあび(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->せづっ〸ちね:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-nez v0, :cond_b

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_b

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->ぺぁあねじ(Ljava/lang/String;)V

    :cond_b
    return-void
.end method

.method public final ぴまけ〸だて(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 21

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->びえぁぜい:Ljava/util/BitSet;

    iget v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-virtual {v0, v9, v1, v10}, Ljava/util/BitSet;->set(IIZ)V

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iget-boolean v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->ぺぁあねじ:Z

    if-eqz v0, :cond_20

    iget v0, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->づざかべべ:I

    if-ne v0, v10, :cond_1d

    const v13, 0x7fffffff

    goto :goto_30

    :cond_1d
    const/high16 v13, -0x80000000

    goto :goto_30

    :cond_20
    iget v0, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->づざかべべ:I

    if-ne v0, v10, :cond_2a

    iget v0, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->ぁごぐすすぃ:I

    iget v1, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->〺つふすそ:I

    add-int/2addr v0, v1

    goto :goto_2f

    :cond_2a
    iget v0, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->なぎぱいぢぎ:I

    iget v1, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->〺つふすそ:I

    sub-int/2addr v0, v1

    :goto_2f
    move v13, v0

    :goto_30
    iget v0, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->づざかべべ:I

    invoke-virtual {v6, v0, v13}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->つびたくず(II)V

    iget-boolean v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇ〳〲〺すっ:Z

    if-eqz v0, :cond_40

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v0

    goto :goto_46

    :cond_40
    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v0

    :goto_46
    move v14, v0

    const/4 v0, 0x0

    .line 1
    :goto_48
    iget v1, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    if-ltz v1, :cond_54

    invoke-virtual/range {p3 .. p3}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v2

    if-ge v1, v2, :cond_54

    const/4 v1, 0x1

    goto :goto_55

    :cond_54
    const/4 v1, 0x0

    :goto_55
    const/4 v2, -0x1

    if-eqz v1, :cond_1e7

    .line 2
    iget-object v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iget-boolean v1, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->ぺぁあねじ:Z

    if-nez v1, :cond_66

    iget-object v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->びえぁぜい:Ljava/util/BitSet;

    invoke-virtual {v1}, Ljava/util/BitSet;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1e7

    .line 3
    :cond_66
    iget v0, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    const-wide v3, 0x7fffffffffffffffL

    .line 4
    invoke-virtual {v7, v0, v9, v3, v4}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぺふねづ〺(IZJ)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v0

    iget-object v15, v0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    .line 5
    iget v0, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    iget v1, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->びぐびあび:I

    add-int/2addr v0, v1

    iput v0, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    .line 6
    invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->げつ〴ぬぐ()I

    move-result v1

    iget-object v3, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぅみぱぎぎ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    .line 7
    iget-object v3, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->げつ〴ぬぐ:[I

    if-eqz v3, :cond_91

    array-length v4, v3

    if-lt v1, v4, :cond_8e

    goto :goto_91

    :cond_8e
    aget v3, v3, v1

    goto :goto_92

    :cond_91
    :goto_91
    const/4 v3, -0x1

    :goto_92
    if-ne v3, v2, :cond_96

    const/4 v4, 0x1

    goto :goto_97

    :cond_96
    const/4 v4, 0x0

    :goto_97
    if-eqz v4, :cond_f5

    .line 8
    iget v3, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->づざかべべ:I

    invoke-virtual {v6, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->つなつぼず(I)Z

    move-result v3

    if-eqz v3, :cond_a7

    iget v3, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    sub-int/2addr v3, v10

    const/4 v4, -0x1

    const/4 v5, -0x1

    goto :goto_ac

    :cond_a7
    iget v3, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    move v4, v3

    const/4 v3, 0x0

    const/4 v5, 0x1

    :goto_ac
    iget v11, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->づざかべべ:I

    const/16 v16, 0x0

    if-ne v11, v10, :cond_ce

    iget-object v11, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v11}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v11

    const v12, 0x7fffffff

    :goto_bb
    if-eq v3, v4, :cond_e7

    iget-object v2, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v2, v2, v3

    invoke-virtual {v2, v11}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ(I)I

    move-result v9

    if-ge v9, v12, :cond_ca

    move-object/from16 v16, v2

    move v12, v9

    :cond_ca
    add-int/2addr v3, v5

    const/4 v2, -0x1

    const/4 v9, 0x0

    goto :goto_bb

    :cond_ce
    iget-object v2, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v2

    const/high16 v9, -0x80000000

    :goto_d6
    if-eq v3, v4, :cond_e7

    iget-object v11, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v11, v11, v3

    invoke-virtual {v11, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->ぺふねづ〺(I)I

    move-result v12

    if-le v12, v9, :cond_e5

    move-object/from16 v16, v11

    move v9, v12

    :cond_e5
    add-int/2addr v3, v5

    goto :goto_d6

    :cond_e7
    move-object/from16 v2, v16

    .line 9
    iget-object v3, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぅみぱぎぎ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;

    .line 10
    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->〺つふすそ(I)V

    iget-object v3, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;->げつ〴ぬぐ:[I

    iget v4, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->づざかべべ:I

    aput v4, v3, v1

    goto :goto_f9

    .line 11
    :cond_f5
    iget-object v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v2, v1, v3

    :goto_f9
    move-object v9, v2

    iput-object v9, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->づざかべべ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    iget v1, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->づざかべべ:I

    if-ne v1, v10, :cond_106

    const/4 v1, -0x1

    const/4 v2, 0x0

    .line 12
    invoke-virtual {v6, v15, v1, v2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->くし〴〺ぅ(Landroid/view/View;IZ)V

    goto :goto_10a

    :cond_106
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v6, v15, v2, v2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->くし〴〺ぅ(Landroid/view/View;IZ)V

    .line 14
    :goto_10a
    iget v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    if-ne v1, v10, :cond_12d

    iget v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぶでにく〼〳:I

    .line 15
    iget v3, v6, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->へぬ〴づぞ:I

    .line 16
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v1, v3, v2, v4, v2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇ〳〲〺すっ(IIIIZ)I

    move-result v1

    .line 17
    iget v2, v6, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉざぅち〻:I

    .line 18
    iget v3, v6, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->おぐぴう〸ず:I

    .line 19
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ておぞぞはね()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げがぴうあだ()I

    move-result v5

    add-int/2addr v5, v4

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {v2, v3, v5, v4, v10}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇ〳〲〺すっ(IIIIZ)I

    move-result v2

    const/4 v5, 0x0

    goto :goto_14b

    .line 20
    :cond_12d
    iget v1, v6, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇぬぎばつ:I

    .line 21
    iget v2, v6, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->へぬ〴づぞ:I

    .line 22
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ながふずは()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぃぜぶの〸ぃ()I

    move-result v4

    add-int/2addr v4, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v1, v2, v4, v3, v10}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇ〳〲〺すっ(IIIIZ)I

    move-result v1

    iget v2, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぶでにく〼〳:I

    .line 23
    iget v3, v6, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->おぐぴう〸ず:I

    .line 24
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v4, v5}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇ〳〲〺すっ(IIIIZ)I

    move-result v2

    :goto_14b
    invoke-virtual {v6, v15, v1, v2, v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぐいぎぽぼ(Landroid/view/View;IIZ)V

    .line 25
    iget v1, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->づざかべべ:I

    if-ne v1, v10, :cond_15e

    invoke-virtual {v9, v14}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ(I)I

    move-result v1

    iget-object v2, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v2, v15}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v2

    add-int/2addr v2, v1

    goto :goto_16a

    :cond_15e
    invoke-virtual {v9, v14}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->ぺふねづ〺(I)I

    move-result v2

    iget-object v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v1, v15}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v1

    sub-int v1, v2, v1

    .line 26
    :goto_16a
    iget v3, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->づざかべべ:I

    iget-object v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->づざかべべ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    if-ne v3, v10, :cond_174

    invoke-virtual {v0, v15}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->げつ〴ぬぐ(Landroid/view/View;)V

    goto :goto_177

    :cond_174
    invoke-virtual {v0, v15}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->へぬ〴づぞ(Landroid/view/View;)V

    .line 27
    :goto_177
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〵げとずぐみ()Z

    move-result v0

    if-eqz v0, :cond_19b

    iget v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    if-ne v0, v10, :cond_19b

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざっざへづ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v0

    iget v3, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    sub-int/2addr v3, v10

    iget v4, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->づざかべべ:I

    sub-int/2addr v3, v4

    iget v4, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぶでにく〼〳:I

    mul-int v3, v3, v4

    sub-int/2addr v0, v3

    iget-object v3, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざっざへづ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v3, v15}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v3

    sub-int v3, v0, v3

    goto :goto_1af

    :cond_19b
    iget v0, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->づざかべべ:I

    iget v3, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぶでにく〼〳:I

    mul-int v0, v0, v3

    iget-object v3, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざっざへづ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v3

    add-int/2addr v3, v0

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざっざへづ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0, v15}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v0

    add-int/2addr v0, v3

    :goto_1af
    iget v4, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    if-ne v4, v10, :cond_1b8

    move v4, v0

    move v5, v2

    move v2, v3

    move v3, v1

    goto :goto_1bb

    :cond_1b8
    move v5, v0

    move v4, v2

    move v2, v1

    :goto_1bb
    move-object/from16 v0, p0

    move-object v1, v15

    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->くぎぶ〼のそ(Landroid/view/View;IIII)V

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iget v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->づざかべべ:I

    invoke-virtual {v6, v9, v0, v13}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ほ〱たうえの(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;II)V

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    invoke-virtual {v6, v7, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->けいっど〱(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;)V

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iget-boolean v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->〳ぜぞぜべっ:Z

    if-eqz v0, :cond_1e2

    invoke-virtual {v15}, Landroid/view/View;->hasFocusable()Z

    move-result v0

    if-eqz v0, :cond_1e2

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->びえぁぜい:Ljava/util/BitSet;

    iget v1, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->づざかべべ:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/BitSet;->set(IZ)V

    goto :goto_1e3

    :cond_1e2
    const/4 v2, 0x0

    :goto_1e3
    const/4 v0, 0x1

    const/4 v9, 0x0

    goto/16 :goto_48

    :cond_1e7
    const/4 v2, 0x0

    if-nez v0, :cond_1ef

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    invoke-virtual {v6, v7, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->けいっど〱(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;)V

    :cond_1ef
    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iget v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->づざかべべ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_208

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v0

    invoke-virtual {v6, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->へざ〴ばび〻(I)I

    move-result v0

    iget-object v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v1

    sub-int/2addr v1, v0

    goto :goto_21a

    :cond_208
    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v0

    invoke-virtual {v6, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->づふぱぐそ〹(I)I

    move-result v0

    iget-object v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v1

    sub-int v1, v0, v1

    :goto_21a
    if-lez v1, :cond_223

    iget v0, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->〺つふすそ:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v9

    goto :goto_224

    :cond_223
    const/4 v9, 0x0

    :goto_224
    return v9
.end method

.method public ぶでにく〼〳(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .registers 3

    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_c

    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    :cond_c
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public へえどぜせ(Landroidx/recyclerview/widget/RecyclerView;III)V
    .registers 5

    const/16 p1, 0x8

    invoke-virtual {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->がぴぽぁぬ(III)V

    return-void
.end method

.method public final へざ〴ばび〻(I)I
    .registers 5

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->ぺふねづ〺(I)I

    move-result v0

    const/4 v1, 0x1

    :goto_a
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-ge v1, v2, :cond_1c

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->ぺふねづ〺(I)I

    move-result v2

    if-ge v2, v0, :cond_19

    move v0, v2

    :cond_19
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_1c
    return v0
.end method

.method public へぬ〴づぞ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->せばぴ〸び(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public へぼ〳〻び(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 4

    const/4 p1, 0x1

    invoke-virtual {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->がぴぽぁぬ(III)V

    return-void
.end method

.method public ぺぁあねじ(IILandroidx/recyclerview/widget/RecyclerView$でどあくず;Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$くし〴〺ぅ;)V
    .registers 9

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    if-nez v0, :cond_5

    goto :goto_6

    :cond_5
    move p1, p2

    :goto_6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result p2

    if-eqz p2, :cond_88

    if-nez p1, :cond_10

    goto/16 :goto_88

    :cond_10
    invoke-virtual {p0, p1, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->のとけっぬ(ILandroidx/recyclerview/widget/RecyclerView$でどあくず;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇとしたべど:[I

    if-eqz p1, :cond_1c

    array-length p1, p1

    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-ge p1, p2, :cond_22

    :cond_1c
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    new-array p1, p1, [I

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇとしたべど:[I

    :cond_22
    const/4 p1, 0x0

    const/4 p2, 0x0

    const/4 v0, 0x0

    :goto_25
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    if-ge p2, v1, :cond_55

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iget v2, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->びぐびあび:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_3b

    iget v1, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->なぎぱいぢぎ:I

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v2, v2, p2

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->ぺふねづ〺(I)I

    move-result v2

    goto :goto_49

    :cond_3b
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->は〲ぱなで:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;

    aget-object v2, v2, p2

    iget v1, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->ぁごぐすすぃ:I

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ(I)I

    move-result v1

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iget v2, v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->ぁごぐすすぃ:I

    :goto_49
    sub-int/2addr v1, v2

    if-ltz v1, :cond_52

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇとしたべど:[I

    aput v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    :cond_52
    add-int/lit8 p2, p2, 0x1

    goto :goto_25

    :cond_55
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇとしたべど:[I

    invoke-static {p2, p1, v0}, Ljava/util/Arrays;->sort([III)V

    const/4 p2, 0x0

    :goto_5b
    if-ge p2, v0, :cond_88

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    .line 1
    iget v1, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    if-ltz v1, :cond_6b

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v2

    if-ge v1, v2, :cond_6b

    const/4 v1, 0x1

    goto :goto_6c

    :cond_6b
    const/4 v1, 0x0

    :goto_6c
    if-eqz v1, :cond_88

    .line 2
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iget v1, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぇとしたべど:[I

    aget v2, v2, p2

    move-object v3, p4

    check-cast v3, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;

    invoke-virtual {v3, v1, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->げつ〴ぬぐ(II)V

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->〻ぞまぎな〻:Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;

    iget v2, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    iget v3, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->びぐびあび:I

    add-int/2addr v2, v3

    iput v2, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    add-int/lit8 p2, p2, 0x1

    goto :goto_5b

    :cond_88
    :goto_88
    return-void
.end method

.method public ぺぃつぢぼ(I)V
    .registers 4

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->せづっ〸ちね:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;

    if-eqz v0, :cond_13

    iget v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->〺つふすそ:I

    if-eq v1, p1, :cond_13

    const/4 v1, 0x0

    .line 1
    iput-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->づざかべべ:[I

    const/4 v1, 0x0

    iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->びぐびあび:I

    const/4 v1, -0x1

    iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->〺つふすそ:I

    iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;->くし〴〺ぅ:I

    .line 2
    :cond_13
    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->なぶひせが:I

    const/high16 p1, -0x80000000

    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->どぇぞほだ:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かちして〹づ()V

    return-void
.end method

.method public ぺがぅす〹ち()Z
    .registers 2

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->じぜこほぱ:I

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    return v0
.end method

.method public ぺでどぜべ(Landroid/graphics/Rect;II)V
    .registers 8

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ながふずは()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぃぜぶの〸ぃ()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ておぞぞはね()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げがぴうあだ()I

    move-result v2

    add-int/2addr v2, v0

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->でどあくず:I

    const/4 v3, 0x1

    if-ne v0, v3, :cond_34

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    add-int/2addr p1, v2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺でおいここ()I

    move-result v0

    invoke-static {p3, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〳ぜぞぜべっ(III)I

    move-result p1

    iget p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぶでにく〼〳:I

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    mul-int p3, p3, v0

    add-int/2addr p3, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇとしたべど()I

    move-result v0

    invoke-static {p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〳ぜぞぜべっ(III)I

    move-result p2

    goto :goto_50

    :cond_34
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p1

    add-int/2addr p1, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇとしたべど()I

    move-result v0

    invoke-static {p2, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〳ぜぞぜべっ(III)I

    move-result p2

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ぶでにく〼〳:I

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ざとぅぼこ〺:I

    mul-int p1, p1, v0

    add-int/2addr p1, v2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺でおいここ()I

    move-result v0

    invoke-static {p3, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〳ぜぞぜべっ(III)I

    move-result p1

    .line 1
    :goto_50
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p3, p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->づざかべべ(Landroidx/recyclerview/widget/RecyclerView;II)V

    return-void
.end method

.method public ぺふねづ〺(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->せばぴ〸び(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public final ほ〱たうえの(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;II)V
    .registers 7

    .line 1
    iget v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->びぐびあび:I

    const/4 v1, -0x1

    const/high16 v2, -0x80000000

    if-ne p2, v1, :cond_15

    .line 2
    iget p2, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    if-eq p2, v2, :cond_c

    goto :goto_11

    :cond_c
    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->くし〴〺ぅ()V

    iget p2, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    :goto_11
    add-int/2addr p2, v0

    if-gt p2, p3, :cond_2a

    goto :goto_22

    .line 3
    :cond_15
    iget p2, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    if-eq p2, v2, :cond_1a

    goto :goto_1f

    :cond_1a
    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->〺つふすそ()V

    iget p2, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    :goto_1f
    sub-int/2addr p2, v0

    if-lt p2, p3, :cond_2a

    .line 4
    :goto_22
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->びえぁぜい:Ljava/util/BitSet;

    iget p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$くし〴〺ぅ;->づざかべべ:I

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3}, Ljava/util/BitSet;->set(IZ)V

    :cond_2a
    return-void
.end method
