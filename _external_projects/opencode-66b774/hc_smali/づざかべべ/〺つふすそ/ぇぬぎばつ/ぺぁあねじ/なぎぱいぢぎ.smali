.class public Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;
.super Landroid/widget/BaseAdapter;
.source ""


# instance fields
.field public 〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

.field public final ぁごぐすすぃ:I

.field public くし〴〺ぅ:I

.field public final づざかべべ:Z

.field public final なぎぱいぢぎ:Landroid/view/LayoutInflater;

.field public びぐびあび:Z


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;Landroid/view/LayoutInflater;ZI)V
    .registers 6

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->くし〴〺ぅ:I

    iput-boolean p3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->づざかべべ:Z

    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->なぎぱいぢぎ:Landroid/view/LayoutInflater;

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    iput p4, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->ぁごぐすすぃ:I

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->げつ〴ぬぐ()V

    return-void
.end method


# virtual methods
.method public getCount()I
    .registers 3

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->づざかべべ:Z

    if-eqz v0, :cond_c

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    .line 1
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ()V

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->いいにぽつ:Ljava/util/ArrayList;

    goto :goto_12

    .line 2
    :cond_c
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->てぜきぽく()Ljava/util/ArrayList;

    move-result-object v0

    :goto_12
    iget v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->くし〴〺ぅ:I

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gez v1, :cond_1b

    return v0

    :cond_1b
    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->〺つふすそ(I)Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .registers 4

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .registers 9

    const/4 v0, 0x0

    if-nez p2, :cond_b

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->なぎぱいぢぎ:Landroid/view/LayoutInflater;

    iget v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->ぁごぐすすぃ:I

    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    :cond_b
    invoke-virtual {p0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->〺つふすそ(I)Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    move-result-object p3

    .line 1
    iget p3, p3, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->〺つふすそ:I

    add-int/lit8 v1, p1, -0x1

    if-ltz v1, :cond_1c

    .line 2
    invoke-virtual {p0, v1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->〺つふすそ(I)Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    move-result-object v1

    .line 3
    iget v1, v1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;->〺つふすそ:I

    goto :goto_1d

    :cond_1c
    move v1, p3

    .line 4
    :goto_1d
    move-object v2, p2

    check-cast v2, Landroidx/appcompat/view/menu/ListMenuItemView;

    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v3}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->のぷのちつ()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2d

    if-eq p3, v1, :cond_2d

    const/4 p3, 0x1

    goto :goto_2e

    :cond_2d
    const/4 p3, 0x0

    :goto_2e
    invoke-virtual {v2, p3}, Landroidx/appcompat/view/menu/ListMenuItemView;->setGroupDividerEnabled(Z)V

    move-object p3, p2

    check-cast p3, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ$げつ〴ぬぐ;

    iget-boolean v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->びぐびあび:Z

    if-eqz v1, :cond_3b

    invoke-virtual {v2, v4}, Landroidx/appcompat/view/menu/ListMenuItemView;->setForceShowIcon(Z)V

    :cond_3b
    invoke-virtual {p0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->〺つふすそ(I)Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    move-result-object p1

    invoke-interface {p3, p1, v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/へぬ〴づぞ$げつ〴ぬぐ;->びぐびあび(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;I)V

    return-object p2
.end method

.method public notifyDataSetChanged()V
    .registers 1

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->げつ〴ぬぐ()V

    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public 〺つふすそ(I)Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;
    .registers 4

    iget-boolean v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->づざかべべ:Z

    if-eqz v0, :cond_c

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    .line 1
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ()V

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->いいにぽつ:Ljava/util/ArrayList;

    goto :goto_12

    .line 2
    :cond_c
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->てぜきぽく()Ljava/util/ArrayList;

    move-result-object v0

    :goto_12
    iget v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->くし〴〺ぅ:I

    if-ltz v1, :cond_1a

    if-lt p1, v1, :cond_1a

    add-int/lit8 p1, p1, 0x1

    :cond_1a
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    return-object p1
.end method

.method public げつ〴ぬぐ()V
    .registers 6

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;

    .line 1
    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->でどあくず:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    if-eqz v1, :cond_20

    .line 2
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->ぺぁあねじ()V

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぁごぐすすぃ;->いいにぽつ:Ljava/util/ArrayList;

    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_10
    if-ge v3, v2, :cond_20

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/ぺぁあねじ;

    if-ne v4, v1, :cond_1d

    iput v3, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->くし〴〺ぅ:I

    return-void

    :cond_1d
    add-int/lit8 v3, v3, 0x1

    goto :goto_10

    :cond_20
    const/4 v0, -0x1

    iput v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/なぎぱいぢぎ;->くし〴〺ぅ:I

    return-void
.end method
