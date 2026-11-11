.class public final Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u3056\u3068\u3045\u307c\u3053\u303a"
.end annotation


# instance fields
.field public final synthetic 〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

.field public 〺つふすそ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/RecyclerView$\u3049\u3032\u306a\u3071\u307d\u305f;",
            ">;"
        }
    .end annotation
.end field

.field public ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;

.field public final くし〴〺ぅ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/RecyclerView$\u3049\u3032\u306a\u3071\u307d\u305f;",
            ">;"
        }
    .end annotation
.end field

.field public final げつ〴ぬぐ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/RecyclerView$\u3049\u3032\u306a\u3071\u307d\u305f;",
            ">;"
        }
    .end annotation
.end field

.field public づざかべべ:I

.field public なぎぱいぢぎ:I

.field public final びぐびあび:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/recyclerview/widget/RecyclerView$\u3049\u3032\u306a\u3071\u307d\u305f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 3

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〺つふすそ:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->びぐびあび:Ljava/util/List;

    const/4 p1, 0x2

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->づざかべべ:I

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->なぎぱいぢぎ:I

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ(Landroid/view/View;)V
    .registers 5

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->おぐぴう〸ず()Z

    move-result v1

    if-eqz v1, :cond_10

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    :cond_10
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->へぬ〴づぞ()Z

    move-result p1

    if-eqz p1, :cond_1c

    .line 1
    iget-object p1, v0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->へぬ〴づぞ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->てぜきぽく(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    goto :goto_25

    .line 2
    :cond_1c
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->でどあくず()Z

    move-result p1

    if-eqz p1, :cond_25

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->びぐびあび()V

    :cond_25
    :goto_25
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぺぁあねじ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->〺でおいここ:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;

    if-eqz p1, :cond_3b

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->てぜきぽく()Z

    move-result p1

    if-nez p1, :cond_3b

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->〺でおいここ:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->づざかべべ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    :cond_3b
    return-void
.end method

.method public 〺つふすそ()V
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->なぎぱいぢぎ()V

    return-void
.end method

.method public ぁごぐすすぃ(I)V
    .registers 4

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;Z)V

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method public いいにぽつ(Landroid/view/View;)V
    .registers 6

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object p1

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〳ぜぞぜべっ(I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_55

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぇぬぎばつ()Z

    move-result v0

    if-eqz v0, :cond_55

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    .line 1
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->〺でおいここ:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;

    const/4 v2, 0x1

    if-eqz v0, :cond_3f

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぁごぐすすぃ()Ljava/util/List;

    move-result-object v3

    check-cast v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    .line 2
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_39

    .line 3
    iget-boolean v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぉ〲なぱぽた;->ぁごぐすすぃ:Z

    if-eqz v0, :cond_33

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺()Z

    move-result v0

    if-eqz v0, :cond_31

    goto :goto_33

    :cond_31
    const/4 v0, 0x0

    goto :goto_34

    :cond_33
    :goto_33
    const/4 v0, 0x1

    :goto_34
    if-eqz v0, :cond_37

    goto :goto_39

    :cond_37
    const/4 v0, 0x0

    goto :goto_3a

    :cond_39
    :goto_39
    const/4 v0, 0x1

    :goto_3a
    if-eqz v0, :cond_3d

    goto :goto_3f

    :cond_3d
    const/4 v0, 0x0

    goto :goto_40

    :cond_3f
    :goto_3f
    const/4 v0, 0x1

    :goto_40
    if-eqz v0, :cond_43

    goto :goto_55

    .line 4
    :cond_43
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〺つふすそ:Ljava/util/ArrayList;

    if-nez v0, :cond_4e

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〺つふすそ:Ljava/util/ArrayList;

    .line 5
    :cond_4e
    iput-object p0, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->へぬ〴づぞ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    iput-boolean v2, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->おぐぴう〸ず:Z

    .line 6
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〺つふすそ:Ljava/util/ArrayList;

    goto :goto_82

    :cond_55
    :goto_55
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺()Z

    move-result v0

    if-eqz v0, :cond_7c

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ()Z

    move-result v0

    if-nez v0, :cond_7c

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    .line 7
    iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->〺つふすそ:Z

    if-eqz v0, :cond_6a

    goto :goto_7c

    .line 8
    :cond_6a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->じぜこほぱ(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 9
    :cond_7c
    :goto_7c
    iput-object p0, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->へぬ〴づぞ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    iput-boolean v1, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->おぐぴう〸ず:Z

    .line 10
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/util/ArrayList;

    :goto_82
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public くし〴〺ぅ(I)I
    .registers 5

    if-ltz p1, :cond_1d

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v0

    if-ge p1, v0, :cond_1d

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    .line 1
    iget-boolean v1, v1, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-nez v1, :cond_15

    return p1

    .line 2
    :cond_15
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ;

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, p1, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ;->なぎぱいぢぎ(II)I

    move-result p1

    return p1

    .line 4
    :cond_1d
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid position "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". State item count is "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p1, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->じぜこほぱ(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;Z)V
    .registers 7

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->ぺふねづ〺(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->ぇいうげ〱〹:Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;

    const/4 v2, 0x0

    if-eqz v1, :cond_1f

    .line 1
    iget-object v1, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;

    .line 2
    instance-of v3, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;

    if-eqz v3, :cond_1b

    .line 3
    iget-object v1, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;->づざかべべ:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    goto :goto_1c

    :cond_1b
    move-object v1, v2

    .line 4
    :goto_1c
    invoke-static {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おかぷせ〱(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;)V

    :cond_1f
    if-eqz p2, :cond_3e

    .line 5
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView;->へぬ〴づぞ:Landroidx/recyclerview/widget/RecyclerView$は〲ぱなで;

    if-eqz p2, :cond_2a

    invoke-interface {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$は〲ぱなで;->げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    :cond_2a
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    if-eqz p2, :cond_33

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->なぎぱいぢぎ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    :cond_33
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p2, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    if-eqz v0, :cond_3e

    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView;->ぁごぐすすぃ:Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが;

    invoke-virtual {p2, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが;->ぁごぐすすぃ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    .line 6
    :cond_3e
    iput-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ざとぅぼこ〺:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->びぐびあび()Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;

    move-result-object p2

    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    iget v0, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->なぎぱいぢぎ:I

    .line 9
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;->げつ〴ぬぐ(I)Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;

    move-result-object v1

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;->げつ〴ぬぐ:Landroid/util/SparseArray;

    invoke-virtual {p2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;

    iget p2, p2, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;->〺つふすそ:I

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt p2, v0, :cond_60

    goto :goto_66

    :cond_60
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ざとぅぼこ〺()V

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_66
    return-void
.end method

.method public final づざかべべ(Landroid/view/ViewGroup;Z)V
    .registers 7

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_6
    if-ltz v0, :cond_18

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_15

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {p0, v2, v1}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->づざかべべ(Landroid/view/ViewGroup;Z)V

    :cond_15
    add-int/lit8 v0, v0, -0x1

    goto :goto_6

    :cond_18
    if-nez p2, :cond_1b

    return-void

    :cond_1b
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getVisibility()I

    move-result p2

    const/4 v0, 0x4

    if-ne p2, v0, :cond_2a

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setVisibility(I)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_34

    :cond_2a
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getVisibility()I

    move-result p2

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setVisibility(I)V

    :goto_34
    return-void
.end method

.method public てぜきぽく(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V
    .registers 3

    iget-boolean v0, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->おぐぴう〸ず:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〺つふすそ:Ljava/util/ArrayList;

    goto :goto_9

    :cond_7
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/util/ArrayList;

    :goto_9
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->へぬ〴づぞ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->おぐぴう〸ず:Z

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->びぐびあび()V

    return-void
.end method

.method public なぎぱいぢぎ()V
    .registers 4

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, -0x1

    add-int/2addr v0, v1

    :goto_8
    if-ltz v0, :cond_10

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぁごぐすすぃ(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    :cond_10
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->ぱでかぁ〻〹:Z

    if-eqz v0, :cond_27

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->かづげぃぁ〺:Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;

    .line 1
    iget-object v2, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->くし〴〺ぅ:[I

    if-eqz v2, :cond_24

    invoke-static {v2, v1}, Ljava/util/Arrays;->fill([II)V

    :cond_24
    const/4 v1, 0x0

    iput v1, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->びぐびあび:I

    :cond_27
    return-void
.end method

.method public のぷのちつ()V
    .registers 4

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->のぷのちつ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    if-eqz v0, :cond_9

    iget v0, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->てぜきぽく:I

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->づざかべべ:I

    add-int/2addr v1, v0

    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->なぎぱいぢぎ:I

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_17
    if-ltz v0, :cond_29

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->なぎぱいぢぎ:I

    if-le v1, v2, :cond_29

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぁごぐすすぃ(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_17

    :cond_29
    return-void
.end method

.method public びぐびあび()Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;
    .registers 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;

    if-nez v0, :cond_b

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;

    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;

    :cond_b
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;

    return-object v0
.end method

.method public ぺぁあねじ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V
    .registers 7

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->へぬ〴づぞ()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_dc

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_12

    goto/16 :goto_dc

    :cond_12
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->おぐぴう〸ず()Z

    move-result v0

    if-nez v0, :cond_c3

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ざっざへづ()Z

    move-result v0

    if-nez v0, :cond_b1

    .line 1
    iget v0, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    const/16 v3, 0x10

    and-int/2addr v0, v3

    if-nez v0, :cond_37

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    .line 2
    sget-object v4, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v4, v3, :cond_32

    invoke-virtual {v0}, Landroid/view/View;->hasTransientState()Z

    move-result v0

    goto :goto_33

    :cond_32
    const/4 v0, 0x0

    :goto_33
    if-eqz v0, :cond_37

    const/4 v0, 0x1

    goto :goto_38

    :cond_37
    const/4 v0, 0x0

    .line 3
    :goto_38
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    if-eqz v3, :cond_43

    if-eqz v0, :cond_43

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_43
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->てぜきぽく()Z

    move-result v3

    if-eqz v3, :cond_9f

    iget v3, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->なぎぱいぢぎ:I

    if-lez v3, :cond_98

    const/16 v3, 0x20e

    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〳ぜぞぜべっ(I)Z

    move-result v3

    if-nez v3, :cond_98

    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->なぎぱいぢぎ:I

    if-lt v3, v4, :cond_66

    if-lez v3, :cond_66

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぁごぐすすぃ(I)V

    add-int/lit8 v3, v3, -0x1

    :cond_66
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->ぱでかぁ〻〹:Z

    if-eqz v1, :cond_91

    if-lez v3, :cond_91

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->かづげぃぁ〺:Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;

    iget v4, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    invoke-virtual {v1, v4}, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->くし〴〺ぅ(I)Z

    move-result v1

    if-nez v1, :cond_91

    :cond_78
    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_90

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    iget v1, v1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->かづげぃぁ〺:Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;

    invoke-virtual {v4, v1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/のぷのちつ$〺つふすそ;->くし〴〺ぅ(I)Z

    move-result v1

    if-nez v1, :cond_78

    :cond_90
    add-int/2addr v3, v2

    :cond_91
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v1, v3, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const/4 v1, 0x1

    goto :goto_99

    :cond_98
    const/4 v1, 0x0

    :goto_99
    if-nez v1, :cond_9f

    invoke-virtual {p0, p1, v2}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;Z)V

    goto :goto_a0

    :cond_9f
    const/4 v2, 0x0

    :goto_a0
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->ぁごぐすすぃ:Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが;

    invoke-virtual {v3, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/なぶひせが;->ぁごぐすすぃ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    if-nez v1, :cond_b0

    if-nez v2, :cond_b0

    if-eqz v0, :cond_b0

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ざとぅぼこ〺:Landroidx/recyclerview/widget/RecyclerView;

    :cond_b0
    return-void

    :cond_b1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v1, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->じぜこほぱ(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p1, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->じぜこほぱ(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_dc
    :goto_dc
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Scrapped or attached views may not be recycled. isScrap:"

    invoke-static {v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->へぬ〴づぞ()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, " isAttached:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_f9

    const/4 v1, 0x1

    :cond_f9
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->じぜこほぱ(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_107

    :goto_106
    throw v0

    :goto_107
    goto :goto_106
.end method

.method public ぺふねづ〺(IZJ)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;
    .registers 22

    move-object/from16 v1, p0

    move/from16 v0, p1

    if-ltz v0, :cond_563

    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v2

    if-ge v0, v2, :cond_563

    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    .line 1
    iget-boolean v2, v2, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    const/16 v3, 0x20

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v2, :cond_8b

    .line 2
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〺つふすそ:Ljava/util/ArrayList;

    if-eqz v2, :cond_86

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_27

    goto :goto_86

    :cond_27
    const/4 v6, 0x0

    :goto_28
    if-ge v6, v2, :cond_45

    iget-object v7, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->でどあくず()Z

    move-result v8

    if-nez v8, :cond_42

    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->なぎぱいぢぎ()I

    move-result v8

    if-ne v8, v0, :cond_42

    invoke-virtual {v7, v3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〺つふすそ(I)V

    goto :goto_87

    :cond_42
    add-int/lit8 v6, v6, 0x1

    goto :goto_28

    :cond_45
    iget-object v6, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v7, v6, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    .line 3
    iget-boolean v7, v7, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->〺つふすそ:Z

    if-eqz v7, :cond_86

    .line 4
    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ;

    .line 5
    invoke-virtual {v6, v0, v5}, Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ;->なぎぱいぢぎ(II)I

    move-result v6

    if-lez v6, :cond_86

    .line 6
    iget-object v7, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v7, v7, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ()I

    move-result v7

    if-ge v6, v7, :cond_86

    iget-object v7, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v7, v7, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    invoke-virtual {v7, v6}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->〺つふすそ(I)J

    move-result-wide v6

    const/4 v8, 0x0

    :goto_68
    if-ge v8, v2, :cond_86

    iget-object v9, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->でどあくず()Z

    move-result v10

    if-nez v10, :cond_83

    .line 7
    iget-wide v10, v9, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->づざかべべ:J

    cmp-long v12, v10, v6

    if-nez v12, :cond_83

    .line 8
    invoke-virtual {v9, v3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〺つふすそ(I)V

    move-object v7, v9

    goto :goto_87

    :cond_83
    add-int/lit8 v8, v8, 0x1

    goto :goto_68

    :cond_86
    :goto_86
    move-object v7, v4

    :goto_87
    if-eqz v7, :cond_8c

    const/4 v2, 0x1

    goto :goto_8d

    :cond_8b
    move-object v7, v4

    :cond_8c
    const/4 v2, 0x0

    :goto_8d
    const/4 v6, -0x1

    if-nez v7, :cond_248

    .line 9
    iget-object v7, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v8, 0x0

    :goto_97
    if-ge v8, v7, :cond_c9

    iget-object v9, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->でどあくず()Z

    move-result v10

    if-nez v10, :cond_c6

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->なぎぱいぢぎ()I

    move-result v10

    if-ne v10, v0, :cond_c6

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺()Z

    move-result v10

    if-nez v10, :cond_c6

    iget-object v10, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v10, v10, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    iget-boolean v10, v10, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-nez v10, :cond_c1

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ()Z

    move-result v10

    if-nez v10, :cond_c6

    :cond_c1
    invoke-virtual {v9, v3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〺つふすそ(I)V

    goto/16 :goto_1b4

    :cond_c6
    add-int/lit8 v8, v8, 0x1

    goto :goto_97

    :cond_c9
    if-nez p2, :cond_18a

    iget-object v7, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v7, v7, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    .line 10
    iget-object v8, v7, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->くし〴〺ぅ:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x0

    :goto_d6
    if-ge v9, v8, :cond_101

    iget-object v10, v7, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->くし〴〺ぅ:Ljava/util/List;

    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/view/View;

    iget-object v11, v7, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast v11, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    .line 11
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v11

    .line 12
    invoke-virtual {v11}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->なぎぱいぢぎ()I

    move-result v12

    if-ne v12, v0, :cond_fe

    invoke-virtual {v11}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺()Z

    move-result v12

    if-nez v12, :cond_fe

    invoke-virtual {v11}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ()Z

    move-result v11

    if-nez v11, :cond_fe

    goto :goto_102

    :cond_fe
    add-int/lit8 v9, v9, 0x1

    goto :goto_d6

    :cond_101
    move-object v10, v4

    :goto_102
    if-eqz v10, :cond_18a

    .line 13
    invoke-static {v10}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v7

    iget-object v8, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v8, v8, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    .line 14
    iget-object v9, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->げつ〴ぬぐ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$〺つふすそ;

    check-cast v9, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;

    .line 15
    iget-object v9, v9, Lづざかべべ/ぇぬぎばつ/びぐびあび/でどあくず;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v9

    if-ltz v9, :cond_173

    .line 16
    iget-object v11, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {v11, v9}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->びぐびあび(I)Z

    move-result v11

    if-eqz v11, :cond_15c

    iget-object v11, v8, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {v11, v9}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ(I)V

    invoke-virtual {v8, v10}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->てぜきぽく(Landroid/view/View;)Z

    .line 17
    iget-object v8, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v8, v8, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v8, v10}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->いいにぽつ(Landroid/view/View;)I

    move-result v8

    if-eq v8, v6, :cond_143

    iget-object v9, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v9, v9, Landroidx/recyclerview/widget/RecyclerView;->なぎぱいぢぎ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;

    invoke-virtual {v9, v8}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〺つふすそ;->くし〴〺ぅ(I)V

    invoke-virtual {v1, v10}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->いいにぽつ(Landroid/view/View;)V

    const/16 v8, 0x2020

    invoke-virtual {v7, v8}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〺つふすそ(I)V

    goto/16 :goto_1ba

    :cond_143
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "layout index should not be -1 after unhiding a view:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v3, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->じぜこほぱ(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 18
    :cond_15c
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "trying to unhide a view that was not hidden"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_173
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "view is not a child, cannot hide "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19
    :cond_18a
    iget-object v7, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v8, 0x0

    :goto_191
    if-ge v8, v7, :cond_1b9

    iget-object v9, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺()Z

    move-result v10

    if-nez v10, :cond_1b6

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->なぎぱいぢぎ()I

    move-result v10

    if-ne v10, v0, :cond_1b6

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺぁあねじ()Z

    move-result v10

    if-nez v10, :cond_1b6

    if-nez p2, :cond_1b4

    iget-object v7, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_1b4
    :goto_1b4
    move-object v7, v9

    goto :goto_1ba

    :cond_1b6
    add-int/lit8 v8, v8, 0x1

    goto :goto_191

    :cond_1b9
    move-object v7, v4

    :goto_1ba
    if-eqz v7, :cond_248

    .line 20
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ()Z

    move-result v8

    if-eqz v8, :cond_1c9

    iget-object v8, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v8, v8, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    .line 21
    iget-boolean v8, v8, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    goto :goto_204

    .line 22
    :cond_1c9
    iget v8, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    if-ltz v8, :cond_22f

    iget-object v9, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v9, v9, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ()I

    move-result v9

    if-ge v8, v9, :cond_22f

    iget-object v8, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v9, v8, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    .line 23
    iget-boolean v9, v9, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-nez v9, :cond_1ec

    .line 24
    iget-object v8, v8, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    iget v9, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    invoke-virtual {v8, v9}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->くし〴〺ぅ(I)I

    move-result v8

    .line 25
    iget v9, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->なぎぱいぢぎ:I

    if-eq v8, v9, :cond_1ec

    goto :goto_201

    .line 26
    :cond_1ec
    iget-object v8, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v8, v8, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    .line 27
    iget-boolean v9, v8, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->〺つふすそ:Z

    if-eqz v9, :cond_203

    .line 28
    iget-wide v9, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->づざかべべ:J

    .line 29
    iget v11, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    invoke-virtual {v8, v11}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->〺つふすそ(I)J

    move-result-wide v11

    cmp-long v8, v9, v11

    if-nez v8, :cond_201

    goto :goto_203

    :cond_201
    :goto_201
    const/4 v8, 0x0

    goto :goto_204

    :cond_203
    :goto_203
    const/4 v8, 0x1

    :goto_204
    if-nez v8, :cond_22d

    if-nez p2, :cond_22b

    const/4 v8, 0x4

    .line 30
    invoke-virtual {v7, v8}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〺つふすそ(I)V

    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->へぬ〴づぞ()Z

    move-result v8

    if-eqz v8, :cond_21f

    iget-object v8, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v9, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v8, v9, v5}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 31
    iget-object v8, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->へぬ〴づぞ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    invoke-virtual {v8, v7}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->てぜきぽく(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    goto :goto_228

    .line 32
    :cond_21f
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->でどあくず()Z

    move-result v8

    if-eqz v8, :cond_228

    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->びぐびあび()V

    :cond_228
    :goto_228
    invoke-virtual {v1, v7}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぺぁあねじ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    :cond_22b
    move-object v7, v4

    goto :goto_248

    :cond_22d
    const/4 v2, 0x1

    goto :goto_248

    .line 33
    :cond_22f
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Inconsistency detected. Invalid view holder adapter position"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v3, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->じぜこほぱ(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_248
    :goto_248
    const/4 v8, 0x2

    if-nez v7, :cond_402

    .line 34
    iget-object v9, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v9, v9, Landroidx/recyclerview/widget/RecyclerView;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ;

    .line 35
    invoke-virtual {v9, v0, v5}, Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ;->なぎぱいぢぎ(II)I

    move-result v9

    if-ltz v9, :cond_3d1

    .line 36
    iget-object v10, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v10, v10, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ()I

    move-result v10

    if-ge v9, v10, :cond_3d1

    iget-object v10, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v10, v10, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    invoke-virtual {v10, v9}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->くし〴〺ぅ(I)I

    move-result v10

    iget-object v11, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v11, v11, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    .line 37
    iget-boolean v12, v11, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->〺つふすそ:Z

    if-eqz v12, :cond_305

    .line 38
    invoke-virtual {v11, v9}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->〺つふすそ(I)J

    move-result-wide v11

    .line 39
    iget-object v7, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    add-int/2addr v7, v6

    :goto_27a
    if-ltz v7, :cond_2cd

    iget-object v13, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    .line 40
    iget-wide v14, v13, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->づざかべべ:J

    cmp-long v16, v14, v11

    if-nez v16, :cond_2ca

    .line 41
    invoke-virtual {v13}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->でどあくず()Z

    move-result v14

    if-nez v14, :cond_2ca

    .line 42
    iget v14, v13, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->なぎぱいぢぎ:I

    if-ne v10, v14, :cond_2ac

    .line 43
    invoke-virtual {v13, v3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〺つふすそ(I)V

    invoke-virtual {v13}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->のぷのちつ()Z

    move-result v3

    if-eqz v3, :cond_2aa

    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    .line 44
    iget-boolean v3, v3, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-nez v3, :cond_2aa

    const/16 v3, 0xe

    .line 45
    invoke-virtual {v13, v8, v3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->は〲ぱなで(II)V

    :cond_2aa
    move-object v7, v13

    goto :goto_300

    :cond_2ac
    if-nez p2, :cond_2ca

    iget-object v14, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    iget-object v14, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v15, v13, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v14, v15, v5}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    iget-object v13, v13, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    .line 46
    invoke-static {v13}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v13

    iput-object v4, v13, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->へぬ〴づぞ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    iput-boolean v5, v13, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->おぐぴう〸ず:Z

    invoke-virtual {v13}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->びぐびあび()V

    invoke-virtual {v1, v13}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぺぁあねじ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)V

    :cond_2ca
    add-int/lit8 v7, v7, -0x1

    goto :goto_27a

    .line 47
    :cond_2cd
    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/2addr v3, v6

    :goto_2d4
    if-ltz v3, :cond_2ff

    iget-object v7, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    .line 48
    iget-wide v13, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->づざかべべ:J

    cmp-long v15, v13, v11

    if-nez v15, :cond_2fc

    .line 49
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺぁあねじ()Z

    move-result v13

    if-nez v13, :cond_2fc

    .line 50
    iget v13, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->なぎぱいぢぎ:I

    if-ne v10, v13, :cond_2f6

    if-nez p2, :cond_300

    .line 51
    iget-object v11, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_300

    :cond_2f6
    if-nez p2, :cond_2fc

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぁごぐすすぃ(I)V

    goto :goto_2ff

    :cond_2fc
    add-int/lit8 v3, v3, -0x1

    goto :goto_2d4

    :cond_2ff
    :goto_2ff
    move-object v7, v4

    :cond_300
    :goto_300
    if-eqz v7, :cond_305

    .line 52
    iput v9, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    const/4 v2, 0x1

    :cond_305
    if-nez v7, :cond_352

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->びぐびあび()Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;

    move-result-object v3

    .line 53
    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;->げつ〴ぬぐ:Landroid/util/SparseArray;

    invoke-virtual {v3, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;

    if-eqz v3, :cond_33c

    iget-object v7, v3, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_33c

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    add-int/2addr v7, v6

    :goto_324
    if-ltz v7, :cond_33c

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺぁあねじ()Z

    move-result v6

    if-nez v6, :cond_339

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    goto :goto_33d

    :cond_339
    add-int/lit8 v7, v7, -0x1

    goto :goto_324

    :cond_33c
    move-object v3, v4

    :goto_33d
    if-eqz v3, :cond_351

    .line 54
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ざとぅぼこ〺()V

    sget-boolean v6, Landroidx/recyclerview/widget/RecyclerView;->しげにけぃ:Z

    if-eqz v6, :cond_351

    .line 55
    iget-object v6, v3, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    instance-of v7, v6, Landroid/view/ViewGroup;

    if-eqz v7, :cond_351

    check-cast v6, Landroid/view/ViewGroup;

    invoke-virtual {v1, v6, v5}, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->づざかべべ(Landroid/view/ViewGroup;Z)V

    :cond_351
    move-object v7, v3

    :cond_352
    if-nez v7, :cond_402

    .line 56
    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    move-result-wide v6

    const-wide v11, 0x7fffffffffffffffL

    cmp-long v3, p3, v11

    if-eqz v3, :cond_37d

    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;

    .line 57
    invoke-virtual {v3, v10}, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;->げつ〴ぬぐ(I)Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;

    move-result-object v3

    iget-wide v11, v3, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;->くし〴〺ぅ:J

    const-wide/16 v13, 0x0

    cmp-long v3, v11, v13

    if-eqz v3, :cond_379

    add-long/2addr v11, v6

    cmp-long v3, v11, p3

    if-gez v3, :cond_377

    goto :goto_379

    :cond_377
    const/4 v3, 0x0

    goto :goto_37a

    :cond_379
    :goto_379
    const/4 v3, 0x1

    :goto_37a
    if-nez v3, :cond_37d

    return-object v4

    .line 58
    :cond_37d
    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v3, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    .line 59
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_384
    const-string v9, "RV CreateView"

    invoke-static {v9}, Lづざかべべ/〳ぜぞぜべっ/ぺぁあねじ/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/String;)V

    invoke-virtual {v4, v3, v10}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->づざかべべ(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v3

    iget-object v4, v3, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    if-nez v4, :cond_3c4

    iput v10, v3, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->なぎぱいぢぎ:I
    :try_end_397
    .catchall {:try_start_384 .. :try_end_397} :catchall_3cc

    invoke-static {}, Lづざかべべ/〳ぜぞぜべっ/ぺぁあねじ/げつ〴ぬぐ;->〺つふすそ()V

    .line 60
    sget-boolean v4, Landroidx/recyclerview/widget/RecyclerView;->ぱでかぁ〻〹:Z

    if-eqz v4, :cond_3ad

    iget-object v4, v3, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-static {v4}, Landroidx/recyclerview/widget/RecyclerView;->ぺづげぺが(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v4

    if-eqz v4, :cond_3ad

    new-instance v9, Ljava/lang/ref/WeakReference;

    invoke-direct {v9, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v9, v3, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〺つふすそ:Ljava/lang/ref/WeakReference;

    :cond_3ad
    iget-object v4, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    move-result-wide v11

    iget-object v4, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;

    sub-long/2addr v11, v6

    .line 61
    invoke-virtual {v4, v10}, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;->げつ〴ぬぐ(I)Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;

    move-result-object v6

    iget-wide v9, v6, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;->くし〴〺ぅ:J

    invoke-virtual {v4, v9, v10, v11, v12}, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;->〺つふすそ(JJ)J

    move-result-wide v9

    iput-wide v9, v6, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;->くし〴〺ぅ:J

    move-object v7, v3

    goto :goto_402

    .line 62
    :cond_3c4
    :try_start_3c4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3cc
    .catchall {:try_start_3c4 .. :try_end_3cc} :catchall_3cc

    :catchall_3cc
    move-exception v0

    invoke-static {}, Lづざかべべ/〳ぜぞぜべっ/ぺぁあねじ/げつ〴ぬぐ;->〺つふすそ()V

    throw v0

    .line 63
    :cond_3d1
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Inconsistency detected. Invalid item position "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "(offset:"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ").state:"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->じぜこほぱ(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_402
    :goto_402
    if-eqz v2, :cond_432

    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    .line 64
    iget-boolean v3, v3, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-nez v3, :cond_432

    const/16 v3, 0x2000

    .line 65
    invoke-virtual {v7, v3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->〳ぜぞぜべっ(I)Z

    move-result v4

    if-eqz v4, :cond_432

    invoke-virtual {v7, v5, v3}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->は〲ぱなで(II)V

    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    iget-boolean v3, v3, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->いいにぽつ:Z

    if-eqz v3, :cond_432

    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->〺つふすそ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)I

    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->〺でおいここ:Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;

    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぁごぐすすぃ()Ljava/util/List;

    invoke-virtual {v3, v7}, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->〳ぜぞぜべっ(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;)Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;

    move-result-object v3

    iget-object v4, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4, v7, v3}, Landroidx/recyclerview/widget/RecyclerView;->かづげぃぁ〺(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ$くし〴〺ぅ;)V

    :cond_432
    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    .line 66
    iget-boolean v3, v3, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-eqz v3, :cond_443

    .line 67
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ()Z

    move-result v3

    if-eqz v3, :cond_443

    iput v0, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぁごぐすすぃ:I

    goto :goto_48d

    :cond_443
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ()Z

    move-result v3

    if-eqz v3, :cond_459

    .line 68
    iget v3, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    and-int/2addr v3, v8

    if-eqz v3, :cond_450

    const/4 v3, 0x1

    goto :goto_451

    :cond_450
    const/4 v3, 0x0

    :goto_451
    if-nez v3, :cond_459

    .line 69
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺()Z

    move-result v3

    if-eqz v3, :cond_48d

    :cond_459
    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ;

    .line 70
    invoke-virtual {v3, v0, v5}, Lづざかべべ/ぇぬぎばつ/びぐびあび/げつ〴ぬぐ;->なぎぱいぢぎ(II)I

    move-result v3

    .line 71
    iget-object v4, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iput-object v4, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ざとぅぼこ〺:Landroidx/recyclerview/widget/RecyclerView;

    .line 72
    iget v6, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->なぎぱいぢぎ:I

    .line 73
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    move-result-wide v8

    const-wide v10, 0x7fffffffffffffffL

    cmp-long v4, p3, v10

    if-eqz v4, :cond_490

    iget-object v4, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;

    .line 74
    invoke-virtual {v4, v6}, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;->げつ〴ぬぐ(I)Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;

    move-result-object v4

    iget-wide v10, v4, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;->びぐびあび:J

    const-wide/16 v12, 0x0

    cmp-long v4, v10, v12

    if-eqz v4, :cond_48a

    add-long/2addr v10, v8

    cmp-long v4, v10, p3

    if-gez v4, :cond_488

    goto :goto_48a

    :cond_488
    const/4 v4, 0x0

    goto :goto_48b

    :cond_48a
    :goto_48a
    const/4 v4, 0x1

    :goto_48b
    if-nez v4, :cond_490

    :cond_48d
    :goto_48d
    const/4 v0, 0x0

    goto/16 :goto_532

    .line 75
    :cond_490
    iget-object v4, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->てぜきぽく:Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    .line 76
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput v3, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->くし〴〺ぅ:I

    .line 77
    iget-boolean v6, v4, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->〺つふすそ:Z

    if-eqz v6, :cond_4a3

    .line 78
    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->〺つふすそ(I)J

    move-result-wide v10

    iput-wide v10, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->づざかべべ:J

    :cond_4a3
    const/16 v6, 0x207

    const/4 v10, 0x1

    invoke-virtual {v7, v10, v6}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->は〲ぱなで(II)V

    const-string v6, "RV OnBindView"

    invoke-static {v6}, Lづざかべべ/〳ぜぞぜべっ/ぺぁあねじ/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/String;)V

    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぁごぐすすぃ()Ljava/util/List;

    .line 79
    invoke-virtual {v4, v7, v3}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->びぐびあび(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;I)V

    .line 80
    iget-object v3, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぺふねづ〺:Ljava/util/List;

    if-eqz v3, :cond_4bb

    invoke-interface {v3}, Ljava/util/List;->clear()V

    :cond_4bb
    iget v3, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    and-int/lit16 v3, v3, -0x401

    iput v3, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->いいにぽつ:I

    .line 81
    iget-object v3, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    instance-of v4, v3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    if-eqz v4, :cond_4d0

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    const/4 v4, 0x1

    iput-boolean v4, v3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->くし〴〺ぅ:Z

    :cond_4d0
    invoke-static {}, Lづざかべべ/〳ぜぞぜべっ/ぺぁあねじ/げつ〴ぬぐ;->〺つふすそ()V

    .line 82
    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    move-result-wide v3

    iget-object v6, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;

    .line 83
    iget v10, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->なぎぱいぢぎ:I

    sub-long/2addr v3, v8

    .line 84
    invoke-virtual {v6, v10}, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;->げつ〴ぬぐ(I)Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;

    move-result-object v8

    iget-wide v9, v8, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;->びぐびあび:J

    invoke-virtual {v6, v9, v10, v3, v4}, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻;->〺つふすそ(JJ)J

    move-result-wide v3

    iput-wide v3, v8, Landroidx/recyclerview/widget/RecyclerView$ぉざぅち〻$げつ〴ぬぐ;->びぐびあび:J

    .line 85
    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    .line 86
    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->びえぁぜい:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v3, :cond_4f8

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_4f8

    const/4 v3, 0x1

    goto :goto_4f9

    :cond_4f8
    const/4 v3, 0x0

    :goto_4f9
    if-eqz v3, :cond_527

    .line 87
    iget-object v3, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-static {v3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->へぬ〴づぞ(Landroid/view/View;)I

    move-result v4

    const/4 v6, 0x1

    if-nez v4, :cond_507

    invoke-static {v3, v6}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ておぞぞはね(Landroid/view/View;I)V

    :cond_507
    iget-object v4, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->ぇいうげ〱〹:Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;

    if-nez v4, :cond_50e

    goto :goto_527

    .line 88
    :cond_50e
    iget-object v4, v4, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;

    .line 89
    instance-of v6, v4, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;

    if-eqz v6, :cond_524

    .line 90
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぁごぐすすぃ(Landroid/view/View;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    move-result-object v6

    if-eqz v6, :cond_524

    if-eq v6, v4, :cond_524

    iget-object v8, v4, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;->づざかべべ:Ljava/util/Map;

    invoke-interface {v8, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    :cond_524
    invoke-static {v3, v4}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->おかぷせ〱(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;)V

    .line 92
    :cond_527
    :goto_527
    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    .line 93
    iget-boolean v3, v3, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->ぁごぐすすぃ:Z

    if-eqz v3, :cond_531

    .line 94
    iput v0, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->ぁごぐすすぃ:I

    :cond_531
    const/4 v0, 0x1

    .line 95
    :goto_532
    iget-object v3, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    if-nez v3, :cond_541

    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    goto :goto_54f

    :cond_541
    iget-object v4, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v4

    if-nez v4, :cond_557

    iget-object v4, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    :goto_54f
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    iget-object v4, v7, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v4, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_559

    :cond_557
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    :goto_559
    iput-object v7, v3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    if-eqz v2, :cond_560

    if-eqz v0, :cond_560

    const/4 v5, 0x1

    :cond_560
    iput-boolean v5, v3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->びぐびあび:Z

    return-object v7

    :cond_563
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid item position "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "). Item count:"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->〺つふすそ()I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;->〳ぜぞぜべっ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->じぜこほぱ(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    goto :goto_595

    :goto_594
    throw v2

    :goto_595
    goto :goto_594
.end method
