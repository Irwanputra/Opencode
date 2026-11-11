.class public Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;
.super Landroid/widget/Filter;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public げつ〴ぬぐ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;)V
    .registers 2

    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    iput-object p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;

    return-void
.end method


# virtual methods
.method public convertResultToString(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;

    check-cast p1, Landroid/database/Cursor;

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;

    invoke-virtual {v0, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->くし〴〺ぅ(Landroid/database/Cursor;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .registers 6

    iget-object v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez p1, :cond_c

    const-string p1, ""

    goto :goto_10

    :cond_c
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_10
    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->のぷのちつ:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_30

    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->のぷのちつ:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getWindowVisibility()I

    move-result v1

    if-eqz v1, :cond_22

    goto :goto_30

    :cond_22
    :try_start_22
    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->へぬ〴づぞ:Landroid/app/SearchableInfo;

    const/16 v3, 0x32

    invoke-virtual {v0, v1, p1, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぁごぐすすぃ(Landroid/app/SearchableInfo;Ljava/lang/String;I)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_30

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I
    :try_end_2f
    .catch Ljava/lang/RuntimeException; {:try_start_22 .. :try_end_2f} :catch_30

    goto :goto_31

    :catch_30
    :cond_30
    :goto_30
    move-object p1, v2

    .line 2
    :goto_31
    new-instance v0, Landroid/widget/Filter$FilterResults;

    invoke-direct {v0}, Landroid/widget/Filter$FilterResults;-><init>()V

    if-eqz p1, :cond_41

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v1

    iput v1, v0, Landroid/widget/Filter$FilterResults;->count:I

    iput-object p1, v0, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    goto :goto_46

    :cond_41
    const/4 p1, 0x0

    iput p1, v0, Landroid/widget/Filter$FilterResults;->count:I

    iput-object v2, v0, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    :goto_46
    return-object v0
.end method

.method public publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .registers 4

    iget-object p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;

    move-object v0, p1

    check-cast v0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;

    .line 1
    iget-object v0, v0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    .line 2
    iget-object p2, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    if-eqz p2, :cond_14

    if-eq p2, v0, :cond_14

    check-cast p2, Landroid/database/Cursor;

    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;

    invoke-virtual {p1, p2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->〺つふすそ(Landroid/database/Cursor;)V

    :cond_14
    return-void
.end method
