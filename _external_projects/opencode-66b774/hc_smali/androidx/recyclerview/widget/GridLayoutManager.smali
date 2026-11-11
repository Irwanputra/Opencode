.class public Landroidx/recyclerview/widget/GridLayoutManager;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;,
        Landroidx/recyclerview/widget/GridLayoutManager$げつ〴ぬぐ;,
        Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;
    }
.end annotation


# instance fields
.field public final 〺でおいここ:Landroid/util/SparseIntArray;

.field public ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

.field public ぉひのべい:Z

.field public final おかぷせ〱:Landroid/util/SparseIntArray;

.field public けときぜと:[Landroid/view/View;

.field public final げがぴうあだ:Landroid/graphics/Rect;

.field public せづっ〸ちね:I

.field public ぷぞてのほき:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .registers 4

    const/4 p1, 0x1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(IZ)V

    .line 2
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぉひのべい:Z

    const/4 p1, -0x1

    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->おかぷせ〱:Landroid/util/SparseIntArray;

    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->〺でおいここ:Landroid/util/SparseIntArray;

    new-instance p1, Landroidx/recyclerview/widget/GridLayoutManager$げつ〴ぬぐ;

    invoke-direct {p1}, Landroidx/recyclerview/widget/GridLayoutManager$げつ〴ぬぐ;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->げがぴうあだ:Landroid/graphics/Rect;

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->ぇちひねぐぬ(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;IIZ)V
    .registers 5

    invoke-direct {p0, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(IZ)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぉひのべい:Z

    const/4 p1, -0x1

    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->おかぷせ〱:Landroid/util/SparseIntArray;

    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->〺でおいここ:Landroid/util/SparseIntArray;

    new-instance p1, Landroidx/recyclerview/widget/GridLayoutManager$げつ〴ぬぐ;

    invoke-direct {p1}, Landroidx/recyclerview/widget/GridLayoutManager$げつ〴ぬぐ;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->げがぴうあだ:Landroid/graphics/Rect;

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->ぇちひねぐぬ(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぉひのべい:Z

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->おかぷせ〱:Landroid/util/SparseIntArray;

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->〺でおいここ:Landroid/util/SparseIntArray;

    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$げつ〴ぬぐ;

    invoke-direct {v0}, Landroidx/recyclerview/widget/GridLayoutManager$げつ〴ぬぐ;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->げがぴうあだ:Landroid/graphics/Rect;

    invoke-static {p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->えがぐせほち(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$びぐびあび;

    move-result-object p1

    iget p1, p1, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$びぐびあび;->〺つふすそ:I

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->ぇちひねぐぬ(I)V

    return-void
.end method


# virtual methods
.method public 〳に〴あぽ()Z
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    if-nez v0, :cond_a

    iget-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぉひのべい:Z

    if-nez v0, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    return v0
.end method

.method public final 〵く〵す〺()V
    .registers 3

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_11

    .line 2
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇぬぎばつ:I

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぃぜぶの〸ぃ()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ながふずは()I

    move-result v1

    goto :goto_1c

    .line 4
    :cond_11
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉざぅち〻:I

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げがぴうあだ()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ておぞぞはね()I

    move-result v1

    :goto_1c
    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->ぁこき〸せ(I)V

    return-void
.end method

.method public 〵げとずぐみ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;III)Landroid/view/View;
    .registers 13

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉいけぐつ()V

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v1

    if-le p4, p3, :cond_13

    const/4 v2, 0x1

    goto :goto_14

    :cond_13
    const/4 v2, -0x1

    :goto_14
    const/4 v3, 0x0

    move-object v4, v3

    :goto_16
    if-eq p3, p4, :cond_52

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v6

    if-ltz v6, :cond_50

    if-ge v6, p5, :cond_50

    invoke-virtual {p0, p1, p2, v6}, Landroidx/recyclerview/widget/GridLayoutManager;->へぐこ〺ば(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;I)I

    move-result v6

    if-eqz v6, :cond_2b

    goto :goto_50

    :cond_2b
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->くし〴〺ぅ()Z

    move-result v6

    if-eqz v6, :cond_3b

    if-nez v4, :cond_50

    move-object v4, v5

    goto :goto_50

    :cond_3b
    iget-object v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6, v5}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v6

    if-ge v6, v1, :cond_4d

    iget-object v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6, v5}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result v6

    if-ge v6, v0, :cond_4c

    goto :goto_4d

    :cond_4c
    return-object v5

    :cond_4d
    :goto_4d
    if-nez v3, :cond_50

    move-object v3, v5

    :cond_50
    :goto_50
    add-int/2addr p3, v2

    goto :goto_16

    :cond_52
    if-eqz v3, :cond_55

    goto :goto_56

    :cond_55
    move-object v3, v4

    :goto_56
    return-object v3
.end method

.method public 〺〲に〼へ〸(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)V
    .registers 2

    const/4 p1, 0x0

    .line 1
    iput-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    const/4 p1, -0x1

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぇ〳〲〺すっ:I

    const/high16 p1, -0x80000000

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->びえぁぜい:I

    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->どぇぞほだ:Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぉひのべい:Z

    return-void
.end method

.method public final ぁこき〸せ(I)V
    .registers 9

    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぷぞてのほき:[I

    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    const/4 v2, 0x1

    if-eqz v0, :cond_12

    .line 1
    array-length v3, v0

    add-int/lit8 v4, v1, 0x1

    if-ne v3, v4, :cond_12

    array-length v3, v0

    sub-int/2addr v3, v2

    aget v3, v0, v3

    if-eq v3, p1, :cond_16

    :cond_12
    add-int/lit8 v0, v1, 0x1

    new-array v0, v0, [I

    :cond_16
    const/4 v3, 0x0

    aput v3, v0, v3

    div-int v4, p1, v1

    rem-int/2addr p1, v1

    const/4 v5, 0x0

    :goto_1d
    if-gt v2, v1, :cond_31

    add-int/2addr v3, p1

    if-lez v3, :cond_2a

    sub-int v6, v1, v3

    if-ge v6, p1, :cond_2a

    add-int/lit8 v6, v4, 0x1

    sub-int/2addr v3, v1

    goto :goto_2b

    :cond_2a
    move v6, v4

    :goto_2b
    add-int/2addr v5, v6

    aput v5, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1d

    .line 2
    :cond_31
    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぷぞてのほき:[I

    return-void
.end method

.method public ぁごぐすすぃ(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z
    .registers 2

    instance-of p1, p1, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    return p1
.end method

.method public ぁないぼぎへ(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    .line 1
    iget-object p1, p1, Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;->げつ〴ぬぐ:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 2
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    .line 3
    iget-object p1, p1, Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;->〺つふすそ:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

.method public final いぐなへねか(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;I)I
    .registers 6

    .line 1
    iget-boolean p2, p2, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    const/4 v0, 0x1

    if-nez p2, :cond_b

    .line 2
    :cond_5
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v0

    :cond_b
    iget-object p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->おかぷせ〱:Landroid/util/SparseIntArray;

    const/4 v1, -0x1

    invoke-virtual {p2, p3, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result p2

    if-eq p2, v1, :cond_15

    return p2

    :cond_15
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ(I)I

    move-result p1

    if-ne p1, v1, :cond_5

    return v0
.end method

.method public ぅばづそほせ(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 4

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    .line 1
    iget-object p1, p1, Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;->げつ〴ぬぐ:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 2
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    .line 3
    iget-object p1, p1, Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;->〺つふすそ:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

.method public ぇちひねぐぬ(I)V
    .registers 4

    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    if-ne p1, v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぉひのべい:Z

    if-lt p1, v0, :cond_17

    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    .line 1
    iget-object p1, p1, Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;->げつ〴ぬぐ:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かちして〹づ()V

    return-void

    :cond_17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Span count should be at least 1. Provided "

    invoke-static {v1, p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ぇぬぎばつ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->っあつぜっ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public おぐぴう〸ず(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->〵いどうねぢ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public おぬぃかはど(Landroidx/recyclerview/widget/RecyclerView$でどあくず;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$くし〴〺ぅ;)V
    .registers 10

    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_4
    iget v3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    if-ge v2, v3, :cond_2f

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)Z

    move-result v3

    if-eqz v3, :cond_2f

    if-lez v0, :cond_2f

    iget v3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぁごぐすすぃ:I

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    move-object v5, p3

    check-cast v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;

    invoke-virtual {v5, v3, v4}, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->げつ〴ぬぐ(II)V

    iget-object v3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v0, v0, -0x1

    iget v3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->づざかべべ:I

    add-int/2addr v3, v4

    iput v3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_2f
    return-void
.end method

.method public かこあぇ〸〼(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;I)V
    .registers 9

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->〵く〵す〺()V

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v0

    if-lez v0, :cond_40

    .line 1
    iget-boolean v0, p2, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-nez v0, :cond_40

    const/4 v0, 0x1

    if-ne p4, v0, :cond_12

    const/4 p4, 0x1

    goto :goto_13

    :cond_12
    const/4 p4, 0x0

    .line 2
    :goto_13
    iget v1, p3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->〺つふすそ:I

    invoke-virtual {p0, p1, p2, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->へぐこ〺ば(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;I)I

    move-result v1

    if-eqz p4, :cond_2a

    :goto_1b
    if-lez v1, :cond_40

    iget p4, p3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->〺つふすそ:I

    if-lez p4, :cond_40

    add-int/lit8 p4, p4, -0x1

    iput p4, p3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->〺つふすそ:I

    invoke-virtual {p0, p1, p2, p4}, Landroidx/recyclerview/widget/GridLayoutManager;->へぐこ〺ば(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;I)I

    move-result v1

    goto :goto_1b

    :cond_2a
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result p4

    sub-int/2addr p4, v0

    iget v0, p3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->〺つふすそ:I

    :goto_31
    if-ge v0, p4, :cond_3e

    add-int/lit8 v2, v0, 0x1

    invoke-virtual {p0, p1, p2, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->へぐこ〺ば(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;I)I

    move-result v3

    if-le v3, v1, :cond_3e

    move v0, v2

    move v1, v3

    goto :goto_31

    :cond_3e
    iput v0, p3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->〺つふすそ:I

    .line 3
    :cond_40
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->びあぞほ〹()V

    return-void
.end method

.method public がぐくいおす(Landroidx/recyclerview/widget/RecyclerView;IILjava/lang/Object;)V
    .registers 5

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    .line 1
    iget-object p1, p1, Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;->げつ〴ぬぐ:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 2
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    .line 3
    iget-object p1, p1, Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;->〺つふすそ:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

.method public きぬどぼみ〸(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)Landroid/view/View;
    .registers 27

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->は〲ぱなで(Landroid/view/View;)Landroid/view/View;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_e

    return-object v4

    :cond_e
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    iget v6, v5, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->づざかべべ:I

    iget v5, v5, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->なぎぱいぢぎ:I

    add-int/2addr v5, v6

    invoke-super/range {p0 .. p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->きぬどぼみ〸(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)Landroid/view/View;

    move-result-object v7

    if-nez v7, :cond_20

    return-object v4

    :cond_20
    move/from16 v7, p2

    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぴまけ〸だて(I)I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v8, :cond_2b

    const/4 v7, 0x1

    goto :goto_2c

    :cond_2b
    const/4 v7, 0x0

    :goto_2c
    iget-boolean v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    if-eq v7, v10, :cond_32

    const/4 v7, 0x1

    goto :goto_33

    :cond_32
    const/4 v7, 0x0

    :goto_33
    const/4 v10, -0x1

    if-eqz v7, :cond_3e

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v7

    sub-int/2addr v7, v8

    const/4 v11, -0x1

    const/4 v12, -0x1

    goto :goto_45

    :cond_3e
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v7

    move v11, v7

    const/4 v7, 0x0

    const/4 v12, 0x1

    :goto_45
    iget v13, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    if-ne v13, v8, :cond_51

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->けいっど〱()Z

    move-result v13

    if-eqz v13, :cond_51

    const/4 v13, 0x1

    goto :goto_52

    :cond_51
    const/4 v13, 0x0

    :goto_52
    invoke-virtual {v0, v1, v2, v7}, Landroidx/recyclerview/widget/GridLayoutManager;->へたぁて〻(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;I)I

    move-result v14

    move v10, v7

    move/from16 v16, v12

    const/4 v8, -0x1

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v15, -0x1

    move-object v7, v4

    :goto_5e
    if-eq v10, v11, :cond_128

    move/from16 v17, v11

    invoke-virtual {v0, v1, v2, v10}, Landroidx/recyclerview/widget/GridLayoutManager;->へたぁて〻(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;I)I

    move-result v11

    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v1

    if-ne v1, v3, :cond_6e

    goto/16 :goto_128

    :cond_6e
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v18

    if-eqz v18, :cond_83

    if-eq v11, v14, :cond_83

    if-eqz v4, :cond_7a

    goto/16 :goto_128

    :cond_7a
    move-object/from16 v18, v3

    move-object/from16 v21, v7

    move/from16 v19, v9

    const/4 v9, 0x0

    goto/16 :goto_118

    :cond_83
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    iget v2, v11, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->づざかべべ:I

    move-object/from16 v18, v3

    iget v3, v11, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->なぎぱいぢぎ:I

    add-int/2addr v3, v2

    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v19

    if-eqz v19, :cond_9b

    if-ne v2, v6, :cond_9b

    if-ne v3, v5, :cond_9b

    return-object v1

    :cond_9b
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v19

    if-eqz v19, :cond_a3

    if-eqz v4, :cond_ab

    :cond_a3
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v19

    if-nez v19, :cond_ae

    if-nez v7, :cond_ae

    :cond_ab
    move-object/from16 v21, v7

    goto :goto_cc

    :cond_ae
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v19

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v20

    move-object/from16 v21, v7

    sub-int v7, v20, v19

    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v19

    if-eqz v19, :cond_d1

    if-le v7, v9, :cond_c3

    goto :goto_cc

    :cond_c3
    if-ne v7, v9, :cond_ea

    if-le v2, v15, :cond_c9

    const/4 v7, 0x1

    goto :goto_ca

    :cond_c9
    const/4 v7, 0x0

    :goto_ca
    if-ne v13, v7, :cond_ea

    :goto_cc
    move/from16 v19, v9

    const/4 v7, 0x1

    const/4 v9, 0x0

    goto :goto_ee

    :cond_d1
    if-nez v4, :cond_ea

    move/from16 v19, v9

    const/4 v9, 0x0

    invoke-virtual {v0, v1, v9}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〱こか〺ぃせ(Landroid/view/View;Z)Z

    move-result v20

    if-eqz v20, :cond_ed

    if-le v7, v12, :cond_df

    goto :goto_e8

    :cond_df
    if-ne v7, v12, :cond_ed

    if-le v2, v8, :cond_e5

    const/4 v7, 0x1

    goto :goto_e6

    :cond_e5
    const/4 v7, 0x0

    :goto_e6
    if-ne v13, v7, :cond_ed

    :goto_e8
    const/4 v7, 0x1

    goto :goto_ee

    :cond_ea
    move/from16 v19, v9

    const/4 v9, 0x0

    :cond_ed
    const/4 v7, 0x0

    :goto_ee
    if-eqz v7, :cond_118

    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v7

    if-eqz v7, :cond_109

    iget v4, v11, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->づざかべべ:I

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int v2, v3, v2

    move/from16 v19, v2

    move v15, v4

    move-object/from16 v7, v21

    move-object v4, v1

    goto :goto_11a

    :cond_109
    iget v7, v11, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->づざかべべ:I

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int v12, v3, v2

    move v8, v7

    move-object v7, v1

    goto :goto_11a

    :cond_118
    :goto_118
    move-object/from16 v7, v21

    :goto_11a
    add-int v10, v10, v16

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move/from16 v11, v17

    move-object/from16 v3, v18

    move/from16 v9, v19

    goto/16 :goto_5e

    :cond_128
    :goto_128
    move-object/from16 v21, v7

    if-eqz v4, :cond_12d

    goto :goto_12f

    :cond_12d
    move-object/from16 v4, v21

    :goto_12f
    return-object v4
.end method

.method public く〱なおぎ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 5

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->〵く〵す〺()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->びあぞほ〹()V

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    if-nez v0, :cond_c

    const/4 p1, 0x0

    goto :goto_10

    :cond_c
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->どつち〻ぎづ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    :goto_10
    return p1
.end method

.method public さぬうづぃ(Z)V
    .registers 3

    if-nez p1, :cond_12

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->びぐびあび(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->〻ぞまぎな〻:Z

    if-nez v0, :cond_c

    goto :goto_11

    :cond_c
    iput-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->〻ぞまぎな〻:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かちして〹づ()V

    :goto_11
    return-void

    .line 2
    :cond_12
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "GridLayoutManager does not support stack from end. Consider using reverse layout"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ざっざへづ()Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .registers 4

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    const/4 v1, -0x2

    const/4 v2, -0x1

    if-nez v0, :cond_c

    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;-><init>(II)V

    return-object v0

    :cond_c
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    invoke-direct {v0, v2, v1}, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public しげにけぃ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)V
    .registers 9

    .line 1
    iget-boolean v0, p2, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-eqz v0, :cond_2a

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    const/4 v1, 0x0

    :goto_9
    if-ge v1, v0, :cond_2a

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->げつ〴ぬぐ()I

    move-result v3

    iget-object v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->おかぷせ〱:Landroid/util/SparseIntArray;

    .line 3
    iget v5, v2, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->なぎぱいぢぎ:I

    .line 4
    invoke-virtual {v4, v3, v5}, Landroid/util/SparseIntArray;->put(II)V

    iget-object v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->〺でおいここ:Landroid/util/SparseIntArray;

    .line 5
    iget v2, v2, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->づざかべべ:I

    .line 6
    invoke-virtual {v4, v3, v2}, Landroid/util/SparseIntArray;->put(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    .line 7
    :cond_2a
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->しげにけぃ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)V

    .line 8
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->おかぷせ〱:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->〺でおいここ:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

.method public final ず〱したつ(Landroid/view/View;IZ)V
    .registers 12

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->〺つふすそ:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->top:I

    iget v3, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v2, v3

    iget v3, v1, Landroid/graphics/Rect;->left:I

    iget v1, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v3, v1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v3, v1

    iget v1, v0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->づざかべべ:I

    iget v4, v0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->なぎぱいぢぎ:I

    invoke-virtual {p0, v1, v4}, Landroidx/recyclerview/widget/GridLayoutManager;->てぞま〱ぁ(II)I

    move-result v1

    iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v4, v6, :cond_41

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v1, p2, v3, v4, v5}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇ〳〲〺すっ(IIIIZ)I

    move-result p2

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->てぜきぽく()I

    move-result v1

    .line 1
    iget v3, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->おぐぴう〸ず:I

    .line 2
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {v1, v3, v2, v0, v6}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇ〳〲〺すっ(IIIIZ)I

    move-result v0

    goto :goto_58

    :cond_41
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {v1, p2, v2, v4, v5}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇ〳〲〺すっ(IIIIZ)I

    move-result p2

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->てぜきぽく()I

    move-result v1

    .line 3
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->へぬ〴づぞ:I

    .line 4
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v1, v2, v3, v0, v6}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇ〳〲〺すっ(IIIIZ)I

    move-result v0

    move v7, v0

    move v0, p2

    move p2, v7

    :goto_58
    invoke-virtual {p0, p1, p2, v0, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->ぱぬが〹〹に(Landroid/view/View;IIZ)V

    return-void
.end method

.method public てぜきぽく(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->〵いどうねぢ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public てぞま〱ぁ(II)I
    .registers 6

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_19

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->けいっど〱()Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぷぞてのほき:[I

    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    sub-int v2, v1, p1

    aget v2, v0, v2

    sub-int/2addr v1, p1

    sub-int/2addr v1, p2

    aget p1, v0, v1

    sub-int/2addr v2, p1

    return v2

    :cond_19
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぷぞてのほき:[I

    add-int/2addr p2, p1

    aget p2, v0, p2

    aget p1, v0, p1

    sub-int/2addr p2, p1

    return p2
.end method

.method public でどあくず(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .registers 4

    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    invoke-direct {v0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public にぢ〱ぁな(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V
    .registers 12

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    if-nez v1, :cond_c

    invoke-virtual {p0, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉねぞはがぞ(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V

    return-void

    :cond_c
    check-cast v0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->げつ〴ぬぐ()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->へたぁて〻(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;I)I

    move-result p1

    iget p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    if-nez p2, :cond_23

    .line 1
    iget v1, v0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->づざかべべ:I

    .line 2
    iget v2, v0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->なぎぱいぢぎ:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v3, p1

    goto :goto_2b

    :cond_23
    const/4 v2, 0x1

    .line 3
    iget v3, v0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->づざかべべ:I

    .line 4
    iget v4, v0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->なぎぱいぢぎ:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v1, p1

    .line 5
    :goto_2b
    invoke-static/range {v1 .. v6}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$くし〴〺ぅ;->げつ〴ぬぐ(IIIIZZ)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$くし〴〺ぅ;

    move-result-object p1

    invoke-virtual {p4, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->ざっざへづ(Ljava/lang/Object;)V

    return-void
.end method

.method public のぷのちつ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->っあつぜっ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public はぁとそぎ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 6

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->〵く〵す〺()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->びあぞほ〹()V

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_d

    const/4 p1, 0x0

    goto :goto_11

    :cond_d
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->どつち〻ぎづ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    :goto_11
    return p1
.end method

.method public ばおぢでぎか(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 5

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    if-nez v0, :cond_7

    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    return p1

    :cond_7
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_10

    const/4 p1, 0x0

    return p1

    :cond_10
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->へたぁて〻(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;I)I

    move-result p1

    add-int/2addr p1, v1

    return p1
.end method

.method public final ぱぬが〹〹に(Landroid/view/View;IIZ)V
    .registers 6

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    if-eqz p4, :cond_d

    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->え〱さぽぜ(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z

    move-result p4

    goto :goto_11

    :cond_d
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->づあてぐく(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z

    move-result p4

    :goto_11
    if-eqz p4, :cond_16

    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    :cond_16
    return-void
.end method

.method public ひ〲どぼぢだ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;)V
    .registers 23

    move-object/from16 v6, p0

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v7, p4

    iget-object v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->いいにぽつ()I

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    const/4 v8, 0x1

    const/4 v5, 0x0

    if-eq v3, v4, :cond_18

    const/4 v9, 0x1

    goto :goto_19

    :cond_18
    const/4 v9, 0x0

    :goto_19
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v10

    if-lez v10, :cond_26

    iget-object v10, v6, Landroidx/recyclerview/widget/GridLayoutManager;->ぷぞてのほき:[I

    iget v11, v6, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    aget v10, v10, v11

    goto :goto_27

    :cond_26
    const/4 v10, 0x0

    :goto_27
    if-eqz v9, :cond_2c

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/GridLayoutManager;->〵く〵す〺()V

    :cond_2c
    iget v11, v2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->づざかべべ:I

    if-ne v11, v8, :cond_32

    const/4 v11, 0x1

    goto :goto_33

    :cond_32
    const/4 v11, 0x0

    :goto_33
    iget v12, v6, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    if-nez v11, :cond_44

    iget v12, v2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    invoke-virtual {v6, v0, v1, v12}, Landroidx/recyclerview/widget/GridLayoutManager;->へぐこ〺ば(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;I)I

    move-result v12

    iget v13, v2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    invoke-virtual {v6, v0, v1, v13}, Landroidx/recyclerview/widget/GridLayoutManager;->いぐなへねか(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;I)I

    move-result v13

    add-int/2addr v12, v13

    :cond_44
    const/4 v13, 0x0

    :goto_45
    iget v14, v6, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    if-ge v13, v14, :cond_9d

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)Z

    move-result v14

    if-eqz v14, :cond_9d

    if-lez v12, :cond_9d

    iget v14, v2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    invoke-virtual {v6, v0, v1, v14}, Landroidx/recyclerview/widget/GridLayoutManager;->いぐなへねか(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;I)I

    move-result v15

    iget v4, v6, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    if-gt v15, v4, :cond_6f

    sub-int/2addr v12, v15

    if-gez v12, :cond_5f

    goto :goto_9d

    :cond_5f
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->くし〴〺ぅ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)Landroid/view/View;

    move-result-object v4

    if-nez v4, :cond_66

    goto :goto_9d

    :cond_66
    iget-object v14, v6, Landroidx/recyclerview/widget/GridLayoutManager;->けときぜと:[Landroid/view/View;

    aput-object v4, v14, v13

    add-int/lit8 v13, v13, 0x1

    const/high16 v4, 0x40000000    # 2.0f

    goto :goto_45

    :cond_6f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Item at position "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " requires "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " spans but GridLayoutManager has only "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v6, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " spans."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9d
    :goto_9d
    if-nez v13, :cond_a2

    iput-boolean v8, v7, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->〺つふすそ:Z

    return-void

    :cond_a2
    if-eqz v11, :cond_aa

    move v14, v13

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    goto :goto_b0

    :cond_aa
    add-int/lit8 v12, v13, -0x1

    const/4 v14, -0x1

    const/4 v15, 0x0

    const/16 v16, -0x1

    :goto_b0
    if-eq v12, v14, :cond_cf

    .line 1
    iget-object v4, v6, Landroidx/recyclerview/widget/GridLayoutManager;->けときぜと:[Landroid/view/View;

    aget-object v4, v4, v12

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v17

    move-object/from16 v8, v17

    check-cast v8, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    invoke-virtual {v6, v4}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v4

    invoke-virtual {v6, v0, v1, v4}, Landroidx/recyclerview/widget/GridLayoutManager;->いぐなへねか(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;I)I

    move-result v4

    iput v4, v8, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->なぎぱいぢぎ:I

    iput v15, v8, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->づざかべべ:I

    add-int/2addr v15, v4

    add-int v12, v12, v16

    const/4 v8, 0x1

    goto :goto_b0

    :cond_cf
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    :goto_d2
    if-ge v1, v13, :cond_12c

    .line 2
    iget-object v8, v6, Landroidx/recyclerview/widget/GridLayoutManager;->けときぜと:[Landroid/view/View;

    aget-object v8, v8, v1

    iget-object v12, v2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぺふねづ〺:Ljava/util/List;

    if-nez v12, :cond_e6

    if-eqz v11, :cond_e2

    invoke-virtual {v6, v8}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ(Landroid/view/View;)V

    goto :goto_f2

    .line 3
    :cond_e2
    invoke-virtual {v6, v8, v5, v5}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->くし〴〺ぅ(Landroid/view/View;IZ)V

    goto :goto_f2

    :cond_e6
    if-eqz v11, :cond_ee

    const/4 v12, -0x1

    const/4 v14, 0x1

    .line 4
    invoke-virtual {v6, v8, v12, v14}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->くし〴〺ぅ(Landroid/view/View;IZ)V

    goto :goto_f2

    :cond_ee
    const/4 v14, 0x1

    .line 5
    invoke-virtual {v6, v8, v5, v14}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->くし〴〺ぅ(Landroid/view/View;IZ)V

    .line 6
    :goto_f2
    iget-object v12, v6, Landroidx/recyclerview/widget/GridLayoutManager;->げがぴうあだ:Landroid/graphics/Rect;

    .line 7
    iget-object v14, v6, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v14, :cond_fc

    invoke-virtual {v12, v5, v5, v5, v5}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_103

    :cond_fc
    invoke-virtual {v14, v8}, Landroidx/recyclerview/widget/RecyclerView;->〺でおいここ(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v14

    invoke-virtual {v12, v14}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 8
    :goto_103
    invoke-virtual {v6, v8, v3, v5}, Landroidx/recyclerview/widget/GridLayoutManager;->ず〱したつ(Landroid/view/View;IZ)V

    iget-object v12, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v12, v8}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v12

    if-le v12, v4, :cond_10f

    move v4, v12

    :cond_10f
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    check-cast v12, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    const/high16 v14, 0x3f800000    # 1.0f

    iget-object v15, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v15, v8}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->びぐびあび(Landroid/view/View;)I

    move-result v8

    int-to-float v8, v8

    mul-float v8, v8, v14

    iget v12, v12, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->なぎぱいぢぎ:I

    int-to-float v12, v12

    div-float/2addr v8, v12

    cmpl-float v12, v8, v0

    if-lez v12, :cond_129

    move v0, v8

    :cond_129
    add-int/lit8 v1, v1, 0x1

    goto :goto_d2

    :cond_12c
    if-eqz v9, :cond_158

    .line 9
    iget v1, v6, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    int-to-float v1, v1

    mul-float v0, v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v0, v10}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {v6, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->ぁこき〸せ(I)V

    const/4 v0, 0x0

    const/4 v4, 0x0

    :goto_140
    if-ge v0, v13, :cond_158

    .line 10
    iget-object v1, v6, Landroidx/recyclerview/widget/GridLayoutManager;->けときぜと:[Landroid/view/View;

    aget-object v1, v1, v0

    const/high16 v3, 0x40000000    # 2.0f

    const/4 v8, 0x1

    invoke-virtual {v6, v1, v3, v8}, Landroidx/recyclerview/widget/GridLayoutManager;->ず〱したつ(Landroid/view/View;IZ)V

    iget-object v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v3, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v1

    if-le v1, v4, :cond_155

    move v4, v1

    :cond_155
    add-int/lit8 v0, v0, 0x1

    goto :goto_140

    :cond_158
    const/4 v0, 0x0

    :goto_159
    if-ge v0, v13, :cond_1ba

    iget-object v1, v6, Landroidx/recyclerview/widget/GridLayoutManager;->けときぜと:[Landroid/view/View;

    aget-object v1, v1, v0

    iget-object v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v3, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v3

    if-eq v3, v4, :cond_1b4

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    iget-object v8, v3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->〺つふすそ:Landroid/graphics/Rect;

    iget v9, v8, Landroid/graphics/Rect;->top:I

    iget v10, v8, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v9, v10

    iget v10, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v9, v10

    iget v10, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v9, v10

    iget v10, v8, Landroid/graphics/Rect;->left:I

    iget v8, v8, Landroid/graphics/Rect;->right:I

    add-int/2addr v10, v8

    iget v8, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v10, v8

    iget v8, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v10, v8

    iget v8, v3, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->づざかべべ:I

    iget v11, v3, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->なぎぱいぢぎ:I

    invoke-virtual {v6, v8, v11}, Landroidx/recyclerview/widget/GridLayoutManager;->てぞま〱ぁ(II)I

    move-result v8

    iget v11, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    const/4 v12, 0x1

    if-ne v11, v12, :cond_1a1

    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    const/high16 v11, 0x40000000    # 2.0f

    invoke-static {v8, v11, v10, v3, v5}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇ〳〲〺すっ(IIIIZ)I

    move-result v3

    sub-int v8, v4, v9

    invoke-static {v8, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    goto :goto_1b0

    :cond_1a1
    const/high16 v11, 0x40000000    # 2.0f

    sub-int v10, v4, v10

    invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {v8, v11, v9, v3, v5}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇ〳〲〺すっ(IIIIZ)I

    move-result v8

    move v3, v10

    :goto_1b0
    invoke-virtual {v6, v1, v3, v8, v12}, Landroidx/recyclerview/widget/GridLayoutManager;->ぱぬが〹〹に(Landroid/view/View;IIZ)V

    goto :goto_1b7

    :cond_1b4
    const/high16 v11, 0x40000000    # 2.0f

    const/4 v12, 0x1

    :goto_1b7
    add-int/lit8 v0, v0, 0x1

    goto :goto_159

    :cond_1ba
    const/4 v12, 0x1

    iput v4, v7, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->げつ〴ぬぐ:I

    iget v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    if-ne v0, v12, :cond_1d3

    iget v0, v2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->なぎぱいぢぎ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1cb

    iget v0, v2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    sub-int v1, v0, v4

    goto :goto_1cf

    :cond_1cb
    iget v1, v2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    add-int v0, v4, v1

    :goto_1cf
    move v2, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    goto :goto_1e5

    :cond_1d3
    const/4 v1, -0x1

    iget v0, v2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->なぎぱいぢぎ:I

    if-ne v0, v1, :cond_1dd

    iget v0, v2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    sub-int v1, v0, v4

    goto :goto_1e1

    :cond_1dd
    iget v1, v2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    add-int v0, v4, v1

    :goto_1e1
    move v3, v1

    const/4 v2, 0x0

    move v1, v0

    const/4 v0, 0x0

    :goto_1e5
    const/4 v8, 0x0

    :goto_1e6
    if-ge v8, v13, :cond_26f

    iget-object v4, v6, Landroidx/recyclerview/widget/GridLayoutManager;->けときぜと:[Landroid/view/View;

    aget-object v9, v4, v8

    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    iget v4, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    const/4 v5, 0x1

    if-ne v4, v5, :cond_22c

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->けいっど〱()Z

    move-result v1

    if-eqz v1, :cond_215

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ながふずは()I

    move-result v1

    iget-object v3, v6, Landroidx/recyclerview/widget/GridLayoutManager;->ぷぞてのほき:[I

    iget v4, v6, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    iget v5, v10, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->づざかべべ:I

    sub-int/2addr v4, v5

    aget v3, v3, v4

    add-int/2addr v1, v3

    iget-object v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v3, v9}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->びぐびあび(Landroid/view/View;)I

    move-result v3

    sub-int v3, v1, v3

    goto :goto_23e

    :cond_215
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ながふずは()I

    move-result v1

    iget-object v3, v6, Landroidx/recyclerview/widget/GridLayoutManager;->ぷぞてのほき:[I

    iget v4, v10, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->づざかべべ:I

    aget v3, v3, v4

    add-int/2addr v1, v3

    iget-object v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v3, v9}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->びぐびあび(Landroid/view/View;)I

    move-result v3

    add-int/2addr v3, v1

    move v11, v0

    move v15, v1

    move v14, v2

    move v12, v3

    goto :goto_242

    :cond_22c
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ておぞぞはね()I

    move-result v0

    iget-object v2, v6, Landroidx/recyclerview/widget/GridLayoutManager;->ぷぞてのほき:[I

    iget v4, v10, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;->づざかべべ:I

    aget v2, v2, v4

    add-int/2addr v2, v0

    iget-object v0, v6, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0, v9}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->びぐびあび(Landroid/view/View;)I

    move-result v0

    add-int/2addr v0, v2

    :goto_23e
    move v11, v0

    move v12, v1

    move v14, v2

    move v15, v3

    :goto_242
    move-object/from16 v0, p0

    move-object v1, v9

    move v2, v15

    move v3, v14

    move v4, v12

    move v5, v11

    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->くぎぶ〼のそ(Landroid/view/View;IIII)V

    invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->くし〴〺ぅ()Z

    move-result v0

    if-nez v0, :cond_25b

    invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_259

    goto :goto_25b

    :cond_259
    const/4 v0, 0x1

    goto :goto_25e

    :cond_25b
    :goto_25b
    const/4 v0, 0x1

    iput-boolean v0, v7, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->くし〴〺ぅ:Z

    :goto_25e
    iget-boolean v1, v7, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->びぐびあび:Z

    invoke-virtual {v9}, Landroid/view/View;->hasFocusable()Z

    move-result v2

    or-int/2addr v1, v2

    iput-boolean v1, v7, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->びぐびあび:Z

    add-int/lit8 v8, v8, 0x1

    move v0, v11

    move v1, v12

    move v2, v14

    move v3, v15

    goto/16 :goto_1e6

    :cond_26f
    iget-object v0, v6, Landroidx/recyclerview/widget/GridLayoutManager;->けときぜと:[Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final びあぞほ〹()V
    .registers 3

    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->けときぜと:[Landroid/view/View;

    if-eqz v0, :cond_9

    array-length v0, v0

    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    if-eq v0, v1, :cond_f

    :cond_9
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    new-array v0, v0, [Landroid/view/View;

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->けときぜと:[Landroid/view/View;

    :cond_f
    return-void
.end method

.method public びえぁぜい(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 5

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    return p1

    :cond_8
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v0

    if-ge v0, v1, :cond_10

    const/4 p1, 0x0

    return p1

    :cond_10
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->へたぁて〻(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;I)I

    move-result p1

    add-int/2addr p1, v1

    return p1
.end method

.method public ぶでにく〼〳(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .registers 3

    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_c

    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    :cond_c
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public へえどぜせ(Landroidx/recyclerview/widget/RecyclerView;III)V
    .registers 5

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    .line 1
    iget-object p1, p1, Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;->げつ〴ぬぐ:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 2
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    .line 3
    iget-object p1, p1, Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;->〺つふすそ:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

.method public final へぐこ〺ば(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;I)I
    .registers 5

    .line 1
    iget-boolean p2, p2, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-nez p2, :cond_d

    .line 2
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    iget p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    rem-int/2addr p3, p2

    return p3

    .line 5
    :cond_d
    iget-object p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->〺でおいここ:Landroid/util/SparseIntArray;

    const/4 v0, -0x1

    invoke-virtual {p2, p3, v0}, Landroid/util/SparseIntArray;->get(II)I

    move-result p2

    if-eq p2, v0, :cond_17

    return p2

    :cond_17
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ(I)I

    move-result p1

    if-ne p1, v0, :cond_1f

    const/4 p1, 0x0

    return p1

    :cond_1f
    iget-object p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    iget p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    rem-int/2addr p1, p3

    return p1
.end method

.method public final へたぁて〻(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;I)I
    .registers 4

    .line 1
    iget-boolean p2, p2, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-nez p2, :cond_d

    .line 2
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    iget p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    .line 3
    invoke-virtual {p1, p3, p2}, Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;->げつ〴ぬぐ(II)I

    move-result p1

    return p1

    .line 4
    :cond_d
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ(I)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_16

    const/4 p1, 0x0

    return p1

    :cond_16
    iget-object p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    iget p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    .line 5
    invoke-virtual {p2, p1, p3}, Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;->げつ〴ぬぐ(II)I

    move-result p1

    return p1
.end method

.method public へぼ〳〻び(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 4

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    .line 1
    iget-object p1, p1, Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;->げつ〴ぬぐ:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 2
    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぇとしたべど:Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;

    .line 3
    iget-object p1, p1, Landroidx/recyclerview/widget/GridLayoutManager$〺つふすそ;->〺つふすそ:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

.method public ぺでどぜべ(Landroid/graphics/Rect;II)V
    .registers 8

    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぷぞてのほき:[I

    if-nez v0, :cond_7

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぺでどぜべ(Landroid/graphics/Rect;II)V

    :cond_7
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

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    const/4 v3, 0x1

    if-ne v0, v3, :cond_3b

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    add-int/2addr p1, v2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺でおいここ()I

    move-result v0

    invoke-static {p3, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〳ぜぞぜべっ(III)I

    move-result p1

    iget-object p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぷぞてのほき:[I

    array-length v0, p3

    sub-int/2addr v0, v3

    aget p3, p3, v0

    add-int/2addr p3, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇとしたべど()I

    move-result v0

    invoke-static {p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〳ぜぞぜべっ(III)I

    move-result p2

    goto :goto_57

    :cond_3b
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p1

    add-int/2addr p1, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇとしたべど()I

    move-result v0

    invoke-static {p2, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〳ぜぞぜべっ(III)I

    move-result p2

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->ぷぞてのほき:[I

    array-length v0, p1

    sub-int/2addr v0, v3

    aget p1, p1, v0

    add-int/2addr p1, v2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺でおいここ()I

    move-result v0

    invoke-static {p3, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〳ぜぞぜべっ(III)I

    move-result p1

    .line 1
    :goto_57
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p3, p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->づざかべべ(Landroidx/recyclerview/widget/RecyclerView;II)V

    return-void
.end method
