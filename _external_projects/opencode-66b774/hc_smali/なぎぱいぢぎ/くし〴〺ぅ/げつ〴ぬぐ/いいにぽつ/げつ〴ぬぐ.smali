.class public Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/げつ〴ぬぐ;
.super Landroidx/fragment/app/Fragment;
.source ""


# instance fields
.field public のね〱ばぁぢ:Landroidx/recyclerview/widget/RecyclerView;

.field public ぺがぅす〹ち:Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/〺つふすそ;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public けときぜと(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .registers 5

    sget p3, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/づざかべべ;->crash_log:I

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget p2, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/びぐびあび;->crashRecyclerView:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/げつ〴ぬぐ;->のね〱ばぁぢ:Landroidx/recyclerview/widget/RecyclerView;

    return-object p1
.end method

.method public せづっ〸ちね(Landroid/os/Bundle;)V
    .registers 2

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->せづっ〸ちね(Landroid/os/Bundle;)V

    return-void
.end method

.method public ち〴みぎ〻び()V
    .registers 6

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->じぜこほぱ:Z

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->びぐびあび()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/げつ〴ぬぐ;->のね〱ばぁぢ:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    new-instance v3, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/〺つふすそ;

    invoke-virtual {p0}, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/げつ〴ぬぐ;->にぢ〱ぁな()Ljava/util/ArrayList;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/〺つふすそ;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v3, p0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/げつ〴ぬぐ;->ぺがぅす〹ち:Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/〺つふすそ;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(IZ)V

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;)V

    iget-object v0, p0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/げつ〴ぬぐ;->ぺがぅす〹ち:Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/〺つふすそ;

    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$びぐびあび;)V

    return-void
.end method

.method public final にぢ〱ぁな()Ljava/util/ArrayList;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {}, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺふねづ〺/くし〴〺ぅ;->げつ〴ぬぐ()Ljava/lang/String;

    move-result-object v0

    :cond_b
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_51

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_51

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2d
    :goto_2d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_49

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "_exception"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2d

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_2d

    :cond_49
    invoke-static {}, Ljava/util/Collections;->reverseOrder()Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0

    :cond_51
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "The path provided doesn\'t exists : "

    invoke-static {v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    goto :goto_5e

    :goto_5d
    throw v1

    :goto_5e
    goto :goto_5d
.end method
