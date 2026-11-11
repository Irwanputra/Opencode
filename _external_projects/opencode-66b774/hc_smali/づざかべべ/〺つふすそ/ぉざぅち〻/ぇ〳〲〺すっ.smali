.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;
.super Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/くし〴〺ぅ;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "RestrictedAPI"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static final synthetic ぇ〳〲〺すっ:I


# instance fields
.field public 〻ぞまぎな〻:I

.field public final ぇぬぎばつ:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Ljava/lang/String;",
            "Landroid/graphics/drawable/Drawable$ConstantState;",
            ">;"
        }
    .end annotation
.end field

.field public ぉ〲なぱぽた:I

.field public final ぉざぅち〻:I

.field public final おぐぴう〸ず:Landroid/content/Context;

.field public ごづごきえ:I

.field public ざっざへづ:I

.field public ざとぅぼこ〺:I

.field public でどあくず:I

.field public final のぷのちつ:Landroidx/appcompat/widget/SearchView;

.field public は〲ぱなで:Landroid/content/res/ColorStateList;

.field public ぶでにく〼〳:I

.field public final へぬ〴づぞ:Landroid/app/SearchableInfo;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/appcompat/widget/SearchView;Landroid/app/SearchableInfo;Ljava/util/WeakHashMap;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/appcompat/widget/SearchView;",
            "Landroid/app/SearchableInfo;",
            "Ljava/util/WeakHashMap<",
            "Ljava/lang/String;",
            "Landroid/graphics/drawable/Drawable$ConstantState;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p2}, Landroidx/appcompat/widget/SearchView;->getSuggestionRowLayout()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, p1, v0, v1, v2}, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/くし〴〺ぅ;-><init>(Landroid/content/Context;ILandroid/database/Cursor;Z)V

    iput v2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ざとぅぼこ〺:I

    const/4 v0, -0x1

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ごづごきえ:I

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ざっざへづ:I

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->でどあくず:I

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぶでにく〼〳:I

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->〻ぞまぎな〻:I

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぉ〲なぱぽた:I

    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->のぷのちつ:Landroidx/appcompat/widget/SearchView;

    iput-object p3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->へぬ〴づぞ:Landroid/app/SearchableInfo;

    invoke-virtual {p2}, Landroidx/appcompat/widget/SearchView;->getSuggestionCommitIconResId()I

    move-result p2

    iput p2, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぉざぅち〻:I

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->おぐぴう〸ず:Landroid/content/Context;

    iput-object p4, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぇぬぎばつ:Ljava/util/WeakHashMap;

    return-void
.end method

.method public static 〳ぜぞぜべっ(Landroid/database/Cursor;I)Ljava/lang/String;
    .registers 4

    const/4 v0, 0x0

    const/4 v1, -0x1

    if-ne p1, v1, :cond_5

    return-object v0

    :cond_5
    :try_start_5
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_9} :catch_a

    return-object p0

    :catch_a
    return-object v0
.end method


