.class public Landroidx/recyclerview/widget/LinearLayoutManager;
.super Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;
.source ""

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$〺つふすそ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;,
        Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;,
        Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;,
        Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;
    }
.end annotation


# instance fields
.field public 〻ぞまぎな〻:Z

.field public final ぅみぱぎぎ:Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;

.field public ぇ〳〲〺すっ:I

.field public ぉ〲なぱぽた:Z

.field public ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

.field public ざっざへづ:Z

.field public ざとぅぼこ〺:I

.field public じぜこほぱ:I

.field public でどあくず:Z

.field public final どぇぞほだ:Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;

.field public なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

.field public は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

.field public びえぁぜい:I

.field public ぶでにく〼〳:Z

.field public ぺづげぺが:[I


# direct methods
.method public constructor <init>(IZ)V
    .registers 5

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->でどあくず:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->〻ぞまぎな〻:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉ〲なぱぽた:Z

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぇ〳〲〺すっ:I

    const/high16 v0, -0x80000000

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->びえぁぜい:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;

    invoke-direct {v1}, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->どぇぞほだ:Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;

    invoke-direct {v1}, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぅみぱぎぎ:Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;

    const/4 v1, 0x2

    iput v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->じぜこほぱ:I

    new-array v1, v1, [I

    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぺづげぺが:[I

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ほ〱たうえの(I)V

    .line 1
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->びぐびあび(Ljava/lang/String;)V

    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->でどあくず:Z

    if-ne p2, p1, :cond_39

    goto :goto_3e

    :cond_39
    iput-boolean p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->でどあくず:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かちして〹づ()V

    :goto_3e
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 7

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->でどあくず:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->〻ぞまぎな〻:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉ〲なぱぽた:Z

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぇ〳〲〺すっ:I

    const/high16 v0, -0x80000000

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->びえぁぜい:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;

    invoke-direct {v1}, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->どぇぞほだ:Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;

    invoke-direct {v1}, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぅみぱぎぎ:Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;

    const/4 v1, 0x2

    iput v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->じぜこほぱ:I

    new-array v1, v1, [I

    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぺづげぺが:[I

    invoke-static {p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->えがぐせほち(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$びぐびあび;

    move-result-object p1

    iget p2, p1, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$びぐびあび;->げつ〴ぬぐ:I

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->ほ〱たうえの(I)V

    iget-boolean p2, p1, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$びぐびあび;->くし〴〺ぅ:Z

    .line 2
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->びぐびあび(Ljava/lang/String;)V

    iget-boolean p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->でどあくず:Z

    if-ne p2, p3, :cond_41

    goto :goto_46

    :cond_41
    iput-boolean p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->でどあくず:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かちして〹づ()V

    .line 3
    :goto_46
    iget-boolean p1, p1, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$びぐびあび;->びぐびあび:Z

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->さぬうづぃ(Z)V

    return-void
.end method


# virtual methods
.method public 〱〵つてう(Landroid/os/Parcelable;)V
    .registers 3

    instance-of v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    if-eqz v0, :cond_b

    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    iput-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かちして〹づ()V

    :cond_b
    return-void
.end method

.method public final 〲みぃどこ(II)V
    .registers 6

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v1

    sub-int/2addr v1, p2

    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_14

    const/4 v1, -0x1

    goto :goto_15

    :cond_14
    const/4 v1, 0x1

    :goto_15
    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->づざかべべ:I

    iput p1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->なぎぱいぢぎ:I

    iput p2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    const/high16 p1, -0x80000000

    iput p1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぁごぐすすぃ:I

    return-void
.end method

.method public 〳に〴あぽ()Z
    .registers 3

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    if-nez v0, :cond_c

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざっざへづ:Z

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->〻ぞまぎな〻:Z

    if-ne v0, v1, :cond_c

    const/4 v0, 0x1

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    :goto_d
    return v0
.end method

.method public 〴おちすく(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)I
    .registers 12

    iget v0, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    iget v1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぁごぐすすぃ:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_10

    if-gez v0, :cond_d

    add-int/2addr v1, v0

    iput v1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぁごぐすすぃ:I

    :cond_d
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉさひねい(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;)V

    :cond_10
    iget v1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    iget v3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ:I

    add-int/2addr v1, v3

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぅみぱぎぎ:Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;

    :cond_17
    iget-boolean v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->てぜきぽく:Z

    if-nez v4, :cond_1d

    if-lez v1, :cond_68

    :cond_1d
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)Z

    move-result v4

    if-eqz v4, :cond_68

    const/4 v4, 0x0

    .line 1
    iput v4, v3, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->げつ〴ぬぐ:I

    iput-boolean v4, v3, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->〺つふすそ:Z

    iput-boolean v4, v3, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->くし〴〺ぅ:Z

    iput-boolean v4, v3, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->びぐびあび:Z

    .line 2
    invoke-virtual {p0, p1, p3, p2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->ひ〲どぼぢだ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;)V

    iget-boolean v4, v3, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->〺つふすそ:Z

    if-eqz v4, :cond_34

    goto :goto_68

    :cond_34
    iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    iget v5, v3, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->げつ〴ぬぐ:I

    iget v6, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->なぎぱいぢぎ:I

    mul-int v6, v6, v5

    add-int/2addr v6, v4

    iput v6, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    iget-boolean v4, v3, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->くし〴〺ぅ:Z

    if-eqz v4, :cond_4b

    iget-object v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぺふねづ〺:Ljava/util/List;

    if-nez v4, :cond_4b

    .line 3
    iget-boolean v4, p3, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-nez v4, :cond_51

    .line 4
    :cond_4b
    iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    sub-int/2addr v4, v5

    iput v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    sub-int/2addr v1, v5

    :cond_51
    iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぁごぐすすぃ:I

    if-eq v4, v2, :cond_62

    add-int/2addr v4, v5

    iput v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぁごぐすすぃ:I

    iget v5, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    if-gez v5, :cond_5f

    add-int/2addr v4, v5

    iput v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぁごぐすすぃ:I

    :cond_5f
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉさひねい(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;)V

    :cond_62
    if-eqz p4, :cond_17

    iget-boolean v4, v3, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->びぐびあび:Z

    if-eqz v4, :cond_17

    :cond_68
    :goto_68
    iget p1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final 〵いどうねぢ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 9

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    if-nez v0, :cond_8

    const/4 p1, 0x0

    return p1

    :cond_8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉいけぐつ()V

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉ〲なぱぽた:Z

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    invoke-virtual {p0, v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぎがえべぱど(ZZ)Landroid/view/View;

    move-result-object v3

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉ〲なぱぽた:Z

    xor-int/2addr v0, v2

    invoke-virtual {p0, v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->づ〵ぬきすへ(ZZ)Landroid/view/View;

    move-result-object v4

    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉ〲なぱぽた:Z

    iget-boolean v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    move-object v0, p1

    move-object v2, v3

    move-object v3, v4

    move-object v4, p0

    invoke-static/range {v0 .. v6}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->おぐぴう〸ず(Landroidx/recyclerview/widget/RecyclerView$でどあくず;Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;ZZ)I

    move-result p1

    return p1
.end method

.method public 〵げとずぐみ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;III)Landroid/view/View;
    .registers 11

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉいけぐつ()V

    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result p1

    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result p2

    if-le p4, p3, :cond_13

    const/4 v0, 0x1

    goto :goto_14

    :cond_13
    const/4 v0, -0x1

    :goto_14
    const/4 v1, 0x0

    move-object v2, v1

    :goto_16
    if-eq p3, p4, :cond_4b

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v4

    if-ltz v4, :cond_49

    if-ge v4, p5, :cond_49

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->くし〴〺ぅ()Z

    move-result v4

    if-eqz v4, :cond_34

    if-nez v2, :cond_49

    move-object v2, v3

    goto :goto_49

    :cond_34
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v4, v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v4

    if-ge v4, p2, :cond_46

    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v4, v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result v4

    if-ge v4, p1, :cond_45

    goto :goto_46

    :cond_45
    return-object v3

    :cond_46
    :goto_46
    if-nez v1, :cond_49

    move-object v1, v3

    :cond_49
    :goto_49
    add-int/2addr p3, v0

    goto :goto_16

    :cond_4b
    if-eqz v1, :cond_4e

    goto :goto_4f

    :cond_4e
    move-object v1, v2

    :goto_4f
    return-object v1
.end method

.method public 〺〲に〼へ〸(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)V
    .registers 2

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    const/4 p1, -0x1

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぇ〳〲〺すっ:I

    const/high16 p1, -0x80000000

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->びえぁぜい:I

    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->どぇぞほだ:Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび()V

    return-void
.end method

.method public 〻だくけはく(Landroidx/recyclerview/widget/RecyclerView$でどあくず;[I)V
    .registers 7

    .line 1
    iget p1, p1, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->げつ〴ぬぐ:I

    const/4 v0, 0x1

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eq p1, v1, :cond_9

    const/4 p1, 0x1

    goto :goto_a

    :cond_9
    const/4 p1, 0x0

    :goto_a
    if-eqz p1, :cond_13

    .line 2
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->てぜきぽく()I

    move-result p1

    goto :goto_14

    :cond_13
    const/4 p1, 0x0

    .line 3
    :goto_14
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iget v3, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->なぎぱいぢぎ:I

    if-ne v3, v1, :cond_1c

    const/4 v1, 0x0

    goto :goto_1e

    :cond_1c
    move v1, p1

    const/4 p1, 0x0

    :goto_1e
    aput p1, p2, v2

    aput v1, p2, v0

    return-void
.end method

.method public ぁにあがあ()Landroid/os/Parcelable;
    .registers 5

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    if-eqz v0, :cond_a

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    invoke-direct {v1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;-><init>(Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;)V

    return-object v1

    :cond_a
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    invoke-direct {v0}, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;-><init>()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v1

    if-lez v1, :cond_55

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉいけぐつ()V

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざっざへづ:Z

    iget-boolean v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    xor-int/2addr v1, v2

    iput-boolean v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->びぐびあび:Z

    if-eqz v1, :cond_3b

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->つなつぼず()Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v2

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v3, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result v3

    sub-int/2addr v2, v3

    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->くし〴〺ぅ:I

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v1

    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->〺つふすそ:I

    goto :goto_58

    :cond_3b
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->のとけっぬ()Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v2

    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->〺つふすそ:I

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v2, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->くし〴〺ぅ:I

    goto :goto_58

    :cond_55
    const/4 v1, -0x1

    .line 1
    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->〺つふすそ:I

    :goto_58
    return-object v0
.end method

.method public final ぃぉみぜす(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)Landroid/view/View;
    .registers 9

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v4

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v5

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->〵げとずぐみ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;III)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public いいにぽつ(ILandroidx/recyclerview/widget/RecyclerView$てぜきぽく$くし〴〺ぅ;)V
    .registers 8

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->なぎぱいぢぎ()Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    iget-boolean v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->びぐびあび:Z

    iget v0, v0, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->〺つふすそ:I

    goto :goto_22

    :cond_13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->つびたくず()V

    iget-boolean v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぇ〳〲〺すっ:I

    if-ne v0, v1, :cond_22

    if-eqz v3, :cond_21

    add-int/lit8 v0, p1, -0x1

    goto :goto_22

    :cond_21
    const/4 v0, 0x0

    :cond_22
    :goto_22
    if-eqz v3, :cond_25

    goto :goto_26

    :cond_25
    const/4 v1, 0x1

    :goto_26
    const/4 v3, 0x0

    :goto_27
    iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->じぜこほぱ:I

    if-ge v3, v4, :cond_39

    if-ltz v0, :cond_39

    if-ge v0, p1, :cond_39

    move-object v4, p2

    check-cast v4, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;

    invoke-virtual {v4, v0, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->げつ〴ぬぐ(II)V

    add-int/2addr v0, v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_27

    :cond_39
    return-void
.end method

.method public final うでこすぢた(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;II)V
    .registers 4

    if-ne p2, p3, :cond_3

    return-void

    :cond_3
    if-le p3, p2, :cond_f

    add-int/lit8 p3, p3, -0x1

    :goto_7
    if-lt p3, p2, :cond_17

    invoke-virtual {p0, p3, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻しざ〹おま(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)V

    add-int/lit8 p3, p3, -0x1

    goto :goto_7

    :cond_f
    :goto_f
    if-le p2, p3, :cond_17

    invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻しざ〹おま(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)V

    add-int/lit8 p2, p2, -0x1

    goto :goto_f

    :cond_17
    return-void
.end method

.method public ぇぬぎばつ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->っあつぜっ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public えげて〱でく()I
    .registers 4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v0, v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->ざぇぎぱ〺(IIZZ)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_e

    const/4 v0, -0x1

    goto :goto_12

    :cond_e
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v0

    :goto_12
    return v0
.end method

.method public ぉいけぐつ()V
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    if-nez v0, :cond_b

    .line 1
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    invoke-direct {v0}, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;-><init>()V

    .line 2
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    :cond_b
    return-void
.end method

.method public final ぉさひねい(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;)V
    .registers 8

    iget-boolean v0, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_b2

    iget-boolean v0, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->てぜきぽく:Z

    if-eqz v0, :cond_a

    goto/16 :goto_b2

    :cond_a
    iget v0, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぁごぐすすぃ:I

    iget v1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぺぁあねじ:I

    iget p2, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->なぎぱいぢぎ:I

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne p2, v2, :cond_68

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result p2

    if-gez v0, :cond_1c

    goto/16 :goto_b2

    :cond_1c
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v4}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->なぎぱいぢぎ()I

    move-result v4

    sub-int/2addr v4, v0

    add-int/2addr v4, v1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    if-eqz v0, :cond_48

    const/4 v0, 0x0

    :goto_29
    if-ge v0, p2, :cond_b2

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v2, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v2

    if-lt v2, v4, :cond_43

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v2, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v1

    if-ge v1, v4, :cond_40

    goto :goto_43

    :cond_40
    add-int/lit8 v0, v0, 0x1

    goto :goto_29

    :cond_43
    :goto_43
    invoke-virtual {p0, p1, v3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->うでこすぢた(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;II)V

    goto/16 :goto_b2

    :cond_48
    add-int/2addr p2, v2

    move v0, p2

    :goto_4a
    if-ltz v0, :cond_b2

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v2, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v2

    if-lt v2, v4, :cond_64

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v2, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->おぐぴう〸ず(Landroid/view/View;)I

    move-result v1

    if-ge v1, v4, :cond_61

    goto :goto_64

    :cond_61
    add-int/lit8 v0, v0, -0x1

    goto :goto_4a

    :cond_64
    :goto_64
    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->うでこすぢた(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;II)V

    goto :goto_b2

    :cond_68
    if-gez v0, :cond_6b

    goto :goto_b2

    :cond_6b
    sub-int/2addr v0, v1

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result p2

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    if-eqz v1, :cond_94

    add-int/2addr p2, v2

    move v1, p2

    :goto_76
    if-ltz v1, :cond_b2

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v3, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result v3

    if-gt v3, v0, :cond_90

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v3, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->へぬ〴づぞ(Landroid/view/View;)I

    move-result v2

    if-le v2, v0, :cond_8d

    goto :goto_90

    :cond_8d
    add-int/lit8 v1, v1, -0x1

    goto :goto_76

    :cond_90
    :goto_90
    invoke-virtual {p0, p1, p2, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->うでこすぢた(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;II)V

    goto :goto_b2

    :cond_94
    const/4 v1, 0x0

    :goto_95
    if-ge v1, p2, :cond_b2

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v2

    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v4, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result v4

    if-gt v4, v0, :cond_af

    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v4, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->へぬ〴づぞ(Landroid/view/View;)I

    move-result v2

    if-le v2, v0, :cond_ac

    goto :goto_af

    :cond_ac
    add-int/lit8 v1, v1, 0x1

    goto :goto_95

    :cond_af
    :goto_af
    invoke-virtual {p0, p1, v3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->うでこすぢた(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;II)V

    :cond_b2
    :goto_b2
    return-void
.end method

.method public お〵かぜて()Z
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺぁあねじ()I

    move-result v0

    if-nez v0, :cond_12

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->なぎぱいぢぎ()I

    move-result v0

    if-nez v0, :cond_12

    const/4 v0, 0x1

    goto :goto_13

    :cond_12
    const/4 v0, 0x0

    :goto_13
    return v0
.end method

.method public おぐぴう〸ず(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->〵いどうねぢ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public おぬぃかはど(Landroidx/recyclerview/widget/RecyclerView$でどあくず;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$くし〴〺ぅ;)V
    .registers 5

    iget v0, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    if-ltz v0, :cond_16

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result p1

    if-ge v0, p1, :cond_16

    const/4 p1, 0x0

    iget p2, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぁごぐすすぃ:I

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    check-cast p3, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;

    invoke-virtual {p3, v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->げつ〴ぬぐ(II)V

    :cond_16
    return-void
.end method

.method public かこあぇ〸〼(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;I)V
    .registers 5

    return-void
.end method

.method public がぴぽぁぬ(II)Landroid/view/View;
    .registers 6

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉいけぐつ()V

    if-le p2, p1, :cond_7

    const/4 v0, 0x1

    goto :goto_c

    :cond_7
    if-ge p2, p1, :cond_b

    const/4 v0, -0x1

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    :goto_c
    if-nez v0, :cond_13

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_13
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v1

    if-ge v0, v1, :cond_2a

    const/16 v0, 0x4104

    const/16 v1, 0x4004

    goto :goto_2e

    :cond_2a
    const/16 v0, 0x1041

    const/16 v1, 0x1001

    :goto_2e
    iget v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    if-nez v2, :cond_35

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい;

    goto :goto_37

    :cond_35
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい;

    :goto_37
    invoke-virtual {v2, p1, p2, v0, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい;->げつ〴ぬぐ(IIII)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final きづぢばちつ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)I
    .registers 6

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v0

    sub-int v0, p1, v0

    if-lez v0, :cond_23

    invoke-virtual {p0, v0, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->どつち〻ぎづ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p2

    neg-int p2, p2

    add-int/2addr p1, p2

    if-eqz p4, :cond_22

    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result p3

    sub-int/2addr p1, p3

    if-lez p1, :cond_22

    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    neg-int p4, p1

    invoke-virtual {p3, p4}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぇぬぎばつ(I)V

    sub-int/2addr p2, p1

    :cond_22
    return p2

    :cond_23
    const/4 p1, 0x0

    return p1
.end method

.method public きぬどぼみ〸(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)Landroid/view/View;
    .registers 8

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->つびたくず()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_b

    return-object v0

    :cond_b
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぴまけ〸だて(I)I

    move-result p1

    const/high16 p2, -0x80000000

    if-ne p1, p2, :cond_14

    return-object v0

    :cond_14
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉいけぐつ()V

    const v1, 0x3eaaaaab

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->てぜきぽく()I

    move-result v2

    int-to-float v2, v2

    mul-float v2, v2, v1

    float-to-int v1, v2

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v1, v2, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->とばあぇが(IIZLandroidx/recyclerview/widget/RecyclerView$でどあくず;)V

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iput p2, v1, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぁごぐすすぃ:I

    iput-boolean v2, v1, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->げつ〴ぬぐ:Z

    const/4 p2, 0x1

    invoke-virtual {p0, p3, v1, p4, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->〴おちすく(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)I

    const/4 p2, -0x1

    if-ne p1, p2, :cond_4c

    .line 1
    iget-boolean p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    if-eqz p3, :cond_43

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result p3

    add-int/2addr p3, p2

    invoke-virtual {p0, p3, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->がぴぽぁぬ(II)Landroid/view/View;

    move-result-object p3

    goto :goto_62

    .line 3
    :cond_43
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result p3

    invoke-virtual {p0, v2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->がぴぽぁぬ(II)Landroid/view/View;

    move-result-object p3

    goto :goto_62

    .line 4
    :cond_4c
    iget-boolean p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    if-eqz p3, :cond_59

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result p3

    invoke-virtual {p0, v2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->がぴぽぁぬ(II)Landroid/view/View;

    move-result-object p3

    goto :goto_62

    .line 6
    :cond_59
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result p3

    add-int/2addr p3, p2

    invoke-virtual {p0, p3, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->がぴぽぁぬ(II)Landroid/view/View;

    move-result-object p3

    :goto_62
    if-ne p1, p2, :cond_69

    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->のとけっぬ()Landroid/view/View;

    move-result-object p1

    goto :goto_6d

    :cond_69
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->つなつぼず()Landroid/view/View;

    move-result-object p1

    :goto_6d
    invoke-virtual {p1}, Landroid/view/View;->hasFocusable()Z

    move-result p2

    if-eqz p2, :cond_77

    if-nez p3, :cond_76

    return-object v0

    :cond_76
    return-object p1

    :cond_77
    return-object p3
.end method

.method public ぎがえべぱど(ZZ)Landroid/view/View;
    .registers 5

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    if-eqz v0, :cond_10

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    :goto_b
    invoke-virtual {p0, v0, v1, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->ざぇぎぱ〺(IIZZ)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_10
    const/4 v0, 0x0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v1

    goto :goto_b
.end method

.method public く〱なおぎ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 5

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    if-nez v0, :cond_6

    const/4 p1, 0x0

    return p1

    :cond_6
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->どつち〻ぎづ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public final ぐいぎぽぼ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)I
    .registers 6

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v0

    sub-int/2addr v0, p1

    if-lez v0, :cond_23

    neg-int v0, v0

    invoke-virtual {p0, v0, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->どつち〻ぎづ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p2

    neg-int p2, p2

    add-int/2addr p1, p2

    if-eqz p4, :cond_22

    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result p3

    sub-int/2addr p3, p1

    if-lez p3, :cond_22

    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p1, p3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぇぬぎばつ(I)V

    add-int/2addr p3, p2

    return p3

    :cond_22
    return p2

    :cond_23
    const/4 p1, 0x0

    return p1
.end method

.method public けいっど〱()Z
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

.method public げつ〴ぬぐ(I)Landroid/graphics/PointF;
    .registers 5

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    if-nez v0, :cond_8

    const/4 p1, 0x0

    return-object p1

    :cond_8
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v1

    const/4 v2, 0x1

    if-ge p1, v1, :cond_15

    const/4 v0, 0x1

    :cond_15
    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    if-eq v0, p1, :cond_1a

    const/4 v2, -0x1

    :cond_1a
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    const/4 v0, 0x0

    if-nez p1, :cond_26

    new-instance p1, Landroid/graphics/PointF;

    int-to-float v1, v2

    invoke-direct {p1, v1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    return-object p1

    :cond_26
    new-instance p1, Landroid/graphics/PointF;

    int-to-float v1, v2

    invoke-direct {p1, v0, v1}, Landroid/graphics/PointF;-><init>(FF)V

    return-object p1
.end method

.method public ごづごきえ(I)Landroid/view/View;
    .registers 4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    if-nez v0, :cond_8

    const/4 p1, 0x0

    return-object p1

    :cond_8
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v1

    sub-int v1, p1, v1

    if-ltz v1, :cond_22

    if-ge v1, v0, :cond_22

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v1

    if-ne v1, p1, :cond_22

    return-object v0

    :cond_22
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ごづごきえ(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public さぬうづぃ(Z)V
    .registers 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->びぐびあび(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->〻ぞまぎな〻:Z

    if-ne v0, p1, :cond_9

    return-void

    :cond_9
    iput-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->〻ぞまぎな〻:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かちして〹づ()V

    return-void
.end method

.method public ざぇぎぱ〺(IIZZ)Landroid/view/View;
    .registers 6

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉいけぐつ()V

    const/16 v0, 0x140

    if-eqz p3, :cond_a

    const/16 p3, 0x6003

    goto :goto_c

    :cond_a
    const/16 p3, 0x140

    :goto_c
    if-eqz p4, :cond_f

    goto :goto_10

    :cond_f
    const/4 v0, 0x0

    :goto_10
    iget p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    if-nez p4, :cond_17

    iget-object p4, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい;

    goto :goto_19

    :cond_17
    iget-object p4, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい;

    :goto_19
    invoke-virtual {p4, p1, p2, p3, v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/びえぁぜい;->げつ〴ぬぐ(IIII)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public ざっざへづ()Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .registers 3

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public しげにけぃ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)V
    .registers 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    const/4 v4, -0x1

    if-nez v3, :cond_f

    iget v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぇ〳〲〺すっ:I

    if-eq v3, v4, :cond_19

    :cond_f
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v3

    if-nez v3, :cond_19

    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ひぞ〴つき(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)V

    return-void

    :cond_19
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    if-eqz v3, :cond_29

    invoke-virtual {v3}, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->なぎぱいぢぎ()Z

    move-result v3

    if-eqz v3, :cond_29

    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    iget v3, v3, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->〺つふすそ:I

    iput v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぇ〳〲〺すっ:I

    :cond_29
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉいけぐつ()V

    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    const/4 v5, 0x0

    iput-boolean v5, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->げつ〴ぬぐ:Z

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->つびたくず()V

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぷぞてのほき()Landroid/view/View;

    move-result-object v3

    iget-object v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->どぇぞほだ:Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;

    iget-boolean v7, v6, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->づざかべべ:Z

    const/high16 v8, -0x80000000

    const/4 v9, 0x1

    if-eqz v7, :cond_73

    iget v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぇ〳〲〺すっ:I

    if-ne v7, v4, :cond_73

    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    if-eqz v7, :cond_4a

    goto :goto_73

    :cond_4a
    if-eqz v3, :cond_236

    iget-object v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6, v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v6

    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v7

    if-ge v6, v7, :cond_68

    iget-object v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6, v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result v6

    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v7

    if-gt v6, v7, :cond_236

    :cond_68
    iget-object v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->どぇぞほだ:Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;

    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v7

    invoke-virtual {v6, v3, v7}, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ(Landroid/view/View;I)V

    goto/16 :goto_236

    :cond_73
    :goto_73
    invoke-virtual {v6}, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび()V

    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->どぇぞほだ:Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;

    iget-boolean v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    iget-boolean v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->〻ぞまぎな〻:Z

    xor-int/2addr v6, v7

    iput-boolean v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび:Z

    .line 1
    iget-boolean v6, v2, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-nez v6, :cond_170

    .line 2
    iget v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぇ〳〲〺すっ:I

    if-ne v6, v4, :cond_89

    goto/16 :goto_170

    :cond_89
    if-ltz v6, :cond_16c

    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v7

    if-lt v6, v7, :cond_93

    goto/16 :goto_16c

    :cond_93
    iget v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぇ〳〲〺すっ:I

    iput v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->〺つふすそ:I

    iget-object v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    if-eqz v6, :cond_c1

    invoke-virtual {v6}, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->なぎぱいぢぎ()Z

    move-result v6

    if-eqz v6, :cond_c1

    iget-object v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    iget-boolean v6, v6, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->びぐびあび:Z

    iput-boolean v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび:Z

    if-eqz v6, :cond_b5

    iget-object v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v6

    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    iget v7, v7, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->くし〴〺ぅ:I

    goto/16 :goto_15d

    :cond_b5
    iget-object v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v6

    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    iget v7, v7, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->くし〴〺ぅ:I

    goto/16 :goto_167

    :cond_c1
    iget v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->びえぁぜい:I

    if-ne v6, v8, :cond_14f

    iget v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぇ〳〲〺すっ:I

    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ(I)Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_12d

    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7, v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v7

    iget-object v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v10}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->てぜきぽく()I

    move-result v10

    if-le v7, v10, :cond_dd

    goto/16 :goto_14b

    :cond_dd
    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7, v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v7

    iget-object v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v10}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v10

    sub-int/2addr v7, v10

    if-gez v7, :cond_f8

    iget-object v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v6

    iput v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    iput-boolean v5, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび:Z

    goto/16 :goto_16a

    :cond_f8
    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v7

    iget-object v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v10, v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result v10

    sub-int/2addr v7, v10

    if-gez v7, :cond_112

    iget-object v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v6

    iput v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    iput-boolean v9, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび:Z

    goto :goto_16a

    :cond_112
    iget-boolean v7, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび:Z

    if-eqz v7, :cond_124

    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7, v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result v6

    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->のぷのちつ()I

    move-result v7

    add-int/2addr v7, v6

    goto :goto_12a

    :cond_124
    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7, v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v7

    :goto_12a
    iput v7, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    goto :goto_16a

    :cond_12d
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v6

    if-lez v6, :cond_14b

    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v6

    iget v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぇ〳〲〺すっ:I

    if-ge v7, v6, :cond_141

    const/4 v6, 0x1

    goto :goto_142

    :cond_141
    const/4 v6, 0x0

    :goto_142
    iget-boolean v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    if-ne v6, v7, :cond_148

    const/4 v6, 0x1

    goto :goto_149

    :cond_148
    const/4 v6, 0x0

    :goto_149
    iput-boolean v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび:Z

    :cond_14b
    :goto_14b
    invoke-virtual {v3}, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ()V

    goto :goto_16a

    :cond_14f
    iget-boolean v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    iput-boolean v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび:Z

    if-eqz v6, :cond_15f

    iget-object v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v6

    iget v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->びえぁぜい:I

    :goto_15d
    sub-int/2addr v6, v7

    goto :goto_168

    :cond_15f
    iget-object v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v6

    iget v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->びえぁぜい:I

    :goto_167
    add-int/2addr v6, v7

    :goto_168
    iput v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    :goto_16a
    const/4 v6, 0x1

    goto :goto_171

    :cond_16c
    :goto_16c
    iput v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぇ〳〲〺すっ:I

    iput v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->びえぁぜい:I

    :cond_170
    :goto_170
    const/4 v6, 0x0

    :goto_171
    if-eqz v6, :cond_175

    goto/16 :goto_232

    .line 3
    :cond_175
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v6

    if-nez v6, :cond_17d

    goto/16 :goto_21e

    :cond_17d
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぷぞてのほき()Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_1ad

    .line 4
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->くし〴〺ぅ()Z

    move-result v10

    if-nez v10, :cond_1a1

    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->げつ〴ぬぐ()I

    move-result v10

    if-ltz v10, :cond_1a1

    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->げつ〴ぬぐ()I

    move-result v7

    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v10

    if-ge v7, v10, :cond_1a1

    const/4 v7, 0x1

    goto :goto_1a2

    :cond_1a1
    const/4 v7, 0x0

    :goto_1a2
    if-eqz v7, :cond_1ad

    .line 5
    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v7

    invoke-virtual {v3, v6, v7}, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ(Landroid/view/View;I)V

    goto/16 :goto_21c

    :cond_1ad
    iget-boolean v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざっざへづ:Z

    iget-boolean v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->〻ぞまぎな〻:Z

    if-eq v6, v7, :cond_1b5

    goto/16 :goto_21e

    :cond_1b5
    iget-boolean v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび:Z

    if-eqz v6, :cond_1c7

    .line 6
    iget-boolean v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    if-eqz v6, :cond_1c2

    invoke-virtual/range {p0 .. p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぃぉみぜす(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)Landroid/view/View;

    move-result-object v6

    goto :goto_1d4

    :cond_1c2
    invoke-virtual/range {p0 .. p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->づふぱぐそ〹(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)Landroid/view/View;

    move-result-object v6

    goto :goto_1d4

    .line 7
    :cond_1c7
    iget-boolean v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    if-eqz v6, :cond_1d0

    invoke-virtual/range {p0 .. p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->づふぱぐそ〹(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)Landroid/view/View;

    move-result-object v6

    goto :goto_1d4

    :cond_1d0
    invoke-virtual/range {p0 .. p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぃぉみぜす(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)Landroid/view/View;

    move-result-object v6

    :goto_1d4
    if-eqz v6, :cond_21e

    .line 8
    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v7

    invoke-virtual {v3, v6, v7}, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->〺つふすそ(Landroid/view/View;I)V

    .line 9
    iget-boolean v7, v2, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-nez v7, :cond_21c

    .line 10
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->〳に〴あぽ()Z

    move-result v7

    if-eqz v7, :cond_21c

    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7, v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v7

    iget-object v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v10}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v10

    if-ge v7, v10, :cond_206

    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7, v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result v6

    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v7

    if-ge v6, v7, :cond_204

    goto :goto_206

    :cond_204
    const/4 v6, 0x0

    goto :goto_207

    :cond_206
    :goto_206
    const/4 v6, 0x1

    :goto_207
    if-eqz v6, :cond_21c

    iget-boolean v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび:Z

    if-eqz v6, :cond_214

    iget-object v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v6

    goto :goto_21a

    :cond_214
    iget-object v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v6

    :goto_21a
    iput v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    :cond_21c
    :goto_21c
    const/4 v6, 0x1

    goto :goto_21f

    :cond_21e
    :goto_21e
    const/4 v6, 0x0

    :goto_21f
    if-eqz v6, :cond_222

    goto :goto_232

    .line 11
    :cond_222
    invoke-virtual {v3}, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ()V

    iget-boolean v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->〻ぞまぎな〻:Z

    if-eqz v6, :cond_22f

    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v6

    add-int/2addr v6, v4

    goto :goto_230

    :cond_22f
    const/4 v6, 0x0

    :goto_230
    iput v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->〺つふすそ:I

    .line 12
    :goto_232
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->どぇぞほだ:Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;

    iput-boolean v9, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->づざかべべ:Z

    :cond_236
    :goto_236
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iget v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->いいにぽつ:I

    if-ltz v6, :cond_23e

    const/4 v6, 0x1

    goto :goto_23f

    :cond_23e
    const/4 v6, -0x1

    :goto_23f
    iput v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->なぎぱいぢぎ:I

    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぺづげぺが:[I

    aput v5, v3, v5

    aput v5, v3, v9

    invoke-virtual {v0, v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->〻だくけはく(Landroidx/recyclerview/widget/RecyclerView$でどあくず;[I)V

    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぺづげぺが:[I

    aget v3, v3, v5

    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget-object v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v6}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v6

    add-int/2addr v6, v3

    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぺづげぺが:[I

    aget v3, v3, v9

    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v7}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〳ぜぞぜべっ()I

    move-result v7

    add-int/2addr v7, v3

    .line 13
    iget-boolean v3, v2, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-eqz v3, :cond_2a3

    .line 14
    iget v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぇ〳〲〺すっ:I

    if-eq v3, v4, :cond_2a3

    iget v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->びえぁぜい:I

    if-eq v10, v8, :cond_2a3

    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_2a3

    iget-boolean v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    if-eqz v8, :cond_28e

    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v8}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v8

    iget-object v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v10, v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result v3

    sub-int/2addr v8, v3

    iget v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->びえぁぜい:I

    goto :goto_29d

    :cond_28e
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v8, v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result v3

    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v8}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v8

    sub-int/2addr v3, v8

    iget v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->びえぁぜい:I

    :goto_29d
    sub-int/2addr v8, v3

    if-lez v8, :cond_2a2

    add-int/2addr v6, v8

    goto :goto_2a3

    :cond_2a2
    sub-int/2addr v7, v8

    :cond_2a3
    :goto_2a3
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->どぇぞほだ:Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;

    iget-boolean v8, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび:Z

    if-eqz v8, :cond_2ae

    iget-boolean v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    if-eqz v8, :cond_2b2

    goto :goto_2b4

    :cond_2ae
    iget-boolean v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    if-eqz v8, :cond_2b4

    :cond_2b2
    const/4 v8, -0x1

    goto :goto_2b5

    :cond_2b4
    :goto_2b4
    const/4 v8, 0x1

    :goto_2b5
    invoke-virtual {v0, v1, v2, v3, v8}, Landroidx/recyclerview/widget/LinearLayoutManager;->かこあぇ〸〼(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;I)V

    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉざぅち〻(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)V

    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->お〵かぜて()Z

    move-result v8

    iput-boolean v8, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->てぜきぽく:Z

    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iput v5, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぺぁあねじ:I

    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->どぇぞほだ:Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;

    iget-boolean v8, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび:Z

    if-eqz v8, :cond_319

    .line 15
    iget v8, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->〺つふすそ:I

    iget v3, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {v0, v8, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->でげけけの(II)V

    .line 16
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iput v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ:I

    invoke-virtual {v0, v1, v3, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->〴おちすく(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)I

    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iget v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    iget v8, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    iget v3, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    if-lez v3, :cond_2eb

    add-int/2addr v7, v3

    :cond_2eb
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->どぇぞほだ:Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;

    .line 17
    iget v10, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->〺つふすそ:I

    iget v3, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {v0, v10, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->〲みぃどこ(II)V

    .line 18
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iput v7, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ:I

    iget v7, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    iget v10, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->づざかべべ:I

    add-int/2addr v7, v10

    iput v7, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    invoke-virtual {v0, v1, v3, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->〴おちすく(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)I

    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iget v7, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    iget v3, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    if-lez v3, :cond_35f

    invoke-virtual {v0, v8, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;->でげけけの(II)V

    iget-object v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iput v3, v6, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ:I

    invoke-virtual {v0, v1, v6, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->〴おちすく(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)I

    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iget v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    goto :goto_35f

    .line 19
    :cond_319
    iget v8, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->〺つふすそ:I

    iget v3, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {v0, v8, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->〲みぃどこ(II)V

    .line 20
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iput v7, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ:I

    invoke-virtual {v0, v1, v3, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->〴おちすく(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)I

    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iget v7, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    iget v8, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    iget v3, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    if-lez v3, :cond_332

    add-int/2addr v6, v3

    :cond_332
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->どぇぞほだ:Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;

    .line 21
    iget v10, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->〺つふすそ:I

    iget v3, v3, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {v0, v10, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->でげけけの(II)V

    .line 22
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iput v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ:I

    iget v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    iget v10, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->づざかべべ:I

    add-int/2addr v6, v10

    iput v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    invoke-virtual {v0, v1, v3, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->〴おちすく(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)I

    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iget v6, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    iget v3, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    if-lez v3, :cond_35f

    invoke-virtual {v0, v8, v7}, Landroidx/recyclerview/widget/LinearLayoutManager;->〲みぃどこ(II)V

    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iput v3, v7, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ:I

    invoke-virtual {v0, v1, v7, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->〴おちすく(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)I

    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iget v7, v3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    :cond_35f
    :goto_35f
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v3

    if-lez v3, :cond_383

    iget-boolean v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    iget-boolean v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->〻ぞまぎな〻:Z

    xor-int/2addr v3, v8

    if-eqz v3, :cond_377

    invoke-virtual {v0, v7, v1, v2, v9}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぐいぎぽぼ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)I

    move-result v3

    add-int/2addr v6, v3

    add-int/2addr v7, v3

    invoke-virtual {v0, v6, v1, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->きづぢばちつ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)I

    move-result v3

    goto :goto_381

    :cond_377
    invoke-virtual {v0, v6, v1, v2, v9}, Landroidx/recyclerview/widget/LinearLayoutManager;->きづぢばちつ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)I

    move-result v3

    add-int/2addr v6, v3

    add-int/2addr v7, v3

    invoke-virtual {v0, v7, v1, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぐいぎぽぼ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)I

    move-result v3

    :goto_381
    add-int/2addr v6, v3

    add-int/2addr v7, v3

    .line 23
    :cond_383
    iget-boolean v3, v2, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぺふねづ〺:Z

    if-eqz v3, :cond_419

    .line 24
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v3

    if-eqz v3, :cond_419

    .line 25
    iget-boolean v3, v2, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-nez v3, :cond_419

    .line 26
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->〳に〴あぽ()Z

    move-result v3

    if-nez v3, :cond_399

    goto/16 :goto_419

    .line 27
    :cond_399
    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->びぐびあび:Ljava/util/List;

    .line 28
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v8

    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v10

    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_3aa
    if-ge v11, v8, :cond_3da

    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    invoke-virtual {v14}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ()Z

    move-result v15

    if-eqz v15, :cond_3b9

    goto :goto_3d6

    :cond_3b9
    invoke-virtual {v14}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->なぎぱいぢぎ()I

    move-result v15

    if-ge v15, v10, :cond_3c1

    const/4 v15, 0x1

    goto :goto_3c2

    :cond_3c1
    const/4 v15, 0x0

    :goto_3c2
    iget-boolean v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    if-eq v15, v9, :cond_3c8

    const/4 v9, -0x1

    goto :goto_3c9

    :cond_3c8
    const/4 v9, 0x1

    :goto_3c9
    iget-object v15, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    iget-object v14, v14, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v15, v14}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v14

    if-ne v9, v4, :cond_3d5

    add-int/2addr v12, v14

    goto :goto_3d6

    :cond_3d5
    add-int/2addr v13, v14

    :goto_3d6
    add-int/lit8 v11, v11, 0x1

    const/4 v9, 0x1

    goto :goto_3aa

    :cond_3da
    iget-object v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iput-object v3, v4, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぺふねづ〺:Ljava/util/List;

    const/4 v3, 0x0

    if-lez v12, :cond_3fa

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->のとけっぬ()Landroid/view/View;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v4

    invoke-virtual {v0, v4, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;->でげけけの(II)V

    iget-object v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iput v12, v4, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ:I

    iput v5, v4, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    .line 29
    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->げつ〴ぬぐ(Landroid/view/View;)V

    .line 30
    iget-object v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    invoke-virtual {v0, v1, v4, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->〴おちすく(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)I

    :cond_3fa
    if-lez v13, :cond_415

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->つなつぼず()Landroid/view/View;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v4

    invoke-virtual {v0, v4, v7}, Landroidx/recyclerview/widget/LinearLayoutManager;->〲みぃどこ(II)V

    iget-object v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iput v13, v4, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ:I

    iput v5, v4, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    .line 31
    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->げつ〴ぬぐ(Landroid/view/View;)V

    .line 32
    iget-object v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    invoke-virtual {v0, v1, v4, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->〴おちすく(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)I

    :cond_415
    iget-object v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iput-object v3, v1, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぺふねづ〺:Ljava/util/List;

    .line 33
    :cond_419
    :goto_419
    iget-boolean v1, v2, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-nez v1, :cond_426

    .line 34
    iget-object v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    .line 35
    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->てぜきぽく()I

    move-result v2

    iput v2, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ:I

    goto :goto_42b

    .line 36
    :cond_426
    iget-object v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->どぇぞほだ:Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび()V

    :goto_42b
    iget-boolean v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->〻ぞまぎな〻:Z

    iput-boolean v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざっざへづ:Z

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
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉいけぐつ()V

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉ〲なぱぽた:Z

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    invoke-virtual {p0, v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぎがえべぱど(ZZ)Landroid/view/View;

    move-result-object v3

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉ〲なぱぽた:Z

    xor-int/2addr v0, v2

    invoke-virtual {p0, v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->づ〵ぬきすへ(ZZ)Landroid/view/View;

    move-result-object v4

    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉ〲なぱぽた:Z

    move-object v0, p1

    move-object v2, v3

    move-object v3, v4

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
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉいけぐつ()V

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉ〲なぱぽた:Z

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    invoke-virtual {p0, v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぎがえべぱど(ZZ)Landroid/view/View;

    move-result-object v3

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉ〲なぱぽた:Z

    xor-int/2addr v0, v2

    invoke-virtual {p0, v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->づ〵ぬきすへ(ZZ)Landroid/view/View;

    move-result-object v4

    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉ〲なぱぽた:Z

    move-object v0, p1

    move-object v2, v3

    move-object v3, v4

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぇぬぎばつ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;Z)I

    move-result p1

    return p1
.end method

.method public final つなつぼず()Landroid/view/View;
    .registers 2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    goto :goto_c

    :cond_6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_c
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final つびたくず()V
    .registers 3

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_10

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->けいっど〱()Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_10

    :cond_c
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->でどあくず:Z

    xor-int/2addr v0, v1

    goto :goto_12

    :cond_10
    :goto_10
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->でどあくず:Z

    :goto_12
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    return-void
.end method

.method public づ〵ぬきすへ(ZZ)Landroid/view/View;
    .registers 5

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    if-eqz v0, :cond_e

    const/4 v0, 0x0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v1

    :goto_9
    invoke-virtual {p0, v0, v1, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->ざぇぎぱ〺(IIZZ)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_e
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    goto :goto_9
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

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    if-nez v0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    return v0
.end method

.method public final づふぱぐそ〹(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)Landroid/view/View;
    .registers 10

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    add-int/lit8 v4, v0, -0x1

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v6

    const/4 v5, -0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v1 .. v6}, Landroidx/recyclerview/widget/LinearLayoutManager;->〵げとずぐみ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;III)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public てぜきぽく(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->〵いどうねぢ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public final でげけけの(II)V
    .registers 5

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v1

    sub-int v1, p2, v1

    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iput p1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    const/4 v1, -0x1

    if-eqz p1, :cond_17

    const/4 p1, 0x1

    goto :goto_18

    :cond_17
    const/4 p1, -0x1

    :goto_18
    iput p1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->づざかべべ:I

    iput v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->なぎぱいぢぎ:I

    iput p2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    const/high16 p1, -0x80000000

    iput p1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぁごぐすすぃ:I

    return-void
.end method

.method public final とばあぇが(IIZLandroidx/recyclerview/widget/RecyclerView$でどあくず;)V
    .registers 9

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->お〵かぜて()Z

    move-result v1

    iput-boolean v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->てぜきぽく:Z

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iput p1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->なぎぱいぢぎ:I

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぺづげぺが:[I

    const/4 v1, 0x0

    aput v1, v0, v1

    const/4 v2, 0x1

    aput v1, v0, v2

    invoke-virtual {p0, p4, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->〻だくけはく(Landroidx/recyclerview/widget/RecyclerView$でどあくず;[I)V

    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぺづげぺが:[I

    aget p4, p4, v1

    invoke-static {v1, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぺづげぺが:[I

    aget v0, v0, v2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-ne p1, v2, :cond_2a

    const/4 v1, 0x1

    :cond_2a
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    if-eqz v1, :cond_30

    move v3, v0

    goto :goto_31

    :cond_30
    move v3, p4

    :goto_31
    iput v3, p1, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ:I

    if-eqz v1, :cond_36

    goto :goto_37

    :cond_36
    move p4, v0

    :goto_37
    iput p4, p1, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぺぁあねじ:I

    const/4 p4, -0x1

    if-eqz v1, :cond_73

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〳ぜぞぜべっ()I

    move-result v0

    add-int/2addr v0, v3

    iput v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->つなつぼず()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    if-eqz v1, :cond_50

    const/4 v2, -0x1

    :cond_50
    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->づざかべべ:I

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result p4

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iget v2, v1, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->づざかべべ:I

    add-int/2addr p4, v2

    iput p4, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p4, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result p4

    iput p4, v1, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p4, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result p1

    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p4}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result p4

    sub-int/2addr p1, p4

    goto :goto_af

    :cond_73
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->のとけっぬ()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iget v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ:I

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v3

    add-int/2addr v3, v1

    iput v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ:I

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    if-eqz v1, :cond_8b

    goto :goto_8c

    :cond_8b
    const/4 v2, -0x1

    :goto_8c
    iput v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->づざかべべ:I

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result p4

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iget v2, v1, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->づざかべべ:I

    add-int/2addr p4, v2

    iput p4, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p4, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result p4

    iput p4, v1, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p4, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result p1

    neg-int p1, p1

    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p4}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result p4

    add-int/2addr p1, p4

    :goto_af
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iput p2, p4, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    if-eqz p3, :cond_b8

    sub-int/2addr p2, p1

    iput p2, p4, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->くし〴〺ぅ:I

    :cond_b8
    iput p1, p4, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぁごぐすすぃ:I

    return-void
.end method

.method public どつち〻ぎづ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 9

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_39

    if-nez p1, :cond_a

    goto :goto_39

    :cond_a
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉいけぐつ()V

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    const/4 v2, 0x1

    iput-boolean v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->げつ〴ぬぐ:Z

    if-lez p1, :cond_16

    const/4 v0, 0x1

    goto :goto_17

    :cond_16
    const/4 v0, -0x1

    :goto_17
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v3

    invoke-virtual {p0, v0, v3, v2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->とばあぇが(IIZLandroidx/recyclerview/widget/RecyclerView$でどあくず;)V

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iget v4, v2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぁごぐすすぃ:I

    invoke-virtual {p0, p2, v2, p3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->〴おちすく(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Z)I

    move-result p2

    add-int/2addr p2, v4

    if-gez p2, :cond_2a

    return v1

    :cond_2a
    if-le v3, p2, :cond_2e

    mul-int p1, v0, p2

    :cond_2e
    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    neg-int p3, p1

    invoke-virtual {p2, p3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぇぬぎばつ(I)V

    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    iput p1, p2, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->いいにぽつ:I

    return p1

    :cond_39
    :goto_39
    return v1
.end method

.method public な〱ちぉじ(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)V
    .registers 3

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぎきぁ〱ぢ()V

    return-void
.end method

.method public なぎぱいぢぎ()Z
    .registers 3

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    goto :goto_7

    :cond_6
    const/4 v1, 0x0

    :goto_7
    return v1
.end method

.method public にぷきなせこ()Z
    .registers 7

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->おぐぴう〸ず:I

    const/high16 v1, 0x40000000    # 2.0f

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_2c

    .line 2
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->へぬ〴づぞ:I

    if-eq v0, v1, :cond_2c

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    const/4 v1, 0x0

    :goto_11
    if-ge v1, v0, :cond_28

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    iget v5, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-gez v5, :cond_25

    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-gez v4, :cond_25

    const/4 v0, 0x1

    goto :goto_29

    :cond_25
    add-int/lit8 v1, v1, 0x1

    goto :goto_11

    :cond_28
    const/4 v0, 0x0

    :goto_29
    if-eqz v0, :cond_2c

    goto :goto_2d

    :cond_2c
    const/4 v2, 0x0

    :goto_2d
    return v2
.end method

.method public final のとけっぬ()Landroid/view/View;
    .registers 2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    :goto_c
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〻ぞまぎな〻(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public のびぶけせ(Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇいうげ〱〹(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    if-lez v0, :cond_1b

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->えげて〱でく()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->へざ〴ばび〻()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V

    :cond_1b
    return-void
.end method

.method public のぷのちつ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->っあつぜっ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public はぁとそぎ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 6

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    const/4 p1, 0x0

    return p1

    :cond_7
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->どつち〻ぎづ(ILandroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public ひ〲どぼぢだ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;)V
    .registers 14

    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->くし〴〺ぅ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x1

    if-nez p1, :cond_a

    iput-boolean p2, p4, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->〺つふすそ:Z

    return-void

    :cond_a
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v0, p3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぺふねづ〺:Ljava/util/List;

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-nez v0, :cond_2a

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    iget v3, p3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->なぎぱいぢぎ:I

    if-ne v3, v1, :cond_1f

    const/4 v3, 0x1

    goto :goto_20

    :cond_1f
    const/4 v3, 0x0

    :goto_20
    if-ne v0, v3, :cond_26

    .line 1
    invoke-virtual {p0, p1, v1, v2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->くし〴〺ぅ(Landroid/view/View;IZ)V

    goto :goto_3c

    .line 2
    :cond_26
    invoke-virtual {p0, p1, v2, v2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->くし〴〺ぅ(Landroid/view/View;IZ)V

    goto :goto_3c

    .line 3
    :cond_2a
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぶでにく〼〳:Z

    iget v3, p3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->なぎぱいぢぎ:I

    if-ne v3, v1, :cond_32

    const/4 v3, 0x1

    goto :goto_33

    :cond_32
    const/4 v3, 0x0

    :goto_33
    if-ne v0, v3, :cond_39

    .line 4
    invoke-virtual {p0, p1, v1, p2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->くし〴〺ぅ(Landroid/view/View;IZ)V

    goto :goto_3c

    .line 5
    :cond_39
    invoke-virtual {p0, p1, v2, p2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->くし〴〺ぅ(Landroid/view/View;IZ)V

    .line 6
    :goto_3c
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, p1}, Landroidx/recyclerview/widget/RecyclerView;->〺でおいここ(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v3

    iget v4, v3, Landroid/graphics/Rect;->left:I

    iget v5, v3, Landroid/graphics/Rect;->right:I

    add-int/2addr v4, v5

    add-int/2addr v4, v2

    iget v5, v3, Landroid/graphics/Rect;->top:I

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v5, v3

    add-int/2addr v5, v2

    .line 7
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇぬぎばつ:I

    .line 8
    iget v3, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->へぬ〴づぞ:I

    .line 9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ながふずは()I

    move-result v7

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぃぜぶの〸ぃ()I

    move-result v8

    add-int/2addr v8, v7

    iget v7, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v8, v7

    iget v7, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v8, v7

    add-int/2addr v8, v4

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->づざかべべ()Z

    move-result v7

    invoke-static {v2, v3, v8, v4, v7}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇ〳〲〺すっ(IIIIZ)I

    move-result v2

    .line 10
    iget v3, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉざぅち〻:I

    .line 11
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->おぐぴう〸ず:I

    .line 12
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ておぞぞはね()I

    move-result v7

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->げがぴうあだ()I

    move-result v8

    add-int/2addr v8, v7

    iget v7, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v8, v7

    iget v7, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v8, v7

    add-int/2addr v8, v5

    iget v5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->なぎぱいぢぎ()Z

    move-result v7

    invoke-static {v3, v4, v8, v5, v7}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇ〳〲〺すっ(IIIIZ)I

    move-result v3

    invoke-virtual {p0, p1, v2, v3, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->づあてぐく(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z

    move-result v0

    if-eqz v0, :cond_99

    invoke-virtual {p1, v2, v3}, Landroid/view/View;->measure(II)V

    .line 13
    :cond_99
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v0

    iput v0, p4, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->げつ〴ぬぐ:I

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    if-ne v0, p2, :cond_db

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->けいっど〱()Z

    move-result v0

    if-eqz v0, :cond_bb

    .line 14
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぇぬぎばつ:I

    .line 15
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぃぜぶの〸ぃ()I

    move-result v2

    sub-int/2addr v0, v2

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v2, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->びぐびあび(Landroid/view/View;)I

    move-result v2

    sub-int v2, v0, v2

    goto :goto_c6

    :cond_bb
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ながふずは()I

    move-result v2

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->びぐびあび(Landroid/view/View;)I

    move-result v0

    add-int/2addr v0, v2

    :goto_c6
    iget v3, p3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->なぎぱいぢぎ:I

    iget p3, p3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    if-ne v3, v1, :cond_d4

    iget v1, p4, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->げつ〴ぬぐ:I

    sub-int v1, p3, v1

    move v5, p3

    move v4, v0

    move v3, v1

    goto :goto_fc

    :cond_d4
    iget v1, p4, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->げつ〴ぬぐ:I

    add-int/2addr v1, p3

    move v3, p3

    move v4, v0

    move v5, v1

    goto :goto_fc

    :cond_db
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ておぞぞはね()I

    move-result v0

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v2, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->びぐびあび(Landroid/view/View;)I

    move-result v2

    add-int/2addr v2, v0

    iget v3, p3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->なぎぱいぢぎ:I

    iget p3, p3, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〺つふすそ:I

    if-ne v3, v1, :cond_f5

    iget v1, p4, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->げつ〴ぬぐ:I

    sub-int v1, p3, v1

    move v4, p3

    move v3, v0

    move v5, v2

    move v2, v1

    goto :goto_fc

    :cond_f5
    iget v1, p4, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->げつ〴ぬぐ:I

    add-int/2addr v1, p3

    move v3, v0

    move v4, v1

    move v5, v2

    move v2, p3

    :goto_fc
    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->くぎぶ〼のそ(Landroid/view/View;IIII)V

    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->くし〴〺ぅ()Z

    move-result p3

    if-nez p3, :cond_10d

    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->〺つふすそ()Z

    move-result p3

    if-eqz p3, :cond_10f

    :cond_10d
    iput-boolean p2, p4, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->くし〴〺ぅ:Z

    :cond_10f
    invoke-virtual {p1}, Landroid/view/View;->hasFocusable()Z

    move-result p1

    iput-boolean p1, p4, Landroidx/recyclerview/widget/LinearLayoutManager$〺つふすそ;->びぐびあび:Z

    return-void
.end method

.method public びぐびあび(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    if-nez v0, :cond_b

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_b

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->ぺぁあねじ(Ljava/lang/String;)V

    :cond_b
    return-void
.end method

.method public ぴまけ〸だて(I)I
    .registers 6

    const/4 v0, -0x1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_47

    const/4 v2, 0x2

    if-eq p1, v2, :cond_3a

    const/16 v2, 0x11

    const/high16 v3, -0x80000000

    if-eq p1, v2, :cond_32

    const/16 v2, 0x21

    if-eq p1, v2, :cond_2a

    const/16 v0, 0x42

    if-eq p1, v0, :cond_22

    const/16 v0, 0x82

    if-eq p1, v0, :cond_1a

    return v3

    :cond_1a
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    if-ne p1, v1, :cond_1f

    goto :goto_21

    :cond_1f
    const/high16 v1, -0x80000000

    :goto_21
    return v1

    :cond_22
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    if-nez p1, :cond_27

    goto :goto_29

    :cond_27
    const/high16 v1, -0x80000000

    :goto_29
    return v1

    :cond_2a
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    if-ne p1, v1, :cond_2f

    goto :goto_31

    :cond_2f
    const/high16 v0, -0x80000000

    :goto_31
    return v0

    :cond_32
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    if-nez p1, :cond_37

    goto :goto_39

    :cond_37
    const/high16 v0, -0x80000000

    :goto_39
    return v0

    :cond_3a
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    if-ne p1, v1, :cond_3f

    return v1

    :cond_3f
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->けいっど〱()Z

    move-result p1

    if-eqz p1, :cond_46

    return v0

    :cond_46
    return v1

    :cond_47
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    if-ne p1, v1, :cond_4c

    return v0

    :cond_4c
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->けいっど〱()Z

    move-result p1

    if-eqz p1, :cond_53

    return v1

    :cond_53
    return v0
.end method

.method public へざ〴ばび〻()I
    .registers 5

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v2, v3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ざぇぎぱ〺(IIZZ)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_f

    goto :goto_13

    :cond_f
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ち〴みぎ〻び(Landroid/view/View;)I

    move-result v2

    :goto_13
    return v2
.end method

.method public へぬ〴づぞ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->せばぴ〸び(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public ぺぁあねじ(IILandroidx/recyclerview/widget/RecyclerView$でどあくず;Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$くし〴〺ぅ;)V
    .registers 6

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    if-nez v0, :cond_5

    goto :goto_6

    :cond_5
    move p1, p2

    :goto_6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result p2

    if-eqz p2, :cond_24

    if-nez p1, :cond_f

    goto :goto_24

    :cond_f
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->ぉいけぐつ()V

    const/4 p2, 0x1

    if-lez p1, :cond_17

    const/4 v0, 0x1

    goto :goto_18

    :cond_17
    const/4 v0, -0x1

    :goto_18
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->とばあぇが(IIZLandroidx/recyclerview/widget/RecyclerView$でどあくず;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->は〲ぱなで:Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;

    invoke-virtual {p0, p3, p1, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->おぬぃかはど(Landroidx/recyclerview/widget/RecyclerView$でどあくず;Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;Landroidx/recyclerview/widget/RecyclerView$てぜきぽく$くし〴〺ぅ;)V

    :cond_24
    :goto_24
    return-void
.end method

.method public ぺぃつぢぼ(I)V
    .registers 3

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ぇ〳〲〺すっ:I

    const/high16 p1, -0x80000000

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->びえぁぜい:I

    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->なぶひせが:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    if-eqz p1, :cond_d

    const/4 v0, -0x1

    .line 1
    iput v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;->〺つふすそ:I

    .line 2
    :cond_d
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かちして〹づ()V

    return-void
.end method

.method public ぺがぅす〹ち()Z
    .registers 2

    const/4 v0, 0x1

    return v0
.end method

.method public ぺふねづ〺(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I
    .registers 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->せばぴ〸び(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)I

    move-result p1

    return p1
.end method

.method public ほ〱たうえの(I)V
    .registers 4

    if-eqz p1, :cond_12

    const/4 v0, 0x1

    if-ne p1, v0, :cond_6

    goto :goto_12

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid orientation:"

    invoke-static {v1, p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    :goto_12
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->びぐびあび(Ljava/lang/String;)V

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    if-ne p1, v0, :cond_1e

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    if-nez v0, :cond_2d

    :cond_1e
    invoke-static {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;I)Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->どぇぞほだ:Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;

    iput-object v0, v1, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ざとぅぼこ〺:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->かちして〹づ()V

    :cond_2d
    return-void
.end method
