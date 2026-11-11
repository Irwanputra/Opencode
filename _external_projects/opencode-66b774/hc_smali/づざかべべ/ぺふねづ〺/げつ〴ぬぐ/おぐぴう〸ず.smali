.class public abstract Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;
.super Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;
.source ""


# instance fields
.field public 〳ぜぞぜべっ:Landroidx/fragment/app/Fragment;

.field public ぁごぐすすぃ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field public final くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

.field public づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

.field public なぎぱいぢぎ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment$SavedState;",
            ">;"
        }
    .end annotation
.end field

.field public final びぐびあび:I


# direct methods
.method public constructor <init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;)V
    .registers 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Lづざかべべ/でどあくず/げつ〴ぬぐ/げつ〴ぬぐ;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->なぎぱいぢぎ:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/ArrayList;

    iput-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->〳ぜぞぜべっ:Landroidx/fragment/app/Fragment;

    iput-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    const/4 p1, 0x0

    iput p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->びぐびあび:I

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/view/ViewGroup;)V
    .registers 2

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->びぐびあび()V

    const/4 p1, 0x0

    iput-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    :cond_a
    return-void
.end method

.method public ぁごぐすすぃ(Landroid/view/View;Ljava/lang/Object;)Z
    .registers 3

    check-cast p2, Landroidx/fragment/app/Fragment;

    .line 1
    iget-object p2, p2, Landroidx/fragment/app/Fragment;->ぉひのべい:Landroid/view/View;

    if-ne p2, p1, :cond_8

    const/4 p1, 0x1

    goto :goto_9

    :cond_8
    const/4 p1, 0x0

    :goto_9
    return p1
.end method

