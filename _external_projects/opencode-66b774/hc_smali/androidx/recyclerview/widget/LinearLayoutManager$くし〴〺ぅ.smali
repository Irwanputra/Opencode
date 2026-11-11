.class public Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/LinearLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:I

.field public 〺つふすそ:I

.field public ぁごぐすすぃ:I

.field public いいにぽつ:I

.field public くし〴〺ぅ:I

.field public げつ〴ぬぐ:Z

.field public づざかべべ:I

.field public てぜきぽく:Z

.field public なぎぱいぢぎ:I

.field public びぐびあび:I

.field public ぺぁあねじ:I

.field public ぺふねづ〺:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/recyclerview/widget/RecyclerView$\u3049\u3032\u306a\u3071\u307d\u305f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->げつ〴ぬぐ:Z

    const/4 v0, 0x0

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->〳ぜぞぜべっ:I

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぺぁあねじ:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぺふねづ〺:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroidx/recyclerview/widget/RecyclerView$でどあくず;)Z
    .registers 3

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    if-ltz v0, :cond_c

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result p1

    if-ge v0, p1, :cond_c

    const/4 p1, 0x1

    goto :goto_d

    :cond_c
    const/4 p1, 0x0

    :goto_d
    return p1
.end method

.method public くし〴〺ぅ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;)Landroid/view/View;
    .registers 6

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぺふねづ〺:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_33

    .line 1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    :goto_9
    if-ge v1, p1, :cond_31

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぺふねづ〺:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->くし〴〺ぅ()Z

    move-result v3

    if-eqz v3, :cond_22

    goto :goto_2e

    :cond_22
    iget v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->げつ〴ぬぐ()I

    move-result v2

    if-ne v3, v2, :cond_2e

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->げつ〴ぬぐ(Landroid/view/View;)V

    goto :goto_32

    :cond_2e
    :goto_2e
    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_31
    const/4 v0, 0x0

    :goto_32
    return-object v0

    .line 2
    :cond_33
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    const-wide v2, 0x7fffffffffffffffL

    .line 3
    invoke-virtual {p1, v0, v1, v2, v3}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぺふねづ〺(IZJ)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object p1

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    .line 4
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->づざかべべ:I

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    return-object p1
.end method

.method public げつ〴ぬぐ(Landroid/view/View;)V
    .registers 9

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぺふねづ〺:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const/4 v3, 0x0

    :goto_b
    if-ge v3, v0, :cond_3e

    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->ぺふねづ〺:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    if-eq v4, p1, :cond_3b

    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->くし〴〺ぅ()Z

    move-result v6

    if-eqz v6, :cond_26

    goto :goto_3b

    :cond_26
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->げつ〴ぬぐ()I

    move-result v5

    iget v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    sub-int/2addr v5, v6

    iget v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->づざかべべ:I

    mul-int v5, v5, v6

    if-gez v5, :cond_34

    goto :goto_3b

    :cond_34
    if-ge v5, v2, :cond_3b

    move-object v1, v4

    if-nez v5, :cond_3a

    goto :goto_3e

    :cond_3a
    move v2, v5

    :cond_3b
    :goto_3b
    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    :cond_3e
    :goto_3e
    if-nez v1, :cond_42

    const/4 p1, -0x1

    goto :goto_4c

    .line 2
    :cond_42
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->げつ〴ぬぐ()I

    move-result p1

    :goto_4c
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$くし〴〺ぅ;->びぐびあび:I

    return-void
.end method
