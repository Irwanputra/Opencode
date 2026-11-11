.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;,
        Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public final 〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

.field public final くし〴〺ぅ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public final げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;


# direct methods
.method public constructor <init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    new-instance p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-direct {p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;-><init>()V

    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->くし〴〺ぅ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", hidden list:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->くし〴〺ぅ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public 〳ぜぞぜべっ()I
    .registers 2

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->〺つふすそ()I

    move-result v0

    return v0
.end method

.method public 〺つふすそ(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V
    .registers 7

    if-gez p2, :cond_b

    iget-object p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    invoke-virtual {p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->〺つふすそ()I

    move-result p2

    goto :goto_f

    :cond_b
    invoke-virtual {p0, p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->なぎぱいぢぎ(I)I

    move-result p2

    :goto_f
    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {v0, p2, p4}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->づざかべべ(IZ)V

    if-eqz p4, :cond_19

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->ぺぁあねじ(Landroid/view/View;)V

    :cond_19
    iget-object p4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast p4, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v0

    if-eqz v0, :cond_52

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->おぐぴう〸ず()Z

    move-result v1

    if-nez v1, :cond_4c

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ざっざへづ()Z

    move-result v1

    if-eqz v1, :cond_33

    goto :goto_4c

    :cond_33
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Called attach on a child which is not detached: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object p3, p4, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p3, p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->じぜこほぱ(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 2
    :cond_4c
    :goto_4c
    iget v1, v0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    and-int/lit16 v1, v1, -0x101

    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    .line 3
    :cond_52
    iget-object p4, p4, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p4, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public ぁごぐすすぃ(I)Landroid/view/View;
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public いいにぽつ(Landroid/view/View;)I
    .registers 4

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_e

    return v0

    .line 2
    :cond_e
    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {v1, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->びぐびあび(I)Z

    move-result v1

    if-eqz v1, :cond_17

    return v0

    :cond_17
    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ(I)I

    move-result v0

    sub-int/2addr p1, v0

    return p1
.end method

.method public くし〴〺ぅ(I)V
    .registers 6

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->なぎぱいぢぎ(I)I

    move-result p1

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->なぎぱいぢぎ(I)Z

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    .line 1
    iget-object v1, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_46

    .line 2
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v1

    if-eqz v1, :cond_46

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->おぐぴう〸ず()Z

    move-result v2

    if-eqz v2, :cond_41

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ざっざへづ()Z

    move-result v2

    if-eqz v2, :cond_28

    goto :goto_41

    :cond_28
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "called detach on an already detached child "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->じぜこほぱ(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_41
    :goto_41
    const/16 v2, 0x100

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〺つふすそ(I)V

    :cond_46
    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->くし〴〺ぅ(Landroidx/recyclerview/widget/RecyclerView;I)V

    return-void
.end method

.method public げつ〴ぬぐ(Landroid/view/View;IZ)V
    .registers 5

    if-gez p2, :cond_b

    iget-object p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast p2, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    invoke-virtual {p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->〺つふすそ()I

    move-result p2

    goto :goto_f

    :cond_b
    invoke-virtual {p0, p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->なぎぱいぢぎ(I)I

    move-result p2

    :goto_f
    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {v0, p2, p3}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->づざかべべ(IZ)V

    if-eqz p3, :cond_19

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->ぺぁあねじ(Landroid/view/View;)V

    :cond_19
    iget-object p3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast p3, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    .line 1
    iget-object v0, p3, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    iget-object p2, p3, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->えがぐせほち()V

    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView;->なぶひせが:Ljava/util/List;

    if-eqz p3, :cond_45

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    :goto_35
    add-int/lit8 p3, p3, -0x1

    if-ltz p3, :cond_45

    iget-object v0, p2, Landroidx/recyclerview/widget/RecyclerView;->なぶひせが:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$のぷのちつ;

    invoke-interface {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$のぷのちつ;->げつ〴ぬぐ(Landroid/view/View;)V

    goto :goto_35

    :cond_45
    return-void
.end method

.method public づざかべべ()I
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->〺つふすそ()I

    move-result v0

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->くし〴〺ぅ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final てぜきぽく(Landroid/view/View;)Z
    .registers 5

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->くし〴〺ぅ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_21

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object p1

    if-eqz p1, :cond_1f

    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    iget v2, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぇぬぎばつ:I

    invoke-virtual {v0, p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->のびぶけせ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;I)Z

    iput v1, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぇぬぎばつ:I

    :cond_1f
    const/4 p1, 0x1

    return p1

    :cond_21
    return v1
.end method

.method public final なぎぱいぢぎ(I)I
    .registers 6

    const/4 v0, -0x1

    if-gez p1, :cond_4

    return v0

    :cond_4
    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    invoke-virtual {v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->〺つふすそ()I

    move-result v1

    move v2, p1

    :goto_d
    if-ge v2, v1, :cond_29

    iget-object v3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {v3, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->〺つふすそ(I)I

    move-result v3

    sub-int v3, v2, v3

    sub-int v3, p1, v3

    if-nez v3, :cond_27

    :goto_1b
    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {p1, v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->びぐびあび(I)Z

    move-result p1

    if-eqz p1, :cond_26

    add-int/lit8 v2, v2, 0x1

    goto :goto_1b

    :cond_26
    return v2

    :cond_27
    add-int/2addr v2, v3

    goto :goto_d

    :cond_29
    return v0
.end method

.method public びぐびあび(I)Landroid/view/View;
    .registers 3

    invoke-virtual {p0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->なぎぱいぢぎ(I)I

    move-result p1

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    invoke-virtual {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final ぺぁあねじ(Landroid/view/View;)V
    .registers 5

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->くし〴〺ぅ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object p1

    if-eqz p1, :cond_26

    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    iget v1, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぉざぅち〻:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1a

    goto :goto_20

    :cond_1a
    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-static {v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->へぬ〴づぞ(Landroid/view/View;)I

    move-result v1

    :goto_20
    iput v1, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぇぬぎばつ:I

    const/4 v1, 0x4

    invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->のびぶけせ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;I)Z

    :cond_26
    return-void
.end method

.method public ぺふねづ〺(Landroid/view/View;)Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->くし〴〺ぅ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
