.class public Landroidx/appcompat/widget/SearchView$なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/SearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/appcompat/widget/SearchView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/SearchView;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView$なぎぱいぢぎ;->〺つふすそ:Landroidx/appcompat/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 5

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView$なぎぱいぢぎ;->〺つふすそ:Landroidx/appcompat/widget/SearchView;

    iget-object v1, v0, Landroidx/appcompat/widget/SearchView;->ざっざへづ:Landroid/widget/ImageView;

    if-ne p1, v1, :cond_a

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView;->ぉ〲なぱぽた()V

    goto :goto_64

    :cond_a
    iget-object v1, v0, Landroidx/appcompat/widget/SearchView;->ぶでにく〼〳:Landroid/widget/ImageView;

    if-ne p1, v1, :cond_12

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView;->ざっざへづ()V

    goto :goto_64

    :cond_12
    iget-object v1, v0, Landroidx/appcompat/widget/SearchView;->でどあくず:Landroid/widget/ImageView;

    if-ne p1, v1, :cond_1a

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView;->ぇ〳〲〺すっ()V

    goto :goto_64

    :cond_1a
    iget-object v1, v0, Landroidx/appcompat/widget/SearchView;->〻ぞまぎな〻:Landroid/widget/ImageView;

    if-ne p1, v1, :cond_5d

    .line 1
    iget-object p1, v0, Landroidx/appcompat/widget/SearchView;->〴ねぷぐくぼ:Landroid/app/SearchableInfo;

    if-nez p1, :cond_23

    goto :goto_64

    :cond_23
    :try_start_23
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchWebSearch()Z

    move-result v1

    if-eqz v1, :cond_49

    iget-object v1, v0, Landroidx/appcompat/widget/SearchView;->ぷぞてのほき:Landroid/content/Intent;

    .line 2
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    move-result-object p1

    if-nez p1, :cond_38

    const/4 p1, 0x0

    goto :goto_3c

    :cond_38
    invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object p1

    :goto_3c
    const-string v1, "calling_package"

    invoke-virtual {v2, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_64

    :cond_49
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchRecognizer()Z

    move-result v1

    if-eqz v1, :cond_64

    iget-object v1, v0, Landroidx/appcompat/widget/SearchView;->けときぜと:Landroid/content/Intent;

    invoke-virtual {v0, v1, p1}, Landroidx/appcompat/widget/SearchView;->ざとぅぼこ〺(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_5c
    .catch Landroid/content/ActivityNotFoundException; {:try_start_23 .. :try_end_5c} :catch_64

    goto :goto_64

    .line 4
    :cond_5d
    iget-object v1, v0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    if-ne p1, v1, :cond_64

    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView;->は〲ぱなで()V

    :catch_64
    :cond_64
    :goto_64
    return-void
.end method