# virtual methods
.method public getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .registers 6

    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_4} :catch_5

    return-object p1

    :catch_5
    move-exception p1

    .line 1
    iget-object p2, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/くし〴〺ぅ;->てぜきぽく:Landroid/view/LayoutInflater;

    iget v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/くし〴〺ぅ;->ぺふねづ〺:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_20

    .line 2
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;

    iget-object p3, p3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_20
    return-object p2
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .registers 5

    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_4} :catch_5

    return-object p1

    :catch_5
    move-exception p1

    iget-object p2, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Landroid/content/Context;

    iget-object v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    invoke-virtual {p0, p2, v0, p3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->びぐびあび(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;

    iget-object p3, p3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2
.end method

.method public hasStableIds()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public notifyDataSetChanged()V
    .registers 2

    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 1
    iget-object v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    .line 2
    invoke-virtual {p0, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぺぁあねじ(Landroid/database/Cursor;)V

    return-void
.end method

.method public notifyDataSetInvalidated()V
    .registers 2

    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    .line 1
    iget-object v0, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    .line 2
    invoke-virtual {p0, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぺぁあねじ(Landroid/database/Cursor;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .registers 3

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/CharSequence;

    if-eqz v0, :cond_f

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->のぷのちつ:Landroidx/appcompat/widget/SearchView;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/SearchView;->〻ぞまぎな〻(Ljava/lang/CharSequence;)V

    :cond_f
    return-void
.end method

.method public 〺つふすそ(Landroid/database/Cursor;)V
    .registers 3

    :try_start_0
    invoke-super {p0, p1}, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/database/Cursor;)V

    if-eqz p1, :cond_35

    const-string v0, "suggest_text_1"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ごづごきえ:I

    const-string v0, "suggest_text_2"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ざっざへづ:I

    const-string v0, "suggest_text_2_url"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->でどあくず:I

    const-string v0, "suggest_icon_1"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぶでにく〼〳:I

    const-string v0, "suggest_icon_2"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->〻ぞまぎな〻:I

    const-string v0, "suggest_flags"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぉ〲なぱぽた:I
    :try_end_35
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_35} :catch_35

    :catch_35
    :cond_35
    return-void
.end method

.method public ぁごぐすすぃ(Landroid/app/SearchableInfo;Ljava/lang/String;I)Landroid/database/Cursor;
    .registers 13

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return-object v0

    :cond_4
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_b

    return-object v0

    :cond_b
    new-instance v2, Landroid/net/Uri$Builder;

    invoke-direct {v2}, Landroid/net/Uri$Builder;-><init>()V

    const-string v3, "content"

    invoke-virtual {v2, v3}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->query(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->fragment(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSuggestPath()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2d

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->appendEncodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_2d
    const-string v2, "search_suggest_query"

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSuggestSelection()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3f

    const/4 p1, 0x1

    new-array v0, p1, [Ljava/lang/String;

    const/4 p1, 0x0

    aput-object p2, v0, p1

    goto :goto_42

    :cond_3f
    invoke-virtual {v1, p2}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    :goto_42
    move-object v7, v0

    if-lez p3, :cond_4e

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "limit"

    invoke-virtual {v1, p2, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_4e
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v4

    iget-object p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public くし〴〺ぅ(Landroid/database/Cursor;)Ljava/lang/CharSequence;
    .registers 4

    const/4 v0, 0x0

    if-nez p1, :cond_4

    return-object v0

    :cond_4
    const-string v1, "suggest_intent_query"

    .line 1
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-static {p1, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->〳ぜぞぜべっ(Landroid/database/Cursor;I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_11

    return-object v1

    .line 2
    :cond_11
    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->へぬ〴づぞ:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->shouldRewriteQueryFromData()Z

    move-result v1

    if-eqz v1, :cond_26

    const-string v1, "suggest_intent_data"

    .line 3
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-static {p1, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->〳ぜぞぜべっ(Landroid/database/Cursor;I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_26

    return-object v1

    .line 4
    :cond_26
    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->へぬ〴づぞ:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->shouldRewriteQueryFromText()Z

    move-result v1

    if-eqz v1, :cond_3b

    const-string v1, "suggest_text_1"

    .line 5
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-static {p1, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->〳ぜぞぜべっ(Landroid/database/Cursor;I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3b

    return-object p1

    :cond_3b
    return-object v0
.end method

.method public げつ〴ぬぐ(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    .registers 22

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;

    iget v0, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぉ〲なぱぽた:I

    const/4 v4, 0x0

    const/4 v5, -0x1

    if-eq v0, v5, :cond_17

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move v6, v0

    goto :goto_18

    :cond_17
    const/4 v6, 0x0

    :goto_18
    iget-object v0, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/widget/TextView;

    if-eqz v0, :cond_34

    iget v0, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ごづごきえ:I

    invoke-static {v2, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->〳ぜぞぜべっ(Landroid/database/Cursor;I)Ljava/lang/String;

    move-result-object v0

    iget-object v8, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/widget/TextView;

    .line 1
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_30

    const/16 v0, 0x8

    goto :goto_31

    :cond_30
    const/4 v0, 0x0

    :goto_31
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2
    :cond_34
    iget-object v0, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->〺つふすそ:Landroid/widget/TextView;

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v0, :cond_bc

    iget v0, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->でどあくず:I

    invoke-static {v2, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->〳ぜぞぜべっ(Landroid/database/Cursor;I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_85

    .line 3
    iget-object v10, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->は〲ぱなで:Landroid/content/res/ColorStateList;

    if-nez v10, :cond_64

    new-instance v10, Landroid/util/TypedValue;

    invoke-direct {v10}, Landroid/util/TypedValue;-><init>()V

    iget-object v11, v1, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Landroid/content/Context;

    invoke-virtual {v11}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v11

    sget v12, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->textColorSearchUrl:I

    invoke-virtual {v11, v12, v10, v9}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget-object v11, v1, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Landroid/content/Context;

    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    iget v10, v10, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v11, v10}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v10

    iput-object v10, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->は〲ぱなで:Landroid/content/res/ColorStateList;

    :cond_64
    new-instance v10, Landroid/text/SpannableString;

    invoke-direct {v10, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v15, Landroid/text/style/TextAppearanceSpan;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    iget-object v11, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->は〲ぱなで:Landroid/content/res/ColorStateList;

    const/16 v16, 0x0

    move-object/from16 v17, v11

    move-object v11, v15

    move-object v7, v15

    move-object/from16 v15, v17

    invoke-direct/range {v11 .. v16}, Landroid/text/style/TextAppearanceSpan;-><init>(Ljava/lang/String;IILandroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v11, 0x21

    invoke-virtual {v10, v7, v4, v0, v11}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    goto :goto_8b

    .line 4
    :cond_85
    iget v0, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ざっざへづ:I

    invoke-static {v2, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->〳ぜぞぜべっ(Landroid/database/Cursor;I)Ljava/lang/String;

    move-result-object v10

    :goto_8b
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9e

    iget-object v0, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/widget/TextView;

    if-eqz v0, :cond_aa

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setSingleLine(Z)V

    iget-object v0, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setMaxLines(I)V

    goto :goto_aa

    :cond_9e
    iget-object v0, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/widget/TextView;

    if-eqz v0, :cond_aa

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setSingleLine(Z)V

    iget-object v0, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setMaxLines(I)V

    :cond_aa
    :goto_aa
    iget-object v0, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->〺つふすそ:Landroid/widget/TextView;

    .line 5
    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_b8

    const/16 v7, 0x8

    goto :goto_b9

    :cond_b8
    const/4 v7, 0x0

    :goto_b9
    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 6
    :cond_bc
    iget-object v7, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->くし〴〺ぅ:Landroid/widget/ImageView;

    const/4 v10, 0x0

    if-eqz v7, :cond_154

    .line 7
    iget v0, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぶでにく〼〳:I

    if-ne v0, v5, :cond_c8

    move-object v0, v10

    goto/16 :goto_141

    :cond_c8
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->なぎぱいぢぎ(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_d4

    goto/16 :goto_141

    .line 8
    :cond_d4
    iget-object v0, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->へぬ〴づぞ:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v11

    iget-object v12, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぇぬぎばつ:Ljava/util/WeakHashMap;

    invoke-virtual {v12, v11}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_fd

    iget-object v0, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぇぬぎばつ:Ljava/util/WeakHashMap;

    invoke-virtual {v0, v11}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable$ConstantState;

    if-nez v0, :cond_f2

    move-object v0, v10

    goto :goto_134

    :cond_f2
    iget-object v11, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->おぐぴう〸ず:Landroid/content/Context;

    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    invoke-virtual {v0, v11}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_134

    .line 10
    :cond_fd
    iget-object v12, v1, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Landroid/content/Context;

    invoke-virtual {v12}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v12

    const/16 v13, 0x80

    :try_start_105
    invoke-virtual {v12, v0, v13}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v13
    :try_end_109
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_105 .. :try_end_109} :catch_120

    invoke-virtual {v13}, Landroid/content/pm/ActivityInfo;->getIconResource()I

    move-result v14

    if-nez v14, :cond_110

    goto :goto_125

    :cond_110
    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v15

    iget-object v13, v13, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v12, v15, v14, v13}, Landroid/content/pm/PackageManager;->getDrawable(Ljava/lang/String;ILandroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;

    move-result-object v12

    if-nez v12, :cond_126

    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    goto :goto_125

    :catch_120
    move-exception v0

    move-object v12, v0

    invoke-virtual {v12}, Landroid/content/pm/PackageManager$NameNotFoundException;->toString()Ljava/lang/String;

    :goto_125
    move-object v12, v10

    :cond_126
    if-nez v12, :cond_12a

    move-object v0, v10

    goto :goto_12e

    .line 11
    :cond_12a
    invoke-virtual {v12}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    :goto_12e
    iget-object v13, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぇぬぎばつ:Ljava/util/WeakHashMap;

    invoke-virtual {v13, v11, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v12

    :goto_134
    if-eqz v0, :cond_137

    goto :goto_141

    .line 12
    :cond_137
    iget-object v0, v1, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/pm/PackageManager;->getDefaultActivityIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :goto_141
    const/4 v11, 0x4

    .line 13
    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-nez v0, :cond_14b

    invoke-virtual {v7, v11}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_154

    :cond_14b
    invoke-virtual {v7, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {v0, v4, v4}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    invoke-virtual {v0, v9, v4}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 14
    :cond_154
    :goto_154
    iget-object v0, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->びぐびあび:Landroid/widget/ImageView;

    if-eqz v0, :cond_179

    .line 15
    iget v7, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->〻ぞまぎな〻:I

    if-ne v7, v5, :cond_15d

    goto :goto_165

    :cond_15d
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->なぎぱいぢぎ(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    .line 16
    :goto_165
    invoke-virtual {v0, v10}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-nez v10, :cond_170

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_179

    :cond_170
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {v10, v4, v4}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    invoke-virtual {v10, v9, v4}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 17
    :cond_179
    :goto_179
    iget v0, v1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ざとぅぼこ〺:I

    if-eq v0, v8, :cond_18c

    if-ne v0, v9, :cond_184

    and-int/lit8 v0, v6, 0x1

    if-eqz v0, :cond_184

    goto :goto_18c

    :cond_184
    iget-object v0, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->づざかべべ:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1a1

    :cond_18c
    :goto_18c
    iget-object v0, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->づざかべべ:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->づざかべべ:Landroid/widget/ImageView;

    iget-object v2, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    iget-object v0, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;->づざかべべ:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_1a1
    return-void
.end method

.method public づざかべべ(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
    .registers 9

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_ba

    :try_start_a
    iget-object v1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    move-result-object v1
    :try_end_14
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_a .. :try_end_14} :catch_a3

    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_8c

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v3, v5, :cond_44

    :try_start_22
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_2c
    .catch Ljava/lang/NumberFormatException; {:try_start_22 .. :try_end_2c} :catch_2d

    goto :goto_57

    :catch_2d
    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Single path segment is not a resource ID: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_44
    const/4 v6, 0x2

    if-ne v3, v6, :cond_75

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v3, v2, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    :goto_57
    if-eqz v0, :cond_5e

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    :cond_5e
    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No resource found for: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_75
    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "More than two path segments: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8c
    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No path: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_a3
    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No package found for authority: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_ba
    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No authority: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final なぎぱいぢぎ(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .registers 7

    const/4 v0, 0x0

    if-eqz p1, :cond_116

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_116

    const-string v1, "0"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    goto/16 :goto_116

    :cond_13
    :try_start_13
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "android.resource://"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->おぐぴう〸ず:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1
    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぇぬぎばつ:Ljava/util/WeakHashMap;

    invoke-virtual {v3, v2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/drawable/Drawable$ConstantState;

    if-nez v3, :cond_42

    move-object v3, v0

    goto :goto_46

    :cond_42
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    :goto_46
    if-eqz v3, :cond_49

    return-object v3

    .line 2
    :cond_49
    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->おぐぴう〸ず:Landroid/content/Context;

    invoke-static {v3, v1}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->くし〴〺ぅ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_5a

    .line 3
    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぇぬぎばつ:Ljava/util/WeakHashMap;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5a
    .catch Ljava/lang/NumberFormatException; {:try_start_13 .. :try_end_5a} :catch_5c
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_13 .. :try_end_5a} :catch_5b

    :cond_5a
    return-object v1

    :catch_5b
    return-object v0

    :catch_5c
    nop

    .line 4
    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぇぬぎばつ:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/Drawable$ConstantState;

    if-nez v1, :cond_69

    move-object v1, v0

    goto :goto_6d

    :cond_69
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :goto_6d
    if-eqz v1, :cond_70

    return-object v1

    .line 5
    :cond_70
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "Error closing icon stream for "

    .line 6
    :try_start_76
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v3

    const-string v4, "android.resource"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_80
    .catch Ljava/io/FileNotFoundException; {:try_start_76 .. :try_end_80} :catch_ee

    if-eqz v3, :cond_9f

    :try_start_82
    invoke-virtual {p0, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->づざかべべ(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;

    move-result-object v0
    :try_end_86
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_82 .. :try_end_86} :catch_88
    .catch Ljava/io/FileNotFoundException; {:try_start_82 .. :try_end_86} :catch_ee

    goto/16 :goto_10b

    :catch_88
    :try_start_88
    new-instance v2, Ljava/io/FileNotFoundException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Resource does not exist: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_9f
    iget-object v3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->おぐぴう〸ず:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v3
    :try_end_a9
    .catch Ljava/io/FileNotFoundException; {:try_start_88 .. :try_end_a9} :catch_ee

    if-eqz v3, :cond_d7

    :try_start_ab
    invoke-static {v3, v0}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v4
    :try_end_af
    .catchall {:try_start_ab .. :try_end_af} :catchall_c3

    :try_start_af
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_b2
    .catch Ljava/io/IOException; {:try_start_af .. :try_end_b2} :catch_b3

    goto :goto_c1

    :catch_b3
    :try_start_b3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_c1
    .catch Ljava/io/FileNotFoundException; {:try_start_b3 .. :try_end_c1} :catch_ee

    :goto_c1
    move-object v0, v4

    goto :goto_10b

    :catchall_c3
    move-exception v4

    :try_start_c4
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_c7
    .catch Ljava/io/IOException; {:try_start_c4 .. :try_end_c7} :catch_c8

    goto :goto_d6

    :catch_c8
    :try_start_c8
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    :goto_d6
    throw v4

    :cond_d7
    new-instance v2, Ljava/io/FileNotFoundException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to open "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_ee
    .catch Ljava/io/FileNotFoundException; {:try_start_c8 .. :try_end_ee} :catch_ee

    :catch_ee
    move-exception v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Icon not found: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    :goto_10b
    if-eqz v0, :cond_116

    .line 7
    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぇぬぎばつ:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_116
    :goto_116
    return-object v0
.end method

.method public びぐびあび(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .registers 5

    .line 1
    iget-object p1, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/くし〴〺ぅ;->てぜきぽく:Landroid/view/LayoutInflater;

    iget p2, p0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/くし〴〺ぅ;->いいにぽつ:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;

    invoke-direct {p2, p1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ$げつ〴ぬぐ;-><init>(Landroid/view/View;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    sget p2, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->edit_query:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iget p3, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぉざぅち〻:I

    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    return-object p1
.end method

.method public final ぺぁあねじ(Landroid/database/Cursor;)V
    .registers 3

    if-eqz p1, :cond_7

    invoke-interface {p1}, Landroid/database/Cursor;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    goto :goto_8

    :cond_7
    const/4 p1, 0x0

    :goto_8
    if-eqz p1, :cond_12

    const-string v0, "in_progress"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_12

    :cond_12
    return-void
.end method
