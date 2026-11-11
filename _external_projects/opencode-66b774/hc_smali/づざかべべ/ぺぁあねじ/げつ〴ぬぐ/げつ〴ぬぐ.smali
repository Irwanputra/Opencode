.class public abstract Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;
.super Landroid/widget/BaseAdapter;
.source ""

# interfaces
.implements Landroid/widget/Filterable;
.implements Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ$〺つふすそ;,
        Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Landroid/database/DataSetObserver;

.field public 〺つふすそ:Z

.field public ぁごぐすすぃ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

.field public くし〴〺ぅ:Z

.field public づざかべべ:Landroid/content/Context;

.field public なぎぱいぢぎ:I

.field public びぐびあび:Landroid/database/Cursor;

.field public ぺぁあねじ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/database/Cursor;Z)V
    .registers 8

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-eqz p3, :cond_9

    const/4 p3, 0x1

    goto :goto_a

    :cond_9
    const/4 p3, 0x2

    :goto_a
    and-int/lit8 v2, p3, 0x1

    const/4 v3, 0x0

    if-ne v2, v0, :cond_14

    or-int/lit8 p3, p3, 0x2

    .line 1
    iput-boolean v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:Z

    goto :goto_16

    :cond_14
    iput-boolean v3, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:Z

    :goto_16
    if-eqz p2, :cond_19

    goto :goto_1a

    :cond_19
    const/4 v0, 0x0

    :goto_1a
    iput-object p2, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    iput-boolean v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Z

    iput-object p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Landroid/content/Context;

    if-eqz v0, :cond_29

    const-string p1, "_id"

    invoke-interface {p2, p1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result p1

    goto :goto_2a

    :cond_29
    const/4 p1, -0x1

    :goto_2a
    iput p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ:I

    and-int/lit8 p1, p3, 0x2

    if-ne p1, v1, :cond_3d

    new-instance p1, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-direct {p1, p0}, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;)V

    iput-object p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->ぁごぐすすぃ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    new-instance p1, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ$〺つふすそ;

    invoke-direct {p1, p0}, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ$〺つふすそ;-><init>(Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;)V

    goto :goto_40

    :cond_3d
    const/4 p1, 0x0

    iput-object p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->ぁごぐすすぃ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    :goto_40
    iput-object p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->〳ぜぞぜべっ:Landroid/database/DataSetObserver;

    if-eqz v0, :cond_52

    iget-object p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->ぁごぐすすぃ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    if-eqz p1, :cond_4b

    invoke-interface {p2, p1}, Landroid/database/Cursor;->registerContentObserver(Landroid/database/ContentObserver;)V

    :cond_4b
    iget-object p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->〳ぜぞぜべっ:Landroid/database/DataSetObserver;

    if-eqz p1, :cond_52

    invoke-interface {p2, p1}, Landroid/database/Cursor;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    :cond_52
    return-void
.end method


# virtual methods
.method public getCount()I
    .registers 2

    iget-boolean v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Z

    if-eqz v0, :cond_d

    iget-object v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    if-eqz v0, :cond_d

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    return v0

    :cond_d
    const/4 v0, 0x0

    return v0
.end method

.method public getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .registers 5

    iget-boolean v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Z

    if-eqz v0, :cond_1f

    iget-object v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    if-nez p2, :cond_17

    move-object p1, p0

    check-cast p1, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/くし〴〺ぅ;

    .line 1
    iget-object p2, p1, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/くし〴〺ぅ;->てぜきぽく:Landroid/view/LayoutInflater;

    iget p1, p1, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/くし〴〺ぅ;->ぺふねづ〺:I

    const/4 v0, 0x0

    invoke-virtual {p2, p1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 2
    :cond_17
    iget-object p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Landroid/content/Context;

    iget-object p3, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    invoke-virtual {p0, p2, p1, p3}, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V

    return-object p2

    :cond_1f
    const/4 p1, 0x0

    return-object p1
.end method

.method public getFilter()Landroid/widget/Filter;
    .registers 2

    iget-object v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;

    if-nez v0, :cond_b

    new-instance v0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;

    invoke-direct {v0, p0}, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;-><init>(Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;)V

    iput-object v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;

    :cond_b
    iget-object v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;

    return-object v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .registers 3

    iget-boolean v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Z

    if-eqz v0, :cond_e

    iget-object v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    if-eqz v0, :cond_e

    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    iget-object p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    return-object p1

    :cond_e
    const/4 p1, 0x0

    return-object p1
.end method

.method public getItemId(I)J
    .registers 5

    iget-boolean v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Z

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_19

    iget-object v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    if-eqz v0, :cond_19

    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result p1

    if-eqz p1, :cond_19

    iget-object p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    iget v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ:I

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    return-wide v0

    :cond_19
    return-wide v1
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .registers 5

    iget-boolean v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Z

    if-eqz v0, :cond_2a

    iget-object v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result v0

    if-eqz v0, :cond_1e

    if-nez p2, :cond_16

    iget-object p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Landroid/content/Context;

    iget-object p2, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    invoke-virtual {p0, p1, p2, p3}, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    :cond_16
    iget-object p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Landroid/content/Context;

    iget-object p3, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    invoke-virtual {p0, p2, p1, p3}, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V

    return-object p2

    :cond_1e
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "couldn\'t move cursor to position "

    invoke-static {p3, p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "this should only be called when the cursor is valid"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public 〺つふすそ(Landroid/database/Cursor;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    if-ne p1, v0, :cond_6

    const/4 v0, 0x0

    goto :goto_40

    :cond_6
    if-eqz v0, :cond_16

    iget-object v1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->ぁごぐすすぃ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    if-eqz v1, :cond_f

    invoke-interface {v0, v1}, Landroid/database/Cursor;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    :cond_f
    iget-object v1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->〳ぜぞぜべっ:Landroid/database/DataSetObserver;

    if-eqz v1, :cond_16

    invoke-interface {v0, v1}, Landroid/database/Cursor;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    :cond_16
    iput-object p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    if-eqz p1, :cond_37

    iget-object v1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->ぁごぐすすぃ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    if-eqz v1, :cond_21

    invoke-interface {p1, v1}, Landroid/database/Cursor;->registerContentObserver(Landroid/database/ContentObserver;)V

    :cond_21
    iget-object v1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->〳ぜぞぜべっ:Landroid/database/DataSetObserver;

    if-eqz v1, :cond_28

    invoke-interface {p1, v1}, Landroid/database/Cursor;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    :cond_28
    const-string v1, "_id"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Z

    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    goto :goto_40

    :cond_37
    const/4 p1, -0x1

    iput p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Z

    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    :goto_40
    if-eqz v0, :cond_45

    .line 2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_45
    return-void
.end method

.method public abstract くし〴〺ぅ(Landroid/database/Cursor;)Ljava/lang/CharSequence;
.end method

.method public abstract げつ〴ぬぐ(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
.end method

.method public abstract びぐびあび(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
.end method
