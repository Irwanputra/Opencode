.class public Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/LinearLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:I

.field public くし〴〺ぅ:I

.field public げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

.field public づざかべべ:Z

.field public びぐびあび:Z


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "AnchorInfo{mPosition="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->〺つふすそ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCoordinate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLayoutFromEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mValid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->づざかべべ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public 〺つふすそ(Landroid/view/View;I)V
    .registers 4

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび:Z

    if-eqz v0, :cond_14

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result p1

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->のぷのちつ()I

    move-result v0

    add-int/2addr v0, p1

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    goto :goto_1c

    :cond_14
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    :goto_1c
    iput p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->〺つふすそ:I

    return-void
.end method

.method public くし〴〺ぅ(Landroid/view/View;I)V
    .registers 7

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->のぷのちつ()I

    move-result v0

    if-ltz v0, :cond_c

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->〺つふすそ(Landroid/view/View;I)V

    return-void

    :cond_c
    iput p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->〺つふすそ:I

    iget-boolean p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび:Z

    const/4 v1, 0x0

    if-eqz p2, :cond_53

    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result p2

    sub-int/2addr p2, v0

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result v0

    sub-int/2addr p2, v0

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v0

    sub-int/2addr v0, p2

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    if-lez p2, :cond_92

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v0

    iget v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    sub-int/2addr v2, v0

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v0

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v3, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result p1

    sub-int/2addr p1, v0

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    add-int/2addr p1, v0

    sub-int/2addr v2, p1

    if-gez v2, :cond_92

    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    neg-int v0, v2

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/2addr p2, p1

    goto :goto_90

    :cond_53
    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p2, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->づざかべべ(Landroid/view/View;)I

    move-result p2

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v2

    sub-int v2, p2, v2

    iput p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    if-lez v2, :cond_92

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v3, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->くし〴〺ぅ(Landroid/view/View;)I

    move-result v3

    add-int/2addr v3, p2

    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p2}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result p2

    sub-int/2addr p2, v0

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->〺つふすそ(Landroid/view/View;)I

    move-result p1

    sub-int/2addr p2, p1

    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result p1

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    sub-int/2addr p1, p2

    sub-int/2addr p1, v3

    if-gez p1, :cond_92

    iget p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    neg-int p1, p1

    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    sub-int/2addr p2, p1

    :goto_90
    iput p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    :cond_92
    return-void
.end method

.method public げつ〴ぬぐ()V
    .registers 2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび:Z

    if-eqz v0, :cond_b

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぁごぐすすぃ()I

    move-result v0

    goto :goto_11

    :cond_b
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ごづごきえ;->ぺふねづ〺()I

    move-result v0

    :goto_11
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    return-void
.end method

.method public びぐびあび()V
    .registers 2

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->〺つふすそ:I

    const/high16 v0, -0x80000000

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->くし〴〺ぅ:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->びぐびあび:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$げつ〴ぬぐ;->づざかべべ:Z

    return-void
.end method