.method public いいにぽつ()Landroid/os/Parcelable;
    .registers 6

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_20

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Landroidx/fragment/app/Fragment$SavedState;

    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    const-string v2, "states"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    goto :goto_21

    :cond_20
    const/4 v0, 0x0

    :goto_21
    const/4 v1, 0x0

    :goto_22
    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_4f

    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/Fragment;

    if-eqz v2, :cond_4c

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->なぶひせが()Z

    move-result v3

    if-eqz v3, :cond_4c

    if-nez v0, :cond_41

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :cond_41
    const-string v3, "f"

    invoke-static {v3, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    invoke-virtual {v4, v0, v3, v2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;->づざかべべ(Landroid/os/Bundle;Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    :cond_4c
    add-int/lit8 v1, v1, 0x1

    goto :goto_22

    :cond_4f
    return-object v0
.end method

.method public げつ〴ぬぐ(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .registers 7

    check-cast p3, Landroidx/fragment/app/Fragment;

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    if-nez p1, :cond_14

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    check-cast p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-direct {v0, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;-><init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;)V

    .line 2
    iput-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    :cond_14
    :goto_14
    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v0, 0x0

    if-gt p1, p2, :cond_23

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_23
    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {p3}, Landroidx/fragment/app/Fragment;->なぶひせが()Z

    move-result v1

    if-eqz v1, :cond_57

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    check-cast v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p3, Landroidx/fragment/app/Fragment;->は〲ぱなで:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    if-ne v2, v1, :cond_46

    iget v2, p3, Landroidx/fragment/app/Fragment;->〺つふすそ:I

    if-lez v2, :cond_57

    invoke-virtual {v1, p3}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->へぼ〳〻び(Landroidx/fragment/app/Fragment;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_57

    new-instance v2, Landroidx/fragment/app/Fragment$SavedState;

    invoke-direct {v2, v1}, Landroidx/fragment/app/Fragment$SavedState;-><init>(Landroid/os/Bundle;)V

    goto :goto_58

    :cond_46
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Fragment "

    const-string v2, " is not currently in the FragmentManager"

    invoke-static {p2, p3, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->せづっ〸ちね(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->しげにけぃ(Ljava/lang/RuntimeException;)V

    throw v0

    :cond_57
    move-object v2, v0

    .line 4
    :goto_58
    invoke-virtual {p1, p2, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {p1, p2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    invoke-virtual {p1, p3}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->ぁごぐすすぃ(Landroidx/fragment/app/Fragment;)Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->〳ぜぞぜべっ:Landroidx/fragment/app/Fragment;

    if-ne p3, p1, :cond_6b

    iput-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->〳ぜぞぜべっ:Landroidx/fragment/app/Fragment;

    :cond_6b
    return-void
.end method

.method public てぜきぽく(Landroid/view/ViewGroup;)V
    .registers 4

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_8

    return-void

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ViewPager with adapter "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " requires a view id"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public なぎぱいぢぎ(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .registers 8

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, p2, :cond_13

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_13

    return-object v0

    :cond_13
    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    if-nez v0, :cond_25

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    check-cast v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-direct {v1, v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;-><init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;)V

    .line 2
    iput-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    :cond_25
    move-object v0, p0

    check-cast v0, Lteam/dev/epro/apkcustom/MainActivity$のぷのちつ;

    const/4 v1, 0x1

    if-eqz p2, :cond_4f

    if-eq p2, v1, :cond_4a

    const/4 v2, 0x2

    if-eq p2, v2, :cond_45

    add-int/lit8 v0, p2, 0x1

    .line 3
    new-instance v2, Lteam/dev/epro/apkcustom/MainActivity$てぜきぽく;

    invoke-direct {v2}, Lteam/dev/epro/apkcustom/MainActivity$てぜきぽく;-><init>()V

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "section_number"

    invoke-virtual {v3, v4, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Landroidx/fragment/app/Fragment;->〱かけばぜぐ(Landroid/os/Bundle;)V

    goto :goto_6b

    .line 4
    :cond_45
    iget-object v0, v0, Lteam/dev/epro/apkcustom/MainActivity$のぷのちつ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 5
    iget-object v2, v0, Lteam/dev/epro/apkcustom/MainActivity;->ぅみぱぎぎ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/くし〴〺ぅ;

    goto :goto_6b

    .line 6
    :cond_4a
    iget-object v0, v0, Lteam/dev/epro/apkcustom/MainActivity$のぷのちつ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 7
    iget-object v2, v0, Lteam/dev/epro/apkcustom/MainActivity;->どぇぞほだ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/びぐびあび;

    goto :goto_6b

    .line 8
    :cond_4f
    sget-object v2, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string v3, "mainFragment"

    .line 9
    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_67

    iget-object v2, v0, Lteam/dev/epro/apkcustom/MainActivity$のぷのちつ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 10
    iget-object v2, v2, Lteam/dev/epro/apkcustom/MainActivity;->おかぷせ〱:Lcom/github/clans/fab/FloatingActionButton;

    const/16 v3, 0x8

    .line 11
    invoke-virtual {v2, v3}, Lcom/github/clans/fab/FloatingActionButton;->setVisibility(I)V

    iget-object v0, v0, Lteam/dev/epro/apkcustom/MainActivity$のぷのちつ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 12
    iget-object v2, v0, Lteam/dev/epro/apkcustom/MainActivity;->びえぁぜい:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/づざかべべ;

    goto :goto_6b

    .line 13
    :cond_67
    iget-object v0, v0, Lteam/dev/epro/apkcustom/MainActivity$のぷのちつ;->ぺぁあねじ:Lteam/dev/epro/apkcustom/MainActivity;

    .line 14
    iget-object v2, v0, Lteam/dev/epro/apkcustom/MainActivity;->なぶひせが:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/〳ぜぞぜべっ;

    .line 15
    :goto_6b
    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v3, 0x0

    if-le v0, p2, :cond_93

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment$SavedState;

    if-eqz v0, :cond_93

    .line 16
    iget-object v4, v2, Landroidx/fragment/app/Fragment;->は〲ぱなで:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    if-nez v4, :cond_8b

    iget-object v0, v0, Landroidx/fragment/app/Fragment$SavedState;->〺つふすそ:Landroid/os/Bundle;

    if-eqz v0, :cond_87

    goto :goto_88

    :cond_87
    move-object v0, v3

    :goto_88
    iput-object v0, v2, Landroidx/fragment/app/Fragment;->くし〴〺ぅ:Landroid/os/Bundle;

    goto :goto_93

    :cond_8b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Fragment already added"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 17
    :cond_93
    :goto_93
    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt v0, p2, :cond_a1

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_93

    :cond_a1
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroidx/fragment/app/Fragment;->きぬどぼみ〸(Z)V

    iget v4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->びぐびあび:I

    if-nez v4, :cond_ac

    invoke-virtual {v2, v0}, Landroidx/fragment/app/Fragment;->びちづぼぬ(Z)V

    :cond_ac
    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0, p2, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I

    move-result p1

    .line 18
    invoke-virtual {p2, p1, v2, v3, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->なぎぱいぢぎ(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 19
    iget p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->びぐびあび:I

    if-ne p1, v1, :cond_c5

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    sget-object p2, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->づざかべべ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-virtual {p1, v2, p2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->〳ぜぞぜべっ(Landroidx/fragment/app/Fragment;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    :cond_c5
    return-object v2
.end method

.method public ぺぁあねじ(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    .registers 8

    if-eqz p1, :cond_6f

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string p2, "states"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object p2

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    if-eqz p2, :cond_2a

    const/4 v1, 0x0

    :goto_1b
    array-length v2, p2

    if-ge v1, v2, :cond_2a

    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->なぎぱいぢぎ:Ljava/util/ArrayList;

    aget-object v3, p2, v1

    check-cast v3, Landroidx/fragment/app/Fragment$SavedState;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1b

    :cond_2a
    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_32
    :goto_32
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6f

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "f"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_32

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    iget-object v3, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    invoke-virtual {v3, p1, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;->〺つふすそ(Landroid/os/Bundle;Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_32

    :goto_57
    iget-object v3, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-gt v3, v2, :cond_66

    iget-object v3, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_57

    :cond_66
    invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->きぬどぼみ〸(Z)V

    iget-object v3, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_32

    :cond_6f
    return-void
.end method

.method public ぺふねづ〺(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .registers 6

    check-cast p3, Landroidx/fragment/app/Fragment;

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->〳ぜぞぜべっ:Landroidx/fragment/app/Fragment;

    if-eq p3, p1, :cond_58

    const/4 p2, 0x1

    if-eqz p1, :cond_32

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->きぬどぼみ〸(Z)V

    iget p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->びぐびあび:I

    if-ne p1, p2, :cond_2d

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    if-nez p1, :cond_23

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    check-cast p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-direct {v0, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;-><init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;)V

    .line 2
    iput-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    :cond_23
    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->〳ぜぞぜべっ:Landroidx/fragment/app/Fragment;

    sget-object v1, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->づざかべべ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-virtual {p1, v0, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->〳ぜぞぜべっ(Landroidx/fragment/app/Fragment;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    goto :goto_32

    :cond_2d
    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->〳ぜぞぜべっ:Landroidx/fragment/app/Fragment;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->びちづぼぬ(Z)V

    :cond_32
    :goto_32
    invoke-virtual {p3, p2}, Landroidx/fragment/app/Fragment;->きぬどぼみ〸(Z)V

    iget p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->びぐびあび:I

    if-ne p1, p2, :cond_53

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    if-nez p1, :cond_4b

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    check-cast p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-direct {p2, p1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;-><init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;)V

    .line 4
    iput-object p2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    :cond_4b
    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->づざかべべ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    sget-object p2, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->なぎぱいぢぎ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-virtual {p1, p3, p2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;->〳ぜぞぜべっ(Landroidx/fragment/app/Fragment;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇぬぎばつ;

    goto :goto_56

    :cond_53
    invoke-virtual {p3, p2}, Landroidx/fragment/app/Fragment;->びちづぼぬ(Z)V

    :goto_56
    iput-object p3, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/おぐぴう〸ず;->〳ぜぞぜべっ:Landroidx/fragment/app/Fragment;

    :cond_58
    return-void
.end method
